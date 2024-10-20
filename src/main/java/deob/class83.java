package deob;

@ObfuscatedName("ci")
public class class83 {

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cy.g(Lez;IIB)Lce;")
    public static class86 method2229(class150 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3012(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method1480(var3);
            var4 = true;
        }
        return var4 ? method1400() : null;
    }

    @ObfuscatedName("dh.e(Lez;IIB)[Lcf;")
    public static class85[] method2258(class150 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3012(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method1480(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class85[] var5 = new class85[Statics.field1440];
        for (int var6 = 0; var6 < Statics.field1440; var6++) {
            class85 var7 = var5[var6] = new class85();
            var7.field1461 = Statics.field1436;
            var7.field1460 = Statics.field1443;
            var7.field1457 = Statics.field1979[var6];
            var7.field1458 = Statics.field1168[var6];
            var7.field1455 = Statics.field1793[var6];
            var7.field1462 = Statics.field2031[var6];
            int var8 = var7.field1462 * var7.field1455;
            byte[] var9 = Statics.field2011[var6];
            var7.field1454 = new int[var8];
            for (int var10 = 0; var10 < var8; var10++) {
                var7.field1454[var10] = Statics.field2421[var9[var10] & 0xFF];
            }
        }
        method216();
        return var5;
    }

    @ObfuscatedName("ej.n(Lez;Ljava/lang/String;Ljava/lang/String;I)[Lce;")
    public static class86[] method3136(class150 arg0, String arg1, String arg2) {
        int var3 = arg0.method3021(arg1);
        int var4 = arg0.method3038(var3, arg2);
        byte[] var5 = arg0.method3012(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method1480(var5);
            var6 = true;
        }
        class86[] var7;
        if (var6) {
            var7 = method37();
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("cx.j(Lez;Ljava/lang/String;Ljava/lang/String;I)Lce;")
    public static class86 method1597(class150 arg0, String arg1, String arg2) {
        int var3 = arg0.method3021(arg1);
        int var4 = arg0.method3038(var3, arg2);
        return method2229(arg0, var3, var4);
    }

    @ObfuscatedName("m.i(Lez;Ljava/lang/String;Ljava/lang/String;B)[Lcf;")
    public static class85[] method153(class150 arg0, String arg1, String arg2) {
        int var3 = arg0.method3021(arg1);
        int var4 = arg0.method3038(var3, arg2);
        return method2258(arg0, var3, var4);
    }

    @ObfuscatedName("cy.o(Lez;Ljava/lang/String;Ljava/lang/String;I)Lcf;")
    public static class85 method2224(class150 arg0, String arg1, String arg2) {
        int var3 = arg0.method3021(arg1);
        int var4 = arg0.method3038(var3, arg2);
        byte[] var5 = arg0.method3012(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method1480(var5);
            var6 = true;
        }
        class85 var7;
        if (var6) {
            var7 = method1541();
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("ee.l(Lez;Lez;Ljava/lang/String;Ljava/lang/String;I)Lfe;")
    public static class181 method2712(class150 arg0, class150 arg1, String arg2, String arg3) {
        int var4 = arg0.method3021(arg2);
        int var5 = arg0.method3038(var4, arg3);
        byte[] var6 = arg0.method3012(var4, var5);
        boolean var7;
        if (var6 == null) {
            var7 = false;
        } else {
            method1480(var6);
            var7 = true;
        }
        class181 var8;
        if (var7) {
            var8 = method1383(arg1.method3012(var4, var5));
        } else {
            var8 = null;
        }
        return var8;
    }

    @ObfuscatedName("i.p(I)[Lce;")
    public static class86[] method37() {
        class86[] var0 = new class86[Statics.field1440];
        for (int var1 = 0; var1 < Statics.field1440; var1++) {
            class86 var2 = var0[var1] = new class86();
            var2.field1472 = Statics.field1436;
            var2.field1473 = Statics.field1443;
            var2.field1467 = Statics.field1979[var1];
            var2.field1471 = Statics.field1168[var1];
            var2.field1468 = Statics.field1793[var1];
            var2.field1469 = Statics.field2031[var1];
            var2.field1466 = Statics.field2421;
            var2.field1470 = Statics.field2011[var1];
        }
        method216();
        return var0;
    }

    @ObfuscatedName("by.t(I)Lce;")
    public static class86 method1400() {
        class86 var0 = new class86();
        var0.field1472 = Statics.field1436;
        var0.field1473 = Statics.field1443;
        var0.field1467 = Statics.field1979[0];
        var0.field1471 = Statics.field1168[0];
        var0.field1468 = Statics.field1793[0];
        var0.field1469 = Statics.field2031[0];
        var0.field1466 = Statics.field2421;
        var0.field1470 = Statics.field2011[0];
        method216();
        return var0;
    }

    @ObfuscatedName("bq.w(B)Lcf;")
    public static class85 method1541() {
        class85 var0 = new class85();
        var0.field1461 = Statics.field1436;
        var0.field1460 = Statics.field1443;
        var0.field1457 = Statics.field1979[0];
        var0.field1458 = Statics.field1168[0];
        var0.field1455 = Statics.field1793[0];
        var0.field1462 = Statics.field2031[0];
        int var1 = var0.field1462 * var0.field1455;
        byte[] var2 = Statics.field2011[0];
        var0.field1454 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1454[var3] = Statics.field2421[var2[var3] & 0xFF];
        }
        method216();
        return var0;
    }

    @ObfuscatedName("bh.r([BI)Lfe;")
    public static class181 method1383(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class181 var1 = new class181(arg0, Statics.field1979, Statics.field1168, Statics.field1793, Statics.field2031, Statics.field2421, Statics.field2011);
            method216();
            return var1;
        }
    }

    @ObfuscatedName("u.a(Lez;IB)Z")
    public static boolean method215(class150 arg0, int arg1) {
        byte[] var2 = arg0.method3017(arg1);
        if (var2 == null) {
            return false;
        } else {
            method1480(var2);
            return true;
        }
    }

    @ObfuscatedName("bj.q([BI)V")
    public static void method1480(byte[] arg0) {
        class126 var1 = new class126(arg0);
        var1.field2016 = arg0.length - 2;
        Statics.field1440 = var1.method2487();
        Statics.field1979 = new int[Statics.field1440];
        Statics.field1168 = new int[Statics.field1440];
        Statics.field1793 = new int[Statics.field1440];
        Statics.field2031 = new int[Statics.field1440];
        Statics.field2011 = new byte[Statics.field1440][];
        var1.field2016 = arg0.length - 7 - Statics.field1440 * 8;
        Statics.field1436 = var1.method2487();
        Statics.field1443 = var1.method2487();
        int var2 = (var1.method2485() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1440; var3++) {
            Statics.field1979[var3] = var1.method2487();
        }
        for (int var4 = 0; var4 < Statics.field1440; var4++) {
            Statics.field1168[var4] = var1.method2487();
        }
        for (int var5 = 0; var5 < Statics.field1440; var5++) {
            Statics.field1793[var5] = var1.method2487();
        }
        for (int var6 = 0; var6 < Statics.field1440; var6++) {
            Statics.field2031[var6] = var1.method2487();
        }
        var1.field2016 = arg0.length - 7 - Statics.field1440 * 8 - (var2 - 1) * 3;
        Statics.field2421 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2421[var7] = var1.method2489();
            if (Statics.field2421[var7] == 0) {
                Statics.field2421[var7] = 1;
            }
        }
        var1.field2016 = 0;
        for (int var8 = 0; var8 < Statics.field1440; var8++) {
            int var9 = Statics.field1793[var8];
            int var10 = Statics.field2031[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2011[var8] = var12;
            int var13 = var1.method2485();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2479();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2479();
                    }
                }
            }
        }
    }

    @ObfuscatedName("u.z(I)V")
    public static void method216() {
        Statics.field1979 = null;
        Statics.field1168 = null;
        Statics.field1793 = null;
        Statics.field2031 = null;
        Statics.field2421 = null;
        Statics.field2011 = (byte[][]) null;
    }
}
