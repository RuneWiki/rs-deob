package deob;

@ObfuscatedName("ci")
public class class83 {

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fs.j(Leh;IIB)Lcb;")
    public static class86 method3294(class150 arg0, int arg1, int arg2) {
        return method1451(arg0, arg1, arg2) ? method1551() : null;
    }

    @ObfuscatedName("co.y(Leh;III)[Lct;")
    public static class85[] method1826(class150 arg0, int arg1, int arg2) {
        return method1451(arg0, arg1, arg2) ? method227() : null;
    }

    @ObfuscatedName("ax.x(Leh;Leh;III)Lfd;")
    public static class181 method797(class150 arg0, class150 arg1, int arg2, int arg3) {
        if (!method1451(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method2903(arg2, arg3);
        class181 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class181 var6 = new class181(var4, Statics.field1442, Statics.field1439, Statics.field2011, Statics.field2713, Statics.field1766, Statics.field2439);
            Statics.field1442 = null;
            Statics.field1439 = null;
            Statics.field2011 = null;
            Statics.field2713 = null;
            Statics.field1766 = null;
            Statics.field2439 = (byte[][]) null;
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("bd.z(Leh;Ljava/lang/String;Ljava/lang/String;I)[Lcb;")
    public static class86[] method1381(class150 arg0, String arg1, String arg2) {
        int var3 = arg0.method2918(arg1);
        int var4 = arg0.method2907(var3, arg2);
        class86[] var5;
        if (method1451(arg0, var3, var4)) {
            class86[] var6 = new class86[Statics.field1437];
            for (int var7 = 0; var7 < Statics.field1437; var7++) {
                class86 var8 = var6[var7] = new class86();
                var8.field1470 = Statics.field1436;
                var8.field1468 = Statics.field1435;
                var8.field1464 = Statics.field1442[var7];
                var8.field1469 = Statics.field1439[var7];
                var8.field1466 = Statics.field2011[var7];
                var8.field1467 = Statics.field2713[var7];
                var8.field1471 = Statics.field1766;
                var8.field1465 = Statics.field2439[var7];
            }
            Statics.field1442 = null;
            Statics.field1439 = null;
            Statics.field2011 = null;
            Statics.field2713 = null;
            Statics.field1766 = null;
            Statics.field2439 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("cv.c(Leh;Ljava/lang/String;Ljava/lang/String;S)Lcb;")
    public static class86 method1608(class150 arg0, String arg1, String arg2) {
        int var3 = arg0.method2918(arg1);
        int var4 = arg0.method2907(var3, arg2);
        return method3294(arg0, var3, var4);
    }

    @ObfuscatedName("m.e(Leh;Ljava/lang/String;Ljava/lang/String;I)[Lct;")
    public static class85[] method134(class150 arg0, String arg1, String arg2) {
        int var3 = arg0.method2918(arg1);
        int var4 = arg0.method2907(var3, arg2);
        return method1826(arg0, var3, var4);
    }

    @ObfuscatedName("bm.s(Leh;Ljava/lang/String;Ljava/lang/String;I)Lct;")
    public static class85 method1333(class150 arg0, String arg1, String arg2) {
        int var3 = arg0.method2918(arg1);
        int var4 = arg0.method2907(var3, arg2);
        class85 var5;
        if (method1451(arg0, var3, var4)) {
            class85 var6 = new class85();
            var6.field1463 = Statics.field1436;
            var6.field1457 = Statics.field1435;
            var6.field1455 = Statics.field1442[0];
            var6.field1452 = Statics.field1439[0];
            var6.field1453 = Statics.field2011[0];
            var6.field1456 = Statics.field2713[0];
            int var7 = var6.field1456 * var6.field1453;
            byte[] var8 = Statics.field2439[0];
            var6.field1459 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field1459[var9] = Statics.field1766[var8[var9] & 0xFF];
            }
            Statics.field1442 = null;
            Statics.field1439 = null;
            Statics.field2011 = null;
            Statics.field2713 = null;
            Statics.field1766 = null;
            Statics.field2439 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("do.i(Leh;Leh;Ljava/lang/String;Ljava/lang/String;I)Lfd;")
    public static class181 method2279(class150 arg0, class150 arg1, String arg2, String arg3) {
        int var4 = arg0.method2918(arg2);
        int var5 = arg0.method2907(var4, arg3);
        return method797(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("be.g(I)Lcb;")
    public static class86 method1551() {
        class86 var0 = new class86();
        var0.field1470 = Statics.field1436;
        var0.field1468 = Statics.field1435;
        var0.field1464 = Statics.field1442[0];
        var0.field1469 = Statics.field1439[0];
        var0.field1466 = Statics.field2011[0];
        var0.field1467 = Statics.field2713[0];
        var0.field1471 = Statics.field1766;
        var0.field1465 = Statics.field2439[0];
        Statics.field1442 = null;
        Statics.field1439 = null;
        Statics.field2011 = null;
        Statics.field2713 = null;
        Statics.field1766 = null;
        Statics.field2439 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("f.q(B)[Lct;")
    public static class85[] method227() {
        class85[] var0 = new class85[Statics.field1437];
        for (int var1 = 0; var1 < Statics.field1437; var1++) {
            class85 var2 = var0[var1] = new class85();
            var2.field1463 = Statics.field1436;
            var2.field1457 = Statics.field1435;
            var2.field1455 = Statics.field1442[var1];
            var2.field1452 = Statics.field1439[var1];
            var2.field1453 = Statics.field2011[var1];
            var2.field1456 = Statics.field2713[var1];
            int var3 = var2.field1456 * var2.field1453;
            byte[] var4 = Statics.field2439[var1];
            var2.field1459 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1459[var5] = Statics.field1766[var4[var5] & 0xFF];
            }
        }
        Statics.field1442 = null;
        Statics.field1439 = null;
        Statics.field2011 = null;
        Statics.field2713 = null;
        Statics.field1766 = null;
        Statics.field2439 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("bo.w(Leh;IIB)Z")
    public static boolean method1451(class150 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2903(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2303(var3);
            return true;
        }
    }

    @ObfuscatedName("dw.k([BI)V")
    public static void method2303(byte[] arg0) {
        class126 var1 = new class126(arg0);
        var1.field2020 = arg0.length - 2;
        Statics.field1437 = var1.method2405();
        Statics.field1442 = new int[Statics.field1437];
        Statics.field1439 = new int[Statics.field1437];
        Statics.field2011 = new int[Statics.field1437];
        Statics.field2713 = new int[Statics.field1437];
        Statics.field2439 = new byte[Statics.field1437][];
        var1.field2020 = arg0.length - 7 - Statics.field1437 * 8;
        Statics.field1436 = var1.method2405();
        Statics.field1435 = var1.method2405();
        int var2 = (var1.method2399() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1437; var3++) {
            Statics.field1442[var3] = var1.method2405();
        }
        for (int var4 = 0; var4 < Statics.field1437; var4++) {
            Statics.field1439[var4] = var1.method2405();
        }
        for (int var5 = 0; var5 < Statics.field1437; var5++) {
            Statics.field2011[var5] = var1.method2405();
        }
        for (int var6 = 0; var6 < Statics.field1437; var6++) {
            Statics.field2713[var6] = var1.method2405();
        }
        var1.field2020 = arg0.length - 7 - Statics.field1437 * 8 - (var2 - 1) * 3;
        Statics.field1766 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1766[var7] = var1.method2386();
            if (Statics.field1766[var7] == 0) {
                Statics.field1766[var7] = 1;
            }
        }
        var1.field2020 = 0;
        for (int var8 = 0; var8 < Statics.field1437; var8++) {
            int var9 = Statics.field2011[var8];
            int var10 = Statics.field2713[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2439[var8] = var12;
            int var13 = var1.method2399();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2383();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2383();
                    }
                }
            }
        }
    }
}
