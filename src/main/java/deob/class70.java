package deob;

@ObfuscatedName("bv")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.k(Ley;IIB)Lbu;")
    public static class74 method562(class146 arg0, int arg1, int arg2) {
        return method3142(arg0, arg1, arg2) ? method171() : null;
    }

    @ObfuscatedName("h.b(Ley;IIB)[Lbd;")
    public static class72[] method503(class146 arg0, int arg1, int arg2) {
        return method3142(arg0, arg1, arg2) ? method638() : null;
    }

    @ObfuscatedName("at.e(Ley;III)Lbd;")
    public static class72 method571(class146 arg0, int arg1, int arg2) {
        return method3142(arg0, arg1, arg2) ? method2050() : null;
    }

    @ObfuscatedName("y.t(Ley;Ljava/lang/String;Ljava/lang/String;I)Lbu;")
    public static class74 method140(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2728(arg1);
        int var4 = arg0.method2713(var3, arg2);
        return method562(arg0, var3, var4);
    }

    @ObfuscatedName("az.z(Ley;Ljava/lang/String;Ljava/lang/String;B)[Lbd;")
    public static class72[] method813(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2728(arg1);
        int var4 = arg0.method2713(var3, arg2);
        return method503(arg0, var3, var4);
    }

    @ObfuscatedName("z.g(Ley;Ljava/lang/String;Ljava/lang/String;I)Lbd;")
    public static class72 method77(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2728(arg1);
        int var4 = arg0.method2713(var3, arg2);
        return method571(arg0, var3, var4);
    }

    @ObfuscatedName("bl.c(Ley;Ley;Ljava/lang/String;Ljava/lang/String;I)Lgj;")
    public static class193 method1053(class146 arg0, class146 arg1, String arg2, String arg3) {
        int var4 = arg0.method2728(arg2);
        int var5 = arg0.method2713(var4, arg3);
        class193 var6;
        if (method3142(arg0, var4, var5)) {
            byte[] var7 = arg1.method2759(var4, var5);
            class193 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class193 var9 = new class193(var7, Statics.field1284, Statics.field1288, Statics.field1289, Statics.field2963, Statics.field1290, Statics.field1292);
                method2411();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("eq.o(Ley;IB)Lbu;")
    public static class74 method2818(class146 arg0, int arg1) {
        byte[] var2 = arg0.method2756(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method755(var2);
            var3 = true;
        }
        return var3 ? method171() : null;
    }

    @ObfuscatedName("a.q(I)Lbu;")
    public static class74 method171() {
        class74 var0 = new class74();
        var0.field1328 = Statics.field1285;
        var0.field1332 = Statics.field1287;
        var0.field1331 = Statics.field1284[0];
        var0.field1330 = Statics.field1288[0];
        var0.field1327 = Statics.field1289[0];
        var0.field1325 = Statics.field2963[0];
        var0.field1326 = Statics.field1290;
        var0.field1329 = Statics.field1292[0];
        method2411();
        return var0;
    }

    @ObfuscatedName("ap.w(B)[Lbd;")
    public static class72[] method638() {
        class72[] var0 = new class72[Statics.field1286];
        for (int var1 = 0; var1 < Statics.field1286; var1++) {
            class72 var2 = var0[var1] = new class72();
            var2.field1313 = Statics.field1285;
            var2.field1312 = Statics.field1287;
            var2.field1306 = Statics.field1284[var1];
            var2.field1314 = Statics.field1288[var1];
            var2.field1307 = Statics.field1289[var1];
            var2.field1308 = Statics.field2963[var1];
            int var3 = var2.field1308 * var2.field1307;
            byte[] var4 = Statics.field1292[var1];
            var2.field1311 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1311[var5] = Statics.field1290[var4[var5] & 0xFF];
            }
        }
        method2411();
        return var0;
    }

    @ObfuscatedName("cp.y(I)Lbd;")
    public static class72 method2050() {
        class72 var0 = new class72();
        var0.field1313 = Statics.field1285;
        var0.field1312 = Statics.field1287;
        var0.field1306 = Statics.field1284[0];
        var0.field1314 = Statics.field1288[0];
        var0.field1307 = Statics.field1289[0];
        var0.field1308 = Statics.field2963[0];
        int var1 = var0.field1308 * var0.field1307;
        byte[] var2 = Statics.field1292[0];
        var0.field1311 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1311[var3] = Statics.field1290[var2[var3] & 0xFF];
        }
        method2411();
        return var0;
    }

    @ObfuscatedName("fq.p(Ley;IIB)Z")
    public static boolean method3142(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2759(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method755(var3);
            return true;
        }
    }

    @ObfuscatedName("ae.m([BB)V")
    public static void method755(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1862 = arg0.length - 2;
        Statics.field1286 = var1.method2117();
        Statics.field1284 = new int[Statics.field1286];
        Statics.field1288 = new int[Statics.field1286];
        Statics.field1289 = new int[Statics.field1286];
        Statics.field2963 = new int[Statics.field1286];
        Statics.field1292 = new byte[Statics.field1286][];
        var1.field1862 = arg0.length - 7 - Statics.field1286 * 8;
        Statics.field1285 = var1.method2117();
        Statics.field1287 = var1.method2117();
        int var2 = (var1.method2115() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1286; var3++) {
            Statics.field1284[var3] = var1.method2117();
        }
        for (int var4 = 0; var4 < Statics.field1286; var4++) {
            Statics.field1288[var4] = var1.method2117();
        }
        for (int var5 = 0; var5 < Statics.field1286; var5++) {
            Statics.field1289[var5] = var1.method2117();
        }
        for (int var6 = 0; var6 < Statics.field1286; var6++) {
            Statics.field2963[var6] = var1.method2117();
        }
        var1.field1862 = arg0.length - 7 - Statics.field1286 * 8 - (var2 - 1) * 3;
        Statics.field1290 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1290[var7] = var1.method2119();
            if (Statics.field1290[var7] == 0) {
                Statics.field1290[var7] = 1;
            }
        }
        var1.field1862 = 0;
        for (int var8 = 0; var8 < Statics.field1286; var8++) {
            int var9 = Statics.field1289[var8];
            int var10 = Statics.field2963[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1292[var8] = var12;
            int var13 = var1.method2115();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2116();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2116();
                    }
                }
            }
        }
    }

    @ObfuscatedName("dz.a(B)V")
    public static void method2411() {
        Statics.field1284 = null;
        Statics.field1288 = null;
        Statics.field1289 = null;
        Statics.field2963 = null;
        Statics.field1290 = null;
        Statics.field1292 = (byte[][]) null;
    }
}
