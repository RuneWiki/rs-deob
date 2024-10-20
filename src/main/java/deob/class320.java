package deob;

@ObfuscatedName("lr")
public class class320 {

    public class320() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ba.w(Liv;III)Llh;")
    public static class318 method1713(class248 arg0, int arg1, int arg2) {
        return method5267(arg0, arg1, arg2) ? method4093() : null;
    }

    @ObfuscatedName("bv.m(Liv;IIS)[Llc;")
    public static class319[] method1688(class248 arg0, int arg1, int arg2) {
        return method5267(arg0, arg1, arg2) ? method4115() : null;
    }

    @ObfuscatedName("co.q(Liv;IIB)Llc;")
    public static class319 method1871(class248 arg0, int arg1, int arg2) {
        if (!method5267(arg0, arg1, arg2)) {
            return null;
        }
        class319 var3 = new class319();
        var3.field3797 = Statics.field3806;
        var3.field3793 = Statics.field3575;
        var3.field3796 = Statics.field3809[0];
        var3.field3794 = Statics.field3808[0];
        var3.field3795 = Statics.field2414[0];
        var3.field3802 = Statics.field3805[0];
        int var4 = var3.field3802 * var3.field3795;
        byte[] var5 = Statics.field3679[0];
        var3.field3799 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3799[var6] = Statics.field3807[var5[var6] & 0xFF];
        }
        Statics.field3809 = null;
        Statics.field3808 = null;
        Statics.field2414 = null;
        Statics.field3805 = null;
        Statics.field3807 = null;
        Statics.field3679 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("jd.x(Liv;Ljava/lang/String;Ljava/lang/String;B)[Llh;")
    public static class318[] method4864(class248 arg0, String arg1, String arg2) {
        int var3 = arg0.method4268(arg1);
        int var4 = arg0.method4317(var3, arg2);
        class318[] var5;
        if (method5267(arg0, var3, var4)) {
            var5 = method2949();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("aa.j(Liv;Ljava/lang/String;Ljava/lang/String;I)Llh;")
    public static class318 method893(class248 arg0, String arg1, String arg2) {
        int var3 = arg0.method4268(arg1);
        int var4 = arg0.method4317(var3, arg2);
        return method1713(arg0, var3, var4);
    }

    @ObfuscatedName("az.a(Liv;Ljava/lang/String;Ljava/lang/String;I)[Llc;")
    public static class319[] method621(class248 arg0, String arg1, String arg2) {
        int var3 = arg0.method4268(arg1);
        int var4 = arg0.method4317(var3, arg2);
        return method1688(arg0, var3, var4);
    }

    @ObfuscatedName("jt.l(Liv;Ljava/lang/String;Ljava/lang/String;B)Llc;")
    public static class319 method4862(class248 arg0, String arg1, String arg2) {
        int var3 = arg0.method4268(arg1);
        int var4 = arg0.method4317(var3, arg2);
        return method1871(arg0, var3, var4);
    }

    @ObfuscatedName("lg.d(Liv;Liv;Ljava/lang/String;Ljava/lang/String;I)Lkr;")
    public static class299 method5324(class248 arg0, class248 arg1, String arg2, String arg3) {
        int var4 = arg0.method4268(arg2);
        int var5 = arg0.method4317(var4, arg3);
        class299 var6;
        if (method5267(arg0, var4, var5)) {
            var6 = method676(arg1.method4250(var4, var5));
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("jh.s(Liv;IB)Llh;")
    public static class318 method4826(class248 arg0, int arg1) {
        byte[] var2 = arg0.method4342(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method3165(var2);
            var3 = true;
        }
        return var3 ? method4093() : null;
    }

    @ObfuscatedName("ev.p(B)[Llh;")
    public static class318[] method2949() {
        class318[] var0 = new class318[Statics.field3810];
        for (int var1 = 0; var1 < Statics.field3810; var1++) {
            class318 var2 = var0[var1] = new class318();
            var2.field3791 = Statics.field3806;
            var2.field3792 = Statics.field3575;
            var2.field3785 = Statics.field3809[var1];
            var2.field3790 = Statics.field3808[var1];
            var2.field3787 = Statics.field2414[var1];
            var2.field3788 = Statics.field3805[var1];
            var2.field3789 = Statics.field3807;
            var2.field3786 = Statics.field3679[var1];
        }
        Statics.field3809 = null;
        Statics.field3808 = null;
        Statics.field2414 = null;
        Statics.field3805 = null;
        Statics.field3807 = null;
        Statics.field3679 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("hr.g(I)Llh;")
    public static class318 method4093() {
        class318 var0 = new class318();
        var0.field3791 = Statics.field3806;
        var0.field3792 = Statics.field3575;
        var0.field3785 = Statics.field3809[0];
        var0.field3790 = Statics.field3808[0];
        var0.field3787 = Statics.field2414[0];
        var0.field3788 = Statics.field3805[0];
        var0.field3789 = Statics.field3807;
        var0.field3786 = Statics.field3679[0];
        Statics.field3809 = null;
        Statics.field3808 = null;
        Statics.field2414 = null;
        Statics.field3805 = null;
        Statics.field3807 = null;
        Statics.field3679 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("hh.y(I)[Llc;")
    public static class319[] method4115() {
        class319[] var0 = new class319[Statics.field3810];
        for (int var1 = 0; var1 < Statics.field3810; var1++) {
            class319 var2 = var0[var1] = new class319();
            var2.field3797 = Statics.field3806;
            var2.field3793 = Statics.field3575;
            var2.field3796 = Statics.field3809[var1];
            var2.field3794 = Statics.field3808[var1];
            var2.field3795 = Statics.field2414[var1];
            var2.field3802 = Statics.field3805[var1];
            int var3 = var2.field3802 * var2.field3795;
            byte[] var4 = Statics.field3679[var1];
            var2.field3799 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3799[var5] = Statics.field3807[var4[var5] & 0xFF];
            }
        }
        Statics.field3809 = null;
        Statics.field3808 = null;
        Statics.field2414 = null;
        Statics.field3805 = null;
        Statics.field3807 = null;
        Statics.field3679 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("am.c([BI)Lkr;")
    public static class299 method676(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class299 var1 = new class299(arg0, Statics.field3809, Statics.field3808, Statics.field2414, Statics.field3805, Statics.field3807, Statics.field3679);
        Statics.field3809 = null;
        Statics.field3808 = null;
        Statics.field2414 = null;
        Statics.field3805 = null;
        Statics.field3807 = null;
        Statics.field3679 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("ko.e(Liv;III)Z")
    public static boolean method5267(class248 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4250(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3165(var3);
            return true;
        }
    }

    @ObfuscatedName("fr.t([BI)V")
    public static void method3165(byte[] arg0) {
        class183 var1 = new class183(arg0);
        var1.field2360 = arg0.length - 2;
        Statics.field3810 = var1.method3268();
        Statics.field3809 = new int[Statics.field3810];
        Statics.field3808 = new int[Statics.field3810];
        Statics.field2414 = new int[Statics.field3810];
        Statics.field3805 = new int[Statics.field3810];
        Statics.field3679 = new byte[Statics.field3810][];
        var1.field2360 = arg0.length - 7 - Statics.field3810 * 8;
        Statics.field3806 = var1.method3268();
        Statics.field3575 = var1.method3268();
        int var2 = (var1.method3436() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3810; var3++) {
            Statics.field3809[var3] = var1.method3268();
        }
        for (int var4 = 0; var4 < Statics.field3810; var4++) {
            Statics.field3808[var4] = var1.method3268();
        }
        for (int var5 = 0; var5 < Statics.field3810; var5++) {
            Statics.field2414[var5] = var1.method3268();
        }
        for (int var6 = 0; var6 < Statics.field3810; var6++) {
            Statics.field3805[var6] = var1.method3268();
        }
        var1.field2360 = arg0.length - 7 - Statics.field3810 * 8 - (var2 - 1) * 3;
        Statics.field3807 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3807[var7] = var1.method3266();
            if (Statics.field3807[var7] == 0) {
                Statics.field3807[var7] = 1;
            }
        }
        var1.field2360 = 0;
        for (int var8 = 0; var8 < Statics.field3810; var8++) {
            int var9 = Statics.field2414[var8];
            int var10 = Statics.field3805[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3679[var8] = var12;
            int var13 = var1.method3436();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3263();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3263();
                    }
                }
            }
        }
    }
}
