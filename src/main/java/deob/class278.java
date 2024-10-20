package deob;

@ObfuscatedName("kn")
public class class278 {

    @ObfuscatedName("kn.aq")
    public static int[] field2880 = new int[65536];

    @ObfuscatedName("kn.ad")
    public static int[] field2876 = new int[512];

    @ObfuscatedName("kn.ag")
    public static int[] field2881 = new int[2048];

    @ObfuscatedName("kn.ak")
    public static int[] field2878 = new int[2048];

    @ObfuscatedName("kn.ap")
    public static int[] field2879 = new int[2048];

    @ObfuscatedName("kn.an")
    public static class299 field2877;

    @ObfuscatedName("kn.aj")
    public static class281 field2875;

    @ObfuscatedName("kn.av")
    public static final class281 field2882;

    @ObfuscatedName("kn.ab")
    public static final class281 field2883;

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field2876[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field2881[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field2878[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
            field2879[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
        }
        field2877 = new class299();
        field2882 = new class298(field2877);
        field2883 = new class300(field2877);
        field2875 = field2882;
    }

    public class278() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kn.aq(Z)V")
    public static void method4837(boolean arg0) {
        if (arg0 && Statics.field5436 != null) {
            field2875 = field2883;
        } else {
            field2875 = field2882;
        }
    }

    @ObfuscatedName("kn.ad(Llh;)V")
    public static void method4821(class303 arg0) {
        field2877.field3195 = arg0;
    }

    @ObfuscatedName("kn.ag(D)V")
    public static void method4760(double arg0) {
        method4761(arg0, 0, 512);
    }

    @ObfuscatedName("kn.ak(DII)V")
    public static void method4761(double arg0, int arg1, int arg2) {
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
                int var33 = method4762(var32, arg0);
                if (var33 == 0) {
                    var33 = 1;
                }
                field2880[var4++] = var33;
            }
        }
    }

    @ObfuscatedName("kn.ap(ID)I")
    public static int method4762(int arg0, double arg1) {
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

    @ObfuscatedName("kn.an()I")
    public static int method4763() {
        return field2877.field3197;
    }

    @ObfuscatedName("kn.aj()I")
    public static int method4758() {
        return field2877.field3198;
    }

    @ObfuscatedName("kn.av()I")
    public static int method4764() {
        return field2877.field3189;
    }

    @ObfuscatedName("kn.ab()I")
    public static int method4766() {
        return field2877.field3202;
    }

    @ObfuscatedName("kn.ai()I")
    public static int method4767() {
        return field2877.field3191;
    }

    @ObfuscatedName("kn.ae()I")
    public static int method4783() {
        return field2877.field3190;
    }

    @ObfuscatedName("kn.au()I")
    public static int method4769() {
        return field2877.field3185;
    }

    @ObfuscatedName("kn.ah()I")
    public static int method4770() {
        return field2877.field3199;
    }

    @ObfuscatedName("kn.az([III[F)V")
    public static void method4771(int[] arg0, int arg1, int arg2, float[] arg3) {
        if (arg3 == null && field2883 == field2875) {
            field2875 = field2882;
        }
        field2875.method4872(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("kn.ax()V")
    public static void method4814() {
        method4773(class557.field5438, class557.field5435, class557.field5439, class557.field5437);
    }

    @ObfuscatedName("kn.ac(IIII)V")
    public static void method4773(int arg0, int arg1, int arg2, int arg3) {
        field2877.field3199 = arg2 - arg0;
        field2877.field3200 = arg3 - arg1;
        method4774();
        if (field2877.field3205.length < field2877.field3200) {
            field2877.field3205 = new int[class329.method6778(field2877.field3200)];
        }
        int var4 = Statics.field5432 * arg1 + arg0;
        for (int var5 = 0; var5 < field2877.field3200; var5++) {
            field2877.field3205[var5] = var4;
            var4 += Statics.field5432;
        }
    }

    @ObfuscatedName("kn.al()V")
    public static void method4774() {
        field2877.method5407();
    }

    @ObfuscatedName("kn.ay(II)V")
    public static void method4819(int arg0, int arg1) {
        int var2 = field2877.field3205[0];
        int var3 = var2 / Statics.field5432;
        int var4 = var2 - Statics.field5432 * var3;
        field2877.method5408(arg0, var4, arg1, var3);
    }

    @ObfuscatedName("kn.ao(III)V")
    public static void method4838(int arg0, int arg1, int arg2) {
        field2877.method5409(arg0, arg1, arg2);
    }

    @ObfuscatedName("kn.aa(IIIIIIFFFIII)V")
    public static void method4777(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
        field2875.method4877(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    @ObfuscatedName("kn.as(IIIIIIFFFI)V")
    public static void method4778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9) {
        field2875.method4878(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @ObfuscatedName("kn.aw(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2875.method4887(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("kn.at(IIIIIIFFFIIIIIIIIIIIII)V")
    public static void method4780(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        field2875.method4880(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("kn.af(IIIIIIFFFIIIBBBB)V")
    public static void method4781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        field2875.method4875(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

    @ObfuscatedName("kn.am(IIIIIIFFFIBBBB)V")
    public static void method4782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        field2875.method4909(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }
}
