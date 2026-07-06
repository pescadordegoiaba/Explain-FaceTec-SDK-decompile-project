package com.facetec.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebSettings;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.facetec.sdk.gn;
import com.facetec.sdk.h;
import com.facetec.sdk.j;
import com.facetec.sdk.mp;
import com.facetec.sdk.mw;
import com.facetec.sdk.nf;
import com.facetec.sdk.ov;
import com.incode.welcome_sdk.modules.SelfieScan;
import com.plaid.internal.EnumC41897g;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jmrtd.PassportService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class ay {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    static String a;
    private static ay b;
    static int c;
    private static String d;
    private static String e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f95826g;
    private static String h;
    private static final String[] j;
    private static int k;
    private static char[] l;
    private static int m;
    private static boolean n;
    private static boolean o;
    private static int p;
    private static int r;
    private static int t;

    @NonNull
    private final nf f = d();
    private TelephonyManager i;

    @FunctionalInterface
    public interface a {
        void onCompletion(e eVar, String str);
    }

    public static abstract class b {
        public void c() {
        }

        public void e(boolean z) {
        }
    }

    public static class e {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final int $$f = 0;
        private static int $10;
        private static int $11;
        private static int a;
        private static int d;
        private static long e;
        private static char f;
        boolean b;
        boolean c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(byte r6, short r7, int r8) {
            /*
                int r8 = r8 * 2
                int r8 = r8 + 4
                int r6 = r6 + 97
                int r7 = r7 * 4
                int r7 = r7 + 1
                byte[] r0 = com.facetec.sdk.ay.e.$$c
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r0
                r4 = r2
                r0 = r8
                goto L2e
            L15:
                r3 = r8
                r8 = r6
                r6 = r3
                r3 = r2
            L19:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L26:
                r4 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r0
                r0 = r5
            L2e:
                int r6 = -r6
                int r8 = r8 + 1
                int r6 = r6 + r0
                r0 = r8
                r8 = r6
                r6 = r0
                r0 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ay.e.$$g(byte, short, int):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            init$0();
            d = 1605274620;
            e = 1396024866991524551L;
            a = -288744122;
            f = (char) 19143;
        }

        public e(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:95:0x0a55, code lost:
        
            r12.close();
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0af7 A[Catch: all -> 0x0ae6, Exception -> 0x0de0, TryCatch #0 {, blocks: (B:44:0x0562, B:46:0x05d5, B:47:0x05e6, B:49:0x063e, B:56:0x06ac, B:64:0x0700, B:73:0x078d, B:100:0x0ae2, B:104:0x0ae9, B:106:0x0af7, B:107:0x0b32, B:109:0x0b48, B:110:0x0b7e, B:112:0x0b90, B:114:0x0c0a, B:116:0x0c7e, B:118:0x0ca4, B:120:0x0ce3, B:122:0x0d58, B:124:0x0d60, B:139:0x0da3, B:140:0x0da6, B:168:0x0de0, B:169:0x0e1c, B:142:0x0da8, B:144:0x0dae, B:145:0x0daf, B:154:0x0dbe, B:156:0x0dc4, B:157:0x0dc5, B:159:0x0dcd, B:161:0x0dd3, B:162:0x0dd4, B:163:0x0dd5, B:165:0x0ddb, B:166:0x0ddc), top: B:263:0x0562 }] */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0b48 A[Catch: all -> 0x0ae6, Exception -> 0x0de0, TryCatch #0 {, blocks: (B:44:0x0562, B:46:0x05d5, B:47:0x05e6, B:49:0x063e, B:56:0x06ac, B:64:0x0700, B:73:0x078d, B:100:0x0ae2, B:104:0x0ae9, B:106:0x0af7, B:107:0x0b32, B:109:0x0b48, B:110:0x0b7e, B:112:0x0b90, B:114:0x0c0a, B:116:0x0c7e, B:118:0x0ca4, B:120:0x0ce3, B:122:0x0d58, B:124:0x0d60, B:139:0x0da3, B:140:0x0da6, B:168:0x0de0, B:169:0x0e1c, B:142:0x0da8, B:144:0x0dae, B:145:0x0daf, B:154:0x0dbe, B:156:0x0dc4, B:157:0x0dc5, B:159:0x0dcd, B:161:0x0dd3, B:162:0x0dd4, B:163:0x0dd5, B:165:0x0ddb, B:166:0x0ddc), top: B:263:0x0562 }] */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0c0a A[Catch: all -> 0x0ae6, IOException -> 0x0e2b, TryCatch #0 {, blocks: (B:44:0x0562, B:46:0x05d5, B:47:0x05e6, B:49:0x063e, B:56:0x06ac, B:64:0x0700, B:73:0x078d, B:100:0x0ae2, B:104:0x0ae9, B:106:0x0af7, B:107:0x0b32, B:109:0x0b48, B:110:0x0b7e, B:112:0x0b90, B:114:0x0c0a, B:116:0x0c7e, B:118:0x0ca4, B:120:0x0ce3, B:122:0x0d58, B:124:0x0d60, B:139:0x0da3, B:140:0x0da6, B:168:0x0de0, B:169:0x0e1c, B:142:0x0da8, B:144:0x0dae, B:145:0x0daf, B:154:0x0dbe, B:156:0x0dc4, B:157:0x0dc5, B:159:0x0dcd, B:161:0x0dd3, B:162:0x0dd4, B:163:0x0dd5, B:165:0x0ddb, B:166:0x0ddc), top: B:263:0x0562 }] */
        /* JADX WARN: Removed duplicated region for block: B:156:0x0dc4 A[Catch: all -> 0x0ae6, Exception -> 0x0de0, TryCatch #0 {, blocks: (B:44:0x0562, B:46:0x05d5, B:47:0x05e6, B:49:0x063e, B:56:0x06ac, B:64:0x0700, B:73:0x078d, B:100:0x0ae2, B:104:0x0ae9, B:106:0x0af7, B:107:0x0b32, B:109:0x0b48, B:110:0x0b7e, B:112:0x0b90, B:114:0x0c0a, B:116:0x0c7e, B:118:0x0ca4, B:120:0x0ce3, B:122:0x0d58, B:124:0x0d60, B:139:0x0da3, B:140:0x0da6, B:168:0x0de0, B:169:0x0e1c, B:142:0x0da8, B:144:0x0dae, B:145:0x0daf, B:154:0x0dbe, B:156:0x0dc4, B:157:0x0dc5, B:159:0x0dcd, B:161:0x0dd3, B:162:0x0dd4, B:163:0x0dd5, B:165:0x0ddb, B:166:0x0ddc), top: B:263:0x0562 }] */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0dc5 A[Catch: all -> 0x0ae6, Exception -> 0x0de0, TryCatch #0 {, blocks: (B:44:0x0562, B:46:0x05d5, B:47:0x05e6, B:49:0x063e, B:56:0x06ac, B:64:0x0700, B:73:0x078d, B:100:0x0ae2, B:104:0x0ae9, B:106:0x0af7, B:107:0x0b32, B:109:0x0b48, B:110:0x0b7e, B:112:0x0b90, B:114:0x0c0a, B:116:0x0c7e, B:118:0x0ca4, B:120:0x0ce3, B:122:0x0d58, B:124:0x0d60, B:139:0x0da3, B:140:0x0da6, B:168:0x0de0, B:169:0x0e1c, B:142:0x0da8, B:144:0x0dae, B:145:0x0daf, B:154:0x0dbe, B:156:0x0dc4, B:157:0x0dc5, B:159:0x0dcd, B:161:0x0dd3, B:162:0x0dd4, B:163:0x0dd5, B:165:0x0ddb, B:166:0x0ddc), top: B:263:0x0562 }] */
        /* JADX WARN: Removed duplicated region for block: B:209:0x1388 A[PHI: r4
          0x1388: PHI (r4v32 java.lang.String[]) = (r4v31 java.lang.String[]), (r4v31 java.lang.String[]), (r4v39 java.lang.String[]) binds: [B:185:0x0f80, B:187:0x102c, B:325:0x1388] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x02d4  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0415 A[PHI: r5 r6
          0x0415: PHI (r5v69 int) = (r5v68 int), (r5v186 int) binds: [B:23:0x02d2, B:312:0x0415] A[DONT_GENERATE, DONT_INLINE]
          0x0415: PHI (r6v54 int) = (r6v53 int), (r6v114 int) binds: [B:23:0x02d2, B:312:0x0415] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x04b5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] d(android.content.Context r47, int r48, int r49, int r50) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 7008
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ay.e.d(android.content.Context, int, int, int):java.lang.Object[]");
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x016b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void g(int r24, int r25, int r26, boolean r27, java.lang.String r28, java.lang.Object[] r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 375
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ay.e.g(int, int, int, boolean, java.lang.String, java.lang.Object[]):void");
        }

        private static void h(char c, String str, int i, String str2, String str3, Object[] objArr) throws Throwable {
            int i2;
            int i3;
            String str4;
            char c2;
            String str5 = "";
            $10 = ($11 + EnumC41897g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE) % 128;
            char[] charArray = str3 != null ? str3.toCharArray() : str3;
            char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
            char[] charArray3 = str != null ? str.toCharArray() : str;
            hi hiVar = new hi();
            int length = charArray3.length;
            char[] cArr = new char[length];
            int length2 = charArray2.length;
            char[] cArr2 = new char[length2];
            int i4 = 0;
            System.arraycopy(charArray3, 0, cArr, 0, length);
            System.arraycopy(charArray2, 0, cArr2, 0, length2);
            cArr[0] = (char) (cArr[0] ^ c);
            int i5 = 2;
            cArr2[2] = (char) (cArr2[2] + ((char) i));
            int length3 = charArray.length;
            char[] cArr3 = new char[length3];
            hiVar.d = 0;
            $11 = ($10 + 73) % 128;
            while (hiVar.d < length3) {
                $11 = ($10 + 83) % 128;
                try {
                    Object[] objArr2 = {hiVar};
                    Object objD = an.d(1217746441);
                    if (objD == null) {
                        objD = an.d((TypedValue.complexToFraction(i4, SelfieScan.RECOGNITION_FAIL_RESULT, SelfieScan.RECOGNITION_FAIL_RESULT) > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (TypedValue.complexToFraction(i4, SelfieScan.RECOGNITION_FAIL_RESULT, SelfieScan.RECOGNITION_FAIL_RESULT) == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)) + EnumC41897g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, (char) (63339 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L) + 24, 1056212306, false, "b", new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objD).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {hiVar};
                    Object objD2 = an.d(1379992360);
                    if (objD2 == null) {
                        byte b = (byte) i4;
                        i2 = i5;
                        byte b2 = b;
                        i3 = i4;
                        objD2 = an.d(688 - ExpandableListView.getPackedPositionGroup(0L), (char) (33155 - AndroidCharacter.getMirror('0')), Color.rgb(i4, i4, i4) + 16777239, 606130291, false, $$g(b, b2, b2), new Class[]{Object.class});
                    } else {
                        i2 = i5;
                        i3 = i4;
                    }
                    int iIntValue2 = ((Integer) ((Method) objD2).invoke(null, objArr3)).intValue();
                    int i6 = cArr[hiVar.d % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[i2] = Integer.valueOf(cArr2[iIntValue]);
                    objArr4[1] = Integer.valueOf(i6);
                    objArr4[i3] = hiVar;
                    Object objD3 = an.d(-1522168148);
                    Class cls = Integer.TYPE;
                    if (objD3 == null) {
                        int iAlpha = Color.alpha(i3) + 1304;
                        char size = (char) View.MeasureSpec.getSize(i3);
                        c2 = 1;
                        int i7 = i3;
                        int iIndexOf = TextUtils.indexOf(str5, str5, i7) + 24;
                        str4 = str5;
                        byte b3 = (byte) i7;
                        objD3 = an.d(iAlpha, size, iIndexOf, -752591369, false, $$g((byte) 7, b3, b3), new Class[]{Object.class, cls, cls});
                    } else {
                        str4 = str5;
                        c2 = 1;
                    }
                    ((Method) objD3).invoke(null, objArr4);
                    int i8 = cArr[iIntValue2] * 32718;
                    int i9 = i2;
                    Object[] objArr5 = new Object[i9];
                    objArr5[c2] = Integer.valueOf(cArr2[iIntValue]);
                    objArr5[0] = Integer.valueOf(i8);
                    Object objD4 = an.d(-1578548222);
                    if (objD4 == null) {
                        objD4 = an.d((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1970, (char) KeyEvent.getDeadChar(0, 0), Color.argb(0, 0, 0, 0) + 24, -678914215, false, "i", new Class[]{cls, cls});
                    }
                    cArr2[iIntValue2] = ((Character) ((Method) objD4).invoke(null, objArr5)).charValue();
                    cArr[iIntValue2] = hiVar.e;
                    int i10 = hiVar.d;
                    cArr3[i10] = (char) (((((long) (r0 ^ charArray[i10])) ^ (e ^ 1396024866991524551L)) ^ ((long) ((int) (((long) a) ^ 1396024866991524551L)))) ^ ((long) ((char) (((long) f) ^ 1396024866991524551L))));
                    hiVar.d = i10 + 1;
                    i5 = i9;
                    str5 = str4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr3);
        }

        private static void i(byte b, short s, int i, Object[] objArr) {
            int i2 = 66 - b;
            byte[] bArr = $$a;
            int i3 = 115 - (s * 3);
            byte[] bArr2 = new byte[i + 4];
            int i4 = i + 3;
            int i5 = -1;
            if (bArr == null) {
                i2++;
                i3 = (i4 + (-i2)) - 2;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i3;
                if (i5 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    int i6 = bArr[i2];
                    i2++;
                    i3 = (i3 + (-i6)) - 2;
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{7, 75, -84, -52, -15, 8, -16, 1, 4, 3, ISO7816.INS_DECREASE_STAMPED, -55, -14, -1, -8, PassportService.SFI_DG13, -11, -8, ISO7816.INS_REHABILITATE_CHV, PSSSigner.TRAILER_IMPLICIT, 1, 61, -21, -49, -2, 2, 1, 4, 0, -21, 9, -8, -1, 35, -39, 6, -11, 1, -21, 17, 27, -39, -11, 7, -23, 19, 49, ISO7816.INS_GET_RESPONSE, 9, -15, 5, 55, ISO7816.INS_LOAD_KEY_FILE, -22, -12, PassportService.SFI_DG11, 2, -5, -3, 17, -19, -4, 5, 5, -2, -13, -7, 4, -7};
            $$b = 30;
        }

        public static void init$1() {
            $$d = new byte[]{51, -113, 92, 4};
            $$e = EnumC41897g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE;
        }

        public static void init$2() {
            $$c = new byte[]{90, 10, -103, 87};
            $$f = EnumC41897g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void j(int r7, short r8, short r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = com.facetec.sdk.ay.e.$$d
                int r9 = r9 * 3
                int r9 = r9 + 1
                int r7 = 100 - r7
                int r8 = r8 * 4
                int r8 = 3 - r8
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L16
                r7 = r9
                r3 = r0
                r5 = r2
                r0 = r8
                goto L2e
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r9) goto L26
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L26:
                int r8 = r8 + 1
                r3 = r0[r8]
                r6 = r0
                r0 = r8
                r8 = r3
                r3 = r6
            L2e:
                int r7 = r7 + r8
                r8 = r0
                r0 = r3
                r3 = r5
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ay.e.j(int, short, short, java.lang.Object[]):void");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r6, int r7, int r8) {
        /*
            int r7 = r7 + 73
            int r8 = r8 * 4
            int r0 = r8 + 1
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r1 = com.facetec.sdk.ay.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r4 = r8
            r3 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r6 = r6 + r4
            int r7 = r7 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ay.$$c(byte, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        r = 0;
        t = 1;
        m = 0;
        p = 1;
        b();
        SystemClock.elapsedRealtime();
        Color.red(0);
        ExpandableListView.getPackedPositionChild(0L);
        Color.green(0);
        ViewConfiguration.getMaximumFlingVelocity();
        c = 0;
        Object[] objArr = new Object[1];
        q("涒蘐龪댾淺征Ɑ㺖ਥ잤萇䛰ꈫ⾩ᰈ\ueea5娪韒瑬皻\uf225ￆ챫麪樺枾⑰⚛Ƚ쾠밊亞멁㞤ᐟ횜剃龦氵纙쨉ގ쐹蛔扳澍尩⻖", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        s(null, 127 - View.resolveSize(0, 0), null, "º\u009e±\u0083\u0082¹¨\u0094¸\u0097µ¡\u0091·¨§\u0082\u0094¶\u008a¯\u008e\u0099\u008f\u0093µ\u0092´³¡²§±\u009b¬\u009d°\u00ad¯\u0091®\u00ad¬«", objArr2);
        j = new String[]{strIntern, ((String) objArr2[0]).intern()};
        r = (t + 5) % 128;
    }

    private ay(Context context) throws Throwable {
        Object[] objArr = new Object[1];
        q("\udd5d\uf64aᝍ\ufdd2\udd2d\u2fddꓜ灁뫄", 1 - TextUtils.getOffsetAfter("", 0), objArr);
        this.i = (TelephonyManager) context.getSystemService(((String) objArr[0]).intern());
        if (h == null) {
            h = bk.b(context, true);
        }
        if (e == null) {
            e = context.getPackageName();
        }
        if (d == null) {
            d = bh.a(context);
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        boolean z;
        boolean z2;
        e eVar;
        boolean zBooleanValue;
        h.b bVarB;
        boolean z3 = false;
        Context context = (Context) objArr[0];
        String str = (String) objArr[1];
        a aVar = (a) objArr[2];
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object[] objArr2 = new Object[1];
            q("浊뻴㻜\uf2a5洧杮赖缹", 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
            JSONObject jSONObject2 = jSONObject.getJSONObject(((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            s(null, Color.rgb(0, 0, 0) + 16777343, null, "\u008f\u0082", objArr3);
            if (jSONObject2.getBoolean(((String) objArr3[0]).intern())) {
                p = (m + 91) % 128;
                try {
                    if (((Boolean) bk.d(-261957882, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[0], 261957889)).booleanValue()) {
                        Object[] objArr4 = new Object[1];
                        q("떡\uee6f嫃㥴뗌㟿\ue959듬", 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr4);
                        String string = jSONObject2.getString(((String) objArr4[0]).intern());
                        q("쯌缋ຼ㋘쮨ꚑ봴", 1 - KeyEvent.normalizeMetaState(0), new Object[1]);
                        if (!(!string.equals(((String) r10[0]).intern()))) {
                            bk.f();
                        } else {
                            bk.g();
                        }
                    }
                    Object[] objArr5 = new Object[1];
                    s(null, 127 - View.combineMeasuredStates(0, 0), null, "\u0084\u0086\u0084\u008e", objArr5);
                    bVarB = h.b.b(jSONObject.getJSONObject(((String) objArr5[0]).intern()));
                    h.c(context, bVarB);
                    bk.e = bVarB.a;
                    a = bVarB.d;
                    zBooleanValue = bVarB.c.booleanValue();
                } catch (Throwable th) {
                    th = th;
                    z2 = false;
                }
                try {
                    bk.c = bVarB.f.intValue();
                    int iIntValue = bVarB.i.intValue();
                    if (iIntValue > 0) {
                        ce.d(context, iIntValue);
                        m = (p + 1) % 128;
                    }
                    z3 = true;
                } catch (Throwable th2) {
                    th = th2;
                    z2 = zBooleanValue;
                    z = true;
                    try {
                        Object[] objArr6 = new Object[1];
                        s(null, 127 - View.combineMeasuredStates(0, 0), null, "\u0095\u0098\u008b\u008d\u0090\u0082\u0097\u008d\u008b\u0091\u0095\u0090\u008b\u008f\u0082\u0086\u0095\u0097\u0097\u0084\u0095\u008b\u0086\u0084\u008e\u0092\u0094\u0084\u0096\u0095\u0086\u0082\u0090\u0095\u008e\u0094\u0085\u0082\u0093", objArr6);
                        ((String) objArr6[0]).intern();
                        bh.e(th.getMessage());
                        z3 = z;
                        zBooleanValue = z2;
                    } catch (Throwable th3) {
                        try {
                            th3.printStackTrace();
                            eVar = new e(z, z2);
                        } catch (Throwable th4) {
                            b(aVar, new e(z, z2), "");
                            throw th4;
                        }
                    }
                }
            } else {
                zBooleanValue = false;
            }
        } catch (Throwable th5) {
            th = th5;
            z = false;
            z2 = false;
        }
        eVar = new e(z3, zBooleanValue);
        b(aVar, eVar, "");
        int iE = ov.b.AnonymousClass1.e();
        t.e(ov.b.AnonymousClass1.e(), new Object[]{context}, ov.b.AnonymousClass1.e(), ov.b.AnonymousClass1.e(), -156914999, 156915000, iE);
        int iC = gn.AnonymousClass22.c();
        int iC2 = gn.AnonymousClass22.c();
        at.d(gn.AnonymousClass22.c(), gn.AnonymousClass22.c(), iC, new Object[]{context}, iC2, 1567752626, -1567752625);
        return null;
    }

    @NonNull
    public static nf b(Context context) {
        int i = m + 53;
        p = i % 128;
        int i2 = i % 2;
        nf nfVar = c(context).f;
        if (i2 == 0) {
            throw null;
        }
        int i3 = p + 71;
        m = i3 % 128;
        if (i3 % 2 == 0) {
            return nfVar;
        }
        throw null;
    }

    public static /* synthetic */ void c(a aVar, e eVar, String str) {
        p = (m + 101) % 128;
        b(aVar, eVar, str);
        int i = p + 27;
        m = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static synchronized nf d() {
        nf nfVarB;
        try {
            mp.d dVar = new mp.d();
            for (String str : j) {
                Object[] objArr = new Object[1];
                s(null, 127 - (Process.myTid() >> 22), null, "\u0083\u0082\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0082\u0081", objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                q("\uee5e抓\uf56aɿ\uee2d묄䛵辰覗⍞\ueebf", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(str);
                String[] strArr = {sb.toString()};
                if (strIntern == null) {
                    throw new NullPointerException("pattern == null");
                }
                for (int i = 0; i <= 0; i++) {
                    dVar.a.add(new mp.a(strIntern, strArr[0]));
                }
            }
            nf.a aVar = new nf.a();
            aVar.s = dVar.b();
            nfVarB = aVar.b();
            mu muVarL = nfVarB.l();
            synchronized (muVarL) {
                muVarL.a = 1;
            }
            muVarL.e();
        } catch (Throwable th) {
            throw th;
        }
        return nfVarB;
    }

    public static /* synthetic */ Object e(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = i | i2 | i7;
        int i9 = ~i;
        int i10 = (~i2) | i7;
        int i11 = (~i10) | i9;
        int i12 = (~(i2 | i7 | i9)) | (~(i10 | i));
        int i13 = i4 + i + i6 + (2053704882 * i3) + ((-167119771) * i5);
        int i14 = i13 * i13;
        int i15 = (((-385660469) * i4) - 1543503872) + (1501345335 * i) + (1203980746 * i8) + (i11 * (-1203980746)) + ((-1203980746) * i12) + ((-1589641216) * i6) + (511705088 * i3) + ((-1639972864) * i5) + (1278279680 * i14);
        int i16 = ((i4 * (-1228230693)) - 288632672) + (i * (-1228230521)) + (i8 * (-86)) + (i11 * 86) + (i12 * 86) + (i6 * (-1228230607)) + (i3 * 927583762) + (i5 * (-1784727723)) + (i14 * 1163984896);
        return i15 + ((i16 * i16) * 992935936) != 1 ? e(objArr) : a(objArr);
    }

    public static void init$0() {
        $$a = new byte[]{ISO7816.INS_DECREASE_STAMPED, -58, ISOFileInfo.AB, 74};
        $$b = 16;
    }

    private static void q(String str, int i, Object[] objArr) throws Throwable {
        long j2;
        char[] charArray = str != null ? str.toCharArray() : str;
        hl hlVar = new hl();
        char[] cArrB = hl.b(f95826g ^ (-1723600592890876272L), charArray, i);
        hlVar.e = 4;
        while (true) {
            int i2 = hlVar.e;
            if (i2 >= cArrB.length) {
                break;
            }
            int i3 = i2 - 4;
            hlVar.d = i3;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[i2] ^ cArrB[i2 % 4]), Long.valueOf(i3), Long.valueOf(f95826g)};
                Object objD = an.d(-291407824);
                if (objD == null) {
                    int iLastIndexOf = 2588 - TextUtils.lastIndexOf("", '0', 0, 0);
                    char c2 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int iResolveSize = 23 - View.resolveSize(0, 0);
                    byte b2 = (byte) 0;
                    j2 = 0;
                    byte b3 = b2;
                    String str$$c = $$c(b2, b3, b3);
                    Class cls = Long.TYPE;
                    objD = an.d(iLastIndexOf, c2, iResolveSize, -1732203669, false, str$$c, new Class[]{cls, cls, cls});
                } else {
                    j2 = 0;
                }
                cArrB[i2] = ((Character) ((Method) objD).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {hlVar, hlVar};
                Object objD2 = an.d(1066529625);
                if (objD2 == null) {
                    objD2 = an.d((SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1)) + EnumC41897g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE, (char) TextUtils.indexOf("", "", 0), (SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1)) + 22, 1240473602, false, "G", new Class[]{Object.class, Object.class});
                }
                ((Method) objD2).invoke(null, objArr3);
                $10 = ($11 + 27) % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str2 = new String(cArrB, 4, cArrB.length - 4);
        int i4 = $10 + EnumC41897g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    private static void s(int[] iArr, int i, String str, String str2, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        hn hnVar = new hn();
        char[] cArr2 = l;
        Class cls = Integer.TYPE;
        int i2 = 0;
        if (cArr2 != null) {
            int i3 = $11 + 103;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objD = an.d(-814569747);
                    if (objD == null) {
                        byte b2 = (byte) i2;
                        objD = an.d((ViewConfiguration.getFadingEdgeLength() >> 16) + 1803, (char) (9692 - Color.blue(i2)), ExpandableListView.getPackedPositionGroup(0L) + 24, -1189907018, false, $$c(b2, (byte) (b2 | 45), b2), new Class[]{cls});
                    }
                    cArr[i4] = ((Character) ((Method) objD).invoke(null, objArr2)).charValue();
                    i4++;
                    $10 = ($11 + 103) % 128;
                    i2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        Object[] objArr3 = {Integer.valueOf(k)};
        Object objD2 = an.d(-1578986303);
        if (objD2 == null) {
            byte b3 = (byte) 0;
            objD2 = an.d(2565 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getTapTimeout() >> 16), 23 - (AudioTrack.getMinVolume() > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (AudioTrack.getMinVolume() == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)), -679262310, false, $$c(b3, (byte) (b3 | ISO7816.INS_UNBLOCK_CHV), b3), new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) objD2).invoke(null, objArr3)).intValue();
        if (n) {
            int length2 = bArr.length;
            hnVar.b = length2;
            char[] cArr3 = new char[length2];
            hnVar.c = 0;
            while (true) {
                int i5 = hnVar.c;
                int i6 = hnVar.b;
                if (i5 >= i6) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                cArr3[i5] = (char) (cArr2[bArr[(i6 - 1) - i5] + i] - iIntValue);
                Object[] objArr4 = {hnVar, hnVar};
                Object objD3 = an.d(717234065);
                if (objD3 == null) {
                    objD3 = an.d((AudioTrack.getMaxVolume() > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (AudioTrack.getMaxVolume() == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)) + 1969, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, 1554107594, false, "x", new Class[]{Object.class, Object.class});
                }
                ((Method) objD3).invoke(null, objArr4);
            }
        } else if (o) {
            $10 = ($11 + 47) % 128;
            int length3 = charArray.length;
            hnVar.b = length3;
            char[] cArr4 = new char[length3];
            hnVar.c = 0;
            while (true) {
                int i7 = hnVar.c;
                int i8 = hnVar.b;
                if (i7 >= i8) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                int i9 = $11 + 53;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr4[i7] = (char) (cArr2[charArray[(i8 << 1) - i7] * i] * iIntValue);
                    Object[] objArr5 = {hnVar, hnVar};
                    Object objD4 = an.d(717234065);
                    if (objD4 == null) {
                        objD4 = an.d(TextUtils.indexOf((CharSequence) "", '0', 0) + 1971, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.getCapsMode("", 0, 0) + 24, 1554107594, false, "x", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objD4).invoke(null, objArr5);
                } else {
                    cArr4[i7] = (char) (cArr2[charArray[(i8 - 1) - i7] - i] - iIntValue);
                    Object[] objArr6 = {hnVar, hnVar};
                    Object objD5 = an.d(717234065);
                    if (objD5 == null) {
                        objD5 = an.d((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1970, (char) Color.green(0), (Process.myPid() >> 22) + 24, 1554107594, false, "x", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objD5).invoke(null, objArr6);
                }
            }
        } else {
            int length4 = iArr.length;
            hnVar.b = length4;
            char[] cArr5 = new char[length4];
            hnVar.c = 0;
            while (true) {
                int i10 = hnVar.c;
                int i11 = hnVar.b;
                if (i10 >= i11) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i10] = (char) (cArr2[iArr[(i11 - 1) - i10] - i] - iIntValue);
                    hnVar.c = i10 + 1;
                }
            }
        }
    }

    private synchronized void b(Context context, final a aVar) {
        final Context applicationContext = context.getApplicationContext();
        try {
            Object[] objArr = new Object[1];
            q("勬ᣓ쓏鬋劄션睅ᚆ㕣夒\udf1a滝鵵녔䝐원敢ॏ⽒店쵽慉靕뚎售拏罊ຏ㴫兕\ue759暇蔧ꥆ伜ﻅ浶ţ㝾嚻\uf51f饻齰꺡嵇\uf16dݶڰ", (AudioTrack.getMaxVolume() > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (AudioTrack.getMaxVolume() == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)), objArr);
            this.f.b(j.d(context, ((String) objArr[0]).intern(), Boolean.FALSE).b(new mw.c().b()).d()).e(new mm() { // from class: com.facetec.sdk.ay.4
                @Override // com.facetec.sdk.mm
                public final void b(@NonNull nh nhVar) {
                    if (nhVar.a()) {
                        no noVarE = nhVar.e();
                        ay.e(applicationContext, noVarE != null ? noVarE.b() : "", aVar);
                    } else if (nhVar.d() == 401) {
                        ay.c(aVar, new e(false, false), "");
                    } else {
                        ay.c(aVar, null, nhVar.d);
                    }
                }

                @Override // com.facetec.sdk.mm
                public final void c(@NonNull IOException iOException) {
                    ay.c(aVar, null, iOException.toString());
                }
            });
            m = (p + 67) % 128;
        } catch (j.c e2) {
            b(aVar, null, e2.toString());
        }
    }

    @NonNull
    public static synchronized ay c(Context context) {
        try {
            p = (m + 59) % 128;
            if (b == null) {
                b = new ay(context);
            }
            ay ayVar = b;
            int i = p + 55;
            m = i % 128;
            if (i % 2 == 0) {
                return ayVar;
            }
            int i2 = 11 / 0;
            return ayVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void e(Context context, String str, a aVar) {
        int i = p + 99;
        m = i % 128;
        if (i % 2 == 0) {
            e(1275520808, v.a(), new Object[]{context, str, aVar}, v.a(), -1275520807, v.a(), v.a());
        } else {
            e(1275520808, v.a(), new Object[]{context, str, aVar}, v.a(), -1275520807, v.a(), v.a());
            throw null;
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i = p + 101;
        m = i % 128;
        if (i % 2 == 0) {
            return WebSettings.getDefaultUserAgent(context);
        }
        WebSettings.getDefaultUserAgent(context);
        throw null;
    }

    public static synchronized void c() {
        try {
            int i = p + 93;
            m = i % 128;
            if (i % 2 != 0) {
                b = null;
                int i2 = 93 / 0;
            } else {
                b = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void b(final a aVar, final e eVar, final String str) {
        m = (p + 11) % 128;
        if (aVar != null) {
            AsyncTask.execute(new Runnable() { // from class: com.facetec.sdk.星
                @Override // java.lang.Runnable
                public final void run() {
                    ay.d(aVar, eVar, str);
                }
            });
            p = (m + 75) % 128;
        }
    }

    public static void b() {
        f95826g = -7791964446143744145L;
        l = new char[]{8691, 8456, 8462, 8474, 8694, 8693, 8449, 8527, 8452, 8455, 8454, 8701, 8692, 8453, 8460, 8463, 8459, 8450, 8484, 8461, 8537, 8695, 8457, 8538, 8470, 8448, 8468, 8482, 8495, 8506, 8487, 8489, 8507, 8690, 8485, 8499, 8520, 8501, 8500, 8523, 8522, 8486, 8458, 8464, 8492, 8466, 8493, 8465, 8469, 8481, 8688, 8502, 8488, 8689, 8467, 8494, 8490, 8510};
        k = 1071522169;
        o = true;
        n = true;
    }

    public static String c(String str) throws Throwable {
        Object[] objArr = new Object[1];
        s(null, 127 - (PointF.length(SelfieScan.RECOGNITION_FAIL_RESULT, SelfieScan.RECOGNITION_FAIL_RESULT) > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (PointF.length(SelfieScan.RECOGNITION_FAIL_RESULT, SelfieScan.RECOGNITION_FAIL_RESULT) == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)), null, "\u008c", objArr);
        String strIntern = ((String) objArr[0]).intern();
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        s(null, 127 - ExpandableListView.getPackedPositionGroup(0L), null, "\u008c\u008e\u0092\u0082\u0091\u008e\u0090\u0084\u008c\u008f\u008e\u008d\u008c\u0089\u008b\u0086\u008b\u0089\u0084\u008a", objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(e);
        sb.append(strIntern);
        sb.append(str);
        sb.append(strIntern);
        sb.append(h);
        sb.append(strIntern);
        sb.append(Build.MODEL);
        sb.append(strIntern);
        sb.append(FaceTecSDK.version());
        sb.append(strIntern);
        sb.append(locale.toString());
        sb.append(strIntern);
        sb.append(locale.getLanguage());
        sb.append(strIntern);
        sb.append(cp.c);
        String string = sb.toString();
        m = (p + 49) % 128;
        return string;
    }

    public static void d(Context context, a aVar) {
        int i = m + 73;
        p = i % 128;
        if (i % 2 != 0) {
            c(context).b(context, aVar);
        } else {
            c(context).b(context, aVar);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(a aVar, e eVar, String str) {
        int i = m + 43;
        p = i % 128;
        int i2 = i % 2;
        aVar.onCompletion(eVar, str);
        if (i2 == 0) {
            throw null;
        }
        int i3 = p + 91;
        m = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void d(final Context context, q qVar, final boolean z, final b bVar) {
        String strIntern;
        Object obj;
        Object obj2;
        el elVarB = new em().e().b();
        ey eyVar = new ey();
        if (qVar.d == EnumC39477r.FACE_SCAN) {
            Object[] objArr = new Object[1];
            q("㉩즮퍍㒾㈊ူ惐뤫嗰", 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
            eyVar.b(((String) objArr[0]).intern(), 1);
            Object[] objArr2 = new Object[1];
            q("ㆤ廔\uf6f6䱙㇗蝎䕻쇗嘱ὀ\ued62맰︽\uf75a畬ᇃر佃", (ViewConfiguration.getScrollFriction() > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (ViewConfiguration.getScrollFriction() == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)), objArr2);
            eyVar.c(((String) objArr2[0]).intern(), qVar.b);
            if (((Boolean) bk.d(-261957882, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[0], 261957889)).booleanValue()) {
                Object[] objArr3 = new Object[1];
                q("ᾭ쮐䘖鿧Έሟ", View.combineMeasuredStates(0, 0) + 1, objArr3);
                eyVar.c(((String) objArr3[0]).intern(), o.b);
            }
            es esVarC = elVarB.c(qVar.a);
            Object[] objArr4 = new Object[1];
            q("㴊㱌\udf20͆㵥\ue5c7", 1 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
            eyVar.a(((String) objArr4[0]).intern(), esVarC);
            if (z) {
                et etVar = new et();
                Object[] objArr5 = new Object[1];
                s(null, KeyEvent.getDeadChar(0, 0) + 127, null, "\u008e\u0084\u0082\u0094\u0097\u0099\u008b\u0090\u0092\u0094\u008a\u008a\u0082", objArr5);
                etVar.d(((String) objArr5[0]).intern());
                Object[] objArr6 = new Object[1];
                s(null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), null, "\u008d\u009a\u0084\u0086", objArr6);
                eyVar.a(((String) objArr6[0]).intern(), etVar);
            }
            Object[] objArr7 = new Object[1];
            q("䮿\ueac0卝캗䯚㍑\ue0d1䌅Ⱟꭗ䣊㬋萩䍃탸錇簸נּ룆ଉ퐡鍦×", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr7);
            eyVar.c(((String) objArr7[0]).intern(), qVar.c);
            Object[] objArr8 = new Object[1];
            s(null, Color.argb(0, 0, 0, 0) + 127, null, "\u008e\u009c\u0090\u0082\u0092\u008d\u008d\u008b\u009b\u0089\u0092\u0086\u008d\u0082\u0090\u009a\u0084\u0092\u008e", objArr8);
            eyVar.c(((String) objArr8[0]).intern(), qVar.i);
            Object[] objArr9 = new Object[1];
            q("舩忼⭥鹿艍虪飺瓚\ue5bbṨレ್䶸\uf668\ua8daꓑ", 1 - Color.alpha(0), objArr9);
            eyVar.c(((String) objArr9[0]).intern(), qVar.j);
            Object[] objArr10 = new Object[1];
            q("㫆뭀\uea5c瓤㪢拚委殺嵙\ufade\uf1ef腹", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr10);
            eyVar.c(((String) objArr10[0]).intern(), h);
            Object[] objArr11 = new Object[1];
            s(null, ExpandableListView.getPackedPositionType(0L) + 127, null, "\u008b\u0083\u0084\u009d\u008b\u0089\u0092\u0096\u008b\u008e", objArr11);
            eyVar.c(((String) objArr11[0]).intern(), Build.MANUFACTURER);
            Object[] objArr12 = new Object[1];
            q("\uf703\udc39컯᱄\uf767֣絧釐邜鶧하\ue9d2㢟疫䵵", 1 - Drawable.resolveOpacity(0, 0), objArr12);
            eyVar.c(((String) objArr12[0]).intern(), Build.MODEL);
            Object[] objArr13 = new Object[1];
            q("\ufa6f䚚◩ᗟ廓鼀陡顋鷰܄㹜\ue055㗁\uef08ꙭ䡙췲圆칵", 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr13);
            eyVar.c(((String) objArr13[0]).intern(), Build.VERSION.RELEASE);
            Object[] objArr14 = new Object[1];
            q("\ue1a6䥪\uec0eꮴ\ue1c2郰徆☠蘹ࣴ\uf7bb帾⸊\ue0e4澈\uf624", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr14);
            String strIntern2 = ((String) objArr14[0]).intern();
            Object[] objArr15 = new Object[1];
            s(null, 127 - Color.argb(0, 0, 0, 0), null, "\u008e\u0092\u0082\u0091\u008e\u0090\u009e", objArr15);
            eyVar.c(strIntern2, ((String) objArr15[0]).intern());
            Object[] objArr16 = new Object[1];
            q("Ꮚ֢\uf02b\uef10Ꭾ\udc38䎣抄瑕䐼\ueb93\u1a9b\udc53갻玹", ExpandableListView.getPackedPositionGroup(0L) + 1, objArr16);
            eyVar.c(((String) objArr16[0]).intern(), Build.BRAND);
            Object[] objArr17 = new Object[1];
            q("槸퍫娧㫽榜૱\ue9af띩\u0e67鋵䆟콫꙯竨\ud9bd杧幭싼놰ｾ", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr17);
            eyVar.c(((String) objArr17[0]).intern(), Build.BOOTLOADER);
            Object[] objArr18 = new Object[1];
            s(null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, null, "\u0086\u0090\u0092\u0091\u0097\u0091\u008b\u009a\u0090\u0092\u009f\u008b\u0089\u0092\u0096\u008b\u008e", objArr18);
            eyVar.c(((String) objArr18[0]).intern(), Build.FINGERPRINT);
            Object[] objArr19 = new Object[1];
            q("躑ݝ驮肣軵\udec7⧦ഷ\ue90e䛃臇甞䄢껼᧽\udd24뤖ᛇ燳䔼", 1 - (Process.myPid() >> 22), objArr19);
            eyVar.b(((String) objArr19[0]).intern(), Integer.valueOf(Build.VERSION.SDK_INT));
            Object[] objArr20 = new Object[1];
            s(null, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, null, "\u008b\u009a\u0084\u008f\u0089\u0084 \u0086\u0090\u008b\u0092\u0094\u0089", objArr20);
            eyVar.c(((String) objArr20[0]).intern(), e);
            Object[] objArr21 = new Object[1];
            q("䯼쫱껿鴯䮆፡ᵮႿⱖ譯땷梥葭捩ⵧ", -TextUtils.indexOf((CharSequence) "", '0'), objArr21);
            eyVar.c(((String) objArr21[0]).intern(), FaceTecSDK.version());
            Object[] objArr22 = new Object[1];
            s(null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, null, "\u008e\u009c\u0090\u0082\u0092\u0086\u0084\u0089\u0092\u0094\u0097\u0097\u0084", objArr22);
            eyVar.b(((String) objArr22[0]).intern(), Integer.valueOf(bk.c));
            Object[] objArr23 = new Object[1];
            q("댤ᮯ軤칫덌숹㵽䏾풽娧镪㯓粪눹ൻ鏲蒱ਾ敺\u0bffⲗ戡\udd67\ue3e3뒺逸㕜寧\udcbf刧굮㏻撴ꨥթꯤ", 1 - KeyEvent.keyCodeFromString(""), objArr23);
            eyVar.c(((String) objArr23[0]).intern(), ah.b);
            Object[] objArr24 = new Object[1];
            s(null, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, null, "\u008d\u009c¡\u009e\u008e\u008b\u0086\u0091\u0082\u0097\u0097\u0085\u009b\u008b\u0089\u0092\u0096\u008b\u008e", objArr24);
            eyVar.c(((String) objArr24[0]).intern(), Arrays.toString(Build.SUPPORTED_ABIS));
        } else {
            Object[] objArr25 = new Object[1];
            q("쑵벸煘㦉쐜攣싕됗ꏨﴭ", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr25);
            eyVar.b(((String) objArr25[0]).intern(), 1);
            if (qVar.d == EnumC39477r.ID_SCAN_ONLY) {
                m = (p + 85) % 128;
                Object[] objArr26 = new Object[1];
                q("ᥓ㋌\ufffbꝲ᤺\ueb57䱶⫬绎獙\ue46e勥훇魂", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr26);
                eyVar.b(((String) objArr26[0]).intern(), 1);
                if (qVar.f95947g) {
                    Object[] objArr27 = new Object[1];
                    s(null, Process.getGidForName("") + 128, null, "\u0086\u0092\u0090\u0092¢\u0094\u0090\u0082\u0090\u0084\u0089\u008d\u008e\u0092", objArr27);
                    eyVar.b(((String) objArr27[0]).intern(), 1);
                }
                qVar.a.add(cj.b(ao.f));
                es esVarC2 = elVarB.c(qVar.a);
                Object[] objArr28 = new Object[1];
                q("㴊㱌\udf20͆㵥\ue5c7", 1 - TextUtils.getOffsetBefore("", 0), objArr28);
                eyVar.a(((String) objArr28[0]).intern(), esVarC2);
            } else {
                et etVar2 = new et();
                etVar2.d(cj.b(ao.f));
                Object[] objArr29 = new Object[1];
                q("㴊㱌\udf20͆㵥\ue5c7", (-16777215) - Color.rgb(0, 0, 0), objArr29);
                eyVar.a(((String) objArr29[0]).intern(), etVar2);
            }
            Object[] objArr30 = new Object[1];
            q("ᙇ雃柴忏ᘽ佌푦", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr30);
            eyVar.b(((String) objArr30[0]).intern(), 1);
            Object[] objArr31 = new Object[1];
            s(null, ExpandableListView.getPackedPositionChild(0L) + 128, null, "\u008d\u0081\u0092\u008e", objArr31);
            eyVar.c(((String) objArr31[0]).intern(), qVar.j);
            Object[] objArr32 = new Object[1];
            q("\udfc3\ueb4b㥤ࢻ\udfa7㋝諳蔢롌", 1 - TextUtils.getOffsetBefore("", 0), objArr32);
            eyVar.c(((String) objArr32[0]).intern(), qVar.f);
            Object[] objArr33 = new Object[1];
            q("䍿趄ꄡ秸䌞吓", (-16777215) - Color.rgb(0, 0, 0), objArr33);
            eyVar.c(((String) objArr33[0]).intern(), bk.a);
            Object[] objArr34 = new Object[1];
            q("蒱鈐ឹⰫ蓐䮈", -TextUtils.lastIndexOf("", '0'), objArr34);
            eyVar.c(((String) objArr34[0]).intern(), e);
            Object[] objArr35 = new Object[1];
            q("ᩁ\ue892ᡟ綟ᨥ\u3100", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, objArr35);
            eyVar.c(((String) objArr35[0]).intern(), Build.MODEL);
            Object[] objArr36 = new Object[1];
            s(null, 127 - Color.green(0), null, "\u0096\u0081", objArr36);
            eyVar.c(((String) objArr36[0]).intern(), FaceTecSDK.version());
            Object[] objArr37 = new Object[1];
            q("룜\ue374媳ࣔ뢸㫢\ue924蕍", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr37);
            eyVar.c(((String) objArr37[0]).intern(), UUID.randomUUID().toString());
            Object[] objArr38 = new Object[1];
            s(null, 127 - Gravity.getAbsoluteGravity(0, 0), null, "\u0084\u0086\u0084\u008e\u0084\u0086\u008b\u0083", objArr38);
            eyVar.c(((String) objArr38[0]).intern(), "");
            Object[] objArr39 = new Object[1];
            q("惘㇠躛⁖悼\ue876", -TextUtils.lastIndexOf("", '0', 0), objArr39);
            eyVar.c(((String) objArr39[0]).intern(), h);
        }
        Object[] objArr40 = new Object[1];
        q("遏ꛍ煃킪逩罓싞崲\uf7c7\ue753櫚╽忄ཞ\uf2de赱\ua7cb띌體ᔽ࿌", (ViewConfiguration.getScrollFriction() > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (ViewConfiguration.getScrollFriction() == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)), objArr40);
        SharedPreferences sharedPreferences = context.getSharedPreferences(((String) objArr40[0]).intern(), 0);
        Object[] objArr41 = new Object[1];
        q("甬皊뫯䏼畊꼔ॲ칤ኤ㜔ꅶ똫몧\udf19㥲ḧ䊨朋典虫\ueaafཋ\ue979渼犵霒Š홧\u1ae9㼈饤빸ꊡ윅", -((byte) KeyEvent.getModifierMetaStateMask()), objArr41);
        String string = sharedPreferences.getString(((String) objArr41[0]).intern(), null);
        if (string == null) {
            Object[] objArr42 = new Object[1];
            s(null, 127 - (TypedValue.complexToFraction(0, SelfieScan.RECOGNITION_FAIL_RESULT, SelfieScan.RECOGNITION_FAIL_RESULT) > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (TypedValue.complexToFraction(0, SelfieScan.RECOGNITION_FAIL_RESULT, SelfieScan.RECOGNITION_FAIL_RESULT) == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)), null, "\u0094\u0092\u0084\u0083\u008b", objArr42);
            eyVar.c(((String) objArr42[0]).intern(), "");
        } else {
            int i = p + 21;
            m = i % 128;
            if (i % 2 != 0) {
                Object[] objArr43 = new Object[1];
                s(null, (ViewConfiguration.getTouchSlop() >>> 55) * 82, null, "\u0094\u0092\u0084\u0083\u008b", objArr43);
                obj2 = objArr43[0];
            } else {
                Object[] objArr44 = new Object[1];
                s(null, 127 - (ViewConfiguration.getTouchSlop() >> 8), null, "\u0094\u0092\u0084\u0083\u008b", objArr44);
                obj2 = objArr44[0];
            }
            eyVar.c(((String) obj2).intern(), string);
        }
        String str = qVar.e;
        if (str != null && !str.isEmpty()) {
            int i2 = m + 9;
            p = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr45 = new Object[1];
                s(null, 47 / (ViewConfiguration.getJumpTapTimeout() / 69), null, "\u008b\u0089\u0092\u0096\u008b£\u0083\u0082\u0091\u009f\u0091\u0082\u0091\u0091\u008b", objArr45);
                eyVar.c(((String) objArr45[0]).intern(), str);
                Object[] objArr46 = new Object[1];
                s(null, 90 % View.MeasureSpec.getMode(0), null, "\u0091\u0082\u0091\u0091ª\u008d\u0089\u0092\u0086\u008d\u0082\u0090\u009a\u0084\u0092\u008e¥\u0083\u0082\u0082\u0081¥©¨§¦¤\u0083\u0082\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0082\u0081\u0088\u008b\u0087\u0089\u0084\u0089¥¥¤\u008d\u0097\u0086\u0086\u0087", objArr46);
                obj = objArr46[0];
            } else {
                Object[] objArr47 = new Object[1];
                s(null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, "\u008b\u0089\u0092\u0096\u008b£\u0083\u0082\u0091\u009f\u0091\u0082\u0091\u0091\u008b", objArr47);
                eyVar.c(((String) objArr47[0]).intern(), str);
                Object[] objArr48 = new Object[1];
                s(null, View.MeasureSpec.getMode(0) + 127, null, "\u0091\u0082\u0091\u0091ª\u008d\u0089\u0092\u0086\u008d\u0082\u0090\u009a\u0084\u0092\u008e¥\u0083\u0082\u0082\u0081¥©¨§¦¤\u0083\u0082\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0082\u0081\u0088\u008b\u0087\u0089\u0084\u0089¥¥¤\u008d\u0097\u0086\u0086\u0087", objArr48);
                obj = objArr48[0];
            }
            strIntern = ((String) obj).intern();
        } else {
            Object[] objArr49 = new Object[1];
            s(null, 127 - KeyEvent.getDeadChar(0, 0), null, "\u0090\u0082\u0092\u008d\u008d\u008b\u008d¥\u0083\u0082\u0082\u0081¥©\u0088©\u0096¥\u0092\u0097\u0084¥\u0083\u0082\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0082\u0081\u0088\u0092\u0097\u0084¥¥¤\u008d\u0097\u0086\u0086\u0087", objArr49);
            strIntern = ((String) objArr49[0]).intern();
        }
        final String str2 = strIntern;
        try {
            this.f.b(j.b(context, str2, eyVar)).e(new mm() { // from class: com.facetec.sdk.ay.1
                @Override // com.facetec.sdk.mm
                public final void b(nh nhVar) {
                    t.b = true;
                    if (nhVar.d() != 200) {
                        String strB = nhVar.e() != null ? nhVar.e().b() : "";
                        Context context2 = context;
                        c cVar = c.DIAGNOSTIC_UPLOAD_ERROR;
                        StringBuilder sb = new StringBuilder("- URL: ");
                        sb.append(str2);
                        sb.append(" - Status code: ");
                        sb.append(nhVar.d());
                        sb.append(" - Response body: ");
                        sb.append(strB);
                        t.d(context2, cVar, sb.toString(), null);
                    }
                    if (!nhVar.a()) {
                        bVar.e(z);
                    } else {
                        ay.c++;
                        bVar.c();
                    }
                }

                @Override // com.facetec.sdk.mm
                public final void c(IOException iOException) {
                    Context context2 = context;
                    c cVar = c.DIAGNOSTIC_UPLOAD_ERROR;
                    StringBuilder sb = new StringBuilder("Diagnostic Upload failed with IOException: ");
                    sb.append(iOException.getMessage());
                    t.d(context2, cVar, sb.toString(), iOException);
                    bVar.e(z);
                }
            });
        } catch (j.c e2) {
            e2.printStackTrace();
        }
    }

    public static String a(Context context) {
        return (String) e(-658106623, v.a(), new Object[]{context}, v.a(), 658106623, v.a(), v.a());
    }

    private static void a(Context context, String str, a aVar) {
        e(1275520808, v.a(), new Object[]{context, str, aVar}, v.a(), -1275520807, v.a(), v.a());
    }
}