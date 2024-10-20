package deob;

@ObfuscatedName("jx")
public class class241 {

    @ObfuscatedName("jx.ac")
    public static int[] field2555 = new int[65536];

    @ObfuscatedName("jx.al")
    public static int[] field2552 = new int[512];

    @ObfuscatedName("jx.ak")
    public static int[] field2556 = new int[2048];

    @ObfuscatedName("jx.ax")
    public static int[] field2553 = new int[2048];

    @ObfuscatedName("jx.ao")
    public static int[] field2554 = new int[2048];

    @ObfuscatedName("jx.ah")
    public static class259 field2551;

    @ObfuscatedName("jx.ar")
    public static class243 field2557;

    @ObfuscatedName("jx.ab")
    public static final class243 field2550;

    @ObfuscatedName("jx.am")
    public static final class243 field2558;

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field2552[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field2556[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field2553[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
            field2554[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
        }
        field2551 = new class259();
        field2550 = new class258(field2551);
        field2558 = new class260(field2551);
        field2557 = field2550;
    }

    public class241() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jx.ac(Z)V")
    public static void method4153(boolean arg0) {
        if (arg0 && Statics.field5210 != null) {
            field2557 = field2558;
        } else {
            field2557 = field2550;
        }
    }

    @ObfuscatedName("jx.al(Lkg;)V")
    public static void method4154(class263 arg0) {
        field2551.field2837 = arg0;
    }

    @ObfuscatedName("jx.ak(D)V")
    public static void method4152(double arg0) {
        method4155(arg0, 0, 512);
    }

    @ObfuscatedName("jx.ax(DII)V")
    public static void method4155(double arg0, int arg1, int arg2) {
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
                int var33 = method4156(var32, arg0);
                if (var33 == 0) {
                    var33 = 1;
                }
                field2555[var4++] = var33;
            }
        }
    }

    @ObfuscatedName("jx.ao(ID)I")
    public static int method4156(int arg0, double arg1) {
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

    @ObfuscatedName("jx.ah()I")
    public static int method4202() {
        return field2551.field2849;
    }

    @ObfuscatedName("jx.ar()I")
    public static int method4201() {
        return field2551.field2844;
    }

    @ObfuscatedName("jx.ab()I")
    public static int method4159() {
        return field2551.field2847;
    }

    @ObfuscatedName("jx.am()I")
    public static int method4160() {
        return field2551.field2851;
    }

    @ObfuscatedName("jx.av()I")
    public static int method4161() {
        return field2551.field2850;
    }

    @ObfuscatedName("jx.ag()I")
    public static int method4162() {
        return field2551.field2845;
    }

    @ObfuscatedName("jx.aa()I")
    public static int method4163() {
        return field2551.field2831;
    }

    @ObfuscatedName("jx.ap()I")
    public static int method4229() {
        return field2551.field2843;
    }

    @ObfuscatedName("jx.ay([III[F)V")
    public static void method4165(int[] arg0, int arg1, int arg2, float[] arg3) {
        if (arg3 == null && field2558 == field2557) {
            field2557 = field2550;
        }
        field2557.method4264(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("jx.as()V")
    public static void method4170() {
        method4167(class540.field5214, class540.field5213, class540.field5215, class540.field5208);
    }

    @ObfuscatedName("jx.aj(IIII)V")
    public static void method4167(int arg0, int arg1, int arg2, int arg3) {
        field2551.field2843 = arg2 - arg0;
        field2551.field2846 = arg3 - arg1;
        method4168();
        if (field2551.field2848.length < field2551.field2846) {
            field2551.field2848 = new int[class318.method3444(field2551.field2846)];
        }
        int var4 = Statics.field5207 * arg1 + arg0;
        for (int var5 = 0; var5 < field2551.field2846; var5++) {
            field2551.field2848[var5] = var4;
            var4 += Statics.field5207;
        }
    }

    @ObfuscatedName("jx.an()V")
    public static void method4168() {
        field2551.method4722();
    }

    @ObfuscatedName("jx.au(II)V")
    public static void method4169(int arg0, int arg1) {
        int var2 = field2551.field2848[0];
        int var3 = var2 / Statics.field5207;
        int var4 = var2 - Statics.field5207 * var3;
        field2551.method4721(arg0, var4, arg1, var3);
    }

    @ObfuscatedName("jx.ai(III)V")
    public static void method4193(int arg0, int arg1, int arg2) {
        field2551.method4723(arg0, arg1, arg2);
    }

    @ObfuscatedName("jx.ae(IIIIIIFFFIII)V")
    public static void method4171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
        field2557.method4262(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    @ObfuscatedName("jx.aw(IIIIIIFFFI)V")
    public static void method4200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9) {
        field2557.method4265(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @ObfuscatedName("jx.aq(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2557.method4266(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("jx.az(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2557.method4267(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("jx.at(IIIIIIFFFIIIBBBB)V")
    public static void method4192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        field2557.method4283(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

    @ObfuscatedName("jx.af(IIIIIIFFFIBBBB)V")
    public static void method4158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        field2557.method4263(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }
}
