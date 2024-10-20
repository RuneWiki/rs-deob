package deob;

@ObfuscatedName("br")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.w(Lfx;III)[Lca;")
    public static class81[] method93(class168 arg0, int arg1, int arg2) {
        if (!method2604(arg0, arg1, arg2)) {
            return null;
        }
        class81[] var3 = new class81[Statics.field2923];
        for (int var4 = 0; var4 < Statics.field2923; var4++) {
            class81 var5 = var3[var4] = new class81();
            var5.field1427 = Statics.field1388;
            var5.field1423 = Statics.field1386;
            var5.field1425 = Statics.field1393[var4];
            var5.field1421 = Statics.field1389[var4];
            var5.field1426 = Statics.field1390[var4];
            var5.field1424 = Statics.field1391[var4];
            var5.field1422 = Statics.field1392;
            var5.field1428 = Statics.field181[var4];
        }
        method579();
        return var3;
    }

    @ObfuscatedName("z.x(Lfx;III)Lca;")
    public static class81 method124(class168 arg0, int arg1, int arg2) {
        return method2604(arg0, arg1, arg2) ? method2751() : null;
    }

    @ObfuscatedName("ag.t(Lfx;III)[Lcv;")
    public static class79[] method801(class168 arg0, int arg1, int arg2) {
        return method2604(arg0, arg1, arg2) ? method591() : null;
    }

    @ObfuscatedName("u.p(Lfx;III)Lcv;")
    public static class79 method181(class168 arg0, int arg1, int arg2) {
        return method2604(arg0, arg1, arg2) ? method666() : null;
    }

    @ObfuscatedName("ak.e(Lfx;Lfx;III)Lhg;")
    public static class225 method932(class168 arg0, class168 arg1, int arg2, int arg3) {
        return method2604(arg0, arg2, arg3) ? method925(arg1.method3127(arg2, arg3)) : null;
    }

    @ObfuscatedName("bp.y(Lfx;Ljava/lang/String;Ljava/lang/String;I)[Lca;")
    public static class81[] method1199(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3095(arg1);
        int var4 = arg0.method3081(var3, arg2);
        return method93(arg0, var3, var4);
    }

    @ObfuscatedName("dj.m(Lfx;Ljava/lang/String;Ljava/lang/String;B)Lca;")
    public static class81 method2668(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3095(arg1);
        int var4 = arg0.method3081(var3, arg2);
        return method124(arg0, var3, var4);
    }

    @ObfuscatedName("n.c(Lfx;Ljava/lang/String;Ljava/lang/String;B)[Lcv;")
    public static class79[] method595(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3095(arg1);
        int var4 = arg0.method3081(var3, arg2);
        return method801(arg0, var3, var4);
    }

    @ObfuscatedName("do.v(Lfx;Lfx;Ljava/lang/String;Ljava/lang/String;I)Lhg;")
    public static class225 method2248(class168 arg0, class168 arg1, String arg2, String arg3) {
        int var4 = arg0.method3095(arg2);
        int var5 = arg0.method3081(var4, arg3);
        return method932(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("u.l(Lfx;IB)Lca;")
    public static class81 method178(class168 arg0, int arg1) {
        return method2287(arg0, arg1) ? method2751() : null;
    }

    @ObfuscatedName("es.z(I)Lca;")
    public static class81 method2751() {
        class81 var0 = new class81();
        var0.field1427 = Statics.field1388;
        var0.field1423 = Statics.field1386;
        var0.field1425 = Statics.field1393[0];
        var0.field1421 = Statics.field1389[0];
        var0.field1426 = Statics.field1390[0];
        var0.field1424 = Statics.field1391[0];
        var0.field1422 = Statics.field1392;
        var0.field1428 = Statics.field181[0];
        method579();
        return var0;
    }

    @ObfuscatedName("r.s(B)[Lcv;")
    public static class79[] method591() {
        class79[] var0 = new class79[Statics.field2923];
        for (int var1 = 0; var1 < Statics.field2923; var1++) {
            class79 var2 = var0[var1] = new class79();
            var2.field1402 = Statics.field1388;
            var2.field1410 = Statics.field1386;
            var2.field1405 = Statics.field1393[var1];
            var2.field1406 = Statics.field1389[var1];
            var2.field1403 = Statics.field1390[var1];
            var2.field1404 = Statics.field1391[var1];
            int var3 = var2.field1404 * var2.field1403;
            byte[] var4 = Statics.field181[var1];
            var2.field1407 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1407[var5] = Statics.field1392[var4[var5] & 0xFF];
            }
        }
        method579();
        return var0;
    }

    @ObfuscatedName("ai.j(I)Lcv;")
    public static class79 method666() {
        class79 var0 = new class79();
        var0.field1402 = Statics.field1388;
        var0.field1410 = Statics.field1386;
        var0.field1405 = Statics.field1393[0];
        var0.field1406 = Statics.field1389[0];
        var0.field1403 = Statics.field1390[0];
        var0.field1404 = Statics.field1391[0];
        int var1 = var0.field1404 * var0.field1403;
        byte[] var2 = Statics.field181[0];
        var0.field1407 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1407[var3] = Statics.field1392[var2[var3] & 0xFF];
        }
        method579();
        return var0;
    }

    @ObfuscatedName("ak.q([BS)Lhg;")
    public static class225 method925(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class225 var1 = new class225(arg0, Statics.field1393, Statics.field1389, Statics.field1390, Statics.field1391, Statics.field1392, Statics.field181);
            method579();
            return var1;
        }
    }

    @ObfuscatedName("dt.a(Lfx;III)Z")
    public static boolean method2604(class168 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3127(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2946(var3);
            return true;
        }
    }

    @ObfuscatedName("dd.d(Lfx;II)Z")
    public static boolean method2287(class168 arg0, int arg1) {
        byte[] var2 = arg0.method3085(arg1);
        if (var2 == null) {
            return false;
        } else {
            method2946(var2);
            return true;
        }
    }

    @ObfuscatedName("ev.u([BB)V")
    public static void method2946(byte[] arg0) {
        class120 var1 = new class120(arg0);
        var1.field2012 = arg0.length - 2;
        Statics.field2923 = var1.method2365();
        Statics.field1393 = new int[Statics.field2923];
        Statics.field1389 = new int[Statics.field2923];
        Statics.field1390 = new int[Statics.field2923];
        Statics.field1391 = new int[Statics.field2923];
        Statics.field181 = new byte[Statics.field2923][];
        var1.field2012 = arg0.length - 7 - Statics.field2923 * 8;
        Statics.field1388 = var1.method2365();
        Statics.field1386 = var1.method2365();
        int var2 = (var1.method2363() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field2923; var3++) {
            Statics.field1393[var3] = var1.method2365();
        }
        for (int var4 = 0; var4 < Statics.field2923; var4++) {
            Statics.field1389[var4] = var1.method2365();
        }
        for (int var5 = 0; var5 < Statics.field2923; var5++) {
            Statics.field1390[var5] = var1.method2365();
        }
        for (int var6 = 0; var6 < Statics.field2923; var6++) {
            Statics.field1391[var6] = var1.method2365();
        }
        var1.field2012 = arg0.length - 7 - Statics.field2923 * 8 - (var2 - 1) * 3;
        Statics.field1392 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1392[var7] = var1.method2367();
            if (Statics.field1392[var7] == 0) {
                Statics.field1392[var7] = 1;
            }
        }
        var1.field2012 = 0;
        for (int var8 = 0; var8 < Statics.field2923; var8++) {
            int var9 = Statics.field1390[var8];
            int var10 = Statics.field1391[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field181[var8] = var12;
            int var13 = var1.method2363();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2381();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2381();
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.i(B)V")
    public static void method579() {
        Statics.field1393 = null;
        Statics.field1389 = null;
        Statics.field1390 = null;
        Statics.field1391 = null;
        Statics.field1392 = null;
        Statics.field181 = (byte[][]) null;
    }
}
