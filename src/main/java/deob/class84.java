package deob;

@ObfuscatedName("cu")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bv.f(Leo;III)[Lcy;")
    public static class87[] method1390(class153 arg0, int arg1, int arg2) {
        return method1249(arg0, arg1, arg2) ? method55() : null;
    }

    @ObfuscatedName("t.t(Leo;III)Lcy;")
    public static class87 method8(class153 arg0, int arg1, int arg2) {
        if (!method1249(arg0, arg1, arg2)) {
            return null;
        }
        class87 var3 = new class87();
        var3.field1475 = Statics.field1437;
        var3.field1469 = Statics.field1210;
        var3.field1473 = Statics.field1406[0];
        var3.field1476 = Statics.field1438[0];
        var3.field1471 = Statics.field1440[0];
        var3.field1472 = Statics.field1439[0];
        var3.field1474 = Statics.field1441;
        var3.field1470 = Statics.field2089[0];
        Statics.field1406 = null;
        Statics.field1438 = null;
        Statics.field1440 = null;
        Statics.field1439 = null;
        Statics.field1441 = null;
        Statics.field2089 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("aa.n(Leo;III)Lci;")
    public static class86 method241(class153 arg0, int arg1, int arg2) {
        if (!method1249(arg0, arg1, arg2)) {
            return null;
        }
        class86 var3 = new class86();
        var3.field1462 = Statics.field1437;
        var3.field1463 = Statics.field1210;
        var3.field1460 = Statics.field1406[0];
        var3.field1465 = Statics.field1438[0];
        var3.field1458 = Statics.field1440[0];
        var3.field1459 = Statics.field1439[0];
        int var4 = var3.field1459 * var3.field1458;
        byte[] var5 = Statics.field2089[0];
        var3.field1457 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1457[var6] = Statics.field1441[var5[var6] & 0xFF];
        }
        method1384();
        return var3;
    }

    @ObfuscatedName("ca.e(Leo;Leo;IIB)Lgn;")
    public static class183 method1623(class153 arg0, class153 arg1, int arg2, int arg3) {
        if (!method1249(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3035(arg2, arg3);
        class183 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class183 var6 = new class183(var4, Statics.field1406, Statics.field1438, Statics.field1440, Statics.field1439, Statics.field1441, Statics.field2089);
            method1384();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("n.l(Leo;Ljava/lang/String;Ljava/lang/String;I)[Lcy;")
    public static class87[] method23(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3034(arg1);
        int var4 = arg0.method3050(var3, arg2);
        return method1390(arg0, var3, var4);
    }

    @ObfuscatedName("ck.d(Leo;Ljava/lang/String;Ljava/lang/String;I)Lcy;")
    public static class87 method1875(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3034(arg1);
        int var4 = arg0.method3050(var3, arg2);
        return method8(arg0, var3, var4);
    }

    @ObfuscatedName("be.r(Leo;Ljava/lang/String;Ljava/lang/String;B)[Lci;")
    public static class86[] method1601(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3034(arg1);
        int var4 = arg0.method3050(var3, arg2);
        class86[] var5;
        if (method1249(arg0, var3, var4)) {
            class86[] var6 = new class86[Statics.field1436];
            for (int var7 = 0; var7 < Statics.field1436; var7++) {
                class86 var8 = var6[var7] = new class86();
                var8.field1462 = Statics.field1437;
                var8.field1463 = Statics.field1210;
                var8.field1460 = Statics.field1406[var7];
                var8.field1465 = Statics.field1438[var7];
                var8.field1458 = Statics.field1440[var7];
                var8.field1459 = Statics.field1439[var7];
                int var9 = var8.field1459 * var8.field1458;
                byte[] var10 = Statics.field2089[var7];
                var8.field1457 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1457[var11] = Statics.field1441[var10[var11] & 0xFF];
                }
            }
            method1384();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("d.k(Leo;II)Lcy;")
    public static class87 method40(class153 arg0, int arg1) {
        byte[] var2 = arg0.method3039(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method897(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class87 var4 = new class87();
        var4.field1475 = Statics.field1437;
        var4.field1469 = Statics.field1210;
        var4.field1473 = Statics.field1406[0];
        var4.field1476 = Statics.field1438[0];
        var4.field1471 = Statics.field1440[0];
        var4.field1472 = Statics.field1439[0];
        var4.field1474 = Statics.field1441;
        var4.field1470 = Statics.field2089[0];
        Statics.field1406 = null;
        Statics.field1438 = null;
        Statics.field1440 = null;
        Statics.field1439 = null;
        Statics.field1441 = null;
        Statics.field2089 = (byte[][]) null;
        return var4;
    }

    @ObfuscatedName("r.u(I)[Lcy;")
    public static class87[] method55() {
        class87[] var0 = new class87[Statics.field1436];
        for (int var1 = 0; var1 < Statics.field1436; var1++) {
            class87 var2 = var0[var1] = new class87();
            var2.field1475 = Statics.field1437;
            var2.field1469 = Statics.field1210;
            var2.field1473 = Statics.field1406[var1];
            var2.field1476 = Statics.field1438[var1];
            var2.field1471 = Statics.field1440[var1];
            var2.field1472 = Statics.field1439[var1];
            var2.field1474 = Statics.field1441;
            var2.field1470 = Statics.field2089[var1];
        }
        method1384();
        return var0;
    }

    @ObfuscatedName("bw.o(Leo;III)Z")
    public static boolean method1249(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3035(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method897(var3);
            return true;
        }
    }

    @ObfuscatedName("ar.g([BB)V")
    public static void method897(byte[] arg0) {
        class127 var1 = new class127(arg0);
        var1.field2033 = arg0.length - 2;
        Statics.field1436 = var1.method2460();
        Statics.field1406 = new int[Statics.field1436];
        Statics.field1438 = new int[Statics.field1436];
        Statics.field1440 = new int[Statics.field1436];
        Statics.field1439 = new int[Statics.field1436];
        Statics.field2089 = new byte[Statics.field1436][];
        var1.field2033 = arg0.length - 7 - Statics.field1436 * 8;
        Statics.field1437 = var1.method2460();
        Statics.field1210 = var1.method2460();
        int var2 = (var1.method2458() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1436; var3++) {
            Statics.field1406[var3] = var1.method2460();
        }
        for (int var4 = 0; var4 < Statics.field1436; var4++) {
            Statics.field1438[var4] = var1.method2460();
        }
        for (int var5 = 0; var5 < Statics.field1436; var5++) {
            Statics.field1440[var5] = var1.method2460();
        }
        for (int var6 = 0; var6 < Statics.field1436; var6++) {
            Statics.field1439[var6] = var1.method2460();
        }
        var1.field2033 = arg0.length - 7 - Statics.field1436 * 8 - (var2 - 1) * 3;
        Statics.field1441 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1441[var7] = var1.method2554();
            if (Statics.field1441[var7] == 0) {
                Statics.field1441[var7] = 1;
            }
        }
        var1.field2033 = 0;
        for (int var8 = 0; var8 < Statics.field1436; var8++) {
            int var9 = Statics.field1440[var8];
            int var10 = Statics.field1439[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2089[var8] = var12;
            int var13 = var1.method2458();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2459();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2459();
                    }
                }
            }
        }
    }

    @ObfuscatedName("bh.s(I)V")
    public static void method1384() {
        Statics.field1406 = null;
        Statics.field1438 = null;
        Statics.field1440 = null;
        Statics.field1439 = null;
        Statics.field1441 = null;
        Statics.field2089 = (byte[][]) null;
    }
}
