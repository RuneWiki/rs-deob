package deob;

@ObfuscatedName("bu")
public class class71 {

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.b(Lex;III)[Lbf;")
    public static class75[] method118(class151 arg0, int arg1, int arg2) {
        if (!Statics.method2699(arg0, arg1, arg2)) {
            return null;
        }
        class75[] var3 = new class75[Statics.field1293];
        for (int var4 = 0; var4 < Statics.field1293; var4++) {
            class75 var5 = var3[var4] = new class75();
            var5.field1328 = Statics.field1286;
            var5.field1329 = Statics.field1287;
            var5.field1326 = Statics.field1288[var4];
            var5.field1322 = Statics.field1294[var4];
            var5.field1324 = Statics.field1290[var4];
            var5.field1325 = Statics.field510[var4];
            var5.field1323 = Statics.field1291;
            var5.field1327 = Statics.field143[var4];
        }
        Statics.field1288 = null;
        Statics.field1294 = null;
        Statics.field1290 = null;
        Statics.field510 = null;
        Statics.field1291 = null;
        Statics.field143 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("al.e(Lex;IIB)Lbf;")
    public static class75 method596(class151 arg0, int arg1, int arg2) {
        return Statics.method2699(arg0, arg1, arg2) ? method898() : null;
    }

    @ObfuscatedName("eu.i(Lex;IIS)[Lby;")
    public static class73[] method2734(class151 arg0, int arg1, int arg2) {
        if (!Statics.method2699(arg0, arg1, arg2)) {
            return null;
        }
        class73[] var3 = new class73[Statics.field1293];
        for (int var4 = 0; var4 < Statics.field1293; var4++) {
            class73 var5 = var3[var4] = new class73();
            var5.field1306 = Statics.field1286;
            var5.field1304 = Statics.field1287;
            var5.field1303 = Statics.field1288[var4];
            var5.field1309 = Statics.field1294[var4];
            var5.field1308 = Statics.field1290[var4];
            var5.field1305 = Statics.field510[var4];
            int var6 = var5.field1308 * var5.field1305;
            byte[] var7 = Statics.field143[var4];
            var5.field1307 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1307[var8] = Statics.field1291[var7[var8] & 0xFF];
            }
        }
        method530();
        return var3;
    }

    @ObfuscatedName("ed.k(Lex;III)Lby;")
    public static class73 method2574(class151 arg0, int arg1, int arg2) {
        if (!Statics.method2699(arg0, arg1, arg2)) {
            return null;
        }
        class73 var3 = new class73();
        var3.field1306 = Statics.field1286;
        var3.field1304 = Statics.field1287;
        var3.field1303 = Statics.field1288[0];
        var3.field1309 = Statics.field1294[0];
        var3.field1308 = Statics.field1290[0];
        var3.field1305 = Statics.field510[0];
        int var4 = var3.field1308 * var3.field1305;
        byte[] var5 = Statics.field143[0];
        var3.field1307 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1307[var6] = Statics.field1291[var5[var6] & 0xFF];
        }
        Statics.field1288 = null;
        Statics.field1294 = null;
        Statics.field1290 = null;
        Statics.field510 = null;
        Statics.field1291 = null;
        Statics.field143 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("x.h(Lex;Lex;III)Lgl;")
    public static class207 method144(class151 arg0, class151 arg1, int arg2, int arg3) {
        return Statics.method2699(arg0, arg2, arg3) ? method454(arg1.method2761(arg2, arg3)) : null;
    }

    @ObfuscatedName("cq.p(Lex;Ljava/lang/String;Ljava/lang/String;I)[Lbf;")
    public static class75[] method1765(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2778(arg1);
        int var4 = arg0.method2839(var3, arg2);
        return method118(arg0, var3, var4);
    }

    @ObfuscatedName("ar.n(Lex;Ljava/lang/String;Ljava/lang/String;I)Lbf;")
    public static class75 method588(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2778(arg1);
        int var4 = arg0.method2839(var3, arg2);
        return method596(arg0, var3, var4);
    }

    @ObfuscatedName("c.o(Lex;Ljava/lang/String;Ljava/lang/String;B)[Lby;")
    public static class73[] method500(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2778(arg1);
        int var4 = arg0.method2839(var3, arg2);
        return method2734(arg0, var3, var4);
    }

    @ObfuscatedName("af.g(I)Lbf;")
    public static class75 method898() {
        class75 var0 = new class75();
        var0.field1328 = Statics.field1286;
        var0.field1329 = Statics.field1287;
        var0.field1326 = Statics.field1288[0];
        var0.field1322 = Statics.field1294[0];
        var0.field1324 = Statics.field1290[0];
        var0.field1325 = Statics.field510[0];
        var0.field1323 = Statics.field1291;
        var0.field1327 = Statics.field143[0];
        Statics.field1288 = null;
        Statics.field1294 = null;
        Statics.field1290 = null;
        Statics.field510 = null;
        Statics.field1291 = null;
        Statics.field143 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("s.z([BI)Lgl;")
    public static class207 method454(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class207 var1 = new class207(arg0, Statics.field1288, Statics.field1294, Statics.field1290, Statics.field510, Statics.field1291, Statics.field143);
        Statics.field1288 = null;
        Statics.field1294 = null;
        Statics.field1290 = null;
        Statics.field510 = null;
        Statics.field1291 = null;
        Statics.field143 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("cc.y(Lex;II)Z")
    public static boolean method1955(class151 arg0, int arg1) {
        byte[] var2 = arg0.method2764(arg1);
        if (var2 == null) {
            return false;
        } else {
            method501(var2);
            return true;
        }
    }

    @ObfuscatedName("c.w([BI)V")
    public static void method501(byte[] arg0) {
        class110 var1 = new class110(arg0);
        var1.field1855 = arg0.length - 2;
        Statics.field1293 = var1.method2292();
        Statics.field1288 = new int[Statics.field1293];
        Statics.field1294 = new int[Statics.field1293];
        Statics.field1290 = new int[Statics.field1293];
        Statics.field510 = new int[Statics.field1293];
        Statics.field143 = new byte[Statics.field1293][];
        var1.field1855 = arg0.length - 7 - Statics.field1293 * 8;
        Statics.field1286 = var1.method2292();
        Statics.field1287 = var1.method2292();
        int var2 = (var1.method2142() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1293; var3++) {
            Statics.field1288[var3] = var1.method2292();
        }
        for (int var4 = 0; var4 < Statics.field1293; var4++) {
            Statics.field1294[var4] = var1.method2292();
        }
        for (int var5 = 0; var5 < Statics.field1293; var5++) {
            Statics.field1290[var5] = var1.method2292();
        }
        for (int var6 = 0; var6 < Statics.field1293; var6++) {
            Statics.field510[var6] = var1.method2292();
        }
        var1.field1855 = arg0.length - 7 - Statics.field1293 * 8 - (var2 - 1) * 3;
        Statics.field1291 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1291[var7] = var1.method2146();
            if (Statics.field1291[var7] == 0) {
                Statics.field1291[var7] = 1;
            }
        }
        var1.field1855 = 0;
        for (int var8 = 0; var8 < Statics.field1293; var8++) {
            int var9 = Statics.field1290[var8];
            int var10 = Statics.field510[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field143[var8] = var12;
            int var13 = var1.method2142();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2294();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2294();
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.x(I)V")
    public static void method530() {
        Statics.field1288 = null;
        Statics.field1294 = null;
        Statics.field1290 = null;
        Statics.field510 = null;
        Statics.field1291 = null;
        Statics.field143 = (byte[][]) null;
    }
}
