package deob;

@ObfuscatedName("ls")
public class class336 {

    public class336() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gn.x(Liy;IIB)[Lla;")
    public static class335[] method3368(class244 arg0, int arg1, int arg2) {
        return method3218(arg0, arg1, arg2) ? Statics.method444() : null;
    }

    @ObfuscatedName("gf.m(Liy;III)Lla;")
    public static class335 method3441(class244 arg0, int arg1, int arg2) {
        return method3218(arg0, arg1, arg2) ? method5453() : null;
    }

    @ObfuscatedName("ku.k(Liy;Ljava/lang/String;Ljava/lang/String;B)[Lle;")
    public static class334[] method4854(class244 arg0, String arg1, String arg2) {
        int var3 = arg0.method3885(arg1);
        int var4 = arg0.method3878(var3, arg2);
        class334[] var5;
        if (method3218(arg0, var3, var4)) {
            var5 = method3843();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("z.d(Liy;Ljava/lang/String;Ljava/lang/String;B)Lle;")
    public static class334 method78(class244 arg0, String arg1, String arg2) {
        int var3 = arg0.method3885(arg1);
        int var4 = arg0.method3878(var3, arg2);
        class334 var5;
        if (method3218(arg0, var3, var4)) {
            var5 = method1970();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("if.w(Liy;Ljava/lang/String;Ljava/lang/String;I)[Lla;")
    public static class335[] method4115(class244 arg0, String arg1, String arg2) {
        int var3 = arg0.method3885(arg1);
        int var4 = arg0.method3878(var3, arg2);
        return method3368(arg0, var3, var4);
    }

    @ObfuscatedName("aq.v(Liy;Liy;Ljava/lang/String;Ljava/lang/String;I)Lkx;")
    public static class305 method575(class244 arg0, class244 arg1, String arg2, String arg3) {
        int var4 = arg0.method3885(arg2);
        int var5 = arg0.method3878(var4, arg3);
        class305 var6;
        if (method3218(arg0, var4, var5)) {
            var6 = method2830(arg1.method3869(var4, var5));
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("ly.q(Liy;II)Lle;")
    public static class334 method5492(class244 arg0, int arg1) {
        return method3835(arg0, arg1) ? method1970() : null;
    }

    @ObfuscatedName("ho.z(I)[Lle;")
    public static class334[] method3843() {
        class334[] var0 = new class334[Statics.field3901];
        for (int var1 = 0; var1 < Statics.field3901; var1++) {
            class334 var2 = var0[var1] = new class334();
            var2.field3883 = Statics.field3904;
            var2.field3888 = Statics.field3903;
            var2.field3885 = Statics.field3902[var1];
            var2.field3881 = Statics.field3310[var1];
            var2.field3884 = Statics.field3905[var1];
            var2.field3886 = Statics.field3906[var1];
            var2.field3882 = Statics.field3813;
            var2.field3887 = Statics.field25[var1];
        }
        method4827();
        return var0;
    }

    @ObfuscatedName("cb.t(I)Lle;")
    public static class334 method1970() {
        class334 var0 = new class334();
        var0.field3883 = Statics.field3904;
        var0.field3888 = Statics.field3903;
        var0.field3885 = Statics.field3902[0];
        var0.field3881 = Statics.field3310[0];
        var0.field3884 = Statics.field3905[0];
        var0.field3886 = Statics.field3906[0];
        var0.field3882 = Statics.field3813;
        var0.field3887 = Statics.field25[0];
        method4827();
        return var0;
    }

    @ObfuscatedName("lq.s(I)Lla;")
    public static class335 method5453() {
        class335 var0 = new class335();
        var0.field3894 = Statics.field3904;
        var0.field3891 = Statics.field3903;
        var0.field3889 = Statics.field3902[0];
        var0.field3893 = Statics.field3310[0];
        var0.field3890 = Statics.field3905[0];
        var0.field3900 = Statics.field3906[0];
        int var1 = var0.field3900 * var0.field3890;
        byte[] var2 = Statics.field25[0];
        var0.field3897 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3897[var3] = Statics.field3813[var2[var3] & 0xFF];
        }
        Statics.field3902 = null;
        Statics.field3310 = null;
        Statics.field3905 = null;
        Statics.field3906 = null;
        Statics.field3813 = null;
        Statics.field25 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("en.p([BI)Lkx;")
    public static class305 method2830(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class305 var1 = new class305(arg0, Statics.field3902, Statics.field3310, Statics.field3905, Statics.field3906, Statics.field3813, Statics.field25);
            method4827();
            return var1;
        }
    }

    @ObfuscatedName("fv.n(Liy;III)Z")
    public static boolean method3218(class244 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3869(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3634(var3);
            return true;
        }
    }

    @ObfuscatedName("hu.u(Liy;II)Z")
    public static boolean method3835(class244 arg0, int arg1) {
        byte[] var2 = arg0.method3876(arg1);
        if (var2 == null) {
            return false;
        } else {
            method3634(var2);
            return true;
        }
    }

    @ObfuscatedName("hy.h([BB)V")
    public static void method3634(byte[] arg0) {
        class310 var1 = new class310(arg0);
        var1.field3711 = arg0.length - 2;
        Statics.field3901 = var1.method5139();
        Statics.field3902 = new int[Statics.field3901];
        Statics.field3310 = new int[Statics.field3901];
        Statics.field3905 = new int[Statics.field3901];
        Statics.field3906 = new int[Statics.field3901];
        Statics.field25 = new byte[Statics.field3901][];
        var1.field3711 = arg0.length - 7 - Statics.field3901 * 8;
        Statics.field3904 = var1.method5139();
        Statics.field3903 = var1.method5139();
        int var2 = (var1.method5137() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3901; var3++) {
            Statics.field3902[var3] = var1.method5139();
        }
        for (int var4 = 0; var4 < Statics.field3901; var4++) {
            Statics.field3310[var4] = var1.method5139();
        }
        for (int var5 = 0; var5 < Statics.field3901; var5++) {
            Statics.field3905[var5] = var1.method5139();
        }
        for (int var6 = 0; var6 < Statics.field3901; var6++) {
            Statics.field3906[var6] = var1.method5139();
        }
        var1.field3711 = arg0.length - 7 - Statics.field3901 * 8 - (var2 - 1) * 3;
        Statics.field3813 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3813[var7] = var1.method5264();
            if (Statics.field3813[var7] == 0) {
                Statics.field3813[var7] = 1;
            }
        }
        var1.field3711 = 0;
        for (int var8 = 0; var8 < Statics.field3901; var8++) {
            int var9 = Statics.field3905[var8];
            int var10 = Statics.field3906[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field25[var8] = var12;
            int var13 = var1.method5137();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method5138();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method5138();
                    }
                }
            }
        }
    }

    @ObfuscatedName("km.g(B)V")
    public static void method4827() {
        Statics.field3902 = null;
        Statics.field3310 = null;
        Statics.field3905 = null;
        Statics.field3906 = null;
        Statics.field3813 = null;
        Statics.field25 = (byte[][]) null;
    }
}
