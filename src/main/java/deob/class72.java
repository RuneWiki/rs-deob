package deob;

@ObfuscatedName("bx")
public class class72 {

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.n(Lfd;III)Lbk;")
    public static class76 method604(class158 arg0, int arg1, int arg2) {
        if (!method97(arg0, arg1, arg2)) {
            return null;
        }
        class76 var3 = new class76();
        var3.field1353 = Statics.field1316;
        var3.field1354 = Statics.field1313;
        var3.field1350 = Statics.field1314[0];
        var3.field1349 = Statics.field724[0];
        var3.field1351 = Statics.field1868[0];
        var3.field1352 = Statics.field1944[0];
        var3.field1348 = Statics.field1315;
        var3.field1347 = Statics.field1311[0];
        method1618();
        return var3;
    }

    @ObfuscatedName("cr.w(Lfd;III)[Lbl;")
    public static class74[] method1988(class158 arg0, int arg1, int arg2) {
        if (!method97(arg0, arg1, arg2)) {
            return null;
        }
        class74[] var3 = new class74[Statics.field1318];
        for (int var4 = 0; var4 < Statics.field1318; var4++) {
            class74 var5 = var3[var4] = new class74();
            var5.field1333 = Statics.field1316;
            var5.field1334 = Statics.field1313;
            var5.field1329 = Statics.field1314[var4];
            var5.field1338 = Statics.field724[var4];
            var5.field1331 = Statics.field1868[var4];
            var5.field1330 = Statics.field1944[var4];
            int var6 = var5.field1331 * var5.field1330;
            byte[] var7 = Statics.field1311[var4];
            var5.field1337 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1337[var8] = Statics.field1315[var7[var8] & 0xFF];
            }
        }
        method1618();
        return var3;
    }

    @ObfuscatedName("ad.i(Lfd;IIB)Lbl;")
    public static class74 method602(class158 arg0, int arg1, int arg2) {
        return method97(arg0, arg1, arg2) ? method559() : null;
    }

    @ObfuscatedName("bv.e(Lfd;Lfd;IIS)Lhg;")
    public static class215 method1402(class158 arg0, class158 arg1, int arg2, int arg3) {
        if (!method97(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method2859(arg2, arg3);
        class215 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class215 var6 = new class215(var4, Statics.field1314, Statics.field724, Statics.field1868, Statics.field1944, Statics.field1315, Statics.field1311);
            method1618();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("i.h(Lfd;Ljava/lang/String;Ljava/lang/String;B)[Lbk;")
    public static class76[] method23(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2925(arg1);
        int var4 = arg0.method2864(var3, arg2);
        class76[] var5;
        if (method97(arg0, var3, var4)) {
            class76[] var6 = new class76[Statics.field1318];
            for (int var7 = 0; var7 < Statics.field1318; var7++) {
                class76 var8 = var6[var7] = new class76();
                var8.field1353 = Statics.field1316;
                var8.field1354 = Statics.field1313;
                var8.field1350 = Statics.field1314[var7];
                var8.field1349 = Statics.field724[var7];
                var8.field1351 = Statics.field1868[var7];
                var8.field1352 = Statics.field1944[var7];
                var8.field1348 = Statics.field1315;
                var8.field1347 = Statics.field1311[var7];
            }
            method1618();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("di.q(Lfd;Ljava/lang/String;Ljava/lang/String;S)Lbk;")
    public static class76 method2092(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2925(arg1);
        int var4 = arg0.method2864(var3, arg2);
        return method604(arg0, var3, var4);
    }

    @ObfuscatedName("bx.l(Lfd;Ljava/lang/String;Ljava/lang/String;I)[Lbl;")
    public static class74[] method1443(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2925(arg1);
        int var4 = arg0.method2864(var3, arg2);
        return method1988(arg0, var3, var4);
    }

    @ObfuscatedName("cr.c(Lfd;Ljava/lang/String;Ljava/lang/String;S)Lbl;")
    public static class74 method1989(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2925(arg1);
        int var4 = arg0.method2864(var3, arg2);
        return method602(arg0, var3, var4);
    }

    @ObfuscatedName("dd.f(Lfd;Lfd;Ljava/lang/String;Ljava/lang/String;I)Lhg;")
    public static class215 method2087(class158 arg0, class158 arg1, String arg2, String arg3) {
        int var4 = arg0.method2925(arg2);
        int var5 = arg0.method2864(var4, arg3);
        return method1402(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("ah.s(Lfd;II)Lbk;")
    public static class76 method693(class158 arg0, int arg1) {
        if (!method1359(arg0, arg1)) {
            return null;
        }
        class76 var2 = new class76();
        var2.field1353 = Statics.field1316;
        var2.field1354 = Statics.field1313;
        var2.field1350 = Statics.field1314[0];
        var2.field1349 = Statics.field724[0];
        var2.field1351 = Statics.field1868[0];
        var2.field1352 = Statics.field1944[0];
        var2.field1348 = Statics.field1315;
        var2.field1347 = Statics.field1311[0];
        method1618();
        return var2;
    }

    @ObfuscatedName("r.m(B)Lbl;")
    public static class74 method559() {
        class74 var0 = new class74();
        var0.field1333 = Statics.field1316;
        var0.field1334 = Statics.field1313;
        var0.field1329 = Statics.field1314[0];
        var0.field1338 = Statics.field724[0];
        var0.field1331 = Statics.field1868[0];
        var0.field1330 = Statics.field1944[0];
        int var1 = var0.field1331 * var0.field1330;
        byte[] var2 = Statics.field1311[0];
        var0.field1337 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1337[var3] = Statics.field1315[var2[var3] & 0xFF];
        }
        method1618();
        return var0;
    }

    @ObfuscatedName("f.y(Lfd;IIB)Z")
    public static boolean method97(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2859(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3292(var3);
            return true;
        }
    }

    @ObfuscatedName("bo.b(Lfd;II)Z")
    public static boolean method1359(class158 arg0, int arg1) {
        byte[] var2 = arg0.method2863(arg1);
        if (var2 == null) {
            return false;
        } else {
            method3292(var2);
            return true;
        }
    }

    @ObfuscatedName("fx.v([BB)V")
    public static void method3292(byte[] arg0) {
        class111 var1 = new class111(arg0);
        var1.field1888 = arg0.length - 2;
        Statics.field1318 = var1.method2157();
        Statics.field1314 = new int[Statics.field1318];
        Statics.field724 = new int[Statics.field1318];
        Statics.field1868 = new int[Statics.field1318];
        Statics.field1944 = new int[Statics.field1318];
        Statics.field1311 = new byte[Statics.field1318][];
        var1.field1888 = arg0.length - 7 - Statics.field1318 * 8;
        Statics.field1316 = var1.method2157();
        Statics.field1313 = var1.method2157();
        int var2 = (var1.method2155() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1318; var3++) {
            Statics.field1314[var3] = var1.method2157();
        }
        for (int var4 = 0; var4 < Statics.field1318; var4++) {
            Statics.field724[var4] = var1.method2157();
        }
        for (int var5 = 0; var5 < Statics.field1318; var5++) {
            Statics.field1868[var5] = var1.method2157();
        }
        for (int var6 = 0; var6 < Statics.field1318; var6++) {
            Statics.field1944[var6] = var1.method2157();
        }
        var1.field1888 = arg0.length - 7 - Statics.field1318 * 8 - (var2 - 1) * 3;
        Statics.field1315 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1315[var7] = var1.method2315();
            if (Statics.field1315[var7] == 0) {
                Statics.field1315[var7] = 1;
            }
        }
        var1.field1888 = 0;
        for (int var8 = 0; var8 < Statics.field1318; var8++) {
            int var9 = Statics.field1868[var8];
            int var10 = Statics.field1944[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1311[var8] = var12;
            int var13 = var1.method2155();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2173();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2173();
                    }
                }
            }
        }
    }

    @ObfuscatedName("cd.z(I)V")
    public static void method1618() {
        Statics.field1314 = null;
        Statics.field724 = null;
        Statics.field1868 = null;
        Statics.field1944 = null;
        Statics.field1315 = null;
        Statics.field1311 = (byte[][]) null;
    }
}
