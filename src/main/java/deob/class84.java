package deob;

@ObfuscatedName("cb")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.q(Ley;III)[Lcf;")
    public static class86[] method5(class153 arg0, int arg1, int arg2) {
        return method243(arg0, arg1, arg2) ? method15() : null;
    }

    @ObfuscatedName("a.c(Ley;Ley;III)Lgo;")
    public static class183 method172(class153 arg0, class153 arg1, int arg2, int arg3) {
        return method243(arg0, arg2, arg3) ? method818(arg1.method2952(arg2, arg3)) : null;
    }

    @ObfuscatedName("dj.p(Ley;Ljava/lang/String;Ljava/lang/String;I)[Lcq;")
    public static class87[] method2181(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method2967(arg1);
        int var4 = arg0.method2968(var3, arg2);
        class87[] var5;
        if (method243(arg0, var3, var4)) {
            var5 = method1567();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ar.z(Ley;Ljava/lang/String;Ljava/lang/String;I)Lcq;")
    public static class87 method896(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method2967(arg1);
        int var4 = arg0.method2968(var3, arg2);
        class87 var5;
        if (method243(arg0, var3, var4)) {
            var5 = method1555();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("t.m(Ley;Ljava/lang/String;Ljava/lang/String;I)[Lcf;")
    public static class86[] method125(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method2967(arg1);
        int var4 = arg0.method2968(var3, arg2);
        return method5(arg0, var3, var4);
    }

    @ObfuscatedName("af.k(Ley;Ley;Ljava/lang/String;Ljava/lang/String;I)Lgo;")
    public static class183 method602(class153 arg0, class153 arg1, String arg2, String arg3) {
        int var4 = arg0.method2967(arg2);
        int var5 = arg0.method2968(var4, arg3);
        return method172(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("es.v(Ley;IB)Lcq;")
    public static class87 method2937(class153 arg0, int arg1) {
        return method1303(arg0, arg1) ? method1555() : null;
    }

    @ObfuscatedName("be.y(I)[Lcq;")
    public static class87[] method1567() {
        class87[] var0 = new class87[Statics.field1456];
        for (int var1 = 0; var1 < Statics.field1456; var1++) {
            class87 var2 = var0[var1] = new class87();
            var2.field1490 = Statics.field1452;
            var2.field1495 = Statics.field1453;
            var2.field1491 = Statics.field1465[var1];
            var2.field1493 = Statics.field1455[var1];
            var2.field1489 = Statics.field1459[var1];
            var2.field1494 = Statics.field1457[var1];
            var2.field1488 = Statics.field1528;
            var2.field1492 = Statics.field1454[var1];
        }
        method799();
        return var0;
    }

    @ObfuscatedName("bd.d(B)Lcq;")
    public static class87 method1555() {
        class87 var0 = new class87();
        var0.field1490 = Statics.field1452;
        var0.field1495 = Statics.field1453;
        var0.field1491 = Statics.field1465[0];
        var0.field1493 = Statics.field1455[0];
        var0.field1489 = Statics.field1459[0];
        var0.field1494 = Statics.field1457[0];
        var0.field1488 = Statics.field1528;
        var0.field1492 = Statics.field1454[0];
        method799();
        return var0;
    }

    @ObfuscatedName("p.l(I)[Lcf;")
    public static class86[] method15() {
        class86[] var0 = new class86[Statics.field1456];
        for (int var1 = 0; var1 < Statics.field1456; var1++) {
            class86 var2 = var0[var1] = new class86();
            var2.field1478 = Statics.field1452;
            var2.field1482 = Statics.field1453;
            var2.field1479 = Statics.field1465[var1];
            var2.field1476 = Statics.field1455[var1];
            var2.field1480 = Statics.field1459[var1];
            var2.field1477 = Statics.field1457[var1];
            int var3 = var2.field1480 * var2.field1477;
            byte[] var4 = Statics.field1454[var1];
            var2.field1487 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1487[var5] = Statics.field1528[var4[var5] & 0xFF];
            }
        }
        method799();
        return var0;
    }

    @ObfuscatedName("ab.b([BI)Lgo;")
    public static class183 method818(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class183 var1 = new class183(arg0, Statics.field1465, Statics.field1455, Statics.field1459, Statics.field1457, Statics.field1528, Statics.field1454);
            method799();
            return var1;
        }
    }

    @ObfuscatedName("ap.r(Ley;III)Z")
    public static boolean method243(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2952(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1424(var3);
            return true;
        }
    }

    @ObfuscatedName("bt.t(Ley;II)Z")
    public static boolean method1303(class153 arg0, int arg1) {
        byte[] var2 = arg0.method2989(arg1);
        if (var2 == null) {
            return false;
        } else {
            method1424(var2);
            return true;
        }
    }

    @ObfuscatedName("bm.u([BB)V")
    public static void method1424(byte[] arg0) {
        class127 var1 = new class127(arg0);
        var1.field2039 = arg0.length - 2;
        Statics.field1456 = var1.method2427();
        Statics.field1465 = new int[Statics.field1456];
        Statics.field1455 = new int[Statics.field1456];
        Statics.field1459 = new int[Statics.field1456];
        Statics.field1457 = new int[Statics.field1456];
        Statics.field1454 = new byte[Statics.field1456][];
        var1.field2039 = arg0.length - 7 - Statics.field1456 * 8;
        Statics.field1452 = var1.method2427();
        Statics.field1453 = var1.method2427();
        int var2 = (var1.method2534() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1456; var3++) {
            Statics.field1465[var3] = var1.method2427();
        }
        for (int var4 = 0; var4 < Statics.field1456; var4++) {
            Statics.field1455[var4] = var1.method2427();
        }
        for (int var5 = 0; var5 < Statics.field1456; var5++) {
            Statics.field1459[var5] = var1.method2427();
        }
        for (int var6 = 0; var6 < Statics.field1456; var6++) {
            Statics.field1457[var6] = var1.method2427();
        }
        var1.field2039 = arg0.length - 7 - Statics.field1456 * 8 - (var2 - 1) * 3;
        Statics.field1528 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1528[var7] = var1.method2429();
            if (Statics.field1528[var7] == 0) {
                Statics.field1528[var7] = 1;
            }
        }
        var1.field2039 = 0;
        for (int var8 = 0; var8 < Statics.field1456; var8++) {
            int var9 = Statics.field1459[var8];
            int var10 = Statics.field1457[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1454[var8] = var12;
            int var13 = var1.method2534();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2426();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2426();
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.g(I)V")
    public static void method799() {
        Statics.field1465 = null;
        Statics.field1455 = null;
        Statics.field1459 = null;
        Statics.field1457 = null;
        Statics.field1528 = null;
        Statics.field1454 = (byte[][]) null;
    }
}
