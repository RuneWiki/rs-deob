package deob;

@ObfuscatedName("cg")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("et.g(Leo;III)[Lcp;")
    public static class87[] method2678(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2968(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method1573(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class87[] var5 = new class87[Statics.field1450];
        for (int var6 = 0; var6 < Statics.field1450; var6++) {
            class87 var7 = var5[var6] = new class87();
            var7.field1478 = Statics.field1447;
            var7.field1476 = Statics.field1448;
            var7.field1480 = Statics.field1449[var6];
            var7.field1481 = Statics.field1446[var6];
            var7.field1483 = Statics.field1451[var6];
            var7.field1479 = Statics.field1452[var6];
            var7.field1477 = Statics.field748;
            var7.field1482 = Statics.field1453[var6];
        }
        method3144();
        return var5;
    }

    @ObfuscatedName("s.r(Leo;IIB)Lcu;")
    public static class86 method47(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2968(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method1573(var3);
            var4 = true;
        }
        return var4 ? method1566() : null;
    }

    @ObfuscatedName("d.n(Leo;Leo;IIB)Lgb;")
    public static class183 method56(class152 arg0, class152 arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method2968(arg2, arg3);
        boolean var5;
        if (var4 == null) {
            var5 = false;
        } else {
            method1573(var4);
            var5 = true;
        }
        if (!var5) {
            return null;
        }
        byte[] var6 = arg1.method2968(arg2, arg3);
        class183 var7;
        if (var6 == null) {
            var7 = null;
        } else {
            class183 var8 = new class183(var6, Statics.field1449, Statics.field1446, Statics.field1451, Statics.field1452, Statics.field748, Statics.field1453);
            method3144();
            var7 = var8;
        }
        return var7;
    }

    @ObfuscatedName("dj.w(Leo;Ljava/lang/String;Ljava/lang/String;B)Lcu;")
    public static class86 method2192(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3015(arg1);
        int var4 = arg0.method2984(var3, arg2);
        return method47(arg0, var3, var4);
    }

    @ObfuscatedName("x.d(Leo;II)Lcp;")
    public static class87 method156(class152 arg0, int arg1) {
        return method2165(arg0, arg1) ? method1432() : null;
    }

    @ObfuscatedName("bj.t(B)Lcp;")
    public static class87 method1432() {
        class87 var0 = new class87();
        var0.field1478 = Statics.field1447;
        var0.field1476 = Statics.field1448;
        var0.field1480 = Statics.field1449[0];
        var0.field1481 = Statics.field1446[0];
        var0.field1483 = Statics.field1451[0];
        var0.field1479 = Statics.field1452[0];
        var0.field1477 = Statics.field748;
        var0.field1482 = Statics.field1453[0];
        method3144();
        return var0;
    }

    @ObfuscatedName("bb.f(I)Lcu;")
    public static class86 method1566() {
        class86 var0 = new class86();
        var0.field1469 = Statics.field1447;
        var0.field1464 = Statics.field1448;
        var0.field1467 = Statics.field1449[0];
        var0.field1468 = Statics.field1446[0];
        var0.field1474 = Statics.field1451[0];
        var0.field1465 = Statics.field1452[0];
        int var1 = var0.field1474 * var0.field1465;
        byte[] var2 = Statics.field1453[0];
        var0.field1470 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1470[var3] = Statics.field748[var2[var3] & 0xFF];
        }
        method3144();
        return var0;
    }

    @ObfuscatedName("dy.b(Leo;II)Z")
    public static boolean method2165(class152 arg0, int arg1) {
        byte[] var2 = arg0.method2973(arg1);
        if (var2 == null) {
            return false;
        } else {
            method1573(var2);
            return true;
        }
    }

    @ObfuscatedName("ca.z([BB)V")
    public static void method1573(byte[] arg0) {
        class127 var1 = new class127(arg0);
        var1.field2023 = arg0.length - 2;
        Statics.field1450 = var1.method2416();
        Statics.field1449 = new int[Statics.field1450];
        Statics.field1446 = new int[Statics.field1450];
        Statics.field1451 = new int[Statics.field1450];
        Statics.field1452 = new int[Statics.field1450];
        Statics.field1453 = new byte[Statics.field1450][];
        var1.field2023 = arg0.length - 7 - Statics.field1450 * 8;
        Statics.field1447 = var1.method2416();
        Statics.field1448 = var1.method2416();
        int var2 = (var1.method2414() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1450; var3++) {
            Statics.field1449[var3] = var1.method2416();
        }
        for (int var4 = 0; var4 < Statics.field1450; var4++) {
            Statics.field1446[var4] = var1.method2416();
        }
        for (int var5 = 0; var5 < Statics.field1450; var5++) {
            Statics.field1451[var5] = var1.method2416();
        }
        for (int var6 = 0; var6 < Statics.field1450; var6++) {
            Statics.field1452[var6] = var1.method2416();
        }
        var1.field2023 = arg0.length - 7 - Statics.field1450 * 8 - (var2 - 1) * 3;
        Statics.field748 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field748[var7] = var1.method2479();
            if (Statics.field748[var7] == 0) {
                Statics.field748[var7] = 1;
            }
        }
        var1.field2023 = 0;
        for (int var8 = 0; var8 < Statics.field1450; var8++) {
            int var9 = Statics.field1451[var8];
            int var10 = Statics.field1452[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1453[var8] = var12;
            int var13 = var1.method2414();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2415();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2415();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ft.l(I)V")
    public static void method3144() {
        Statics.field1449 = null;
        Statics.field1446 = null;
        Statics.field1451 = null;
        Statics.field1452 = null;
        Statics.field748 = null;
        Statics.field1453 = (byte[][]) null;
    }
}
