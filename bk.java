package com.facetec.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.facetec.sdk.FaceTecSDK;
import com.facetec.sdk.ay;
import com.facetec.sdk.cd;
import com.facetec.sdk.cv;
import com.facetec.sdk.gn;
import com.facetec.sdk.h;
import com.facetec.sdk.nf;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import com.incode.welcome_sdk.modules.SelfieScan;
import com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface;
import com.plaid.internal.EnumC41897g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jmrtd.PassportService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class bk {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static int A;
    private static long B;
    private static final int C = 0;
    private static final byte[] D = null;
    static String a;
    static FaceTecAuditTrailType b;
    static int c;
    static FaceTecAuditTrailImagesToReturn d;
    static String e;
    private static String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f95832g;

    @NonNull
    private static c h;
    static JSONObject i;
    private static String j;
    private static a k;
    private static Boolean l;
    private static boolean m;
    private static boolean n;
    private static String o;
    private static long p;
    private static /* synthetic */ boolean q;
    private static int r;
    private static SharedPreferences s;
    private static char[] t;
    private static int u;
    private static int v;
    private static int w;
    private static boolean x;
    private static boolean y;
    private static char[] z;

    /* JADX INFO: renamed from: com.facetec.sdk.bk$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;
        private static /* synthetic */ int[] c;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[cv.d.values().length];
            c = iArr;
            try {
                iArr[cv.d.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[cv.d.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[cv.d.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[c.values().length];
            e = iArr2;
            try {
                iArr2[c.VALIDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[c.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[c.NETWORK_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                e[c.VERSION_DEPRECATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                e[c.NEVER_VALIDATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[a.values().length];
            a = iArr3;
            try {
                iArr3[a.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[a.LICENSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[a.SESSION_TOKEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[a.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public enum a {
        NONE,
        NETWORK,
        LICENSE,
        SESSION_TOKEN
    }

    public enum c {
        NEVER_VALIDATED,
        VALIDATED,
        REJECTED,
        VERSION_DEPRECATED,
        NETWORK_ERROR
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r6, int r7, short r8) {
        /*
            int r7 = r7 + 99
            byte[] r0 = com.facetec.sdk.bk.$$c
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r8 = r8 * 3
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r7 = r7 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bk.$$g(int, int, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        l();
        m();
        v = 0;
        A = 1;
        u = 0;
        w = 1;
        h();
        j();
        ExpandableListView.getPackedPositionGroup(0L);
        A = (v + 115) % 128;
        q = true;
        a = null;
        b = FaceTecAuditTrailType.HEIGHT_640;
        d = FaceTecAuditTrailImagesToReturn.ONE;
        i = null;
        h = c.NEVER_VALIDATED;
        k = a.NONE;
        o = null;
        m = false;
        n = false;
        l = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void E(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = 118 - r7
            int r0 = 39 - r5
            byte[] r1 = com.facetec.sdk.bk.D
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r5 = 38 - r5
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r5
            r7 = r6
            r3 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
        L25:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-5)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bk.E(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void F(int r28, int r29, char r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bk.F(int, int, char, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void G(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.facetec.sdk.bk.$$a
            int r6 = r6 + 97
            int r5 = r5 * 2
            int r1 = r5 + 1
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r4 = r2
            r6 = r5
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r0[r7]
        L27:
            int r6 = r6 + r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bk.G(short, int, int, java.lang.Object[]):void");
    }

    private static void H(int[] iArr, String str, int i2, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] cArr;
        int i3;
        String str3 = str2;
        int i4 = 2;
        Object bytes = str3;
        if (str3 != null) {
            int i5 = $10 + 71;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
                throw null;
            }
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        if (str != null) {
            int i6 = $10 + 41;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr2 = charArray;
        hn hnVar = new hn();
        char[] cArr3 = t;
        Class cls = Integer.TYPE;
        int i7 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 61;
                $11 = i9 % 128;
                if (i9 % i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i8])};
                        Object objD = an.d(-814569747);
                        if (objD == null) {
                            i3 = i4;
                            byte b2 = (byte) i7;
                            objD = an.d(TextUtils.indexOf("", "", i7, i7) + 1803, (char) (View.MeasureSpec.getMode(i7) + 9692), (KeyEvent.getMaxKeyCode() >> 16) + 24, -1189907018, false, $$g(b2, (byte) (b2 | 19), b2), new Class[]{cls});
                        } else {
                            i3 = i4;
                        }
                        cArr4[i8] = ((Character) ((Method) objD).invoke(null, objArr2)).charValue();
                        i8--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    i3 = i4;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i8])};
                    Object objD2 = an.d(-814569747);
                    if (objD2 == null) {
                        byte b3 = (byte) 0;
                        objD2 = an.d(1803 - View.combineMeasuredStates(0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 9693), 24 - ExpandableListView.getPackedPositionGroup(0L), -1189907018, false, $$g(b3, (byte) (b3 | 19), b3), new Class[]{cls});
                    }
                    cArr4[i8] = ((Character) ((Method) objD2).invoke(null, objArr3)).charValue();
                    i8++;
                }
                i4 = i3;
                i7 = 0;
            }
            cArr3 = cArr4;
        }
        int i10 = i4;
        Object[] objArr4 = {Integer.valueOf(r)};
        Object objD3 = an.d(-1578986303);
        if (objD3 == null) {
            byte b4 = (byte) 0;
            objD3 = an.d((ViewConfiguration.getScrollFriction() > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (ViewConfiguration.getScrollFriction() == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)) + 2565, (char) (ViewConfiguration.getScrollBarSize() >> 8), Color.alpha(0) + 23, -679262310, false, $$g(b4, (byte) (b4 | 18), b4), new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) objD3).invoke(null, objArr4)).intValue();
        if (x) {
            int i11 = $10 + 89;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                int length2 = bArr.length;
                hnVar.b = length2;
                cArr = new char[length2];
                hnVar.c = 1;
            } else {
                int length3 = bArr.length;
                hnVar.b = length3;
                cArr = new char[length3];
                hnVar.c = 0;
            }
            while (true) {
                int i12 = hnVar.c;
                int i13 = hnVar.b;
                if (i12 >= i13) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i12] = (char) (cArr3[bArr[(i13 - 1) - i12] + i2] - iIntValue);
                Object[] objArr5 = new Object[i10];
                objArr5[1] = hnVar;
                objArr5[0] = hnVar;
                Object objD4 = an.d(717234065);
                if (objD4 == null) {
                    objD4 = an.d(View.resolveSizeAndState(0, 0, 0) + 1970, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 24 - (Process.myTid() >> 22), 1554107594, false, "x", new Class[]{Object.class, Object.class});
                }
                ((Method) objD4).invoke(null, objArr5);
                i10 = 2;
            }
        } else if (y) {
            int length4 = cArr2.length;
            hnVar.b = length4;
            char[] cArr5 = new char[length4];
            hnVar.c = 0;
            while (true) {
                int i14 = hnVar.c;
                int i15 = hnVar.b;
                if (i14 >= i15) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                $10 = ($11 + 21) % 128;
                cArr5[i14] = (char) (cArr3[cArr2[(i15 - 1) - i14] - i2] - iIntValue);
                Object[] objArr6 = {hnVar, hnVar};
                Object objD5 = an.d(717234065);
                if (objD5 == null) {
                    objD5 = an.d(1969 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.resolveSize(0, 0) + 24, 1554107594, false, "x", new Class[]{Object.class, Object.class});
                }
                ((Method) objD5).invoke(null, objArr6);
            }
        } else {
            int length5 = iArr.length;
            hnVar.b = length5;
            char[] cArr6 = new char[length5];
            hnVar.c = 0;
            while (true) {
                int i16 = hnVar.c;
                int i17 = hnVar.b;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i16] = (char) (cArr3[iArr[(i17 - 1) - i16] - i2] - iIntValue);
                    hnVar.c = i16 + 1;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void I(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 19
            int r6 = 20 - r6
            int r7 = r7 * 19
            int r7 = r7 + 4
            byte[] r0 = com.facetec.sdk.bk.$$d
            int r8 = r8 + 98
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2a
        L15:
            r3 = r8
            r8 = r7
            r7 = r3
            r3 = r2
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r8]
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-5)
            int r8 = r8 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bk.I(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void J(java.lang.String r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bk.J(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void a() throws Throwable {
        int i2;
        dz dzVar = new dz();
        try {
            byte[] bArr = D;
            Object[] objArr = new Object[1];
            E(bArr[4], (short) (C | EnumC41897g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE), bArr[158], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            E(bArr[158], (short) 865, bArr[39], objArr2);
            String str = (String) objArr2[0];
            Class cls2 = Integer.TYPE;
            int iIntValue = ((Integer) cls.getMethod(str, cls2).invoke(null, 0)).intValue() + EnumC41897g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE;
            Object[] objArr3 = new Object[1];
            E(bArr[121], (short) 668, bArr[158], objArr3);
            Class<?> cls3 = Class.forName((String) objArr3[0]);
            byte b2 = bArr[13];
            Object[] objArr4 = new Object[1];
            E(b2, (short) (b2 | ISOFileInfo.A0), bArr[88], objArr4);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr4[0], cls2, cls2).invoke(null, 0, 0)).intValue() + 1574;
            short s2 = (short) 140;
            Object[] objArr5 = new Object[1];
            E(bArr[270], s2, bArr[158], objArr5);
            Class<?> cls4 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            E(bArr[793], (short) 882, bArr[0], objArr6);
            Method method = cls4.getMethod((String) objArr6[0], cls2);
            Object[] objArr7 = new Object[1];
            F(iIntValue, iIntValue2, (char) ((Integer) method.invoke(null, 0)).intValue(), objArr7);
            String str2 = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            E(bArr[270], s2, bArr[158], objArr8);
            Class<?> cls5 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            E(bArr[342], (short) EnumC41897g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, bArr[58], objArr9);
            int iIntValue3 = (-16777215) - ((Integer) cls5.getMethod((String) objArr9[0], cls2, cls2, cls2).invoke(null, 0, 0, 0)).intValue();
            byte b3 = bArr[9];
            Object[] objArr10 = new Object[1];
            E(b3, (short) (b3 | 885), bArr[158], objArr10);
            Class<?> cls6 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            E(bArr[345], (short) 923, bArr[6], objArr11);
            int i3 = (((Double) cls6.getMethod((String) objArr11[0], cls2).invoke(null, 0)).doubleValue() > 0.0d ? 1 : (((Double) cls6.getMethod((String) objArr11[0], cls2).invoke(null, 0)).doubleValue() == 0.0d ? 0 : -1)) + 648;
            Object[] objArr12 = {0, 0};
            Object[] objArr13 = new Object[1];
            E(bArr[156], (short) 360, bArr[158], objArr13);
            Class<?> cls7 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            E(bArr[36], (short) 392, bArr[90], objArr14);
            char c2 = (char) ((((Long) cls7.getMethod((String) objArr14[0], cls2, cls2).invoke(null, objArr12)).longValue() > 0L ? 1 : (((Long) cls7.getMethod((String) objArr14[0], cls2, cls2).invoke(null, objArr12)).longValue() == 0L ? 0 : -1)) + 50561);
            Object[] objArr15 = new Object[1];
            F(iIntValue3, i3, c2, objArr15);
            Object[] objArr16 = {(String) objArr15[0]};
            char c3 = '2';
            byte b4 = bArr[50];
            short s3 = (short) EnumC41897g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE;
            Object[] objArr17 = new Object[1];
            E(b4, s3, bArr[345], objArr17);
            Class<?> cls8 = Class.forName((String) objArr17[0]);
            byte b5 = bArr[389];
            Object[] objArr18 = new Object[1];
            E(b5, (short) (b5 | 144), bArr[32], objArr18);
            String str3 = (String) objArr18[0];
            Object[] objArr19 = new Object[1];
            E(bArr[50], s3, bArr[345], objArr19);
            Object[] objArr20 = (Object[]) cls8.getMethod(str3, Class.forName((String) objArr19[0])).invoke(str2, objArr16);
            int[] iArr = new int[objArr20.length];
            int i4 = 0;
            while (i4 < objArr20.length) {
                Object[] objArr21 = {objArr20[i4]};
                byte[] bArr2 = D;
                byte b6 = bArr2[26];
                char c4 = c3;
                Object[] objArr22 = new Object[1];
                E(b6, (short) (b6 | ISOFileInfo.A0), bArr2[345], objArr22);
                Class<?> cls9 = Class.forName((String) objArr22[0]);
                byte b7 = bArr2[195];
                int i5 = C;
                Object[] objArr23 = new Object[1];
                E(b7, (short) (i5 - 2), bArr2[9], objArr23);
                String str4 = (String) objArr23[0];
                Object[] objArr24 = new Object[1];
                E(bArr2[c4], s3, bArr2[345], objArr24);
                Object objInvoke = cls9.getMethod(str4, Class.forName((String) objArr24[0])).invoke(null, objArr21);
                byte b8 = bArr2[26];
                Object[] objArr25 = new Object[1];
                E(b8, (short) (b8 | ISOFileInfo.A0), bArr2[345], objArr25);
                Class<?> cls10 = Class.forName((String) objArr25[0]);
                Object[] objArr26 = new Object[1];
                E(bArr2[84], (short) (i5 + 4), bArr2[289], objArr26);
                iArr[i4] = ((Integer) cls10.getMethod((String) objArr26[0], null).invoke(objInvoke, null)).intValue();
                i4++;
                c3 = c4;
            }
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (dzVar.d(iArr[i6])) {
                    case -29:
                        i6 = 46;
                        break;
                    case -28:
                        dzVar.d(38);
                        if (dzVar.e == 55) {
                            i7 = 30;
                        } else {
                            i6 = 1;
                        }
                        break;
                    case -27:
                        i6 = 19;
                        break;
                    case -26:
                        i6 = 45;
                        break;
                    case -25:
                        dzVar.d(5);
                        if (dzVar.e == 0) {
                            i7 = 44;
                        }
                        break;
                    case -24:
                        dzVar.a = 1;
                        dzVar.d(1);
                        try {
                            dzVar.d(2);
                            u = dzVar.e;
                        } catch (Throwable th2) {
                            th = th2;
                            if (i6 >= 31 || i6 >= 36) {
                                throw th;
                            }
                            dzVar.d = th;
                            dzVar.d(43);
                            i6 = 29;
                        }
                        break;
                    case TMXProfilingConnectionsInterface.TMXSocketResponseCode.ResponseIllegalArgumentException /* -23 */:
                        dzVar.a = w;
                        try {
                            dzVar.d(4);
                        } catch (Throwable th3) {
                            th = th3;
                            if (i6 >= 31) {
                            }
                            throw th;
                        }
                        break;
                    case TMXProfilingConnectionsInterface.TMXSocketResponseCode.ResponseIOException /* -22 */:
                        dzVar.d(29);
                        if (dzVar.e == 0) {
                            i7 = 35;
                        }
                        break;
                    case TMXProfilingConnectionsInterface.TMXSocketResponseCode.ResponseUnknownHost /* -21 */:
                        dzVar.d(8);
                        throw ((Throwable) dzVar.c);
                    case TMXProfilingConnectionsInterface.TMXSocketResponseCode.ResponseOk /* -20 */:
                        i6 = 47;
                        break;
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i6 = 49;
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        dzVar.d(29);
                        if (dzVar.e == 0) {
                            i7 = 28;
                        }
                        break;
                    case -17:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(2);
                        w = dzVar.e;
                        break;
                    case -16:
                        dzVar.a = u;
                        i2 = 4;
                        dzVar.d(i2);
                        break;
                    case -15:
                        i6 = 21;
                        break;
                    case -14:
                        return;
                    case -13:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(7);
                        dzVar.d = dj.d((Runnable) dzVar.c);
                        dzVar.d(6);
                        break;
                    case -12:
                        dzVar.d = new Runnable() { // from class: com.facetec.sdk.书城
                            @Override // java.lang.Runnable
                            public final void run() {
                                bk.t();
                            }
                        };
                        dzVar.d(6);
                        break;
                    case -11:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(7);
                        k = (a) dzVar.c;
                        break;
                    case -10:
                        dzVar.d = a.NONE;
                        dzVar.d(6);
                        break;
                    case -9:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(7);
                        a = (String) dzVar.c;
                        break;
                    case -8:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(7);
                        h = (c) dzVar.c;
                        break;
                    case -7:
                        dzVar.d = c.NEVER_VALIDATED;
                        dzVar.d(6);
                        break;
                    case -6:
                        i6 = 36;
                        break;
                    case -5:
                        i6 = 6;
                        break;
                    case -4:
                        i6 = 5;
                        break;
                    case -3:
                        dzVar.d(29);
                        i6 = dzVar.e != 0 ? i7 : 4;
                        break;
                    case -2:
                        dzVar.a = cv.b() ? 1 : 0;
                        i2 = 4;
                        dzVar.d(i2);
                        break;
                    case -1:
                        i6 = 16;
                        break;
                    default:
                        break;
                }
            }
            throw th;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause == null) {
                throw th4;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r0.isEmpty() != false) goto L17;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facetec.sdk.FaceTecSDKStatus b(@androidx.annotation.NonNull android.content.Context r7) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bk.b(android.content.Context):com.facetec.sdk.FaceTecSDKStatus");
    }

    public static boolean c() {
        int i2 = u;
        int i3 = i2 + 87;
        w = i3 % 128;
        boolean z2 = i3 % 2 == 0;
        int i4 = i2 + 89;
        w = i4 % 128;
        if (i4 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i7;
        int i9 = ~(i8 | i2 | i3);
        int i10 = (~((~i3) | i2)) | (~(i2 | i7));
        int i11 = i2 + i7 + i4 + (32217706 * i5) + (238734613 * i6);
        int i12 = i11 * i11;
        int i13 = (((-3446596) * i2) - 528416768) + (677943110 * i7) + (i9 * 1806788795) + ((-1806788795) * i8) + (1806788795 * i10) + ((-1810235392) * i4) + ((-154927104) * i5) + ((-131989504) * i6) + ((-1876361216) * i12);
        int i14 = ((i2 * 1127137324) - 440746823) + (i7 * 1127135646) + (i9 * 839) + (i8 * (-839)) + (i10 * 839) + (i4 * 1127136485) + (i5 * 976419026) + (i6 * 1106960329) + (i12 * 279773184);
        switch (i13 + (i14 * i14 * (-1943076864))) {
            case 1:
                return c(objArr);
            case 2:
                return b(objArr);
            case 3:
                return d(objArr);
            case 4:
                return a(objArr);
            case 5:
                final Context context = (Context) objArr[0];
                if (((Boolean) objArr[1]).booleanValue()) {
                    u = (w + 107) % 128;
                    dj.d(new Runnable() { // from class: com.facetec.sdk.书凤
                        @Override // java.lang.Runnable
                        public final void run() {
                            bk.s(context);
                        }
                    });
                    u = (w + 125) % 128;
                }
                dj.a(new Runnable() { // from class: com.facetec.sdk.书剑
                    @Override // java.lang.Runnable
                    public final void run() {
                        bk.q(context);
                    }
                });
                u = (w + 125) % 128;
                return null;
            case 6:
                Context context2 = (Context) objArr[0];
                int i15 = w + 27;
                u = i15 % 128;
                if (i15 % 2 != 0) {
                    SharedPreferences.Editor editorEdit = j(context2).edit();
                    editorEdit.putInt(ao.W, ((Integer) d(-2051648858, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{context2}, 2051648859)).intValue());
                    editorEdit.apply();
                } else {
                    SharedPreferences.Editor editorEdit2 = j(context2).edit();
                    editorEdit2.putInt(ao.W, ((Integer) d(-2051648858, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{context2}, 2051648859)).intValue() + 1);
                    editorEdit2.apply();
                }
                w = (u + 91) % 128;
                return null;
            case 7:
                int i16 = (w + 91) % 128;
                u = i16;
                boolean z2 = m;
                w = (i16 + 39) % 128;
                return Boolean.valueOf(z2);
            case 8:
                return i(objArr);
            default:
                return e(objArr);
        }
    }

    private static void e(@NonNull Context context, String str, String str2, FaceTecSDK.InitializeCallback initializeCallback) throws Throwable {
        dz dzVar = new dz(context, str, str2, initializeCallback);
        try {
            byte[] bArr = D;
            byte b2 = bArr[158];
            Object[] objArr = new Object[1];
            E(b2, (short) 89, b2, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            E(bArr[26], (short) 106, bArr[90], objArr2);
            int i2 = (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + EnumC41897g.SDK_ASSET_ICON_CLIPBOARD_VALUE;
            short s2 = (short) 427;
            Object[] objArr3 = new Object[1];
            E(bArr[270], s2, bArr[158], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            E(bArr[733], (short) (C | EnumC41897g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE), bArr[14], objArr4);
            int i3 = 1153 - (((Long) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1));
            Object[] objArr5 = new Object[1];
            E(bArr[270], s2, bArr[158], objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            E(bArr[13], (short) 448, bArr[270], new Object[1]);
            Object[] objArr6 = new Object[1];
            F(i2, i3, (char) ((((Long) cls3.getMethod((String) r15[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls3.getMethod((String) r15[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1), objArr6);
            String str3 = (String) objArr6[0];
            Object[] objArr7 = new Object[1];
            E(bArr[270], (short) EnumC41897g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE, bArr[158], objArr7);
            Class<?> cls4 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            E(bArr[85], (short) 572, bArr[90], objArr8);
            String str4 = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            E(bArr[270], (short) EnumC41897g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, bArr[345], objArr9);
            Class<?> cls5 = Class.forName((String) objArr9[0]);
            Class cls6 = Integer.TYPE;
            int iIntValue = 1 - ((Integer) cls4.getMethod(str4, cls5, cls6).invoke(null, "", 0)).intValue();
            Object[] objArr10 = new Object[1];
            E(bArr[88], bArr[342], bArr[158], objArr10);
            Class<?> cls7 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            E(bArr[270], (short) 585, bArr[90], objArr11);
            int i4 = (((Long) cls7.getMethod((String) objArr11[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls7.getMethod((String) objArr11[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 647;
            Object[] objArr12 = {0, 0, 0, 0};
            Object[] objArr13 = new Object[1];
            E(bArr[270], (short) 140, bArr[158], objArr13);
            Class<?> cls8 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            E(bArr[793], (short) 606, bArr[158], objArr14);
            char cIntValue = (char) (50560 - ((Integer) cls8.getMethod((String) objArr14[0], cls6, cls6, cls6, cls6).invoke(null, objArr12)).intValue());
            Object[] objArr15 = new Object[1];
            F(iIntValue, i4, cIntValue, objArr15);
            Object[] objArr16 = {(String) objArr15[0]};
            int i5 = 50;
            byte b3 = bArr[50];
            short s3 = (short) EnumC41897g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE;
            Object[] objArr17 = new Object[1];
            E(b3, s3, bArr[345], objArr17);
            Class<?> cls9 = Class.forName((String) objArr17[0]);
            char c2 = 389;
            byte b4 = bArr[389];
            Object[] objArr18 = new Object[1];
            E(b4, (short) (b4 | 144), bArr[32], objArr18);
            String str5 = (String) objArr18[0];
            Object[] objArr19 = new Object[1];
            E(bArr[50], s3, bArr[345], objArr19);
            Object[] objArr20 = (Object[]) cls9.getMethod(str5, Class.forName((String) objArr19[0])).invoke(str3, objArr16);
            int[] iArr = new int[objArr20.length];
            int i6 = 0;
            while (i6 < objArr20.length) {
                Object[] objArr21 = {objArr20[i6]};
                byte[] bArr2 = D;
                byte b5 = bArr2[26];
                int i7 = i5;
                Object[] objArr22 = new Object[1];
                E(b5, (short) (b5 | ISOFileInfo.A0), bArr2[345], objArr22);
                Class<?> cls10 = Class.forName((String) objArr22[0]);
                byte b6 = bArr2[195];
                int i8 = C;
                char c3 = c2;
                Object[] objArr23 = new Object[1];
                E(b6, (short) (i8 - 2), bArr2[9], objArr23);
                String str6 = (String) objArr23[0];
                Object[] objArr24 = new Object[1];
                E(bArr2[i7], s3, bArr2[345], objArr24);
                Object objInvoke = cls10.getMethod(str6, Class.forName((String) objArr24[0])).invoke(null, objArr21);
                byte b7 = bArr2[26];
                Object[] objArr25 = new Object[1];
                E(b7, (short) (b7 | ISOFileInfo.A0), bArr2[345], objArr25);
                Class<?> cls11 = Class.forName((String) objArr25[0]);
                Object[] objArr26 = new Object[1];
                E(bArr2[84], (short) (i8 + 4), bArr2[289], objArr26);
                iArr[i6] = ((Integer) cls11.getMethod((String) objArr26[0], null).invoke(objInvoke, null)).intValue();
                i6++;
                i5 = i7;
                c2 = c3;
            }
            int i9 = i5;
            char c4 = c2;
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (dzVar.d(iArr[i10])) {
                    case -30:
                        i10 = 56;
                        break;
                    case -29:
                        dzVar.d(38);
                        int i12 = dzVar.e;
                        if (i12 != 34 && i12 == 38) {
                            i11 = 52;
                        } else {
                            i10 = 29;
                        }
                        break;
                    case -28:
                        dzVar.d(8);
                        throw ((Throwable) dzVar.c);
                    case -27:
                        i10 = 57;
                        break;
                    case -26:
                        i10 = 59;
                        break;
                    case -25:
                        dzVar.d(29);
                        i10 = dzVar.e != 0 ? i11 : i9;
                        break;
                    case -24:
                        dzVar.a = 1;
                        dzVar.d(1);
                        try {
                            dzVar.d(2);
                            w = dzVar.e;
                        } catch (Throwable th2) {
                            th = th2;
                            if (i10 >= 53 || i10 >= 56) {
                                throw th;
                            }
                            dzVar.d = th;
                            dzVar.d(43);
                            i10 = 51;
                        }
                        break;
                    case TMXProfilingConnectionsInterface.TMXSocketResponseCode.ResponseIllegalArgumentException /* -23 */:
                        dzVar.a = u;
                        try {
                            dzVar.d(4);
                        } catch (Throwable th3) {
                            th = th3;
                            if (i10 >= 53) {
                            }
                            throw th;
                        }
                        break;
                    case TMXProfilingConnectionsInterface.TMXSocketResponseCode.ResponseIOException /* -22 */:
                        i10 = 1;
                        break;
                    case TMXProfilingConnectionsInterface.TMXSocketResponseCode.ResponseUnknownHost /* -21 */:
                        i10 = 41;
                        break;
                    case TMXProfilingConnectionsInterface.TMXSocketResponseCode.ResponseOk /* -20 */:
                        dzVar.d(5);
                        if (dzVar.e == 0) {
                            i11 = 40;
                        }
                        break;
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(2);
                        u = dzVar.e;
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        dzVar.a = w;
                        dzVar.d(4);
                        break;
                    case -17:
                        i10 = 31;
                        break;
                    case -16:
                        return;
                    case -15:
                        dzVar.d = c.REJECTED;
                        dzVar.d(6);
                        break;
                    case -14:
                        i10 = 42;
                        break;
                    case -13:
                        dzVar.a = 3;
                        dzVar.d(1);
                        dzVar.d(7);
                        Context context2 = (Context) dzVar.c;
                        dzVar.d(7);
                        FaceTecSDK.InitializeCallback initializeCallback2 = (FaceTecSDK.InitializeCallback) dzVar.c;
                        dzVar.d(2);
                        d(674985234, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{context2, initializeCallback2, Boolean.valueOf(dzVar.e != 0)}, -674985234);
                        break;
                    case -12:
                        dzVar.a = 2;
                        dzVar.d(1);
                        dzVar.d(7);
                        Context context3 = (Context) dzVar.c;
                        dzVar.d(7);
                        h.c(context3, (h.b) dzVar.c);
                        break;
                    case -11:
                        dzVar.a = 2;
                        dzVar.d(1);
                        dzVar.d(7);
                        h.b bVar = (h.b) dzVar.c;
                        dzVar.d(7);
                        bVar.e = (Boolean) dzVar.c;
                        break;
                    case -10:
                        byte[] bArr3 = D;
                        Object[] objArr27 = new Object[1];
                        E(bArr3[26], (short) 609, bArr3[345], objArr27);
                        Class<?> cls12 = Class.forName((String) objArr27[0]);
                        Object[] objArr28 = new Object[1];
                        E(bArr3[c4], (short) 625, bArr3[129], objArr28);
                        dzVar.d = cls12.getField((String) objArr28[0]).get(null);
                        dzVar.d(6);
                        break;
                    case -9:
                        dzVar.d = new h.b();
                        dzVar.d(6);
                        break;
                    case -8:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(7);
                        h = (c) dzVar.c;
                        break;
                    case -7:
                        dzVar.d = c.VALIDATED;
                        dzVar.d(6);
                        break;
                    case -6:
                        i10 = 20;
                        break;
                    case -5:
                        i10 = 8;
                        break;
                    case -4:
                        dzVar.d(11);
                        if (dzVar.e == 0) {
                            i10 = 7;
                        }
                        break;
                    case -3:
                        dzVar.d = cd.b.VALIDATED;
                        dzVar.d(6);
                        break;
                    case -2:
                        dzVar.a = 3;
                        dzVar.d(1);
                        dzVar.d(7);
                        Context context4 = (Context) dzVar.c;
                        dzVar.d(7);
                        String str7 = (String) dzVar.c;
                        dzVar.d(7);
                        dzVar.d = cd.c(context4, str7, (String) dzVar.c);
                        dzVar.d(6);
                        break;
                    case -1:
                        i10 = 26;
                        break;
                    default:
                        break;
                }
            }
            throw th;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause == null) {
                throw th4;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean f(@androidx.annotation.NonNull android.content.Context r4) {
        /*
            int r0 = com.facetec.sdk.bk.u
            int r0 = r0 + 13
            int r1 = r0 % 128
            com.facetec.sdk.bk.w = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = "org.chromium.arc"
            r3 = 0
            if (r0 != 0) goto L1e
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            boolean r0 = r0.hasSystemFeature(r2)
            r2 = 16
            int r2 = r2 / r1
            if (r0 != 0) goto L57
            goto L28
        L1e:
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            boolean r0 = r0.hasSystemFeature(r2)
            if (r0 != 0) goto L57
        L28:
            int r0 = com.facetec.sdk.bk.w
            int r0 = r0 + 107
            int r2 = r0 % 128
            com.facetec.sdk.bk.u = r2
            int r0 = r0 % 2
            java.lang.String r2 = "org.chromium.arc.device_management"
            if (r0 != 0) goto L4f
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            boolean r4 = r4.hasSystemFeature(r2)
            if (r4 == 0) goto L41
            goto L57
        L41:
            int r4 = com.facetec.sdk.bk.u
            int r4 = r4 + 37
            int r0 = r4 % 128
            com.facetec.sdk.bk.w = r0
            int r4 = r4 % 2
            if (r4 == 0) goto L4e
            return r1
        L4e:
            throw r3
        L4f:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r4.hasSystemFeature(r2)
            throw r3
        L57:
            int r4 = com.facetec.sdk.bk.w
            int r4 = r4 + 109
            int r0 = r4 % 128
            com.facetec.sdk.bk.u = r0
            int r4 = r4 % 2
            if (r4 != 0) goto L65
            r4 = 1
            return r4
        L65:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bk.f(android.content.Context):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:4:0x0003, B:6:0x0007, B:25:0x0039, B:26:0x0041, B:9:0x0010, B:11:0x0017, B:13:0x0023, B:19:0x002e, B:22:0x0031, B:27:0x0047, B:15:0x0029), top: B:34:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized boolean g(@androidx.annotation.NonNull android.content.Context r5) {
        /*
            java.lang.Class<com.facetec.sdk.bk> r0 = com.facetec.sdk.bk.class
            monitor-enter(r0)
            java.lang.Boolean r1 = com.facetec.sdk.bk.l     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L47
            boolean r1 = k()     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L10
            goto L39
        L10:
            boolean r1 = k(r5)     // Catch: java.lang.Throwable -> L2f
            r1 = r1 ^ r3
            if (r1 == r3) goto L39
            int r1 = com.facetec.sdk.bk.w     // Catch: java.lang.Throwable -> L2f
            int r1 = r1 + 15
            int r4 = r1 % 128
            com.facetec.sdk.bk.u = r4     // Catch: java.lang.Throwable -> L2f
            int r1 = r1 % 2
            if (r1 == 0) goto L31
            boolean r5 = f(r5)     // Catch: java.lang.Throwable -> L2f
            r1 = 10
            int r1 = r1 / r2
            if (r5 != 0) goto L39
            goto L37
        L2d:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L2f
        L2f:
            r5 = move-exception
            goto L4f
        L31:
            boolean r5 = f(r5)     // Catch: java.lang.Throwable -> L2f
            if (r5 != 0) goto L39
        L37:
            r2 = r3
            goto L41
        L39:
            int r5 = com.facetec.sdk.bk.w     // Catch: java.lang.Throwable -> L2f
            int r5 = r5 + 63
            int r5 = r5 % 128
            com.facetec.sdk.bk.u = r5     // Catch: java.lang.Throwable -> L2f
        L41:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L2f
            com.facetec.sdk.bk.l = r5     // Catch: java.lang.Throwable -> L2f
        L47:
            java.lang.Boolean r5 = com.facetec.sdk.bk.l     // Catch: java.lang.Throwable -> L2f
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            return r5
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bk.g(android.content.Context):boolean");
    }

    private static void h(@NonNull Context context) throws Throwable {
        int i2;
        int i3;
        Object objA;
        Object objB;
        Method method;
        dz dzVar = new dz(context);
        try {
            byte[] bArr = D;
            Object[] objArr = new Object[1];
            E(bArr[88], bArr[342], bArr[158], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            E(bArr[270], (short) 585, bArr[90], objArr2);
            int i4 = 217 - (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1));
            byte b2 = bArr[158];
            Object[] objArr3 = new Object[1];
            E(b2, (short) 89, b2, objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            E(bArr[26], (short) 629, bArr[90], objArr4);
            String str = (String) objArr4[0];
            Class cls3 = Integer.TYPE;
            int iIntValue = ((((Integer) cls2.getMethod(str, cls3).invoke(null, 0)).intValue() + 20) >> 6) + 1358;
            Object[] objArr5 = new Object[1];
            E(bArr[88], bArr[342], bArr[158], objArr5);
            Class<?> cls4 = Class.forName((String) objArr5[0]);
            byte b3 = bArr[90];
            Object[] objArr6 = new Object[1];
            E(b3, (short) 645, b3, objArr6);
            Object[] objArr7 = new Object[1];
            F(i4, iIntValue, (char) ((((Integer) cls4.getMethod((String) objArr6[0], null).invoke(null, null)).intValue() >> 16) + 37971), objArr7);
            String str2 = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            E(bArr[121], (short) 668, bArr[158], objArr8);
            Class<?> cls5 = Class.forName((String) objArr8[0]);
            byte b4 = bArr[13];
            Object[] objArr9 = new Object[1];
            E(b4, (short) (b4 | ISOFileInfo.A0), bArr[88], objArr9);
            int iIntValue2 = 1 - ((Integer) cls5.getMethod((String) objArr9[0], cls3, cls3).invoke(null, 0, 0)).intValue();
            Object[] objArr10 = new Object[1];
            E(bArr[37], (short) 710, bArr[158], objArr10);
            Class<?> cls6 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            E(bArr[85], (short) 743, bArr[58], objArr11);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr11[0], cls3, cls3).invoke(null, 0, 0)).intValue() + 648;
            Object[] objArr12 = new Object[1];
            E(bArr[4], (short) (C | EnumC41897g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE), bArr[158], objArr12);
            Class<?> cls7 = Class.forName((String) objArr12[0]);
            byte b5 = bArr[90];
            Object[] objArr13 = new Object[1];
            E(b5, (short) 756, b5, objArr13);
            Object[] objArr14 = new Object[1];
            F(iIntValue2, iIntValue3, (char) (((byte) ((Integer) cls7.getMethod((String) objArr13[0], null).invoke(null, null)).intValue()) + ISOFileInfo.DATA_BYTES2), objArr14);
            Object[] objArr15 = {(String) objArr14[0]};
            byte b6 = bArr[50];
            short s2 = (short) EnumC41897g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE;
            Object[] objArr16 = new Object[1];
            E(b6, s2, bArr[345], objArr16);
            Class<?> cls8 = Class.forName((String) objArr16[0]);
            byte b7 = bArr[389];
            Object[] objArr17 = new Object[1];
            E(b7, (short) (b7 | 144), bArr[32], objArr17);
            String str3 = (String) objArr17[0];
            Object[] objArr18 = new Object[1];
            E(bArr[50], s2, bArr[345], objArr18);
            Object[] objArr19 = (Object[]) cls8.getMethod(str3, Class.forName((String) objArr18[0])).invoke(str2, objArr15);
            int[] iArr = new int[objArr19.length];
            for (int i5 = 0; i5 < objArr19.length; i5++) {
                Object[] objArr20 = {objArr19[i5]};
                byte[] bArr2 = D;
                byte b8 = bArr2[26];
                Object[] objArr21 = new Object[1];
                E(b8, (short) (b8 | ISOFileInfo.A0), bArr2[345], objArr21);
                Class<?> cls9 = Class.forName((String) objArr21[0]);
                byte b9 = bArr2[195];
                int i6 = C;
                Object[] objArr22 = new Object[1];
                E(b9, (short) (i6 - 2), bArr2[9], objArr22);
                String str4 = (String) objArr22[0];
                Object[] objArr23 = new Object[1];
                E(bArr2[50], s2, bArr2[345], objArr23);
                Object objInvoke = cls9.getMethod(str4, Class.forName((String) objArr23[0])).invoke(null, objArr20);
                byte b10 = bArr2[26];
                Object[] objArr24 = new Object[1];
                E(b10, (short) (b10 | ISOFileInfo.A0), bArr2[345], objArr24);
                Class<?> cls10 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                E(bArr2[84], (short) (i6 + 4), bArr2[289], objArr25);
                iArr[i5] = ((Integer) cls10.getMethod((String) objArr25[0], null).invoke(objInvoke, null)).intValue();
            }
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                switch (dzVar.d(iArr[i7])) {
                    case -36:
                        i7 = 58;
                        break;
                    case -35:
                        dzVar.d(38);
                        int i9 = dzVar.e;
                        i8 = (i9 == 17 || i9 != 23) ? 49 : 13;
                        break;
                    case -34:
                        i8 = 5;
                        break;
                    case -33:
                        i8 = 57;
                        break;
                    case -32:
                        dzVar.d(5);
                        if (dzVar.e == 0) {
                            i8 = 56;
                        }
                        break;
                    case -31:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(2);
                        u = dzVar.e;
                        break;
                    case -30:
                        i2 = w;
                        dzVar.a = i2;
                        dzVar.d(4);
                        break;
                    case -29:
                        i8 = 36;
                        break;
                    case -28:
                        i8 = 48;
                        break;
                    case -27:
                        dzVar.d(29);
                        if (dzVar.e == 0) {
                            i8 = 47;
                        }
                        break;
                    case -26:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(2);
                        w = dzVar.e;
                        break;
                    case -25:
                        i2 = u;
                        dzVar.a = i2;
                        dzVar.d(4);
                        break;
                    case -24:
                        return;
                    case TMXProfilingConnectionsInterface.TMXSocketResponseCode.ResponseIllegalArgumentException /* -23 */:
                        i7 = 1;
                        break;
                    case TMXProfilingConnectionsInterface.TMXSocketResponseCode.ResponseIOException /* -22 */:
                        i8 = 38;
                        break;
                    case TMXProfilingConnectionsInterface.TMXSocketResponseCode.ResponseUnknownHost /* -21 */:
                        i3 = 6;
                        objA = new Runnable() { // from class: com.facetec.sdk.书兵
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                bk.n();
                            }
                        };
                        dzVar.d = objA;
                        dzVar.d(i3);
                        break;
                    case TMXProfilingConnectionsInterface.TMXSocketResponseCode.ResponseOk /* -20 */:
                        i3 = 6;
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(7);
                        objA = dj.a((Runnable) dzVar.c);
                        dzVar.d = objA;
                        dzVar.d(i3);
                        break;
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i3 = 6;
                        objA = new Runnable() { // from class: com.facetec.sdk.书仙
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                bk.o();
                            }
                        };
                        dzVar.d = objA;
                        dzVar.d(i3);
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i3 = 6;
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(7);
                        objA = d((Context) dzVar.c);
                        dzVar.d = objA;
                        dzVar.d(i3);
                        break;
                    case -17:
                        dzVar.a = 2;
                        dzVar.d(1);
                        dzVar.d(7);
                        Context context2 = (Context) dzVar.c;
                        dzVar.d(2);
                        objB = b(context2, dzVar.e != 0);
                        dzVar.d = objB;
                        i3 = 6;
                        dzVar.d(i3);
                        break;
                    case -16:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(7);
                        objB = j((Context) dzVar.c);
                        dzVar.d = objB;
                        i3 = 6;
                        dzVar.d(i3);
                        break;
                    case -15:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(7);
                        av.a((Context) dzVar.c);
                        break;
                    case -14:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(7);
                        ce.d((Context) dzVar.c);
                        break;
                    case -13:
                        dzVar.d(8);
                        throw ((Throwable) dzVar.c);
                    case -12:
                        byte[] bArr3 = D;
                        Object[] objArr26 = new Object[1];
                        E(bArr3[90], (short) 842, bArr3[345], objArr26);
                        objB = Class.forName((String) objArr26[0]).getDeclaredConstructor(null).newInstance(null);
                        dzVar.d = objB;
                        i3 = 6;
                        dzVar.d(i3);
                        break;
                    case -11:
                        i7 = 13;
                        break;
                    case -10:
                        i7 = 11;
                        break;
                    case -9:
                        dzVar.d(11);
                        i7 = dzVar.e == 0 ? 10 : i8;
                        break;
                    case -8:
                        byte[] bArr4 = D;
                        Object[] objArr27 = new Object[1];
                        E(bArr4[50], (short) 815, bArr4[345], objArr27);
                        Class<?> cls11 = Class.forName((String) objArr27[0]);
                        byte b11 = bArr4[87];
                        Object[] objArr28 = new Object[1];
                        E(b11, (short) (b11 | ISO7816.INS_CHANGE_CHV), bArr4[6], objArr28);
                        method = cls11.getMethod((String) objArr28[0], null);
                        objB = method.invoke(null, null);
                        dzVar.d = objB;
                        i3 = 6;
                        dzVar.d(i3);
                        break;
                    case -7:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(7);
                        Object obj = dzVar.c;
                        byte[] bArr5 = D;
                        Object[] objArr29 = new Object[1];
                        E(bArr5[26], (short) 779, bArr5[158], objArr29);
                        Class<?> cls12 = Class.forName((String) objArr29[0]);
                        Object[] objArr30 = new Object[1];
                        E(bArr5[428], (short) 807, bArr5[90], objArr30);
                        objB = cls12.getMethod((String) objArr30[0], null).invoke(obj, null);
                        dzVar.d = objB;
                        i3 = 6;
                        dzVar.d(i3);
                        break;
                    case -6:
                        byte[] bArr6 = D;
                        Object[] objArr31 = new Object[1];
                        E(bArr6[26], (short) 779, bArr6[158], objArr31);
                        Class<?> cls13 = Class.forName((String) objArr31[0]);
                        byte b12 = bArr6[87];
                        Object[] objArr32 = new Object[1];
                        E(b12, (short) (b12 | 769), bArr6[90], objArr32);
                        method = cls13.getMethod((String) objArr32[0], null);
                        objB = method.invoke(null, null);
                        dzVar.d = objB;
                        i3 = 6;
                        dzVar.d(i3);
                        break;
                    case -5:
                        i7 = 59;
                        break;
                    case -4:
                        i7 = 61;
                        break;
                    case -3:
                        dzVar.d(29);
                        if (dzVar.e == 0) {
                            i7 = 4;
                        }
                        break;
                    case -2:
                        dzVar.a = q ? 1 : 0;
                        dzVar.d(4);
                        break;
                    case -1:
                        i7 = 32;
                        break;
                    default:
                        break;
                }
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static /* synthetic */ Object i(Object[] objArr) {
        String str = (String) objArr[0];
        u = (w + 75) % 128;
        if (str != null) {
            try {
                o = str.trim();
                u = (w + 43) % 128;
                return Boolean.TRUE;
            } catch (Exception unused) {
            }
        }
        return Boolean.FALSE;
    }

    public static void init$0() {
        $$a = new byte[]{46, ISOFileInfo.A1, PassportService.SFI_DG11, -87};
        $$b = 75;
    }

    public static void init$1() {
        $$d = new byte[]{120, 65, 99, 57, -17, -3, 58, -61, 0, -7, -7, -20, 10, -3, ISO7816.INS_DECREASE, ISO7816.INS_READ_RECORD_STAMPED, 10, -12, 56, -61, -18, 74, -69};
        $$e = 31;
    }

    public static void init$2() {
        $$c = new byte[]{89, 120, -98, -110};
        $$f = 49;
    }

    public static SharedPreferences j(Context context) {
        int i2 = (w + 15) % 128;
        u = i2;
        if (s == null) {
            w = (i2 + 63) % 128;
            if ((!q) && Looper.myLooper() == Looper.getMainLooper()) {
                throw new AssertionError();
            }
            s = context.getSharedPreferences("zoom.sdk.settings", 0);
        }
        return s;
    }

    private static boolean k() {
        w = (u + 51) % 128;
        if (!Build.CPU_ABI.toLowerCase().startsWith("arm")) {
            return false;
        }
        int i2 = u + 63;
        w = i2 % 128;
        return i2 % 2 != 0;
    }

    private static void l(Context context) {
        d(1869115061, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{context}, -1869115055);
    }

    private static void m(Context context) throws Throwable {
        try {
            if (h.a(context) != h.a.New) {
                String strN = n(context);
                f95832g = strN;
                f = UUID.nameUUIDFromBytes(strN.getBytes()).toString();
            } else {
                w = (u + 7) % 128;
                String strO = o(context);
                f = strO;
                f95832g = strO;
                w = (u + 29) % 128;
            }
        } catch (Exception e2) {
            t.d(context, com.facetec.sdk.c.UNEXPECTED_NULL, e2.getMessage(), e2);
            String strB = bh.b(15, 0);
            f = strB;
            f95832g = strB;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n() throws Throwable {
        int i2;
        int i3;
        byte b2;
        char c2;
        Object[] objArr;
        char c3;
        Object objD = an.d(-1397726040);
        if (objD == null) {
            int fadingEdgeLength = 711 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            char defaultSize = (char) (49308 - View.getDefaultSize(0, 0));
            int iArgb = 24 - Color.argb(0, 0, 0, 0);
            byte b3 = (byte) 0;
            byte b4 = (byte) (b3 + 2);
            Object[] objArr2 = new Object[1];
            G(b3, b4, (byte) (b4 - 3), objArr2);
            objD = an.d(fadingEdgeLength, defaultSize, iArgb, -623790093, false, (String) objArr2[0], null);
        }
        long j2 = ((Field) objD).getLong(null);
        Object[] objArr3 = new Object[1];
        H(null, null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0091\u0090\u0085\u008f\u008e\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        H(null, null, View.resolveSize(0, 0) + 127, "\u008c\u008d\u0086\u008b\u008f\u0081\u008c\u0093\u0083\u008c\u0088\u0092\u0081\u008f\u008c", objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], null).invoke(null, null)).longValue();
        Object objD2 = an.d(-1398649561);
        if (objD2 == null) {
            int i4 = 711 - (TypedValue.complexToFraction(0, SelfieScan.RECOGNITION_FAIL_RESULT, SelfieScan.RECOGNITION_FAIL_RESULT) > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (TypedValue.complexToFraction(0, SelfieScan.RECOGNITION_FAIL_RESULT, SelfieScan.RECOGNITION_FAIL_RESULT) == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1));
            char cRed = (char) (49308 - Color.red(0));
            int pressedStateDuration = 24 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte b5 = (byte) 0;
            i2 = -1397726040;
            byte b6 = (byte) (b5 + 1);
            i3 = -1398649561;
            Object[] objArr5 = new Object[1];
            G(b5, b6, (byte) (-b6), objArr5);
            objD2 = an.d(i4, cRed, pressedStateDuration, -624714116, false, (String) objArr5[0], null);
        } else {
            i2 = -1397726040;
            i3 = -1398649561;
        }
        if (j2 == ((jLongValue - ((((Field) objD2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objD3 = an.d(-1399573082);
            if (objD3 == null) {
                int i5 = 712 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                char c4 = (char) (49307 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int maximumFlingVelocity = 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte b7 = (byte) 0;
                byte b8 = b7;
                Object[] objArr6 = new Object[1];
                G(b7, b8, (byte) (b8 - 1), objArr6);
                objD3 = an.d(i5, c4, maximumFlingVelocity, -621418755, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objD3).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i6 = ((int[]) objArr7[1])[0];
            int i7 = ((int[]) objArr7[2])[0];
            String[] strArr = (String[]) objArr7[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i8 = (((~(elapsedCpuTime | 977832810)) | 68954548) * 56) + 1017296470 + (((~((~elapsedCpuTime) | 68954548)) | 977832810) * 56) + 1799154601;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
            u = (w + 101) % 128;
            c2 = 3;
            c3 = 2;
        } else {
            try {
                Object[] objArr8 = {-1876304941};
                Object objD4 = an.d(1683332522);
                if (objD4 == null) {
                    objD4 = an.d(TextUtils.getCapsMode("", 0, 0) + 830, (char) View.combineMeasuredStates(0, 0), 16777240 + Color.rgb(0, 0, 0), 305417969, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr9 = {0, 0, 1799154601, ((Constructor) objD4).newInstance(objArr8), Boolean.FALSE};
                Object objD5 = an.d(1794077343);
                if (objD5 == null) {
                    int i11 = (TypedValue.complexToFraction(0, SelfieScan.RECOGNITION_FAIL_RESULT, SelfieScan.RECOGNITION_FAIL_RESULT) > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (TypedValue.complexToFraction(0, SelfieScan.RECOGNITION_FAIL_RESULT, SelfieScan.RECOGNITION_FAIL_RESULT) == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)) + 711;
                    char gidForName = (char) (49307 - Process.getGidForName(""));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25;
                    byte b9 = (byte) 0;
                    byte b10 = (byte) (b9 + 1);
                    b2 = 49307;
                    c2 = 3;
                    Object[] objArr10 = new Object[1];
                    G(b9, b10, (byte) (-b10), objArr10);
                    String str = (String) objArr10[0];
                    Class cls2 = Integer.TYPE;
                    objD5 = an.d(i11, gidForName, iIndexOf, 479109572, false, str, new Class[]{cls2, cls2, cls2, (Class) an.b(TextUtils.indexOf("", "", 0) + 799, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 31 - Drawable.resolveOpacity(0, 0)), Boolean.TYPE});
                } else {
                    b2 = 49307;
                    c2 = 3;
                }
                objArr = (Object[]) ((Method) objD5).invoke(null, objArr9);
                Object objD6 = an.d(-1399573082);
                if (objD6 == null) {
                    int fadingEdgeLength2 = 711 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    char c5 = (char) (49309 - (ViewConfiguration.getScrollFriction() > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (ViewConfiguration.getScrollFriction() == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)));
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24;
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr11 = new Object[1];
                    G(b11, b12, (byte) (b12 - 1), objArr11);
                    objD6 = an.d(fadingEdgeLength2, c5, keyRepeatTimeout, -621418755, false, (String) objArr11[0], null);
                }
                ((Field) objD6).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    H(null, null, 127 - Gravity.getAbsoluteGravity(0, 0), "\u0091\u0090\u0085\u008f\u008e\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    H(null, null, (PointF.length(SelfieScan.RECOGNITION_FAIL_RESULT, SelfieScan.RECOGNITION_FAIL_RESULT) > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (PointF.length(SelfieScan.RECOGNITION_FAIL_RESULT, SelfieScan.RECOGNITION_FAIL_RESULT) == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)) + 127, "\u008c\u008d\u0086\u008b\u008f\u0081\u008c\u0093\u0083\u008c\u0088\u0092\u0081\u008f\u008c", objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], null).invoke(null, null)).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objD7 = an.d(i3);
                    if (objD7 == null) {
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 711;
                        char modifierMetaStateMask = (char) (b2 - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 24;
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 + 1);
                        c3 = 2;
                        Object[] objArr14 = new Object[1];
                        G(b13, b14, (byte) (-b14), objArr14);
                        objD7 = an.d(iResolveOpacity, modifierMetaStateMask, touchSlop, -624714116, false, (String) objArr14[0], null);
                    } else {
                        c3 = 2;
                    }
                    ((Field) objD7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objD8 = an.d(i2);
                    if (objD8 == null) {
                        int iIndexOf2 = 710 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16826524);
                        int windowTouchSlop = 24 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 2);
                        Object[] objArr15 = new Object[1];
                        G(b15, b16, (byte) (b16 - 3), objArr15);
                        objD8 = an.d(iIndexOf2, cRgb, windowTouchSlop, -623790093, false, (String) objArr15[0], null);
                    }
                    ((Field) objD8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i12 = ((int[]) objArr[c3])[0];
        int i13 = ((int[]) objArr[1])[0];
        if (i13 == i12) {
            u = (w + 51) % 128;
            Object[] objArr16 = new Object[4];
            objArr16[1] = new int[]{i};
            objArr16[c3] = new int[]{i};
            objArr16[c2] = new int[1];
            int i14 = ((int[]) objArr[c2])[0];
            int i15 = ((int[]) objArr[1])[0];
            int i16 = ((int[]) objArr[c3])[0];
            objArr16[0] = (String[]) objArr[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i17 = 1938184446 + (((~(112429365 | iUptimeMillis)) | 934357993) * 672);
            int i18 = ~iUptimeMillis;
            int i19 = i14 + i17 + (((~(iUptimeMillis | 934357993)) | (~((-112429366) | i18))) * (-672)) + (((~((-934357994) | i18)) | 822092488) * 672);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr16[c2])[0] = i21 ^ (i21 << 5);
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr2 = (String[]) objArr[0];
        if (strArr2 != null) {
            int i22 = w + EnumC41897g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE;
            u = i22 % 128;
            for (int i23 = i22 % 2 != 0 ? 1 : 0; i23 < strArr2.length; i23++) {
                arrayList.add(strArr2[i23]);
            }
        }
        int[] iArr = new int[i13];
        int i24 = i13 - 1;
        iArr[i24] = 1;
        Toast.makeText((Context) null, iArr[((i13 * i24) % 2) - 1], 1).show();
        Object[] objArr17 = new Object[4];
        objArr17[1] = new int[]{i};
        objArr17[c3] = new int[]{i};
        objArr17[c2] = new int[1];
        int i25 = ((int[]) objArr[c2])[0];
        int i26 = ((int[]) objArr[1])[0];
        int i27 = ((int[]) objArr[c3])[0];
        objArr17[0] = (String[]) objArr[0];
        int iMyUid = Process.myUid();
        int i28 = ~iMyUid;
        int i29 = i25 + 990898886 + (((~(1028947230 | i28)) | 17840128) * EnumC41897g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + (((~(i28 | 357578780)) | 689208578) * (-440)) + ((iMyUid | 1028947230) * EnumC41897g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
        int i30 = (i29 << 13) ^ i29;
        int i31 = i30 ^ (i30 >>> 17);
        ((int[]) objArr17[c2])[0] = i31 ^ (i31 << 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o() throws Throwable {
        int i2;
        int i3;
        Object[] objArr;
        Object objD = an.d(-2104069968);
        if (objD == null) {
            int i4 = (TypedValue.complexToFloat(0) > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (TypedValue.complexToFloat(0) == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)) + 1352;
            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int iMyPid = 24 - (Process.myPid() >> 22);
            byte length = (byte) $$a.length;
            Object[] objArr2 = new Object[1];
            G((byte) 0, length, (byte) (length - 5), objArr2);
            objD = an.d(i4, fadingEdgeLength, iMyPid, -185097237, false, (String) objArr2[0], null);
        }
        long j2 = ((Field) objD).getLong(null);
        Object[] objArr3 = new Object[1];
        H(null, null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u0091\u0090\u0085\u008f\u008e\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        H(null, null, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, "\u008c\u008d\u0086\u008b\u008f\u0081\u008c\u0093\u0083\u008c\u0088\u0092\u0081\u008f\u008c", objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], null).invoke(null, null)).longValue();
        Object objD2 = an.d(-2106840531);
        if (objD2 == null) {
            int iIndexOf = 1351 - TextUtils.indexOf((CharSequence) "", '0');
            char size = (char) View.MeasureSpec.getSize(0);
            int iResolveSize = View.resolveSize(0, 0) + 24;
            i2 = -2104069968;
            byte b2 = (byte) 0;
            i3 = -2106840531;
            byte b3 = (byte) (b2 + 1);
            Object[] objArr5 = new Object[1];
            G(b2, b3, (byte) (-b3), objArr5);
            objD2 = an.d(iIndexOf, size, iResolveSize, -200410762, false, (String) objArr5[0], null);
        } else {
            i2 = -2104069968;
            i3 = -2106840531;
        }
        if (j2 == ((jLongValue - ((((Field) objD2).getLong(null) << 52) >>> 52)) >> 12)) {
            u = (w + 51) % 128;
            Object objD3 = an.d(-2107764052);
            if (objD3 == null) {
                int scrollBarFadeDuration = 1352 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                char cResolveSize = (char) View.resolveSize(0, 0);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 24;
                byte b4 = (byte) 0;
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                G(b4, b5, (byte) (b5 - 1), objArr6);
                objD3 = an.d(scrollBarFadeDuration, cResolveSize, deadChar, -197148169, false, (String) objArr6[0], null);
            }
            objArr = (Object[]) ((Field) objD3).get(null);
        } else {
            try {
                Object[] objArr7 = {1763832420};
                Object objD4 = an.d(-458211269);
                if (objD4 == null) {
                    objD4 = an.d(1328 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (60543 - (PointF.length(SelfieScan.RECOGNITION_FAIL_RESULT, SelfieScan.RECOGNITION_FAIL_RESULT) > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (PointF.length(SelfieScan.RECOGNITION_FAIL_RESULT, SelfieScan.RECOGNITION_FAIL_RESULT) == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1))), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1831759008, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrD$2669f03c = gn.AnonymousClass4.d$2669f03c(((Constructor) objD4).newInstance(objArr7));
                Object objD5 = an.d(-2107764052);
                if (objD5 == null) {
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1353;
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int iArgb = 24 - Color.argb(0, 0, 0, 0);
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    Object[] objArr8 = new Object[1];
                    G(b6, b7, (byte) (b7 - 1), objArr8);
                    objD5 = an.d(iIndexOf2, cResolveSizeAndState, iArgb, -197148169, false, (String) objArr8[0], null);
                }
                ((Field) objD5).set(null, objArrD$2669f03c);
                try {
                    Object[] objArr9 = new Object[1];
                    H(null, null, TextUtils.getCapsMode("", 0, 0) + 127, "\u0091\u0090\u0085\u008f\u008e\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    H(null, null, 175 - AndroidCharacter.getMirror('0'), "\u008c\u008d\u0086\u008b\u008f\u0081\u008c\u0093\u0083\u008c\u0088\u0092\u0081\u008f\u008c", objArr10);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr10[0], null).invoke(null, null)).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objD6 = an.d(i3);
                    if (objD6 == null) {
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1352;
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int i5 = 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 1);
                        Object[] objArr11 = new Object[1];
                        G(b8, b9, (byte) (-b9), objArr11);
                        objD6 = an.d(packedPositionGroup, doubleTapTimeout, i5, -200410762, false, (String) objArr11[0], null);
                    }
                    ((Field) objD6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objD7 = an.d(i2);
                    if (objD7 == null) {
                        int i6 = 1352 - (TypedValue.complexToFloat(0) > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (TypedValue.complexToFloat(0) == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1));
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iNormalizeMetaState = 24 - KeyEvent.normalizeMetaState(0);
                        byte length2 = (byte) $$a.length;
                        Object[] objArr12 = new Object[1];
                        G((byte) 0, length2, (byte) (length2 - 5), objArr12);
                        objD7 = an.d(i6, pressedStateDuration, iNormalizeMetaState, -185097237, false, (String) objArr12[0], null);
                    }
                    ((Field) objD7).set(null, lValueOf2);
                    objArr = objArrD$2669f03c;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i7 = ((int[]) objArr[3])[0];
        int i8 = ((int[]) objArr[1])[0];
        if (i8 != i7) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[2];
            if (strArr != null) {
                w = (u + 3) % 128;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            long j3 = (((long) (i7 ^ i8)) & BodyPartID.bodyIdMax) ^ 9045568830411112448L;
            w = (u + 71) % 128;
            try {
                Object[] objArr13 = {Long.valueOf(j3), 2106085615L};
                byte b10 = $$d[8];
                byte b11 = b10;
                Object[] objArr14 = new Object[1];
                I(b10, b11, (byte) (b11 + 1), objArr14);
                Class<?> cls3 = Class.forName((String) objArr14[0]);
                byte b12 = (byte) ($$e & 1);
                Object[] objArr15 = new Object[1];
                I(b12, b12, r0[8], objArr15);
                String str2 = (String) objArr15[0];
                Class cls4 = Long.TYPE;
                cls3.getMethod(str2, cls4, cls4).invoke(null, objArr13);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(Context context) {
        d(-1265410827, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{context}, 1265410829);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(Context context) {
        int i2 = w + 45;
        u = i2 % 128;
        if (i2 % 2 == 0) {
            d(1869115061, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{context}, -1869115055);
            return;
        }
        d(1869115061, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{context}, -1869115055);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(Context context) {
        u = (w + 115) % 128;
        ah.a(context);
        w = (u + 85) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(Context context) {
        w = (u + 9) % 128;
        d(1869115061, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{context}, -1869115055);
        u = (w + 73) % 128;
    }

    private static void a(@NonNull Context context, FaceTecSDK.InitializeCallback initializeCallback) throws Throwable {
        int i2;
        Float fValueOf = Float.valueOf(SelfieScan.RECOGNITION_FAIL_RESULT);
        dz dzVar = new dz(context, initializeCallback);
        try {
            Object[] objArr = {0, 0};
            byte[] bArr = D;
            byte b2 = bArr[4];
            int i3 = C;
            Object[] objArr2 = new Object[1];
            E(b2, (short) (i3 | EnumC41897g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE), bArr[158], objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            E(bArr[207], (short) (i3 | EnumC41897g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE), bArr[90], objArr3);
            String str = (String) objArr3[0];
            Class cls2 = Integer.TYPE;
            int iIntValue = 134 - ((Integer) cls.getMethod(str, cls2, cls2).invoke(null, objArr)).intValue();
            Object[] objArr4 = new Object[1];
            E(bArr[270], (short) EnumC41897g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE, bArr[158], objArr4);
            Class<?> cls3 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            E(bArr[195], (short) 342, bArr[289], objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            E(bArr[270], (short) EnumC41897g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, bArr[345], objArr6);
            int iIntValue2 = 1017 - ((Integer) cls3.getMethod(str2, Class.forName((String) objArr6[0]), Character.TYPE).invoke(null, "", '0')).intValue();
            Object[] objArr7 = new Object[1];
            E(bArr[88], bArr[342], bArr[158], objArr7);
            Class<?> cls4 = Class.forName((String) objArr7[0]);
            byte b3 = bArr[0];
            Object[] objArr8 = new Object[1];
            E(b3, (short) (b3 | 483), bArr[90], objArr8);
            Object[] objArr9 = new Object[1];
            F(iIntValue, iIntValue2, (char) (((Integer) cls4.getMethod((String) objArr8[0], null).invoke(null, null)).intValue() >> 16), objArr9);
            String str3 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            E(bArr[270], (short) 427, bArr[158], objArr10);
            Class<?> cls5 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            E(bArr[76], (short) 521, bArr[6], objArr11);
            int i4 = (((Long) cls5.getMethod((String) objArr11[0], null).invoke(null, null)).longValue() > (-1L) ? 1 : (((Long) cls5.getMethod((String) objArr11[0], null).invoke(null, null)).longValue() == (-1L) ? 0 : -1));
            Object[] objArr12 = {fValueOf, fValueOf};
            byte b4 = bArr[76];
            Object[] objArr13 = new Object[1];
            E(b4, (short) (b4 | PassportService.SFI_DG15), bArr[158], objArr13);
            Class<?> cls6 = Class.forName((String) objArr13[0]);
            byte b5 = bArr[35];
            Object[] objArr14 = new Object[1];
            E(b5, (short) (b5 | 532), bArr[121], objArr14);
            String str4 = (String) objArr14[0];
            Class cls7 = Float.TYPE;
            int i5 = (((Float) cls6.getMethod(str4, cls7, cls7).invoke(null, objArr12)).floatValue() > SelfieScan.RECOGNITION_FAIL_RESULT ? 1 : (((Float) cls6.getMethod(str4, cls7, cls7).invoke(null, objArr12)).floatValue() == SelfieScan.RECOGNITION_FAIL_RESULT ? 0 : -1)) + 648;
            Object[] objArr15 = new Object[1];
            E(bArr[270], (short) 140, bArr[158], objArr15);
            Class<?> cls8 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            E(bArr[342], (short) 570, bArr[58], objArr16);
            Method method = cls8.getMethod((String) objArr16[0], cls2);
            Object[] objArr17 = new Object[1];
            F(i4, i5, (char) (((Integer) method.invoke(null, 0)).intValue() + 50560), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            char c2 = '2';
            byte b6 = bArr[50];
            short s2 = (short) EnumC41897g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE;
            Object[] objArr19 = new Object[1];
            E(b6, s2, bArr[345], objArr19);
            Class<?> cls9 = Class.forName((String) objArr19[0]);
            byte b7 = bArr[389];
            Object[] objArr20 = new Object[1];
            E(b7, (short) (b7 | 144), bArr[32], objArr20);
            String str5 = (String) objArr20[0];
            Object[] objArr21 = new Object[1];
            E(bArr[50], s2, bArr[345], objArr21);
            Object[] objArr22 = (Object[]) cls9.getMethod(str5, Class.forName((String) objArr21[0])).invoke(str3, objArr18);
            int[] iArr = new int[objArr22.length];
            int i6 = 0;
            while (i6 < objArr22.length) {
                Object[] objArr23 = {objArr22[i6]};
                byte[] bArr2 = D;
                byte b8 = bArr2[26];
                char c3 = c2;
                Object[] objArr24 = new Object[1];
                E(b8, (short) (b8 | ISOFileInfo.A0), bArr2[345], objArr24);
                Class<?> cls10 = Class.forName((String) objArr24[0]);
                byte b9 = bArr2[195];
                int i7 = C;
                Object[] objArr25 = new Object[1];
                E(b9, (short) (i7 - 2), bArr2[9], objArr25);
                String str6 = (String) objArr25[0];
                Object[] objArr26 = new Object[1];
                E(bArr2[c3], s2, bArr2[345], objArr26);
                Object objInvoke = cls10.getMethod(str6, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                byte b10 = bArr2[26];
                Object[] objArr27 = new Object[1];
                E(b10, (short) (b10 | ISOFileInfo.A0), bArr2[345], objArr27);
                Class<?> cls11 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                E(bArr2[84], (short) (i7 + 4), bArr2[289], objArr28);
                iArr[i6] = ((Integer) cls11.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                i6++;
                c2 = c3;
            }
            int i8 = 26;
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (dzVar.d(iArr[i9])) {
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i9 = 36;
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        dzVar.d(38);
                        i10 = dzVar.e != 45 ? 22 : 10;
                        i9 = i10;
                        break;
                    case -17:
                        i9 = 1;
                        break;
                    case -16:
                        i9 = 35;
                        break;
                    case -15:
                        dzVar.d(29);
                        if (dzVar.e == 0) {
                            i10 = 34;
                        }
                        i9 = i10;
                        break;
                    case -14:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(2);
                        w = dzVar.e;
                        i9 = i10;
                        break;
                    case -13:
                        dzVar.a = u;
                        try {
                            dzVar.d(4);
                            i9 = i10;
                        } catch (Throwable th2) {
                            th = th2;
                            if (i9 >= 23) {
                            }
                            throw th;
                        }
                        break;
                    case -12:
                        dzVar.d(8);
                        throw ((Throwable) dzVar.c);
                    case -11:
                        i9 = 37;
                        break;
                    case -10:
                        i9 = 39;
                        break;
                    case -9:
                        dzVar.d(5);
                        if (dzVar.e == 0) {
                            i10 = 20;
                        }
                        i9 = i10;
                        break;
                    case -8:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(2);
                        u = dzVar.e;
                        i9 = i10;
                        break;
                    case -7:
                        dzVar.a = w;
                        dzVar.d(4);
                        i9 = i10;
                        break;
                    case -6:
                        return;
                    case -5:
                        i9 = i8;
                        break;
                    case -4:
                        i9 = 12;
                        break;
                    case -3:
                        dzVar.a = 2;
                        dzVar.d(1);
                        dzVar.d(7);
                        Context context2 = (Context) dzVar.c;
                        dzVar.d(7);
                        ay.d(context2, (ay.a) dzVar.c);
                        i9 = i10;
                        break;
                    case -2:
                        dzVar.a = 2;
                        dzVar.d(1);
                        dzVar.d(7);
                        final Context context3 = (Context) dzVar.c;
                        dzVar.d(7);
                        final FaceTecSDK.InitializeCallback initializeCallback2 = (FaceTecSDK.InitializeCallback) dzVar.c;
                        dzVar.d = new ay.a() { // from class: com.facetec.sdk.书人
                            @Override // com.facetec.sdk.ay.a
                            public final void onCompletion(ay.e eVar, String str7) {
                                bk.e(context3, initializeCallback2, eVar, str7);
                            }
                        };
                        try {
                            dzVar.d(6);
                            i9 = i10;
                        } catch (Throwable th3) {
                            th = th3;
                            if (i9 >= 23 || i9 >= (i2 = i8)) {
                                throw th;
                            }
                            dzVar.d = th;
                            dzVar.d(43);
                            i9 = 21;
                            i8 = i2;
                        }
                        break;
                    case -1:
                        i9 = 5;
                        break;
                    default:
                        i9 = i10;
                        break;
                }
            }
            throw th;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause == null) {
                throw th4;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(boolean z2, Context context, FaceTecSDK.InitializeCallback initializeCallback) {
        boolean zB;
        u = (w + EnumC41897g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE) % 128;
        if (!z2) {
            initializeCallback.onCompletion(false);
            u = (w + 51) % 128;
            return;
        }
        try {
            zB = cv.b(context);
        } catch (Exception unused) {
            zB = false;
        }
        if (!zB) {
            h = c.REJECTED;
        }
        try {
            n = true;
            initializeCallback.onCompletion(zB);
        } finally {
            n = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(String str, Context context, FaceTecSDK.InitializeCallback initializeCallback, String str2, String str3) throws Throwable {
        if (((Boolean) d(1659943937, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{str}, -1659943929)).booleanValue()) {
            h(context);
            e(context, str2, str3, initializeCallback);
            return;
        }
        u = (w + 53) % 128;
        d(674985234, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{context, initializeCallback, Boolean.FALSE}, -674985234);
        int i2 = u + EnumC41897g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static void h() {
        t = new char[]{8249, 8238, 8228, 8234, 8239, 8225, 8302, 8235, 8267, 8209, 8212, 8229, 8237, 8283, 8236, 8251, 8227, 8232, 8266};
        r = 1071522200;
        y = true;
        x = true;
    }

    public static void l() {
        byte[] bArr = new byte[953];
        System.arraycopy("\u0014gm4\u0012û\u0013\u0002ÿ\u0000ÏKö\u0018\u0001¿\u00182û\u0013\u0002ÿ\u0000ä*þ\u0016ô\u0007\u0016ö\u0012\u0003\u0014Þ!\u000e\u0005\u0002\b\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017Ñ1\u0004ý\b\u0003\u0013\u0002ô\u0018ú\u000b\u0004\u0003\u0014Ø*\bø\u0004\u0010Ú'\u0016ú\u000b\u0004â\u001f\u0019à\u001a\tý\u000f\u000b\u0004\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ''\u0002ù\u0007\u0013\u0005\u0003\u0014Ö,ú\u0014\b÷\u0004ä2\nä\u001a\tý\u0003\u0014Õ0\u000bò\u000fþô\u0012\u0014é\u001a\tý\u000f\u000b\u0004\u0012û\u0013\u0002ÿ\u0000Ï>\u0010ô\u0014ý\u0006ÿ\u0015À\u001a1\u0002\b\bú\u0000ü\u001aðÒCú\u0012þÌ*&\u0003ü\nþ\u0002\u0001\u0002\u0010ü\u001aðÒCú\u0012þÌ *\u000bö\u0007\u0003\u0012ð\u0010\u000eõï\u001c\n\u000bç\u0010\u0010\u000eõü\u001aðÒCú\u0012þÌ)(þ\u000bú\týå8ð\u0007\u0010\tú\u000b\u0004ü\u001aðÒL\u0004ú\bÇ,\u0005ù\u0000ô\u0012û\u0010\u0003í\u0005ù\u0000\u0012û\u0013\u0002ÿ\u0000Ï:\u0011\u0004\u000bö\u000e\u000b¿\u001a1\u0004\u000bö\u0018\u0001\u0003\u0014á\u0016\u0007\rû\u000b\u0003î\u0018\u0011ý\u0011\u0004\u000bò\r\n\nü\u001aðÒCú\u0012þÌ\u001a*þ\u0016æ\u0017\u0011\tõ\u000eú\u0007\u0012û\u0013\u0002ÿ\u0000ÏKö\u0018\u0001¿+\u0016\u0018\u0001æ$ú\b\f\nû\u0006\u0018Ü\u001c\u0003\u0014å\u0012\u0014é\u001a\tý\u000f\u000b\u0004\u0012û\u0013\u0002ÿ\u0000ÏN÷\u0000\b\u0003\u0014¿\u001c8ýö\u0012û\u0002\u0006\u000fþì\"\u000f\u0006ç\u0018\u0001\u0017\u0003\u0014á\u0016\u0007\rÿ\u0004ñ$\tû\u0010ú\u000b\u0004Ý.\bÖ*\u0006\bý\u0003\u0014å \u000bó\nð\u001e\b\u0006\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ*+ÿ\u0006ö\rÛ.\bù\r\fú\u0014\b÷\u0004ó\u0018\u0001\u0010\rú\tý\u0000\tú\týí!\b\u0005\u0002\u000f\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼\"\u001f\u0019Ñ6ô\u000e\u000b\u0003\u0014Õ&\u0001\bä*þ\u0016\u0003\u0014× \b\n\nþã$\b\u0003ì\u001e\u000eþ\u0012ù\u0017\u0002\u0005ø\u000e\u000bå\u0019\u000fø\u0001\bõ\u001a\týí!\b\u0005\u0002\u000f\u0012û\u0013\u0002ÿ\u0000Ï>\u0010ô\u0014ý\u0006ÿ\u0015À'$ÿ\n\u000b×þ\u000eþ\u0012ùø\u0004\u0003\u0014à\u001c\u0005\u0012÷\u0014Ò*\u0013ö\u0012\u0003\u0014ë\u001a\u0005\u0003Û1\u0004\u000b\u0003\u0002\u0002\fæ\u001a\tý\u000f\u000b\u0004\u0016ú\u0000ü\u001aðÒCú\u0012þÌ\u00192\u0005\u0002þ\u0001\u0012\u0000\u0010\f÷\u0003\u0014å\u0019\u000fø\u0001\bñ'ü\u000b\bü\u0010\n\u0003\u0014ä\u0015\u0014\u0002\u0002\u0005Û$\u0016Ù \b\u0006ä6\u0002ô\u0018ú\u000b\u0004\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017².\u001d\u0001\u0017\u0007\u0002øó\"ú\u0003ù\u000fÿí\u001d\u0001\u0017\u0007\u0002øó\"ú\u0003\u0012û\u0013\u0002ÿ\u0000Ï>\u0010ô\u0014ý\u0006ÿ\u0015À;\u0013ô\u001bï\u0006\u000fþÎ\u001b3ô\u001bï\u0006\u000fþø\u0013\u0001\u0002\u000fôï&ö\u0007\u000b\u0010\n\u0003\u0014Þ'ú\n\u0002\b\u0001\u0012à\u001d\u0014ò÷&ò\u0018öí\u0019\u0017ý\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ#(\u0005\u0006ú\u0012\u0003\u0014Þ\u0019\r\nã(\u0005\u0006ú\u0012\u0003\u0014å\u0019\u000fø\u0001\bü\u001aðÒCú\u0012þÌ+\u0019\u000fø\u0001\b\u0017\u0002\u0005ø\u000e\u000bå\u0019\u000fø\u0001\bü\u001aðÒCú\u0012þÌ\u00187\u0005÷\u0012\u0007ú\u000b\u0004Ü2\u0005\u0002\b\u0006\b\u0000ù\u0010\u0002\u0016ðí\u001d\u0014ò÷&ò\u0018ö\u000f\u000eõ\u0012û\u0013\u0002ÿ\u0000ÏKö\fþ\u0010ý\f\u0004\u0010º:\u0006\u000eùÒ\u001a&\u000eùç'\f\u0005å(ù\u0003\u0018ú\u000b\u0004\u0011\u0004\rô\u0012\u0007â)ñ\u0016\u0007ä\u0017\u0003ö Ú&\u0003æ&\u0007\u0010ø\u0005\u0013".getBytes(LocalizedMessage.DEFAULT_ENCODING), 0, bArr, 0, 953);
        D = bArr;
        C = 200;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r() {
        int i2 = u + 65;
        w = i2 % 128;
        int i3 = i2 % 2;
        cv.e();
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        int i5 = u + 29;
        w = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t() {
        u = (w + 31) % 128;
        ay.c();
        cp.c();
        u = (w + 55) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0835 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(@androidx.annotation.NonNull android.content.Context r28, java.lang.String r29, java.lang.String r30, com.facetec.sdk.bl r31, com.facetec.sdk.FaceTecSDK.InitializeCallback r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bk.a(android.content.Context, java.lang.String, java.lang.String, com.facetec.sdk.bl, com.facetec.sdk.FaceTecSDK$InitializeCallback):void");
    }

    public static void a(@NonNull Context context, String str, String str2, String str3, FaceTecSDK.InitializeCallback initializeCallback) throws Throwable {
        int i2;
        dz dzVar = new dz(context, str, str2, str3, initializeCallback);
        try {
            byte[] bArr = D;
            Object[] objArr = new Object[1];
            E(bArr[270], (short) EnumC41897g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE, bArr[158], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            E(bArr[195], (short) 342, bArr[289], objArr2);
            String str4 = (String) objArr2[0];
            Object[] objArr3 = new Object[1];
            E(bArr[270], (short) EnumC41897g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, bArr[345], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Class cls3 = Character.TYPE;
            Class cls4 = Integer.TYPE;
            int iIntValue = ((Integer) cls.getMethod(str4, cls2, cls3, cls4).invoke(null, "", '0', 0)).intValue() + 370;
            Object[] objArr4 = new Object[1];
            E(bArr[88], bArr[342], bArr[158], objArr4);
            Class<?> cls5 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            E(bArr[87], (short) 348, bArr[90], objArr5);
            int iIntValue2 = (((Integer) cls5.getMethod((String) objArr5[0], null).invoke(null, null)).intValue() >> 16) + 649;
            Object[] objArr6 = {0, 0};
            Object[] objArr7 = new Object[1];
            E(bArr[156], (short) 360, bArr[158], objArr7);
            Class<?> cls6 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            E(bArr[36], (short) 392, bArr[90], objArr8);
            char c2 = (char) (50162 - (((Long) cls6.getMethod((String) objArr8[0], cls4, cls4).invoke(null, objArr6)).longValue() > 0L ? 1 : (((Long) cls6.getMethod((String) objArr8[0], cls4, cls4).invoke(null, objArr6)).longValue() == 0L ? 0 : -1)));
            Object[] objArr9 = new Object[1];
            F(iIntValue, iIntValue2, c2, objArr9);
            String str5 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            E(bArr[88], bArr[342], bArr[158], objArr10);
            Class<?> cls7 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            E(bArr[733], (short) 416, bArr[90], objArr11);
            int iIntValue3 = 1 - (((Integer) cls7.getMethod((String) objArr11[0], null).invoke(null, null)).intValue() >> 8);
            short s2 = (short) 427;
            Object[] objArr12 = new Object[1];
            E(bArr[270], s2, bArr[158], objArr12);
            Class<?> cls8 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            E(bArr[13], (short) 448, bArr[270], objArr13);
            int i3 = (((Long) cls8.getMethod((String) objArr13[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls8.getMethod((String) objArr13[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 647;
            Object[] objArr14 = new Object[1];
            E(bArr[270], s2, bArr[158], objArr14);
            Class<?> cls9 = Class.forName((String) objArr14[0]);
            Object[] objArr15 = new Object[1];
            E(bArr[733], (short) (C | EnumC41897g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE), bArr[14], objArr15);
            Object[] objArr16 = new Object[1];
            F(iIntValue3, i3, (char) (50561 - (((Long) cls9.getMethod((String) objArr15[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls9.getMethod((String) objArr15[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr16);
            Object[] objArr17 = {(String) objArr16[0]};
            byte b2 = bArr[50];
            short s3 = (short) EnumC41897g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE;
            Object[] objArr18 = new Object[1];
            E(b2, s3, bArr[345], objArr18);
            Class<?> cls10 = Class.forName((String) objArr18[0]);
            byte b3 = bArr[389];
            Object[] objArr19 = new Object[1];
            E(b3, (short) (b3 | 144), bArr[32], objArr19);
            String str6 = (String) objArr19[0];
            Object[] objArr20 = new Object[1];
            E(bArr[50], s3, bArr[345], objArr20);
            Object[] objArr21 = (Object[]) cls10.getMethod(str6, Class.forName((String) objArr20[0])).invoke(str5, objArr17);
            int[] iArr = new int[objArr21.length];
            for (int i4 = 0; i4 < objArr21.length; i4++) {
                Object[] objArr22 = {objArr21[i4]};
                byte[] bArr2 = D;
                byte b4 = bArr2[26];
                Object[] objArr23 = new Object[1];
                E(b4, (short) (b4 | ISOFileInfo.A0), bArr2[345], objArr23);
                Class<?> cls11 = Class.forName((String) objArr23[0]);
                byte b5 = bArr2[195];
                int i5 = C;
                Object[] objArr24 = new Object[1];
                E(b5, (short) (i5 - 2), bArr2[9], objArr24);
                String str7 = (String) objArr24[0];
                Object[] objArr25 = new Object[1];
                E(bArr2[50], s3, bArr2[345], objArr25);
                Object objInvoke = cls11.getMethod(str7, Class.forName((String) objArr25[0])).invoke(null, objArr22);
                byte b6 = bArr2[26];
                Object[] objArr26 = new Object[1];
                E(b6, (short) (b6 | ISOFileInfo.A0), bArr2[345], objArr26);
                Class<?> cls12 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                E(bArr2[84], (short) (i5 + 4), bArr2[289], objArr27);
                iArr[i4] = ((Integer) cls12.getMethod((String) objArr27[0], null).invoke(objInvoke, null)).intValue();
            }
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (dzVar.d(iArr[i6])) {
                    case -48:
                        i6 = 105;
                        break;
                    case -47:
                        dzVar.d(38);
                        i7 = dzVar.e != 0 ? 56 : 86;
                        break;
                    case -46:
                        i6 = 100;
                        break;
                    case -45:
                        dzVar.d(38);
                        int i8 = dzVar.e;
                        i6 = (i8 == 0 || i8 != 1) ? 32 : 38;
                        break;
                    case -44:
                        i6 = 95;
                        break;
                    case -43:
                        dzVar.d(38);
                        int i9 = dzVar.e;
                        i7 = (i9 == 0 || i9 != 1) ? 62 : 21;
                        break;
                    case -42:
                        i6 = 90;
                        break;
                    case -41:
                        try {
                            dzVar.d(38);
                            i2 = dzVar.e;
                        } catch (Throwable th2) {
                            th = th2;
                            if (i6 >= 87 || i6 >= 90) {
                                throw th;
                            }
                            dzVar.d = th;
                            dzVar.d(43);
                            i6 = 85;
                        }
                        if (i2 == 0 || i2 != 1) {
                            i6 = 8;
                        } else {
                            i7 = 13;
                        }
                        break;
                    case -40:
                        dzVar.d(8);
                        throw ((Throwable) dzVar.c);
                    case -39:
                        i6 = 106;
                        break;
                    case -38:
                        i6 = 108;
                        break;
                    case -37:
                        dzVar.d(29);
                        if (dzVar.e == 0) {
                            i7 = 84;
                        }
                        break;
                    case -36:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(2);
                        w = dzVar.e;
                        break;
                    case -35:
                        dzVar.a = u;
                        dzVar.d(4);
                        break;
                    case -34:
                        i6 = 17;
                        break;
                    case -33:
                        i6 = 72;
                        break;
                    case -32:
                        dzVar.d(5);
                        if (dzVar.e == 0) {
                            i7 = 71;
                        }
                        break;
                    case -31:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(2);
                        u = dzVar.e;
                        break;
                    case -30:
                        dzVar.a = w;
                        dzVar.d(4);
                        break;
                    case -29:
                        i6 = 43;
                        break;
                    case -28:
                        i6 = 1;
                        break;
                    case -27:
                        i6 = 75;
                        break;
                    case -26:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(7);
                        final Context context2 = (Context) dzVar.c;
                        dzVar.d = new Runnable() { // from class: com.facetec.sdk.书土
                            @Override // java.lang.Runnable
                            public final void run() {
                                bk.r(context2);
                            }
                        };
                        dzVar.d(6);
                        break;
                    case -25:
                        i6 = 53;
                        break;
                    case -24:
                        i6 = 58;
                        break;
                    case TMXProfilingConnectionsInterface.TMXSocketResponseCode.ResponseIllegalArgumentException /* -23 */:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(7);
                        dzVar.d = dj.a((Runnable) dzVar.c);
                        dzVar.d(6);
                        break;
                    case TMXProfilingConnectionsInterface.TMXSocketResponseCode.ResponseIOException /* -22 */:
                        dzVar.a = 5;
                        dzVar.d(1);
                        dzVar.d(7);
                        final String str8 = (String) dzVar.c;
                        dzVar.d(7);
                        final Context context3 = (Context) dzVar.c;
                        dzVar.d(7);
                        final FaceTecSDK.InitializeCallback initializeCallback2 = (FaceTecSDK.InitializeCallback) dzVar.c;
                        dzVar.d(7);
                        final String str9 = (String) dzVar.c;
                        dzVar.d(7);
                        final String str10 = (String) dzVar.c;
                        dzVar.d = new Runnable() { // from class: com.facetec.sdk.书国
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                bk.e(str8, context3, initializeCallback2, str9, str10);
                            }
                        };
                        dzVar.d(6);
                        break;
                    case TMXProfilingConnectionsInterface.TMXSocketResponseCode.ResponseUnknownHost /* -21 */:
                        i6 = 101;
                        break;
                    case TMXProfilingConnectionsInterface.TMXSocketResponseCode.ResponseOk /* -20 */:
                        i6 = 103;
                        break;
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        dzVar.d(5);
                        if (dzVar.e == 0) {
                            i7 = 31;
                        }
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(7);
                        dzVar.a = g((Context) dzVar.c) ? 1 : 0;
                        dzVar.d(4);
                        break;
                    case -17:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(7);
                        k = (a) dzVar.c;
                        break;
                    case -16:
                        dzVar.d = a.LICENSE;
                        dzVar.d(6);
                        break;
                    case -15:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(7);
                        a = (String) dzVar.c;
                        break;
                    case -14:
                        dzVar.a = 2;
                        dzVar.d(1);
                        dzVar.d(7);
                        Context context4 = (Context) dzVar.c;
                        dzVar.d(2);
                        d(-1868685366, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{context4, Boolean.valueOf(dzVar.e != 0)}, 1868685371);
                        break;
                    case -13:
                        return;
                    case -12:
                        i6 = 96;
                        break;
                    case -11:
                        i6 = 98;
                        break;
                    case -10:
                        dzVar.d(15);
                        if (dzVar.e == 0) {
                            i7 = 16;
                        }
                        break;
                    case -9:
                        i6 = 51;
                        break;
                    case -8:
                        try {
                            dzVar.a = 3;
                            dzVar.d(1);
                            dzVar.d(7);
                            Context context5 = (Context) dzVar.c;
                            dzVar.d(7);
                            FaceTecSDK.InitializeCallback initializeCallback3 = (FaceTecSDK.InitializeCallback) dzVar.c;
                            dzVar.d(2);
                            d(674985234, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{context5, initializeCallback3, Boolean.valueOf(dzVar.e != 0)}, -674985234);
                        } catch (Throwable th3) {
                            th = th3;
                            if (i6 >= 87) {
                            }
                            throw th;
                        }
                        break;
                    case -7:
                        i6 = 91;
                        break;
                    case -6:
                        i6 = 93;
                        break;
                    case -5:
                        dzVar.d(11);
                        i6 = dzVar.e == 0 ? 7 : i7;
                        break;
                    case -4:
                        dzVar.d = c.VALIDATED;
                        dzVar.d(6);
                        break;
                    case -3:
                        dzVar.d = h;
                        dzVar.d(6);
                        break;
                    case -2:
                        dzVar.a = 1;
                        dzVar.d(1);
                        dzVar.d(2);
                        m = dzVar.e != 0;
                        break;
                    case -1:
                        i6 = 48;
                        break;
                    default:
                        break;
                }
            }
            throw th;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause == null) {
                throw th4;
            }
            throw cause;
        }
    }

    private static boolean k(@NonNull Context context) {
        if (!context.getPackageManager().hasSystemFeature("android.hardware.camera.front")) {
            u = (w + 31) % 128;
            if (!Build.MODEL.equals("Lenovo YT3-850F")) {
                u = (w + 61) % 128;
                al.o();
                u = (w + 15) % 128;
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, Context context, FaceTecSDK.InitializeCallback initializeCallback) throws Throwable {
        if (!((Boolean) d(1659943937, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{str}, -1659943929)).booleanValue()) {
            int i2 = u + 55;
            w = i2 % 128;
            if (i2 % 2 == 0) {
                t.d(context, com.facetec.sdk.c.INIT_FAIL_PUBLIC_KEY, null, null);
                d(674985234, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{context, initializeCallback, Boolean.TRUE}, -674985234);
                return;
            } else {
                t.d(context, com.facetec.sdk.c.INIT_FAIL_PUBLIC_KEY, null, null);
                d(674985234, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{context, initializeCallback, Boolean.FALSE}, -674985234);
                return;
            }
        }
        h(context);
        a(context, initializeCallback);
        int i3 = w + EnumC41897g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE;
        u = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public static void f() {
        u = (w + 39) % 128;
        bb.a("***********************************************************************************************************************************");
        bb.a("* WARNING: You are using DEVELOPMENT-ONLY Keys. *");
        bb.a("* Development Keys should only be used while you are familiarizing yourself with Device SDK functionality or if you do not yet have a commercial agreement with FaceTec. *");
        bb.a("* This Key IS NOT supported for Production Environments. *");
        bb.a("* If you have a commercial agreement with FaceTec, you should be using Production SDK Encryption Keys, even if you are still Developing your Application. *");
        bb.a("* Please use initializeInProductionMode if you are deploying this for use in a Real App with Real Users. *");
        bb.a("* Please review https://dev.facetec.com/keys#key-types *");
        bb.a("***********************************************************************************************************************************");
        int i2 = w + 97;
        u = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r9.c == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r9.c == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        com.facetec.sdk.t.d(r7, com.facetec.sdk.c.INIT_FINISH, null, null);
        com.facetec.sdk.bk.h = com.facetec.sdk.bk.c.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        com.facetec.sdk.t.d(r7, com.facetec.sdk.c.INIT_FAIL_VERSION_DEPRECATED, null, null);
        com.facetec.sdk.bk.h = com.facetec.sdk.bk.c.d;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void e(android.content.Context r7, com.facetec.sdk.FaceTecSDK.InitializeCallback r8, com.facetec.sdk.ay.e r9, java.lang.String r10) {
        /*
            int r0 = com.facetec.sdk.bk.u
            int r0 = r0 + 7
            int r1 = r0 % 128
            com.facetec.sdk.bk.w = r1
            int r0 = r0 % 2
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L15
            if (r9 == 0) goto L13
            r10 = r3
            goto L18
        L13:
            r2 = r3
            goto L59
        L15:
            if (r9 == 0) goto L59
            r10 = r2
        L18:
            boolean r0 = r9.b
            if (r0 == 0) goto L46
            int r1 = r1 + 7
            int r0 = r1 % 128
            com.facetec.sdk.bk.u = r0
            int r1 = r1 % 2
            if (r1 == 0) goto L2e
            boolean r9 = r9.c
            r0 = 74
            int r0 = r0 / r2
            if (r9 != 0) goto L3c
            goto L32
        L2e:
            boolean r9 = r9.c
            if (r9 != 0) goto L3c
        L32:
            com.facetec.sdk.c r9 = com.facetec.sdk.c.INIT_FINISH
            com.facetec.sdk.t.d(r7, r9, r4, r4)
            com.facetec.sdk.bk$c r9 = com.facetec.sdk.bk.c.VALIDATED
            com.facetec.sdk.bk.h = r9
            goto L63
        L3c:
            com.facetec.sdk.c r9 = com.facetec.sdk.c.INIT_FAIL_VERSION_DEPRECATED
            com.facetec.sdk.t.d(r7, r9, r4, r4)
            com.facetec.sdk.bk$c r9 = com.facetec.sdk.bk.c.VERSION_DEPRECATED
            com.facetec.sdk.bk.h = r9
            goto L57
        L46:
            com.facetec.sdk.c r9 = com.facetec.sdk.c.INIT_FAIL_DEVICE_KEY_REJECTED
            com.facetec.sdk.t.d(r7, r9, r4, r4)
            com.facetec.sdk.bk$c r9 = com.facetec.sdk.bk.c.REJECTED
            com.facetec.sdk.bk.h = r9
            int r9 = com.facetec.sdk.bk.u
            int r9 = r9 + 11
            int r9 = r9 % 128
            com.facetec.sdk.bk.w = r9
        L57:
            r3 = r10
            goto L63
        L59:
            com.facetec.sdk.c r9 = com.facetec.sdk.c.INIT_FAIL_NETWORK_ERROR
            com.facetec.sdk.t.d(r7, r9, r10, r4)
            com.facetec.sdk.bk$c r9 = com.facetec.sdk.bk.c.NETWORK_ERROR
            com.facetec.sdk.bk.h = r9
            r3 = r2
        L63:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r5 = new java.lang.Object[]{r7, r8, r9}
            int r1 = com.facetec.sdk.nf.a.e()
            int r2 = com.facetec.sdk.nf.a.e()
            int r3 = com.facetec.sdk.nf.a.e()
            int r4 = com.facetec.sdk.nf.a.e()
            r0 = 674985234(0x283b7512, float:1.0405971E-14)
            r6 = -674985234(0xffffffffd7c48aee, float:-4.3220196E14)
            d(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bk.e(android.content.Context, com.facetec.sdk.FaceTecSDK$InitializeCallback, com.facetec.sdk.ay$e, java.lang.String):void");
    }

    public static void g() {
        int i2 = u + 51;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            bb.a("***********************************************************************************************************************************");
            bb.a("* WARNING: You are using initializeInDevelopmentMode with a PRODUCTION Key. *");
            bb.a("* Please use initializeInProductionMode, even if you are still Developing your Application. *");
            bb.a("* Please review https://dev.facetec.com/keys#key-types *");
            bb.a("***********************************************************************************************************************************");
            u = (w + 91) % 128;
            return;
        }
        bb.a("***********************************************************************************************************************************");
        bb.a("* WARNING: You are using initializeInDevelopmentMode with a PRODUCTION Key. *");
        bb.a("* Please use initializeInProductionMode, even if you are still Developing your Application. *");
        bb.a("* Please review https://dev.facetec.com/keys#key-types *");
        bb.a("***********************************************************************************************************************************");
        throw null;
    }

    public static void j() {
        int i2 = w + 25;
        int i3 = i2 % 128;
        u = i3;
        int i4 = i2 % 2;
        p = 398939778954187054L;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 35;
        w = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static void i() {
        int i2 = u;
        int i3 = i2 + 99;
        w = i3 % 128;
        if (i3 % 2 != 0) {
            if (!n) {
                w = (i2 + 55) % 128;
                return;
            }
            bb.a("***********************************************************************************************************************************");
            bb.a("* FaceTec SDK Code Integration PROBLEM Detected.                                                                                  *");
            bb.a("* Your App Code is creating a new FaceTecSession in the Initialization Completion Callback.                                       *");
            bb.a("* This will cause User Experience Issues and is not recommended. Please see the FaceTec Developer Documentation for more details. *");
            bb.a("***********************************************************************************************************************************");
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if ((r2 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return com.facetec.sdk.FaceTecSDK.CameraPermissionStatus.NOT_YET_REQUESTED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r2 = com.facetec.sdk.FaceTecSDK.CameraPermissionStatus.GRANTED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        return com.facetec.sdk.FaceTecSDK.CameraPermissionStatus.GRANTED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (kotlin.C6852.checkSelfPermission(r2, "android.permission.CAMERA") != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (kotlin.C6852.checkSelfPermission(r2, "android.permission.CAMERA") != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r2 = com.facetec.sdk.bk.u + 119;
        com.facetec.sdk.bk.w = r2 % 128;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facetec.sdk.FaceTecSDK.CameraPermissionStatus c(@androidx.annotation.NonNull android.content.Context r2) {
        /*
            int r0 = com.facetec.sdk.bk.u
            int r0 = r0 + 89
            int r1 = r0 % 128
            com.facetec.sdk.bk.w = r1
            int r0 = r0 % 2
            java.lang.String r1 = "android.permission.CAMERA"
            if (r0 != 0) goto L19
            int r2 = kotlin.C6852.checkSelfPermission(r2, r1)
            r0 = 58
            int r0 = r0 / 0
            if (r2 == 0) goto L32
            goto L1f
        L19:
            int r2 = kotlin.C6852.checkSelfPermission(r2, r1)
            if (r2 == 0) goto L32
        L1f:
            int r2 = com.facetec.sdk.bk.u
            int r2 = r2 + 119
            int r0 = r2 % 128
            com.facetec.sdk.bk.w = r0
            int r2 = r2 % 2
            if (r2 == 0) goto L2e
            com.facetec.sdk.FaceTecSDK$CameraPermissionStatus r2 = com.facetec.sdk.FaceTecSDK.CameraPermissionStatus.NOT_YET_REQUESTED
            return r2
        L2e:
            com.facetec.sdk.FaceTecSDK$CameraPermissionStatus r2 = com.facetec.sdk.FaceTecSDK.CameraPermissionStatus.GRANTED
            r2 = 0
            throw r2
        L32:
            com.facetec.sdk.FaceTecSDK$CameraPermissionStatus r2 = com.facetec.sdk.FaceTecSDK.CameraPermissionStatus.GRANTED
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bk.c(android.content.Context):com.facetec.sdk.FaceTecSDK$CameraPermissionStatus");
    }

    public static void m() {
        char[] cArr = new char[1749];
        ByteBuffer.wrap("â{rYÂ\u0006Rß¢\u00823M\u0083\u0010\u0013Èc\u008bðK@\u0016ÐÑ \u008a±\\\u0001\u001f\u0091Áá\u009aveÆ<Và¦£7w\u0087.\u0017ég¾ôtD7Ôå$²µ}\u0005#\u0095äåºu\u0085Ê[Z\u001dªÂ:\u008d\u008bS\u001b\u0016kÊû\u0095HKØ\u000f(Ò¸\u009d\tC\u0099\u0000éÚy¥Î{^9®â>\u00ad\u008fs\u001f2oêÿµLkÜ+,ò¼½\rc\u009d,íú}ÅÍ\u009b\"U²\u0002\u0002Ù\u0092\u008eãWs\nÃÕS\u0088 L0\u0012\u0080É\u0010\u009eaYñ\u0004AùÑ¦&}¶>\u0006ì\u0096³çtw*ÇõW¨¤n42\u0084é\u0014¾eyõ$E\u001bÕÆ%\u0081º\\\n\u0014\u009aÎê\u0089{TË\r[Ö«\u00918L\u0088\u0006\u0018Þh\u0099ùDI?Ùæ)¡¾|\u000e8\u009eîî©\u007ftÏ!_ö¯±<m\u008c \u001cþl¹ýeMYÝ\u0006-Á½\u009d\u0012Rb\u000eòÉB\u0095ÓK#\u0016³Ñ\u0003\u008d\u0090Dà\u001epÙÀ\u0085Q}¡&1á\u0081½\u0016vf.öýFª×u')·ë\u0007²\u0094aä tøÄ»T\u009a¥X5\u0000\u0085ß\u0015\u0093jNú\tJÕÚ\u0080+V»\u0011\u000bÍ\u009b\u0089è^x\u0005ÈÂX¤©g98\u0089þ\u0019¬noþ0N÷Þ´/w¿(\u000fì\u009f¼ì\u007f| Ìå\\Ä¬\u0087=X\u008d\u001a\u001dÌm\u008fÂPR\u0013¢Ô2\u0097\u0083H\u0013\bcÜó\u009f@@Ð\u0001 ä°§\u0001\u007f\u0091>áìq³ÆrV*¦õ6©\u0087d\u00172gý÷¦DlÔ:$\u0011´Æ\u0004\u0081\u0095Zå\u0019uÎÅ\u0089ZSª\b:Ö\u008a\u0091\u001bKk\u0001ûÞK\u0099ØC(:¸æ\b½\u0099yé,yûÉ¨^w® >ö\u008e±\u001fko#ÿþO¹Üc,\\¼\u0006\fÝ\u009c\u0097íL}\u000fÍÑ]\u0093²T\u0002\u0003\u0092Ðâ\u0093sEÃ\u0004SØ£\u00870z\u0080&\u0010á`¼ñrA.Ñö!¶¶t\u0006(\u0096íæ²w}Ç!Wì§º7\u0085\u0084_\u0014\u001bdÂô\u0099ENÕ\t%Óµ\u0080\nV\u009a\u0011êËz\u0084Ë^[\u0005«Ï;¤\u0088g\u0018?h÷ø¬IpÙ6)ê¹ª\u000ei\u009e0îï~©Ï~_9¯ã?Ñ\u008f\u0086\u001c^l\u001aüÌL\u008fÝW-\u001f½Ô\r\u0088bNò\u0012BÂÒ\u0080#X³\u0004\u0003ý\u0093¦àap;ÀõP®¡v14\u0081ô\u0011¨foö2FáÖ«'x·;\u0007\u001e\u0097Úç\u0080tCÄ\u0016TÓ¤\u00885T\u0085\u000e\u0015Öe\u008eúIJ\u001cÚÀ*\u008c»Z\u000b%\u009büë¾xbÈ2Xñ¨¨9k\u0089.\u0019éi°þsN&Þæ.¸¿{\u000f^\u009f\u001fïÀ\u007f\u0083ÌY\\\u000e¬É<\u0097\u008dN\u001d\u0016mÑý\u008fRG¢\u001e2Ù\u0082\u0087\u0013pc&óýC¾Ðl 1°ô\u0000ª\u0091uá+qåÁ²V}¦$6â\u0086º\u0016\u009bg[÷\u0000GÜ×\u0097$N´\u0017\u0004Ô\u0094\u0094åIu\u000fÅÒU\u009dªD:\u0003\u008aÚ\u001aºkyû KãÛ¶(z¸(\bë\u0098®écy0ÉóY§®b>8\u008eû\u001eßn\u009aÿ@O\u0003ßÖ/\u0094¼H\f\u0015\u009cÌì\u0096}OÍ\u000b]Ü\u00ad\u0080\u0002L\u0092\u001aâår¼Ã{S\"£ò3°\u0080h\u00105`ëð¶AqÑ)!á±¾\u0006y\u0096!æ\u001avÆÆ\u0081WY§\u00137Î\u0087\u009d\u0014Jd\u0015ôÉD\u008bÕR%\u0001µÂ\u0005\u0098\u009aGê8zæÊ¡[|«2;î\u008b¶\u0018vh4øèH\u00adÙr)=¹á\t¬\u009ezîE~\u0019ÎÕ^\u0082¯M?\u0014\u008fÒ\u001f\u008alKü\fLÐÜ\u008d-G½\u001e\rÆ\u009d\u0081òdB9Òþ\"¢³s\u00031\u0093èã«pnÀ-Pð ¬1b\u0081>\u0011ça¥ñ\u0084FGÖ\u001b&Ú¶\u008c\u0007O\u0097\u0013çÓw\u0094ÄWT\u000b¤È4\u009c\u0085_\u0015\u0003eÀõ¤JgÚ;*ùº¬\u000bq\u009b=ëê{µÈmX$¨ò8¤\u0089b\u00198iûùßI\u0092Þ@.\u0003¾×\u000e\u009b\u009fHï\u0015\u007fÔÏ\u0097\\D¬\u000e<Ü\u008c\u0080\u001dEm\u001aýåM²¢|2\"\u0082í\u0012ºcuó*CêÓ« p°3\u0000è\u0090 áxq%Á\u0004QÇ¡\u00946\\\u0086\f\u0016Ïf\u009c÷UG\u0014×É'\u0090´S\u0004\b\u0094Æä\u0098uDÅ9Uæ¥¡:v\u008a4\u001aîj©û~K-Ûö+¨¸o\b<\u0098ÿè¬y`ÉDY\u001e©Þ9\u0082\u008eM\u001e\u001anÒ'ú!\u0088±ª\u0001õ\u0091-alð¿@üÐ% y3¦\u0083ú\u0013#ã`r·ÂíR*\"pµ\u0097\u0005Ô\u0095\teQô\u009eDÆÔ\u001b¤L7\u0087\u0087Ø\u0017\u0017çAv\u0090ÆÍV\n&]¶w\t´\u0099æi1ùgH¥Øû¨88z\u008b¹\u001bãë {rÊ°Zë*(ºJ\r\u008b\u009dÓm\u000fýCL\u009dÜÅ¬\u0004<G\u008f\u0084\u001f×ï\u0001\u007fNÎ\u0090^Ô.\t¾/\u000elá³qðÁ\"Qe »°ä\u0000<\u0090ec¢óüC6Óm¢ª2ô\u0082\r\u0012Uå\u0092uÌÅ\u0004U]$\u008e´Ù\u0004\u0006\u0094Xg\u0097÷ÁG\u000e×P¦\u009e6É\u0086ö\u0016+æoy±ÉþY#)f¸¹\bÿ\u0098?hcû¹KôÛ-«j:·\u008aÉ\u001a\u0015êR}\u008fÍÀ]\u001d-F¼\u008c\fÇ\u009c\u0004l]ÿ\u0099OÏß\u0018¯K>\u0094\u008e£\u001eõî-~lÑ¿¡ü1/\u0081y\u0010¦àûp:ÀaSº#í³*\u0003w\u0092\u008dbÕò\u0012BOÕ\u0080¥Ý5\u0006\u0085L\u0014\u0087äÄt\u001dÄZW\u008f'Õ·\u001f\u0007I\u0097jf öóF0Öa©©9û\u0089'\u0019\u007fè¥xâÈ<Xp+\u00ad»ó\u000b<\u009bWj\u008búÊJ\u0011Ú^\u00ad\u0083=Î\u008d\u0019\u001dYì\u009d|ÃÌ\u0000\\R/\u0092¿Ë\u000f\u0011\u009f\"ouþ¬NîÞ?®`\u0001®\u0091ùa&ñ{@¶Ðá .0r\u0083·\u0013éã\u000esIÂ\u0093RÎ\"\u0006²]\u0005\u0085\u0095Íe\u0007õDD\u009cÔÜ¤\u000f4S\u0087\u0095\u0017Éçèw*ÇsV°&à¶#\u0006{\u0099¸iøù:IcØ ¨ð85\u0088k\u001b´ëÍ{\u0015ËRZ\u0085*ßº\u001c\nF\u009d\u0086mÇý\u0004M\\Ü\u0098¬Ï<\u0014\u008cV\u001f\u0089ï¨\u007fîÏ3_o.¤¾ý\u000e%\u009emq§ÁäQ<!{°¯\u0000ó\u00904`ió\u0096CÊÓ\b£Q2\u009e\u0082Â\u0012\u000fâYu\u0086ÅÚU\u0016%A´\u008e\u0004Õ\u0094\u0017dIôiG\u00ad×ó§(7a\u0086½\u0016ææ,vgÉ¤Yþ)>¹o\b¬\u0098óh4øWK\u008aÛÓ«\u0010;G\u008a\u0083\u001aÛê\u0007zZÍ\u0085]Â-\u0019½Q\f\u008d\u009cÊl\u0011ü(Luß¬¯ñ?>\u008fe\u001e£îù~9Îx¡£1à\u00817\u0011uà«pèÀ\u000fPL#\u0093³Î\u0003\u001f\u0093\\b\u0083òÃB\u0007Ò[¥\u009e5Á\u0085\u000e\u0015Uä\u0091tÉÄöT-$h·±\u0007à\u0097=gzö¡FóÖ%¦}9¼\u0089ï\u0019,ésx½â{rYÂ\u0006RÙ¢\u009d3L\u0083\u000f\u0013Öc\u008aðU@\tÐÐ \u0093±D\u0001\u001e\u0091Æá\u0084vdÆ8Vþ¦¢7s\u00871\u0017èg·ôaD6Ôñ$«µ|\u0005 \u0095àåºu\u0085Ê\\Z\u0000ªÃ:\u0097\u008bN\u001b\u0011kÒû\u0094HIØ\u000b(Ò¸\u0085\tG\u0099\u0018éÛy°Îf^>®ý>¬\u008fo\u001f=oêÿµLkÜ,,ò¼½\rc\u009d%íú}ÅÍ\u009b\"^²\u0002\u0002Ò\u0092\u0096ãHs\u0013ÃÎS\u0096 M0\u0007\u0080Ü\u0010\u009faBñ\u001aAåÑ»&\u007f¶\"\u0006õ\u0096µçhw5ÇïW¶¤i4+\u0084ü\u0014¿eeõ\"E\u0004ÕØ%\u009fºB\n\r\u009aÓê\u0091{JË\u0015[Ë«\u008a8R\u0088\u001d\u0018Ãh\u0083ùZI%Ùû)»¾b\u000e-\u009eóî¼\u007fjÏ-_â¯°<s\u008c!\u001cël¸ýcMQÝ\u0006-Á½\u009f\u0012Yâ{rYÂ\u0006RÕ¢\u00823T\u0083\u0015\u0013Èc\u008bðJ@\u0016ÐÑ \u008d±\\\u0001\u001f\u0091Àá\u009aveÆ?Và¦£7v\u0087.\u0017ég±ôtD7Ôä$²µ}\u0005+\u0095øå u\u0098ÊFZ\u0001ªß:\u0090\u008bN\u001b\tk×û\u0089HVØ\n(Ï¸\u009c\t_\u0099\u0005éÄy¤Îs^ ®ø>²\u008fn\u001f)o÷ÿ«LvÜ1,ï¼¤\r~\u009d9íç}ÝÍ\u0086\"A²\u0016\u0002Ì\u0092\u0094ãWs\nÃÊS\u008b P0\u0013\u0080Á\u0010\u0081aXñ\u001bAùÑ¼&`¶:\u0006ø\u0096®çuw?ÇôW·¤m4)\u0084ü\u0014 e`õ:E\u0005ÕÛ%\u009aºB\n\r\u009aÓê\u009c{JË\u000e[Î«\u00908H\u0088\u0005\u0018Þh\u0087ùEI$Ùç)½¾w\u000e,\u009eðî¶\u007fjÏ+_é¯°<s\u008c\"\u001câl¸ý{MZÝ\u001b-À½\u0083\u0012Rb\u0010òÈB\u008bÓJ#\b³Ð\u0003\u0093\u0090Bà\u0001pØÀ\u0080Q~¡&1ù\u0081»\u0016lf/ööF²×t'(·î\u0007²\u0094cä!tøÄ»T\u009a¥_5\u0000\u0085Ã\u0015\u0092jTú\bJËÚ\u008a+M»\u0010\u000bÓ\u009b\u0082èJx\u0018ÈÄX¼©f9:\u0089ù\u0019¬ntþ<NêÞµ/k¿*\u000fò\u009f½ì`|-Ìú\\Þ¬\u0093=@\u008d\u0003\u001dÓm\u0092ÂHR\u0011¢È2\u0096\u0083Q\u0013\rcÀv(æ\nVUÆ\u00926Ï§\u001f\u0017\\\u0087\u0084÷Ùd\u0006Ô]D\u0083´À%\u0016\u0095M\u0005\u008auÓâ7RtÂ¨2ñ£>\u0013i\u0083»óø`2Ðe@¢°ü!3\u0091m\u0001ªqôáÊ^\u0015ÎR>\u008c®Á\u001f\u001d\u008fZÿ\u0084oØÜ\u0005LV¼\u0081,Î\u009d\u0010\rS}\u0089íâZ5Êr:¬ªæ\u001b=\u008bnû¹kæØ8Hy¸¡(ò\u00998\tky²é\u008aYÕ¶\u0012&L\u0096\u0084\u0006Ýw\u0000çGW\u0087ÇÄ4\u001e¤U\u0014\u008f\u0084Ðõ\u001eeIÕ¶Eè²&\"q\u0092¾\u0002ãs'ãySºÃð0# `\u0010±\u0080ðñ+ahÑIA\u0089±Ó.\f\u009eJ\u000e\u009d~Úï\u0007_YÏ\u0085?Ý¬\u001f\u001cO\u008c\u0093üÕm\tÝiM¬½ó*0\u009aa\n¢zûë'[\u007fË¥;â¨?\u0018w\u0088\u00adøêi7Ù\u000eIU¹\u008b)Í\u0086\u001föBf\u0082ÖÙG\u0018·['\u0083\u0097Þ\u0004\u0010tMä\u008aT×Å-5u¥\u00ad\u0015î\u0082?ò|b¥ÒâC'³d#½\u0093õ\u0000/plàµPüÀ×1\u0014¡M\u0011\u0084\u0081ßþ\u001cnDÞ\u0085NÇ¿\u001e/\\\u009f\u0081\u000fÑ|\u0019ìK\\\u0088Ìè=(\u00ads\u001d¯\u008dàú=jzÚ¦Jù»%+b\u009b¾\u000bðx-èjX¶È\u008f8Õ©\u0012\u0019N\u0089\u0087ùÝV\u001aÆF6\u009e¦Å\u0017\u0018\u0087Y÷\u008fgÌÔ\u0014DS´·$ì\u0095(\u0005qu¾åâR!â{rYÂ\u0006RÁ¢\u009c3L\u0083\u000f\u0013×c\u008aðU@\u000eÐÐ \u0093±E\u0001\u001e\u0091Ùá\u0080vdÆ'Vû¦¢7m\u0087:\u0017èg·ôhD6Ôñ$§µ|\u0005?\u0095åå¦u\u0084ÊGZ\u001dªß:\u008c\u008bO\u001b\u0015kÔû\u0094HWØ\r(Í¸\u009c\tC\u0099\réÚy¥Î{^8®â>´\u008fz\u001f(o÷ÿ¡LvÜ1,ï¼¥\r~\u009d&íâ}ÄÍ\u0087\"]²\u001a\u0002Ì\u0092\u008fãUs\u0010ÃÔS\u008d I0\u0012\u0080Â\u0010\u008aaXñ\u001bAùÑ½&`¶<\u0006ó\u0096®çiw7ÇàW¶¤q4/\u0084é\u0014¾eyõ$E\u0018ÕÆ%\u0081º\\\n\u0011\u009aÎê\u0089{TË\u0014[Í«\u008a8R\u0088\u0001\u0018Ëh\u0098ù[I:Ùø) ¾c\u000e4\u009eîî©\u007fsÏ4_÷¯®<m\u008c<\u001cål£ýzMZÝ\u0012-À½\u0083\u0012Rb\u0016òÈB\u0094ÓJ#\u0016³Ï\u0003\u008d\u0090\\à\u001fpÆÀ\u0083Qd¡'1þ\u0081¸\u0016lf/ööF±×t'7·î\u0007©\u0094|ä?tæÄ®T\u0084¥]5\u0014\u0085Â\u0015\u008djPú\u001dJÊÚ\u008f+C»\u0010\u000bÓ\u009b\u0082èK".getBytes(LocalizedMessage.DEFAULT_ENCODING)).asCharBuffer().get(cArr, 0, 1749);
        z = cArr;
        B = 2036699873158263400L;
    }

    public static Long a(Context context) {
        u = (w + 89) % 128;
        int iC = gn.c.AnonymousClass4.c();
        int iC2 = gn.c.AnonymousClass4.c();
        int iC3 = gn.c.AnonymousClass4.c();
        long jLongValue = ((Long) ce.e(gn.c.AnonymousClass4.c(), iC, iC2, -1696961540, 1696961542, new Object[]{context}, iC3)).longValue();
        if (jLongValue == 0) {
            u = (w + 9) % 128;
            return null;
        }
        int i2 = w + 31;
        u = i2 % 128;
        if (i2 % 2 == 0) {
            return Long.valueOf(jLongValue);
        }
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        int i2;
        Context context = (Context) objArr[0];
        int i3 = u + 79;
        w = i3 % 128;
        if (i3 % 2 == 0) {
            i2 = j(context).getInt(ao.W, 1);
        } else {
            i2 = j(context).getInt(ao.W, 0);
        }
        int i4 = w + 29;
        u = i4 % 128;
        if (i4 % 2 == 0) {
            return Integer.valueOf(i2);
        }
        throw null;
    }

    public static int i(Context context) {
        return ((Integer) d(-2051648858, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{context}, 2051648859)).intValue();
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        JSONObject jSONObject = (JSONObject) objArr[0];
        if (jSONObject.has("dGVULgo:UY%BjRq4N@@~4(9Bp1)GZ1+{")) {
            u = (w + 39) % 128;
            try {
                cb.c(jSONObject.getString("dGVULgo:UY%BjRq4N@@~4(9Bp1)GZ1+{"));
            } catch (JSONException unused) {
            }
            return null;
        }
        i = jSONObject;
        int i2 = u + 109;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static void c(FaceTecAuditTrailType faceTecAuditTrailType) {
        d(-2043363712, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{faceTecAuditTrailType}, 2043363715);
    }

    private static String o(Context context) throws Throwable {
        UUID uuidNameUUIDFromBytes;
        int i2 = u + 107;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            byte[] bArrD = h.d(context);
            Object[] objArr = new Object[1];
            J("ヾ㓤㢮㳔₵⒏⣉Ⳋ႐ᓅᢍᲵ\u0082Ҏ\u0897ೈ炁璅碞籌", Process.getGidForName("") + 12920, objArr);
            uuidNameUUIDFromBytes = UUID.nameUUIDFromBytes(bp.b(bArrD, ((String) objArr[0]).intern()));
        } else {
            byte[] bArrD2 = h.d(context);
            Object[] objArr2 = new Object[1];
            J("ヾ㓤㢮㳔₵⒏⣉Ⳋ႐ᓅᢍᲵ\u0082Ҏ\u0897ೈ炁璅碞籌", 1030 - Process.getGidForName(""), objArr2);
            uuidNameUUIDFromBytes = UUID.nameUUIDFromBytes(bp.b(bArrD2, ((String) objArr2[0]).intern()));
        }
        String string = uuidNameUUIDFromBytes.toString();
        u = (w + 49) % 128;
        return string;
    }

    private static boolean c(String str) {
        return ((Boolean) d(1659943937, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{str}, -1659943929)).booleanValue();
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        final Context context = (Context) objArr[0];
        final FaceTecSDK.InitializeCallback initializeCallback = (FaceTecSDK.InitializeCallback) objArr[1];
        final boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        if (initializeCallback == null) {
            int i2 = u + 111;
            w = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 10 / 0;
            }
            return null;
        }
        dj.a(new Runnable() { // from class: com.facetec.sdk.书名
            @Override // java.lang.Runnable
            public final void run() {
                bk.c(zBooleanValue, context, initializeCallback);
            }
        });
        int i4 = w + EnumC41897g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        u = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        FaceTecAuditTrailType faceTecAuditTrailType = (FaceTecAuditTrailType) objArr[0];
        d("setAuditTrailType");
        if (faceTecAuditTrailType != b) {
            int i2 = u + 37;
            w = i2 % 128;
            if (i2 % 2 == 0) {
                b = faceTecAuditTrailType;
                dj.a(new Runnable() { // from class: com.facetec.sdk.书地
                    @Override // java.lang.Runnable
                    public final void run() {
                        bk.r();
                    }
                });
                int i3 = 28 / 0;
            } else {
                b = faceTecAuditTrailType;
                dj.a(new Runnable() { // from class: com.facetec.sdk.书地
                    @Override // java.lang.Runnable
                    public final void run() {
                        bk.r();
                    }
                });
            }
        }
        int i4 = w + 73;
        u = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static void a(JSONObject jSONObject) {
        d(1284459851, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{jSONObject}, -1284459847);
    }

    public static boolean e(Context context) {
        w = (u + 115) % 128;
        int iC = gn.c.AnonymousClass4.c();
        int iC2 = gn.c.AnonymousClass4.c();
        int iC3 = gn.c.AnonymousClass4.c();
        boolean zBooleanValue = ((Boolean) ce.e(gn.c.AnonymousClass4.c(), iC, iC2, 301279779, -301279778, new Object[]{context}, iC3)).booleanValue();
        u = (w + 67) % 128;
        return zBooleanValue;
    }

    public static boolean e() {
        if (b != FaceTecAuditTrailType.DISABLED) {
            u = (w + 65) % 128;
            return true;
        }
        int i2 = w + 75;
        u = i2 % 128;
        if (i2 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r4) {
        /*
            r0 = 0
            r4 = r4[r0]
            android.content.Context r4 = (android.content.Context) r4
            int r1 = com.facetec.sdk.bk.w
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.facetec.sdk.bk.u = r2
            int r1 = r1 % 2
            r2 = 0
            if (r1 == 0) goto L1c
            boolean r1 = g(r4)
            r3 = 68
            int r3 = r3 / r0
            if (r1 == 0) goto L26
            goto L22
        L1c:
            boolean r0 = g(r4)
            if (r0 == 0) goto L26
        L22:
            com.facetec.sdk.cv.b(r4)     // Catch: java.lang.Exception -> L26
            return r2
        L26:
            int r4 = com.facetec.sdk.bk.u
            int r4 = r4 + 111
            int r4 = r4 % 128
            com.facetec.sdk.bk.w = r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bk.b(java.lang.Object[]):java.lang.Object");
    }

    public static boolean e(@NonNull Configuration configuration) {
        int i2 = u + 59;
        int i3 = i2 % 128;
        w = i3;
        int i4 = i2 % 2;
        int i5 = configuration.orientation;
        if (i4 == 0) {
            if (i5 == 3) {
                return true;
            }
        } else if (i5 == 2) {
            return true;
        }
        int i6 = i3 + 3;
        u = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 44 / 0;
        }
        return false;
    }

    @NonNull
    public static String e(String str) {
        String strB = b(null, true);
        if (strB == null) {
            int i2 = u + 83;
            w = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            strB = "_";
        }
        if (j != null) {
            StringBuilder sb = new StringBuilder("facetec|sdk|android|");
            sb.append(j);
            sb.append("|");
            sb.append(a);
            sb.append("|");
            sb.append(strB);
            sb.append("|");
            sb.append(Build.MODEL);
            sb.append("|");
            sb.append(FaceTecSDK.version());
            sb.append("|");
            sb.append(Locale.getDefault());
            sb.append("|");
            sb.append(Locale.getDefault().getLanguage());
            sb.append("|");
            sb.append(str);
            String string = sb.toString();
            w = (u + 5) % 128;
            return string;
        }
        return "";
    }

    public static synchronized String b(Context context, boolean z2) {
        try {
            u = (w + 105) % 128;
            if (f == null && context != null) {
                m(context);
            }
            if (z2) {
                w = (u + 105) % 128;
                return f95832g;
            }
            String str = f;
            int i2 = w + 19;
            u = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized String d(Context context) {
        try {
            int i2 = (u + 5) % 128;
            w = i2;
            if (j == null && context != null) {
                u = (i2 + 31) % 128;
                j = context.getPackageName();
                u = (w + EnumC41897g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            }
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    private static String n(Context context) throws Throwable {
        int i2 = u + 85;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            byte[] bArrD = h.d(context);
            Object[] objArr = new Object[1];
            J("ヾ㓤㢮㳔₵⒏⣉Ⳋ႐ᓅᢍᲵ\u0082Ҏ\u0897ೈ炁璅碞籌", 15898 / Gravity.getAbsoluteGravity(1, 0), objArr);
            return bp.d(bArrD, ((String) objArr[0]).intern()).substring(1, 77);
        }
        byte[] bArrD2 = h.d(context);
        Object[] objArr2 = new Object[1];
        J("ヾ㓤㢮㳔₵⒏⣉Ⳋ႐ᓅᢍᲵ\u0082Ҏ\u0897ೈ炁璅碞籌", 1031 - Gravity.getAbsoluteGravity(0, 0), objArr2);
        return bp.d(bArrD2, ((String) objArr2[0]).intern()).substring(0, 16);
    }

    public static boolean b() {
        return ((Boolean) d(-261957882, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[0], 261957889)).booleanValue();
    }

    private static void b(Context context, FaceTecSDK.InitializeCallback initializeCallback, boolean z2) {
        d(674985234, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{context, initializeCallback, Boolean.valueOf(z2)}, -674985234);
    }

    public static void e(Context context, boolean z2) {
        d(-1868685366, nf.a.e(), nf.a.e(), nf.a.e(), nf.a.e(), new Object[]{context, Boolean.valueOf(z2)}, 1868685371);
    }

    public static String d() {
        int i2 = w + 95;
        u = i2 % 128;
        if (i2 % 2 == 0) {
            return o;
        }
        throw null;
    }

    private static void d(String str) {
        w = (u + 57) % 128;
        if (h == c.VALIDATED) {
            return;
        }
        bb.a("***********************************************************************************************************************************");
        StringBuilder sb = new StringBuilder("* WARNING: ");
        sb.append(str);
        sb.append(" called in incorrect and unsupported fashion. Any usage outside the following conditions will cause unpredictable and undesirable results: *");
        bb.a(sb.toString());
        StringBuilder sb2 = new StringBuilder("* 1. ");
        sb2.append(str);
        sb2.append(" MUST BE called after the successful initialization. Calling this API at any other time is not supported and will not function properly. *");
        bb.a(sb2.toString());
        StringBuilder sb3 = new StringBuilder("* 2. ");
        sb3.append(str);
        sb3.append(" CANNOT called when a FaceTecSession is already in progress.                                                  *");
        bb.a(sb3.toString());
        bb.a("***********************************************************************************************************************************");
        int i2 = w + 67;
        u = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 51 / 0;
        }
    }
}