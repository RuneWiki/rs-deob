package deob;

@ObfuscatedName("ch")
public class class80 {

    public class80() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.a(Lfu;III)[Lcq;")
    public static class84[] method566(class171 arg0, int arg1, int arg2) {
        return method2684(arg0, arg1, arg2) ? method1829() : null;
    }

    @ObfuscatedName("ax.d(Lfu;III)Lcq;")
    public static class84 method745(class171 arg0, int arg1, int arg2) {
        if (!method2684(arg0, arg1, arg2)) {
            return null;
        }
        class84 var3 = new class84();
        var3.field1502 = Statics.field1461;
        var3.field1499 = Statics.field1457;
        var3.field1501 = Statics.field1463[0];
        var3.field1503 = Statics.field1459[0];
        var3.field1498 = Statics.field1269[0];
        var3.field1496 = Statics.field1462[0];
        var3.field1497 = Statics.field2127;
        var3.field1500 = Statics.field140[0];
        method736();
        return var3;
    }

    @ObfuscatedName("s.v(Lfu;III)Lcr;")
    public static class82 method560(class171 arg0, int arg1, int arg2) {
        if (!method2684(arg0, arg1, arg2)) {
            return null;
        }
        class82 var3 = new class82();
        var3.field1482 = Statics.field1461;
        var3.field1483 = Statics.field1457;
        var3.field1480 = Statics.field1463[0];
        var3.field1481 = Statics.field1459[0];
        var3.field1478 = Statics.field1269[0];
        var3.field1479 = Statics.field1462[0];
        int var4 = var3.field1479 * var3.field1478;
        byte[] var5 = Statics.field140[0];
        var3.field1477 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1477[var6] = Statics.field2127[var5[var6] & 0xFF];
        }
        method736();
        return var3;
    }

    @ObfuscatedName("da.r(Lfu;Ljava/lang/String;Ljava/lang/String;I)[Lcq;")
    public static class84[] method2341(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3132(arg1);
        int var4 = arg0.method3121(var3, arg2);
        return method566(arg0, var3, var4);
    }

    @ObfuscatedName("dh.z(Lfu;Ljava/lang/String;Ljava/lang/String;I)Lcq;")
    public static class84 method2335(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3132(arg1);
        int var4 = arg0.method3121(var3, arg2);
        return method745(arg0, var3, var4);
    }

    @ObfuscatedName("f.t(Lfu;Ljava/lang/String;Ljava/lang/String;I)[Lcr;")
    public static class82[] method600(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3132(arg1);
        int var4 = arg0.method3121(var3, arg2);
        class82[] var5;
        if (method2684(arg0, var3, var4)) {
            class82[] var6 = new class82[Statics.field1465];
            for (int var7 = 0; var7 < Statics.field1465; var7++) {
                class82 var8 = var6[var7] = new class82();
                var8.field1482 = Statics.field1461;
                var8.field1483 = Statics.field1457;
                var8.field1480 = Statics.field1463[var7];
                var8.field1481 = Statics.field1459[var7];
                var8.field1478 = Statics.field1269[var7];
                var8.field1479 = Statics.field1462[var7];
                int var9 = var8.field1479 * var8.field1478;
                byte[] var10 = Statics.field140[var7];
                var8.field1477 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1477[var11] = Statics.field2127[var10[var11] & 0xFF];
                }
            }
            method736();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ad.n(Lfu;Ljava/lang/String;Ljava/lang/String;I)Lcr;")
    public static class82 method786(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3132(arg1);
        int var4 = arg0.method3121(var3, arg2);
        return method560(arg0, var3, var4);
    }

    @ObfuscatedName("cm.i(I)[Lcq;")
    public static class84[] method1829() {
        class84[] var0 = new class84[Statics.field1465];
        for (int var1 = 0; var1 < Statics.field1465; var1++) {
            class84 var2 = var0[var1] = new class84();
            var2.field1502 = Statics.field1461;
            var2.field1499 = Statics.field1457;
            var2.field1501 = Statics.field1463[var1];
            var2.field1503 = Statics.field1459[var1];
            var2.field1498 = Statics.field1269[var1];
            var2.field1496 = Statics.field1462[var1];
            var2.field1497 = Statics.field2127;
            var2.field1500 = Statics.field140[var1];
        }
        method736();
        return var0;
    }

    @ObfuscatedName("dl.g(Lfu;IIB)Z")
    public static boolean method2684(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3117(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method233(var3);
            return true;
        }
    }

    @ObfuscatedName("y.m([BI)V")
    public static void method233(byte[] arg0) {
        class123 var1 = new class123(arg0);
        var1.field2071 = arg0.length - 2;
        Statics.field1465 = var1.method2584();
        Statics.field1463 = new int[Statics.field1465];
        Statics.field1459 = new int[Statics.field1465];
        Statics.field1269 = new int[Statics.field1465];
        Statics.field1462 = new int[Statics.field1465];
        Statics.field140 = new byte[Statics.field1465][];
        var1.field2071 = arg0.length - 7 - Statics.field1465 * 8;
        Statics.field1461 = var1.method2584();
        Statics.field1457 = var1.method2584();
        int var2 = (var1.method2395() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1465; var3++) {
            Statics.field1463[var3] = var1.method2584();
        }
        for (int var4 = 0; var4 < Statics.field1465; var4++) {
            Statics.field1459[var4] = var1.method2584();
        }
        for (int var5 = 0; var5 < Statics.field1465; var5++) {
            Statics.field1269[var5] = var1.method2584();
        }
        for (int var6 = 0; var6 < Statics.field1465; var6++) {
            Statics.field1462[var6] = var1.method2584();
        }
        var1.field2071 = arg0.length - 7 - Statics.field1465 * 8 - (var2 - 1) * 3;
        Statics.field2127 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2127[var7] = var1.method2399();
            if (Statics.field2127[var7] == 0) {
                Statics.field2127[var7] = 1;
            }
        }
        var1.field2071 = 0;
        for (int var8 = 0; var8 < Statics.field1465; var8++) {
            int var9 = Statics.field1269[var8];
            int var10 = Statics.field1462[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field140[var8] = var12;
            int var13 = var1.method2395();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2396();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2396();
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.k(I)V")
    public static void method736() {
        Statics.field1463 = null;
        Statics.field1459 = null;
        Statics.field1269 = null;
        Statics.field1462 = null;
        Statics.field2127 = null;
        Statics.field140 = (byte[][]) null;
    }
}
