package deob;

@ObfuscatedName("bc")
public class class71 {

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.g(Lei;III)Lbb;")
    public static class75 method2(class149 arg0, int arg1, int arg2) {
        return method573(arg0, arg1, arg2) ? method1320() : null;
    }

    @ObfuscatedName("eu.z(Lei;Ljava/lang/String;Ljava/lang/String;I)[Lbb;")
    public static class75[] method2638(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2723(arg1);
        int var4 = arg0.method2676(var3, arg2);
        class75[] var5;
        if (method573(arg0, var3, var4)) {
            class75[] var6 = new class75[Statics.field1290];
            for (int var7 = 0; var7 < Statics.field1290; var7++) {
                class75 var8 = var6[var7] = new class75();
                var8.field1328 = Statics.field1286;
                var8.field1327 = Statics.field1287;
                var8.field1325 = Statics.field1288[var7];
                var8.field1326 = Statics.field1289[var7];
                var8.field1323 = Statics.field3011[var7];
                var8.field1324 = Statics.field1280[var7];
                var8.field1322 = Statics.field1293;
                var8.field1321 = Statics.field231[var7];
            }
            Statics.field1288 = null;
            Statics.field1289 = null;
            Statics.field3011 = null;
            Statics.field1280 = null;
            Statics.field1293 = null;
            Statics.field231 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("s.b(Lei;Ljava/lang/String;Ljava/lang/String;I)Lbb;")
    public static class75 method151(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2723(arg1);
        int var4 = arg0.method2676(var3, arg2);
        return method2(arg0, var3, var4);
    }

    @ObfuscatedName("j.k(Lei;Ljava/lang/String;Ljava/lang/String;B)[Lbw;")
    public static class73[] method6(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2723(arg1);
        int var4 = arg0.method2676(var3, arg2);
        class73[] var5;
        if (method573(arg0, var3, var4)) {
            var5 = method2908();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bs.c(Lei;Ljava/lang/String;Ljava/lang/String;B)Lbw;")
    public static class73 method1025(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2723(arg1);
        int var4 = arg0.method2676(var3, arg2);
        class73 var5;
        if (method573(arg0, var3, var4)) {
            var5 = method2653();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("cw.w(Lei;Lei;Ljava/lang/String;Ljava/lang/String;I)Lgu;")
    public static class205 method1743(class149 arg0, class149 arg1, String arg2, String arg3) {
        int var4 = arg0.method2723(arg2);
        int var5 = arg0.method2676(var4, arg3);
        return Statics.method2843(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("bn.l(B)Lbb;")
    public static class75 method1320() {
        class75 var0 = new class75();
        var0.field1328 = Statics.field1286;
        var0.field1327 = Statics.field1287;
        var0.field1325 = Statics.field1288[0];
        var0.field1326 = Statics.field1289[0];
        var0.field1323 = Statics.field3011[0];
        var0.field1324 = Statics.field1280[0];
        var0.field1322 = Statics.field1293;
        var0.field1321 = Statics.field231[0];
        Statics.field1288 = null;
        Statics.field1289 = null;
        Statics.field3011 = null;
        Statics.field1280 = null;
        Statics.field1293 = null;
        Statics.field231 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("fo.n(I)[Lbw;")
    public static class73[] method2908() {
        class73[] var0 = new class73[Statics.field1290];
        for (int var1 = 0; var1 < Statics.field1290; var1++) {
            class73 var2 = var0[var1] = new class73();
            var2.field1307 = Statics.field1286;
            var2.field1308 = Statics.field1287;
            var2.field1305 = Statics.field1288[var1];
            var2.field1309 = Statics.field1289[var1];
            var2.field1303 = Statics.field3011[var1];
            var2.field1302 = Statics.field1280[var1];
            int var3 = var2.field1303 * var2.field1302;
            byte[] var4 = Statics.field231[var1];
            var2.field1304 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1304[var5] = Statics.field1293[var4[var5] & 0xFF];
            }
        }
        Statics.field1288 = null;
        Statics.field1289 = null;
        Statics.field3011 = null;
        Statics.field1280 = null;
        Statics.field1293 = null;
        Statics.field231 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ej.d(B)Lbw;")
    public static class73 method2653() {
        class73 var0 = new class73();
        var0.field1307 = Statics.field1286;
        var0.field1308 = Statics.field1287;
        var0.field1305 = Statics.field1288[0];
        var0.field1309 = Statics.field1289[0];
        var0.field1303 = Statics.field3011[0];
        var0.field1302 = Statics.field1280[0];
        int var1 = var0.field1303 * var0.field1302;
        byte[] var2 = Statics.field231[0];
        var0.field1304 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1304[var3] = Statics.field1293[var2[var3] & 0xFF];
        }
        Statics.field1288 = null;
        Statics.field1289 = null;
        Statics.field3011 = null;
        Statics.field1280 = null;
        Statics.field1293 = null;
        Statics.field231 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ej.h([BI)Lgu;")
    public static class205 method2654(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class205 var1 = new class205(arg0, Statics.field1288, Statics.field1289, Statics.field3011, Statics.field1280, Statics.field1293, Statics.field231);
        Statics.field1288 = null;
        Statics.field1289 = null;
        Statics.field3011 = null;
        Statics.field1280 = null;
        Statics.field1293 = null;
        Statics.field231 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("as.y(Lei;III)Z")
    public static boolean method573(class149 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2660(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method739(var3);
            return true;
        }
    }

    @ObfuscatedName("aa.p([BI)V")
    public static void method739(byte[] arg0) {
        class108 var1 = new class108(arg0);
        var1.field1824 = arg0.length - 2;
        Statics.field1290 = var1.method2263();
        Statics.field1288 = new int[Statics.field1290];
        Statics.field1289 = new int[Statics.field1290];
        Statics.field3011 = new int[Statics.field1290];
        Statics.field1280 = new int[Statics.field1290];
        Statics.field231 = new byte[Statics.field1290][];
        var1.field1824 = arg0.length - 7 - Statics.field1290 * 8;
        Statics.field1286 = var1.method2263();
        Statics.field1287 = var1.method2263();
        int var2 = (var1.method2083() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1290; var3++) {
            Statics.field1288[var3] = var1.method2263();
        }
        for (int var4 = 0; var4 < Statics.field1290; var4++) {
            Statics.field1289[var4] = var1.method2263();
        }
        for (int var5 = 0; var5 < Statics.field1290; var5++) {
            Statics.field3011[var5] = var1.method2263();
        }
        for (int var6 = 0; var6 < Statics.field1290; var6++) {
            Statics.field1280[var6] = var1.method2263();
        }
        var1.field1824 = arg0.length - 7 - Statics.field1290 * 8 - (var2 - 1) * 3;
        Statics.field1293 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1293[var7] = var1.method2260();
            if (Statics.field1293[var7] == 0) {
                Statics.field1293[var7] = 1;
            }
        }
        var1.field1824 = 0;
        for (int var8 = 0; var8 < Statics.field1290; var8++) {
            int var9 = Statics.field3011[var8];
            int var10 = Statics.field1280[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field231[var8] = var12;
            int var13 = var1.method2083();
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
}
