package deob;

@ObfuscatedName("bu")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.m(Lfx;IIB)Lcc;")
    public static class81 method1035(class167 arg0, int arg1, int arg2) {
        return method615(arg0, arg1, arg2) ? method589() : null;
    }

    @ObfuscatedName("cj.l(Lfx;IIB)[Lcs;")
    public static class79[] method2076(class167 arg0, int arg1, int arg2) {
        return method615(arg0, arg1, arg2) ? method265() : null;
    }

    @ObfuscatedName("fb.u(Lfx;Lfx;III)Lht;")
    public static class224 method3274(class167 arg0, class167 arg1, int arg2, int arg3) {
        if (!method615(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3080(arg2, arg3);
        class224 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class224 var6 = new class224(var4, Statics.field1338, Statics.field1343, Statics.field1342, Statics.field1347, Statics.field150, Statics.field2633);
            method1634();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("ag.k(Lfx;Ljava/lang/String;Ljava/lang/String;I)[Lcc;")
    public static class81[] method990(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3081(arg1);
        int var4 = arg0.method3116(var3, arg2);
        class81[] var5;
        if (method615(arg0, var3, var4)) {
            var5 = method2265();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fm.j(Lfx;Ljava/lang/String;Ljava/lang/String;I)Lcc;")
    public static class81 method3190(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3081(arg1);
        int var4 = arg0.method3116(var3, arg2);
        return method1035(arg0, var3, var4);
    }

    @ObfuscatedName("aj.i(Lfx;Ljava/lang/String;Ljava/lang/String;I)[Lcs;")
    public static class79[] method774(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3081(arg1);
        int var4 = arg0.method3116(var3, arg2);
        return method2076(arg0, var3, var4);
    }

    @ObfuscatedName("aw.x(Lfx;Lfx;Ljava/lang/String;Ljava/lang/String;B)Lht;")
    public static class224 method925(class167 arg0, class167 arg1, String arg2, String arg3) {
        int var4 = arg0.method3081(arg2);
        int var5 = arg0.method3116(var4, arg3);
        return method3274(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("dr.g(S)[Lcc;")
    public static class81[] method2265() {
        class81[] var0 = new class81[Statics.field2891];
        for (int var1 = 0; var1 < Statics.field2891; var1++) {
            class81 var2 = var0[var1] = new class81();
            var2.field1379 = Statics.field1346;
            var2.field1375 = Statics.field1339;
            var2.field1377 = Statics.field1338[var1];
            var2.field1378 = Statics.field1343[var1];
            var2.field1376 = Statics.field1342[var1];
            var2.field1374 = Statics.field1347[var1];
            var2.field1373 = Statics.field150;
            var2.field1380 = Statics.field2633[var1];
        }
        method1634();
        return var0;
    }

    @ObfuscatedName("q.e(I)Lcc;")
    public static class81 method589() {
        class81 var0 = new class81();
        var0.field1379 = Statics.field1346;
        var0.field1375 = Statics.field1339;
        var0.field1377 = Statics.field1338[0];
        var0.field1378 = Statics.field1343[0];
        var0.field1376 = Statics.field1342[0];
        var0.field1374 = Statics.field1347[0];
        var0.field1373 = Statics.field150;
        var0.field1380 = Statics.field2633[0];
        method1634();
        return var0;
    }

    @ObfuscatedName("client.p(S)[Lcs;")
    public static class79[] method265() {
        class79[] var0 = new class79[Statics.field2891];
        for (int var1 = 0; var1 < Statics.field2891; var1++) {
            class79 var2 = var0[var1] = new class79();
            var2.field1365 = Statics.field1346;
            var2.field1360 = Statics.field1339;
            var2.field1357 = Statics.field1338[var1];
            var2.field1358 = Statics.field1343[var1];
            var2.field1359 = Statics.field1342[var1];
            var2.field1356 = Statics.field1347[var1];
            int var3 = var2.field1359 * var2.field1356;
            byte[] var4 = Statics.field2633[var1];
            var2.field1355 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1355[var5] = Statics.field150[var4[var5] & 0xFF];
            }
        }
        method1634();
        return var0;
    }

    @ObfuscatedName("w.a(Lfx;III)Z")
    public static boolean method615(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3080(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method574(var3);
            return true;
        }
    }

    @ObfuscatedName("client.v([BI)V")
    public static void method574(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1955 = arg0.length - 2;
        Statics.field2891 = var1.method2541();
        Statics.field1338 = new int[Statics.field2891];
        Statics.field1343 = new int[Statics.field2891];
        Statics.field1342 = new int[Statics.field2891];
        Statics.field1347 = new int[Statics.field2891];
        Statics.field2633 = new byte[Statics.field2891][];
        var1.field1955 = arg0.length - 7 - Statics.field2891 * 8;
        Statics.field1346 = var1.method2541();
        Statics.field1339 = var1.method2541();
        int var2 = (var1.method2562() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field2891; var3++) {
            Statics.field1338[var3] = var1.method2541();
        }
        for (int var4 = 0; var4 < Statics.field2891; var4++) {
            Statics.field1343[var4] = var1.method2541();
        }
        for (int var5 = 0; var5 < Statics.field2891; var5++) {
            Statics.field1342[var5] = var1.method2541();
        }
        for (int var6 = 0; var6 < Statics.field2891; var6++) {
            Statics.field1347[var6] = var1.method2541();
        }
        var1.field1955 = arg0.length - 7 - Statics.field2891 * 8 - (var2 - 1) * 3;
        Statics.field150 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field150[var7] = var1.method2385();
            if (Statics.field150[var7] == 0) {
                Statics.field150[var7] = 1;
            }
        }
        var1.field1955 = 0;
        for (int var8 = 0; var8 < Statics.field2891; var8++) {
            int var9 = Statics.field1342[var8];
            int var10 = Statics.field1347[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2633[var8] = var12;
            int var13 = var1.method2562();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2382();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2382();
                    }
                }
            }
        }
    }

    @ObfuscatedName("bf.c(I)V")
    public static void method1634() {
        Statics.field1338 = null;
        Statics.field1343 = null;
        Statics.field1342 = null;
        Statics.field1347 = null;
        Statics.field150 = null;
        Statics.field2633 = (byte[][]) null;
    }
}
