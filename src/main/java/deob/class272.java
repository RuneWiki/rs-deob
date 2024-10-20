package deob;

@ObfuscatedName("km")
public class class272 {

    @ObfuscatedName("km.aq")
    public static int[] field2817 = new int[65536];

    @ObfuscatedName("km.aw")
    public static int[] field2823 = new int[512];

    @ObfuscatedName("km.al")
    public static int[] field2818 = new int[2048];

    @ObfuscatedName("km.ai")
    public static int[] field2819 = new int[2048];

    @ObfuscatedName("km.ar")
    public static int[] field2820 = new int[2048];

    @ObfuscatedName("km.as")
    public static class290 field2821;

    @ObfuscatedName("km.aa")
    public static class274 field2822;

    @ObfuscatedName("km.az")
    public static final class274 field2816;

    @ObfuscatedName("km.ao")
    public static final class274 field2824;

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field2823[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field2818[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field2819[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
            field2820[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
        }
        field2821 = new class290();
        field2816 = new class289(field2821);
        field2824 = new class291(field2821);
        field2822 = field2816;
    }

    public class272() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("km.aq(Z)V")
    public static void method4747(boolean arg0) {
        if (arg0 && Statics.field5270 != null) {
            field2822 = field2824;
        } else {
            field2822 = field2816;
        }
    }

    @ObfuscatedName("km.aw(Llo;)V")
    public static void method4813(class294 arg0) {
        field2821.field3091 = arg0;
    }

    @ObfuscatedName("km.al(D)V")
    public static void method4749(double arg0) {
        method4750(arg0, 0, 512);
    }

    @ObfuscatedName("km.ai(DII)V")
    public static void method4750(double arg0, int arg1, int arg2) {
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
                int var33 = method4751(var32, arg0);
                if (var33 == 0) {
                    var33 = 1;
                }
                field2817[var4++] = var33;
            }
        }
    }

    @ObfuscatedName("km.ar(ID)I")
    public static int method4751(int arg0, double arg1) {
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

    @ObfuscatedName("km.as()I")
    public static int method4752() {
        return field2821.field3097;
    }

    @ObfuscatedName("km.aa()I")
    public static int method4768() {
        return field2821.field3098;
    }

    @ObfuscatedName("km.az()I")
    public static int method4767() {
        return field2821.field3103;
    }

    @ObfuscatedName("km.ao()I")
    public static int method4805() {
        return field2821.field3088;
    }

    @ObfuscatedName("km.au()I")
    public static int method4756() {
        return field2821.field3104;
    }

    @ObfuscatedName("km.ak()I")
    public static int method4757() {
        return field2821.field3102;
    }

    @ObfuscatedName("km.ah()I")
    public static int method4771() {
        return field2821.field3090;
    }

    @ObfuscatedName("km.aj()I")
    public static int method4759() {
        return field2821.field3085;
    }

    @ObfuscatedName("km.af([III[F)V")
    public static void method4760(int[] arg0, int arg1, int arg2, float[] arg3) {
        if (arg3 == null && field2824 == field2822) {
            field2822 = field2816;
        }
        field2822.method4852(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("km.ax()V")
    public static void method4761() {
        method4762(class544.field5273, class544.field5277, class544.field5278, class544.field5274);
    }

    @ObfuscatedName("km.an(IIII)V")
    public static void method4762(int arg0, int arg1, int arg2, int arg3) {
        field2821.field3085 = arg2 - arg0;
        field2821.field3089 = arg3 - arg1;
        method4763();
        if (field2821.field3105.length < field2821.field3089) {
            field2821.field3105 = new int[class320.method5477(field2821.field3089)];
        }
        int var4 = Statics.field5271 * arg1 + arg0;
        for (int var5 = 0; var5 < field2821.field3089; var5++) {
            field2821.field3105[var5] = var4;
            var4 += Statics.field5271;
        }
    }

    @ObfuscatedName("km.ag()V")
    public static void method4763() {
        field2821.method5320();
    }

    @ObfuscatedName("km.am(II)V")
    public static void method4746(int arg0, int arg1) {
        int var2 = field2821.field3105[0];
        int var3 = var2 / Statics.field5271;
        int var4 = var2 - Statics.field5271 * var3;
        field2821.method5319(arg0, var4, arg1, var3);
    }

    @ObfuscatedName("km.ad(III)V")
    public static void method4765(int arg0, int arg1, int arg2) {
        field2821.method5321(arg0, arg1, arg2);
    }

    @ObfuscatedName("km.at(IIIIIIFFFIII)V")
    public static void method4766(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
        field2822.method4849(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    @ObfuscatedName("km.ay(IIIIIIFFFI)V")
    public static void method4775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9) {
        field2822.method4850(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @ObfuscatedName("km.ae(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4754(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2822.method4871(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("km.ac(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2822.method4845(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("km.ab(IIIIIIFFFIIIBBBB)V")
    public static void method4770(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        field2822.method4847(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

    @ObfuscatedName("km.av(IIIIIIFFFIBBBB)V")
    public static void method4753(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        field2822.method4851(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }
}
