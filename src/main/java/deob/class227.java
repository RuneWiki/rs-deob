package deob;

@ObfuscatedName("ix")
public class class227 {

    @ObfuscatedName("ix.au")
    public static int[] field2532 = new int[65536];

    @ObfuscatedName("ix.ae")
    public static int[] field2536 = new int[512];

    @ObfuscatedName("ix.ao")
    public static int[] field2534 = new int[2048];

    @ObfuscatedName("ix.at")
    public static int[] field2535 = new int[2048];

    @ObfuscatedName("ix.ac")
    public static int[] field2533 = new int[2048];

    @ObfuscatedName("ix.ai")
    public static class245 field2537;

    @ObfuscatedName("ix.az")
    public static class229 field2538;

    @ObfuscatedName("ix.ap")
    public static final class229 field2539;

    @ObfuscatedName("ix.aa")
    public static final class229 field2540;

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field2536[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field2534[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field2535[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
            field2533[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
        }
        field2537 = new class245();
        field2539 = new class244(field2537);
        field2540 = new class246(field2537);
        field2538 = field2539;
    }

    public class227() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ix.au(Z)V")
    public static void method4066(boolean arg0) {
        if (arg0 && Statics.field5185 != null) {
            field2538 = field2540;
        } else {
            field2538 = field2539;
        }
    }

    @ObfuscatedName("ix.ae(Ljs;)V")
    public static void method4052(class249 arg0) {
        field2537.field2813 = arg0;
    }

    @ObfuscatedName("ix.ao(D)V")
    public static void method4053(double arg0) {
        method4095(arg0, 0, 512);
    }

    @ObfuscatedName("ix.at(DII)V")
    public static void method4095(double arg0, int arg1, int arg2) {
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
                int var33 = method4080(var32, arg0);
                if (var33 == 0) {
                    var33 = 1;
                }
                field2532[var4++] = var33;
            }
        }
    }

    @ObfuscatedName("ix.ac(ID)I")
    public static int method4080(int arg0, double arg1) {
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

    @ObfuscatedName("ix.ai()I")
    public static int method4056() {
        return field2537.field2811;
    }

    @ObfuscatedName("ix.az()I")
    public static int method4057() {
        return field2537.field2826;
    }

    @ObfuscatedName("ix.ap()I")
    public static int method4058() {
        return field2537.field2820;
    }

    @ObfuscatedName("ix.aa()I")
    public static int method4055() {
        return field2537.field2828;
    }

    @ObfuscatedName("ix.af()I")
    public static int method4060() {
        return field2537.field2830;
    }

    @ObfuscatedName("ix.ad()I")
    public static int method4061() {
        return field2537.field2829;
    }

    @ObfuscatedName("ix.aq()I")
    public static int method4062() {
        return field2537.field2816;
    }

    @ObfuscatedName("ix.al()I")
    public static int method4063() {
        return field2537.field2825;
    }

    @ObfuscatedName("ix.an([III[F)V")
    public static void method4064(int[] arg0, int arg1, int arg2, float[] arg3) {
        if (arg3 == null && field2540 == field2538) {
            field2538 = field2539;
        }
        field2538.method4158(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ix.ar()V")
    public static void method4065() {
        method4121(class525.field5187, class525.field5188, class525.field5180, class525.field5186);
    }

    @ObfuscatedName("ix.ab(IIII)V")
    public static void method4121(int arg0, int arg1, int arg2, int arg3) {
        field2537.field2825 = arg2 - arg0;
        field2537.field2823 = arg3 - arg1;
        method4067();
        if (field2537.field2827.length < field2537.field2823) {
            field2537.field2827 = new int[class304.method4709(field2537.field2823)];
        }
        int var4 = Statics.field5181 * arg1 + arg0;
        for (int var5 = 0; var5 < field2537.field2823; var5++) {
            field2537.field2827[var5] = var4;
            var4 += Statics.field5181;
        }
    }

    @ObfuscatedName("ix.ag()V")
    public static void method4067() {
        field2537.method4610();
    }

    @ObfuscatedName("ix.am(II)V")
    public static void method4125(int arg0, int arg1) {
        int var2 = field2537.field2827[0];
        int var3 = var2 / Statics.field5181;
        int var4 = var2 - Statics.field5181 * var3;
        field2537.method4616(arg0, var4, arg1, var3);
    }

    @ObfuscatedName("ix.ax(III)V")
    public static void method4069(int arg0, int arg1, int arg2) {
        field2537.method4612(arg0, arg1, arg2);
    }

    @ObfuscatedName("ix.ah(IIIIIIFFFIII)V")
    public static void method4074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
        field2538.method4163(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    @ObfuscatedName("ix.as(IIIIIIFFFI)V")
    public static void method4131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9) {
        field2538.method4164(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @ObfuscatedName("ix.ay(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4072(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2538.method4165(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("ix.aj(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4073(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2538.method4162(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("ix.av(IIIIIIFFFIIIBBBB)V")
    public static void method4123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        field2538.method4161(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

    @ObfuscatedName("ix.aw(IIIIIIFFFIBBBB)V")
    public static void method4129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        field2538.method4157(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }
}
