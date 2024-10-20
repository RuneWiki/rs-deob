package deob;

@ObfuscatedName("jz")
public class class243 {

    @ObfuscatedName("jz.az")
    public static int[] field2611 = new int[65536];

    @ObfuscatedName("jz.ah")
    public static int[] field2609 = new int[512];

    @ObfuscatedName("jz.af")
    public static int[] field2610 = new int[2048];

    @ObfuscatedName("jz.at")
    public static int[] field2616 = new int[2048];

    @ObfuscatedName("jz.an")
    public static int[] field2613 = new int[2048];

    @ObfuscatedName("jz.ao")
    public static class261 field2612;

    @ObfuscatedName("jz.ab")
    public static class245 field2614;

    @ObfuscatedName("jz.aw")
    public static final class245 field2615;

    @ObfuscatedName("jz.ad")
    public static final class245 field2608;

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field2609[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field2610[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field2616[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
            field2613[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
        }
        field2612 = new class261();
        field2615 = new class260(field2612);
        field2608 = new class262(field2612);
        field2614 = field2615;
    }

    public class243() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jz.az(Z)V")
    public static void method4200(boolean arg0) {
        if (arg0 && Statics.field5305 != null) {
            field2614 = field2608;
        } else {
            field2614 = field2615;
        }
    }

    @ObfuscatedName("jz.ah(Lkd;)V")
    public static void method4249(class265 arg0) {
        field2612.field2901 = arg0;
    }

    @ObfuscatedName("jz.af(D)V")
    public static void method4202(double arg0) {
        method4259(arg0, 0, 512);
    }

    @ObfuscatedName("jz.at(DII)V")
    public static void method4259(double arg0, int arg1, int arg2) {
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
                int var33 = method4204(var32, arg0);
                if (var33 == 0) {
                    var33 = 1;
                }
                field2611[var4++] = var33;
            }
        }
    }

    @ObfuscatedName("jz.an(ID)I")
    public static int method4204(int arg0, double arg1) {
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

    @ObfuscatedName("jz.ao()I")
    public static int method4205() {
        return field2612.field2897;
    }

    @ObfuscatedName("jz.ab()I")
    public static int method4206() {
        return field2612.field2898;
    }

    @ObfuscatedName("jz.aw()I")
    public static int method4207() {
        return field2612.field2899;
    }

    @ObfuscatedName("jz.ad()I")
    public static int method4208() {
        return field2612.field2891;
    }

    @ObfuscatedName("jz.al()I")
    public static int method4241() {
        return field2612.field2904;
    }

    @ObfuscatedName("jz.as()I")
    public static int method4228() {
        return field2612.field2903;
    }

    @ObfuscatedName("jz.ag()I")
    public static int method4258() {
        return field2612.field2890;
    }

    @ObfuscatedName("jz.ai()I")
    public static int method4212() {
        return field2612.field2900;
    }

    @ObfuscatedName("jz.ax([III[F)V")
    public static void method4210(int[] arg0, int arg1, int arg2, float[] arg3) {
        if (arg3 == null && field2614 == field2608) {
            field2614 = field2615;
        }
        field2614.method4301(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("jz.ar()V")
    public static void method4214() {
        method4226(class545.field5309, class545.field5307, class545.field5306, class545.field5308);
    }

    @ObfuscatedName("jz.aj(IIII)V")
    public static void method4226(int arg0, int arg1, int arg2, int arg3) {
        field2612.field2900 = arg2 - arg0;
        field2612.field2893 = arg3 - arg1;
        method4216();
        if (field2612.field2905.length < field2612.field2893) {
            field2612.field2905 = new int[class320.method3400(field2612.field2893)];
        }
        int var4 = Statics.field5303 * arg1 + arg0;
        for (int var5 = 0; var5 < field2612.field2893; var5++) {
            field2612.field2905[var5] = var4;
            var4 += Statics.field5303;
        }
    }

    @ObfuscatedName("jz.au()V")
    public static void method4216() {
        field2612.method4764();
    }

    @ObfuscatedName("jz.ay(II)V")
    public static void method4217(int arg0, int arg1) {
        int var2 = field2612.field2905[0];
        int var3 = var2 / Statics.field5303;
        int var4 = var2 - Statics.field5303 * var3;
        field2612.method4754(arg0, var4, arg1, var3);
    }

    @ObfuscatedName("jz.ap(III)V")
    public static void method4218(int arg0, int arg1, int arg2) {
        field2612.method4753(arg0, arg1, arg2);
    }

    @ObfuscatedName("jz.av(IIIIIIFFFIII)V")
    public static void method4199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
        field2614.method4306(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    @ObfuscatedName("jz.aa(IIIIIIFFFI)V")
    public static void method4220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9) {
        field2614.method4308(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @ObfuscatedName("jz.aq(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2614.method4300(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("jz.am(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2614.method4309(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("jz.ac(IIIIIIFFFIIIBBBB)V")
    public static void method4245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        field2614.method4304(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

    @ObfuscatedName("jz.ae(IIIIIIFFFIBBBB)V")
    public static void method4272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        field2614.method4313(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }
}
