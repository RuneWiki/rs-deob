package deob;

@ObfuscatedName("bj")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.e(Lez;IIB)Lbi;")
    public static class74 method145(class146 arg0, int arg1, int arg2) {
        return method779(arg0, arg1, arg2) ? Statics.method3387() : null;
    }

    @ObfuscatedName("cs.o(Lez;IIB)[Lbg;")
    public static class72[] method1913(class146 arg0, int arg1, int arg2) {
        return method779(arg0, arg1, arg2) ? method72() : null;
    }

    @ObfuscatedName("e.y(Lez;III)Lbg;")
    public static class72 method1(class146 arg0, int arg1, int arg2) {
        if (!method779(arg0, arg1, arg2)) {
            return null;
        }
        class72 var3 = new class72();
        var3.field1307 = Statics.field1285;
        var3.field1308 = Statics.field1288;
        var3.field1304 = Statics.field1289[0];
        var3.field1306 = Statics.field1282[0];
        var3.field1305 = Statics.field83[0];
        var3.field1309 = Statics.field993[0];
        int var4 = var3.field1309 * var3.field1305;
        byte[] var5 = Statics.field1284[0];
        var3.field1303 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1303[var6] = Statics.field151[var5[var6] & 0xFF];
        }
        Statics.field1289 = null;
        Statics.field1282 = null;
        Statics.field83 = null;
        Statics.field993 = null;
        Statics.field151 = null;
        Statics.field1284 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("ai.b(Lez;Lez;III)Lgn;")
    public static class193 method596(class146 arg0, class146 arg1, int arg2, int arg3) {
        return method779(arg0, arg2, arg3) ? method574(arg1.method2709(arg2, arg3)) : null;
    }

    @ObfuscatedName("dy.w(Lez;Ljava/lang/String;Ljava/lang/String;B)[Lbi;")
    public static class74[] method2382(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2655(arg1);
        int var4 = arg0.method2656(var3, arg2);
        class74[] var5;
        if (method779(arg0, var3, var4)) {
            class74[] var6 = new class74[Statics.field1287];
            for (int var7 = 0; var7 < Statics.field1287; var7++) {
                class74 var8 = var6[var7] = new class74();
                var8.field1321 = Statics.field1285;
                var8.field1325 = Statics.field1288;
                var8.field1323 = Statics.field1289[var7];
                var8.field1326 = Statics.field1282[var7];
                var8.field1328 = Statics.field83[var7];
                var8.field1324 = Statics.field993[var7];
                var8.field1322 = Statics.field151;
                var8.field1327 = Statics.field1284[var7];
            }
            Statics.field1289 = null;
            Statics.field1282 = null;
            Statics.field83 = null;
            Statics.field993 = null;
            Statics.field151 = null;
            Statics.field1284 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("er.r(Lez;Ljava/lang/String;Ljava/lang/String;I)Lbi;")
    public static class74 method2814(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2655(arg1);
        int var4 = arg0.method2656(var3, arg2);
        return method145(arg0, var3, var4);
    }

    @ObfuscatedName("i.s(Lez;II)Lbi;")
    public static class74 method146(class146 arg0, int arg1) {
        return method474(arg0, arg1) ? Statics.method3387() : null;
    }

    @ObfuscatedName("l.x(I)[Lbg;")
    public static class72[] method72() {
        class72[] var0 = new class72[Statics.field1287];
        for (int var1 = 0; var1 < Statics.field1287; var1++) {
            class72 var2 = var0[var1] = new class72();
            var2.field1307 = Statics.field1285;
            var2.field1308 = Statics.field1288;
            var2.field1304 = Statics.field1289[var1];
            var2.field1306 = Statics.field1282[var1];
            var2.field1305 = Statics.field83[var1];
            var2.field1309 = Statics.field993[var1];
            int var3 = var2.field1309 * var2.field1305;
            byte[] var4 = Statics.field1284[var1];
            var2.field1303 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1303[var5] = Statics.field151[var4[var5] & 0xFF];
            }
        }
        Statics.field1289 = null;
        Statics.field1282 = null;
        Statics.field83 = null;
        Statics.field993 = null;
        Statics.field151 = null;
        Statics.field1284 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ao.h([BI)Lgn;")
    public static class193 method574(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class193 var1 = new class193(arg0, Statics.field1289, Statics.field1282, Statics.field83, Statics.field993, Statics.field151, Statics.field1284);
        Statics.field1289 = null;
        Statics.field1282 = null;
        Statics.field83 = null;
        Statics.field993 = null;
        Statics.field151 = null;
        Statics.field1284 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("aq.a(Lez;IIB)Z")
    public static boolean method779(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2709(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method576(var3);
            return true;
        }
    }

    @ObfuscatedName("k.u(Lez;II)Z")
    public static boolean method474(class146 arg0, int arg1) {
        byte[] var2 = arg0.method2650(arg1);
        if (var2 == null) {
            return false;
        } else {
            method576(var2);
            return true;
        }
    }

    @ObfuscatedName("ao.v([BI)V")
    public static void method576(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1841 = arg0.length - 2;
        Statics.field1287 = var1.method2232();
        Statics.field1289 = new int[Statics.field1287];
        Statics.field1282 = new int[Statics.field1287];
        Statics.field83 = new int[Statics.field1287];
        Statics.field993 = new int[Statics.field1287];
        Statics.field1284 = new byte[Statics.field1287][];
        var1.field1841 = arg0.length - 7 - Statics.field1287 * 8;
        Statics.field1285 = var1.method2232();
        Statics.field1288 = var1.method2232();
        int var2 = (var1.method2123() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1287; var3++) {
            Statics.field1289[var3] = var1.method2232();
        }
        for (int var4 = 0; var4 < Statics.field1287; var4++) {
            Statics.field1282[var4] = var1.method2232();
        }
        for (int var5 = 0; var5 < Statics.field1287; var5++) {
            Statics.field83[var5] = var1.method2232();
        }
        for (int var6 = 0; var6 < Statics.field1287; var6++) {
            Statics.field993[var6] = var1.method2232();
        }
        var1.field1841 = arg0.length - 7 - Statics.field1287 * 8 - (var2 - 1) * 3;
        Statics.field151 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field151[var7] = var1.method2215();
            if (Statics.field151[var7] == 0) {
                Statics.field151[var7] = 1;
            }
        }
        var1.field1841 = 0;
        for (int var8 = 0; var8 < Statics.field1287; var8++) {
            int var9 = Statics.field83[var8];
            int var10 = Statics.field993[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1284[var8] = var12;
            int var13 = var1.method2123();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2066();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2066();
                    }
                }
            }
        }
    }
}
