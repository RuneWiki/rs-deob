package deob;

@ObfuscatedName("bf")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cw.c(Lfj;III)[Lcd;")
    public static class79[] method2005(class167 arg0, int arg1, int arg2) {
        if (!method1217(arg0, arg1, arg2)) {
            return null;
        }
        class79[] var3 = new class79[Statics.field1375];
        for (int var4 = 0; var4 < Statics.field1375; var4++) {
            class79 var5 = var3[var4] = new class79();
            var5.field1391 = Statics.field1154;
            var5.field1390 = Statics.field1370;
            var5.field1384 = Statics.field1371[var4];
            var5.field1388 = Statics.field3135[var4];
            var5.field1387 = Statics.field1369[var4];
            var5.field1386 = Statics.field1099[var4];
            int var6 = var5.field1387 * var5.field1386;
            byte[] var7 = Statics.field1373[var4];
            var5.field1389 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1389[var8] = Statics.field1372[var7[var8] & 0xFF];
            }
        }
        method800();
        return var3;
    }

    @ObfuscatedName("ad.k(Lfj;Ljava/lang/String;Ljava/lang/String;I)[Lcp;")
    public static class81[] method706(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3009(arg1);
        int var4 = arg0.method3043(var3, arg2);
        class81[] var5;
        if (method1217(arg0, var3, var4)) {
            class81[] var6 = new class81[Statics.field1375];
            for (int var7 = 0; var7 < Statics.field1375; var7++) {
                class81 var8 = var6[var7] = new class81();
                var8.field1406 = Statics.field1154;
                var8.field1403 = Statics.field1370;
                var8.field1407 = Statics.field1371[var7];
                var8.field1405 = Statics.field3135[var7];
                var8.field1410 = Statics.field1369[var7];
                var8.field1408 = Statics.field1099[var7];
                var8.field1404 = Statics.field1372;
                var8.field1409 = Statics.field1373[var7];
            }
            method800();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("as.t(Lfj;Ljava/lang/String;Ljava/lang/String;I)Lcp;")
    public static class81 method871(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3009(arg1);
        int var4 = arg0.method3043(var3, arg2);
        class81 var5;
        if (method1217(arg0, var3, var4)) {
            var5 = method2002();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("a.g(Lfj;Ljava/lang/String;Ljava/lang/String;I)[Lcd;")
    public static class79[] method186(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3009(arg1);
        int var4 = arg0.method3043(var3, arg2);
        return method2005(arg0, var3, var4);
    }

    @ObfuscatedName("cr.o(Lfj;Ljava/lang/String;Ljava/lang/String;I)Lcd;")
    public static class79 method1891(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3009(arg1);
        int var4 = arg0.method3043(var3, arg2);
        class79 var5;
        if (method1217(arg0, var3, var4)) {
            class79 var6 = new class79();
            var6.field1391 = Statics.field1154;
            var6.field1390 = Statics.field1370;
            var6.field1384 = Statics.field1371[0];
            var6.field1388 = Statics.field3135[0];
            var6.field1387 = Statics.field1369[0];
            var6.field1386 = Statics.field1099[0];
            int var7 = var6.field1387 * var6.field1386;
            byte[] var8 = Statics.field1373[0];
            var6.field1389 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field1389[var9] = Statics.field1372[var8[var9] & 0xFF];
            }
            method800();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ca.i(Lfj;Lfj;Ljava/lang/String;Ljava/lang/String;I)Lhf;")
    public static class224 method2082(class167 arg0, class167 arg1, String arg2, String arg3) {
        int var4 = arg0.method3009(arg2);
        int var5 = arg0.method3043(var4, arg3);
        return Statics.method903(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("cv.w(I)Lcp;")
    public static class81 method2002() {
        class81 var0 = new class81();
        var0.field1406 = Statics.field1154;
        var0.field1403 = Statics.field1370;
        var0.field1407 = Statics.field1371[0];
        var0.field1405 = Statics.field3135[0];
        var0.field1410 = Statics.field1369[0];
        var0.field1408 = Statics.field1099[0];
        var0.field1404 = Statics.field1372;
        var0.field1409 = Statics.field1373[0];
        method800();
        return var0;
    }

    @ObfuscatedName("fu.m([BI)Lhf;")
    public static class224 method2970(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class224 var1 = new class224(arg0, Statics.field1371, Statics.field3135, Statics.field1369, Statics.field1099, Statics.field1372, Statics.field1373);
            method800();
            return var1;
        }
    }

    @ObfuscatedName("bc.r(Lfj;IIB)Z")
    public static boolean method1217(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2994(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method153(var3);
            return true;
        }
    }

    @ObfuscatedName("b.y(Lfj;IB)Z")
    public static boolean method210(class167 arg0, int arg1) {
        byte[] var2 = arg0.method3019(arg1);
        if (var2 == null) {
            return false;
        } else {
            method153(var2);
            return true;
        }
    }

    @ObfuscatedName("f.q([BB)V")
    public static void method153(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1955 = arg0.length - 2;
        Statics.field1375 = var1.method2293();
        Statics.field1371 = new int[Statics.field1375];
        Statics.field3135 = new int[Statics.field1375];
        Statics.field1369 = new int[Statics.field1375];
        Statics.field1099 = new int[Statics.field1375];
        Statics.field1373 = new byte[Statics.field1375][];
        var1.field1955 = arg0.length - 7 - Statics.field1375 * 8;
        Statics.field1154 = var1.method2293();
        Statics.field1370 = var1.method2293();
        int var2 = (var1.method2291() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1375; var3++) {
            Statics.field1371[var3] = var1.method2293();
        }
        for (int var4 = 0; var4 < Statics.field1375; var4++) {
            Statics.field3135[var4] = var1.method2293();
        }
        for (int var5 = 0; var5 < Statics.field1375; var5++) {
            Statics.field1369[var5] = var1.method2293();
        }
        for (int var6 = 0; var6 < Statics.field1375; var6++) {
            Statics.field1099[var6] = var1.method2293();
        }
        var1.field1955 = arg0.length - 7 - Statics.field1375 * 8 - (var2 - 1) * 3;
        Statics.field1372 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1372[var7] = var1.method2402();
            if (Statics.field1372[var7] == 0) {
                Statics.field1372[var7] = 1;
            }
        }
        var1.field1955 = 0;
        for (int var8 = 0; var8 < Statics.field1375; var8++) {
            int var9 = Statics.field1369[var8];
            int var10 = Statics.field1099[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1373[var8] = var12;
            int var13 = var1.method2291();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2292();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2292();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.f(I)V")
    public static void method800() {
        Statics.field1371 = null;
        Statics.field3135 = null;
        Statics.field1369 = null;
        Statics.field1099 = null;
        Statics.field1372 = null;
        Statics.field1373 = (byte[][]) null;
    }
}
