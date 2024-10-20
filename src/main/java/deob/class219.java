package deob;

@ObfuscatedName("in")
public class class219 {

    @ObfuscatedName("in.af")
    public static int[] field2517 = new int[65536];

    @ObfuscatedName("in.an")
    public static int[] field2518 = new int[512];

    @ObfuscatedName("in.aw")
    public static int[] field2514 = new int[2048];

    @ObfuscatedName("in.ac")
    public static int[] field2512 = new int[2048];

    @ObfuscatedName("in.au")
    public static int[] field2516 = new int[2048];

    @ObfuscatedName("in.ab")
    public static class237 field2515;

    @ObfuscatedName("in.aq")
    public static class221 field2520;

    @ObfuscatedName("in.al")
    public static final class221 field2519;

    @ObfuscatedName("in.at")
    public static final class221 field2513;

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field2518[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field2514[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field2512[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
            field2516[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
        }
        field2515 = new class237();
        field2519 = new class236(field2515);
        field2513 = new class238(field2515);
        field2520 = field2519;
    }

    public class219() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mz.af(ZI)V")
    public static void method5552(boolean arg0) {
        if (arg0 && Statics.field5063 != null) {
            field2520 = field2513;
        } else {
            field2520 = field2519;
        }
    }

    @ObfuscatedName("am.an(D)V")
    public static void method278(double arg0) {
        method61(arg0, 0, 512);
    }

    @ObfuscatedName("al.aw(DIII)V")
    public static void method61(double arg0, int arg1, int arg2) {
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
                int var33 = method2709(var32, arg0);
                if (var33 == 0) {
                    var33 = 1;
                }
                field2517[var4++] = var33;
            }
        }
    }

    @ObfuscatedName("ez.ac(ID)I")
    public static int method2709(int arg0, double arg1) {
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

    @ObfuscatedName("gd.au(I)I")
    public static int method3285() {
        return field2515.field2796;
    }

    @ObfuscatedName("ax.ab(I)I")
    public static int method157() {
        return field2515.field2794;
    }

    @ObfuscatedName("kt.aq(I)I")
    public static int method5000() {
        return field2515.field2801;
    }

    @ObfuscatedName("fa.al(B)I")
    public static int method3039() {
        return field2515.field2803;
    }

    @ObfuscatedName("eu.at(I)I")
    public static int method2756() {
        return field2515.field2791;
    }

    @ObfuscatedName("aq.aa(I)I")
    public static int method43() {
        return field2515.field2798;
    }

    @ObfuscatedName("an.ay([III[FI)V")
    public static void method9(int[] arg0, int arg1, int arg2, float[] arg3) {
        if (arg3 == null && field2520 == field2513) {
            field2520 = field2519;
        }
        field2520.method4125(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("am.ao(I)V")
    public static void method264() {
        int var0 = class499.field5064;
        int var1 = class499.field5065;
        int var2 = class499.field5068;
        int var3 = class499.field5066;
        field2515.field2798 = var2 - var0;
        field2515.field2797 = var3 - var1;
        method2115();
        if (field2515.field2793.length < field2515.field2797) {
            field2515.field2793 = new int[class296.method1948(field2515.field2797)];
        }
        int var4 = Statics.field5061 * var1 + var0;
        for (int var5 = 0; var5 < field2515.field2797; var5++) {
            field2515.field2793[var5] = var4;
            var4 += Statics.field5061;
        }
    }

    @ObfuscatedName("cd.ax(I)V")
    public static void method2115() {
        field2515.method4566();
    }

    @ObfuscatedName("gz.ag(IIII)V")
    public static void method3343(int arg0, int arg1, int arg2) {
        field2515.method4571(arg0, arg1, arg2);
    }

    @ObfuscatedName("jk.ah(IIIIIIFFFIIII)V")
    public static void method4617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
        field2520.method4128(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    @ObfuscatedName("fw.av(IIIIIIFFFII)V")
    public static void method3058(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9) {
        field2520.method4129(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @ObfuscatedName("ig.am(IIIIIIFFFIIIIIIIIIIIIIB)V")
    public static void method4047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2520.method4127(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }
}
