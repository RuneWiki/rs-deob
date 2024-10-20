package deob;

@ObfuscatedName("bt")
public class class71 {

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aj.k(Lev;Ljava/lang/String;Ljava/lang/String;B)[Lbg;")
    public static class75[] method563(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2778(arg1);
        int var4 = arg0.method2809(var3, arg2);
        class75[] var5;
        if (method806(arg0, var3, var4)) {
            class75[] var6 = new class75[Statics.field1294];
            for (int var7 = 0; var7 < Statics.field1294; var7++) {
                class75 var8 = var6[var7] = new class75();
                var8.field1338 = Statics.field1295;
                var8.field1339 = Statics.field1776;
                var8.field1336 = Statics.field1296[var7];
                var8.field1337 = Statics.field1304[var7];
                var8.field1332 = Statics.field1298[var7];
                var8.field1334 = Statics.field143[var7];
                var8.field1335 = Statics.field1299;
                var8.field1333 = Statics.field2143[var7];
            }
            method562();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("p.y(Lev;Ljava/lang/String;Ljava/lang/String;I)Lbg;")
    public static class75 method143(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2778(arg1);
        int var4 = arg0.method2809(var3, arg2);
        class75 var5;
        if (method806(arg0, var3, var4)) {
            var5 = method608();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ek.e(Lev;Ljava/lang/String;Ljava/lang/String;B)[Lbq;")
    public static class73[] method2745(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2778(arg1);
        int var4 = arg0.method2809(var3, arg2);
        class73[] var5;
        if (method806(arg0, var3, var4)) {
            class73[] var6 = new class73[Statics.field1294];
            for (int var7 = 0; var7 < Statics.field1294; var7++) {
                class73 var8 = var6[var7] = new class73();
                var8.field1318 = Statics.field1295;
                var8.field1319 = Statics.field1776;
                var8.field1324 = Statics.field1296[var7];
                var8.field1320 = Statics.field1304[var7];
                var8.field1314 = Statics.field1298[var7];
                var8.field1315 = Statics.field143[var7];
                int var9 = var8.field1315 * var8.field1314;
                byte[] var10 = Statics.field2143[var7];
                var8.field1316 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1316[var11] = Statics.field1299[var10[var11] & 0xFF];
                }
            }
            method562();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("v.r(Lev;Ljava/lang/String;Ljava/lang/String;I)Lbq;")
    public static class73 method151(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2778(arg1);
        int var4 = arg0.method2809(var3, arg2);
        return Statics.method145(arg0, var3, var4);
    }

    @ObfuscatedName("cq.a(Lev;II)Lbg;")
    public static class75 method1901(class149 arg0, int arg1) {
        byte[] var2 = arg0.method2768(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method247(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class75 var4 = new class75();
        var4.field1338 = Statics.field1295;
        var4.field1339 = Statics.field1776;
        var4.field1336 = Statics.field1296[0];
        var4.field1337 = Statics.field1304[0];
        var4.field1332 = Statics.field1298[0];
        var4.field1334 = Statics.field143[0];
        var4.field1335 = Statics.field1299;
        var4.field1333 = Statics.field2143[0];
        method562();
        return var4;
    }

    @ObfuscatedName("aw.n(B)Lbg;")
    public static class75 method608() {
        class75 var0 = new class75();
        var0.field1338 = Statics.field1295;
        var0.field1339 = Statics.field1776;
        var0.field1336 = Statics.field1296[0];
        var0.field1337 = Statics.field1304[0];
        var0.field1332 = Statics.field1298[0];
        var0.field1334 = Statics.field143[0];
        var0.field1335 = Statics.field1299;
        var0.field1333 = Statics.field2143[0];
        method562();
        return var0;
    }

    @ObfuscatedName("e.x(I)Lbq;")
    public static class73 method31() {
        class73 var0 = new class73();
        var0.field1318 = Statics.field1295;
        var0.field1319 = Statics.field1776;
        var0.field1324 = Statics.field1296[0];
        var0.field1320 = Statics.field1304[0];
        var0.field1314 = Statics.field1298[0];
        var0.field1315 = Statics.field143[0];
        int var1 = var0.field1315 * var0.field1314;
        byte[] var2 = Statics.field2143[0];
        var0.field1316 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1316[var3] = Statics.field1299[var2[var3] & 0xFF];
        }
        method562();
        return var0;
    }

    @ObfuscatedName("ce.g([BB)Lgc;")
    public static class205 method2004(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class205 var1 = new class205(arg0, Statics.field1296, Statics.field1304, Statics.field1298, Statics.field143, Statics.field1299, Statics.field2143);
            method562();
            return var1;
        }
    }

    @ObfuscatedName("an.o(Lev;III)Z")
    public static boolean method806(class149 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2763(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method247(var3);
            return true;
        }
    }

    @ObfuscatedName("client.p([BI)V")
    public static void method247(byte[] arg0) {
        class108 var1 = new class108(arg0);
        var1.field1859 = arg0.length - 2;
        Statics.field1294 = var1.method2160();
        Statics.field1296 = new int[Statics.field1294];
        Statics.field1304 = new int[Statics.field1294];
        Statics.field1298 = new int[Statics.field1294];
        Statics.field143 = new int[Statics.field1294];
        Statics.field2143 = new byte[Statics.field1294][];
        var1.field1859 = arg0.length - 7 - Statics.field1294 * 8;
        Statics.field1295 = var1.method2160();
        Statics.field1776 = var1.method2160();
        int var2 = (var1.method2158() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1294; var3++) {
            Statics.field1296[var3] = var1.method2160();
        }
        for (int var4 = 0; var4 < Statics.field1294; var4++) {
            Statics.field1304[var4] = var1.method2160();
        }
        for (int var5 = 0; var5 < Statics.field1294; var5++) {
            Statics.field1298[var5] = var1.method2160();
        }
        for (int var6 = 0; var6 < Statics.field1294; var6++) {
            Statics.field143[var6] = var1.method2160();
        }
        var1.field1859 = arg0.length - 7 - Statics.field1294 * 8 - (var2 - 1) * 3;
        Statics.field1299 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1299[var7] = var1.method2314();
            if (Statics.field1299[var7] == 0) {
                Statics.field1299[var7] = 1;
            }
        }
        var1.field1859 = 0;
        for (int var8 = 0; var8 < Statics.field1294; var8++) {
            int var9 = Statics.field1298[var8];
            int var10 = Statics.field143[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2143[var8] = var12;
            int var13 = var1.method2158();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2159();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2159();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ah.v(B)V")
    public static void method562() {
        Statics.field1296 = null;
        Statics.field1304 = null;
        Statics.field1298 = null;
        Statics.field143 = null;
        Statics.field1299 = null;
        Statics.field2143 = (byte[][]) null;
    }
}
