package deob;

@ObfuscatedName("bi")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("br.k(Lee;III)[Lby;")
    public static class74[] method1373(class146 arg0, int arg1, int arg2) {
        if (!method466(arg0, arg1, arg2)) {
            return null;
        }
        class74[] var3 = new class74[Statics.field1286];
        for (int var4 = 0; var4 < Statics.field1286; var4++) {
            class74 var5 = var3[var4] = new class74();
            var5.field1318 = Statics.field1276;
            var5.field1323 = Statics.field1277;
            var5.field1321 = Statics.field1278[var4];
            var5.field1322 = Statics.field1279[var4];
            var5.field1317 = Statics.field1280[var4];
            var5.field1320 = Statics.field1275[var4];
            var5.field1319 = Statics.field1282;
            var5.field1324 = Statics.field1283[var4];
        }
        method2513();
        return var3;
    }

    @ObfuscatedName("da.r(Lee;IIB)Lby;")
    public static class74 method2488(class146 arg0, int arg1, int arg2) {
        return method466(arg0, arg1, arg2) ? method1355() : null;
    }

    @ObfuscatedName("dl.y(Lee;III)Lbp;")
    public static class72 method2403(class146 arg0, int arg1, int arg2) {
        if (!method466(arg0, arg1, arg2)) {
            return null;
        }
        class72 var3 = new class72();
        var3.field1303 = Statics.field1276;
        var3.field1305 = Statics.field1277;
        var3.field1301 = Statics.field1278[0];
        var3.field1302 = Statics.field1279[0];
        var3.field1307 = Statics.field1280[0];
        var3.field1300 = Statics.field1275[0];
        int var4 = var3.field1307 * var3.field1300;
        byte[] var5 = Statics.field1283[0];
        var3.field1304 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1304[var6] = Statics.field1282[var5[var6] & 0xFF];
        }
        method2513();
        return var3;
    }

    @ObfuscatedName("aw.w(Lee;Ljava/lang/String;Ljava/lang/String;B)[Lby;")
    public static class74[] method566(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2738(arg1);
        int var4 = arg0.method2694(var3, arg2);
        return method1373(arg0, var3, var4);
    }

    @ObfuscatedName("aa.m(Lee;Ljava/lang/String;Ljava/lang/String;I)Lby;")
    public static class74 method519(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2738(arg1);
        int var4 = arg0.method2694(var3, arg2);
        return method2488(arg0, var3, var4);
    }

    @ObfuscatedName("ad.j(Lee;Ljava/lang/String;Ljava/lang/String;I)[Lbp;")
    public static class72[] method834(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2738(arg1);
        int var4 = arg0.method2694(var3, arg2);
        class72[] var5;
        if (method466(arg0, var3, var4)) {
            var5 = method456();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("q.g(Lee;Ljava/lang/String;Ljava/lang/String;I)Lbp;")
    public static class72 method509(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2738(arg1);
        int var4 = arg0.method2694(var3, arg2);
        return method2403(arg0, var3, var4);
    }

    @ObfuscatedName("bl.p(I)Lby;")
    public static class74 method1355() {
        class74 var0 = new class74();
        var0.field1318 = Statics.field1276;
        var0.field1323 = Statics.field1277;
        var0.field1321 = Statics.field1278[0];
        var0.field1322 = Statics.field1279[0];
        var0.field1317 = Statics.field1280[0];
        var0.field1320 = Statics.field1275[0];
        var0.field1319 = Statics.field1282;
        var0.field1324 = Statics.field1283[0];
        method2513();
        return var0;
    }

    @ObfuscatedName("i.o(I)[Lbp;")
    public static class72[] method456() {
        class72[] var0 = new class72[Statics.field1286];
        for (int var1 = 0; var1 < Statics.field1286; var1++) {
            class72 var2 = var0[var1] = new class72();
            var2.field1303 = Statics.field1276;
            var2.field1305 = Statics.field1277;
            var2.field1301 = Statics.field1278[var1];
            var2.field1302 = Statics.field1279[var1];
            var2.field1307 = Statics.field1280[var1];
            var2.field1300 = Statics.field1275[var1];
            int var3 = var2.field1307 * var2.field1300;
            byte[] var4 = Statics.field1283[var1];
            var2.field1304 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1304[var5] = Statics.field1282[var4[var5] & 0xFF];
            }
        }
        method2513();
        return var0;
    }

    @ObfuscatedName("h.b(Lee;III)Z")
    public static boolean method466(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2749(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3124(var3);
            return true;
        }
    }

    @ObfuscatedName("fn.x([BS)V")
    public static void method3124(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1863 = arg0.length - 2;
        Statics.field1286 = var1.method2232();
        Statics.field1278 = new int[Statics.field1286];
        Statics.field1279 = new int[Statics.field1286];
        Statics.field1280 = new int[Statics.field1286];
        Statics.field1275 = new int[Statics.field1286];
        Statics.field1283 = new byte[Statics.field1286][];
        var1.field1863 = arg0.length - 7 - Statics.field1286 * 8;
        Statics.field1276 = var1.method2232();
        Statics.field1277 = var1.method2232();
        int var2 = (var1.method2111() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1286; var3++) {
            Statics.field1278[var3] = var1.method2232();
        }
        for (int var4 = 0; var4 < Statics.field1286; var4++) {
            Statics.field1279[var4] = var1.method2232();
        }
        for (int var5 = 0; var5 < Statics.field1286; var5++) {
            Statics.field1280[var5] = var1.method2232();
        }
        for (int var6 = 0; var6 < Statics.field1286; var6++) {
            Statics.field1275[var6] = var1.method2232();
        }
        var1.field1863 = arg0.length - 7 - Statics.field1286 * 8 - (var2 - 1) * 3;
        Statics.field1282 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1282[var7] = var1.method2262();
            if (Statics.field1282[var7] == 0) {
                Statics.field1282[var7] = 1;
            }
        }
        var1.field1863 = 0;
        for (int var8 = 0; var8 < Statics.field1286; var8++) {
            int var9 = Statics.field1280[var8];
            int var10 = Statics.field1275[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1283[var8] = var12;
            int var13 = var1.method2111();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2112();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2112();
                    }
                }
            }
        }
    }

    @ObfuscatedName("dw.n(B)V")
    public static void method2513() {
        Statics.field1278 = null;
        Statics.field1279 = null;
        Statics.field1280 = null;
        Statics.field1275 = null;
        Statics.field1282 = null;
        Statics.field1283 = (byte[][]) null;
    }
}
