package deob;

@ObfuscatedName("bu")
public class class72 {

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.y(Lfd;III)[Lbz;")
    public static class76[] method143(class158 arg0, int arg1, int arg2) {
        if (!Statics.method655(arg0, arg1, arg2)) {
            return null;
        }
        class76[] var3 = new class76[Statics.field1318];
        for (int var4 = 0; var4 < Statics.field1318; var4++) {
            class76 var5 = var3[var4] = new class76();
            var5.field1349 = Statics.field1317;
            var5.field1346 = Statics.field1312;
            var5.field1350 = Statics.field1313[var4];
            var5.field1352 = Statics.field1311[var4];
            var5.field1348 = Statics.field3053[var4];
            var5.field1351 = Statics.field1323[var4];
            var5.field1347 = Statics.field578;
            var5.field1353 = Statics.field3116[var4];
        }
        method2414();
        return var3;
    }

    @ObfuscatedName("p.k(Lfd;III)Lbz;")
    public static class76 method527(class158 arg0, int arg1, int arg2) {
        if (!Statics.method655(arg0, arg1, arg2)) {
            return null;
        }
        class76 var3 = new class76();
        var3.field1349 = Statics.field1317;
        var3.field1346 = Statics.field1312;
        var3.field1350 = Statics.field1313[0];
        var3.field1352 = Statics.field1311[0];
        var3.field1348 = Statics.field3053[0];
        var3.field1351 = Statics.field1323[0];
        var3.field1347 = Statics.field578;
        var3.field1353 = Statics.field3116[0];
        method2414();
        return var3;
    }

    @ObfuscatedName("i.g(Lfd;Ljava/lang/String;Ljava/lang/String;S)[Lbz;")
    public static class76[] method127(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2888(arg1);
        int var4 = arg0.method2889(var3, arg2);
        return method143(arg0, var3, var4);
    }

    @ObfuscatedName("r.t(Lfd;Ljava/lang/String;Ljava/lang/String;I)[Lbb;")
    public static class74[] method156(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2888(arg1);
        int var4 = arg0.method2889(var3, arg2);
        class74[] var5;
        if (Statics.method655(arg0, var3, var4)) {
            class74[] var6 = new class74[Statics.field1318];
            for (int var7 = 0; var7 < Statics.field1318; var7++) {
                class74 var8 = var6[var7] = new class74();
                var8.field1327 = Statics.field1317;
                var8.field1335 = Statics.field1312;
                var8.field1333 = Statics.field1313[var7];
                var8.field1331 = Statics.field1311[var7];
                var8.field1328 = Statics.field3053[var7];
                var8.field1329 = Statics.field1323[var7];
                int var9 = var8.field1329 * var8.field1328;
                byte[] var10 = Statics.field3116[var7];
                var8.field1332 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1332[var11] = Statics.field578[var10[var11] & 0xFF];
                }
            }
            method2414();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("cm.e(B)Lbb;")
    public static class74 method1882() {
        class74 var0 = new class74();
        var0.field1327 = Statics.field1317;
        var0.field1335 = Statics.field1312;
        var0.field1333 = Statics.field1313[0];
        var0.field1331 = Statics.field1311[0];
        var0.field1328 = Statics.field3053[0];
        var0.field1329 = Statics.field1323[0];
        int var1 = var0.field1329 * var0.field1328;
        byte[] var2 = Statics.field3116[0];
        var0.field1332 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1332[var3] = Statics.field578[var2[var3] & 0xFF];
        }
        method2414();
        return var0;
    }

    @ObfuscatedName("cd.z([BI)V")
    public static void method1801(byte[] arg0) {
        class111 var1 = new class111(arg0);
        var1.field1902 = arg0.length - 2;
        Statics.field1318 = var1.method2339();
        Statics.field1313 = new int[Statics.field1318];
        Statics.field1311 = new int[Statics.field1318];
        Statics.field3053 = new int[Statics.field1318];
        Statics.field1323 = new int[Statics.field1318];
        Statics.field3116 = new byte[Statics.field1318][];
        var1.field1902 = arg0.length - 7 - Statics.field1318 * 8;
        Statics.field1317 = var1.method2339();
        Statics.field1312 = var1.method2339();
        int var2 = (var1.method2205() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1318; var3++) {
            Statics.field1313[var3] = var1.method2339();
        }
        for (int var4 = 0; var4 < Statics.field1318; var4++) {
            Statics.field1311[var4] = var1.method2339();
        }
        for (int var5 = 0; var5 < Statics.field1318; var5++) {
            Statics.field3053[var5] = var1.method2339();
        }
        for (int var6 = 0; var6 < Statics.field1318; var6++) {
            Statics.field1323[var6] = var1.method2339();
        }
        var1.field1902 = arg0.length - 7 - Statics.field1318 * 8 - (var2 - 1) * 3;
        Statics.field578 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field578[var7] = var1.method2164();
            if (Statics.field578[var7] == 0) {
                Statics.field578[var7] = 1;
            }
        }
        var1.field1902 = 0;
        for (int var8 = 0; var8 < Statics.field1318; var8++) {
            int var9 = Statics.field3053[var8];
            int var10 = Statics.field1323[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3116[var8] = var12;
            int var13 = var1.method2205();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2199();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2199();
                    }
                }
            }
        }
    }

    @ObfuscatedName("de.v(I)V")
    public static void method2414() {
        Statics.field1313 = null;
        Statics.field1311 = null;
        Statics.field3053 = null;
        Statics.field1323 = null;
        Statics.field578 = null;
        Statics.field3116 = (byte[][]) null;
    }
}
