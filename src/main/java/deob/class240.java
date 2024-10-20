package deob;

@ObfuscatedName("jw")
public class class240 {

    @ObfuscatedName("jw.ac")
    public static int[] field2587 = new int[65536];

    @ObfuscatedName("jw.ae")
    public static int[] field2585 = new int[512];

    @ObfuscatedName("jw.ag")
    public static int[] field2586 = new int[2048];

    @ObfuscatedName("jw.am")
    public static int[] field2590 = new int[2048];

    @ObfuscatedName("jw.ax")
    public static int[] field2588 = new int[2048];

    @ObfuscatedName("jw.af")
    public static class261 field2589;

    @ObfuscatedName("jw.at")
    public static class243 field2591;

    @ObfuscatedName("jw.au")
    public static final class243 field2592;

    @ObfuscatedName("jw.ar")
    public static final class243 field2584;

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field2585[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field2586[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field2590[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
            field2588[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
        }
        field2589 = new class261();
        field2592 = new class260(field2589);
        field2584 = new class262(field2589);
        field2591 = field2592;
    }

    public class240() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jw.ac(Z)V")
    public static void method4407(boolean arg0) {
        if (arg0 && Statics.field5485 != null) {
            field2591 = field2584;
        } else {
            field2591 = field2592;
        }
    }

    @ObfuscatedName("jw.ae(Lkn;)V")
    public static void method4328(class265 arg0) {
        field2589.field2905 = arg0;
    }

    @ObfuscatedName("jw.ag(D)V")
    public static void method4329(double arg0) {
        method4326(arg0, 0, 512);
    }

    @ObfuscatedName("jw.am(DII)V")
    public static void method4326(double arg0, int arg1, int arg2) {
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
                int var33 = method4402(var32, arg0);
                if (var33 == 0) {
                    var33 = 1;
                }
                field2587[var4++] = var33;
            }
        }
    }

    @ObfuscatedName("jw.ax(ID)I")
    public static int method4402(int arg0, double arg1) {
        Statics.field2593 = arg1;
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

    @ObfuscatedName("jw.aq()D")
    public static double method4332() {
        return Statics.field2593;
    }

    @ObfuscatedName("jw.af()I")
    public static int method4391() {
        return field2589.field2911;
    }

    @ObfuscatedName("jw.at()I")
    public static int method4341() {
        return field2589.field2899;
    }

    @ObfuscatedName("jw.au()I")
    public static int method4335() {
        return field2589.field2915;
    }

    @ObfuscatedName("jw.ar()I")
    public static int method4390() {
        return field2589.field2916;
    }

    @ObfuscatedName("jw.al()I")
    public static int method4358() {
        return field2589.field2914;
    }

    @ObfuscatedName("jw.ad()I")
    public static int method4338() {
        return field2589.field2917;
    }

    @ObfuscatedName("jw.ah()I")
    public static int method4339() {
        return field2589.field2919;
    }

    @ObfuscatedName("jw.ap()I")
    public static int method4411() {
        return field2589.field2913;
    }

    @ObfuscatedName("jw.ab([III[F)V")
    public static void method4342(int[] arg0, int arg1, int arg2, float[] arg3) {
        if (arg3 == null && field2591 == field2584) {
            field2591 = field2592;
        }
        field2591.method4487(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("jw.az()V")
    public static void method4386() {
        method4343(class561.field5486, class561.field5482, class561.field5487, class561.field5488);
    }

    @ObfuscatedName("jw.aa(IIII)V")
    public static void method4343(int arg0, int arg1, int arg2, int arg3) {
        field2589.field2913 = arg2 - arg0;
        field2589.field2904 = arg3 - arg1;
        method4344();
        if (field2589.field2901.length < field2589.field2904) {
            field2589.field2901 = new int[class333.method44(field2589.field2904)];
        }
        int var4 = Statics.field5483 * arg1 + arg0;
        for (int var5 = 0; var5 < field2589.field2904; var5++) {
            field2589.field2901[var5] = var4;
            var4 += Statics.field5483;
        }
    }

    @ObfuscatedName("jw.ai()V")
    public static void method4344() {
        field2589.method5005();
    }

    @ObfuscatedName("jw.ao(II)V")
    public static void method4345(int arg0, int arg1) {
        int var2 = field2589.field2901[0];
        int var3 = var2 / Statics.field5483;
        int var4 = var2 - Statics.field5483 * var3;
        field2589.method5004(arg0, var4, arg1, var3);
    }

    @ObfuscatedName("jw.as(III)V")
    public static void method4346(int arg0, int arg1, int arg2) {
        field2589.method5009(arg0, arg1, arg2);
    }

    @ObfuscatedName("jw.ay(IIIIIIFFFIII)V")
    public static void method4337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
        field2591.method4458(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    @ObfuscatedName("jw.aj(IIIIIIFFFI)V")
    public static void method4348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9) {
        field2591.method4452(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @ObfuscatedName("jw.av(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2591.method4453(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("jw.aw(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2591.method4454(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("jw.an(IIIIIIFFFIIIBBBB)V")
    public static void method4351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        field2591.method4449(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

    @ObfuscatedName("jw.ak(IIIIIIFFFIBBBB)V")
    public static void method4352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        field2591.method4472(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }
}
