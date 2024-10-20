package deob;

@ObfuscatedName("bo")
public class class72 {

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.q(Lff;III)[Lbm;")
    public static class76[] method156(class158 arg0, int arg1, int arg2) {
        return method3222(arg0, arg1, arg2) ? method1878() : null;
    }

    @ObfuscatedName("client.s(Lff;III)[Lbr;")
    public static class74[] method470(class158 arg0, int arg1, int arg2) {
        if (!method3222(arg0, arg1, arg2)) {
            return null;
        }
        class74[] var3 = new class74[Statics.field1287];
        for (int var4 = 0; var4 < Statics.field1287; var4++) {
            class74 var5 = var3[var4] = new class74();
            var5.field1308 = Statics.field1289;
            var5.field1302 = Statics.field3015;
            var5.field1305 = Statics.field1288[var4];
            var5.field1307 = Statics.field1290[var4];
            var5.field1303 = Statics.field1352[var4];
            var5.field1304 = Statics.field3017[var4];
            int var6 = var5.field1304 * var5.field1303;
            byte[] var7 = Statics.field209[var4];
            var5.field1313 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1313[var8] = Statics.field1286[var7[var8] & 0xFF];
            }
        }
        method513();
        return var3;
    }

    @ObfuscatedName("dg.h(Lff;III)Lbr;")
    public static class74 method2402(class158 arg0, int arg1, int arg2) {
        if (!method3222(arg0, arg1, arg2)) {
            return null;
        }
        class74 var3 = new class74();
        var3.field1308 = Statics.field1289;
        var3.field1302 = Statics.field3015;
        var3.field1305 = Statics.field1288[0];
        var3.field1307 = Statics.field1290[0];
        var3.field1303 = Statics.field1352[0];
        var3.field1304 = Statics.field3017[0];
        int var4 = var3.field1304 * var3.field1303;
        byte[] var5 = Statics.field209[0];
        var3.field1313 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1313[var6] = Statics.field1286[var5[var6] & 0xFF];
        }
        method513();
        return var3;
    }

    @ObfuscatedName("h.e(Lff;Ljava/lang/String;Ljava/lang/String;B)[Lbm;")
    public static class76[] method12(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2813(arg1);
        int var4 = arg0.method2814(var3, arg2);
        return method156(arg0, var3, var4);
    }

    @ObfuscatedName("u.n(Lff;Ljava/lang/String;Ljava/lang/String;I)Lbm;")
    public static class76 method135(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2813(arg1);
        int var4 = arg0.method2814(var3, arg2);
        class76 var5;
        if (method3222(arg0, var3, var4)) {
            var5 = Statics.method1786();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ac.t(Lff;Ljava/lang/String;Ljava/lang/String;I)[Lbr;")
    public static class74[] method602(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2813(arg1);
        int var4 = arg0.method2814(var3, arg2);
        return method470(arg0, var3, var4);
    }

    @ObfuscatedName("j.l(Lff;Ljava/lang/String;Ljava/lang/String;B)Lbr;")
    public static class74 method163(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2813(arg1);
        int var4 = arg0.method2814(var3, arg2);
        return method2402(arg0, var3, var4);
    }

    @ObfuscatedName("cm.o(I)[Lbm;")
    public static class76[] method1878() {
        class76[] var0 = new class76[Statics.field1287];
        for (int var1 = 0; var1 < Statics.field1287; var1++) {
            class76 var2 = var0[var1] = new class76();
            var2.field1327 = Statics.field1289;
            var2.field1324 = Statics.field3015;
            var2.field1325 = Statics.field1288[var1];
            var2.field1326 = Statics.field1290[var1];
            var2.field1323 = Statics.field1352[var1];
            var2.field1321 = Statics.field3017[var1];
            var2.field1322 = Statics.field1286;
            var2.field1328 = Statics.field209[var1];
        }
        method513();
        return var0;
    }

    @ObfuscatedName("fg.p([BI)Lhz;")
    public static class214 method2908(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class214 var1 = new class214(arg0, Statics.field1288, Statics.field1290, Statics.field1352, Statics.field3017, Statics.field1286, Statics.field209);
            method513();
            return var1;
        }
    }

    @ObfuscatedName("fc.u(Lff;III)Z")
    public static boolean method3222(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2811(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2414(var3);
            return true;
        }
    }

    @ObfuscatedName("dm.g([BB)V")
    public static void method2414(byte[] arg0) {
        class111 var1 = new class111(arg0);
        var1.field1852 = arg0.length - 2;
        Statics.field1287 = var1.method2307();
        Statics.field1288 = new int[Statics.field1287];
        Statics.field1290 = new int[Statics.field1287];
        Statics.field1352 = new int[Statics.field1287];
        Statics.field3017 = new int[Statics.field1287];
        Statics.field209 = new byte[Statics.field1287][];
        var1.field1852 = arg0.length - 7 - Statics.field1287 * 8;
        Statics.field1289 = var1.method2307();
        Statics.field3015 = var1.method2307();
        int var2 = (var1.method2231() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1287; var3++) {
            Statics.field1288[var3] = var1.method2307();
        }
        for (int var4 = 0; var4 < Statics.field1287; var4++) {
            Statics.field1290[var4] = var1.method2307();
        }
        for (int var5 = 0; var5 < Statics.field1287; var5++) {
            Statics.field1352[var5] = var1.method2307();
        }
        for (int var6 = 0; var6 < Statics.field1287; var6++) {
            Statics.field3017[var6] = var1.method2307();
        }
        var1.field1852 = arg0.length - 7 - Statics.field1287 * 8 - (var2 - 1) * 3;
        Statics.field1286 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1286[var7] = var1.method2150();
            if (Statics.field1286[var7] == 0) {
                Statics.field1286[var7] = 1;
            }
        }
        var1.field1852 = 0;
        for (int var8 = 0; var8 < Statics.field1287; var8++) {
            int var9 = Statics.field1352[var8];
            int var10 = Statics.field3017[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field209[var8] = var12;
            int var13 = var1.method2231();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2149();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2149();
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.a(B)V")
    public static void method513() {
        Statics.field1288 = null;
        Statics.field1290 = null;
        Statics.field1352 = null;
        Statics.field3017 = null;
        Statics.field1286 = null;
        Statics.field209 = (byte[][]) null;
    }
}
