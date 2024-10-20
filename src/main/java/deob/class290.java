package deob;

@ObfuscatedName("kp")
public class class290 {

    public class290() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gy.w(Liq;III)Lkh;")
    public static class289 method3390(class239 arg0, int arg1, int arg2) {
        return method3719(arg0, arg1, arg2) ? method2666() : null;
    }

    @ObfuscatedName("ha.o(Liq;Ljava/lang/String;Ljava/lang/String;I)[Lki;")
    public static class288[] method3638(class239 arg0, String arg1, String arg2) {
        int var3 = arg0.method3742(arg1);
        int var4 = arg0.method3743(var3, arg2);
        class288[] var5;
        if (method3719(arg0, var3, var4)) {
            class288[] var6 = new class288[Statics.field3805];
            for (int var7 = 0; var7 < Statics.field3805; var7++) {
                class288 var8 = var6[var7] = new class288();
                var8.field3786 = Statics.field3801;
                var8.field3781 = Statics.field3802;
                var8.field3784 = Statics.field3800[var7];
                var8.field3785 = Statics.field3804[var7];
                var8.field3782 = Statics.field2811[var7];
                var8.field3780 = Statics.field3803[var7];
                var8.field3787 = Statics.field2222;
                var8.field3783 = Statics.field696[var7];
            }
            method3645();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ic.x(Liq;Ljava/lang/String;Ljava/lang/String;I)Lki;")
    public static class288 method3891(class239 arg0, String arg1, String arg2) {
        int var3 = arg0.method3742(arg1);
        int var4 = arg0.method3743(var3, arg2);
        class288 var5;
        if (method3719(arg0, var3, var4)) {
            var5 = method205();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bi.k(Liq;Ljava/lang/String;Ljava/lang/String;B)[Lkh;")
    public static class289[] method1389(class239 arg0, String arg1, String arg2) {
        int var3 = arg0.method3742(arg1);
        int var4 = arg0.method3743(var3, arg2);
        class289[] var5;
        if (method3719(arg0, var3, var4)) {
            class289[] var6 = new class289[Statics.field3805];
            for (int var7 = 0; var7 < Statics.field3805; var7++) {
                class289 var8 = var6[var7] = new class289();
                var8.field3793 = Statics.field3801;
                var8.field3794 = Statics.field3802;
                var8.field3799 = Statics.field3800[var7];
                var8.field3792 = Statics.field3804[var7];
                var8.field3797 = Statics.field2811[var7];
                var8.field3790 = Statics.field3803[var7];
                int var9 = var8.field3797 * var8.field3790;
                byte[] var10 = Statics.field696[var7];
                var8.field3795 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field3795[var11] = Statics.field2222[var10[var11] & 0xFF];
                }
            }
            method3645();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("iw.f(Liq;Ljava/lang/String;Ljava/lang/String;S)Lkh;")
    public static class289 method3863(class239 arg0, String arg1, String arg2) {
        int var3 = arg0.method3742(arg1);
        int var4 = arg0.method3743(var3, arg2);
        return method3390(arg0, var3, var4);
    }

    @ObfuscatedName("fv.i(Liq;IB)Lki;")
    public static class288 method2764(class239 arg0, int arg1) {
        byte[] var2 = arg0.method3732(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method3876(var2);
            var3 = true;
        }
        return var3 ? method205() : null;
    }

    @ObfuscatedName("ac.j(I)Lki;")
    public static class288 method205() {
        class288 var0 = new class288();
        var0.field3786 = Statics.field3801;
        var0.field3781 = Statics.field3802;
        var0.field3784 = Statics.field3800[0];
        var0.field3785 = Statics.field3804[0];
        var0.field3782 = Statics.field2811[0];
        var0.field3780 = Statics.field3803[0];
        var0.field3787 = Statics.field2222;
        var0.field3783 = Statics.field696[0];
        method3645();
        return var0;
    }

    @ObfuscatedName("ew.m(I)Lkh;")
    public static class289 method2666() {
        class289 var0 = new class289();
        var0.field3793 = Statics.field3801;
        var0.field3794 = Statics.field3802;
        var0.field3799 = Statics.field3800[0];
        var0.field3792 = Statics.field3804[0];
        var0.field3797 = Statics.field2811[0];
        var0.field3790 = Statics.field3803[0];
        int var1 = var0.field3797 * var0.field3790;
        byte[] var2 = Statics.field696[0];
        var0.field3795 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3795[var3] = Statics.field2222[var2[var3] & 0xFF];
        }
        method3645();
        return var0;
    }

    @ObfuscatedName("z.u([BI)Ljt;")
    public static class267 method130(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class267 var1 = new class267(arg0, Statics.field3800, Statics.field3804, Statics.field2811, Statics.field3803, Statics.field2222, Statics.field696);
            method3645();
            return var1;
        }
    }

    @ObfuscatedName("is.h(Liq;III)Z")
    public static boolean method3719(class239 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3754(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3876(var3);
            return true;
        }
    }

    @ObfuscatedName("ij.a([BB)V")
    public static void method3876(byte[] arg0) {
        class177 var1 = new class177(arg0);
        var1.field2412 = arg0.length - 2;
        Statics.field3805 = var1.method2886();
        Statics.field3800 = new int[Statics.field3805];
        Statics.field3804 = new int[Statics.field3805];
        Statics.field2811 = new int[Statics.field3805];
        Statics.field3803 = new int[Statics.field3805];
        Statics.field696 = new byte[Statics.field3805][];
        var1.field2412 = arg0.length - 7 - Statics.field3805 * 8;
        Statics.field3801 = var1.method2886();
        Statics.field3802 = var1.method2886();
        int var2 = (var1.method2931() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3805; var3++) {
            Statics.field3800[var3] = var1.method2886();
        }
        for (int var4 = 0; var4 < Statics.field3805; var4++) {
            Statics.field3804[var4] = var1.method2886();
        }
        for (int var5 = 0; var5 < Statics.field3805; var5++) {
            Statics.field2811[var5] = var1.method2886();
        }
        for (int var6 = 0; var6 < Statics.field3805; var6++) {
            Statics.field3803[var6] = var1.method2886();
        }
        var1.field2412 = arg0.length - 7 - Statics.field3805 * 8 - (var2 - 1) * 3;
        Statics.field2222 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2222[var7] = var1.method2888();
            if (Statics.field2222[var7] == 0) {
                Statics.field2222[var7] = 1;
            }
        }
        var1.field2412 = 0;
        for (int var8 = 0; var8 < Statics.field3805; var8++) {
            int var9 = Statics.field2811[var8];
            int var10 = Statics.field3803[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field696[var8] = var12;
            int var13 = var1.method2931();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2885();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2885();
                    }
                }
            }
        }
    }

    @ObfuscatedName("hf.p(I)V")
    public static void method3645() {
        Statics.field3800 = null;
        Statics.field3804 = null;
        Statics.field2811 = null;
        Statics.field3803 = null;
        Statics.field2222 = null;
        Statics.field696 = (byte[][]) null;
    }
}
