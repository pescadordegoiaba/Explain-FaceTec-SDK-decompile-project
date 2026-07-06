package com.facetec.sdk;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.facetec.sdk.gn;
import com.incode.welcome_sdk.modules.SelfieScan;
import com.plaid.internal.EnumC41897g;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import net.sf.scuba.smartcards.ISO7816;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class ce {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static String a;
    private static String b;
    static boolean c;
    private static boolean d;
    private static boolean e;
    private static int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f95850g;
    private static long h;
    private static LinkedList<Long> i;
    private static boolean j;
    private static int k;
    private static int l;
    private static int m;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r5, int r6, byte r7) {
        /*
            byte[] r0 = com.facetec.sdk.ce.$$a
            int r6 = r6 * 2
            int r1 = 1 - r6
            int r7 = r7 + 4
            int r5 = r5 * 2
            int r5 = 121 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r0[r7]
        L28:
            int r4 = -r4
            int r5 = r5 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ce.$$c(byte, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        k = 0;
        l = 1;
        f95850g = 0;
        m = 1;
        e();
        a = "";
        d = false;
        e = false;
        b = "";
        c = false;
        int i2 = l + 85;
        k = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static void a(Context context) {
        f95850g = (m + 77) % 128;
        if (d && !i.isEmpty()) {
            int i2 = f95850g + 37;
            m = i2 % 128;
            if (i2 % 2 != 0) {
                i.removeLast();
                f(context);
            } else {
                i.removeLast();
                f(context);
                throw null;
            }
        }
    }

    public static void b(Context context) {
        int i2 = m;
        f95850g = (i2 + 33) % 128;
        if (!d) {
            f95850g = (i2 + 19) % 128;
        } else {
            i.add(Long.valueOf(new Date().getTime()));
            f(context);
        }
    }

    public static void c(Context context) {
        if (!j) {
            j = true;
            m = (f95850g + 111) % 128;
            while (i.size() > 3) {
                f95850g = (m + 107) % 128;
                i.removeFirst();
            }
            f(context);
            m = (f95850g + 23) % 128;
        }
        f95850g = (m + 61) % 128;
    }

    public static void d(@NonNull Context context) {
        int i2 = m + 9;
        int i3 = i2 % 128;
        f95850g = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (d) {
            m = (i3 + 43) % 128;
            return;
        }
        i = new LinkedList<>();
        h = 0L;
        j = false;
        a = context.getPackageName();
        b = Settings.Secure.getString(context.getContentResolver(), "android_id");
        e = g(context);
        d = true;
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i6;
        int i9 = ~i3;
        int i10 = (~(i8 | i9)) | (~(i6 | i3)) | (~(i5 | i3));
        int i11 = ~i5;
        int i12 = (~(i11 | i3)) | i6;
        int i13 = (~(i3 | i6 | i5)) | (~(i9 | i11));
        int i14 = i6 + i5 + i4 + ((-373584967) * i7) + ((-1711780345) * i2);
        int i15 = i14 * i14;
        int i16 = (i6 * 1075882953) + 1902575616 + (1075882953 * i5) + ((-462509112) * i10) + (925018224 * i12) + (462509112 * i13) + (1538392064 * i4) + ((-375259136) * i7) + ((-1109524480) * i2) + (585564160 * i15);
        int i17 = ((i6 * 235012993) - 778813113) + (i5 * 235012993) + (i10 * (-632)) + (i12 * 1264) + (i13 * 632) + (i4 * 235013625) + (i7 * 915899377) + (i2 * (-1709701169)) + (i15 * 1974403072);
        int i18 = i16 + (i17 * i17 * (-848756736));
        if (i18 != 1) {
            return i18 != 2 ? d(objArr) : c(objArr);
        }
        Context context = (Context) objArr[0];
        if (bj.c) {
            f95850g = (m + 19) % 128;
            return Boolean.FALSE;
        }
        long jLongValue = ((Long) e(gn.c.AnonymousClass4.c(), gn.c.AnonymousClass4.c(), gn.c.AnonymousClass4.c(), -1696961540, 1696961542, new Object[]{context}, gn.c.AnonymousClass4.c())).longValue();
        if (jLongValue <= 0) {
            return Boolean.FALSE;
        }
        if (new Date().getTime() >= jLongValue) {
            return Boolean.FALSE;
        }
        f95850g = (m + 113) % 128;
        return Boolean.TRUE;
    }

    private static void f(final Context context) {
        int i2 = m + 29;
        f95850g = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (context == null) {
            return;
        }
        dj.d(new Runnable() { // from class: com.facetec.sdk.仙乐
            @Override // java.lang.Runnable
            public final void run() {
                ce.n(context);
            }
        });
        int i3 = f95850g + 51;
        m = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static boolean g(@NonNull Context context) throws Throwable {
        int i2 = f95850g + 29;
        m = i2 % 128;
        int i3 = i2 % 2;
        try {
            k(context);
            f95850g = (m + 33) % 128;
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        } catch (Exception e2) {
            bh.e(e2.getMessage());
            e2.getStackTrace();
            return false;
        }
    }

    public static boolean h(Context context) {
        int iC = gn.c.AnonymousClass4.c();
        int iC2 = gn.c.AnonymousClass4.c();
        int iC3 = gn.c.AnonymousClass4.c();
        return ((Boolean) e(gn.c.AnonymousClass4.c(), iC, iC2, 301279779, -301279778, new Object[]{context}, iC3)).booleanValue();
    }

    private static void i(Context context) {
        long j2;
        f95850g = (m + 45) % 128;
        if (!i.isEmpty()) {
            int i2 = f95850g + 75;
            m = i2 % 128;
            if (i2 % 2 == 0) {
                i.size();
                i.peekLast().longValue();
                throw null;
            }
            long size = i.size();
            long jLongValue = i.peekLast().longValue();
            if (!(!c)) {
                m = (f95850g + EnumC41897g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                j2 = 600000;
            } else {
                j2 = 300000;
            }
            long j3 = jLongValue - j2;
            while (!i.isEmpty()) {
                int i3 = m + 21;
                f95850g = i3 % 128;
                if (i3 % 2 != 0) {
                    i.peekFirst().longValue();
                    throw null;
                }
                if (i.peekFirst().longValue() >= j3) {
                    break;
                } else {
                    i.removeFirst();
                }
            }
            if (i.size() >= (!(c ^ true) ? 16L : 14L)) {
                h = jLongValue;
                i.clear();
            }
            if (i.size() != size) {
                f(context);
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{125, ISO7816.INS_UNBLOCK_CHV, 8, -98};
        $$b = 35;
    }

    public static long j(Context context) {
        int iC = gn.c.AnonymousClass4.c();
        int iC2 = gn.c.AnonymousClass4.c();
        int iC3 = gn.c.AnonymousClass4.c();
        return ((Long) e(gn.c.AnonymousClass4.c(), iC, iC2, -1696961540, 1696961542, new Object[]{context}, iC3)).longValue();
    }

    private static void k(@NonNull Context context) throws Throwable {
        byte[] bArrE = bq.e(new File(context.getCacheDir(), a()), d());
        JSONObject jSONObject = new JSONObject(new String(bArrE, 0, bArrE.length, StandardCharsets.UTF_8));
        i.clear();
        Object[] objArr = new Object[1];
        o(new int[]{-1631501488, 961216492}, 2 - TextUtils.getCapsMode("", 0, 0), objArr);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(((String) objArr[0]).intern());
        if (jSONArrayOptJSONArray != null) {
            m = (f95850g + 53) % 128;
            int i2 = 0;
            while (i2 < jSONArrayOptJSONArray.length()) {
                int i3 = f95850g + 13;
                m = i3 % 128;
                if (i3 % 2 == 0) {
                    i.add(Long.valueOf(jSONArrayOptJSONArray.getLong(i2)));
                } else {
                    i.add(Long.valueOf(jSONArrayOptJSONArray.getLong(i2)));
                    i2++;
                }
                f95850g = (m + 77) % 128;
            }
            Collections.sort(i);
        }
        Object[] objArr2 = new Object[1];
        o(new int[]{2010647402, 1609476045}, View.getDefaultSize(0, 0) + 2, objArr2);
        h = jSONObject.optLong(((String) objArr2[0]).intern(), 0L);
        Object[] objArr3 = new Object[1];
        o(new int[]{-1107106866, 1226862337}, View.getDefaultSize(0, 0) + 2, objArr3);
        j = jSONObject.optBoolean(((String) objArr3[0]).intern(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Context context) {
        f95850g = (m + 97) % 128;
        try {
            Object[] objArr = {context.getCacheDir()};
            e(gn.c.AnonymousClass4.c(), gn.c.AnonymousClass4.c(), gn.c.AnonymousClass4.c(), -867342100, 867342100, objArr, gn.c.AnonymousClass4.c());
            int i2 = f95850g + 89;
            m = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 35 / 0;
            }
        } catch (Exception e2) {
            bh.e(e2.getMessage());
        }
    }

    private static void o(int[] iArr, int i2, Object[] objArr) throws Throwable {
        char c2;
        char[] cArr;
        int[] iArr2;
        int length;
        int[] iArr3;
        int i3;
        int i4;
        hg hgVar = new hg();
        char[] cArr2 = new char[4];
        int i5 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr4 = f;
        int i6 = 2027942060;
        Class cls = Integer.TYPE;
        int i7 = 0;
        if (iArr4 != null) {
            int i8 = $11 + 93;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = iArr4.length;
                iArr3 = new int[length];
            } else {
                length = iArr4.length;
                iArr3 = new int[length];
            }
            int i9 = 0;
            while (i9 < length) {
                $10 = ($11 + 47) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr4[i9])};
                    Object objD = an.d(i6);
                    if (objD == null) {
                        i4 = i6;
                        int maximumDrawingCacheSize = 617 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        i3 = i5;
                        char mode = (char) View.MeasureSpec.getMode(i7);
                        int iIndexOf = 23 - TextUtils.indexOf("", "", i7);
                        byte b2 = (byte) i7;
                        byte b3 = b2;
                        objD = an.d(maximumDrawingCacheSize, mode, iIndexOf, 247342071, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{cls});
                    } else {
                        i3 = i5;
                        i4 = i6;
                    }
                    iArr3[i9] = ((Integer) ((Method) objD).invoke(null, objArr2)).intValue();
                    i9++;
                    i6 = i4;
                    i5 = i3;
                    i7 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int i10 = i5;
        int i11 = i6;
        int length2 = iArr4.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = f;
        if (iArr6 != null) {
            $10 = ($11 + 83) % 128;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i12])};
                Object objD2 = an.d(i11);
                if (objD2 == null) {
                    cArr = cArr2;
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    iArr2 = iArr6;
                    objD2 = an.d(Drawable.resolveOpacity(0, 0) + 617, (char) (TypedValue.complexToFloat(0) > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (TypedValue.complexToFloat(0) == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 23, 247342071, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{cls});
                } else {
                    cArr = cArr2;
                    iArr2 = iArr6;
                }
                iArr7[i12] = ((Integer) ((Method) objD2).invoke(null, objArr3)).intValue();
                i12++;
                $10 = ($11 + EnumC41897g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                cArr2 = cArr;
                iArr6 = iArr2;
            }
            iArr6 = iArr7;
        }
        char[] cArr4 = cArr2;
        float f2 = SelfieScan.RECOGNITION_FAIL_RESULT;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        hgVar.c = 0;
        while (true) {
            int i13 = hgVar.c;
            if (i13 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i2);
                return;
            }
            $10 = ($11 + 13) % 128;
            int i14 = iArr[i13];
            char c3 = (char) (i14 >> 16);
            cArr4[0] = c3;
            char c4 = (char) i14;
            char c5 = 1;
            cArr4[1] = c4;
            char c6 = (char) (iArr[i13 + 1] >> 16);
            cArr4[i10] = c6;
            char c7 = (char) iArr[i13 + 1];
            cArr4[3] = c7;
            hgVar.d = (c3 << 16) + c4;
            hgVar.a = (c6 << 16) + c7;
            hg.a(iArr5);
            int i15 = 0;
            while (i15 < 16) {
                $10 = ($11 + 67) % 128;
                int i16 = hgVar.d ^ iArr5[i15];
                hgVar.d = i16;
                int iB = hg.b(i16);
                Object[] objArr4 = new Object[4];
                objArr4[3] = hgVar;
                objArr4[i10] = hgVar;
                objArr4[c5] = Integer.valueOf(iB);
                objArr4[0] = hgVar;
                Object objD3 = an.d(-1264699187);
                if (objD3 == null) {
                    int packedPositionType = 1558 - ExpandableListView.getPackedPositionType(0L);
                    float f3 = f2;
                    char c8 = (char) ((PointF.length(f3, f3) > f3 ? 1 : (PointF.length(f3, f3) == f3 ? 0 : -1)) + 63317);
                    c2 = c5;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 33;
                    byte b6 = (byte) ($$b & 5);
                    byte b7 = (byte) (b6 - 1);
                    objD3 = an.d(packedPositionType, c8, iLastIndexOf, -1023415402, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, cls, Object.class, Object.class});
                } else {
                    c2 = c5;
                }
                int iIntValue = ((Integer) ((Method) objD3).invoke(null, objArr4)).intValue();
                hgVar.d = hgVar.a;
                hgVar.a = iIntValue;
                i15++;
                c5 = c2;
                f2 = SelfieScan.RECOGNITION_FAIL_RESULT;
            }
            char c9 = c5;
            int i17 = hgVar.d;
            int i18 = hgVar.a;
            hgVar.d = i18;
            hgVar.a = i17;
            int i19 = i17 ^ iArr5[16];
            hgVar.a = i19;
            int i20 = i18 ^ iArr5[17];
            hgVar.d = i20;
            cArr4[0] = (char) (i20 >>> 16);
            cArr4[c9] = (char) i20;
            cArr4[i10] = (char) (i19 >>> 16);
            cArr4[3] = (char) i19;
            hg.a(iArr5);
            int i21 = hgVar.c;
            cArr3[i21 * 2] = cArr4[0];
            cArr3[(i21 * 2) + 1] = cArr4[c9];
            cArr3[(i21 * 2) + 2] = cArr4[i10];
            cArr3[(i21 * 2) + 3] = cArr4[3];
            int i22 = i10;
            Object[] objArr5 = new Object[i22];
            objArr5[c9] = hgVar;
            objArr5[0] = hgVar;
            Object objD4 = an.d(-204410541);
            if (objD4 == null) {
                int minimumFlingVelocity = 310 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                float minVolume = AudioTrack.getMinVolume();
                f2 = SelfieScan.RECOGNITION_FAIL_RESULT;
                objD4 = an.d(minimumFlingVelocity, (char) (minVolume > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (minVolume == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)), (AudioTrack.getMinVolume() > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (AudioTrack.getMinVolume() == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)) + 23, -2051988984, false, "A", new Class[]{Object.class, Object.class});
            } else {
                f2 = SelfieScan.RECOGNITION_FAIL_RESULT;
            }
            ((Method) objD4).invoke(null, objArr5);
            i10 = i22;
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        Context context = (Context) objArr[0];
        f95850g = (m + 113) % 128;
        i(context);
        long j2 = h;
        if (j2 == 0) {
            return 0L;
        }
        long j3 = j2 + 300000;
        int i2 = m + 87;
        f95850g = i2 % 128;
        if (i2 % 2 == 0) {
            return Long.valueOf(j3);
        }
        throw null;
    }

    public static void e(Context context) {
        if (d) {
            if (!i.isEmpty()) {
                int i2 = m + 97;
                f95850g = i2 % 128;
                if (i2 % 2 == 0) {
                    i.removeLast();
                } else {
                    i.removeLast();
                    throw null;
                }
            }
            b(context);
            f95850g = (m + 95) % 128;
        }
    }

    @NonNull
    private static String a() throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);
        Object[] objArr = new Object[1];
        o(new int[]{876755563, -2122466880, -1768931922, 1020059570, 1519685268, 1131246669, 1284239509, 847732952, -1552509032, -383275976, 304872224, -2023303383}, KeyEvent.normalizeMetaState(0) + 21, objArr);
        sb.append(((String) objArr[0]).intern());
        String strB = bp.b(sb.toString());
        f95850g = (m + 99) % 128;
        return strB;
    }

    public static void d(Context context, int i2) {
        int i3 = f95850g + 59;
        m = i3 % 128;
        int i4 = 0;
        if (i3 % 2 == 0) {
            int i5 = 2 / 0;
            if (e) {
                return;
            }
        } else if (e) {
            return;
        }
        if (i2 > 0) {
            long time = new Date().getTime();
            while (i4 < i2) {
                int i6 = f95850g + 93;
                m = i6 % 128;
                if (i6 % 2 == 0) {
                    i.add(Long.valueOf(time));
                    i4 += 71;
                } else {
                    i.add(Long.valueOf(time));
                    i4++;
                }
            }
            f(context);
        }
    }

    private static void e(File file) {
        int iC = gn.c.AnonymousClass4.c();
        int iC2 = gn.c.AnonymousClass4.c();
        int iC3 = gn.c.AnonymousClass4.c();
        e(gn.c.AnonymousClass4.c(), iC, iC2, -867342100, 867342100, new Object[]{file}, iC3);
    }

    public static void e() {
        f = new int[]{1351490864, 1434003277, 860004779, -1550620996, -2090300792, 1790637125, -56401843, -1982179874, -557355230, 45175027, 1755072303, 535761462, 118363148, -686916253, 2002423288, 475297979, -1677959347, 781432941};
    }

    private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
        File file = (File) objArr[0];
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<Long> it = i.iterator();
        while (it.hasNext()) {
            int i2 = f95850g + 51;
            m = i2 % 128;
            if (i2 % 2 != 0) {
                jSONArray.put(it.next().longValue());
                f95850g = (m + 117) % 128;
            } else {
                jSONArray.put(it.next().longValue());
                throw null;
            }
        }
        Object[] objArr2 = new Object[1];
        o(new int[]{-1631501488, 961216492}, 2 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
        jSONObject.put(((String) objArr2[0]).intern(), jSONArray);
        Object[] objArr3 = new Object[1];
        o(new int[]{2010647402, 1609476045}, (TypedValue.complexToFraction(0, SelfieScan.RECOGNITION_FAIL_RESULT, SelfieScan.RECOGNITION_FAIL_RESULT) > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (TypedValue.complexToFraction(0, SelfieScan.RECOGNITION_FAIL_RESULT, SelfieScan.RECOGNITION_FAIL_RESULT) == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)) + 2, objArr3);
        jSONObject.put(((String) objArr3[0]).intern(), h);
        Object[] objArr4 = new Object[1];
        o(new int[]{-1107106866, 1226862337}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1, objArr4);
        jSONObject.put(((String) objArr4[0]).intern(), j);
        Object[] objArr5 = new Object[1];
        o(new int[]{-1548508251, 1402365770}, (AudioTrack.getMaxVolume() > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (AudioTrack.getMaxVolume() == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)), objArr5);
        jSONObject.put(((String) objArr5[0]).intern(), bh.b(16, 128));
        bq.d(new File(file, a()), d(), jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        return null;
    }

    private static byte[] d() throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);
        Object[] objArr = new Object[1];
        o(new int[]{876755563, -2122466880, -1768931922, 1020059570, -666600220, 864178197}, 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        byte[] bArrA = bp.a(sb.toString());
        f95850g = (m + EnumC41897g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return bArrA;
    }
}