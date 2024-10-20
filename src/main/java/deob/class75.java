package deob;

@ObfuscatedName("bc")
public class class75 {

    public class75() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.j(Lfh;IIB)Lcb;")
    public static class79 method630(class161 arg0, int arg1, int arg2) {
        if (!method914(arg0, arg1, arg2)) {
            return null;
        }
        class79 var3 = new class79();
        var3.field1394 = Statics.field1346;
        var3.field1396 = Statics.field82;
        var3.field1390 = Statics.field1347[0];
        var3.field1392 = Statics.field1355[0];
        var3.field1391 = Statics.field1349[0];
        var3.field1389 = Statics.field1350[0];
        var3.field1395 = Statics.field1345;
        var3.field1393 = Statics.field776[0];
        method27();
        return var3;
    }

    @ObfuscatedName("ee.y(Lfh;III)[Lbh;")
    public static class77[] method2891(class161 arg0, int arg1, int arg2) {
        if (!method914(arg0, arg1, arg2)) {
            return null;
        }
        class77[] var3 = new class77[Statics.field1354];
        for (int var4 = 0; var4 < Statics.field1354; var4++) {
            class77 var5 = var3[var4] = new class77();
            var5.field1375 = Statics.field1346;
            var5.field1376 = Statics.field82;
            var5.field1373 = Statics.field1347[var4];
            var5.field1374 = Statics.field1355[var4];
            var5.field1371 = Statics.field1349[var4];
            var5.field1372 = Statics.field1350[var4];
            int var6 = var5.field1372 * var5.field1371;
            byte[] var7 = Statics.field776[var4];
            var5.field1380 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1380[var8] = Statics.field1345[var7[var8] & 0xFF];
            }
        }
        method27();
        return var3;
    }

    @ObfuscatedName("m.z(Lfh;IIB)Lbh;")
    public static class77 method146(class161 arg0, int arg1, int arg2) {
        if (!method914(arg0, arg1, arg2)) {
            return null;
        }
        class77 var3 = new class77();
        var3.field1375 = Statics.field1346;
        var3.field1376 = Statics.field82;
        var3.field1373 = Statics.field1347[0];
        var3.field1374 = Statics.field1355[0];
        var3.field1371 = Statics.field1349[0];
        var3.field1372 = Statics.field1350[0];
        int var4 = var3.field1372 * var3.field1371;
        byte[] var5 = Statics.field776[0];
        var3.field1380 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1380[var6] = Statics.field1345[var5[var6] & 0xFF];
        }
        method27();
        return var3;
    }

    @ObfuscatedName("t.l(Lfh;Ljava/lang/String;Ljava/lang/String;I)[Lcb;")
    public static class79[] method172(class161 arg0, String arg1, String arg2) {
        int var3 = arg0.method2994(arg1);
        int var4 = arg0.method3011(var3, arg2);
        class79[] var5;
        if (method914(arg0, var3, var4)) {
            class79[] var6 = new class79[Statics.field1354];
            for (int var7 = 0; var7 < Statics.field1354; var7++) {
                class79 var8 = var6[var7] = new class79();
                var8.field1394 = Statics.field1346;
                var8.field1396 = Statics.field82;
                var8.field1390 = Statics.field1347[var7];
                var8.field1392 = Statics.field1355[var7];
                var8.field1391 = Statics.field1349[var7];
                var8.field1389 = Statics.field1350[var7];
                var8.field1395 = Statics.field1345;
                var8.field1393 = Statics.field776[var7];
            }
            method27();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ad.w(Lfh;Ljava/lang/String;Ljava/lang/String;B)Lcb;")
    public static class79 method693(class161 arg0, String arg1, String arg2) {
        int var3 = arg0.method2994(arg1);
        int var4 = arg0.method3011(var3, arg2);
        return method630(arg0, var3, var4);
    }

    @ObfuscatedName("as.d(Lfh;Ljava/lang/String;Ljava/lang/String;I)[Lbh;")
    public static class77[] method976(class161 arg0, String arg1, String arg2) {
        int var3 = arg0.method2994(arg1);
        int var4 = arg0.method3011(var3, arg2);
        return method2891(arg0, var3, var4);
    }

    @ObfuscatedName("a.f(Lfh;Lfh;Ljava/lang/String;Ljava/lang/String;B)Lhy;")
    public static class218 method118(class161 arg0, class161 arg1, String arg2, String arg3) {
        int var4 = arg0.method2994(arg2);
        int var5 = arg0.method3011(var4, arg3);
        class218 var6;
        if (method914(arg0, var4, var5)) {
            var6 = method1030(arg1.method2995(var4, var5));
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("ae.i(Lfh;IS)Lcb;")
    public static class79 method818(class161 arg0, int arg1) {
        byte[] var2 = arg0.method2984(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method823(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class79 var4 = new class79();
        var4.field1394 = Statics.field1346;
        var4.field1396 = Statics.field82;
        var4.field1390 = Statics.field1347[0];
        var4.field1392 = Statics.field1355[0];
        var4.field1391 = Statics.field1349[0];
        var4.field1389 = Statics.field1350[0];
        var4.field1395 = Statics.field1345;
        var4.field1393 = Statics.field776[0];
        method27();
        return var4;
    }

    @ObfuscatedName("ao.a([BI)Lhy;")
    public static class218 method1030(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class218 var1 = new class218(arg0, Statics.field1347, Statics.field1355, Statics.field1349, Statics.field1350, Statics.field1345, Statics.field776);
            method27();
            return var1;
        }
    }

    @ObfuscatedName("ac.o(Lfh;III)Z")
    public static boolean method914(class161 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2995(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method823(var3);
            return true;
        }
    }

    @ObfuscatedName("ae.u([BI)V")
    public static void method823(byte[] arg0) {
        class114 var1 = new class114(arg0);
        var1.field1894 = arg0.length - 2;
        Statics.field1354 = var1.method2324();
        Statics.field1347 = new int[Statics.field1354];
        Statics.field1355 = new int[Statics.field1354];
        Statics.field1349 = new int[Statics.field1354];
        Statics.field1350 = new int[Statics.field1354];
        Statics.field776 = new byte[Statics.field1354][];
        var1.field1894 = arg0.length - 7 - Statics.field1354 * 8;
        Statics.field1346 = var1.method2324();
        Statics.field82 = var1.method2324();
        int var2 = (var1.method2322() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1354; var3++) {
            Statics.field1347[var3] = var1.method2324();
        }
        for (int var4 = 0; var4 < Statics.field1354; var4++) {
            Statics.field1355[var4] = var1.method2324();
        }
        for (int var5 = 0; var5 < Statics.field1354; var5++) {
            Statics.field1349[var5] = var1.method2324();
        }
        for (int var6 = 0; var6 < Statics.field1354; var6++) {
            Statics.field1350[var6] = var1.method2324();
        }
        var1.field1894 = arg0.length - 7 - Statics.field1354 * 8 - (var2 - 1) * 3;
        Statics.field1345 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1345[var7] = var1.method2321();
            if (Statics.field1345[var7] == 0) {
                Statics.field1345[var7] = 1;
            }
        }
        var1.field1894 = 0;
        for (int var8 = 0; var8 < Statics.field1354; var8++) {
            int var9 = Statics.field1349[var8];
            int var10 = Statics.field1350[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field776[var8] = var12;
            int var13 = var1.method2322();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2323();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2323();
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.m(B)V")
    public static void method27() {
        Statics.field1347 = null;
        Statics.field1355 = null;
        Statics.field1349 = null;
        Statics.field1350 = null;
        Statics.field1345 = null;
        Statics.field776 = (byte[][]) null;
    }
}
