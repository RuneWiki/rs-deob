package deob;

@ObfuscatedName("jm")
public class class240 {

    @ObfuscatedName("jm.ap")
    public static int[] field2595 = new int[65536];

    @ObfuscatedName("jm.aw")
    public static int[] field2593 = new int[512];

    @ObfuscatedName("jm.ak")
    public static int[] field2590 = new int[2048];

    @ObfuscatedName("jm.aj")
    public static int[] field2591 = new int[2048];

    @ObfuscatedName("jm.ai")
    public static int[] field2592 = new int[2048];

    @ObfuscatedName("jm.as")
    public static class261 field2589;

    @ObfuscatedName("jm.ae")
    public static class243 field2588;

    @ObfuscatedName("jm.am")
    public static final class243 field2594;

    @ObfuscatedName("jm.at")
    public static final class243 field2597;

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field2593[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field2590[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field2591[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
            field2592[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
        }
        field2589 = new class261();
        field2594 = new class260(field2589);
        field2597 = new class262(field2589);
        field2588 = field2594;
    }

    public class240() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jm.ap(Z)V")
    public static void method4549(boolean arg0) {
        if (arg0 && Statics.field5534 != null) {
            field2588 = field2597;
        } else {
            field2588 = field2594;
        }
    }

    @ObfuscatedName("jm.aw(Lkn;)V")
    public static void method4493(class265 arg0) {
        field2589.field2913 = arg0;
    }

    @ObfuscatedName("jm.ak(D)V")
    public static void method4494(double arg0) {
        method4495(arg0, 0, 512);
    }

    @ObfuscatedName("jm.aj(DII)V")
    public static void method4495(double arg0, int arg1, int arg2) {
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
                int var33 = method4496(var32, arg0);
                if (var33 == 0) {
                    var33 = 1;
                }
                field2595[var4++] = var33;
            }
        }
    }

    @ObfuscatedName("jm.ai(ID)I")
    public static int method4496(int arg0, double arg1) {
        Statics.field2596 = arg1;
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

    @ObfuscatedName("jm.ay()D")
    public static double method4497() {
        return Statics.field2596;
    }

    @ObfuscatedName("jm.as()I")
    public static int method4498() {
        return field2589.field2919;
    }

    @ObfuscatedName("jm.ae()I")
    public static int method4499() {
        return field2589.field2928;
    }

    @ObfuscatedName("jm.am()I")
    public static int method4500() {
        return field2589.field2929;
    }

    @ObfuscatedName("jm.at()I")
    public static int method4557() {
        return field2589.field2930;
    }

    @ObfuscatedName("jm.au()I")
    public static int method4543() {
        return field2589.field2932;
    }

    @ObfuscatedName("jm.an()I")
    public static int method4503() {
        return field2589.field2931;
    }

    @ObfuscatedName("jm.ao()I")
    public static int method4504() {
        return field2589.field2918;
    }

    @ObfuscatedName("jm.af()I")
    public static int method4533() {
        return field2589.field2927;
    }

    @ObfuscatedName("jm.ar([III[F)V")
    public static void method4506(int[] arg0, int arg1, int arg2, float[] arg3) {
        if (arg3 == null && field2597 == field2588) {
            field2588 = field2594;
        }
        field2588.method4620(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("jm.ab()V")
    public static void method4580() {
        method4550(class568.field5538, class568.field5536, class568.field5539, class568.field5537);
    }

    @ObfuscatedName("jm.az(IIII)V")
    public static void method4550(int arg0, int arg1, int arg2, int arg3) {
        field2589.field2927 = arg2 - arg0;
        field2589.field2923 = arg3 - arg1;
        method4508();
        if (field2589.field2926.length < field2589.field2923) {
            field2589.field2926 = new int[class332.method2832(field2589.field2923)];
        }
        int var4 = Statics.field5532 * arg1 + arg0;
        for (int var5 = 0; var5 < field2589.field2923; var5++) {
            field2589.field2926[var5] = var4;
            var4 += Statics.field5532;
        }
    }

    @ObfuscatedName("jm.ag()V")
    public static void method4508() {
        field2589.method5173();
    }

    @ObfuscatedName("jm.ad(II)V")
    public static void method4516(int arg0, int arg1) {
        int var2 = field2589.field2926[0];
        int var3 = var2 / Statics.field5532;
        int var4 = var2 - Statics.field5532 * var3;
        field2589.method5166(arg0, var4, arg1, var3);
    }

    @ObfuscatedName("jm.ac(III)V")
    public static void method4510(int arg0, int arg1, int arg2) {
        field2589.method5168(arg0, arg1, arg2);
    }

    @ObfuscatedName("jm.av(IIIIIIFFFIII)V")
    public static void method4511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
        field2588.method4654(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    @ObfuscatedName("jm.ax(IIIIIIFFFI)V")
    public static void method4512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9) {
        field2588.method4626(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @ObfuscatedName("jm.aq(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2588.method4645(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("jm.al(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2588.method4627(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("jm.aa(IIIIIIFFFIIIBBBB)V")
    public static void method4515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        field2588.method4623(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

    @ObfuscatedName("jm.ah(IIIIIIFFFIBBBB)V")
    public static void method4509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        field2588.method4624(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }
}
