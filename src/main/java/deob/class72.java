package deob;

@ObfuscatedName("bz")
public class class72 {

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.n(Lfi;IIS)Lbj;")
    public static class76 method108(class158 arg0, int arg1, int arg2) {
        return method101(arg0, arg1, arg2) ? method851() : null;
    }

    @ObfuscatedName("am.g(Lfi;IIS)Lba;")
    public static class74 method646(class158 arg0, int arg1, int arg2) {
        return method101(arg0, arg1, arg2) ? method779() : null;
    }

    @ObfuscatedName("az.a(Lfi;Lfi;III)Lhv;")
    public static class215 method612(class158 arg0, class158 arg1, int arg2, int arg3) {
        return method101(arg0, arg2, arg3) ? method570(arg1.method2929(arg2, arg3)) : null;
    }

    @ObfuscatedName("cj.s(Lfi;Ljava/lang/String;Ljava/lang/String;B)Lbj;")
    public static class76 method1690(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2924(arg1);
        int var4 = arg0.method2935(var3, arg2);
        return method108(arg0, var3, var4);
    }

    @ObfuscatedName("m.j(Lfi;Ljava/lang/String;Ljava/lang/String;S)[Lba;")
    public static class74[] method25(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2924(arg1);
        int var4 = arg0.method2935(var3, arg2);
        class74[] var5;
        if (method101(arg0, var3, var4)) {
            class74[] var6 = new class74[Statics.field1339];
            for (int var7 = 0; var7 < Statics.field1339; var7++) {
                class74 var8 = var6[var7] = new class74();
                var8.field1359 = Statics.field1334;
                var8.field1365 = Statics.field1335;
                var8.field1357 = Statics.field1336[var7];
                var8.field1360 = Statics.field1333[var7];
                var8.field1358 = Statics.field1340[var7];
                var8.field1361 = Statics.field1343[var7];
                int var9 = var8.field1361 * var8.field1358;
                byte[] var10 = Statics.field1338[var7];
                var8.field1362 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1362[var11] = Statics.field1341[var10[var11] & 0xFF];
                }
            }
            method531();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("av.f(Lfi;Ljava/lang/String;Ljava/lang/String;B)Lba;")
    public static class74 method840(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2924(arg1);
        int var4 = arg0.method2935(var3, arg2);
        return method646(arg0, var3, var4);
    }

    @ObfuscatedName("l.b(Lfi;Lfi;Ljava/lang/String;Ljava/lang/String;I)Lhv;")
    public static class215 method553(class158 arg0, class158 arg1, String arg2, String arg3) {
        int var4 = arg0.method2924(arg2);
        int var5 = arg0.method2935(var4, arg3);
        class215 var6;
        if (method101(arg0, var4, var5)) {
            var6 = method570(arg1.method2929(var4, var5));
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("hb.t(B)[Lbj;")
    public static class76[] method3649() {
        class76[] var0 = new class76[Statics.field1339];
        for (int var1 = 0; var1 < Statics.field1339; var1++) {
            class76 var2 = var0[var1] = new class76();
            var2.field1381 = Statics.field1334;
            var2.field1382 = Statics.field1335;
            var2.field1376 = Statics.field1336[var1];
            var2.field1377 = Statics.field1333[var1];
            var2.field1379 = Statics.field1340[var1];
            var2.field1378 = Statics.field1343[var1];
            var2.field1380 = Statics.field1341;
            var2.field1375 = Statics.field1338[var1];
        }
        method531();
        return var0;
    }

    @ObfuscatedName("av.i(I)Lbj;")
    public static class76 method851() {
        class76 var0 = new class76();
        var0.field1381 = Statics.field1334;
        var0.field1382 = Statics.field1335;
        var0.field1376 = Statics.field1336[0];
        var0.field1377 = Statics.field1333[0];
        var0.field1379 = Statics.field1340[0];
        var0.field1378 = Statics.field1343[0];
        var0.field1380 = Statics.field1341;
        var0.field1375 = Statics.field1338[0];
        method531();
        return var0;
    }

    @ObfuscatedName("ak.c(I)Lba;")
    public static class74 method779() {
        class74 var0 = new class74();
        var0.field1359 = Statics.field1334;
        var0.field1365 = Statics.field1335;
        var0.field1357 = Statics.field1336[0];
        var0.field1360 = Statics.field1333[0];
        var0.field1358 = Statics.field1340[0];
        var0.field1361 = Statics.field1343[0];
        int var1 = var0.field1361 * var0.field1358;
        byte[] var2 = Statics.field1338[0];
        var0.field1362 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1362[var3] = Statics.field1341[var2[var3] & 0xFF];
        }
        method531();
        return var0;
    }

    @ObfuscatedName("aq.k([BI)Lhv;")
    public static class215 method570(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class215 var1 = new class215(arg0, Statics.field1336, Statics.field1333, Statics.field1340, Statics.field1343, Statics.field1341, Statics.field1338);
            method531();
            return var1;
        }
    }

    @ObfuscatedName("b.x(Lfi;III)Z")
    public static boolean method101(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2929(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method540(var3);
            return true;
        }
    }

    @ObfuscatedName("y.e(Lfi;II)Z")
    public static boolean method509(class158 arg0, int arg1) {
        byte[] var2 = arg0.method2914(arg1);
        if (var2 == null) {
            return false;
        } else {
            method540(var2);
            return true;
        }
    }

    @ObfuscatedName("w.q([BI)V")
    public static void method540(byte[] arg0) {
        class111 var1 = new class111(arg0);
        var1.field1896 = arg0.length - 2;
        Statics.field1339 = var1.method2395();
        Statics.field1336 = new int[Statics.field1339];
        Statics.field1333 = new int[Statics.field1339];
        Statics.field1340 = new int[Statics.field1339];
        Statics.field1343 = new int[Statics.field1339];
        Statics.field1338 = new byte[Statics.field1339][];
        var1.field1896 = arg0.length - 7 - Statics.field1339 * 8;
        Statics.field1334 = var1.method2395();
        Statics.field1335 = var1.method2395();
        int var2 = (var1.method2211() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1339; var3++) {
            Statics.field1336[var3] = var1.method2395();
        }
        for (int var4 = 0; var4 < Statics.field1339; var4++) {
            Statics.field1333[var4] = var1.method2395();
        }
        for (int var5 = 0; var5 < Statics.field1339; var5++) {
            Statics.field1340[var5] = var1.method2395();
        }
        for (int var6 = 0; var6 < Statics.field1339; var6++) {
            Statics.field1343[var6] = var1.method2395();
        }
        var1.field1896 = arg0.length - 7 - Statics.field1339 * 8 - (var2 - 1) * 3;
        Statics.field1341 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1341[var7] = var1.method2228();
            if (Statics.field1341[var7] == 0) {
                Statics.field1341[var7] = 1;
            }
        }
        var1.field1896 = 0;
        for (int var8 = 0; var8 < Statics.field1339; var8++) {
            int var9 = Statics.field1340[var8];
            int var10 = Statics.field1343[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1338[var8] = var12;
            int var13 = var1.method2211();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2217();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2217();
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.o(B)V")
    public static void method531() {
        Statics.field1336 = null;
        Statics.field1333 = null;
        Statics.field1340 = null;
        Statics.field1343 = null;
        Statics.field1341 = null;
        Statics.field1338 = (byte[][]) null;
    }
}
