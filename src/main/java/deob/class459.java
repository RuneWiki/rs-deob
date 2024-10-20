package deob;

@ObfuscatedName("qe")
public class class459 {

    public class459() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("od.c(Llv;III)[Lqu;")
    public static class457[] method6582(class317 arg0, int arg1, int arg2) {
        return method4100(arg0, arg1, arg2) ? method1929() : null;
    }

    @ObfuscatedName("pa.p(Llv;III)Lqu;")
    public static class457 method7049(class317 arg0, int arg1, int arg2) {
        return method4100(arg0, arg1, arg2) ? method6063() : null;
    }

    @ObfuscatedName("qd.f(Llv;III)[Lqi;")
    public static class458[] method7564(class317 arg0, int arg1, int arg2) {
        return method4100(arg0, arg1, arg2) ? method2831() : null;
    }

    @ObfuscatedName("dz.n(Llv;III)Lqi;")
    public static class458 method2680(class317 arg0, int arg1, int arg2) {
        if (!method4100(arg0, arg1, arg2)) {
            return null;
        }
        class458 var3 = new class458();
        var3.field4824 = Statics.field1015;
        var3.field4830 = Statics.field4478;
        var3.field4827 = Statics.field4837[0];
        var3.field4828 = Statics.field4838[0];
        var3.field4825 = Statics.field482[0];
        var3.field4829 = Statics.field1389[0];
        int var4 = var3.field4829 * var3.field4825;
        byte[] var5 = Statics.field1776[0];
        var3.field4826 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field4826[var6] = Statics.field4839[var5[var6] & 0xFF];
        }
        Statics.field4837 = null;
        Statics.field4838 = null;
        Statics.field482 = null;
        Statics.field1389 = null;
        Statics.field4839 = null;
        Statics.field1776 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("qs.k(Llv;Llv;III)Lmv;")
    public static class351 method7455(class317 arg0, class317 arg1, int arg2, int arg3) {
        if (!method4100(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method5499(arg2, arg3);
        class351 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class351 var6 = new class351(var4, Statics.field4837, Statics.field4838, Statics.field482, Statics.field1389, Statics.field4839, Statics.field1776);
            Statics.field4837 = null;
            Statics.field4838 = null;
            Statics.field482 = null;
            Statics.field1389 = null;
            Statics.field4839 = null;
            Statics.field1776 = (byte[][]) null;
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("ko.w(Llv;Ljava/lang/String;Ljava/lang/String;I)[Lqu;")
    public static class457[] method5114(class317 arg0, String arg1, String arg2) {
        int var3 = arg0.method5482(arg1);
        int var4 = arg0.method5432(var3, arg2);
        return method6582(arg0, var3, var4);
    }

    @ObfuscatedName("ia.s(Llv;Ljava/lang/String;Ljava/lang/String;B)Lqu;")
    public static class457 method4687(class317 arg0, String arg1, String arg2) {
        int var3 = arg0.method5482(arg1);
        int var4 = arg0.method5432(var3, arg2);
        return method7049(arg0, var3, var4);
    }

    @ObfuscatedName("mw.q(Llv;Llv;Ljava/lang/String;Ljava/lang/String;I)Lmv;")
    public static class351 method6113(class317 arg0, class317 arg1, String arg2, String arg3) {
        int var4 = arg0.method5482(arg2);
        int var5 = arg0.method5432(var4, arg3);
        return method7455(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("bl.m(I)[Lqu;")
    public static class457[] method1929() {
        class457[] var0 = new class457[Statics.field4836];
        for (int var1 = 0; var1 < Statics.field4836; var1++) {
            class457 var2 = var0[var1] = new class457();
            var2.field4817 = Statics.field1015;
            var2.field4823 = Statics.field4478;
            var2.field4822 = Statics.field4837[var1];
            var2.field4816 = Statics.field4838[var1];
            var2.field4818 = Statics.field482[var1];
            var2.field4819 = Statics.field1389[var1];
            var2.field4820 = Statics.field4839;
            var2.field4821 = Statics.field1776[var1];
        }
        Statics.field4837 = null;
        Statics.field4838 = null;
        Statics.field482 = null;
        Statics.field1389 = null;
        Statics.field4839 = null;
        Statics.field1776 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("mm.x(B)Lqu;")
    public static class457 method6063() {
        class457 var0 = new class457();
        var0.field4817 = Statics.field1015;
        var0.field4823 = Statics.field4478;
        var0.field4822 = Statics.field4837[0];
        var0.field4816 = Statics.field4838[0];
        var0.field4818 = Statics.field482[0];
        var0.field4819 = Statics.field1389[0];
        var0.field4820 = Statics.field4839;
        var0.field4821 = Statics.field1776[0];
        Statics.field4837 = null;
        Statics.field4838 = null;
        Statics.field482 = null;
        Statics.field1389 = null;
        Statics.field4839 = null;
        Statics.field1776 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("dc.j(S)[Lqi;")
    public static class458[] method2831() {
        class458[] var0 = new class458[Statics.field4836];
        for (int var1 = 0; var1 < Statics.field4836; var1++) {
            class458 var2 = var0[var1] = new class458();
            var2.field4824 = Statics.field1015;
            var2.field4830 = Statics.field4478;
            var2.field4827 = Statics.field4837[var1];
            var2.field4828 = Statics.field4838[var1];
            var2.field4825 = Statics.field482[var1];
            var2.field4829 = Statics.field1389[var1];
            int var3 = var2.field4829 * var2.field4825;
            byte[] var4 = Statics.field1776[var1];
            var2.field4826 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field4826[var5] = Statics.field4839[var4[var5] & 0xFF];
            }
        }
        Statics.field4837 = null;
        Statics.field4838 = null;
        Statics.field482 = null;
        Statics.field1389 = null;
        Statics.field4839 = null;
        Statics.field1776 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("hi.v(Llv;IIB)Z")
    public static boolean method4100(class317 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5499(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method7026(var3);
            return true;
        }
    }

    @ObfuscatedName("pv.h([BB)V")
    public static void method7026(byte[] arg0) {
        class445 var1 = new class445(arg0);
        var1.field4735 = arg0.length - 2;
        Statics.field4836 = var1.method7198();
        Statics.field4837 = new int[Statics.field4836];
        Statics.field4838 = new int[Statics.field4836];
        Statics.field482 = new int[Statics.field4836];
        Statics.field1389 = new int[Statics.field4836];
        Statics.field1776 = new byte[Statics.field4836][];
        var1.field4735 = arg0.length - 7 - Statics.field4836 * 8;
        Statics.field1015 = var1.method7198();
        Statics.field4478 = var1.method7198();
        int var2 = (var1.method7196() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field4836; var3++) {
            Statics.field4837[var3] = var1.method7198();
        }
        for (int var4 = 0; var4 < Statics.field4836; var4++) {
            Statics.field4838[var4] = var1.method7198();
        }
        for (int var5 = 0; var5 < Statics.field4836; var5++) {
            Statics.field482[var5] = var1.method7198();
        }
        for (int var6 = 0; var6 < Statics.field4836; var6++) {
            Statics.field1389[var6] = var1.method7198();
        }
        var1.field4735 = arg0.length - 7 - Statics.field4836 * 8 - (var2 - 1) * 3;
        Statics.field4839 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field4839[var7] = var1.method7340();
            if (Statics.field4839[var7] == 0) {
                Statics.field4839[var7] = 1;
            }
        }
        var1.field4735 = 0;
        for (int var8 = 0; var8 < Statics.field4836; var8++) {
            int var9 = Statics.field482[var8];
            int var10 = Statics.field1389[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1776[var8] = var12;
            int var13 = var1.method7196();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method7197();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method7197();
                    }
                }
            }
        }
    }
}
