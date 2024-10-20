package deob;

@ObfuscatedName("qb")
public class class457 {

    public class457() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ew.c(Llh;III)[Lqu;")
    public static class455[] method2699(class315 arg0, int arg1, int arg2) {
        if (!method6174(arg0, arg1, arg2)) {
            return null;
        }
        class455[] var3 = new class455[Statics.field4808];
        for (int var4 = 0; var4 < Statics.field4808; var4++) {
            class455 var5 = var3[var4] = new class455();
            var5.field4787 = Statics.field2622;
            var5.field4794 = Statics.field4807;
            var5.field4788 = Statics.field4648[var4];
            var5.field4791 = Statics.field1664[var4];
            var5.field4789 = Statics.field4262[var4];
            var5.field4790 = Statics.field4809[var4];
            var5.field4792 = Statics.field73;
            var5.field4793 = Statics.field4609[var4];
        }
        Statics.field4648 = null;
        Statics.field1664 = null;
        Statics.field4262 = null;
        Statics.field4809 = null;
        Statics.field73 = null;
        Statics.field4609 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("pu.v(Llh;III)[Lqe;")
    public static class456[] method6878(class315 arg0, int arg1, int arg2) {
        return method6174(arg0, arg1, arg2) ? Statics.method4727() : null;
    }

    @ObfuscatedName("w.q(Llh;III)Lqe;")
    public static class456 method52(class315 arg0, int arg1, int arg2) {
        if (!method6174(arg0, arg1, arg2)) {
            return null;
        }
        class456 var3 = new class456();
        var3.field4800 = Statics.field2622;
        var3.field4798 = Statics.field4807;
        var3.field4797 = Statics.field4648[0];
        var3.field4799 = Statics.field1664[0];
        var3.field4796 = Statics.field4262[0];
        var3.field4795 = Statics.field4809[0];
        int var4 = var3.field4796 * var3.field4795;
        byte[] var5 = Statics.field4609[0];
        var3.field4804 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field4804[var6] = Statics.field73[var5[var6] & 0xFF];
        }
        Statics.field4648 = null;
        Statics.field1664 = null;
        Statics.field4262 = null;
        Statics.field4809 = null;
        Statics.field73 = null;
        Statics.field4609 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("pl.f(Llh;Ljava/lang/String;Ljava/lang/String;B)Lqu;")
    public static class455 method6791(class315 arg0, String arg1, String arg2) {
        int var3 = arg0.method5349(arg1);
        int var4 = arg0.method5315(var3, arg2);
        class455 var5;
        if (method6174(arg0, var3, var4)) {
            var5 = method6422();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("jn.j(Llh;Llh;Ljava/lang/String;Ljava/lang/String;B)Lmt;")
    public static class349 method4726(class315 arg0, class315 arg1, String arg2, String arg3) {
        int var4 = arg0.method5349(arg2);
        int var5 = arg0.method5315(var4, arg3);
        class349 var6;
        if (method6174(arg0, var4, var5)) {
            byte[] var7 = arg1.method5305(var4, var5);
            class349 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class349 var9 = new class349(var7, Statics.field4648, Statics.field1664, Statics.field4262, Statics.field4809, Statics.field73, Statics.field4609);
                Statics.field4648 = null;
                Statics.field1664 = null;
                Statics.field4262 = null;
                Statics.field4809 = null;
                Statics.field73 = null;
                Statics.field4609 = (byte[][]) null;
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("nl.e(Llh;IB)Lqu;")
    public static class455 method6217(class315 arg0, int arg1) {
        return method6883(arg0, arg1) ? method6422() : null;
    }

    @ObfuscatedName("of.g(B)Lqu;")
    public static class455 method6422() {
        class455 var0 = new class455();
        var0.field4787 = Statics.field2622;
        var0.field4794 = Statics.field4807;
        var0.field4788 = Statics.field4648[0];
        var0.field4791 = Statics.field1664[0];
        var0.field4789 = Statics.field4262[0];
        var0.field4790 = Statics.field4809[0];
        var0.field4792 = Statics.field73;
        var0.field4793 = Statics.field4609[0];
        Statics.field4648 = null;
        Statics.field1664 = null;
        Statics.field4262 = null;
        Statics.field4809 = null;
        Statics.field73 = null;
        Statics.field4609 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("nb.y(Llh;IIB)Z")
    public static boolean method6174(class315 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5305(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1910(var3);
            return true;
        }
    }

    @ObfuscatedName("pj.i(Llh;II)Z")
    public static boolean method6883(class315 arg0, int arg1) {
        byte[] var2 = arg0.method5306(arg1);
        if (var2 == null) {
            return false;
        } else {
            method1910(var2);
            return true;
        }
    }

    @ObfuscatedName("bx.s([BI)V")
    public static void method1910(byte[] arg0) {
        class443 var1 = new class443(arg0);
        var1.field4700 = arg0.length - 2;
        Statics.field4808 = var1.method7049();
        Statics.field4648 = new int[Statics.field4808];
        Statics.field1664 = new int[Statics.field4808];
        Statics.field4262 = new int[Statics.field4808];
        Statics.field4809 = new int[Statics.field4808];
        Statics.field4609 = new byte[Statics.field4808][];
        var1.field4700 = arg0.length - 7 - Statics.field4808 * 8;
        Statics.field2622 = var1.method7049();
        Statics.field4807 = var1.method7049();
        int var2 = (var1.method7047() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field4808; var3++) {
            Statics.field4648[var3] = var1.method7049();
        }
        for (int var4 = 0; var4 < Statics.field4808; var4++) {
            Statics.field1664[var4] = var1.method7049();
        }
        for (int var5 = 0; var5 < Statics.field4808; var5++) {
            Statics.field4262[var5] = var1.method7049();
        }
        for (int var6 = 0; var6 < Statics.field4808; var6++) {
            Statics.field4809[var6] = var1.method7049();
        }
        var1.field4700 = arg0.length - 7 - Statics.field4808 * 8 - (var2 - 1) * 3;
        Statics.field73 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field73[var7] = var1.method7051();
            if (Statics.field73[var7] == 0) {
                Statics.field73[var7] = 1;
            }
        }
        var1.field4700 = 0;
        for (int var8 = 0; var8 < Statics.field4808; var8++) {
            int var9 = Statics.field4262[var8];
            int var10 = Statics.field4809[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field4609[var8] = var12;
            int var13 = var1.method7047();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method7048();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method7048();
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.t(I)V")
    public static void method739() {
        Statics.field4648 = null;
        Statics.field1664 = null;
        Statics.field4262 = null;
        Statics.field4809 = null;
        Statics.field73 = null;
        Statics.field4609 = (byte[][]) null;
    }
}
