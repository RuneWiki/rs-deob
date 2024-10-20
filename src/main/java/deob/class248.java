package deob;

@ObfuscatedName("js")
public class class248 {

    @ObfuscatedName("js.ak")
    public static int[] field2666 = new int[65536];

    @ObfuscatedName("js.al")
    public static int[] field2673 = new int[512];

    @ObfuscatedName("js.aj")
    public static int[] field2667 = new int[2048];

    @ObfuscatedName("js.az")
    public static int[] field2665 = new int[2048];

    @ObfuscatedName("js.af")
    public static int[] field2669 = new int[2048];

    @ObfuscatedName("js.aa")
    public static class269 field2670;

    @ObfuscatedName("js.at")
    public static class251 field2671;

    @ObfuscatedName("js.ab")
    public static final class251 field2672;

    @ObfuscatedName("js.ac")
    public static final class251 field2668;

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field2673[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field2667[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field2665[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
            field2669[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
        }
        field2670 = new class269();
        field2672 = new class268(field2670);
        field2668 = new class270(field2670);
        field2671 = field2672;
    }

    public class248() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("js.ak(Z)V")
    public static void method4348(boolean arg0) {
        if (arg0 && Statics.field5416 != null) {
            field2671 = field2668;
        } else {
            field2671 = field2672;
        }
    }

    @ObfuscatedName("js.al(Lkc;)V")
    public static void method4330(class273 arg0) {
        field2670.field2978 = arg0;
    }

    @ObfuscatedName("js.aj(D)V")
    public static void method4331(double arg0) {
        method4332(arg0, 0, 512);
    }

    @ObfuscatedName("js.az(DII)V")
    public static void method4332(double arg0, int arg1, int arg2) {
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
                int var33 = method4364(var32, arg0);
                if (var33 == 0) {
                    var33 = 1;
                }
                field2666[var4++] = var33;
            }
        }
    }

    @ObfuscatedName("js.af(ID)I")
    public static int method4364(int arg0, double arg1) {
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

    @ObfuscatedName("js.aa()I")
    public static int method4352() {
        return field2670.field2983;
    }

    @ObfuscatedName("js.at()I")
    public static int method4335() {
        return field2670.field2985;
    }

    @ObfuscatedName("js.ab()I")
    public static int method4387() {
        return field2670.field2972;
    }

    @ObfuscatedName("js.ac()I")
    public static int method4336() {
        return field2670.field2989;
    }

    @ObfuscatedName("js.ao()I")
    public static int method4337() {
        return field2670.field2991;
    }

    @ObfuscatedName("js.ah()I")
    public static int method4401() {
        return field2670.field2990;
    }

    @ObfuscatedName("js.av()I")
    public static int method4339() {
        return field2670.field2977;
    }

    @ObfuscatedName("js.aq()I")
    public static int method4410() {
        return field2670.field2986;
    }

    @ObfuscatedName("js.ap([III[F)V")
    public static void method4341(int[] arg0, int arg1, int arg2, float[] arg3) {
        if (arg3 == null && field2671 == field2668) {
            field2671 = field2672;
        }
        field2671.method4449(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("js.ae()V")
    public static void method4398() {
        method4343(class556.field5419, class556.field5417, class556.field5420, class556.field5414);
    }

    @ObfuscatedName("js.ax(IIII)V")
    public static void method4343(int arg0, int arg1, int arg2, int arg3) {
        field2670.field2986 = arg2 - arg0;
        field2670.field2987 = arg3 - arg1;
        method4344();
        if (field2670.field2992.length < field2670.field2987) {
            field2670.field2992 = new int[Statics.method4498(field2670.field2987)];
        }
        int var4 = Statics.field5418 * arg1 + arg0;
        for (int var5 = 0; var5 < field2670.field2987; var5++) {
            field2670.field2992[var5] = var4;
            var4 += Statics.field5418;
        }
    }

    @ObfuscatedName("js.ay()V")
    public static void method4344() {
        field2670.method4978();
    }

    @ObfuscatedName("js.au(II)V")
    public static void method4345(int arg0, int arg1) {
        int var2 = field2670.field2992[0];
        int var3 = var2 / Statics.field5418;
        int var4 = var2 - Statics.field5418 * var3;
        field2670.method4977(arg0, var4, arg1, var3);
    }

    @ObfuscatedName("js.as(III)V")
    public static void method4328(int arg0, int arg1, int arg2) {
        field2670.method4980(arg0, arg1, arg2);
    }

    @ObfuscatedName("js.aw(IIIIIIFFFIII)V")
    public static void method4347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
        field2671.method4461(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    @ObfuscatedName("js.ad(IIIIIIFFFI)V")
    public static void method4378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9) {
        field2671.method4455(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @ObfuscatedName("js.ai(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2671.method4456(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("js.an(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2671.method4457(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("js.am(IIIIIIFFFIIIBBBB)V")
    public static void method4351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        field2671.method4452(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

    @ObfuscatedName("js.ar(IIIIIIFFFIBBBB)V")
    public static void method4389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        field2671.method4453(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }
}
