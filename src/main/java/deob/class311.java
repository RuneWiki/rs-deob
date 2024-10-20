package deob;

@ObfuscatedName("kp")
public class class311 {

    public class311() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bk.p(Lik;III)[Lkh;")
    public static class309[] method984(class247 arg0, int arg1, int arg2) {
        return method2920(arg0, arg1, arg2) ? method4543() : null;
    }

    @ObfuscatedName("j.i(Lik;III)Lko;")
    public static class310 method18(class247 arg0, int arg1, int arg2) {
        if (!method2920(arg0, arg1, arg2)) {
            return null;
        }
        class310 var3 = new class310();
        var3.field3884 = Statics.field3892;
        var3.field3880 = Statics.field3899;
        var3.field3879 = Statics.field3893[0];
        var3.field3883 = Statics.field3894[0];
        var3.field3885 = Statics.field3896[0];
        var3.field3882 = Statics.field3897[0];
        int var4 = var3.field3885 * var3.field3882;
        byte[] var5 = Statics.field2134[0];
        var3.field3887 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3887[var6] = Statics.field3898[var5[var6] & 0xFF];
        }
        method627();
        return var3;
    }

    @ObfuscatedName("t.w(Lik;Lik;III)Lkz;")
    public static class287 method34(class247 arg0, class247 arg1, int arg2, int arg3) {
        if (!method2920(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method4032(arg2, arg3);
        class287 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class287 var6 = new class287(var4, Statics.field3893, Statics.field3894, Statics.field3896, Statics.field3897, Statics.field3898, Statics.field2134);
            method627();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("hs.s(Lik;Ljava/lang/String;Ljava/lang/String;I)[Lkh;")
    public static class309[] method3987(class247 arg0, String arg1, String arg2) {
        int var3 = arg0.method4117(arg1);
        int var4 = arg0.method4050(var3, arg2);
        return method984(arg0, var3, var4);
    }

    @ObfuscatedName("hu.j(Lik;Ljava/lang/String;Ljava/lang/String;B)Lkh;")
    public static class309 method3859(class247 arg0, String arg1, String arg2) {
        int var3 = arg0.method4117(arg1);
        int var4 = arg0.method4050(var3, arg2);
        class309 var5;
        if (method2920(arg0, var3, var4)) {
            class309 var6 = new class309();
            var6.field3877 = Statics.field3892;
            var6.field3874 = Statics.field3899;
            var6.field3875 = Statics.field3893[0];
            var6.field3878 = Statics.field3894[0];
            var6.field3873 = Statics.field3896[0];
            var6.field3871 = Statics.field3897[0];
            var6.field3872 = Statics.field3898;
            var6.field3876 = Statics.field2134[0];
            method627();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("m.a(Lik;Ljava/lang/String;Ljava/lang/String;I)[Lko;")
    public static class310[] method55(class247 arg0, String arg1, String arg2) {
        int var3 = arg0.method4117(arg1);
        int var4 = arg0.method4050(var3, arg2);
        class310[] var5;
        if (method2920(arg0, var3, var4)) {
            var5 = method4804();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ji.t(Lik;II)Lkh;")
    public static class309 method4744(class247 arg0, int arg1) {
        byte[] var2 = arg0.method4097(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method3887(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class309 var4 = new class309();
        var4.field3877 = Statics.field3892;
        var4.field3874 = Statics.field3899;
        var4.field3875 = Statics.field3893[0];
        var4.field3878 = Statics.field3894[0];
        var4.field3873 = Statics.field3896[0];
        var4.field3871 = Statics.field3897[0];
        var4.field3872 = Statics.field3898;
        var4.field3876 = Statics.field2134[0];
        method627();
        return var4;
    }

    @ObfuscatedName("jl.r(B)[Lkh;")
    public static class309[] method4543() {
        class309[] var0 = new class309[Statics.field3895];
        for (int var1 = 0; var1 < Statics.field3895; var1++) {
            class309 var2 = var0[var1] = new class309();
            var2.field3877 = Statics.field3892;
            var2.field3874 = Statics.field3899;
            var2.field3875 = Statics.field3893[var1];
            var2.field3878 = Statics.field3894[var1];
            var2.field3873 = Statics.field3896[var1];
            var2.field3871 = Statics.field3897[var1];
            var2.field3872 = Statics.field3898;
            var2.field3876 = Statics.field2134[var1];
        }
        method627();
        return var0;
    }

    @ObfuscatedName("je.m(B)[Lko;")
    public static class310[] method4804() {
        class310[] var0 = new class310[Statics.field3895];
        for (int var1 = 0; var1 < Statics.field3895; var1++) {
            class310 var2 = var0[var1] = new class310();
            var2.field3884 = Statics.field3892;
            var2.field3880 = Statics.field3899;
            var2.field3879 = Statics.field3893[var1];
            var2.field3883 = Statics.field3894[var1];
            var2.field3885 = Statics.field3896[var1];
            var2.field3882 = Statics.field3897[var1];
            int var3 = var2.field3885 * var2.field3882;
            byte[] var4 = Statics.field2134[var1];
            var2.field3887 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3887[var5] = Statics.field3898[var4[var5] & 0xFF];
            }
        }
        method627();
        return var0;
    }

    @ObfuscatedName("fs.h(Lik;III)Z")
    public static boolean method2920(class247 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4032(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3887(var3);
            return true;
        }
    }

    @ObfuscatedName("hn.o([BI)V")
    public static void method3887(byte[] arg0) {
        class185 var1 = new class185(arg0);
        var1.field2488 = arg0.length - 2;
        Statics.field3895 = var1.method3124();
        Statics.field3893 = new int[Statics.field3895];
        Statics.field3894 = new int[Statics.field3895];
        Statics.field3896 = new int[Statics.field3895];
        Statics.field3897 = new int[Statics.field3895];
        Statics.field2134 = new byte[Statics.field3895][];
        var1.field2488 = arg0.length - 7 - Statics.field3895 * 8;
        Statics.field3892 = var1.method3124();
        Statics.field3899 = var1.method3124();
        int var2 = (var1.method3197() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3895; var3++) {
            Statics.field3893[var3] = var1.method3124();
        }
        for (int var4 = 0; var4 < Statics.field3895; var4++) {
            Statics.field3894[var4] = var1.method3124();
        }
        for (int var5 = 0; var5 < Statics.field3895; var5++) {
            Statics.field3896[var5] = var1.method3124();
        }
        for (int var6 = 0; var6 < Statics.field3895; var6++) {
            Statics.field3897[var6] = var1.method3124();
        }
        var1.field2488 = arg0.length - 7 - Statics.field3895 * 8 - (var2 - 1) * 3;
        Statics.field3898 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3898[var7] = var1.method3138();
            if (Statics.field3898[var7] == 0) {
                Statics.field3898[var7] = 1;
            }
        }
        var1.field2488 = 0;
        for (int var8 = 0; var8 < Statics.field3895; var8++) {
            int var9 = Statics.field3896[var8];
            int var10 = Statics.field3897[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2134[var8] = var12;
            int var13 = var1.method3197();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3123();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3123();
                    }
                }
            }
        }
    }

    @ObfuscatedName("az.x(I)V")
    public static void method627() {
        Statics.field3893 = null;
        Statics.field3894 = null;
        Statics.field3896 = null;
        Statics.field3897 = null;
        Statics.field3898 = null;
        Statics.field2134 = (byte[][]) null;
    }
}
