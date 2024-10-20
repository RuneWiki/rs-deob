package deob;

@ObfuscatedName("ba")
public class class72 {

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.p(Lff;Ljava/lang/String;Ljava/lang/String;I)[Lbk;")
    public static class76[] method582(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2965(arg1);
        int var4 = arg0.method2974(var3, arg2);
        class76[] var5;
        if (method1405(arg0, var3, var4)) {
            var5 = method589();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("g.k(Lff;Ljava/lang/String;Ljava/lang/String;B)Lbk;")
    public static class76 method494(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2965(arg1);
        int var4 = arg0.method2974(var3, arg2);
        class76 var5;
        if (method1405(arg0, var3, var4)) {
            var5 = method652();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("j.e(Lff;Ljava/lang/String;Ljava/lang/String;I)[Lbr;")
    public static class74[] method520(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2965(arg1);
        int var4 = arg0.method2974(var3, arg2);
        class74[] var5;
        if (method1405(arg0, var3, var4)) {
            var5 = method1379();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("be.f(Lff;Ljava/lang/String;Ljava/lang/String;I)Lbr;")
    public static class74 method1378(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2965(arg1);
        int var4 = arg0.method2974(var3, arg2);
        class74 var5;
        if (method1405(arg0, var3, var4)) {
            class74 var6 = new class74();
            var6.field1343 = Statics.field641;
            var6.field1342 = Statics.field1322;
            var6.field1338 = Statics.field1323[0];
            var6.field1349 = Statics.field1326[0];
            var6.field1339 = Statics.field1021[0];
            var6.field1340 = Statics.field1325[0];
            int var7 = var6.field1340 * var6.field1339;
            byte[] var8 = Statics.field1944[0];
            var6.field1344 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field1344[var9] = Statics.field1869[var8[var9] & 0xFF];
            }
            method3127();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("c.w(Lff;Lff;Ljava/lang/String;Ljava/lang/String;I)Lhp;")
    public static class215 method77(class158 arg0, class158 arg1, String arg2, String arg3) {
        int var4 = arg0.method2965(arg2);
        int var5 = arg0.method2974(var4, arg3);
        class215 var6;
        if (method1405(arg0, var4, var5)) {
            byte[] var7 = arg1.method2896(var4, var5);
            class215 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class215 var9 = new class215(var7, Statics.field1323, Statics.field1326, Statics.field1021, Statics.field1325, Statics.field1869, Statics.field1944);
                method3127();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("aa.t(B)[Lbk;")
    public static class76[] method589() {
        class76[] var0 = new class76[Statics.field1330];
        for (int var1 = 0; var1 < Statics.field1330; var1++) {
            class76 var2 = var0[var1] = new class76();
            var2.field1363 = Statics.field641;
            var2.field1360 = Statics.field1322;
            var2.field1361 = Statics.field1323[var1];
            var2.field1357 = Statics.field1326[var1];
            var2.field1359 = Statics.field1021[var1];
            var2.field1362 = Statics.field1325[var1];
            var2.field1358 = Statics.field1869;
            var2.field1364 = Statics.field1944[var1];
        }
        method3127();
        return var0;
    }

    @ObfuscatedName("au.s(I)Lbk;")
    public static class76 method652() {
        class76 var0 = new class76();
        var0.field1363 = Statics.field641;
        var0.field1360 = Statics.field1322;
        var0.field1361 = Statics.field1323[0];
        var0.field1357 = Statics.field1326[0];
        var0.field1359 = Statics.field1021[0];
        var0.field1362 = Statics.field1325[0];
        var0.field1358 = Statics.field1869;
        var0.field1364 = Statics.field1944[0];
        method3127();
        return var0;
    }

    @ObfuscatedName("be.c(B)[Lbr;")
    public static class74[] method1379() {
        class74[] var0 = new class74[Statics.field1330];
        for (int var1 = 0; var1 < Statics.field1330; var1++) {
            class74 var2 = var0[var1] = new class74();
            var2.field1343 = Statics.field641;
            var2.field1342 = Statics.field1322;
            var2.field1338 = Statics.field1323[var1];
            var2.field1349 = Statics.field1326[var1];
            var2.field1339 = Statics.field1021[var1];
            var2.field1340 = Statics.field1325[var1];
            int var3 = var2.field1340 * var2.field1339;
            byte[] var4 = Statics.field1944[var1];
            var2.field1344 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1344[var5] = Statics.field1869[var4[var5] & 0xFF];
            }
        }
        method3127();
        return var0;
    }

    @ObfuscatedName("bz.d(Lff;IIB)Z")
    public static boolean method1405(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2896(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method127(var3);
            return true;
        }
    }

    @ObfuscatedName("h.v([BI)V")
    public static void method127(byte[] arg0) {
        class111 var1 = new class111(arg0);
        var1.field1885 = arg0.length - 2;
        Statics.field1330 = var1.method2177();
        Statics.field1323 = new int[Statics.field1330];
        Statics.field1326 = new int[Statics.field1330];
        Statics.field1021 = new int[Statics.field1330];
        Statics.field1325 = new int[Statics.field1330];
        Statics.field1944 = new byte[Statics.field1330][];
        var1.field1885 = arg0.length - 7 - Statics.field1330 * 8;
        Statics.field641 = var1.method2177();
        Statics.field1322 = var1.method2177();
        int var2 = (var1.method2314() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1330; var3++) {
            Statics.field1323[var3] = var1.method2177();
        }
        for (int var4 = 0; var4 < Statics.field1330; var4++) {
            Statics.field1326[var4] = var1.method2177();
        }
        for (int var5 = 0; var5 < Statics.field1330; var5++) {
            Statics.field1021[var5] = var1.method2177();
        }
        for (int var6 = 0; var6 < Statics.field1330; var6++) {
            Statics.field1325[var6] = var1.method2177();
        }
        var1.field1885 = arg0.length - 7 - Statics.field1330 * 8 - (var2 - 1) * 3;
        Statics.field1869 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1869[var7] = var1.method2179();
            if (Statics.field1869[var7] == 0) {
                Statics.field1869[var7] = 1;
            }
        }
        var1.field1885 = 0;
        for (int var8 = 0; var8 < Statics.field1330; var8++) {
            int var9 = Statics.field1021[var8];
            int var10 = Statics.field1325[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1944[var8] = var12;
            int var13 = var1.method2314();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2176();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2176();
                    }
                }
            }
        }
    }

    @ObfuscatedName("fc.m(I)V")
    public static void method3127() {
        Statics.field1323 = null;
        Statics.field1326 = null;
        Statics.field1021 = null;
        Statics.field1325 = null;
        Statics.field1869 = null;
        Statics.field1944 = (byte[][]) null;
    }
}
