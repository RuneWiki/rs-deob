package deob;

@ObfuscatedName("kg")
public class class296 {

    public class296() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("by.b(Lij;IIB)Lks;")
    public static class294 method888(class243 arg0, int arg1, int arg2) {
        if (!method4433(arg0, arg1, arg2)) {
            return null;
        }
        class294 var3 = new class294();
        var3.field3831 = Statics.field3847;
        var3.field3830 = Statics.field2851;
        var3.field3832 = Statics.field775[0];
        var3.field3829 = Statics.field3787[0];
        var3.field3828 = Statics.field3849[0];
        var3.field3826 = Statics.field3846[0];
        var3.field3827 = Statics.field3734;
        var3.field3833 = Statics.field797[0];
        method4566();
        return var3;
    }

    @ObfuscatedName("ju.s(Lij;III)[Lkb;")
    public static class295[] method4442(class243 arg0, int arg1, int arg2) {
        if (!method4433(arg0, arg1, arg2)) {
            return null;
        }
        class295[] var3 = new class295[Statics.field3848];
        for (int var4 = 0; var4 < Statics.field3848; var4++) {
            class295 var5 = var3[var4] = new class295();
            var5.field3834 = Statics.field3847;
            var5.field3840 = Statics.field2851;
            var5.field3837 = Statics.field775[var4];
            var5.field3838 = Statics.field3787[var4];
            var5.field3845 = Statics.field3849[var4];
            var5.field3836 = Statics.field3846[var4];
            int var6 = var5.field3845 * var5.field3836;
            byte[] var7 = Statics.field797[var4];
            var5.field3842 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field3842[var8] = Statics.field3734[var7[var8] & 0xFF];
            }
        }
        method4566();
        return var3;
    }

    @ObfuscatedName("fr.r(Lij;IIB)Lkb;")
    public static class295 method2845(class243 arg0, int arg1, int arg2) {
        return method4433(arg0, arg1, arg2) ? method2675() : null;
    }

    @ObfuscatedName("kr.g(Lij;Lij;IIB)Ljn;")
    public static class271 method4644(class243 arg0, class243 arg1, int arg2, int arg3) {
        if (!method4433(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3887(arg2, arg3);
        class271 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class271 var6 = new class271(var4, Statics.field775, Statics.field3787, Statics.field3849, Statics.field3846, Statics.field3734, Statics.field797);
            method4566();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("ac.x(Lij;Ljava/lang/String;Ljava/lang/String;I)[Lks;")
    public static class294[] method448(class243 arg0, String arg1, String arg2) {
        int var3 = arg0.method3832(arg1);
        int var4 = arg0.method3833(var3, arg2);
        class294[] var5;
        if (method4433(arg0, var3, var4)) {
            class294[] var6 = new class294[Statics.field3848];
            for (int var7 = 0; var7 < Statics.field3848; var7++) {
                class294 var8 = var6[var7] = new class294();
                var8.field3831 = Statics.field3847;
                var8.field3830 = Statics.field2851;
                var8.field3832 = Statics.field775[var7];
                var8.field3829 = Statics.field3787[var7];
                var8.field3828 = Statics.field3849[var7];
                var8.field3826 = Statics.field3846[var7];
                var8.field3827 = Statics.field3734;
                var8.field3833 = Statics.field797[var7];
            }
            method4566();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bu.f(Lij;Ljava/lang/String;Ljava/lang/String;I)Lks;")
    public static class294 method979(class243 arg0, String arg1, String arg2) {
        int var3 = arg0.method3832(arg1);
        int var4 = arg0.method3833(var3, arg2);
        return method888(arg0, var3, var4);
    }

    @ObfuscatedName("ag.u(Lij;Ljava/lang/String;Ljava/lang/String;B)[Lkb;")
    public static class295[] method524(class243 arg0, String arg1, String arg2) {
        int var3 = arg0.method3832(arg1);
        int var4 = arg0.method3833(var3, arg2);
        return method4442(arg0, var3, var4);
    }

    @ObfuscatedName("ak.t(Lij;Ljava/lang/String;Ljava/lang/String;I)Lkb;")
    public static class295 method210(class243 arg0, String arg1, String arg2) {
        int var3 = arg0.method3832(arg1);
        int var4 = arg0.method3833(var3, arg2);
        return method2845(arg0, var3, var4);
    }

    @ObfuscatedName("af.k(Lij;Lij;Ljava/lang/String;Ljava/lang/String;I)Ljn;")
    public static class271 method535(class243 arg0, class243 arg1, String arg2, String arg3) {
        int var4 = arg0.method3832(arg2);
        int var5 = arg0.method3833(var4, arg3);
        return method4644(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("ig.n(Lij;IB)Lks;")
    public static class294 method4118(class243 arg0, int arg1) {
        byte[] var2 = arg0.method3823(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method1383(var2);
            var3 = true;
        }
        return var3 ? method4542() : null;
    }

    @ObfuscatedName("jw.d(B)Lks;")
    public static class294 method4542() {
        class294 var0 = new class294();
        var0.field3831 = Statics.field3847;
        var0.field3830 = Statics.field2851;
        var0.field3832 = Statics.field775[0];
        var0.field3829 = Statics.field3787[0];
        var0.field3828 = Statics.field3849[0];
        var0.field3826 = Statics.field3846[0];
        var0.field3827 = Statics.field3734;
        var0.field3833 = Statics.field797[0];
        method4566();
        return var0;
    }

    @ObfuscatedName("ez.o(I)Lkb;")
    public static class295 method2675() {
        class295 var0 = new class295();
        var0.field3834 = Statics.field3847;
        var0.field3840 = Statics.field2851;
        var0.field3837 = Statics.field775[0];
        var0.field3838 = Statics.field3787[0];
        var0.field3845 = Statics.field3849[0];
        var0.field3836 = Statics.field3846[0];
        int var1 = var0.field3845 * var0.field3836;
        byte[] var2 = Statics.field797[0];
        var0.field3842 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3842[var3] = Statics.field3734[var2[var3] & 0xFF];
        }
        method4566();
        return var0;
    }

    @ObfuscatedName("jh.a(Lij;III)Z")
    public static boolean method4433(class243 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3887(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1383(var3);
            return true;
        }
    }

    @ObfuscatedName("bj.q([BI)V")
    public static void method1383(byte[] arg0) {
        class181 var1 = new class181(arg0);
        var1.field2488 = arg0.length - 2;
        Statics.field3848 = var1.method3081();
        Statics.field775 = new int[Statics.field3848];
        Statics.field3787 = new int[Statics.field3848];
        Statics.field3849 = new int[Statics.field3848];
        Statics.field3846 = new int[Statics.field3848];
        Statics.field797 = new byte[Statics.field3848][];
        var1.field2488 = arg0.length - 7 - Statics.field3848 * 8;
        Statics.field3847 = var1.method3081();
        Statics.field2851 = var1.method3081();
        int var2 = (var1.method2945() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3848; var3++) {
            Statics.field775[var3] = var1.method3081();
        }
        for (int var4 = 0; var4 < Statics.field3848; var4++) {
            Statics.field3787[var4] = var1.method3081();
        }
        for (int var5 = 0; var5 < Statics.field3848; var5++) {
            Statics.field3849[var5] = var1.method3081();
        }
        for (int var6 = 0; var6 < Statics.field3848; var6++) {
            Statics.field3846[var6] = var1.method3081();
        }
        var1.field2488 = arg0.length - 7 - Statics.field3848 * 8 - (var2 - 1) * 3;
        Statics.field3734 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3734[var7] = var1.method3010();
            if (Statics.field3734[var7] == 0) {
                Statics.field3734[var7] = 1;
            }
        }
        var1.field2488 = 0;
        for (int var8 = 0; var8 < Statics.field3848; var8++) {
            int var9 = Statics.field3849[var8];
            int var10 = Statics.field3846[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field797[var8] = var12;
            int var13 = var1.method2945();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2946();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2946();
                    }
                }
            }
        }
    }

    @ObfuscatedName("jy.j(I)V")
    public static void method4566() {
        Statics.field775 = null;
        Statics.field3787 = null;
        Statics.field3849 = null;
        Statics.field3846 = null;
        Statics.field3734 = null;
        Statics.field797 = (byte[][]) null;
    }
}
