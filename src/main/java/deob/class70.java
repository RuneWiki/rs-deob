package deob;

@ObfuscatedName("bj")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ep.e(Lec;IIB)Lbd;")
    public static class74 method2682(class145 arg0, int arg1, int arg2) {
        return method2499(arg0, arg1, arg2) ? method846() : null;
    }

    @ObfuscatedName("dh.p(Lec;Ljava/lang/String;Ljava/lang/String;I)[Lbd;")
    public static class74[] method2589(class145 arg0, String arg1, String arg2) {
        int var3 = arg0.method2781(arg1);
        int var4 = arg0.method2732(var3, arg2);
        class74[] var5;
        if (method2499(arg0, var3, var4)) {
            var5 = method465();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("aq.g(Lec;Ljava/lang/String;Ljava/lang/String;B)[Lbu;")
    public static class72[] method583(class145 arg0, String arg1, String arg2) {
        int var3 = arg0.method2781(arg1);
        int var4 = arg0.method2732(var3, arg2);
        class72[] var5;
        if (method2499(arg0, var3, var4)) {
            var5 = method1873();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("y.u(Lec;Ljava/lang/String;Ljava/lang/String;B)Lbu;")
    public static class72 method515(class145 arg0, String arg1, String arg2) {
        int var3 = arg0.method2781(arg1);
        int var4 = arg0.method2732(var3, arg2);
        class72 var5;
        if (method2499(arg0, var3, var4)) {
            class72 var6 = new class72();
            var6.field1290 = Statics.field1273;
            var6.field1295 = Statics.field1274;
            var6.field1297 = Statics.field1275[0];
            var6.field1293 = Statics.field1992[0];
            var6.field1294 = Statics.field594[0];
            var6.field1296 = Statics.field1276[0];
            int var7 = var6.field1296 * var6.field1294;
            byte[] var8 = Statics.field1277[0];
            var6.field1292 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field1292[var9] = Statics.field552[var8[var9] & 0xFF];
            }
            method111();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("l.k(Lec;Lec;Ljava/lang/String;Ljava/lang/String;B)Lgb;")
    public static class190 method99(class145 arg0, class145 arg1, String arg2, String arg3) {
        int var4 = arg0.method2781(arg2);
        int var5 = arg0.method2732(var4, arg3);
        class190 var6;
        if (method2499(arg0, var4, var5)) {
            byte[] var7 = arg1.method2717(var4, var5);
            class190 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class190 var9 = new class190(var7, Statics.field1275, Statics.field1992, Statics.field594, Statics.field1276, Statics.field552, Statics.field1277);
                method111();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("client.m(I)[Lbd;")
    public static class74[] method465() {
        class74[] var0 = new class74[Statics.field1279];
        for (int var1 = 0; var1 < Statics.field1279; var1++) {
            class74 var2 = var0[var1] = new class74();
            var2.field1314 = Statics.field1273;
            var2.field1310 = Statics.field1274;
            var2.field1312 = Statics.field1275[var1];
            var2.field1313 = Statics.field1992[var1];
            var2.field1308 = Statics.field594[var1];
            var2.field1315 = Statics.field1276[var1];
            var2.field1309 = Statics.field552;
            var2.field1311 = Statics.field1277[var1];
        }
        method111();
        return var0;
    }

    @ObfuscatedName("at.t(B)Lbd;")
    public static class74 method846() {
        class74 var0 = new class74();
        var0.field1314 = Statics.field1273;
        var0.field1310 = Statics.field1274;
        var0.field1312 = Statics.field1275[0];
        var0.field1313 = Statics.field1992[0];
        var0.field1308 = Statics.field594[0];
        var0.field1315 = Statics.field1276[0];
        var0.field1309 = Statics.field552;
        var0.field1311 = Statics.field1277[0];
        method111();
        return var0;
    }

    @ObfuscatedName("cz.l(I)[Lbu;")
    public static class72[] method1873() {
        class72[] var0 = new class72[Statics.field1279];
        for (int var1 = 0; var1 < Statics.field1279; var1++) {
            class72 var2 = var0[var1] = new class72();
            var2.field1290 = Statics.field1273;
            var2.field1295 = Statics.field1274;
            var2.field1297 = Statics.field1275[var1];
            var2.field1293 = Statics.field1992[var1];
            var2.field1294 = Statics.field594[var1];
            var2.field1296 = Statics.field1276[var1];
            int var3 = var2.field1296 * var2.field1294;
            byte[] var4 = Statics.field1277[var1];
            var2.field1292 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1292[var5] = Statics.field552[var4[var5] & 0xFF];
            }
        }
        method111();
        return var0;
    }

    @ObfuscatedName("db.f(Lec;III)Z")
    public static boolean method2499(class145 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2717(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method495(var3);
            return true;
        }
    }

    @ObfuscatedName("ay.c(Lec;II)Z")
    public static boolean method835(class145 arg0, int arg1) {
        byte[] var2 = arg0.method2770(arg1);
        if (var2 == null) {
            return false;
        } else {
            method495(var2);
            return true;
        }
    }

    @ObfuscatedName("q.i([BI)V")
    public static void method495(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1841 = arg0.length - 2;
        Statics.field1279 = var1.method2182();
        Statics.field1275 = new int[Statics.field1279];
        Statics.field1992 = new int[Statics.field1279];
        Statics.field594 = new int[Statics.field1279];
        Statics.field1276 = new int[Statics.field1279];
        Statics.field1277 = new byte[Statics.field1279][];
        var1.field1841 = arg0.length - 7 - Statics.field1279 * 8;
        Statics.field1273 = var1.method2182();
        Statics.field1274 = var1.method2182();
        int var2 = (var1.method2125() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1279; var3++) {
            Statics.field1275[var3] = var1.method2182();
        }
        for (int var4 = 0; var4 < Statics.field1279; var4++) {
            Statics.field1992[var4] = var1.method2182();
        }
        for (int var5 = 0; var5 < Statics.field1279; var5++) {
            Statics.field594[var5] = var1.method2182();
        }
        for (int var6 = 0; var6 < Statics.field1279; var6++) {
            Statics.field1276[var6] = var1.method2182();
        }
        var1.field1841 = arg0.length - 7 - Statics.field1279 * 8 - (var2 - 1) * 3;
        Statics.field552 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field552[var7] = var1.method2145();
            if (Statics.field552[var7] == 0) {
                Statics.field552[var7] = 1;
            }
        }
        var1.field1841 = 0;
        for (int var8 = 0; var8 < Statics.field1279; var8++) {
            int var9 = Statics.field594[var8];
            int var10 = Statics.field1276[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1277[var8] = var12;
            int var13 = var1.method2125();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2201();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2201();
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.o(I)V")
    public static void method111() {
        Statics.field1275 = null;
        Statics.field1992 = null;
        Statics.field594 = null;
        Statics.field1276 = null;
        Statics.field552 = null;
        Statics.field1277 = (byte[][]) null;
    }
}
