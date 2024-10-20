package deob;

@ObfuscatedName("bl")
public class class71 {

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cr.p(Len;III)[Lbf;")
    public static class75[] method1981(class151 arg0, int arg1, int arg2) {
        if (!method545(arg0, arg1, arg2)) {
            return null;
        }
        class75[] var3 = new class75[Statics.field1881];
        for (int var4 = 0; var4 < Statics.field1881; var4++) {
            class75 var5 = var3[var4] = new class75();
            var5.field1314 = Statics.field1278;
            var5.field1320 = Statics.field1279;
            var5.field1317 = Statics.field1280[var4];
            var5.field1319 = Statics.field1287[var4];
            var5.field1315 = Statics.field1107[var4];
            var5.field1313 = Statics.field3029[var4];
            var5.field1318 = Statics.field1282;
            var5.field1316 = Statics.field1283[var4];
        }
        method1379();
        return var3;
    }

    @ObfuscatedName("av.y(Len;III)[Lbq;")
    public static class73[] method606(class151 arg0, int arg1, int arg2) {
        return method545(arg0, arg1, arg2) ? method167() : null;
    }

    @ObfuscatedName("bm.d(Len;Len;IIB)Lgy;")
    public static class207 method1449(class151 arg0, class151 arg1, int arg2, int arg3) {
        return method545(arg0, arg2, arg3) ? method724(arg1.method2811(arg2, arg3)) : null;
    }

    @ObfuscatedName("dz.r(Len;Ljava/lang/String;Ljava/lang/String;I)Lbf;")
    public static class75 method2424(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2762(arg1);
        int var4 = arg0.method2763(var3, arg2);
        class75 var5;
        if (method545(arg0, var3, var4)) {
            class75 var6 = new class75();
            var6.field1314 = Statics.field1278;
            var6.field1320 = Statics.field1279;
            var6.field1317 = Statics.field1280[0];
            var6.field1319 = Statics.field1287[0];
            var6.field1315 = Statics.field1107[0];
            var6.field1313 = Statics.field3029[0];
            var6.field1318 = Statics.field1282;
            var6.field1316 = Statics.field1283[0];
            method1379();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("as.f(Len;Ljava/lang/String;Ljava/lang/String;I)[Lbq;")
    public static class73[] method778(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2762(arg1);
        int var4 = arg0.method2763(var3, arg2);
        return method606(arg0, var3, var4);
    }

    @ObfuscatedName("eo.z(Len;Len;Ljava/lang/String;Ljava/lang/String;B)Lgy;")
    public static class207 method2729(class151 arg0, class151 arg1, String arg2, String arg3) {
        int var4 = arg0.method2762(arg2);
        int var5 = arg0.method2763(var4, arg3);
        return method1449(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("e.o(I)[Lbq;")
    public static class73[] method167() {
        class73[] var0 = new class73[Statics.field1881];
        for (int var1 = 0; var1 < Statics.field1881; var1++) {
            class73 var2 = var0[var1] = new class73();
            var2.field1299 = Statics.field1278;
            var2.field1300 = Statics.field1279;
            var2.field1304 = Statics.field1280[var1];
            var2.field1298 = Statics.field1287[var1];
            var2.field1302 = Statics.field1107[var1];
            var2.field1296 = Statics.field3029[var1];
            int var3 = var2.field1302 * var2.field1296;
            byte[] var4 = Statics.field1283[var1];
            var2.field1295 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1295[var5] = Statics.field1282[var4[var5] & 0xFF];
            }
        }
        method1379();
        return var0;
    }

    @ObfuscatedName("ah.k([BI)Lgy;")
    public static class207 method724(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class207 var1 = new class207(arg0, Statics.field1280, Statics.field1287, Statics.field1107, Statics.field3029, Statics.field1282, Statics.field1283);
            method1379();
            return var1;
        }
    }

    @ObfuscatedName("t.s(Len;IIB)Z")
    public static boolean method545(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2811(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1382(var3);
            return true;
        }
    }

    @ObfuscatedName("cr.h(Len;II)Z")
    public static boolean method1980(class151 arg0, int arg1) {
        byte[] var2 = arg0.method2803(arg1);
        if (var2 == null) {
            return false;
        } else {
            method1382(var2);
            return true;
        }
    }

    @ObfuscatedName("bx.m([BI)V")
    public static void method1382(byte[] arg0) {
        class110 var1 = new class110(arg0);
        var1.field1842 = arg0.length - 2;
        Statics.field1881 = var1.method2243();
        Statics.field1280 = new int[Statics.field1881];
        Statics.field1287 = new int[Statics.field1881];
        Statics.field1107 = new int[Statics.field1881];
        Statics.field3029 = new int[Statics.field1881];
        Statics.field1283 = new byte[Statics.field1881][];
        var1.field1842 = arg0.length - 7 - Statics.field1881 * 8;
        Statics.field1278 = var1.method2243();
        Statics.field1279 = var1.method2243();
        int var2 = (var1.method2309() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1881; var3++) {
            Statics.field1280[var3] = var1.method2243();
        }
        for (int var4 = 0; var4 < Statics.field1881; var4++) {
            Statics.field1287[var4] = var1.method2243();
        }
        for (int var5 = 0; var5 < Statics.field1881; var5++) {
            Statics.field1107[var5] = var1.method2243();
        }
        for (int var6 = 0; var6 < Statics.field1881; var6++) {
            Statics.field3029[var6] = var1.method2243();
        }
        var1.field1842 = arg0.length - 7 - Statics.field1881 * 8 - (var2 - 1) * 3;
        Statics.field1282 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1282[var7] = var1.method2128();
            if (Statics.field1282[var7] == 0) {
                Statics.field1282[var7] = 1;
            }
        }
        var1.field1842 = 0;
        for (int var8 = 0; var8 < Statics.field1881; var8++) {
            int var9 = Statics.field1107[var8];
            int var10 = Statics.field3029[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1283[var8] = var12;
            int var13 = var1.method2309();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2125();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2125();
                    }
                }
            }
        }
    }

    @ObfuscatedName("bs.w(B)V")
    public static void method1379() {
        Statics.field1280 = null;
        Statics.field1287 = null;
        Statics.field1107 = null;
        Statics.field3029 = null;
        Statics.field1282 = null;
        Statics.field1283 = (byte[][]) null;
    }
}
