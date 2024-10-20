package deob;

@ObfuscatedName("bv")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.p(Ler;III)[Lbu;")
    public static class74[] method2451(class147 arg0, int arg1, int arg2) {
        return method522(arg0, arg1, arg2) ? method2475() : null;
    }

    @ObfuscatedName("ah.g(Ler;IIB)Lbu;")
    public static class74 method1069(class147 arg0, int arg1, int arg2) {
        if (!method522(arg0, arg1, arg2)) {
            return null;
        }
        class74 var3 = new class74();
        var3.field1323 = Statics.field1283;
        var3.field1330 = Statics.field1291;
        var3.field1327 = Statics.field2929[0];
        var3.field1328 = Statics.field1292[0];
        var3.field1329 = Statics.field1286[0];
        var3.field1326 = Statics.field1284[0];
        var3.field1324 = Statics.field1288;
        var3.field1325 = Statics.field1456[0];
        method864();
        return var3;
    }

    @ObfuscatedName("dy.x(Ler;III)[Lbs;")
    public static class72[] method2627(class147 arg0, int arg1, int arg2) {
        return method522(arg0, arg1, arg2) ? method482() : null;
    }

    @ObfuscatedName("ad.c(Ler;III)Lbs;")
    public static class72 method855(class147 arg0, int arg1, int arg2) {
        if (!method522(arg0, arg1, arg2)) {
            return null;
        }
        class72 var3 = new class72();
        var3.field1310 = Statics.field1283;
        var3.field1307 = Statics.field1291;
        var3.field1306 = Statics.field2929[0];
        var3.field1308 = Statics.field1292[0];
        var3.field1305 = Statics.field1286[0];
        var3.field1309 = Statics.field1284[0];
        int var4 = var3.field1309 * var3.field1305;
        byte[] var5 = Statics.field1456[0];
        var3.field1312 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1312[var6] = Statics.field1288[var5[var6] & 0xFF];
        }
        method864();
        return var3;
    }

    @ObfuscatedName("cz.n(Ler;Ljava/lang/String;Ljava/lang/String;I)[Lbu;")
    public static class74[] method2023(class147 arg0, String arg1, String arg2) {
        int var3 = arg0.method2801(arg1);
        int var4 = arg0.method2802(var3, arg2);
        return method2451(arg0, var3, var4);
    }

    @ObfuscatedName("cx.s(Ler;Ljava/lang/String;Ljava/lang/String;I)Lbu;")
    public static class74 method1939(class147 arg0, String arg1, String arg2) {
        int var3 = arg0.method2801(arg1);
        int var4 = arg0.method2802(var3, arg2);
        return method1069(arg0, var3, var4);
    }

    @ObfuscatedName("bx.r(Ler;Ljava/lang/String;Ljava/lang/String;B)[Lbs;")
    public static class72[] method1426(class147 arg0, String arg1, String arg2) {
        int var3 = arg0.method2801(arg1);
        int var4 = arg0.method2802(var3, arg2);
        return method2627(arg0, var3, var4);
    }

    @ObfuscatedName("av.w(Ler;Ler;Ljava/lang/String;Ljava/lang/String;I)Lgk;")
    public static class194 method790(class147 arg0, class147 arg1, String arg2, String arg3) {
        int var4 = arg0.method2801(arg2);
        int var5 = arg0.method2802(var4, arg3);
        class194 var6;
        if (method522(arg0, var4, var5)) {
            byte[] var7 = arg1.method2855(var4, var5);
            class194 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class194 var9 = new class194(var7, Statics.field2929, Statics.field1292, Statics.field1286, Statics.field1284, Statics.field1288, Statics.field1456);
                method864();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("az.u(Ler;II)Lbu;")
    public static class74 method733(class147 arg0, int arg1) {
        byte[] var2 = arg0.method2791(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method1392(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class74 var4 = new class74();
        var4.field1323 = Statics.field1283;
        var4.field1330 = Statics.field1291;
        var4.field1327 = Statics.field2929[0];
        var4.field1328 = Statics.field1292[0];
        var4.field1329 = Statics.field1286[0];
        var4.field1326 = Statics.field1284[0];
        var4.field1324 = Statics.field1288;
        var4.field1325 = Statics.field1456[0];
        method864();
        return var4;
    }

    @ObfuscatedName("dj.d(B)[Lbu;")
    public static class74[] method2475() {
        class74[] var0 = new class74[Statics.field1289];
        for (int var1 = 0; var1 < Statics.field1289; var1++) {
            class74 var2 = var0[var1] = new class74();
            var2.field1323 = Statics.field1283;
            var2.field1330 = Statics.field1291;
            var2.field1327 = Statics.field2929[var1];
            var2.field1328 = Statics.field1292[var1];
            var2.field1329 = Statics.field1286[var1];
            var2.field1326 = Statics.field1284[var1];
            var2.field1324 = Statics.field1288;
            var2.field1325 = Statics.field1456[var1];
        }
        method864();
        return var0;
    }

    @ObfuscatedName("client.h(I)[Lbs;")
    public static class72[] method482() {
        class72[] var0 = new class72[Statics.field1289];
        for (int var1 = 0; var1 < Statics.field1289; var1++) {
            class72 var2 = var0[var1] = new class72();
            var2.field1310 = Statics.field1283;
            var2.field1307 = Statics.field1291;
            var2.field1306 = Statics.field2929[var1];
            var2.field1308 = Statics.field1292[var1];
            var2.field1305 = Statics.field1286[var1];
            var2.field1309 = Statics.field1284[var1];
            int var3 = var2.field1309 * var2.field1305;
            byte[] var4 = Statics.field1456[var1];
            var2.field1312 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1312[var5] = Statics.field1288[var4[var5] & 0xFF];
            }
        }
        method864();
        return var0;
    }

    @ObfuscatedName("o.a(Ler;III)Z")
    public static boolean method522(class147 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2855(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1392(var3);
            return true;
        }
    }

    @ObfuscatedName("bq.y([BI)V")
    public static void method1392(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1837 = arg0.length - 2;
        Statics.field1289 = var1.method2175();
        Statics.field2929 = new int[Statics.field1289];
        Statics.field1292 = new int[Statics.field1289];
        Statics.field1286 = new int[Statics.field1289];
        Statics.field1284 = new int[Statics.field1289];
        Statics.field1456 = new byte[Statics.field1289][];
        var1.field1837 = arg0.length - 7 - Statics.field1289 * 8;
        Statics.field1283 = var1.method2175();
        Statics.field1291 = var1.method2175();
        int var2 = (var1.method2173() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1289; var3++) {
            Statics.field2929[var3] = var1.method2175();
        }
        for (int var4 = 0; var4 < Statics.field1289; var4++) {
            Statics.field1292[var4] = var1.method2175();
        }
        for (int var5 = 0; var5 < Statics.field1289; var5++) {
            Statics.field1286[var5] = var1.method2175();
        }
        for (int var6 = 0; var6 < Statics.field1289; var6++) {
            Statics.field1284[var6] = var1.method2175();
        }
        var1.field1837 = arg0.length - 7 - Statics.field1289 * 8 - (var2 - 1) * 3;
        Statics.field1288 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1288[var7] = var1.method2329();
            if (Statics.field1288[var7] == 0) {
                Statics.field1288[var7] = 1;
            }
        }
        var1.field1837 = 0;
        for (int var8 = 0; var8 < Statics.field1289; var8++) {
            int var9 = Statics.field1286[var8];
            int var10 = Statics.field1284[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1456[var8] = var12;
            int var13 = var1.method2173();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2174();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2174();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ad.v(I)V")
    public static void method864() {
        Statics.field2929 = null;
        Statics.field1292 = null;
        Statics.field1286 = null;
        Statics.field1284 = null;
        Statics.field1288 = null;
        Statics.field1456 = (byte[][]) null;
    }
}
