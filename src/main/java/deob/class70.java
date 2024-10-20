package deob;

@ObfuscatedName("bu")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.g(Let;III)[Lbr;")
    public static class72[] method133(class147 arg0, int arg1, int arg2) {
        if (!method2635(arg0, arg1, arg2)) {
            return null;
        }
        class72[] var3 = new class72[Statics.field1278];
        for (int var4 = 0; var4 < Statics.field1278; var4++) {
            class72 var5 = var3[var4] = new class72();
            var5.field1310 = Statics.field1279;
            var5.field1311 = Statics.field1280;
            var5.field1308 = Statics.field1281[var4];
            var5.field1309 = Statics.field1282[var4];
            var5.field1305 = Statics.field527[var4];
            var5.field1315 = Statics.field1283[var4];
            int var6 = var5.field1315 * var5.field1305;
            byte[] var7 = Statics.field1285[var4];
            var5.field1307 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1307[var8] = Statics.field1284[var7[var8] & 0xFF];
            }
        }
        Statics.field1281 = null;
        Statics.field1282 = null;
        Statics.field527 = null;
        Statics.field1283 = null;
        Statics.field1284 = null;
        Statics.field1285 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("o.s(Let;III)Lbr;")
    public static class72 method30(class147 arg0, int arg1, int arg2) {
        if (!method2635(arg0, arg1, arg2)) {
            return null;
        }
        class72 var3 = new class72();
        var3.field1310 = Statics.field1279;
        var3.field1311 = Statics.field1280;
        var3.field1308 = Statics.field1281[0];
        var3.field1309 = Statics.field1282[0];
        var3.field1305 = Statics.field527[0];
        var3.field1315 = Statics.field1283[0];
        int var4 = var3.field1315 * var3.field1305;
        byte[] var5 = Statics.field1285[0];
        var3.field1307 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1307[var6] = Statics.field1284[var5[var6] & 0xFF];
        }
        Statics.field1281 = null;
        Statics.field1282 = null;
        Statics.field527 = null;
        Statics.field1283 = null;
        Statics.field1284 = null;
        Statics.field1285 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("ev.v(Let;Ljava/lang/String;Ljava/lang/String;I)[Lbb;")
    public static class74[] method2784(class147 arg0, String arg1, String arg2) {
        int var3 = arg0.method2656(arg1);
        int var4 = arg0.method2679(var3, arg2);
        class74[] var5;
        if (method2635(arg0, var3, var4)) {
            class74[] var6 = new class74[Statics.field1278];
            for (int var7 = 0; var7 < Statics.field1278; var7++) {
                class74 var8 = var6[var7] = new class74();
                var8.field1330 = Statics.field1279;
                var8.field1328 = Statics.field1280;
                var8.field1324 = Statics.field1281[var7];
                var8.field1325 = Statics.field1282[var7];
                var8.field1326 = Statics.field527[var7];
                var8.field1327 = Statics.field1283[var7];
                var8.field1331 = Statics.field1284;
                var8.field1329 = Statics.field1285[var7];
            }
            Statics.field1281 = null;
            Statics.field1282 = null;
            Statics.field527 = null;
            Statics.field1283 = null;
            Statics.field1284 = null;
            Statics.field1285 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("x.o(Let;Ljava/lang/String;Ljava/lang/String;I)Lbb;")
    public static class74 method478(class147 arg0, String arg1, String arg2) {
        int var3 = arg0.method2656(arg1);
        int var4 = arg0.method2679(var3, arg2);
        class74 var5;
        if (method2635(arg0, var3, var4)) {
            var5 = method476();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ei.k(Let;Ljava/lang/String;Ljava/lang/String;S)[Lbr;")
    public static class72[] method2638(class147 arg0, String arg1, String arg2) {
        int var3 = arg0.method2656(arg1);
        int var4 = arg0.method2679(var3, arg2);
        return method133(arg0, var3, var4);
    }

    @ObfuscatedName("z.m(I)Lbb;")
    public static class74 method476() {
        class74 var0 = new class74();
        var0.field1330 = Statics.field1279;
        var0.field1328 = Statics.field1280;
        var0.field1324 = Statics.field1281[0];
        var0.field1325 = Statics.field1282[0];
        var0.field1326 = Statics.field527[0];
        var0.field1327 = Statics.field1283[0];
        var0.field1331 = Statics.field1284;
        var0.field1329 = Statics.field1285[0];
        Statics.field1281 = null;
        Statics.field1282 = null;
        Statics.field527 = null;
        Statics.field1283 = null;
        Statics.field1284 = null;
        Statics.field1285 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("bi.i([BB)Lgn;")
    public static class194 method1315(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class194 var1 = new class194(arg0, Statics.field1281, Statics.field1282, Statics.field527, Statics.field1283, Statics.field1284, Statics.field1285);
        Statics.field1281 = null;
        Statics.field1282 = null;
        Statics.field527 = null;
        Statics.field1283 = null;
        Statics.field1284 = null;
        Statics.field1285 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("ei.t(Let;III)Z")
    public static boolean method2635(class147 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2703(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1843(var3);
            return true;
        }
    }

    @ObfuscatedName("cl.l([BI)V")
    public static void method1843(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1851 = arg0.length - 2;
        Statics.field1278 = var1.method2094();
        Statics.field1281 = new int[Statics.field1278];
        Statics.field1282 = new int[Statics.field1278];
        Statics.field527 = new int[Statics.field1278];
        Statics.field1283 = new int[Statics.field1278];
        Statics.field1285 = new byte[Statics.field1278][];
        var1.field1851 = arg0.length - 7 - Statics.field1278 * 8;
        Statics.field1279 = var1.method2094();
        Statics.field1280 = var1.method2094();
        int var2 = (var1.method2116() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1278; var3++) {
            Statics.field1281[var3] = var1.method2094();
        }
        for (int var4 = 0; var4 < Statics.field1278; var4++) {
            Statics.field1282[var4] = var1.method2094();
        }
        for (int var5 = 0; var5 < Statics.field1278; var5++) {
            Statics.field527[var5] = var1.method2094();
        }
        for (int var6 = 0; var6 < Statics.field1278; var6++) {
            Statics.field1283[var6] = var1.method2094();
        }
        var1.field1851 = arg0.length - 7 - Statics.field1278 * 8 - (var2 - 1) * 3;
        Statics.field1284 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1284[var7] = var1.method2096();
            if (Statics.field1284[var7] == 0) {
                Statics.field1284[var7] = 1;
            }
        }
        var1.field1851 = 0;
        for (int var8 = 0; var8 < Statics.field1278; var8++) {
            int var9 = Statics.field527[var8];
            int var10 = Statics.field1283[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1285[var8] = var12;
            int var13 = var1.method2116();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2093();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2093();
                    }
                }
            }
        }
    }
}
