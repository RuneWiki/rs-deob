package deob;

@ObfuscatedName("cq")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eg.c(Ley;III)[Lcw;")
    public static class87[] method2870(class153 arg0, int arg1, int arg2) {
        return method1961(arg0, arg1, arg2) ? method1476() : null;
    }

    @ObfuscatedName("dv.q(Ley;Ljava/lang/String;Ljava/lang/String;I)[Lcw;")
    public static class87[] method2112(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method2901(arg1);
        int var4 = arg0.method2948(var3, arg2);
        return method2870(arg0, var3, var4);
    }

    @ObfuscatedName("e.y(Ley;Ljava/lang/String;Ljava/lang/String;B)Lcw;")
    public static class87 method207(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method2901(arg1);
        int var4 = arg0.method2948(var3, arg2);
        class87 var5;
        if (method1961(arg0, var3, var4)) {
            class87 var6 = new class87();
            var6.field1507 = Statics.field1463;
            var6.field1508 = Statics.field79;
            var6.field1506 = Statics.field1464[0];
            var6.field1501 = Statics.field1465[0];
            var6.field1503 = Statics.field1466[0];
            var6.field1504 = Statics.field1467[0];
            var6.field1502 = Statics.field1462;
            var6.field1505 = Statics.field257[0];
            method2113();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ff.v(Ley;Ljava/lang/String;Ljava/lang/String;B)[Lcd;")
    public static class86[] method2998(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method2901(arg1);
        int var4 = arg0.method2948(var3, arg2);
        class86[] var5;
        if (method1961(arg0, var3, var4)) {
            class86[] var6 = new class86[Statics.field1469];
            for (int var7 = 0; var7 < Statics.field1469; var7++) {
                class86 var8 = var6[var7] = new class86();
                var8.field1494 = Statics.field1463;
                var8.field1490 = Statics.field79;
                var8.field1492 = Statics.field1464[var7];
                var8.field1493 = Statics.field1465[var7];
                var8.field1489 = Statics.field1466[var7];
                var8.field1495 = Statics.field1467[var7];
                int var9 = var8.field1495 * var8.field1489;
                byte[] var10 = Statics.field257[var7];
                var8.field1497 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1497[var11] = Statics.field1462[var10[var11] & 0xFF];
                }
            }
            method2113();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("e.g(Ley;Ljava/lang/String;Ljava/lang/String;I)Lcd;")
    public static class86 method204(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method2901(arg1);
        int var4 = arg0.method2948(var3, arg2);
        class86 var5;
        if (method1961(arg0, var3, var4)) {
            class86 var6 = new class86();
            var6.field1494 = Statics.field1463;
            var6.field1490 = Statics.field79;
            var6.field1492 = Statics.field1464[0];
            var6.field1493 = Statics.field1465[0];
            var6.field1489 = Statics.field1466[0];
            var6.field1495 = Statics.field1467[0];
            int var7 = var6.field1495 * var6.field1489;
            byte[] var8 = Statics.field257[0];
            var6.field1497 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field1497[var9] = Statics.field1462[var8[var9] & 0xFF];
            }
            method2113();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bh.x(I)[Lcw;")
    public static class87[] method1476() {
        class87[] var0 = new class87[Statics.field1469];
        for (int var1 = 0; var1 < Statics.field1469; var1++) {
            class87 var2 = var0[var1] = new class87();
            var2.field1507 = Statics.field1463;
            var2.field1508 = Statics.field79;
            var2.field1506 = Statics.field1464[var1];
            var2.field1501 = Statics.field1465[var1];
            var2.field1503 = Statics.field1466[var1];
            var2.field1504 = Statics.field1467[var1];
            var2.field1502 = Statics.field1462;
            var2.field1505 = Statics.field257[var1];
        }
        method2113();
        return var0;
    }

    @ObfuscatedName("l.u([BB)Lge;")
    public static class183 method54(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class183 var1 = new class183(arg0, Statics.field1464, Statics.field1465, Statics.field1466, Statics.field1467, Statics.field1462, Statics.field257);
            method2113();
            return var1;
        }
    }

    @ObfuscatedName("cv.l(Ley;III)Z")
    public static boolean method1961(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2886(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1319(var3);
            return true;
        }
    }

    @ObfuscatedName("bx.a([BI)V")
    public static void method1319(byte[] arg0) {
        class127 var1 = new class127(arg0);
        var1.field2052 = arg0.length - 2;
        Statics.field1469 = var1.method2327();
        Statics.field1464 = new int[Statics.field1469];
        Statics.field1465 = new int[Statics.field1469];
        Statics.field1466 = new int[Statics.field1469];
        Statics.field1467 = new int[Statics.field1469];
        Statics.field257 = new byte[Statics.field1469][];
        var1.field2052 = arg0.length - 7 - Statics.field1469 * 8;
        Statics.field1463 = var1.method2327();
        Statics.field79 = var1.method2327();
        int var2 = (var1.method2383() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1469; var3++) {
            Statics.field1464[var3] = var1.method2327();
        }
        for (int var4 = 0; var4 < Statics.field1469; var4++) {
            Statics.field1465[var4] = var1.method2327();
        }
        for (int var5 = 0; var5 < Statics.field1469; var5++) {
            Statics.field1466[var5] = var1.method2327();
        }
        for (int var6 = 0; var6 < Statics.field1469; var6++) {
            Statics.field1467[var6] = var1.method2327();
        }
        var1.field2052 = arg0.length - 7 - Statics.field1469 * 8 - (var2 - 1) * 3;
        Statics.field1462 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1462[var7] = var1.method2322();
            if (Statics.field1462[var7] == 0) {
                Statics.field1462[var7] = 1;
            }
        }
        var1.field2052 = 0;
        for (int var8 = 0; var8 < Statics.field1469; var8++) {
            int var9 = Statics.field1466[var8];
            int var10 = Statics.field1467[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field257[var8] = var12;
            int var13 = var1.method2383();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2319();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2319();
                    }
                }
            }
        }
    }

    @ObfuscatedName("dt.h(I)V")
    public static void method2113() {
        Statics.field1464 = null;
        Statics.field1465 = null;
        Statics.field1466 = null;
        Statics.field1467 = null;
        Statics.field1462 = null;
        Statics.field257 = (byte[][]) null;
    }
}
