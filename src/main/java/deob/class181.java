package deob;

@ObfuscatedName("gc")
public class class181 {

    @ObfuscatedName("gc.ab")
    public static int[] field1940 = new int[65536];

    @ObfuscatedName("gc.ay")
    public static int[] field1939 = new int[512];

    @ObfuscatedName("gc.an")
    public static int[] field1938 = new int[2048];

    @ObfuscatedName("gc.au")
    public static int[] field1941 = new int[2048];

    @ObfuscatedName("gc.ax")
    public static int[] field1942 = new int[2048];

    @ObfuscatedName("gc.ao")
    public static class202 field1943;

    @ObfuscatedName("gc.am")
    public static class184 field1944;

    @ObfuscatedName("gc.ac")
    public static final class184 field1945;

    @ObfuscatedName("gc.ae")
    public static final class184 field1946;

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field1939[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field1938[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field1941[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
            field1942[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
        }
        field1943 = new class202();
        field1945 = new class201(field1943);
        field1946 = new class203(field1943);
        field1944 = field1945;
    }

    public class181() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gc.ab(Z)V")
    public static void method3437(boolean arg0) {
        if (arg0 && Statics.field5450 != null) {
            field1944 = field1946;
        } else {
            field1944 = field1945;
        }
    }

    @ObfuscatedName("gc.ay(Lhw;)V")
    public static void method3460(class206 arg0) {
        field1943.field2264 = arg0;
    }

    @ObfuscatedName("gc.an(D)V")
    public static void method3439(double arg0) {
        method3440(arg0, 0, 512);
    }

    @ObfuscatedName("gc.au(DII)V")
    public static void method3440(double arg0, int arg1, int arg2) {
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
                int var33 = method3441(var32, arg0);
                if (var33 == 0) {
                    var33 = 1;
                }
                field1940[var4++] = var33;
            }
        }
    }

    @ObfuscatedName("gc.ax(ID)I")
    public static int method3441(int arg0, double arg1) {
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

    @ObfuscatedName("gc.ao()I")
    public static int method3438() {
        return field1943.field2270;
    }

    @ObfuscatedName("gc.am()I")
    public static int method3512() {
        return field1943.field2271;
    }

    @ObfuscatedName("gc.ac()I")
    public static int method3486() {
        return field1943.field2274;
    }

    @ObfuscatedName("gc.ae()I")
    public static int method3480() {
        return field1943.field2268;
    }

    @ObfuscatedName("gc.ad()I")
    public static int method3445() {
        return field1943.field2275;
    }

    @ObfuscatedName("gc.aq()I")
    public static int method3469() {
        return field1943.field2260;
    }

    @ObfuscatedName("gc.al()I")
    public static int method3447() {
        return field1943.field2263;
    }

    @ObfuscatedName("gc.aj()I")
    public static int method3448() {
        return field1943.field2272;
    }

    @ObfuscatedName("gc.as([III[F)V")
    public static void method3449(int[] arg0, int arg1, int arg2, float[] arg3) {
        if (arg3 == null && field1946 == field1944) {
            field1944 = field1945;
        }
        field1944.method3553(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("gc.aw()V")
    public static void method3483() {
        method3451(class559.field5447, class559.field5449, class559.field5455, class559.field5454);
    }

    @ObfuscatedName("gc.af(IIII)V")
    public static void method3451(int arg0, int arg1, int arg2, int arg3) {
        field1943.field2272 = arg2 - arg0;
        field1943.field2277 = arg3 - arg1;
        method3452();
        if (field1943.field2278.length < field1943.field2277) {
            field1943.field2278 = new int[class331.method5556(field1943.field2277)];
        }
        int var4 = Statics.field5448 * arg1 + arg0;
        for (int var5 = 0; var5 < field1943.field2277; var5++) {
            field1943.field2278[var5] = var4;
            var4 += Statics.field5448;
        }
    }

    @ObfuscatedName("gc.aa()V")
    public static void method3452() {
        field1943.method4073();
    }

    @ObfuscatedName("gc.ah(II)V")
    public static void method3453(int arg0, int arg1) {
        int var2 = field1943.field2278[0];
        int var3 = var2 / Statics.field5448;
        int var4 = var2 - Statics.field5448 * var3;
        field1943.method4079(arg0, var4, arg1, var3);
    }

    @ObfuscatedName("gc.ag(III)V")
    public static void method3454(int arg0, int arg1, int arg2) {
        field1943.method4075(arg0, arg1, arg2);
    }

    @ObfuscatedName("gc.av(IIIIIIFFFIII)V")
    public static void method3500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
        field1944.method3558(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    @ObfuscatedName("gc.ar(IIIIIIFFFI)V")
    public static void method3456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9) {
        field1944.method3569(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @ObfuscatedName("gc.ap(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method3450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field1944.method3573(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("gc.ak(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method3458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field1944.method3582(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("gc.ai(IIIIIIFFFIIIBBBB)V")
    public static void method3459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        field1944.method3564(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

    @ObfuscatedName("gc.at(IIIIIIFFFIBBBB)V")
    public static void method3446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        field1944.method3557(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }
}
