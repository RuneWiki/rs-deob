package deob;

@ObfuscatedName("ki")
public class class267 {

    @ObfuscatedName("ki.at")
    public static int[] field2772 = new int[65536];

    @ObfuscatedName("ki.ah")
    public static int[] field2770 = new int[512];

    @ObfuscatedName("ki.ar")
    public static int[] field2776 = new int[2048];

    @ObfuscatedName("ki.ao")
    public static int[] field2771 = new int[2048];

    @ObfuscatedName("ki.ab")
    public static int[] field2769 = new int[2048];

    @ObfuscatedName("ki.au")
    public static class285 field2773;

    @ObfuscatedName("ki.aa")
    public static class269 field2774;

    @ObfuscatedName("ki.ac")
    public static final class269 field2768;

    @ObfuscatedName("ki.al")
    public static final class269 field2775;

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field2770[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field2776[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field2771[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
            field2769[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
        }
        field2773 = new class285();
        field2768 = new class284(field2773);
        field2775 = new class286(field2773);
        field2774 = field2768;
    }

    public class267() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ki.at(Z)V")
    public static void method4660(boolean arg0) {
        if (arg0 && Statics.field5210 != null) {
            field2774 = field2775;
        } else {
            field2774 = field2768;
        }
    }

    @ObfuscatedName("ki.ah(Llw;)V")
    public static void method4675(class289 arg0) {
        field2773.field3043 = arg0;
    }

    @ObfuscatedName("ki.ar(D)V")
    public static void method4662(double arg0) {
        method4663(arg0, 0, 512);
    }

    @ObfuscatedName("ki.ao(DII)V")
    public static void method4663(double arg0, int arg1, int arg2) {
        int var4 = arg1 * 128;
        for (int var5 = arg1; var5 < arg2; var5++) {
            double var6 = (double) (var5 >> 3) / 64.0D + 0.0078125D;
            double var8 = (double) (var5 & 0x7) / 8.0D + 0.0625D;
            for (int var10 = 0; var10 < 128; var10++) {
                double var11 = (double) var10 / 128.0D;
                double var13 = var11;
                double var15 = var11;
                double var17 = var11;
                if (var8 != 0.0D) {
                    double var19;
                    if (var11 < 0.5D) {
                        var19 = (var8 + 1.0D) * var11;
                    } else {
                        var19 = var8 + var11 - var8 * var11;
                    }
                    double var21 = var11 * 2.0D - var19;
                    double var23 = var6 + 0.3333333333333333D;
                    if (var23 > 1.0D) {
                        var23--;
                    }
                    double var27 = var6 - 0.3333333333333333D;
                    if (var27 < 0.0D) {
                        var27++;
                    }
                    if (var23 * 6.0D < 1.0D) {
                        var13 = (var19 - var21) * 6.0D * var23 + var21;
                    } else if (var23 * 2.0D < 1.0D) {
                        var13 = var19;
                    } else if (var23 * 3.0D < 2.0D) {
                        var13 = (var19 - var21) * (0.6666666666666666D - var23) * 6.0D + var21;
                    } else {
                        var13 = var21;
                    }
                    if (var6 * 6.0D < 1.0D) {
                        var15 = (var19 - var21) * 6.0D * var6 + var21;
                    } else if (var6 * 2.0D < 1.0D) {
                        var15 = var19;
                    } else if (var6 * 3.0D < 2.0D) {
                        var15 = (var19 - var21) * (0.6666666666666666D - var6) * 6.0D + var21;
                    } else {
                        var15 = var21;
                    }
                    if (var27 * 6.0D < 1.0D) {
                        var17 = (var19 - var21) * 6.0D * var27 + var21;
                    } else if (var27 * 2.0D < 1.0D) {
                        var17 = var19;
                    } else if (var27 * 3.0D < 2.0D) {
                        var17 = (var19 - var21) * (0.6666666666666666D - var27) * 6.0D + var21;
                    } else {
                        var17 = var21;
                    }
                }
                int var29 = (int) (var13 * 256.0D);
                int var30 = (int) (var15 * 256.0D);
                int var31 = (int) (var17 * 256.0D);
                int var32 = (var29 << 16) + (var30 << 8) + var31;
                int var33 = method4659(var32, arg0);
                if (var33 == 0) {
                    var33 = 1;
                }
                field2772[var4++] = var33;
            }
        }
    }

    @ObfuscatedName("ki.ab(ID)I")
    public static int method4659(int arg0, double arg1) {
        double var3 = (double) (arg0 >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = Math.pow(var3, arg1);
        double var11 = Math.pow(var5, arg1);
        double var13 = Math.pow(var7, arg1);
        int var15 = (int) (var9 * 256.0D);
        int var16 = (int) (var11 * 256.0D);
        int var17 = (int) (var13 * 256.0D);
        return (var15 << 16) + (var16 << 8) + var17;
    }

    @ObfuscatedName("ki.au()I")
    public static int method4665() {
        return field2773.field3038;
    }

    @ObfuscatedName("ki.aa()I")
    public static int method4666() {
        return field2773.field3050;
    }

    @ObfuscatedName("ki.ac()I")
    public static int method4669() {
        return field2773.field3053;
    }

    @ObfuscatedName("ki.al()I")
    public static int method4668() {
        return field2773.field3054;
    }

    @ObfuscatedName("ki.az()I")
    public static int method4673() {
        return field2773.field3056;
    }

    @ObfuscatedName("ki.ap()I")
    public static int method4670() {
        return field2773.field3055;
    }

    @ObfuscatedName("ki.av()I")
    public static int method4671() {
        return field2773.field3042;
    }

    @ObfuscatedName("ki.ax()I")
    public static int method4708() {
        return field2773.field3051;
    }

    @ObfuscatedName("ki.as([III[F)V")
    public static void method4734(int[] arg0, int arg1, int arg2, float[] arg3) {
        if (arg3 == null && field2775 == field2774) {
            field2774 = field2768;
        }
        field2774.method4757(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ki.ay()V")
    public static void method4674() {
        method4689(class537.field5214, class537.field5212, class537.field5211, class537.field5213);
    }

    @ObfuscatedName("ki.ak(IIII)V")
    public static void method4689(int arg0, int arg1, int arg2, int arg3) {
        field2773.field3051 = arg2 - arg0;
        field2773.field3040 = arg3 - arg1;
        method4676();
        if (field2773.field3048.length < field2773.field3040) {
            field2773.field3048 = new int[class315.method3369(field2773.field3040)];
        }
        int var4 = Statics.field5208 * arg1 + arg0;
        for (int var5 = 0; var5 < field2773.field3040; var5++) {
            field2773.field3048[var5] = var4;
            var4 += Statics.field5208;
        }
    }

    @ObfuscatedName("ki.aj()V")
    public static void method4676() {
        field2773.method5179();
    }

    @ObfuscatedName("ki.am(II)V")
    public static void method4677(int arg0, int arg1) {
        int var2 = field2773.field3048[0];
        int var3 = var2 / Statics.field5208;
        int var4 = var2 - Statics.field5208 * var3;
        field2773.method5180(arg0, var4, arg1, var3);
    }

    @ObfuscatedName("ki.aq(III)V")
    public static void method4678(int arg0, int arg1, int arg2) {
        field2773.method5181(arg0, arg1, arg2);
    }

    @ObfuscatedName("ki.ai(IIIIIIFFFIII)V")
    public static void method4685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
        field2774.method4761(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    @ObfuscatedName("ki.aw(IIIIIIFFFI)V")
    public static void method4680(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9) {
        field2774.method4763(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @ObfuscatedName("ki.ae(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2774.method4764(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("ki.an(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4682(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2774.method4765(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("ki.ag(IIIIIIFFFIIIBBBB)V")
    public static void method4683(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        field2774.method4759(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

    @ObfuscatedName("ki.ad(IIIIIIFFFIBBBB)V")
    public static void method4684(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        field2774.method4762(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }
}
