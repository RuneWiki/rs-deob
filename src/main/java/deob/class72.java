package deob;

@ObfuscatedName("bx")
public class class72 {

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eo.b(Lfj;IIB)[Lbd;")
    public static class76[] method2808(class158 arg0, int arg1, int arg2) {
        return method1366(arg0, arg1, arg2) ? method100() : null;
    }

    @ObfuscatedName("au.e(Lfj;III)[Lbf;")
    public static class74[] method641(class158 arg0, int arg1, int arg2) {
        return method1366(arg0, arg1, arg2) ? Statics.method1317() : null;
    }

    @ObfuscatedName("ak.a(Lfj;III)Lbf;")
    public static class74 method627(class158 arg0, int arg1, int arg2) {
        if (!method1366(arg0, arg1, arg2)) {
            return null;
        }
        class74 var3 = new class74();
        var3.field1331 = Statics.field1940;
        var3.field1337 = Statics.field2073;
        var3.field1334 = Statics.field2846[0];
        var3.field1335 = Statics.field1317[0];
        var3.field1336 = Statics.field992[0];
        var3.field1333 = Statics.field1321[0];
        int var4 = var3.field1336 * var3.field1333;
        byte[] var5 = Statics.field1319[0];
        var3.field1340 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1340[var6] = Statics.field2940[var5[var6] & 0xFF];
        }
        method2736();
        return var3;
    }

    @ObfuscatedName("e.k(Lfj;Lfj;III)Lhq;")
    public static class215 method11(class158 arg0, class158 arg1, int arg2, int arg3) {
        if (!method1366(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method2819(arg2, arg3);
        class215 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class215 var6 = new class215(var4, Statics.field2846, Statics.field1317, Statics.field992, Statics.field1321, Statics.field2940, Statics.field1319);
            method2736();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("al.p(Lfj;Ljava/lang/String;Ljava/lang/String;I)[Lbd;")
    public static class76[] method614(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2833(arg1);
        int var4 = arg0.method2834(var3, arg2);
        return method2808(arg0, var3, var4);
    }

    @ObfuscatedName("ey.l(Lfj;Ljava/lang/String;Ljava/lang/String;I)Lbd;")
    public static class76 method2584(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2833(arg1);
        int var4 = arg0.method2834(var3, arg2);
        class76 var5;
        if (method1366(arg0, var3, var4)) {
            class76 var6 = new class76();
            var6.field1356 = Statics.field1940;
            var6.field1354 = Statics.field2073;
            var6.field1351 = Statics.field2846[0];
            var6.field1357 = Statics.field1317[0];
            var6.field1352 = Statics.field992[0];
            var6.field1353 = Statics.field1321[0];
            var6.field1355 = Statics.field2940;
            var6.field1350 = Statics.field1319[0];
            method2736();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("y.u(Lfj;Ljava/lang/String;Ljava/lang/String;I)[Lbf;")
    public static class74[] method528(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2833(arg1);
        int var4 = arg0.method2834(var3, arg2);
        return method641(arg0, var3, var4);
    }

    @ObfuscatedName("o.o(I)[Lbd;")
    public static class76[] method100() {
        class76[] var0 = new class76[Statics.field1320];
        for (int var1 = 0; var1 < Statics.field1320; var1++) {
            class76 var2 = var0[var1] = new class76();
            var2.field1356 = Statics.field1940;
            var2.field1354 = Statics.field2073;
            var2.field1351 = Statics.field2846[var1];
            var2.field1357 = Statics.field1317[var1];
            var2.field1352 = Statics.field992[var1];
            var2.field1353 = Statics.field1321[var1];
            var2.field1355 = Statics.field2940;
            var2.field1350 = Statics.field1319[var1];
        }
        method2736();
        return var0;
    }

    @ObfuscatedName("bz.q(Lfj;III)Z")
    public static boolean method1366(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2819(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2587(var3);
            return true;
        }
    }

    @ObfuscatedName("ey.v([BI)V")
    public static void method2587(byte[] arg0) {
        class111 var1 = new class111(arg0);
        var1.field1894 = arg0.length - 2;
        Statics.field1320 = var1.method2129();
        Statics.field2846 = new int[Statics.field1320];
        Statics.field1317 = new int[Statics.field1320];
        Statics.field992 = new int[Statics.field1320];
        Statics.field1321 = new int[Statics.field1320];
        Statics.field1319 = new byte[Statics.field1320][];
        var1.field1894 = arg0.length - 7 - Statics.field1320 * 8;
        Statics.field1940 = var1.method2129();
        Statics.field2073 = var1.method2129();
        int var2 = (var1.method2127() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1320; var3++) {
            Statics.field2846[var3] = var1.method2129();
        }
        for (int var4 = 0; var4 < Statics.field1320; var4++) {
            Statics.field1317[var4] = var1.method2129();
        }
        for (int var5 = 0; var5 < Statics.field1320; var5++) {
            Statics.field992[var5] = var1.method2129();
        }
        for (int var6 = 0; var6 < Statics.field1320; var6++) {
            Statics.field1321[var6] = var1.method2129();
        }
        var1.field1894 = arg0.length - 7 - Statics.field1320 * 8 - (var2 - 1) * 3;
        Statics.field2940 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2940[var7] = var1.method2131();
            if (Statics.field2940[var7] == 0) {
                Statics.field2940[var7] = 1;
            }
        }
        var1.field1894 = 0;
        for (int var8 = 0; var8 < Statics.field1320; var8++) {
            int var9 = Statics.field992[var8];
            int var10 = Statics.field1321[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1319[var8] = var12;
            int var13 = var1.method2127();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2267();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2267();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ex.n(I)V")
    public static void method2736() {
        Statics.field2846 = null;
        Statics.field1317 = null;
        Statics.field992 = null;
        Statics.field1321 = null;
        Statics.field2940 = null;
        Statics.field1319 = (byte[][]) null;
    }
}
