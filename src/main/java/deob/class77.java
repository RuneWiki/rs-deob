package deob;

@ObfuscatedName("bo")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ar.j(Lfa;III)Lcq;")
    public static class79 method849(class167 arg0, int arg1, int arg2) {
        return method973(arg0, arg1, arg2) ? method1539() : null;
    }

    @ObfuscatedName("cm.m(Lfa;Lfa;III)Lhj;")
    public static class224 method1791(class167 arg0, class167 arg1, int arg2, int arg3) {
        return method973(arg0, arg2, arg3) ? method1071(arg1.method3124(arg2, arg3)) : null;
    }

    @ObfuscatedName("ah.f(Lfa;Ljava/lang/String;Ljava/lang/String;I)[Lcp;")
    public static class81[] method862(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3099(arg1);
        int var4 = arg0.method3095(var3, arg2);
        class81[] var5;
        if (method973(arg0, var3, var4)) {
            class81[] var6 = new class81[Statics.field1380];
            for (int var7 = 0; var7 < Statics.field1380; var7++) {
                class81 var8 = var6[var7] = new class81();
                var8.field1414 = Statics.field1368;
                var8.field1415 = Statics.field1369;
                var8.field1412 = Statics.field1367[var7];
                var8.field1410 = Statics.field1371[var7];
                var8.field1408 = Statics.field1372[var7];
                var8.field1411 = Statics.field1374[var7];
                var8.field1413 = Statics.field1370;
                var8.field1409 = Statics.field237[var7];
            }
            method2763();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("j.l(Lfa;Ljava/lang/String;Ljava/lang/String;B)Lcp;")
    public static class81 method5(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3099(arg1);
        int var4 = arg0.method3095(var3, arg2);
        class81 var5;
        if (method973(arg0, var3, var4)) {
            class81 var6 = new class81();
            var6.field1414 = Statics.field1368;
            var6.field1415 = Statics.field1369;
            var6.field1412 = Statics.field1367[0];
            var6.field1410 = Statics.field1371[0];
            var6.field1408 = Statics.field1372[0];
            var6.field1411 = Statics.field1374[0];
            var6.field1413 = Statics.field1370;
            var6.field1409 = Statics.field237[0];
            method2763();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ap.u(Lfa;Ljava/lang/String;Ljava/lang/String;I)[Lcq;")
    public static class79[] method751(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3099(arg1);
        int var4 = arg0.method3095(var3, arg2);
        class79[] var5;
        if (method973(arg0, var3, var4)) {
            class79[] var6 = new class79[Statics.field1380];
            for (int var7 = 0; var7 < Statics.field1380; var7++) {
                class79 var8 = var6[var7] = new class79();
                var8.field1389 = Statics.field1368;
                var8.field1400 = Statics.field1369;
                var8.field1392 = Statics.field1367[var7];
                var8.field1393 = Statics.field1371[var7];
                var8.field1390 = Statics.field1372[var7];
                var8.field1391 = Statics.field1374[var7];
                int var9 = var8.field1391 * var8.field1390;
                byte[] var10 = Statics.field237[var7];
                var8.field1395 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1395[var11] = Statics.field1370[var10[var11] & 0xFF];
                }
            }
            method2763();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("q.a(Lfa;Ljava/lang/String;Ljava/lang/String;S)Lcq;")
    public static class79 method585(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3099(arg1);
        int var4 = arg0.method3095(var3, arg2);
        return method849(arg0, var3, var4);
    }

    @ObfuscatedName("ac.i(Lfa;II)Lcp;")
    public static class81 method809(class167 arg0, int arg1) {
        if (!method2968(arg0, arg1)) {
            return null;
        }
        class81 var2 = new class81();
        var2.field1414 = Statics.field1368;
        var2.field1415 = Statics.field1369;
        var2.field1412 = Statics.field1367[0];
        var2.field1410 = Statics.field1371[0];
        var2.field1408 = Statics.field1372[0];
        var2.field1411 = Statics.field1374[0];
        var2.field1413 = Statics.field1370;
        var2.field1409 = Statics.field237[0];
        method2763();
        return var2;
    }

    @ObfuscatedName("bb.t(I)Lcq;")
    public static class79 method1539() {
        class79 var0 = new class79();
        var0.field1389 = Statics.field1368;
        var0.field1400 = Statics.field1369;
        var0.field1392 = Statics.field1367[0];
        var0.field1393 = Statics.field1371[0];
        var0.field1390 = Statics.field1372[0];
        var0.field1391 = Statics.field1374[0];
        int var1 = var0.field1391 * var0.field1390;
        byte[] var2 = Statics.field237[0];
        var0.field1395 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1395[var3] = Statics.field1370[var2[var3] & 0xFF];
        }
        method2763();
        return var0;
    }

    @ObfuscatedName("an.k([BB)Lhj;")
    public static class224 method1071(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class224 var1 = new class224(arg0, Statics.field1367, Statics.field1371, Statics.field1372, Statics.field1374, Statics.field1370, Statics.field237);
            method2763();
            return var1;
        }
    }

    @ObfuscatedName("aw.s(Lfa;III)Z")
    public static boolean method973(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3124(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2054(var3);
            return true;
        }
    }

    @ObfuscatedName("ed.w(Lfa;IS)Z")
    public static boolean method2968(class167 arg0, int arg1) {
        byte[] var2 = arg0.method3110(arg1);
        if (var2 == null) {
            return false;
        } else {
            method2054(var2);
            return true;
        }
    }

    @ObfuscatedName("ce.e([BI)V")
    public static void method2054(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1982 = arg0.length - 2;
        Statics.field1380 = var1.method2374();
        Statics.field1367 = new int[Statics.field1380];
        Statics.field1371 = new int[Statics.field1380];
        Statics.field1372 = new int[Statics.field1380];
        Statics.field1374 = new int[Statics.field1380];
        Statics.field237 = new byte[Statics.field1380][];
        var1.field1982 = arg0.length - 7 - Statics.field1380 * 8;
        Statics.field1368 = var1.method2374();
        Statics.field1369 = var1.method2374();
        int var2 = (var1.method2372() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1380; var3++) {
            Statics.field1367[var3] = var1.method2374();
        }
        for (int var4 = 0; var4 < Statics.field1380; var4++) {
            Statics.field1371[var4] = var1.method2374();
        }
        for (int var5 = 0; var5 < Statics.field1380; var5++) {
            Statics.field1372[var5] = var1.method2374();
        }
        for (int var6 = 0; var6 < Statics.field1380; var6++) {
            Statics.field1374[var6] = var1.method2374();
        }
        var1.field1982 = arg0.length - 7 - Statics.field1380 * 8 - (var2 - 1) * 3;
        Statics.field1370 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1370[var7] = var1.method2376();
            if (Statics.field1370[var7] == 0) {
                Statics.field1370[var7] = 1;
            }
        }
        var1.field1982 = 0;
        for (int var8 = 0; var8 < Statics.field1380; var8++) {
            int var9 = Statics.field1372[var8];
            int var10 = Statics.field1374[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field237[var8] = var12;
            int var13 = var1.method2372();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2373();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2373();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ep.z(I)V")
    public static void method2763() {
        Statics.field1367 = null;
        Statics.field1371 = null;
        Statics.field1372 = null;
        Statics.field1374 = null;
        Statics.field1370 = null;
        Statics.field237 = (byte[][]) null;
    }
}
