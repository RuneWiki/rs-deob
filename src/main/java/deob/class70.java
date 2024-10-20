package deob;

@ObfuscatedName("bi")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ea.y(Lev;IIS)[Lbe;")
    public static class72[] method2689(class145 arg0, int arg1, int arg2) {
        return method753(arg0, arg1, arg2) ? method545() : null;
    }

    @ObfuscatedName("w.u(Lev;Lev;III)Lgc;")
    public static class190 method115(class145 arg0, class145 arg1, int arg2, int arg3) {
        return method753(arg0, arg2, arg3) ? method127(arg1.method2704(arg2, arg3)) : null;
    }

    @ObfuscatedName("ar.k(Lev;Ljava/lang/String;Ljava/lang/String;B)[Lbg;")
    public static class74[] method1010(class145 arg0, String arg1, String arg2) {
        int var3 = arg0.method2771(arg1);
        int var4 = arg0.method2754(var3, arg2);
        class74[] var5;
        if (method753(arg0, var3, var4)) {
            class74[] var6 = new class74[Statics.field1274];
            for (int var7 = 0; var7 < Statics.field1274; var7++) {
                class74 var8 = var6[var7] = new class74();
                var8.field1313 = Statics.field2924;
                var8.field1314 = Statics.field1268;
                var8.field1311 = Statics.field1269[var7];
                var8.field1309 = Statics.field1277[var7];
                var8.field1307 = Statics.field1897[var7];
                var8.field1310 = Statics.field2731[var7];
                var8.field1308 = Statics.field1270;
                var8.field1312 = Statics.field1271[var7];
            }
            method2587();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ao.v(Lev;Ljava/lang/String;Ljava/lang/String;I)Lbg;")
    public static class74 method732(class145 arg0, String arg1, String arg2) {
        int var3 = arg0.method2771(arg1);
        int var4 = arg0.method2754(var3, arg2);
        class74 var5;
        if (method753(arg0, var3, var4)) {
            var5 = method551();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("d.l(Lev;Ljava/lang/String;Ljava/lang/String;I)[Lbe;")
    public static class72[] method491(class145 arg0, String arg1, String arg2) {
        int var3 = arg0.method2771(arg1);
        int var4 = arg0.method2754(var3, arg2);
        return method2689(arg0, var3, var4);
    }

    @ObfuscatedName("d.x(Lev;II)Lbg;")
    public static class74 method492(class145 arg0, int arg1) {
        return method802(arg0, arg1) ? method551() : null;
    }

    @ObfuscatedName("ah.r(I)Lbg;")
    public static class74 method551() {
        class74 var0 = new class74();
        var0.field1313 = Statics.field2924;
        var0.field1314 = Statics.field1268;
        var0.field1311 = Statics.field1269[0];
        var0.field1309 = Statics.field1277[0];
        var0.field1307 = Statics.field1897[0];
        var0.field1310 = Statics.field2731[0];
        var0.field1308 = Statics.field1270;
        var0.field1312 = Statics.field1271[0];
        method2587();
        return var0;
    }

    @ObfuscatedName("aq.w(I)[Lbe;")
    public static class72[] method545() {
        class72[] var0 = new class72[Statics.field1274];
        for (int var1 = 0; var1 < Statics.field1274; var1++) {
            class72 var2 = var0[var1] = new class72();
            var2.field1290 = Statics.field2924;
            var2.field1288 = Statics.field1268;
            var2.field1291 = Statics.field1269[var1];
            var2.field1292 = Statics.field1277[var1];
            var2.field1296 = Statics.field1897[var1];
            var2.field1289 = Statics.field2731[var1];
            int var3 = var2.field1296 * var2.field1289;
            byte[] var4 = Statics.field1271[var1];
            var2.field1293 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1293[var5] = Statics.field1270[var4[var5] & 0xFF];
            }
        }
        method2587();
        return var0;
    }

    @ObfuscatedName("f.c([BI)Lgc;")
    public static class190 method127(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class190 var1 = new class190(arg0, Statics.field1269, Statics.field1277, Statics.field1897, Statics.field2731, Statics.field1270, Statics.field1271);
            method2587();
            return var1;
        }
    }

    @ObfuscatedName("ac.f(Lev;III)Z")
    public static boolean method753(class145 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2704(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method581(var3);
            return true;
        }
    }

    @ObfuscatedName("ae.o(Lev;IB)Z")
    public static boolean method802(class145 arg0, int arg1) {
        byte[] var2 = arg0.method2733(arg1);
        if (var2 == null) {
            return false;
        } else {
            method581(var2);
            return true;
        }
    }

    @ObfuscatedName("ai.p([BI)V")
    public static void method581(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1854 = arg0.length - 2;
        Statics.field1274 = var1.method2111();
        Statics.field1269 = new int[Statics.field1274];
        Statics.field1277 = new int[Statics.field1274];
        Statics.field1897 = new int[Statics.field1274];
        Statics.field2731 = new int[Statics.field1274];
        Statics.field1271 = new byte[Statics.field1274][];
        var1.field1854 = arg0.length - 7 - Statics.field1274 * 8;
        Statics.field2924 = var1.method2111();
        Statics.field1268 = var1.method2111();
        int var2 = (var1.method2109() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1274; var3++) {
            Statics.field1269[var3] = var1.method2111();
        }
        for (int var4 = 0; var4 < Statics.field1274; var4++) {
            Statics.field1277[var4] = var1.method2111();
        }
        for (int var5 = 0; var5 < Statics.field1274; var5++) {
            Statics.field1897[var5] = var1.method2111();
        }
        for (int var6 = 0; var6 < Statics.field1274; var6++) {
            Statics.field2731[var6] = var1.method2111();
        }
        var1.field1854 = arg0.length - 7 - Statics.field1274 * 8 - (var2 - 1) * 3;
        Statics.field1270 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1270[var7] = var1.method2113();
            if (Statics.field1270[var7] == 0) {
                Statics.field1270[var7] = 1;
            }
        }
        var1.field1854 = 0;
        for (int var8 = 0; var8 < Statics.field1274; var8++) {
            int var9 = Statics.field1897[var8];
            int var10 = Statics.field2731[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1271[var8] = var12;
            int var13 = var1.method2109();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2110();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2110();
                    }
                }
            }
        }
    }

    @ObfuscatedName("dj.n(I)V")
    public static void method2587() {
        Statics.field1269 = null;
        Statics.field1277 = null;
        Statics.field1897 = null;
        Statics.field2731 = null;
        Statics.field1270 = null;
        Statics.field1271 = (byte[][]) null;
    }
}
