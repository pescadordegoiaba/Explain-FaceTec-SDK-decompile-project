# Relatório técnico — análise estática do `facetec.sdk.zip`

**Arquivo analisado:** `facetec.sdk.zip`  
**Data da análise:** 2026-07-06  
**Tipo de análise:** estática, sem execução de binários, sem instrumentação dinâmica  
**Objetivo principal:** mapear proteções, controles de integridade, licença, rede, sessão, storage, JNI/native, obfuscação e indicadores anti-manipulação.

> **Nota de segurança:** este relatório documenta achados para auditoria/entendimento técnico. Ele não contém passos de bypass, patch, hook, remoção de pinning, desativação de lockout, adulteração de licença ou instruções para contornar proteções.

---

## 1. Resumo direto

O ZIP contém um dump/decompilação Java do pacote `com.facetec.sdk`. A proteção mais relevante não parece estar concentrada em uma única checagem Java simples; ela está distribuída em uma arquitetura com:

1. **camada Java altamente ofuscada**;
2. **ponte JNI/native muito forte**;
3. **validação de licença por assinatura ECDSA SHA-256**;
4. **vinculação de chave ao package name/appId e expiração**;
5. **TLS com certificate pinning**;
6. **monitoramento de lifecycle/context switch durante sessão biométrica**;
7. **lockout local após falhas repetidas**;
8. **persistência local criptografada e derivada de identificadores do app/dispositivo**;
9. **checagens de câmera, arquitetura, orientação e permissões**;
10. **flags internas/de desenvolvimento para customização, incluindo controle de captura de tela**.

O achado mais importante é: **o dump Java não inclui as bibliotecas nativas `.so`; logo, a parte mais sensível da proteção provavelmente está ausente do arquivo enviado**. O Java mostra a ponte e as chamadas, mas não mostra a implementação nativa.

---

## 2. Inventário do ZIP

| Item | Valor |
|---|---:|
| Arquivo ZIP | `facetec.sdk.zip` |
| Tamanho do ZIP | 1,141,367 bytes |
| SHA-256 | `e38a94c1b617080251068e46d741e0753db9f02f57f0d97526588db1e38c300e` |
| MD5 | `ff08f34b2bd89c255c5f0dfdd06925be` |
| Arquivos Java encontrados | 803 |
| Arquivos Java não vazios | 381 |
| Arquivos Java vazios | 422 |
| Tamanho total extraído | 7,109,457 bytes |
| Pacote predominante | `com.facetec.sdk` |
| APK/AAR completo encontrado | Não |
| `AndroidManifest.xml` real | Não encontrado |
| `classes.dex` | Não encontrado |
| `.so` nativo | Não encontrado |
| Versão do SDK observada | `9.7.130` em `FaceTecSDK.version()` |

### Implicação

O material parece ser uma **decompilação/dump Java**, não o SDK binário completo. Isso permite mapear APIs, fluxo Java e proteções aparentes, mas impede confirmação completa de proteções que possam existir em native.

---

## 3. Ranking das proteções encontradas

| Prioridade | Proteção | Arquivos principais | Força estimada | Confiança |
|---:|---|---|---|---|
| 1 | Ponte JNI/native | `JNI.java`, `cv.java`, `eg.java` | Muito alta | Muito alta |
| 2 | Obfuscação pesada | Quase todo o pacote; destaque para `JNI.java`, `cv.java`, `bk.java`, `ay.java`, `ce.java` | Muito alta | Muito alta |
| 3 | Licença com ECDSA SHA-256 | `cd.java` | Muito alta | Muito alta |
| 4 | Vinculação ao package/appId e expiração | `cd.java`, `bk.java` | Alta | Muito alta |
| 5 | TLS + certificate pinning | `mp.java`, `ay.java`, `nf.java`, `pr.java`, `mt.java` | Alta | Alta |
| 6 | Context switch / lifecycle guard | `bi.java`, `bm.java`, `FaceTecSessionStatus.java` | Alta | Alta |
| 7 | Lockout antifraude por falhas recentes | `ce.java`, `h.java` | Alta | Alta |
| 8 | Storage local criptografado | `h.java`, `bq.java`, `ag.java`, `aq.java`, `bp.java` | Alta | Alta |
| 9 | Checagens de dispositivo/câmera/orientação | `bk.java`, enums de status | Média/alta | Alta |
| 10 | Controle de captura de tela via flag dev/custom build | `FaceTecSDK.java`, `ds.java`, `du.java` | Média/alta | Média/alta |
| 11 | Telemetria/eventos internos de sessão | `t.java`, `m.java`, `ah.java`, `c.java` | Média | Alta |

---

## 4. Mapa de arquivos críticos


| Área | Arquivos mapeados |
| --- | --- |
| Ponte JNI / native | Presentes: `JNI.java`, `cv.java`, `eg.java` |
| Inicialização / status / validação de SDK | Presentes: `FaceTecSDK.java`, `bk.java`, `FaceTecSDKStatus.java` |
| Licença / chave | Presentes: `cd.java`, `ce.java` |
| Rede / TLS / pinning | Presentes: `ay.java`, `m.java`, `nf.java`, `mp.java`, `pr.java`, `mt.java`, `mq.java`, `nl.java`, `pg.java`, `ps.java` |
| Sessão / Activity / lifecycle | Presentes: `FaceTecSessionActivity.java`, `bi.java`, `bm.java`, `FaceTecSessionStatus.java`, `FaceTecIDScanStatus.java` |
| Resultados biométricos / ID scan | Presentes: `FaceTecSessionResult.java`, `FaceTecIDScanResult.java`, `FaceTecFaceScanProcessor.java`, `FaceTecIDScanProcessor.java` |
| Storage / crypto local | Presentes: `h.java`, `bq.java`, `ag.java`, `aq.java`, `bp.java`, `aa.java` |
| Customização / flags de desenvolvimento | Presentes: `FaceTecCustomization.java`, `FaceTecFeedbackCustomization.java`, `ds.java`, `du.java` |
| Telemetria/eventos internos | Presentes: `t.java`, `c.java`, `ah.java`, `ao.java`, `ar.java` |

---

## 5. Achado principal: JNI/native como núcleo de proteção

### Evidência

Foram encontrados **81 usos de `native`** distribuídos em apenas três arquivos:

- `cv.java`: 76 métodos native anotados com `@JNI.b(c = ...)`;
- `eg.java`: 3 métodos native ligados a leitura de documento/NFC;
- `JNI.java`: 2 métodos native de registro/ponte.

`JNI.java` define uma anotação runtime:

```java
@Retention(RetentionPolicy.RUNTIME)
public @interface b {
    long c();
}
```

`cv.java` usa essa anotação para mapear métodos Java nativos a IDs numéricos. Isso sugere registro dinâmico ou tabela interna de funções nativas. O padrão é altamente relevante porque desloca a lógica real para fora da camada Java.

### Interpretação

`cv.java` parece ser a ponte principal do SDK para rotinas de:

- processamento biométrico;
- criação de FaceScan;
- serialização/criptografia de payloads;
- estados de processamento;
- métricas/sinais de sessão;
- validações internas;
- possíveis detecções de ambiente;
- geração/retorno de blobs `byte[]` e `byte[][]`.

`eg.java` parece concentrar rotinas nativas de leitura de documento/NFC/e-passport.

### Limitação importante

O ZIP **não contém os `.so`**. Então os métodos native são visíveis como interface, mas não como implementação.

---

## 6. Tabela dos métodos JNI/native em `cv.java`


| # | ID `@JNI.b(c=...)` | Assinatura |
| --- | --- | --- |
| 1 | 122908087 | `void A()` |
| 2 | 895026767 | `void B(Map<String, String> map)` |
| 3 | 411090273 | `void C(boolean z)` |
| 4 | 471620018 | `boolean D()` |
| 5 | 470111729 | `void E(String str)` |
| 6 | 347553218 | `void F(int i2)` |
| 7 | 764687447 | `void G(boolean z)` |
| 8 | 542860974 | `void H(String str, int i2)` |
| 9 | 845177302 | `void I(String str, String str2)` |
| 10 | 602210355 | `void J(String str, double d2)` |
| 11 | 579690330 | `void K(String str, int i2)` |
| 12 | 479693311 | `void L(String str, boolean z)` |
| 13 | 916841651 | `void M(String str, String str2)` |
| 14 | 195978237 | `void N(String str, boolean z)` |
| 15 | 953865493 | `void O(boolean z)` |
| 16 | 695266568 | `void P()` |
| 17 | 218119279 | `void Q(String str)` |
| 18 | 980875271 | `void R(String str)` |
| 19 | 802163113 | `void S(int i2)` |
| 20 | 146230439 | `byte[][] T(boolean z, int i2, int i3)` |
| 21 | 251547157 | `String U(String str, boolean z)` |
| 22 | 854339086 | `boolean V()` |
| 23 | 801550182 | `void W()` |
| 24 | 416258730 | `void X()` |
| 25 | 559139395 | `void Y()` |
| 26 | 331891646 | `void Z(String str, String str2, int i2)` |
| 27 | 123942655 | `boolean a(boolean z)` |
| 28 | 536412578 | `void aA(int i2)` |
| 29 | 828862140 | `int aa()` |
| 30 | 236851259 | `int ab()` |
| 31 | 417661065 | `int ac()` |
| 32 | 476130761 | `int ad()` |
| 33 | 942861196 | `int ae()` |
| 34 | 492857316 | `int af()` |
| 35 | 241053919 | `int ag()` |
| 36 | 233296901 | `int ah()` |
| 37 | 184271543 | `int ai()` |
| 38 | 340304317 | `byte[][] aj()` |
| 39 | 856185933 | `void ak(int i2)` |
| 40 | 276274731 | `void al(int i2)` |
| 41 | 845714052 | `byte[][] am()` |
| 42 | 957213713 | `void an(String str)` |
| 43 | 435246041 | `void ao(String str)` |
| 44 | 507506694 | `void ap(String str, String str2)` |
| 45 | 774884799 | `void aq(String str)` |
| 46 | 392938234 | `void ar(String str, String str2)` |
| 47 | 136507427 | `void as(String str)` |
| 48 | 534730124 | `void at(String str)` |
| 49 | 426837000 | `void au(String str)` |
| 50 | 185267964 | `void av(String str)` |
| 51 | 759765299 | `void aw(String str)` |
| 52 | 946822600 | `boolean b(String str)` |
| 53 | 410261680 | `void c(String str, String str2)` |
| 54 | 280142536 | `void d()` |
| 55 | 465999614 | `void e(boolean z)` |
| 56 | 663820916 | `boolean f(boolean z, String str)` |
| 57 | 759707868 | `void g(boolean z)` |
| 58 | 363975514 | `void h(boolean z)` |
| 59 | 986922517 | `void i(Object obj, long j2, int i2, boolean z)` |
| 60 | 792521938 | `boolean j()` |
| 61 | 936399077 | `void k(Object obj, int i2, boolean z)` |
| 62 | 785930769 | `void l()` |
| 63 | 779218783 | `void m(boolean z)` |
| 64 | 313884573 | `boolean n()` |
| 65 | 444410178 | `void o(boolean z, boolean z2)` |
| 66 | 853861522 | `byte[] p()` |
| 67 | 108889513 | `byte[] q(String str, String str2, boolean z, boolean z2, boolean z3)` |
| 68 | 975342367 | `byte[][] r()` |
| 69 | 250327475 | `byte[][] s()` |
| 70 | 634933143 | `byte[] t(String str, String str2, String str3, boolean z)` |
| 71 | 895617849 | `byte[][] u()` |
| 72 | 779650447 | `void v()` |
| 73 | 336358377 | `void w()` |
| 74 | 532200877 | `byte[][] x()` |
| 75 | 336136627 | `String y(int i2)` |
| 76 | 605746527 | `void z()` |

### Métodos nativos adicionais

#### `JNI.java`

| # | Assinatura |
| --- | --- |
| 1 | `void fnm(Class<cv> cls, Class<eg> cls2)` |
| 2 | `void rnm(long j, String str, String str2)` |

#### `eg.java`

| # | Assinatura |
| --- | --- |
| 1 | `String nativeStartReading(String str, String str2, String str3, String str4, boolean z)` |
| 2 | `String nativeStartReadingWithKey(String str, String str2, boolean z)` |
| 3 | `void nativeUpdateErrorHistory(String str, String str2)` |

---

## 7. Obfuscação pesada

### Indicadores encontrados

A obfuscação é uma das maiores proteções do SDK. Foram encontrados:

- classes com nomes curtos ou semântica removida: `bk`, `cv`, `eg`, `cd`, `ce`, `ay`, `bp`, `ag`, etc.;
- métodos com nomes de uma ou duas letras;
- centenas de chamadas reflexivas;
- strings codificadas/decodificadas em runtime;
- blocos grandes de `ByteBuffer.wrap(...)` e arrays de caracteres/bytes;
- uso de APIs Android aparentemente irrelevantes para gerar constantes, offsets e ruído;
- muitos trechos marcados pelo decompilador como `Method not decompiled` ou `Code decompiled incorrectly`;
- classes sintéticas/vazias como `RunnableC...`, `ViewOnTouchListenerC...`, etc.

### Métricas de obfuscação


| Padrão | Ocorrências | Arquivos | Top arquivos |
| --- | --- | --- | --- |
| native | 81 | 3 | cv.java(76), eg.java(3), JNI.java(2) |
| @JNI.b | 76 | 1 | cv.java(76) |
| Class.forName | 609 | 57 | cv.java(317), bk.java(68), JNI.java(25), cb.java(21), cp.java(17), an.java(14), FaceTecFeedbackCustomization.java(11), oa.java(11) |
| .getMethod( | 486 | 55 | cv.java(250), bk.java(61), JNI.java(19), cb.java(16), FaceTecFeedbackCustomization.java(8), an.java(8), mg.java(8), oa.java(8) |
| .invoke( | 761 | 75 | cv.java(252), bk.java(71), cp.java(34), cb.java(29), JNI.java(19), on.java(17), cx.java(15), oa.java(14) |
| Signature/ECDSA | 5 | 1 | cd.java(5) |
| TLS/SSL | 288 | 20 | mq.java(123), nf.java(17), pg.java(17), pm.java(14), pf.java(13), nl.java(12), pe.java(12), ol.java(11) |
| Certificate pinning | 29 | 6 | mp.java(15), pg.java(4), ps.java(4), mx.java(2), nx.java(2), ol.java(2) |
| Crypto symmetric | 22 | 4 | ag.java(10), aq.java(6), bh.java(3), bp.java(3) |
| Hash/HMAC | 39 | 4 | mq.java(29), bp.java(6), qb.java(3), cd.java(1) |
| Base64 | 21 | 5 | FaceTecSessionResult.java(7), FaceTecIDScanResult.java(5), bi.java(4), m.java(3), cd.java(2) |
| Context switch/lifecycle | 52 | 17 | bi.java(10), FaceTecSessionActivity.java(8), bm.java(8), ah.java(4), bd.java(3), t.java(3), bg.java(2), bu.java(2) |
| Lockout/failures | 9 | 6 | FaceTecIDScanStatus.java(2), FaceTecSessionStatus.java(2), h.java(2), FaceTecSDKStatus.java(1), av.java(1), bi.java(1) |
| Camera/device checks | 39 | 9 | bk.java(23), bh.java(4), bm.java(4), am.java(2), eg.java(2), ay.java(1), bd.java(1), cb.java(1) |
| Root/hook/debug keywords | 0 | 0 | — |

### Leitura técnica

A combinação de `Class.forName`, `getMethod`, `invoke`, decodificação de strings e métodos nativos reduz muito a eficiência de análise por `grep`. Mesmo quando uma proteção não aparece com palavra-chave clara, ela pode estar:

- escondida atrás de string decodificada em runtime;
- chamada por reflection;
- implementada em native;
- ofuscada por fluxo de controle falso;
- removida ou quebrada pelo decompilador.

---

## 8. Proteção de licença/chave

### Arquivo principal

`cd.java`

### Evidência forte

`cd.java` usa:

```java
KeyFactory.getInstance("EC")
Signature.getInstance("SHA256withECDSA")
signature.initVerify(publicKey)
signature.update(...)
signature.verify(...)
```

A chave pública é montada a partir de Base64 e usada para validar uma assinatura ECDSA.

### Dados da licença observados

O código lê propriedades como:

- `expiryDate`;
- `appId`;
- `key`;
- `features`.

Depois monta uma string contendo dados como:

```text
<device/app key material> + appId + expiryDate + features
```

e valida com ECDSA.

### Vinculação ao app/package

O método de validação compara o `appId` da licença com `context.getPackageName()`.

Foram observados dois modos:

- match exato do package name;
- wildcard quando o appId termina com `*`.

### Expiração

A data é parseada como:

```text
yyyy-MM-dd
```

Existe tolerância/grace period diferente conforme o tipo de appId:

- wildcard: menor tolerância;
- package explícito: maior tolerância.

### Feature flag `rlo`

`cd.java` verifica a lista `features`. Quando a feature `rlo` aparece e a assinatura é válida, ela altera o comportamento de lockout em `ce.java`.

### Estados de licença

`cd.java` define:

```text
NOT_PRESENT
INVALID
VALIDATED
```

### Conclusão

A licença não parece ser uma flag simples. Ela é protegida por assinatura assimétrica. Sem a chave privada correspondente, alterar conteúdo da licença deve invalidar a assinatura.

---

## 9. Inicialização e status do SDK

### Arquivos principais

- `FaceTecSDK.java`
- `bk.java`
- `FaceTecSDKStatus.java`

### API pública relevante

`FaceTecSDK.java` expõe:

```text
initializeInDevelopmentMode(...)
initializeInProductionMode(...)
deinitialize()
preload(...)
getStatus(...)
getCameraPermissionStatus(...)
getLockoutEndTime(...)
isLockedOut(...)
setCustomization(...)
setAuditTrailType(...)
setMaxAuditTrailImages(...)
version()
```

A versão hardcoded é:

```text
9.7.130
```

### Status públicos

`FaceTecSDKStatus.java` contém estados que funcionam como mapa de proteções:

```text
NEVER_INITIALIZED
INITIALIZED
NETWORK_ISSUES
INVALID_DEVICE_KEY_IDENTIFIER
VERSION_DEPRECATED
DEVICE_NOT_SUPPORTED
DEVICE_IN_LANDSCAPE_MODE
DEVICE_IN_REVERSE_PORTRAIT_MODE
DEVICE_LOCKED_OUT
KEY_EXPIRED_OR_INVALID
ENCRYPTION_KEY_INVALID
```

### Interpretação

O SDK bloqueia ou falha em cenários como:

- inicialização ausente;
- problema de rede;
- device key inválida;
- versão depreciada;
- dispositivo incompatível;
- orientação inválida;
- lockout;
- chave expirada/inválida;
- encryption key inválida.

---

## 10. Rede, TLS e certificate pinning

### Arquivos principais

- `mp.java`
- `ay.java`
- `nf.java`
- `pr.java`
- `mt.java`
- `m.java`

### Certificate pinning

`mp.java` implementa um pinning semelhante ao `CertificatePinner` do OkHttp.

Evidências:

```text
sha256/
sha1/
Certificate pinning requires X509 certificates
Certificate pinning failure!
Pinned certificates for ...
SSLPeerUnverifiedException
```

Fluxo lógico em `mp.java`:

1. normaliza host/padrão;
2. aceita pins `sha256/` ou `sha1/`;
3. calcula hash da public key do certificado X509;
4. compara com pins configurados;
5. se não bater, lança `SSLPeerUnverifiedException`.

### Hostname verifier

`pr.java` implementa `HostnameVerifier` próprio. Ele valida:

- Subject Alternative Name tipo IP;
- Subject Alternative Name tipo DNS;
- wildcard limitado;
- rejeição de padrões inválidos.

### TLS versions

`mt.java` configura specs TLS com:

```text
TLSv1.3
TLSv1.2
TLSv1.1
TLSv1
```

A spec moderna prioriza TLS 1.3 e TLS 1.2. Há também fallback/compatibilidade em outras specs.

### Endpoint de liveness visível

`m.java` contém chamada para:

```text
https://api.facetec.com/api/v3.1/biometrics/liveness-3d
```

Payload observado:

```json
{
  "faceScan": "...",
  "auditTrailImage": "...",
  "lowQualityAuditTrailImage": "..."
}
```

Headers observados:

```text
Content-Type: application/json
X-Device-Key
User-Agent
X-User-Agent
x-on-device-retry
```

### Conclusão

A camada de rede possui proteção significativa. O pinning dificulta inspeção TLS comum e reduz risco de MITM acidental, embora o relatório não faça testes dinâmicos.

---

## 11. Fluxo biométrico e dados sensíveis

### Arquivos principais

- `FaceTecSessionResult.java`
- `FaceTecIDScanResult.java`
- `m.java`
- `cv.java`

### Dados de sessão facial

`FaceTecSessionResult.java` expõe:

```text
getFaceScan()
getFaceScanBase64()
getAuditTrailCompressedBase64()
getLowQualityAuditTrailCompressedBase64()
getSessionId()
getStatus()
```

### Dados de ID scan

`FaceTecIDScanResult.java` expõe:

```text
getIDScan()
getIDScanBase64()
getFrontImagesCompressedBase64()
getBackImagesCompressedBase64()
getSessionId()
getStatus()
```

### Fluxo provável

```text
Câmera / sessão Android
→ Activity FaceTec
→ processamento Java + native
→ geração de FaceScan / IDScan / audit trail
→ Base64 para payload
→ POST para API FaceTec
→ resposta de validação/liveness
```

### Ponto crítico

Os métodos que produzem os bytes sensíveis parecem depender fortemente de `cv.java` e native.

---

## 12. Proteção contra context switch/lifecycle

### Arquivos principais

- `bi.java`
- `bm.java`
- `FaceTecSessionActivity.java`
- `FaceTecSessionStatus.java`
- `FaceTecIDScanStatus.java`
- `c.java`
- `t.java`

### Eventos monitorados

Foram observadas referências a:

```text
onPause()
onResume()
onWindowFocusChanged(...)
onConfigurationChanged(...)
CONTEXT_SWITCH
FACETEC_SDK_ACTIVITY_CONTEXT_SWITCH_TRIGGERED
CAMERA_EVICTED_CONTEXT_SWITCH
SESSION_CONTEXT_SWITCH
```

### Status de bloqueio/cancelamento

`FaceTecSessionStatus.java` inclui:

```text
CONTEXT_SWITCH
LANDSCAPE_MODE_NOT_ALLOWED
REVERSE_PORTRAIT_NOT_ALLOWED
LOCKED_OUT
SESSION_EXPIRED
CAMERA_PERMISSION_DENIED
CAMERA_INITIALIZATION_ISSUE
```

`FaceTecIDScanStatus.java` também inclui `CONTEXT_SWITCH`, `LOCKED_OUT`, `LANDSCAPE_MODE_NOT_ALLOWED` e `REVERSE_PORTRAIT_NOT_ALLOWED`.

### Interpretação

Essa proteção tenta preservar integridade da sessão biométrica. Mudança de app, perda de foco, interrupção da Activity, mudança de orientação ou câmera ejetada podem encerrar sessão ou registrar erro.

---

## 13. Lockout antifraude por falhas recentes

### Arquivo principal

`ce.java`

### Evidência

`ce.java` mantém:

```java
private static LinkedList<Long> i;
private static long h;
```

A lista guarda timestamps de falhas recentes. A lógica remove entradas antigas e, quando o limite é atingido, define `h` como timestamp de lockout e limpa a lista.

### Comportamento observado

A partir do código decompilado:

| Modo | Janela de falhas | Limite aproximado |
|---|---:|---:|
| Normal | 300.000 ms / 5 min | 14 falhas |
| Com feature `rlo` | 600.000 ms / 10 min | 16 falhas |

O lockout final observado soma aproximadamente:

```text
h + 300.000 ms
```

ou seja, cerca de 5 minutos após o timestamp de bloqueio, conforme a função que calcula o fim.

### Persistência

O estado é salvo em arquivo/cache usando nome derivado de app/dispositivo e conteúdo protegido por criptografia.

### Conclusão

Existe proteção local contra repetição excessiva de falhas. Ela é relevante para antifraude, rate-limit local e prevenção de brute force de sessão.

---

## 14. Storage local criptografado

### Arquivos principais

- `h.java`
- `bq.java`
- `ag.java`
- `aq.java`
- `bp.java`

### Estados persistidos

`h.java` define chaves internas compactas:

```text
ID → id
APP_SEND_DIAGNOSTICS → sd
DIAGNOSTICS_SIZE → ds
CACHE_KEY → ck
IS_VERSION_DEPRECATED → vd
RECENT_FAILURES → rf
APPLICATION_ID → ai
IS_LATEST_VERSION → lv
```

### Criptografia local

`ag.java` usa:

```text
Cipher
SecretKeySpec
IvParameterSpec
```

`aq.java` usa:

```text
SecureRandom
KeyGenerator
```

`bp.java` usa:

```text
MessageDigest.getInstance("SHA-256")
Mac.getInstance("HmacSHA256")
SecretKeySpec(..., "HmacSHA256")
```

`bq.java` faz leitura/escrita de arquivos e chama `new ag(key).c(...)` para criptografar e `new ag(key).b(...)` para descriptografar.

### Interpretação

O SDK evita gravar estados relevantes em texto puro. O nome do arquivo e/ou a chave são derivados de package/device/cache material, e o payload usa criptografia simétrica com IV prefixado.

### Dados provavelmente protegidos

- lockout/falhas recentes;
- cache key;
- application id;
- flags de versão depreciada;
- preferências/diagnósticos;
- identificadores internos.

---

## 15. Checagens de dispositivo, arquitetura, câmera e permissão

### Arquivo principal

`bk.java`

### Arquitetura

Foi observada checagem:

```java
Build.CPU_ABI.toLowerCase().startsWith("arm")
```

Interpretação: o SDK provavelmente exige ABI ARM para funcionamento completo, ou marca dispositivos não-ARM como incompatíveis.

### Câmera frontal

Foi observada checagem:

```java
context.getPackageManager().hasSystemFeature("android.hardware.camera.front")
```

Há exceção explícita para modelo específico:

```text
Lenovo YT3-850F
```

### Permissão de câmera

`bk.java` verifica:

```text
android.permission.CAMERA
```

Status público correspondente:

```text
CameraPermissionStatus.GRANTED
CameraPermissionStatus.NOT_YET_REQUESTED
CameraPermissionStatus.DENIED
```

### Orientação e modo de tela

Enums indicam bloqueios para:

```text
DEVICE_IN_LANDSCAPE_MODE
DEVICE_IN_REVERSE_PORTRAIT_MODE
DEVICE_IN_MULTI_WINDOW_MODE
LANDSCAPE_MODE_NOT_ALLOWED
REVERSE_PORTRAIT_NOT_ALLOWED
```

### ChromeOS/ARC

`bk.java` verifica features:

```text
org.chromium.arc
org.chromium.arc.device_management
```

Interpretação: existe lógica específica para ambiente Android em ChromeOS/ARC.

---

## 16. ID scan, NFC e documento

### Arquivo principal

`eg.java`

### Evidência

`eg.java` usa `IsoDep` e `transceive(...)`, indicando comunicação APDU com NFC.

Métodos nativos:

```text
nativeStartReading(...)
nativeStartReadingWithKey(...)
nativeUpdateErrorHistory(...)
```

Também há método Java:

```text
sendCommand(byte[])
```

que conecta no `IsoDep` e envia comando com `transceive`.

### Interpretação

A leitura de documento/NFC é parcialmente Java para I/O e parcialmente native para protocolo, tratamento de erro, parsing e proteção.

---

## 17. Customização e flags internas/de desenvolvimento

### Arquivos principais

- `FaceTecSDK.java`
- `ds.java`
- `du.java`
- `FaceTecCustomization.java`

### Flags observadas

`du.java` enumera flags como:

```text
YOUR_ZOOM_IMAGE_OVERRIDE
CLICKABLE_READY_SCREEN_SUBTEXT
DEV_MODE_TAG
UNCONSTRAINED_GUIDANCE_STRING_LENGTHS
STANDALONE_IDSCAN_WATERMARK_CUSTOMIZATION
ENABLE_SCREEN_CAPTURING
```

`FaceTecSDK.setCustomization(...)` percorre um array JSON interno de override keys/values e ativa campos internos da customização quando há match.

### Controle de screen capture

Existe flag interna para `ENABLE_SCREEN_CAPTURING`. `ds.java` emite aviso de que é uma feature de desenvolvimento/custom build e não suportada para release na Google Play.

> Os valores exatos de override foram propositalmente omitidos neste relatório para não facilitar contorno de controles do SDK.

### Interpretação

O SDK possui um sistema de flags internas de customização que pode ativar comportamentos especiais. Uma delas está relacionada a captura de tela. Isso não prova sozinho o uso de `FLAG_SECURE`, mas é forte indício de controle de screenshot/screen recording em builds normais.

---

## 18. Telemetria, diagnósticos e eventos

### Arquivos principais

- `t.java`
- `c.java`
- `m.java`
- `ay.java`
- `ah.java`

### Eventos observados

Foram encontrados eventos como:

```text
INIT_FINISH
INIT_FAIL_VERSION_DEPRECATED
INIT_FAIL_DEVICE_KEY_REJECTED
INIT_FAIL_NETWORK_ERROR
FACETEC_SDK_ACTIVITY_CONTEXT_SWITCH_TRIGGERED
CAMERA_EVICTED_CONTEXT_SWITCH
RESULT_SCREEN_SHOWN
SESSION_CONTEXT_SWITCH
WAYPOINT_UPLOAD
```

### Dados de diagnóstico

`ay.java` coleta/usa informações como:

```text
Build.VERSION.RELEASE
Build.BRAND
Build.BOOTLOADER
Build.MODEL
Build.SUPPORTED_ABIS
FaceTecSDK.version()
Locale
UUID.randomUUID()
```

### Interpretação

O SDK envia ou prepara diagnósticos/telemetria de ambiente, versão e sessão. Isso pode ser usado para suporte, antifraude, análise de falhas e decisões de compatibilidade.

---

## 19. O que foi procurado e não apareceu claramente no Java

Foram buscados indicadores textuais diretos de root/hook/debug/emulador:


| Termo buscado | Ocorrências literais |
| --- | --- |
| magisk | 0 |
| frida | 0 |
| xposed | 0 |
| substrate | 0 |
| zygisk | 0 |
| isDebuggerConnected | 0 |
| TracerPid | 0 |
| ptrace | 0 |
| test-keys | 0 |
| qemu | 0 |
| goldfish | 0 |
| ranchu | 0 |

### Conclusão cuidadosa

No Java enviado, **não apareceu uma detecção explícita e clara** de:

```text
Magisk
Frida
Xposed
Zygisk
Substrate
TracerPid
ptrace
Debug.isDebuggerConnected
test-keys
qemu/goldfish/ranchu
```

Mas isso **não prova ausência**. Pelo contrário: como a arquitetura usa JNI/native pesado, reflection e strings ofuscadas, esse tipo de proteção pode estar:

- na biblioteca `.so`, que não veio no ZIP;
- em strings decodificadas em runtime;
- atrás de reflection;
- embutido nos métodos native de `cv.java`;
- ativado apenas em builds de produção.

---

## 20. Fluxo provável de inicialização

Com base nos arquivos Java, o fluxo provável é:

```text
App chama FaceTecSDK.initializeInDevelopmentMode ou initializeInProductionMode
→ FaceTecSDK delega para bk.java
→ bk.java valida ambiente, câmera, arquitetura, status, rede e licença
→ cd.java valida licença local/prod com ECDSA quando aplicável
→ ay.java/nf.java configuram cliente de rede e pinning
→ JNI.java registra métodos native de cv.java/eg.java
→ cv.java/native inicializa core biométrico
→ callback InitializeCallback recebe sucesso/falha
```

---

## 21. Fluxo provável de sessão

```text
App chama FaceTecSessionActivity.createAndLaunchSession(...)
→ Activity recebe session token em extra facetec.serverSessionToken
→ bi.java/bm.java controlam lifecycle, câmera, orientação e foco
→ cv.java/native processa frames e estados da sessão
→ FaceTecSessionResult guarda FaceScan + audit trails
→ m.java envia FaceScan para endpoint de liveness quando aplicável
→ status final volta via Activity result
```

Extras observados:

```text
facetec.serverSessionToken
facetec.idScanOnlyMode
facetecsdk.signup.sessionResult
facetecsdk.signup.idScanResult
```

Request code público:

```text
1002
```

---

## 22. Arquivos maiores e mais relevantes


| Arquivo | Bytes | Status |
| --- | --- | --- |
| JNI.java | 1,946,843 | não vazio |
| cv.java | 388,522 | não vazio |
| jvQ19650.java | 275,218 | não vazio |
| ea.java | 231,782 | não vazio |
| bi.java | 209,227 | não vazio |
| bk.java | 164,491 | não vazio |
| R.java | 161,392 | não vazio |
| gn.java | 156,940 | não vazio |
| cp.java | 153,260 | não vazio |
| fn.java | 151,733 | não vazio |
| dm.java | 130,290 | não vazio |
| t.java | 125,553 | não vazio |
| an.java | 124,217 | não vazio |
| cb.java | 118,945 | não vazio |
| bd.java | 93,117 | não vazio |
| cx.java | 83,576 | não vazio |
| bv.java | 78,178 | não vazio |
| ni.java | 71,442 | não vazio |
| gk.java | 68,411 | não vazio |
| am.java | 65,142 | não vazio |
| on.java | 64,711 | não vazio |
| ay.java | 62,250 | não vazio |
| oa.java | 51,240 | não vazio |
| ap.java | 48,152 | não vazio |
| gs.java | 46,410 | não vazio |
| at.java | 44,422 | não vazio |
| FaceTecFeedbackCustomization.java | 44,076 | não vazio |
| ov.java | 41,831 | não vazio |
| op.java | 41,116 | não vazio |
| px.java | 40,874 | não vazio |
| ou.java | 39,257 | não vazio |
| fs.java | 38,703 | não vazio |
| ow.java | 36,001 | não vazio |
| ch.java | 34,472 | não vazio |
| dt.java | 32,198 | não vazio |
| nc.java | 30,713 | não vazio |
| nu.java | 29,269 | não vazio |
| gy.java | 27,311 | não vazio |
| pa.java | 25,995 | não vazio |
| eg.java | 25,841 | não vazio |

---

## 23. Matriz de confiança dos achados

| Achado | Confiança | Motivo |
|---|---|---|
| SDK versão 9.7.130 | Muito alta | String direta em `FaceTecSDK.version()` |
| ZIP contém dump Java, não SDK completo | Muito alta | Só `.java`; sem `.so`, APK, AAR, manifest real ou dex |
| JNI/native é núcleo crítico | Muito alta | 76 métodos native em `cv.java`, 3 em `eg.java`, registro em `JNI.java` |
| Licença ECDSA SHA-256 | Muito alta | Uso direto de `Signature.getInstance("SHA256withECDSA")` |
| Package/appId binding | Muito alta | Comparação com `context.getPackageName()` em `cd.java` |
| Expiração de licença | Muito alta | `expiryDate` + `SimpleDateFormat("yyyy-MM-dd")` |
| Certificate pinning | Alta | `mp.java` implementa pins `sha256/`/`sha1/` e lança `SSLPeerUnverifiedException` |
| Context switch protection | Alta | Status, eventos e lifecycle handlers visíveis |
| Lockout por falhas | Alta | Timestamps em `LinkedList<Long>`, limites e janela de tempo claros em `ce.java` |
| Storage criptografado | Alta | `Cipher`, IV, `SecretKeySpec`, `KeyGenerator`, `SHA-256`, `HMAC` |
| Anti-root/Magisk/Frida/Xposed no Java | Baixa/ausente | Termos não aparecem de forma clara no Java enviado |
| Anti-root/Magisk/Frida/Xposed no native | Indeterminado | `.so` ausente; arquitetura permite esconder isso em native |
| Controle real de screenshot via `FLAG_SECURE` | Indeterminado | Há flag dev de screen capture, mas não apareceu `FLAG_SECURE` literal no Java |

---

## 24. Pontos mais importantes para quem quer localizar proteções

### Prioridade 1 — conseguir a parte nativa

Para confirmar proteções escondidas, o item mais importante seria obter os `.so` correspondentes ao SDK/APP:

```text
lib/*.so
arm64-v8a/*.so
armeabi-v7a/*.so
```

Sem eles, a análise fica limitada ao contrato Java.

### Prioridade 2 — revisar estes arquivos em ordem

```text
1. JNI.java
2. cv.java
3. eg.java
4. cd.java
5. bk.java
6. ay.java
7. mp.java
8. nf.java
9. pr.java
10. ce.java
11. bi.java
12. bm.java
13. h.java
14. bq.java
15. ag.java
16. aq.java
17. bp.java
18. m.java
```

### Prioridade 3 — separar proteções por camada

```text
Camada pública: FaceTecSDK.java, FaceTecSessionActivity.java
Camada de inicialização/status: bk.java, FaceTecSDKStatus.java
Camada de licença: cd.java
Camada native: JNI.java, cv.java, eg.java
Camada de rede: ay.java, nf.java, mp.java, pr.java, mt.java
Camada de sessão/lifecycle: bi.java, bm.java
Camada de lockout: ce.java
Camada de storage/crypto: h.java, bq.java, ag.java, aq.java, bp.java
```

---

## 25. Observações sobre qualidade da decompilação

Muitos métodos aparecem com avisos do JADX:

```text
Method not decompiled
Code decompiled incorrectly
Method dump skipped
Unsupported multi-entry loop pattern
```

Isso indica uma combinação de:

- bytecode difícil para o decompilador;
- obfuscação de fluxo;
- reflection;
- strings criptografadas/ofuscadas;
- classes sintéticas;
- possíveis transforms/protectors.

Logo, algumas conclusões são feitas por evidência estrutural, não por leitura perfeita de cada método.

---

## 26. Conclusão geral

O `facetec.sdk.zip` mostra um SDK com proteção madura e em camadas. A camada Java deixa claros vários controles: licença assinada, pinning TLS, lockout, storage criptografado, checagem de câmera/dispositivo, lifecycle guard e flags internas de desenvolvimento.

A parte mais sensível, porém, está apontada para native/JNI. `cv.java` é o arquivo mais importante do dump, porque concentra 76 métodos nativos anotados. `JNI.java` fornece a infraestrutura de registro e `eg.java` cobre leitura nativa de documento/NFC. Como os `.so` não estão no ZIP, qualquer afirmação sobre anti-root, anti-Frida, anti-Xposed, anti-debug ou integridade nativa deve ser tratada como **não confirmada**.

Em termos de proteção, a ordem de importância é:

```text
JNI/native > obfuscação > licença ECDSA > TLS pinning > lifecycle/context switch > lockout > storage criptografado > checks de device/câmera/orientação
```

O arquivo analisado é suficiente para mapear a arquitetura de segurança do SDK, mas não para confirmar todas as defesas internas que podem estar escondidas no binário nativo.
