package deob;

@ObfuscatedName("bc")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.n(Lfm;III)[Lcu;")
    public static class81[] method2284(class167 arg0, int arg1, int arg2) {
        return method544(arg0, arg1, arg2) ? method655() : null;
    }

    @ObfuscatedName("ak.d(Lfm;III)Lcu;")
    public static class81 method876(class167 arg0, int arg1, int arg2) {
        return method544(arg0, arg1, arg2) ? method129() : null;
    }

    @ObfuscatedName("cr.s(Lfm;Lfm;III)Lhr;")
    public static class224 method2121(class167 arg0, class167 arg1, int arg2, int arg3) {
        if (!method544(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3010(arg2, arg3);
        class224 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class224 var6 = new class224(var4, Statics.field1371, Statics.field755, Statics.field2064, Statics.field753, Statics.field1372, Statics.field579);
            method1475();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("fe.q(Lfm;Ljava/lang/String;Ljava/lang/String;I)[Lcu;")
    public static class81[] method3290(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3024(arg1);
        int var4 = arg0.method3026(var3, arg2);
        return method2284(arg0, var3, var4);
    }

    @ObfuscatedName("bf.j(Lfm;Ljava/lang/String;Ljava/lang/String;I)Lcu;")
    public static class81 method1203(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3024(arg1);
        int var4 = arg0.method3026(var3, arg2);
        return method876(arg0, var3, var4);
    }

    @ObfuscatedName("au.k(Lfm;Ljava/lang/String;Ljava/lang/String;B)[Lcy;")
    public static class79[] method719(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3024(arg1);
        int var4 = arg0.method3026(var3, arg2);
        class79[] var5;
        if (method544(arg0, var3, var4)) {
            var5 = method538();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("p.i(Lfm;Ljava/lang/String;Ljava/lang/String;I)Lcy;")
    public static class79 method108(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3024(arg1);
        int var4 = arg0.method3026(var3, arg2);
        class79 var5;
        if (method544(arg0, var3, var4)) {
            class79 var6 = new class79();
            var6.field1400 = Statics.field1368;
            var6.field1396 = Statics.field1369;
            var6.field1395 = Statics.field1371[0];
            var6.field1393 = Statics.field755[0];
            var6.field1391 = Statics.field2064[0];
            var6.field1392 = Statics.field753[0];
            int var7 = var6.field1392 * var6.field1391;
            byte[] var8 = Statics.field579[0];
            var6.field1390 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field1390[var9] = Statics.field1372[var8[var9] & 0xFF];
            }
            method1475();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ds.m(Lfm;IS)Lcu;")
    public static class81 method2613(class167 arg0, int arg1) {
        byte[] var2 = arg0.method3059(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method150(var2);
            var3 = true;
        }
        return var3 ? method129() : null;
    }

    @ObfuscatedName("av.p(S)[Lcu;")
    public static class81[] method655() {
        class81[] var0 = new class81[Statics.field1370];
        for (int var1 = 0; var1 < Statics.field1370; var1++) {
            class81 var2 = var0[var1] = new class81();
            var2.field1415 = Statics.field1368;
            var2.field1413 = Statics.field1369;
            var2.field1409 = Statics.field1371[var1];
            var2.field1414 = Statics.field755[var1];
            var2.field1411 = Statics.field2064[var1];
            var2.field1412 = Statics.field753[var1];
            var2.field1410 = Statics.field1372;
            var2.field1416 = Statics.field579[var1];
        }
        method1475();
        return var0;
    }

    @ObfuscatedName("g.h(I)Lcu;")
    public static class81 method129() {
        class81 var0 = new class81();
        var0.field1415 = Statics.field1368;
        var0.field1413 = Statics.field1369;
        var0.field1409 = Statics.field1371[0];
        var0.field1414 = Statics.field755[0];
        var0.field1411 = Statics.field2064[0];
        var0.field1412 = Statics.field753[0];
        var0.field1410 = Statics.field1372;
        var0.field1416 = Statics.field579[0];
        method1475();
        return var0;
    }

    @ObfuscatedName("client.e(B)[Lcy;")
    public static class79[] method538() {
        class79[] var0 = new class79[Statics.field1370];
        for (int var1 = 0; var1 < Statics.field1370; var1++) {
            class79 var2 = var0[var1] = new class79();
            var2.field1400 = Statics.field1368;
            var2.field1396 = Statics.field1369;
            var2.field1395 = Statics.field1371[var1];
            var2.field1393 = Statics.field755[var1];
            var2.field1391 = Statics.field2064[var1];
            var2.field1392 = Statics.field753[var1];
            int var3 = var2.field1392 * var2.field1391;
            byte[] var4 = Statics.field579[var1];
            var2.field1390 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1390[var5] = Statics.field1372[var4[var5] & 0xFF];
            }
        }
        method1475();
        return var0;
    }

    @ObfuscatedName("v.g(Lfm;III)Z")
    public static boolean method544(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3010(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method150(var3);
            return true;
        }
    }

    @ObfuscatedName("y.b([BB)V")
    public static void method150(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1977 = arg0.length - 2;
        Statics.field1370 = var1.method2377();
        Statics.field1371 = new int[Statics.field1370];
        Statics.field755 = new int[Statics.field1370];
        Statics.field2064 = new int[Statics.field1370];
        Statics.field753 = new int[Statics.field1370];
        Statics.field579 = new byte[Statics.field1370][];
        var1.field1977 = arg0.length - 7 - Statics.field1370 * 8;
        Statics.field1368 = var1.method2377();
        Statics.field1369 = var1.method2377();
        int var2 = (var1.method2338() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1370; var3++) {
            Statics.field1371[var3] = var1.method2377();
        }
        for (int var4 = 0; var4 < Statics.field1370; var4++) {
            Statics.field755[var4] = var1.method2377();
        }
        for (int var5 = 0; var5 < Statics.field1370; var5++) {
            Statics.field2064[var5] = var1.method2377();
        }
        for (int var6 = 0; var6 < Statics.field1370; var6++) {
            Statics.field753[var6] = var1.method2377();
        }
        var1.field1977 = arg0.length - 7 - Statics.field1370 * 8 - (var2 - 1) * 3;
        Statics.field1372 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1372[var7] = var1.method2342();
            if (Statics.field1372[var7] == 0) {
                Statics.field1372[var7] = 1;
            }
        }
        var1.field1977 = 0;
        for (int var8 = 0; var8 < Statics.field1370; var8++) {
            int var9 = Statics.field2064[var8];
            int var10 = Statics.field753[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field579[var8] = var12;
            int var13 = var1.method2338();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2330();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2330();
                    }
                }
            }
        }
    }

    @ObfuscatedName("bk.f(I)V")
    public static void method1475() {
        Statics.field1371 = null;
        Statics.field755 = null;
        Statics.field2064 = null;
        Statics.field753 = null;
        Statics.field1372 = null;
        Statics.field579 = (byte[][]) null;
    }
}
