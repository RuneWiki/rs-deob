package deob;

@ObfuscatedName("ch")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bh.p(Lep;III)[Lcu;")
    public static class87[] method1403(class152 arg0, int arg1, int arg2) {
        return method722(arg0, arg1, arg2) ? method1412() : null;
    }

    @ObfuscatedName("r.i(Lep;III)Lcu;")
    public static class87 method125(class152 arg0, int arg1, int arg2) {
        return method722(arg0, arg1, arg2) ? method1218() : null;
    }

    @ObfuscatedName("bw.o(Lep;Lep;III)Lgm;")
    public static class183 method1586(class152 arg0, class152 arg1, int arg2, int arg3) {
        if (!method722(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3049(arg2, arg3);
        class183 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class183 var6 = new class183(var4, Statics.field2046, Statics.field1456, Statics.field2778, Statics.field1035, Statics.field1457, Statics.field87);
            method1680();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("client.n(Lep;Ljava/lang/String;Ljava/lang/String;B)[Lcu;")
    public static class87[] method300(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3013(arg1);
        int var4 = arg0.method3014(var3, arg2);
        return method1403(arg0, var3, var4);
    }

    @ObfuscatedName("h.l(Lep;Ljava/lang/String;Ljava/lang/String;I)Lcu;")
    public static class87 method206(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3013(arg1);
        int var4 = arg0.method3014(var3, arg2);
        return method125(arg0, var3, var4);
    }

    @ObfuscatedName("aq.v(Lep;Ljava/lang/String;Ljava/lang/String;I)[Lcj;")
    public static class86[] method782(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3013(arg1);
        int var4 = arg0.method3014(var3, arg2);
        class86[] var5;
        if (method722(arg0, var3, var4)) {
            class86[] var6 = new class86[Statics.field1453];
            for (int var7 = 0; var7 < Statics.field1453; var7++) {
                class86 var8 = var6[var7] = new class86();
                var8.field1478 = Statics.field1454;
                var8.field1474 = Statics.field1455;
                var8.field1472 = Statics.field2046[var7];
                var8.field1473 = Statics.field1456[var7];
                var8.field1475 = Statics.field2778[var7];
                var8.field1470 = Statics.field1035[var7];
                int var9 = var8.field1475 * var8.field1470;
                byte[] var10 = Statics.field87[var7];
                var8.field1476 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1476[var11] = Statics.field1457[var10[var11] & 0xFF];
                }
            }
            method1680();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("d.g(Lep;Ljava/lang/String;Ljava/lang/String;B)Lcj;")
    public static class86 method136(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3013(arg1);
        int var4 = arg0.method3014(var3, arg2);
        class86 var5;
        if (method722(arg0, var3, var4)) {
            var5 = method790();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("y.x(Lep;Lep;Ljava/lang/String;Ljava/lang/String;I)Lgm;")
    public static class183 method213(class152 arg0, class152 arg1, String arg2, String arg3) {
        int var4 = arg0.method3013(arg2);
        int var5 = arg0.method3014(var4, arg3);
        return method1586(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("bm.c(I)[Lcu;")
    public static class87[] method1412() {
        class87[] var0 = new class87[Statics.field1453];
        for (int var1 = 0; var1 < Statics.field1453; var1++) {
            class87 var2 = var0[var1] = new class87();
            var2.field1483 = Statics.field1454;
            var2.field1488 = Statics.field1455;
            var2.field1484 = Statics.field2046[var1];
            var2.field1486 = Statics.field1456[var1];
            var2.field1485 = Statics.field2778[var1];
            var2.field1481 = Statics.field1035[var1];
            var2.field1482 = Statics.field1457;
            var2.field1487 = Statics.field87[var1];
        }
        method1680();
        return var0;
    }

    @ObfuscatedName("as.f(I)Lcu;")
    public static class87 method1218() {
        class87 var0 = new class87();
        var0.field1483 = Statics.field1454;
        var0.field1488 = Statics.field1455;
        var0.field1484 = Statics.field2046[0];
        var0.field1486 = Statics.field1456[0];
        var0.field1485 = Statics.field2778[0];
        var0.field1481 = Statics.field1035[0];
        var0.field1482 = Statics.field1457;
        var0.field1487 = Statics.field87[0];
        method1680();
        return var0;
    }

    @ObfuscatedName("aq.r(B)Lcj;")
    public static class86 method790() {
        class86 var0 = new class86();
        var0.field1478 = Statics.field1454;
        var0.field1474 = Statics.field1455;
        var0.field1472 = Statics.field2046[0];
        var0.field1473 = Statics.field1456[0];
        var0.field1475 = Statics.field2778[0];
        var0.field1470 = Statics.field1035[0];
        int var1 = var0.field1475 * var0.field1470;
        byte[] var2 = Statics.field87[0];
        var0.field1476 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1476[var3] = Statics.field1457[var2[var3] & 0xFF];
        }
        method1680();
        return var0;
    }

    @ObfuscatedName("aj.d(Lep;III)Z")
    public static boolean method722(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3049(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method151(var3);
            return true;
        }
    }

    @ObfuscatedName("u.a([BB)V")
    public static void method151(byte[] arg0) {
        class127 var1 = new class127(arg0);
        var1.field2038 = arg0.length - 2;
        Statics.field1453 = var1.method2652();
        Statics.field2046 = new int[Statics.field1453];
        Statics.field1456 = new int[Statics.field1453];
        Statics.field2778 = new int[Statics.field1453];
        Statics.field1035 = new int[Statics.field1453];
        Statics.field87 = new byte[Statics.field1453][];
        var1.field2038 = arg0.length - 7 - Statics.field1453 * 8;
        Statics.field1454 = var1.method2652();
        Statics.field1455 = var1.method2652();
        int var2 = (var1.method2659() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1453; var3++) {
            Statics.field2046[var3] = var1.method2652();
        }
        for (int var4 = 0; var4 < Statics.field1453; var4++) {
            Statics.field1456[var4] = var1.method2652();
        }
        for (int var5 = 0; var5 < Statics.field1453; var5++) {
            Statics.field2778[var5] = var1.method2652();
        }
        for (int var6 = 0; var6 < Statics.field1453; var6++) {
            Statics.field1035[var6] = var1.method2652();
        }
        var1.field2038 = arg0.length - 7 - Statics.field1453 * 8 - (var2 - 1) * 3;
        Statics.field1457 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1457[var7] = var1.method2595();
            if (Statics.field1457[var7] == 0) {
                Statics.field1457[var7] = 1;
            }
        }
        var1.field2038 = 0;
        for (int var8 = 0; var8 < Statics.field1453; var8++) {
            int var9 = Statics.field2778[var8];
            int var10 = Statics.field1035[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field87[var8] = var12;
            int var13 = var1.method2659();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2656();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2656();
                    }
                }
            }
        }
    }

    @ObfuscatedName("cw.q(I)V")
    public static void method1680() {
        Statics.field2046 = null;
        Statics.field1456 = null;
        Statics.field2778 = null;
        Statics.field1035 = null;
        Statics.field1457 = null;
        Statics.field87 = (byte[][]) null;
    }
}
