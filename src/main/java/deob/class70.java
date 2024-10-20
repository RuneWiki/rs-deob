package deob;

@ObfuscatedName("bx")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cg.g(Leo;III)[Lbt;")
    public static class72[] method1839(class147 arg0, int arg1, int arg2) {
        if (!method2037(arg0, arg1, arg2)) {
            return null;
        }
        class72[] var3 = new class72[Statics.field1297];
        for (int var4 = 0; var4 < Statics.field1297; var4++) {
            class72 var5 = var3[var4] = new class72();
            var5.field1311 = Statics.field1288;
            var5.field1306 = Statics.field1287;
            var5.field1310 = Statics.field1293[var4];
            var5.field1309 = Statics.field1291[var4];
            var5.field1307 = Statics.field1292[var4];
            var5.field1308 = Statics.field1290[var4];
            int var6 = var5.field1308 * var5.field1307;
            byte[] var7 = Statics.field1294[var4];
            var5.field1315 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1315[var8] = Statics.field1501[var7[var8] & 0xFF];
            }
        }
        method36();
        return var3;
    }

    @ObfuscatedName("ax.i(Leo;III)Lbt;")
    public static class72 method690(class147 arg0, int arg1, int arg2) {
        return method2037(arg0, arg1, arg2) ? method451() : null;
    }

    @ObfuscatedName("ez.k(Leo;Ljava/lang/String;Ljava/lang/String;B)[Lbr;")
    public static class74[] method2655(class147 arg0, String arg1, String arg2) {
        int var3 = arg0.method2699(arg1);
        int var4 = arg0.method2700(var3, arg2);
        class74[] var5;
        if (method2037(arg0, var3, var4)) {
            var5 = Statics.method507();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("cg.w(Leo;Ljava/lang/String;Ljava/lang/String;I)[Lbt;")
    public static class72[] method1848(class147 arg0, String arg1, String arg2) {
        int var3 = arg0.method2699(arg1);
        int var4 = arg0.method2700(var3, arg2);
        return method1839(arg0, var3, var4);
    }

    @ObfuscatedName("ay.m(Leo;Ljava/lang/String;Ljava/lang/String;I)Lbt;")
    public static class72 method673(class147 arg0, String arg1, String arg2) {
        int var3 = arg0.method2699(arg1);
        int var4 = arg0.method2700(var3, arg2);
        return method690(arg0, var3, var4);
    }

    @ObfuscatedName("ag.u(Leo;Leo;Ljava/lang/String;Ljava/lang/String;S)Lge;")
    public static class194 method795(class147 arg0, class147 arg1, String arg2, String arg3) {
        int var4 = arg0.method2699(arg2);
        int var5 = arg0.method2700(var4, arg3);
        class194 var6;
        if (method2037(arg0, var4, var5)) {
            byte[] var7 = arg1.method2734(var4, var5);
            class194 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class194 var9 = new class194(var7, Statics.field1293, Statics.field1291, Statics.field1292, Statics.field1290, Statics.field1501, Statics.field1294);
                method36();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("bk.j(Leo;II)Lbr;")
    public static class74 method1390(class147 arg0, int arg1) {
        if (!method1378(arg0, arg1)) {
            return null;
        }
        class74 var2 = new class74();
        var2.field1328 = Statics.field1288;
        var2.field1331 = Statics.field1287;
        var2.field1326 = Statics.field1293[0];
        var2.field1330 = Statics.field1291[0];
        var2.field1327 = Statics.field1292[0];
        var2.field1325 = Statics.field1290[0];
        var2.field1332 = Statics.field1501;
        var2.field1329 = Statics.field1294[0];
        method36();
        return var2;
    }

    @ObfuscatedName("d.h(B)Lbt;")
    public static class72 method451() {
        class72 var0 = new class72();
        var0.field1311 = Statics.field1288;
        var0.field1306 = Statics.field1287;
        var0.field1310 = Statics.field1293[0];
        var0.field1309 = Statics.field1291[0];
        var0.field1307 = Statics.field1292[0];
        var0.field1308 = Statics.field1290[0];
        int var1 = var0.field1308 * var0.field1307;
        byte[] var2 = Statics.field1294[0];
        var0.field1315 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1315[var3] = Statics.field1501[var2[var3] & 0xFF];
        }
        method36();
        return var0;
    }

    @ObfuscatedName("cs.b(Leo;IIS)Z")
    public static boolean method2037(class147 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2734(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method99(var3);
            return true;
        }
    }

    @ObfuscatedName("bx.r(Leo;IB)Z")
    public static boolean method1378(class147 arg0, int arg1) {
        byte[] var2 = arg0.method2713(arg1);
        if (var2 == null) {
            return false;
        } else {
            method99(var2);
            return true;
        }
    }

    @ObfuscatedName("j.l([BI)V")
    public static void method99(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1844 = arg0.length - 2;
        Statics.field1297 = var1.method2094();
        Statics.field1293 = new int[Statics.field1297];
        Statics.field1291 = new int[Statics.field1297];
        Statics.field1292 = new int[Statics.field1297];
        Statics.field1290 = new int[Statics.field1297];
        Statics.field1294 = new byte[Statics.field1297][];
        var1.field1844 = arg0.length - 7 - Statics.field1297 * 8;
        Statics.field1288 = var1.method2094();
        Statics.field1287 = var1.method2094();
        int var2 = (var1.method2092() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1297; var3++) {
            Statics.field1293[var3] = var1.method2094();
        }
        for (int var4 = 0; var4 < Statics.field1297; var4++) {
            Statics.field1291[var4] = var1.method2094();
        }
        for (int var5 = 0; var5 < Statics.field1297; var5++) {
            Statics.field1292[var5] = var1.method2094();
        }
        for (int var6 = 0; var6 < Statics.field1297; var6++) {
            Statics.field1290[var6] = var1.method2094();
        }
        var1.field1844 = arg0.length - 7 - Statics.field1297 * 8 - (var2 - 1) * 3;
        Statics.field1501 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1501[var7] = var1.method2096();
            if (Statics.field1501[var7] == 0) {
                Statics.field1501[var7] = 1;
            }
        }
        var1.field1844 = 0;
        for (int var8 = 0; var8 < Statics.field1297; var8++) {
            int var9 = Statics.field1292[var8];
            int var10 = Statics.field1290[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1294[var8] = var12;
            int var13 = var1.method2092();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2117();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2117();
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.x(B)V")
    public static void method36() {
        Statics.field1293 = null;
        Statics.field1291 = null;
        Statics.field1292 = null;
        Statics.field1290 = null;
        Statics.field1501 = null;
        Statics.field1294 = (byte[][]) null;
    }
}
