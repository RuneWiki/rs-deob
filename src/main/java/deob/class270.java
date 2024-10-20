package deob;

@ObfuscatedName("kf")
public class class270 {

    @ObfuscatedName("kf.am")
    public static int[] field2807 = new int[65536];

    @ObfuscatedName("kf.ap")
    public static int[] field2804 = new int[512];

    @ObfuscatedName("kf.af")
    public static int[] field2805 = new int[2048];

    @ObfuscatedName("kf.aj")
    public static int[] field2803 = new int[2048];

    @ObfuscatedName("kf.aq")
    public static int[] field2808 = new int[2048];

    @ObfuscatedName("kf.ar")
    public static class288 field2810;

    @ObfuscatedName("kf.ag")
    public static class272 field2809;

    @ObfuscatedName("kf.ao")
    public static final class272 field2806;

    @ObfuscatedName("kf.ae")
    public static final class272 field2811;

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field2804[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field2805[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field2803[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
            field2808[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
        }
        field2810 = new class288();
        field2806 = new class287(field2810);
        field2811 = new class289(field2810);
        field2809 = field2806;
    }

    public class270() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kf.am(Z)V")
    public static void method4745(boolean arg0) {
        if (arg0 && Statics.field5254 != null) {
            field2809 = field2811;
        } else {
            field2809 = field2806;
        }
    }

    @ObfuscatedName("kf.ap(Llg;)V")
    public static void method4746(class292 arg0) {
        field2810.field3095 = arg0;
    }

    @ObfuscatedName("kf.af(D)V")
    public static void method4794(double arg0) {
        method4782(arg0, 0, 512);
    }

    @ObfuscatedName("kf.aj(DII)V")
    public static void method4782(double arg0, int arg1, int arg2) {
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
                int var33 = method4749(var32, arg0);
                if (var33 == 0) {
                    var33 = 1;
                }
                field2807[var4++] = var33;
            }
        }
    }

    @ObfuscatedName("kf.aq(ID)I")
    public static int method4749(int arg0, double arg1) {
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

    @ObfuscatedName("kf.ar()I")
    public static int method4767() {
        return field2810.field3092;
    }

    @ObfuscatedName("kf.ag()I")
    public static int method4751() {
        return field2810.field3094;
    }

    @ObfuscatedName("kf.ao()I")
    public static int method4752() {
        return field2810.field3096;
    }

    @ObfuscatedName("kf.ae()I")
    public static int method4753() {
        return field2810.field3097;
    }

    @ObfuscatedName("kf.aa()I")
    public static int method4744() {
        return field2810.field3100;
    }

    @ObfuscatedName("kf.au()I")
    public static int method4755() {
        return field2810.field3098;
    }

    @ObfuscatedName("kf.an()I")
    public static int method4818() {
        return field2810.field3093;
    }

    @ObfuscatedName("kf.ad()I")
    public static int method4757() {
        return field2810.field3080;
    }

    @ObfuscatedName("kf.ax([III[F)V")
    public static void method4806(int[] arg0, int arg1, int arg2, float[] arg3) {
        if (arg3 == null && field2811 == field2809) {
            field2809 = field2806;
        }
        field2809.method4845(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("kf.aw()V")
    public static void method4798() {
        method4760(class541.field5251, class541.field5253, class541.field5256, class541.field5248);
    }

    @ObfuscatedName("kf.az(IIII)V")
    public static void method4760(int arg0, int arg1, int arg2, int arg3) {
        field2810.field3080 = arg2 - arg0;
        field2810.field3086 = arg3 - arg1;
        method4761();
        if (field2810.field3083.length < field2810.field3086) {
            field2810.field3083 = new int[class318.method2259(field2810.field3086)];
        }
        int var4 = Statics.field5249 * arg1 + arg0;
        for (int var5 = 0; var5 < field2810.field3086; var5++) {
            field2810.field3083[var5] = var4;
            var4 += Statics.field5249;
        }
    }

    @ObfuscatedName("kf.av()V")
    public static void method4761() {
        field2810.method5291();
    }

    @ObfuscatedName("kf.ak(II)V")
    public static void method4762(int arg0, int arg1) {
        int var2 = field2810.field3083[0];
        int var3 = var2 / Statics.field5249;
        int var4 = var2 - Statics.field5249 * var3;
        field2810.method5292(arg0, var4, arg1, var3);
    }

    @ObfuscatedName("kf.ay(III)V")
    public static void method4763(int arg0, int arg1, int arg2) {
        field2810.method5300(arg0, arg1, arg2);
    }

    @ObfuscatedName("kf.as(IIIIIIFFFIII)V")
    public static void method4764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
        field2809.method4849(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    @ObfuscatedName("kf.ab(IIIIIIFFFI)V")
    public static void method4807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9) {
        field2809.method4857(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @ObfuscatedName("kf.ah(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4759(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2809.method4851(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("kf.ai(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4766(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2809.method4850(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("kf.ac(IIIIIIFFFIIIBBBB)V")
    public static void method4789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        field2809.method4848(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

    @ObfuscatedName("kf.al(IIIIIIFFFIBBBB)V")
    public static void method4768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        field2809.method4853(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }
}
