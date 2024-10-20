package deob;

@ObfuscatedName("bx")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.e(Les;IIS)[Lba;")
    public static class74[] method121(class146 arg0, int arg1, int arg2) {
        if (!method4(arg0, arg1, arg2)) {
            return null;
        }
        class74[] var3 = new class74[Statics.field1276];
        for (int var4 = 0; var4 < Statics.field1276; var4++) {
            class74 var5 = var3[var4] = new class74();
            var5.field1323 = Statics.field1275;
            var5.field1324 = Statics.field1285;
            var5.field1321 = Statics.field1278[var4];
            var5.field1322 = Statics.field1279[var4];
            var5.field1317 = Statics.field1280[var4];
            var5.field1319 = Statics.field1282[var4];
            var5.field1318 = Statics.field1277;
            var5.field1320 = Statics.field1283[var4];
        }
        Statics.field1278 = null;
        Statics.field1279 = null;
        Statics.field1280 = null;
        Statics.field1282 = null;
        Statics.field1277 = null;
        Statics.field1283 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("k.v(Les;IIB)Lba;")
    public static class74 method505(class146 arg0, int arg1, int arg2) {
        return method4(arg0, arg1, arg2) ? method1773() : null;
    }

    @ObfuscatedName("ay.i(Les;IIB)Lbe;")
    public static class72 method666(class146 arg0, int arg1, int arg2) {
        if (!method4(arg0, arg1, arg2)) {
            return null;
        }
        class72 var3 = new class72();
        var3.field1303 = Statics.field1275;
        var3.field1309 = Statics.field1285;
        var3.field1308 = Statics.field1278[0];
        var3.field1302 = Statics.field1279[0];
        var3.field1299 = Statics.field1280[0];
        var3.field1304 = Statics.field1282[0];
        int var4 = var3.field1304 * var3.field1299;
        byte[] var5 = Statics.field1283[0];
        var3.field1300 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1300[var6] = Statics.field1277[var5[var6] & 0xFF];
        }
        Statics.field1278 = null;
        Statics.field1279 = null;
        Statics.field1280 = null;
        Statics.field1282 = null;
        Statics.field1277 = null;
        Statics.field1283 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("av.g(Les;Ljava/lang/String;Ljava/lang/String;B)[Lba;")
    public static class74[] method517(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2710(arg1);
        int var4 = arg0.method2711(var3, arg2);
        return method121(arg0, var3, var4);
    }

    @ObfuscatedName("bh.x(Les;Ljava/lang/String;Ljava/lang/String;I)Lba;")
    public static class74 method1298(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2710(arg1);
        int var4 = arg0.method2711(var3, arg2);
        return method505(arg0, var3, var4);
    }

    @ObfuscatedName("client.b(Les;Ljava/lang/String;Ljava/lang/String;I)[Lbe;")
    public static class72[] method455(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2710(arg1);
        int var4 = arg0.method2711(var3, arg2);
        class72[] var5;
        if (method4(arg0, var3, var4)) {
            var5 = method2413();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ay.q(Les;Les;Ljava/lang/String;Ljava/lang/String;I)Lgy;")
    public static class193 method674(class146 arg0, class146 arg1, String arg2, String arg3) {
        int var4 = arg0.method2710(arg2);
        int var5 = arg0.method2711(var4, arg3);
        class193 var6;
        if (method4(arg0, var4, var5)) {
            byte[] var7 = arg1.method2695(var4, var5);
            class193 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class193 var9 = new class193(var7, Statics.field1278, Statics.field1279, Statics.field1280, Statics.field1282, Statics.field1277, Statics.field1283);
                Statics.field1278 = null;
                Statics.field1279 = null;
                Statics.field1280 = null;
                Statics.field1282 = null;
                Statics.field1277 = null;
                Statics.field1283 = (byte[][]) null;
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("av.l(Les;IB)Lba;")
    public static class74 method518(class146 arg0, int arg1) {
        byte[] var2 = arg0.method2745(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method465(var2);
            var3 = true;
        }
        return var3 ? method1773() : null;
    }

    @ObfuscatedName("cn.m(I)Lba;")
    public static class74 method1773() {
        class74 var0 = new class74();
        var0.field1323 = Statics.field1275;
        var0.field1324 = Statics.field1285;
        var0.field1321 = Statics.field1278[0];
        var0.field1322 = Statics.field1279[0];
        var0.field1317 = Statics.field1280[0];
        var0.field1319 = Statics.field1282[0];
        var0.field1318 = Statics.field1277;
        var0.field1320 = Statics.field1283[0];
        Statics.field1278 = null;
        Statics.field1279 = null;
        Statics.field1280 = null;
        Statics.field1282 = null;
        Statics.field1277 = null;
        Statics.field1283 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("dh.u(I)[Lbe;")
    public static class72[] method2413() {
        class72[] var0 = new class72[Statics.field1276];
        for (int var1 = 0; var1 < Statics.field1276; var1++) {
            class72 var2 = var0[var1] = new class72();
            var2.field1303 = Statics.field1275;
            var2.field1309 = Statics.field1285;
            var2.field1308 = Statics.field1278[var1];
            var2.field1302 = Statics.field1279[var1];
            var2.field1299 = Statics.field1280[var1];
            var2.field1304 = Statics.field1282[var1];
            int var3 = var2.field1304 * var2.field1299;
            byte[] var4 = Statics.field1283[var1];
            var2.field1300 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1300[var5] = Statics.field1277[var4[var5] & 0xFF];
            }
        }
        Statics.field1278 = null;
        Statics.field1279 = null;
        Statics.field1280 = null;
        Statics.field1282 = null;
        Statics.field1277 = null;
        Statics.field1283 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("e.s(Les;III)Z")
    public static boolean method4(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2695(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method465(var3);
            return true;
        }
    }

    @ObfuscatedName("c.f([BB)V")
    public static void method465(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1844 = arg0.length - 2;
        Statics.field1276 = var1.method2152();
        Statics.field1278 = new int[Statics.field1276];
        Statics.field1279 = new int[Statics.field1276];
        Statics.field1280 = new int[Statics.field1276];
        Statics.field1282 = new int[Statics.field1276];
        Statics.field1283 = new byte[Statics.field1276][];
        var1.field1844 = arg0.length - 7 - Statics.field1276 * 8;
        Statics.field1275 = var1.method2152();
        Statics.field1285 = var1.method2152();
        int var2 = (var1.method2226() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1276; var3++) {
            Statics.field1278[var3] = var1.method2152();
        }
        for (int var4 = 0; var4 < Statics.field1276; var4++) {
            Statics.field1279[var4] = var1.method2152();
        }
        for (int var5 = 0; var5 < Statics.field1276; var5++) {
            Statics.field1280[var5] = var1.method2152();
        }
        for (int var6 = 0; var6 < Statics.field1276; var6++) {
            Statics.field1282[var6] = var1.method2152();
        }
        var1.field1844 = arg0.length - 7 - Statics.field1276 * 8 - (var2 - 1) * 3;
        Statics.field1277 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1277[var7] = var1.method2112();
            if (Statics.field1277[var7] == 0) {
                Statics.field1277[var7] = 1;
            }
        }
        var1.field1844 = 0;
        for (int var8 = 0; var8 < Statics.field1276; var8++) {
            int var9 = Statics.field1280[var8];
            int var10 = Statics.field1282[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1283[var8] = var12;
            int var13 = var1.method2226();
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
}
