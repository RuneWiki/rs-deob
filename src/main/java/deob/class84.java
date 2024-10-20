package deob;

@ObfuscatedName("cx")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.g(Leu;III)Lcv;")
    public static class87 method153(class153 arg0, int arg1, int arg2) {
        return method1378(arg0, arg1, arg2) ? method1380() : null;
    }

    @ObfuscatedName("ca.h(Leu;III)[Lcj;")
    public static class86[] method1663(class153 arg0, int arg1, int arg2) {
        if (!method1378(arg0, arg1, arg2)) {
            return null;
        }
        class86[] var3 = new class86[Statics.field1440];
        for (int var4 = 0; var4 < Statics.field1440; var4++) {
            class86 var5 = var3[var4] = new class86();
            var5.field1460 = Statics.field1437;
            var5.field1461 = Statics.field1441;
            var5.field1455 = Statics.field1435[var4];
            var5.field1459 = Statics.field1436[var4];
            var5.field1463 = Statics.field1994[var4];
            var5.field1458 = Statics.field400[var4];
            int var6 = var5.field1463 * var5.field1458;
            byte[] var7 = Statics.field1439[var4];
            var5.field1464 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1464[var8] = Statics.field1438[var7[var8] & 0xFF];
            }
        }
        method603();
        return var3;
    }

    @ObfuscatedName("dd.s(Leu;Ljava/lang/String;Ljava/lang/String;I)[Lcv;")
    public static class87[] method2353(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3092(arg1);
        int var4 = arg0.method3086(var3, arg2);
        class87[] var5;
        if (method1378(arg0, var3, var4)) {
            var5 = method28();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("l.o(Leu;Ljava/lang/String;Ljava/lang/String;I)Lcv;")
    public static class87 method163(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3092(arg1);
        int var4 = arg0.method3086(var3, arg2);
        return method153(arg0, var3, var4);
    }

    @ObfuscatedName("j.p(Leu;Ljava/lang/String;Ljava/lang/String;I)[Lcj;")
    public static class86[] method114(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3092(arg1);
        int var4 = arg0.method3086(var3, arg2);
        return method1663(arg0, var3, var4);
    }

    @ObfuscatedName("aw.x(Leu;Ljava/lang/String;Ljava/lang/String;I)Lcj;")
    public static class86 method592(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3092(arg1);
        int var4 = arg0.method3086(var3, arg2);
        class86 var5;
        if (method1378(arg0, var3, var4)) {
            class86 var6 = new class86();
            var6.field1460 = Statics.field1437;
            var6.field1461 = Statics.field1441;
            var6.field1455 = Statics.field1435[0];
            var6.field1459 = Statics.field1436[0];
            var6.field1463 = Statics.field1994[0];
            var6.field1458 = Statics.field400[0];
            int var7 = var6.field1463 * var6.field1458;
            byte[] var8 = Statics.field1439[0];
            var6.field1464 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field1464[var9] = Statics.field1438[var8[var9] & 0xFF];
            }
            method603();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ad.k(Leu;II)Lcv;")
    public static class87 method822(class153 arg0, int arg1) {
        return method56(arg0, arg1) ? method1380() : null;
    }

    @ObfuscatedName("s.r(B)[Lcv;")
    public static class87[] method28() {
        class87[] var0 = new class87[Statics.field1440];
        for (int var1 = 0; var1 < Statics.field1440; var1++) {
            class87 var2 = var0[var1] = new class87();
            var2.field1473 = Statics.field1437;
            var2.field1467 = Statics.field1441;
            var2.field1469 = Statics.field1435[var1];
            var2.field1472 = Statics.field1436[var1];
            var2.field1471 = Statics.field1994[var1];
            var2.field1470 = Statics.field400[var1];
            var2.field1468 = Statics.field1438;
            var2.field1474 = Statics.field1439[var1];
        }
        method603();
        return var0;
    }

    @ObfuscatedName("bx.z(B)Lcv;")
    public static class87 method1380() {
        class87 var0 = new class87();
        var0.field1473 = Statics.field1437;
        var0.field1467 = Statics.field1441;
        var0.field1469 = Statics.field1435[0];
        var0.field1472 = Statics.field1436[0];
        var0.field1471 = Statics.field1994[0];
        var0.field1470 = Statics.field400[0];
        var0.field1468 = Statics.field1438;
        var0.field1474 = Statics.field1439[0];
        method603();
        return var0;
    }

    @ObfuscatedName("bx.n(Leu;IIB)Z")
    public static boolean method1378(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3080(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method160(var3);
            return true;
        }
    }

    @ObfuscatedName("k.j(Leu;II)Z")
    public static boolean method56(class153 arg0, int arg1) {
        byte[] var2 = arg0.method3087(arg1);
        if (var2 == null) {
            return false;
        } else {
            method160(var2);
            return true;
        }
    }

    @ObfuscatedName("e.b([BI)V")
    public static void method160(byte[] arg0) {
        class127 var1 = new class127(arg0);
        var1.field2027 = arg0.length - 2;
        Statics.field1440 = var1.method2501();
        Statics.field1435 = new int[Statics.field1440];
        Statics.field1436 = new int[Statics.field1440];
        Statics.field1994 = new int[Statics.field1440];
        Statics.field400 = new int[Statics.field1440];
        Statics.field1439 = new byte[Statics.field1440][];
        var1.field2027 = arg0.length - 7 - Statics.field1440 * 8;
        Statics.field1437 = var1.method2501();
        Statics.field1441 = var1.method2501();
        int var2 = (var1.method2499() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1440; var3++) {
            Statics.field1435[var3] = var1.method2501();
        }
        for (int var4 = 0; var4 < Statics.field1440; var4++) {
            Statics.field1436[var4] = var1.method2501();
        }
        for (int var5 = 0; var5 < Statics.field1440; var5++) {
            Statics.field1994[var5] = var1.method2501();
        }
        for (int var6 = 0; var6 < Statics.field1440; var6++) {
            Statics.field400[var6] = var1.method2501();
        }
        var1.field2027 = arg0.length - 7 - Statics.field1440 * 8 - (var2 - 1) * 3;
        Statics.field1438 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1438[var7] = var1.method2503();
            if (Statics.field1438[var7] == 0) {
                Statics.field1438[var7] = 1;
            }
        }
        var1.field2027 = 0;
        for (int var8 = 0; var8 < Statics.field1440; var8++) {
            int var9 = Statics.field1994[var8];
            int var10 = Statics.field400[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1439[var8] = var12;
            int var13 = var1.method2499();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2500();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2500();
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.t(I)V")
    public static void method603() {
        Statics.field1435 = null;
        Statics.field1436 = null;
        Statics.field1994 = null;
        Statics.field400 = null;
        Statics.field1438 = null;
        Statics.field1439 = (byte[][]) null;
    }
}
