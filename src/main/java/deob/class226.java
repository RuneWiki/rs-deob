package deob;

@ObfuscatedName("iv")
public class class226 {

    @ObfuscatedName("iv.at")
    public static int[] field2516 = new int[65536];

    @ObfuscatedName("iv.an")
    public static int[] field2519 = new int[512];

    @ObfuscatedName("iv.av")
    public static int[] field2518 = new int[2048];

    @ObfuscatedName("iv.as")
    public static int[] field2523 = new int[2048];

    @ObfuscatedName("iv.ax")
    public static int[] field2520 = new int[2048];

    @ObfuscatedName("iv.ap")
    public static class244 field2521;

    @ObfuscatedName("iv.ab")
    public static class228 field2522;

    @ObfuscatedName("iv.ak")
    public static final class228 field2517;

    @ObfuscatedName("iv.ae")
    public static final class228 field2524;

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field2519[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field2518[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field2523[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
            field2520[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
        }
        field2521 = new class244();
        field2517 = new class243(field2521);
        field2524 = new class245(field2521);
        field2522 = field2517;
    }

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iv.at(Z)V")
    public static void method4056(boolean arg0) {
        if (arg0 && Statics.field5089 != null) {
            field2522 = field2524;
        } else {
            field2522 = field2517;
        }
    }

    @ObfuscatedName("iv.an(Ljb;)V")
    public static void method4011(class248 arg0) {
        field2521.field2793 = arg0;
    }

    @ObfuscatedName("iv.av(D)V")
    public static void method4012(double arg0) {
        method4013(arg0, 0, 512);
    }

    @ObfuscatedName("iv.as(DII)V")
    public static void method4013(double arg0, int arg1, int arg2) {
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
                int var33 = method4035(var32, arg0);
                if (var33 == 0) {
                    var33 = 1;
                }
                field2516[var4++] = var33;
            }
        }
    }

    @ObfuscatedName("iv.ax(ID)I")
    public static int method4035(int arg0, double arg1) {
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

    @ObfuscatedName("iv.ap()I")
    public static int method4015() {
        return field2521.field2804;
    }

    @ObfuscatedName("iv.ab()I")
    public static int method4016() {
        return field2521.field2805;
    }

    @ObfuscatedName("iv.ak()I")
    public static int method4017() {
        return field2521.field2798;
    }

    @ObfuscatedName("iv.ae()I")
    public static int method4018() {
        return field2521.field2809;
    }

    @ObfuscatedName("iv.af()I")
    public static int method4021() {
        return field2521.field2811;
    }

    @ObfuscatedName("iv.ao()I")
    public static int method4058() {
        return field2521.field2810;
    }

    @ObfuscatedName("iv.aa()I")
    public static int method4014() {
        return field2521.field2797;
    }

    @ObfuscatedName("iv.aj()I")
    public static int method4028() {
        return field2521.field2801;
    }

    @ObfuscatedName("iv.ad([III[F)V")
    public static void method4023(int[] arg0, int arg1, int arg2, float[] arg3) {
        if (arg3 == null && field2524 == field2522) {
            field2522 = field2517;
        }
        field2522.method4110(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("iv.ac()V")
    public static void method4022() {
        method4054(class511.field5093, class511.field5087, class511.field5094, class511.field5092);
    }

    @ObfuscatedName("iv.ag(IIII)V")
    public static void method4054(int arg0, int arg1, int arg2, int arg3) {
        field2521.field2801 = arg2 - arg0;
        field2521.field2807 = arg3 - arg1;
        method4026();
        if (field2521.field2812.length < field2521.field2807) {
            field2521.field2812 = new int[class303.method2820(field2521.field2807)];
        }
        int var4 = Statics.field5086 * arg1 + arg0;
        for (int var5 = 0; var5 < field2521.field2807; var5++) {
            field2521.field2812[var5] = var4;
            var4 += Statics.field5086;
        }
    }

    @ObfuscatedName("iv.ar()V")
    public static void method4026() {
        field2521.method4574();
    }

    @ObfuscatedName("iv.ah(II)V")
    public static void method4027(int arg0, int arg1) {
        int var2 = field2521.field2812[0];
        int var3 = var2 / Statics.field5086;
        int var4 = var2 - Statics.field5086 * var3;
        field2521.method4575(arg0, var4, arg1, var3);
    }

    @ObfuscatedName("iv.az(III)V")
    public static void method4047(int arg0, int arg1, int arg2) {
        field2521.method4573(arg0, arg1, arg2);
    }

    @ObfuscatedName("iv.au(IIIIIIFFFIII)V")
    public static void method4029(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
        field2522.method4115(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    @ObfuscatedName("iv.ai(IIIIIIFFFI)V")
    public static void method4030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9) {
        field2522.method4116(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @ObfuscatedName("iv.aq(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4031(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2522.method4117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("iv.aw(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4020(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2522.method4118(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("iv.ay(IIIIIIFFFIIIBBBB)V")
    public static void method4033(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        field2522.method4134(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

    @ObfuscatedName("iv.al(IIIIIIFFFIBBBB)V")
    public static void method4034(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        field2522.method4112(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }
}
