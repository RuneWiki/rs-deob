package deob;

@ObfuscatedName("iu")
public class class228 {

    @ObfuscatedName("iu.aw")
    public static int[] field2512 = new int[65536];

    @ObfuscatedName("iu.ay")
    public static int[] field2508 = new int[512];

    @ObfuscatedName("iu.ar")
    public static int[] field2507 = new int[2048];

    @ObfuscatedName("iu.am")
    public static int[] field2509 = new int[2048];

    @ObfuscatedName("iu.as")
    public static int[] field2510 = new int[2048];

    @ObfuscatedName("iu.aj")
    public static class246 field2511;

    @ObfuscatedName("iu.ag")
    public static class230 field2514;

    @ObfuscatedName("iu.az")
    public static final class230 field2513;

    @ObfuscatedName("iu.av")
    public static final class230 field2506;

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field2508[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field2507[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field2509[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
            field2510[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
        }
        field2511 = new class246();
        field2513 = new class245(field2511);
        field2506 = new class247(field2511);
        field2514 = field2513;
    }

    public class228() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iu.aw(Z)V")
    public static void method4035(boolean arg0) {
        if (arg0 && Statics.field5140 != null) {
            field2514 = field2506;
        } else {
            field2514 = field2513;
        }
    }

    @ObfuscatedName("iu.ay(Ljy;)V")
    public static void method4036(class250 arg0) {
        field2511.field2783 = arg0;
    }

    @ObfuscatedName("iu.ar(D)V")
    public static void method4037(double arg0) {
        method4100(arg0, 0, 512);
    }

    @ObfuscatedName("iu.am(DII)V")
    public static void method4100(double arg0, int arg1, int arg2) {
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
                int var33 = method4050(var32, arg0);
                if (var33 == 0) {
                    var33 = 1;
                }
                field2512[var4++] = var33;
            }
        }
    }

    @ObfuscatedName("iu.as(ID)I")
    public static int method4050(int arg0, double arg1) {
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

    @ObfuscatedName("iu.aj()I")
    public static int method4040() {
        return field2511.field2801;
    }

    @ObfuscatedName("iu.ag()I")
    public static int method4041() {
        return field2511.field2795;
    }

    @ObfuscatedName("iu.az()I")
    public static int method4122() {
        return field2511.field2798;
    }

    @ObfuscatedName("iu.av()I")
    public static int method4043() {
        return field2511.field2787;
    }

    @ObfuscatedName("iu.ap()I")
    public static int method4038() {
        return field2511.field2799;
    }

    @ObfuscatedName("iu.aq()I")
    public static int method4045() {
        return field2511.field2800;
    }

    @ObfuscatedName("iu.at()I")
    public static int method4046() {
        return field2511.field2782;
    }

    @ObfuscatedName("iu.ah()I")
    public static int method4042() {
        return field2511.field2796;
    }

    @ObfuscatedName("iu.ax([III[F)V")
    public static void method4048(int[] arg0, int arg1, int arg2, float[] arg3) {
        if (arg3 == null && field2514 == field2506) {
            field2514 = field2513;
        }
        field2514.method4147(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("iu.aa()V")
    public static void method4049() {
        method4061(class524.field5144, class524.field5142, class524.field5145, class524.field5143);
    }

    @ObfuscatedName("iu.au(IIII)V")
    public static void method4061(int arg0, int arg1, int arg2, int arg3) {
        field2511.field2796 = arg2 - arg0;
        field2511.field2797 = arg3 - arg1;
        method4051();
        if (field2511.field2802.length < field2511.field2797) {
            field2511.field2802 = new int[class305.method2707(field2511.field2797)];
        }
        int var4 = Statics.field5138 * arg1 + arg0;
        for (int var5 = 0; var5 < field2511.field2797; var5++) {
            field2511.field2802[var5] = var4;
            var4 += Statics.field5138;
        }
    }

    @ObfuscatedName("iu.ae()V")
    public static void method4051() {
        field2511.method4598();
    }

    @ObfuscatedName("iu.ab(II)V")
    public static void method4052(int arg0, int arg1) {
        int var2 = field2511.field2802[0];
        int var3 = var2 / Statics.field5138;
        int var4 = var2 - Statics.field5138 * var3;
        field2511.method4595(arg0, var4, arg1, var3);
    }

    @ObfuscatedName("iu.ad(III)V")
    public static void method4076(int arg0, int arg1, int arg2) {
        field2511.method4596(arg0, arg1, arg2);
    }

    @ObfuscatedName("iu.ao(IIIIIIFFFIII)V")
    public static void method4054(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
        field2514.method4152(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    @ObfuscatedName("iu.ac(IIIIIIFFFI)V")
    public static void method4089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9) {
        field2514.method4153(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @ObfuscatedName("iu.ak(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2514.method4154(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("iu.an(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2514.method4167(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("iu.af(IIIIIIFFFIIIBBBB)V")
    public static void method4058(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        field2514.method4150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

    @ObfuscatedName("iu.ai(IIIIIIFFFIBBBB)V")
    public static void method4059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        field2514.method4155(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }
}
