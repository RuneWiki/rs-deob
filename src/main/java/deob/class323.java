package deob;

@ObfuscatedName("lq")
public class class323 {

    public class323() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bf.v(Lis;III)Lld;")
    public static class321 method1082(class250 arg0, int arg1, int arg2) {
        return method3193(arg0, arg1, arg2) ? method3177() : null;
    }

    @ObfuscatedName("iq.s(Lis;III)[Llh;")
    public static class322[] method4267(class250 arg0, int arg1, int arg2) {
        if (!method3193(arg0, arg1, arg2)) {
            return null;
        }
        class322[] var3 = new class322[Statics.field3835];
        for (int var4 = 0; var4 < Statics.field3835; var4++) {
            class322 var5 = var3[var4] = new class322();
            var5.field3829 = Statics.field3836;
            var5.field3824 = Statics.field2342;
            var5.field3827 = Statics.field3841[var4];
            var5.field3828 = Statics.field3744[var4];
            var5.field3823 = Statics.field3838[var4];
            var5.field3825 = Statics.field3839[var4];
            int var6 = var5.field3825 * var5.field3823;
            byte[] var7 = Statics.field3840[var4];
            var5.field3826 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field3826[var8] = Statics.field1110[var7[var8] & 0xFF];
            }
        }
        method4362();
        return var3;
    }

    @ObfuscatedName("hf.o(Lis;III)Llh;")
    public static class322 method4067(class250 arg0, int arg1, int arg2) {
        return method3193(arg0, arg1, arg2) ? method4448() : null;
    }

    @ObfuscatedName("o.k(Lis;Ljava/lang/String;Ljava/lang/String;I)[Lld;")
    public static class321[] method28(class250 arg0, String arg1, String arg2) {
        int var3 = arg0.method4288(arg1);
        int var4 = arg0.method4289(var3, arg2);
        class321[] var5;
        if (method3193(arg0, var3, var4)) {
            class321[] var6 = new class321[Statics.field3835];
            for (int var7 = 0; var7 < Statics.field3835; var7++) {
                class321 var8 = var6[var7] = new class321();
                var8.field3822 = Statics.field3836;
                var8.field3815 = Statics.field2342;
                var8.field3818 = Statics.field3841[var7];
                var8.field3820 = Statics.field3744[var7];
                var8.field3817 = Statics.field3838[var7];
                var8.field3819 = Statics.field3839[var7];
                var8.field3816 = Statics.field1110;
                var8.field3821 = Statics.field3840[var7];
            }
            method4362();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("kl.u(Lis;Ljava/lang/String;Ljava/lang/String;I)Lld;")
    public static class321 method5307(class250 arg0, String arg1, String arg2) {
        int var3 = arg0.method4288(arg1);
        int var4 = arg0.method4289(var3, arg2);
        return method1082(arg0, var3, var4);
    }

    @ObfuscatedName("fv.i(Lis;Ljava/lang/String;Ljava/lang/String;I)[Llh;")
    public static class322[] method3166(class250 arg0, String arg1, String arg2) {
        int var3 = arg0.method4288(arg1);
        int var4 = arg0.method4289(var3, arg2);
        return method4267(arg0, var3, var4);
    }

    @ObfuscatedName("iu.t(Lis;Ljava/lang/String;Ljava/lang/String;I)Llh;")
    public static class322 method4483(class250 arg0, String arg1, String arg2) {
        int var3 = arg0.method4288(arg1);
        int var4 = arg0.method4289(var3, arg2);
        return method4067(arg0, var3, var4);
    }

    @ObfuscatedName("fd.w(B)Lld;")
    public static class321 method3177() {
        class321 var0 = new class321();
        var0.field3822 = Statics.field3836;
        var0.field3815 = Statics.field2342;
        var0.field3818 = Statics.field3841[0];
        var0.field3820 = Statics.field3744[0];
        var0.field3817 = Statics.field3838[0];
        var0.field3819 = Statics.field3839[0];
        var0.field3816 = Statics.field1110;
        var0.field3821 = Statics.field3840[0];
        method4362();
        return var0;
    }

    @ObfuscatedName("iw.a(I)Llh;")
    public static class322 method4448() {
        class322 var0 = new class322();
        var0.field3829 = Statics.field3836;
        var0.field3824 = Statics.field2342;
        var0.field3827 = Statics.field3841[0];
        var0.field3828 = Statics.field3744[0];
        var0.field3823 = Statics.field3838[0];
        var0.field3825 = Statics.field3839[0];
        int var1 = var0.field3825 * var0.field3823;
        byte[] var2 = Statics.field3840[0];
        var0.field3826 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3826[var3] = Statics.field1110[var2[var3] & 0xFF];
        }
        method4362();
        return var0;
    }

    @ObfuscatedName("fp.z(Lis;IIB)Z")
    public static boolean method3193(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4270(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2993(var3);
            return true;
        }
    }

    @ObfuscatedName("ej.e([BB)V")
    public static void method2993(byte[] arg0) {
        class185 var1 = new class185(arg0);
        var1.field2386 = arg0.length - 2;
        Statics.field3835 = var1.method3276();
        Statics.field3841 = new int[Statics.field3835];
        Statics.field3744 = new int[Statics.field3835];
        Statics.field3838 = new int[Statics.field3835];
        Statics.field3839 = new int[Statics.field3835];
        Statics.field3840 = new byte[Statics.field3835][];
        var1.field2386 = arg0.length - 7 - Statics.field3835 * 8;
        Statics.field3836 = var1.method3276();
        Statics.field2342 = var1.method3276();
        int var2 = (var1.method3274() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3835; var3++) {
            Statics.field3841[var3] = var1.method3276();
        }
        for (int var4 = 0; var4 < Statics.field3835; var4++) {
            Statics.field3744[var4] = var1.method3276();
        }
        for (int var5 = 0; var5 < Statics.field3835; var5++) {
            Statics.field3838[var5] = var1.method3276();
        }
        for (int var6 = 0; var6 < Statics.field3835; var6++) {
            Statics.field3839[var6] = var1.method3276();
        }
        var1.field2386 = arg0.length - 7 - Statics.field3835 * 8 - (var2 - 1) * 3;
        Statics.field1110 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1110[var7] = var1.method3494();
            if (Statics.field1110[var7] == 0) {
                Statics.field1110[var7] = 1;
            }
        }
        var1.field2386 = 0;
        for (int var8 = 0; var8 < Statics.field3835; var8++) {
            int var9 = Statics.field3838[var8];
            int var10 = Statics.field3839[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3840[var8] = var12;
            int var13 = var1.method3274();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3275();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3275();
                    }
                }
            }
        }
    }

    @ObfuscatedName("is.q(B)V")
    public static void method4362() {
        Statics.field3841 = null;
        Statics.field3744 = null;
        Statics.field3838 = null;
        Statics.field3839 = null;
        Statics.field1110 = null;
        Statics.field3840 = (byte[][]) null;
    }
}
