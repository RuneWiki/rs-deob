package deob;

@ObfuscatedName("kc")
public class class287 {

    public class287() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jk.e(Lin;III)Lje;")
    public static class286 method4552(class236 arg0, int arg1, int arg2) {
        return method225(arg0, arg1, arg2) ? Statics.method157() : null;
    }

    @ObfuscatedName("jj.o(Lin;Lin;III)Ljf;")
    public static class264 method4542(class236 arg0, class236 arg1, int arg2, int arg3) {
        return method225(arg0, arg2, arg3) ? method138(arg1.method3760(arg2, arg3)) : null;
    }

    @ObfuscatedName("hw.m(Lin;Ljava/lang/String;Ljava/lang/String;I)[Ljh;")
    public static class285[] method3748(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3776(arg1);
        int var4 = arg0.method3777(var3, arg2);
        class285[] var5;
        if (method225(arg0, var3, var4)) {
            class285[] var6 = new class285[Statics.field3793];
            for (int var7 = 0; var7 < Statics.field3793; var7++) {
                class285 var8 = var6[var7] = new class285();
                var8.field3772 = Statics.field3353;
                var8.field3773 = Statics.field2770;
                var8.field3771 = Statics.field3787[var7];
                var8.field3770 = Statics.field3790[var7];
                var8.field3768 = Statics.field3789[var7];
                var8.field3769 = Statics.field3788[var7];
                var8.field3767 = Statics.field3791;
                var8.field3766 = Statics.field3792[var7];
            }
            method20();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("j.d(Lin;Ljava/lang/String;Ljava/lang/String;B)[Lje;")
    public static class286[] method26(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3776(arg1);
        int var4 = arg0.method3777(var3, arg2);
        class286[] var5;
        if (method225(arg0, var3, var4)) {
            var5 = method4022();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fd.b(Lin;Ljava/lang/String;Ljava/lang/String;B)Lje;")
    public static class286 method2860(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3776(arg1);
        int var4 = arg0.method3777(var3, arg2);
        return method4552(arg0, var3, var4);
    }

    @ObfuscatedName("g.q(Lin;IB)Ljh;")
    public static class285 method7(class236 arg0, int arg1) {
        byte[] var2 = arg0.method3797(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method2760(var2);
            var3 = true;
        }
        return var3 ? method470() : null;
    }

    @ObfuscatedName("ax.h(B)Ljh;")
    public static class285 method470() {
        class285 var0 = new class285();
        var0.field3772 = Statics.field3353;
        var0.field3773 = Statics.field2770;
        var0.field3771 = Statics.field3787[0];
        var0.field3770 = Statics.field3790[0];
        var0.field3768 = Statics.field3789[0];
        var0.field3769 = Statics.field3788[0];
        var0.field3767 = Statics.field3791;
        var0.field3766 = Statics.field3792[0];
        method20();
        return var0;
    }

    @ObfuscatedName("ix.i(B)[Lje;")
    public static class286[] method4022() {
        class286[] var0 = new class286[Statics.field3793];
        for (int var1 = 0; var1 < Statics.field3793; var1++) {
            class286 var2 = var0[var1] = new class286();
            var2.field3776 = Statics.field3353;
            var2.field3780 = Statics.field2770;
            var2.field3777 = Statics.field3787[var1];
            var2.field3778 = Statics.field3790[var1];
            var2.field3774 = Statics.field3789[var1];
            var2.field3775 = Statics.field3788[var1];
            int var3 = var2.field3775 * var2.field3774;
            byte[] var4 = Statics.field3792[var1];
            var2.field3779 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3779[var5] = Statics.field3791[var4[var5] & 0xFF];
            }
        }
        method20();
        return var0;
    }

    @ObfuscatedName("x.n([BI)Ljf;")
    public static class264 method138(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class264 var1 = new class264(arg0, Statics.field3787, Statics.field3790, Statics.field3789, Statics.field3788, Statics.field3791, Statics.field3792);
            method20();
            return var1;
        }
    }

    @ObfuscatedName("ar.c(Lin;IIB)Z")
    public static boolean method225(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3760(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2760(var3);
            return true;
        }
    }

    @ObfuscatedName("fg.v([BI)V")
    public static void method2760(byte[] arg0) {
        class174 var1 = new class174(arg0);
        var1.field2370 = arg0.length - 2;
        Statics.field3793 = var1.method2930();
        Statics.field3787 = new int[Statics.field3793];
        Statics.field3790 = new int[Statics.field3793];
        Statics.field3789 = new int[Statics.field3793];
        Statics.field3788 = new int[Statics.field3793];
        Statics.field3792 = new byte[Statics.field3793][];
        var1.field2370 = arg0.length - 7 - Statics.field3793 * 8;
        Statics.field3353 = var1.method2930();
        Statics.field2770 = var1.method2930();
        int var2 = (var1.method2891() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3793; var3++) {
            Statics.field3787[var3] = var1.method2930();
        }
        for (int var4 = 0; var4 < Statics.field3793; var4++) {
            Statics.field3790[var4] = var1.method2930();
        }
        for (int var5 = 0; var5 < Statics.field3793; var5++) {
            Statics.field3789[var5] = var1.method2930();
        }
        for (int var6 = 0; var6 < Statics.field3793; var6++) {
            Statics.field3788[var6] = var1.method2930();
        }
        var1.field2370 = arg0.length - 7 - Statics.field3793 * 8 - (var2 - 1) * 3;
        Statics.field3791 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3791[var7] = var1.method2890();
            if (Statics.field3791[var7] == 0) {
                Statics.field3791[var7] = 1;
            }
        }
        var1.field2370 = 0;
        for (int var8 = 0; var8 < Statics.field3793; var8++) {
            int var9 = Statics.field3789[var8];
            int var10 = Statics.field3788[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3792[var8] = var12;
            int var13 = var1.method2891();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2944();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2944();
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.u(S)V")
    public static void method20() {
        Statics.field3787 = null;
        Statics.field3790 = null;
        Statics.field3789 = null;
        Statics.field3788 = null;
        Statics.field3791 = null;
        Statics.field3792 = (byte[][]) null;
    }
}
