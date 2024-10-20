package deob;

@ObfuscatedName("cs")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ch.i(Lef;III)[Lcq;")
    public static class86[] method1533(class152 arg0, int arg1, int arg2) {
        return method66(arg0, arg1, arg2) ? method644() : null;
    }

    @ObfuscatedName("g.a(Lef;Lef;III)Lgi;")
    public static class183 method160(class152 arg0, class152 arg1, int arg2, int arg3) {
        if (!method66(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method2932(arg2, arg3);
        class183 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class183 var6 = new class183(var4, Statics.field1468, Statics.field1464, Statics.field1465, Statics.field1466, Statics.field2732, Statics.field1467);
            method875();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("ax.l(Lef;Ljava/lang/String;Ljava/lang/String;I)[Lcn;")
    public static class87[] method545(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3012(arg1);
        int var4 = arg0.method2951(var3, arg2);
        class87[] var5;
        if (method66(arg0, var3, var4)) {
            class87[] var6 = new class87[Statics.field1461];
            for (int var7 = 0; var7 < Statics.field1461; var7++) {
                class87 var8 = var6[var7] = new class87();
                var8.field1493 = Statics.field1271;
                var8.field1491 = Statics.field1462;
                var8.field1488 = Statics.field1468[var7];
                var8.field1492 = Statics.field1464[var7];
                var8.field1494 = Statics.field1465[var7];
                var8.field1490 = Statics.field1466[var7];
                var8.field1487 = Statics.field2732;
                var8.field1489 = Statics.field1467[var7];
            }
            method875();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("as.q(Lef;Ljava/lang/String;Ljava/lang/String;S)Lcn;")
    public static class87 method743(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3012(arg1);
        int var4 = arg0.method2951(var3, arg2);
        class87 var5;
        if (method66(arg0, var3, var4)) {
            class87 var6 = new class87();
            var6.field1493 = Statics.field1271;
            var6.field1491 = Statics.field1462;
            var6.field1488 = Statics.field1468[0];
            var6.field1492 = Statics.field1464[0];
            var6.field1494 = Statics.field1465[0];
            var6.field1490 = Statics.field1466[0];
            var6.field1487 = Statics.field2732;
            var6.field1489 = Statics.field1467[0];
            method875();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("dt.b(Lef;Ljava/lang/String;Ljava/lang/String;I)[Lcq;")
    public static class86[] method2391(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3012(arg1);
        int var4 = arg0.method2951(var3, arg2);
        return method1533(arg0, var3, var4);
    }

    @ObfuscatedName("bq.u(Lef;Lef;Ljava/lang/String;Ljava/lang/String;I)Lgi;")
    public static class183 method1326(class152 arg0, class152 arg1, String arg2, String arg3) {
        int var4 = arg0.method3012(arg2);
        int var5 = arg0.method2951(var4, arg3);
        return method160(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("ai.d(I)[Lcq;")
    public static class86[] method644() {
        class86[] var0 = new class86[Statics.field1461];
        for (int var1 = 0; var1 < Statics.field1461; var1++) {
            class86 var2 = var0[var1] = new class86();
            var2.field1485 = Statics.field1271;
            var2.field1481 = Statics.field1462;
            var2.field1478 = Statics.field1468[var1];
            var2.field1479 = Statics.field1464[var1];
            var2.field1476 = Statics.field1465[var1];
            var2.field1483 = Statics.field1466[var1];
            int var3 = var2.field1483 * var2.field1476;
            byte[] var4 = Statics.field1467[var1];
            var2.field1482 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1482[var5] = Statics.field2732[var4[var5] & 0xFF];
            }
        }
        method875();
        return var0;
    }

    @ObfuscatedName("d.m(Lef;IIB)Z")
    public static boolean method66(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2932(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method214(var3);
            return true;
        }
    }

    @ObfuscatedName("t.v([BI)V")
    public static void method214(byte[] arg0) {
        class127 var1 = new class127(arg0);
        var1.field2037 = arg0.length - 2;
        Statics.field1461 = var1.method2413();
        Statics.field1468 = new int[Statics.field1461];
        Statics.field1464 = new int[Statics.field1461];
        Statics.field1465 = new int[Statics.field1461];
        Statics.field1466 = new int[Statics.field1461];
        Statics.field1467 = new byte[Statics.field1461][];
        var1.field2037 = arg0.length - 7 - Statics.field1461 * 8;
        Statics.field1271 = var1.method2413();
        Statics.field1462 = var1.method2413();
        int var2 = (var1.method2411() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1461; var3++) {
            Statics.field1468[var3] = var1.method2413();
        }
        for (int var4 = 0; var4 < Statics.field1461; var4++) {
            Statics.field1464[var4] = var1.method2413();
        }
        for (int var5 = 0; var5 < Statics.field1461; var5++) {
            Statics.field1465[var5] = var1.method2413();
        }
        for (int var6 = 0; var6 < Statics.field1461; var6++) {
            Statics.field1466[var6] = var1.method2413();
        }
        var1.field2037 = arg0.length - 7 - Statics.field1461 * 8 - (var2 - 1) * 3;
        Statics.field2732 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2732[var7] = var1.method2415();
            if (Statics.field2732[var7] == 0) {
                Statics.field2732[var7] = 1;
            }
        }
        var1.field2037 = 0;
        for (int var8 = 0; var8 < Statics.field1461; var8++) {
            int var9 = Statics.field1465[var8];
            int var10 = Statics.field1466[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1467[var8] = var12;
            int var13 = var1.method2411();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2475();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2475();
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.j(I)V")
    public static void method875() {
        Statics.field1468 = null;
        Statics.field1464 = null;
        Statics.field1465 = null;
        Statics.field1466 = null;
        Statics.field2732 = null;
        Statics.field1467 = (byte[][]) null;
    }
}
