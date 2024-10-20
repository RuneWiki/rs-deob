package deob;

@ObfuscatedName("bt")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bj.e(Lft;III)[Lcz;")
    public static class81[] method1044(class168 arg0, int arg1, int arg2) {
        return Statics.method579(arg0, arg1, arg2) ? method2750() : null;
    }

    @ObfuscatedName("g.w(Lft;III)Lcz;")
    public static class81 method99(class168 arg0, int arg1, int arg2) {
        if (!Statics.method579(arg0, arg1, arg2)) {
            return null;
        }
        class81 var3 = new class81();
        var3.field1396 = Statics.field1357;
        var3.field1393 = Statics.field1355;
        var3.field1394 = Statics.field1358[0];
        var3.field1395 = Statics.field1438[0];
        var3.field1391 = Statics.field87[0];
        var3.field1392 = Statics.field1356[0];
        var3.field1397 = Statics.field3153;
        var3.field1390 = Statics.field1353[0];
        method655();
        return var3;
    }

    @ObfuscatedName("ai.f(Lft;III)[Lcb;")
    public static class79[] method645(class168 arg0, int arg1, int arg2) {
        return Statics.method579(arg0, arg1, arg2) ? method647() : null;
    }

    @ObfuscatedName("dt.s(Lft;III)Lcb;")
    public static class79 method2298(class168 arg0, int arg1, int arg2) {
        return Statics.method579(arg0, arg1, arg2) ? method829() : null;
    }

    @ObfuscatedName("bx.p(Lft;Lft;III)Lhu;")
    public static class225 method1570(class168 arg0, class168 arg1, int arg2, int arg3) {
        return Statics.method579(arg0, arg2, arg3) ? method577(arg1.method3048(arg2, arg3)) : null;
    }

    @ObfuscatedName("er.h(Lft;Ljava/lang/String;Ljava/lang/String;B)[Lcz;")
    public static class81[] method2675(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3023(arg1);
        int var4 = arg0.method3039(var3, arg2);
        return method1044(arg0, var3, var4);
    }

    @ObfuscatedName("o.g(Lft;Ljava/lang/String;Ljava/lang/String;I)Lcz;")
    public static class81 method171(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3023(arg1);
        int var4 = arg0.method3039(var3, arg2);
        return method99(arg0, var3, var4);
    }

    @ObfuscatedName("dm.a(Lft;Ljava/lang/String;Ljava/lang/String;I)[Lcb;")
    public static class79[] method2606(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3023(arg1);
        int var4 = arg0.method3039(var3, arg2);
        return method645(arg0, var3, var4);
    }

    @ObfuscatedName("fv.r(Lft;Ljava/lang/String;Ljava/lang/String;I)Lcb;")
    public static class79 method3184(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3023(arg1);
        int var4 = arg0.method3039(var3, arg2);
        return method2298(arg0, var3, var4);
    }

    @ObfuscatedName("ex.k(I)[Lcz;")
    public static class81[] method2750() {
        class81[] var0 = new class81[Statics.field1360];
        for (int var1 = 0; var1 < Statics.field1360; var1++) {
            class81 var2 = var0[var1] = new class81();
            var2.field1396 = Statics.field1357;
            var2.field1393 = Statics.field1355;
            var2.field1394 = Statics.field1358[var1];
            var2.field1395 = Statics.field1438[var1];
            var2.field1391 = Statics.field87[var1];
            var2.field1392 = Statics.field1356[var1];
            var2.field1397 = Statics.field3153;
            var2.field1390 = Statics.field1353[var1];
        }
        method655();
        return var0;
    }

    @ObfuscatedName("ai.m(I)[Lcb;")
    public static class79[] method647() {
        class79[] var0 = new class79[Statics.field1360];
        for (int var1 = 0; var1 < Statics.field1360; var1++) {
            class79 var2 = var0[var1] = new class79();
            var2.field1373 = Statics.field1357;
            var2.field1377 = Statics.field1355;
            var2.field1374 = Statics.field1358[var1];
            var2.field1375 = Statics.field1438[var1];
            var2.field1372 = Statics.field87[var1];
            var2.field1379 = Statics.field1356[var1];
            int var3 = var2.field1379 * var2.field1372;
            byte[] var4 = Statics.field1353[var1];
            var2.field1380 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1380[var5] = Statics.field3153[var4[var5] & 0xFF];
            }
        }
        method655();
        return var0;
    }

    @ObfuscatedName("ad.n(I)Lcb;")
    public static class79 method829() {
        class79 var0 = new class79();
        var0.field1373 = Statics.field1357;
        var0.field1377 = Statics.field1355;
        var0.field1374 = Statics.field1358[0];
        var0.field1375 = Statics.field1438[0];
        var0.field1372 = Statics.field87[0];
        var0.field1379 = Statics.field1356[0];
        int var1 = var0.field1379 * var0.field1372;
        byte[] var2 = Statics.field1353[0];
        var0.field1380 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1380[var3] = Statics.field3153[var2[var3] & 0xFF];
        }
        method655();
        return var0;
    }

    @ObfuscatedName("t.y([BI)Lhu;")
    public static class225 method577(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class225 var1 = new class225(arg0, Statics.field1358, Statics.field1438, Statics.field87, Statics.field1356, Statics.field3153, Statics.field1353);
            method655();
            return var1;
        }
    }

    @ObfuscatedName("ds.j([BI)V")
    public static void method2579(byte[] arg0) {
        class120 var1 = new class120(arg0);
        var1.field1977 = arg0.length - 2;
        Statics.field1360 = var1.method2532();
        Statics.field1358 = new int[Statics.field1360];
        Statics.field1438 = new int[Statics.field1360];
        Statics.field87 = new int[Statics.field1360];
        Statics.field1356 = new int[Statics.field1360];
        Statics.field1353 = new byte[Statics.field1360][];
        var1.field1977 = arg0.length - 7 - Statics.field1360 * 8;
        Statics.field1357 = var1.method2532();
        Statics.field1355 = var1.method2532();
        int var2 = (var1.method2355() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1360; var3++) {
            Statics.field1358[var3] = var1.method2532();
        }
        for (int var4 = 0; var4 < Statics.field1360; var4++) {
            Statics.field1438[var4] = var1.method2532();
        }
        for (int var5 = 0; var5 < Statics.field1360; var5++) {
            Statics.field87[var5] = var1.method2532();
        }
        for (int var6 = 0; var6 < Statics.field1360; var6++) {
            Statics.field1356[var6] = var1.method2532();
        }
        var1.field1977 = arg0.length - 7 - Statics.field1360 * 8 - (var2 - 1) * 3;
        Statics.field3153 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3153[var7] = var1.method2359();
            if (Statics.field3153[var7] == 0) {
                Statics.field3153[var7] = 1;
            }
        }
        var1.field1977 = 0;
        for (int var8 = 0; var8 < Statics.field1360; var8++) {
            int var9 = Statics.field87[var8];
            int var10 = Statics.field1356[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1353[var8] = var12;
            int var13 = var1.method2355();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2465();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2465();
                    }
                }
            }
        }
    }

    @ObfuscatedName("az.l(I)V")
    public static void method655() {
        Statics.field1358 = null;
        Statics.field1438 = null;
        Statics.field87 = null;
        Statics.field1356 = null;
        Statics.field3153 = null;
        Statics.field1353 = (byte[][]) null;
    }
}
