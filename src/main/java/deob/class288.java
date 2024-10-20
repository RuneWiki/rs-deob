package deob;

@ObfuscatedName("ku")
public class class288 {

    public class288() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jk.d(Lit;III)Ljz;")
    public static class286 method4454(class236 arg0, int arg1, int arg2) {
        return method4159(arg0, arg1, arg2) ? method970() : null;
    }

    @ObfuscatedName("dk.k(Lit;IIB)Lkr;")
    public static class287 method1953(class236 arg0, int arg1, int arg2) {
        return method4159(arg0, arg1, arg2) ? method2758() : null;
    }

    @ObfuscatedName("ba.e(Lit;Ljava/lang/String;Ljava/lang/String;S)[Ljz;")
    public static class286[] method1046(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3896(arg1);
        int var4 = arg0.method3892(var3, arg2);
        class286[] var5;
        if (method4159(arg0, var3, var4)) {
            class286[] var6 = new class286[Statics.field299];
            for (int var7 = 0; var7 < Statics.field299; var7++) {
                class286 var8 = var6[var7] = new class286();
                var8.field3793 = Statics.field3809;
                var8.field3794 = Statics.field2326;
                var8.field3787 = Statics.field3808[var7];
                var8.field3792 = Statics.field1301[var7];
                var8.field3791 = Statics.field3239[var7];
                var8.field3790 = Statics.field3208[var7];
                var8.field3788 = Statics.field2457;
                var8.field3789 = Statics.field2608[var7];
            }
            method1471();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bt.p(Lit;Ljava/lang/String;Ljava/lang/String;I)Ljz;")
    public static class286 method1049(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3896(arg1);
        int var4 = arg0.method3892(var3, arg2);
        return method4454(arg0, var3, var4);
    }

    @ObfuscatedName("aw.q(Lit;Ljava/lang/String;Ljava/lang/String;I)[Lkr;")
    public static class287[] method588(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3896(arg1);
        int var4 = arg0.method3892(var3, arg2);
        class287[] var5;
        if (method4159(arg0, var3, var4)) {
            var5 = method1597();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("br.s(Lit;Ljava/lang/String;Ljava/lang/String;B)Lkr;")
    public static class287 method1031(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3896(arg1);
        int var4 = arg0.method3892(var3, arg2);
        return method1953(arg0, var3, var4);
    }

    @ObfuscatedName("ac.r(Lit;Lit;Ljava/lang/String;Ljava/lang/String;I)Lju;")
    public static class264 method642(class236 arg0, class236 arg1, String arg2, String arg3) {
        int var4 = arg0.method3896(arg2);
        int var5 = arg0.method3892(var4, arg3);
        class264 var6;
        if (method4159(arg0, var4, var5)) {
            byte[] var7 = arg1.method3875(var4, var5);
            class264 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class264 var9 = new class264(var7, Statics.field3808, Statics.field1301, Statics.field3239, Statics.field3208, Statics.field2457, Statics.field2608);
                method1471();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("bl.g(I)Ljz;")
    public static class286 method970() {
        class286 var0 = new class286();
        var0.field3793 = Statics.field3809;
        var0.field3794 = Statics.field2326;
        var0.field3787 = Statics.field3808[0];
        var0.field3792 = Statics.field1301[0];
        var0.field3791 = Statics.field3239[0];
        var0.field3790 = Statics.field3208[0];
        var0.field3788 = Statics.field2457;
        var0.field3789 = Statics.field2608[0];
        method1471();
        return var0;
    }

    @ObfuscatedName("cd.v(I)[Lkr;")
    public static class287[] method1597() {
        class287[] var0 = new class287[Statics.field299];
        for (int var1 = 0; var1 < Statics.field299; var1++) {
            class287 var2 = var0[var1] = new class287();
            var2.field3800 = Statics.field3809;
            var2.field3795 = Statics.field2326;
            var2.field3797 = Statics.field3808[var1];
            var2.field3799 = Statics.field1301[var1];
            var2.field3798 = Statics.field3239[var1];
            var2.field3801 = Statics.field3208[var1];
            int var3 = var2.field3801 * var2.field3798;
            byte[] var4 = Statics.field2608[var1];
            var2.field3796 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3796[var5] = Statics.field2457[var4[var5] & 0xFF];
            }
        }
        method1471();
        return var0;
    }

    @ObfuscatedName("ez.t(I)Lkr;")
    public static class287 method2758() {
        class287 var0 = new class287();
        var0.field3800 = Statics.field3809;
        var0.field3795 = Statics.field2326;
        var0.field3797 = Statics.field3808[0];
        var0.field3799 = Statics.field1301[0];
        var0.field3798 = Statics.field3239[0];
        var0.field3801 = Statics.field3208[0];
        int var1 = var0.field3801 * var0.field3798;
        byte[] var2 = Statics.field2608[0];
        var0.field3796 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3796[var3] = Statics.field2457[var2[var3] & 0xFF];
        }
        method1471();
        return var0;
    }

    @ObfuscatedName("if.y(Lit;III)Z")
    public static boolean method4159(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3875(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2790(var3);
            return true;
        }
    }

    @ObfuscatedName("am.o(Lit;II)Z")
    public static boolean method452(class236 arg0, int arg1) {
        byte[] var2 = arg0.method3881(arg1);
        if (var2 == null) {
            return false;
        } else {
            method2790(var2);
            return true;
        }
    }

    @ObfuscatedName("fu.i([BB)V")
    public static void method2790(byte[] arg0) {
        class174 var1 = new class174(arg0);
        var1.field2405 = arg0.length - 2;
        Statics.field299 = var1.method3035();
        Statics.field3808 = new int[Statics.field299];
        Statics.field1301 = new int[Statics.field299];
        Statics.field3239 = new int[Statics.field299];
        Statics.field3208 = new int[Statics.field299];
        Statics.field2608 = new byte[Statics.field299][];
        var1.field2405 = arg0.length - 7 - Statics.field299 * 8;
        Statics.field3809 = var1.method3035();
        Statics.field2326 = var1.method3035();
        int var2 = (var1.method2955() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field299; var3++) {
            Statics.field3808[var3] = var1.method3035();
        }
        for (int var4 = 0; var4 < Statics.field299; var4++) {
            Statics.field1301[var4] = var1.method3035();
        }
        for (int var5 = 0; var5 < Statics.field299; var5++) {
            Statics.field3239[var5] = var1.method3035();
        }
        for (int var6 = 0; var6 < Statics.field299; var6++) {
            Statics.field3208[var6] = var1.method3035();
        }
        var1.field2405 = arg0.length - 7 - Statics.field299 * 8 - (var2 - 1) * 3;
        Statics.field2457 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2457[var7] = var1.method3059();
            if (Statics.field2457[var7] == 0) {
                Statics.field2457[var7] = 1;
            }
        }
        var1.field2405 = 0;
        for (int var8 = 0; var8 < Statics.field299; var8++) {
            int var9 = Statics.field3239[var8];
            int var10 = Statics.field3208[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2608[var8] = var12;
            int var13 = var1.method2955();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2956();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2956();
                    }
                }
            }
        }
    }

    @ObfuscatedName("bs.u(I)V")
    public static void method1471() {
        Statics.field3808 = null;
        Statics.field1301 = null;
        Statics.field3239 = null;
        Statics.field3208 = null;
        Statics.field2457 = null;
        Statics.field2608 = (byte[][]) null;
    }
}
