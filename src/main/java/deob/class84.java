package deob;

@ObfuscatedName("ca")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.b(Leo;III)[Lcq;")
    public static class87[] method557(class153 arg0, int arg1, int arg2) {
        return method188(arg0, arg1, arg2) ? method2373() : null;
    }

    @ObfuscatedName("ah.c(Leo;III)Lcq;")
    public static class87 method741(class153 arg0, int arg1, int arg2) {
        return method188(arg0, arg1, arg2) ? method2168() : null;
    }

    @ObfuscatedName("k.j(Leo;IIB)Lcs;")
    public static class86 method40(class153 arg0, int arg1, int arg2) {
        return method188(arg0, arg1, arg2) ? method2681() : null;
    }

    @ObfuscatedName("u.i(Leo;Ljava/lang/String;Ljava/lang/String;I)[Lcq;")
    public static class87[] method167(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method2978(arg1);
        int var4 = arg0.method2979(var3, arg2);
        return method557(arg0, var3, var4);
    }

    @ObfuscatedName("ad.k(Leo;Ljava/lang/String;Ljava/lang/String;I)Lcq;")
    public static class87 method806(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method2978(arg1);
        int var4 = arg0.method2979(var3, arg2);
        return method741(arg0, var3, var4);
    }

    @ObfuscatedName("m.q(Leo;Ljava/lang/String;Ljava/lang/String;I)[Lcs;")
    public static class86[] method183(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method2978(arg1);
        int var4 = arg0.method2979(var3, arg2);
        class86[] var5;
        if (method188(arg0, var3, var4)) {
            class86[] var6 = new class86[Statics.field1297];
            for (int var7 = 0; var7 < Statics.field1297; var7++) {
                class86 var8 = var6[var7] = new class86();
                var8.field1494 = Statics.field1479;
                var8.field1497 = Statics.field279;
                var8.field1496 = Statics.field1473[var7];
                var8.field1495 = Statics.field1474[var7];
                var8.field1491 = Statics.field1475[var7];
                var8.field1493 = Statics.field1476[var7];
                int var9 = var8.field1493 * var8.field1491;
                byte[] var10 = Statics.field1484[var7];
                var8.field1498 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1498[var11] = Statics.field1477[var10[var11] & 0xFF];
                }
            }
            Statics.field1473 = null;
            Statics.field1474 = null;
            Statics.field1475 = null;
            Statics.field1476 = null;
            Statics.field1477 = null;
            Statics.field1484 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("k.v(Leo;Leo;Ljava/lang/String;Ljava/lang/String;B)Lgw;")
    public static class183 method41(class153 arg0, class153 arg1, String arg2, String arg3) {
        int var4 = arg0.method2978(arg2);
        int var5 = arg0.method2979(var4, arg3);
        class183 var6;
        if (method188(arg0, var4, var5)) {
            byte[] var7 = arg1.method2964(var4, var5);
            class183 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class183 var9 = new class183(var7, Statics.field1473, Statics.field1474, Statics.field1475, Statics.field1476, Statics.field1477, Statics.field1484);
                Statics.field1473 = null;
                Statics.field1474 = null;
                Statics.field1475 = null;
                Statics.field1476 = null;
                Statics.field1477 = null;
                Statics.field1484 = (byte[][]) null;
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("bu.y(Leo;IB)Lcq;")
    public static class87 method1346(class153 arg0, int arg1) {
        byte[] var2 = arg0.method3023(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method2833(var2);
            var3 = true;
        }
        return var3 ? method2168() : null;
    }

    @ObfuscatedName("dm.w(I)[Lcq;")
    public static class87[] method2373() {
        class87[] var0 = new class87[Statics.field1297];
        for (int var1 = 0; var1 < Statics.field1297; var1++) {
            class87 var2 = var0[var1] = new class87();
            var2.field1505 = Statics.field1479;
            var2.field1510 = Statics.field279;
            var2.field1507 = Statics.field1473[var1];
            var2.field1508 = Statics.field1474[var1];
            var2.field1504 = Statics.field1475[var1];
            var2.field1506 = Statics.field1476[var1];
            var2.field1509 = Statics.field1477;
            var2.field1503 = Statics.field1484[var1];
        }
        Statics.field1473 = null;
        Statics.field1474 = null;
        Statics.field1475 = null;
        Statics.field1476 = null;
        Statics.field1477 = null;
        Statics.field1484 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("dp.g(B)Lcq;")
    public static class87 method2168() {
        class87 var0 = new class87();
        var0.field1505 = Statics.field1479;
        var0.field1510 = Statics.field279;
        var0.field1507 = Statics.field1473[0];
        var0.field1508 = Statics.field1474[0];
        var0.field1504 = Statics.field1475[0];
        var0.field1506 = Statics.field1476[0];
        var0.field1509 = Statics.field1477;
        var0.field1503 = Statics.field1484[0];
        Statics.field1473 = null;
        Statics.field1474 = null;
        Statics.field1475 = null;
        Statics.field1476 = null;
        Statics.field1477 = null;
        Statics.field1484 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ev.s(I)Lcs;")
    public static class86 method2681() {
        class86 var0 = new class86();
        var0.field1494 = Statics.field1479;
        var0.field1497 = Statics.field279;
        var0.field1496 = Statics.field1473[0];
        var0.field1495 = Statics.field1474[0];
        var0.field1491 = Statics.field1475[0];
        var0.field1493 = Statics.field1476[0];
        int var1 = var0.field1493 * var0.field1491;
        byte[] var2 = Statics.field1484[0];
        var0.field1498 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1498[var3] = Statics.field1477[var2[var3] & 0xFF];
        }
        Statics.field1473 = null;
        Statics.field1474 = null;
        Statics.field1475 = null;
        Statics.field1476 = null;
        Statics.field1477 = null;
        Statics.field1484 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("f.n(Leo;III)Z")
    public static boolean method188(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2964(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2833(var3);
            return true;
        }
    }

    @ObfuscatedName("et.x([BI)V")
    public static void method2833(byte[] arg0) {
        class127 var1 = new class127(arg0);
        var1.field2051 = arg0.length - 2;
        Statics.field1297 = var1.method2394();
        Statics.field1473 = new int[Statics.field1297];
        Statics.field1474 = new int[Statics.field1297];
        Statics.field1475 = new int[Statics.field1297];
        Statics.field1476 = new int[Statics.field1297];
        Statics.field1484 = new byte[Statics.field1297][];
        var1.field2051 = arg0.length - 7 - Statics.field1297 * 8;
        Statics.field1479 = var1.method2394();
        Statics.field279 = var1.method2394();
        int var2 = (var1.method2416() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1297; var3++) {
            Statics.field1473[var3] = var1.method2394();
        }
        for (int var4 = 0; var4 < Statics.field1297; var4++) {
            Statics.field1474[var4] = var1.method2394();
        }
        for (int var5 = 0; var5 < Statics.field1297; var5++) {
            Statics.field1475[var5] = var1.method2394();
        }
        for (int var6 = 0; var6 < Statics.field1297; var6++) {
            Statics.field1476[var6] = var1.method2394();
        }
        var1.field2051 = arg0.length - 7 - Statics.field1297 * 8 - (var2 - 1) * 3;
        Statics.field1477 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1477[var7] = var1.method2400();
            if (Statics.field1477[var7] == 0) {
                Statics.field1477[var7] = 1;
            }
        }
        var1.field2051 = 0;
        for (int var8 = 0; var8 < Statics.field1297; var8++) {
            int var9 = Statics.field1475[var8];
            int var10 = Statics.field1476[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1484[var8] = var12;
            int var13 = var1.method2416();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2397();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2397();
                    }
                }
            }
        }
    }
}
