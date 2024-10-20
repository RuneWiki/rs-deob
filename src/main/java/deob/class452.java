package deob;

@ObfuscatedName("qy")
public class class452 {

    public class452() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("py.v(Lln;III)[Lqi;")
    public static class451[] method6880(class316 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5296(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3692(var3);
            var4 = true;
        }
        return var4 ? method6447() : null;
    }

    @ObfuscatedName("s.c(Lln;III)Lqi;")
    public static class451 method35(class316 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5296(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3692(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class451 var5 = new class451();
        var5.field4714 = Statics.field4726;
        var5.field4715 = Statics.field4723;
        var5.field4712 = Statics.field4724[0];
        var5.field4716 = Statics.field3158[0];
        var5.field4719 = Statics.field4725[0];
        var5.field4710 = Statics.field4727[0];
        int var6 = var5.field4719 * var5.field4710;
        byte[] var7 = Statics.field4251[0];
        var5.field4717 = new int[var6];
        for (int var8 = 0; var8 < var6; var8++) {
            var5.field4717[var8] = Statics.field3965[var7[var8] & 0xFF];
        }
        method5248();
        return var5;
    }

    @ObfuscatedName("fa.i(Lln;Lln;IIB)Lmd;")
    public static class344 method3010(class316 arg0, class316 arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method5296(arg2, arg3);
        boolean var5;
        if (var4 == null) {
            var5 = false;
        } else {
            method3692(var4);
            var5 = true;
        }
        return var5 ? method4603(arg1.method5296(arg2, arg3)) : null;
    }

    @ObfuscatedName("cq.f(Lln;Ljava/lang/String;Ljava/lang/String;I)[Lqq;")
    public static class450[] method2276(class316 arg0, String arg1, String arg2) {
        int var3 = arg0.method5293(arg1);
        int var4 = arg0.method5312(var3, arg2);
        byte[] var5 = arg0.method5296(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method3692(var5);
            var6 = true;
        }
        class450[] var7;
        if (var6) {
            class450[] var8 = new class450[Statics.field4722];
            for (int var9 = 0; var9 < Statics.field4722; var9++) {
                class450 var10 = var8[var9] = new class450();
                var10.field4707 = Statics.field4726;
                var10.field4701 = Statics.field4723;
                var10.field4705 = Statics.field4724[var9];
                var10.field4706 = Statics.field3158[var9];
                var10.field4703 = Statics.field4725[var9];
                var10.field4704 = Statics.field4727[var9];
                var10.field4702 = Statics.field3965;
                var10.field4708 = Statics.field4251[var9];
            }
            method5248();
            var7 = var8;
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("ny.b(Lln;Ljava/lang/String;Ljava/lang/String;B)Lqq;")
    public static class450 method6221(class316 arg0, String arg1, String arg2) {
        int var3 = arg0.method5293(arg1);
        int var4 = arg0.method5312(var3, arg2);
        byte[] var5 = arg0.method5296(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method3692(var5);
            var6 = true;
        }
        class450 var7;
        if (var6) {
            var7 = method3161();
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("pk.n(Lln;Lln;Ljava/lang/String;Ljava/lang/String;I)Lmd;")
    public static class344 method6897(class316 arg0, class316 arg1, String arg2, String arg3) {
        int var4 = arg0.method5293(arg2);
        int var5 = arg0.method5312(var4, arg3);
        return method3010(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("fw.s(I)Lqq;")
    public static class450 method3161() {
        class450 var0 = new class450();
        var0.field4707 = Statics.field4726;
        var0.field4701 = Statics.field4723;
        var0.field4705 = Statics.field4724[0];
        var0.field4706 = Statics.field3158[0];
        var0.field4703 = Statics.field4725[0];
        var0.field4704 = Statics.field4727[0];
        var0.field4702 = Statics.field3965;
        var0.field4708 = Statics.field4251[0];
        method5248();
        return var0;
    }

    @ObfuscatedName("oa.l(I)[Lqi;")
    public static class451[] method6447() {
        class451[] var0 = new class451[Statics.field4722];
        for (int var1 = 0; var1 < Statics.field4722; var1++) {
            class451 var2 = var0[var1] = new class451();
            var2.field4714 = Statics.field4726;
            var2.field4715 = Statics.field4723;
            var2.field4712 = Statics.field4724[var1];
            var2.field4716 = Statics.field3158[var1];
            var2.field4719 = Statics.field4725[var1];
            var2.field4710 = Statics.field4727[var1];
            int var3 = var2.field4719 * var2.field4710;
            byte[] var4 = Statics.field4251[var1];
            var2.field4717 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field4717[var5] = Statics.field3965[var4[var5] & 0xFF];
            }
        }
        method5248();
        return var0;
    }

    @ObfuscatedName("in.q([BI)Lmd;")
    public static class344 method4603(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class344 var1 = new class344(arg0, Statics.field4724, Statics.field3158, Statics.field4725, Statics.field4727, Statics.field3965, Statics.field4251);
            method5248();
            return var1;
        }
    }

    @ObfuscatedName("gu.o([BI)V")
    public static void method3692(byte[] arg0) {
        class438 var1 = new class438(arg0);
        var1.field4621 = arg0.length - 2;
        Statics.field4722 = var1.method7148();
        Statics.field4724 = new int[Statics.field4722];
        Statics.field3158 = new int[Statics.field4722];
        Statics.field4725 = new int[Statics.field4722];
        Statics.field4727 = new int[Statics.field4722];
        Statics.field4251 = new byte[Statics.field4722][];
        var1.field4621 = arg0.length - 7 - Statics.field4722 * 8;
        Statics.field4726 = var1.method7148();
        Statics.field4723 = var1.method7148();
        int var2 = (var1.method6971() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field4722; var3++) {
            Statics.field4724[var3] = var1.method7148();
        }
        for (int var4 = 0; var4 < Statics.field4722; var4++) {
            Statics.field3158[var4] = var1.method7148();
        }
        for (int var5 = 0; var5 < Statics.field4722; var5++) {
            Statics.field4725[var5] = var1.method7148();
        }
        for (int var6 = 0; var6 < Statics.field4722; var6++) {
            Statics.field4727[var6] = var1.method7148();
        }
        var1.field4621 = arg0.length - 7 - Statics.field4722 * 8 - (var2 - 1) * 3;
        Statics.field3965 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3965[var7] = var1.method6975();
            if (Statics.field3965[var7] == 0) {
                Statics.field3965[var7] = 1;
            }
        }
        var1.field4621 = 0;
        for (int var8 = 0; var8 < Statics.field4722; var8++) {
            int var9 = Statics.field4725[var8];
            int var10 = Statics.field4727[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field4251[var8] = var12;
            int var13 = var1.method6971();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method7093();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method7093();
                    }
                }
            }
        }
    }

    @ObfuscatedName("lg.r(I)V")
    public static void method5248() {
        Statics.field4724 = null;
        Statics.field3158 = null;
        Statics.field4725 = null;
        Statics.field4727 = null;
        Statics.field3965 = null;
        Statics.field4251 = (byte[][]) null;
    }
}
