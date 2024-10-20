package deob;

@ObfuscatedName("bh")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.b(Leg;IIB)[Lbo;")
    public static class74[] method1037(class146 arg0, int arg1, int arg2) {
        if (!method728(arg0, arg1, arg2)) {
            return null;
        }
        class74[] var3 = new class74[Statics.field1283];
        for (int var4 = 0; var4 < Statics.field1283; var4++) {
            class74 var5 = var3[var4] = new class74();
            var5.field1316 = Statics.field1280;
            var5.field1319 = Statics.field2891;
            var5.field1318 = Statics.field1339[var4];
            var5.field1317 = Statics.field674[var4];
            var5.field1312 = Statics.field133[var4];
            var5.field1315 = Statics.field2920[var4];
            var5.field1313 = Statics.field1276;
            var5.field1314 = Statics.field677[var4];
        }
        Statics.field1339 = null;
        Statics.field674 = null;
        Statics.field133 = null;
        Statics.field2920 = null;
        Statics.field1276 = null;
        Statics.field677 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("et.u(Leg;III)Lbo;")
    public static class74 method2678(class146 arg0, int arg1, int arg2) {
        return method728(arg0, arg1, arg2) ? method1888() : null;
    }

    @ObfuscatedName("cy.x(Leg;III)Lbk;")
    public static class72 method1979(class146 arg0, int arg1, int arg2) {
        if (!method728(arg0, arg1, arg2)) {
            return null;
        }
        class72 var3 = new class72();
        var3.field1298 = Statics.field1280;
        var3.field1299 = Statics.field2891;
        var3.field1296 = Statics.field1339[0];
        var3.field1297 = Statics.field674[0];
        var3.field1294 = Statics.field133[0];
        var3.field1295 = Statics.field2920[0];
        int var4 = var3.field1295 * var3.field1294;
        byte[] var5 = Statics.field677[0];
        var3.field1301 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1301[var6] = Statics.field1276[var5[var6] & 0xFF];
        }
        Statics.field1339 = null;
        Statics.field674 = null;
        Statics.field133 = null;
        Statics.field2920 = null;
        Statics.field1276 = null;
        Statics.field677 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("de.j(Leg;Ljava/lang/String;Ljava/lang/String;B)[Lbo;")
    public static class74[] method2479(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2719(arg1);
        int var4 = arg0.method2708(var3, arg2);
        return method1037(arg0, var3, var4);
    }

    @ObfuscatedName("n.o(Leg;Ljava/lang/String;Ljava/lang/String;B)Lbo;")
    public static class74 method65(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2719(arg1);
        int var4 = arg0.method2708(var3, arg2);
        return method2678(arg0, var3, var4);
    }

    @ObfuscatedName("l.n(Leg;Ljava/lang/String;Ljava/lang/String;I)[Lbk;")
    public static class72[] method115(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2719(arg1);
        int var4 = arg0.method2708(var3, arg2);
        class72[] var5;
        if (method728(arg0, var3, var4)) {
            var5 = method608();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("b.y(Leg;Ljava/lang/String;Ljava/lang/String;B)Lbk;")
    public static class72 method3(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2719(arg1);
        int var4 = arg0.method2708(var3, arg2);
        return method1979(arg0, var3, var4);
    }

    @ObfuscatedName("ar.f(Leg;Leg;Ljava/lang/String;Ljava/lang/String;B)Lgy;")
    public static class191 method603(class146 arg0, class146 arg1, String arg2, String arg3) {
        int var4 = arg0.method2719(arg2);
        int var5 = arg0.method2708(var4, arg3);
        class191 var6;
        if (method728(arg0, var4, var5)) {
            var6 = method749(arg1.method2692(var4, var5));
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("cm.p(Leg;II)Lbo;")
    public static class74 method1973(class146 arg0, int arg1) {
        return method604(arg0, arg1) ? method1888() : null;
    }

    @ObfuscatedName("co.l(B)Lbo;")
    public static class74 method1888() {
        class74 var0 = new class74();
        var0.field1316 = Statics.field1280;
        var0.field1319 = Statics.field2891;
        var0.field1318 = Statics.field1339[0];
        var0.field1317 = Statics.field674[0];
        var0.field1312 = Statics.field133[0];
        var0.field1315 = Statics.field2920[0];
        var0.field1313 = Statics.field1276;
        var0.field1314 = Statics.field677[0];
        Statics.field1339 = null;
        Statics.field674 = null;
        Statics.field133 = null;
        Statics.field2920 = null;
        Statics.field1276 = null;
        Statics.field677 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("as.k(I)[Lbk;")
    public static class72[] method608() {
        class72[] var0 = new class72[Statics.field1283];
        for (int var1 = 0; var1 < Statics.field1283; var1++) {
            class72 var2 = var0[var1] = new class72();
            var2.field1298 = Statics.field1280;
            var2.field1299 = Statics.field2891;
            var2.field1296 = Statics.field1339[var1];
            var2.field1297 = Statics.field674[var1];
            var2.field1294 = Statics.field133[var1];
            var2.field1295 = Statics.field2920[var1];
            int var3 = var2.field1295 * var2.field1294;
            byte[] var4 = Statics.field677[var1];
            var2.field1301 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1301[var5] = Statics.field1276[var4[var5] & 0xFF];
            }
        }
        Statics.field1339 = null;
        Statics.field674 = null;
        Statics.field133 = null;
        Statics.field2920 = null;
        Statics.field1276 = null;
        Statics.field677 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ag.q([BI)Lgy;")
    public static class191 method749(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class191 var1 = new class191(arg0, Statics.field1339, Statics.field674, Statics.field133, Statics.field2920, Statics.field1276, Statics.field677);
        Statics.field1339 = null;
        Statics.field674 = null;
        Statics.field133 = null;
        Statics.field2920 = null;
        Statics.field1276 = null;
        Statics.field677 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("ac.e(Leg;III)Z")
    public static boolean method728(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2692(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1980(var3);
            return true;
        }
    }

    @ObfuscatedName("ar.t(Leg;IB)Z")
    public static boolean method604(class146 arg0, int arg1) {
        byte[] var2 = arg0.method2697(arg1);
        if (var2 == null) {
            return false;
        } else {
            method1980(var2);
            return true;
        }
    }

    @ObfuscatedName("cy.g([BI)V")
    public static void method1980(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1845 = arg0.length - 2;
        Statics.field1283 = var1.method2136();
        Statics.field1339 = new int[Statics.field1283];
        Statics.field674 = new int[Statics.field1283];
        Statics.field133 = new int[Statics.field1283];
        Statics.field2920 = new int[Statics.field1283];
        Statics.field677 = new byte[Statics.field1283][];
        var1.field1845 = arg0.length - 7 - Statics.field1283 * 8;
        Statics.field1280 = var1.method2136();
        Statics.field2891 = var1.method2136();
        int var2 = (var1.method2134() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1283; var3++) {
            Statics.field1339[var3] = var1.method2136();
        }
        for (int var4 = 0; var4 < Statics.field1283; var4++) {
            Statics.field674[var4] = var1.method2136();
        }
        for (int var5 = 0; var5 < Statics.field1283; var5++) {
            Statics.field133[var5] = var1.method2136();
        }
        for (int var6 = 0; var6 < Statics.field1283; var6++) {
            Statics.field2920[var6] = var1.method2136();
        }
        var1.field1845 = arg0.length - 7 - Statics.field1283 * 8 - (var2 - 1) * 3;
        Statics.field1276 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1276[var7] = var1.method2138();
            if (Statics.field1276[var7] == 0) {
                Statics.field1276[var7] = 1;
            }
        }
        var1.field1845 = 0;
        for (int var8 = 0; var8 < Statics.field1283; var8++) {
            int var9 = Statics.field133[var8];
            int var10 = Statics.field2920[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field677[var8] = var12;
            int var13 = var1.method2134();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2135();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2135();
                    }
                }
            }
        }
    }
}
