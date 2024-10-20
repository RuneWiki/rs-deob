package deob;

@ObfuscatedName("lu")
public class class325 {

    public class325() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ff.g(Liu;III)Lli;")
    public static class323 method3204(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4438(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method2849(var3);
            var4 = true;
        }
        return var4 ? method5025() : null;
    }

    @ObfuscatedName("ew.r(Liu;IIB)Lls;")
    public static class324 method3125(class250 arg0, int arg1, int arg2) {
        return method213(arg0, arg1, arg2) ? method4431() : null;
    }

    @ObfuscatedName("ii.e(Liu;Ljava/lang/String;Ljava/lang/String;I)Lli;")
    public static class323 method4639(class250 arg0, String arg1, String arg2) {
        int var3 = arg0.method4432(arg1);
        int var4 = arg0.method4454(var3, arg2);
        return method3204(arg0, var3, var4);
    }

    @ObfuscatedName("jt.q(Liu;Ljava/lang/String;Ljava/lang/String;I)[Lls;")
    public static class324[] method5082(class250 arg0, String arg1, String arg2) {
        int var3 = arg0.method4432(arg1);
        int var4 = arg0.method4454(var3, arg2);
        byte[] var5 = arg0.method4438(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method2849(var5);
            var6 = true;
        }
        class324[] var7;
        if (var6) {
            class324[] var8 = new class324[Statics.field3894];
            for (int var9 = 0; var9 < Statics.field3894; var9++) {
                class324 var10 = var8[var9] = new class324();
                var10.field3884 = Statics.field3892;
                var10.field3885 = Statics.field3897;
                var10.field3882 = Statics.field3891[var9];
                var10.field3883 = Statics.field3893[var9];
                var10.field3880 = Statics.field3896[var9];
                var10.field3888 = Statics.field3335[var9];
                int var11 = var10.field3888 * var10.field3880;
                byte[] var12 = Statics.field3898[var9];
                var10.field3890 = new int[var11];
                for (int var13 = 0; var13 < var11; var13++) {
                    var10.field3890[var13] = Statics.field3895[var12[var13] & 0xFF];
                }
            }
            Statics.field3891 = null;
            Statics.field3893 = null;
            Statics.field3896 = null;
            Statics.field3335 = null;
            Statics.field3895 = null;
            Statics.field3898 = (byte[][]) null;
            var7 = var8;
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("bh.c(Liu;II)Lli;")
    public static class323 method1656(class250 arg0, int arg1) {
        byte[] var2 = arg0.method4442(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method2849(var2);
            var3 = true;
        }
        return var3 ? method5025() : null;
    }

    @ObfuscatedName("kt.i(I)[Lli;")
    public static class323[] method5499() {
        class323[] var0 = new class323[Statics.field3894];
        for (int var1 = 0; var1 < Statics.field3894; var1++) {
            class323 var2 = var0[var1] = new class323();
            var2.field3876 = Statics.field3892;
            var2.field3877 = Statics.field3897;
            var2.field3875 = Statics.field3891[var1];
            var2.field3878 = Statics.field3893[var1];
            var2.field3873 = Statics.field3896[var1];
            var2.field3874 = Statics.field3335[var1];
            var2.field3872 = Statics.field3895;
            var2.field3871 = Statics.field3898[var1];
        }
        Statics.field3891 = null;
        Statics.field3893 = null;
        Statics.field3896 = null;
        Statics.field3335 = null;
        Statics.field3895 = null;
        Statics.field3898 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("jy.p(B)Lli;")
    public static class323 method5025() {
        class323 var0 = new class323();
        var0.field3876 = Statics.field3892;
        var0.field3877 = Statics.field3897;
        var0.field3875 = Statics.field3891[0];
        var0.field3878 = Statics.field3893[0];
        var0.field3873 = Statics.field3896[0];
        var0.field3874 = Statics.field3335[0];
        var0.field3872 = Statics.field3895;
        var0.field3871 = Statics.field3898[0];
        Statics.field3891 = null;
        Statics.field3893 = null;
        Statics.field3896 = null;
        Statics.field3335 = null;
        Statics.field3895 = null;
        Statics.field3898 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("it.m(I)Lls;")
    public static class324 method4431() {
        class324 var0 = new class324();
        var0.field3884 = Statics.field3892;
        var0.field3885 = Statics.field3897;
        var0.field3882 = Statics.field3891[0];
        var0.field3883 = Statics.field3893[0];
        var0.field3880 = Statics.field3896[0];
        var0.field3888 = Statics.field3335[0];
        int var1 = var0.field3888 * var0.field3880;
        byte[] var2 = Statics.field3898[0];
        var0.field3890 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3890[var3] = Statics.field3895[var2[var3] & 0xFF];
        }
        Statics.field3891 = null;
        Statics.field3893 = null;
        Statics.field3896 = null;
        Statics.field3335 = null;
        Statics.field3895 = null;
        Statics.field3898 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("f.d(Liu;IIB)Z")
    public static boolean method213(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4438(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2849(var3);
            return true;
        }
    }

    @ObfuscatedName("di.j([BI)V")
    public static void method2849(byte[] arg0) {
        class185 var1 = new class185(arg0);
        var1.field2406 = arg0.length - 2;
        Statics.field3894 = var1.method3467();
        Statics.field3891 = new int[Statics.field3894];
        Statics.field3893 = new int[Statics.field3894];
        Statics.field3896 = new int[Statics.field3894];
        Statics.field3335 = new int[Statics.field3894];
        Statics.field3898 = new byte[Statics.field3894][];
        var1.field2406 = arg0.length - 7 - Statics.field3894 * 8;
        Statics.field3892 = var1.method3467();
        Statics.field3897 = var1.method3467();
        int var2 = (var1.method3679() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3894; var3++) {
            Statics.field3891[var3] = var1.method3467();
        }
        for (int var4 = 0; var4 < Statics.field3894; var4++) {
            Statics.field3893[var4] = var1.method3467();
        }
        for (int var5 = 0; var5 < Statics.field3894; var5++) {
            Statics.field3896[var5] = var1.method3467();
        }
        for (int var6 = 0; var6 < Statics.field3894; var6++) {
            Statics.field3335[var6] = var1.method3467();
        }
        var1.field2406 = arg0.length - 7 - Statics.field3894 * 8 - (var2 - 1) * 3;
        Statics.field3895 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3895[var7] = var1.method3469();
            if (Statics.field3895[var7] == 0) {
                Statics.field3895[var7] = 1;
            }
        }
        var1.field2406 = 0;
        for (int var8 = 0; var8 < Statics.field3894; var8++) {
            int var9 = Statics.field3896[var8];
            int var10 = Statics.field3335[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3898[var8] = var12;
            int var13 = var1.method3679();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3627();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3627();
                    }
                }
            }
        }
    }
}
