package deob;

@ObfuscatedName("ct")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cg.i(Leg;Leg;III)Lgj;")
    public static class183 method1613(class152 arg0, class152 arg1, int arg2, int arg3) {
        return method773(arg0, arg2, arg3) ? method2664(arg1.method2970(arg2, arg3)) : null;
    }

    @ObfuscatedName("p.w(Leg;Ljava/lang/String;Ljava/lang/String;B)[Lcu;")
    public static class87[] method53(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2985(arg1);
        int var4 = arg0.method3004(var3, arg2);
        class87[] var5;
        if (method773(arg0, var3, var4)) {
            var5 = method1404();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bx.f(Leg;Ljava/lang/String;Ljava/lang/String;I)Lcu;")
    public static class87 method1474(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2985(arg1);
        int var4 = arg0.method3004(var3, arg2);
        class87 var5;
        if (method773(arg0, var3, var4)) {
            class87 var6 = new class87();
            var6.field1480 = Statics.field1452;
            var6.field1481 = Statics.field1448;
            var6.field1477 = Statics.field1446[0];
            var6.field1475 = Statics.field2773[0];
            var6.field1476 = Statics.field1933[0];
            var6.field1478 = Statics.field1450[0];
            var6.field1474 = Statics.field879;
            var6.field1479 = Statics.field2445[0];
            method1407();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bz.e(Leg;Ljava/lang/String;Ljava/lang/String;B)[Lcx;")
    public static class86[] method1359(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2985(arg1);
        int var4 = arg0.method3004(var3, arg2);
        class86[] var5;
        if (method773(arg0, var3, var4)) {
            class86[] var6 = new class86[Statics.field1447];
            for (int var7 = 0; var7 < Statics.field1447; var7++) {
                class86 var8 = var6[var7] = new class86();
                var8.field1467 = Statics.field1452;
                var8.field1468 = Statics.field1448;
                var8.field1463 = Statics.field1446[var7];
                var8.field1466 = Statics.field2773[var7];
                var8.field1462 = Statics.field1933[var7];
                var8.field1464 = Statics.field1450[var7];
                int var9 = var8.field1464 * var8.field1462;
                byte[] var10 = Statics.field2445[var7];
                var8.field1471 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1471[var11] = Statics.field879[var10[var11] & 0xFF];
                }
            }
            method1407();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("w.t(Leg;Ljava/lang/String;Ljava/lang/String;I)Lcx;")
    public static class86 method14(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2985(arg1);
        int var4 = arg0.method3004(var3, arg2);
        class86 var5;
        if (method773(arg0, var3, var4)) {
            var5 = method149();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("l.d(Leg;Leg;Ljava/lang/String;Ljava/lang/String;B)Lgj;")
    public static class183 method124(class152 arg0, class152 arg1, String arg2, String arg3) {
        int var4 = arg0.method2985(arg2);
        int var5 = arg0.method3004(var4, arg3);
        return method1613(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("u.p(Leg;II)Lcu;")
    public static class87 method159(class152 arg0, int arg1) {
        if (!method1396(arg0, arg1)) {
            return null;
        }
        class87 var2 = new class87();
        var2.field1480 = Statics.field1452;
        var2.field1481 = Statics.field1448;
        var2.field1477 = Statics.field1446[0];
        var2.field1475 = Statics.field2773[0];
        var2.field1476 = Statics.field1933[0];
        var2.field1478 = Statics.field1450[0];
        var2.field1474 = Statics.field879;
        var2.field1479 = Statics.field2445[0];
        method1407();
        return var2;
    }

    @ObfuscatedName("bk.k(B)[Lcu;")
    public static class87[] method1404() {
        class87[] var0 = new class87[Statics.field1447];
        for (int var1 = 0; var1 < Statics.field1447; var1++) {
            class87 var2 = var0[var1] = new class87();
            var2.field1480 = Statics.field1452;
            var2.field1481 = Statics.field1448;
            var2.field1477 = Statics.field1446[var1];
            var2.field1475 = Statics.field2773[var1];
            var2.field1476 = Statics.field1933[var1];
            var2.field1478 = Statics.field1450[var1];
            var2.field1474 = Statics.field879;
            var2.field1479 = Statics.field2445[var1];
        }
        method1407();
        return var0;
    }

    @ObfuscatedName("z.r(B)Lcx;")
    public static class86 method149() {
        class86 var0 = new class86();
        var0.field1467 = Statics.field1452;
        var0.field1468 = Statics.field1448;
        var0.field1463 = Statics.field1446[0];
        var0.field1466 = Statics.field2773[0];
        var0.field1462 = Statics.field1933[0];
        var0.field1464 = Statics.field1450[0];
        int var1 = var0.field1464 * var0.field1462;
        byte[] var2 = Statics.field2445[0];
        var0.field1471 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1471[var3] = Statics.field879[var2[var3] & 0xFF];
        }
        method1407();
        return var0;
    }

    @ObfuscatedName("eo.l([BI)Lgj;")
    public static class183 method2664(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class183 var1 = new class183(arg0, Statics.field1446, Statics.field2773, Statics.field1933, Statics.field1450, Statics.field879, Statics.field2445);
            method1407();
            return var1;
        }
    }

    @ObfuscatedName("ab.a(Leg;III)Z")
    public static boolean method773(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2970(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method230(var3);
            return true;
        }
    }

    @ObfuscatedName("bk.z(Leg;IB)Z")
    public static boolean method1396(class152 arg0, int arg1) {
        byte[] var2 = arg0.method2975(arg1);
        if (var2 == null) {
            return false;
        } else {
            method230(var2);
            return true;
        }
    }

    @ObfuscatedName("c.s([BB)V")
    public static void method230(byte[] arg0) {
        class127 var1 = new class127(arg0);
        var1.field2045 = arg0.length - 2;
        Statics.field1447 = var1.method2615();
        Statics.field1446 = new int[Statics.field1447];
        Statics.field2773 = new int[Statics.field1447];
        Statics.field1933 = new int[Statics.field1447];
        Statics.field1450 = new int[Statics.field1447];
        Statics.field2445 = new byte[Statics.field1447][];
        var1.field2045 = arg0.length - 7 - Statics.field1447 * 8;
        Statics.field1452 = var1.method2615();
        Statics.field1448 = var1.method2615();
        int var2 = (var1.method2472() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1447; var3++) {
            Statics.field1446[var3] = var1.method2615();
        }
        for (int var4 = 0; var4 < Statics.field1447; var4++) {
            Statics.field2773[var4] = var1.method2615();
        }
        for (int var5 = 0; var5 < Statics.field1447; var5++) {
            Statics.field1933[var5] = var1.method2615();
        }
        for (int var6 = 0; var6 < Statics.field1447; var6++) {
            Statics.field1450[var6] = var1.method2615();
        }
        var1.field2045 = arg0.length - 7 - Statics.field1447 * 8 - (var2 - 1) * 3;
        Statics.field879 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field879[var7] = var1.method2608();
            if (Statics.field879[var7] == 0) {
                Statics.field879[var7] = 1;
            }
        }
        var1.field2045 = 0;
        for (int var8 = 0; var8 < Statics.field1447; var8++) {
            int var9 = Statics.field1933[var8];
            int var10 = Statics.field1450[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2445[var8] = var12;
            int var13 = var1.method2472();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2453();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2453();
                    }
                }
            }
        }
    }

    @ObfuscatedName("bo.m(I)V")
    public static void method1407() {
        Statics.field1446 = null;
        Statics.field2773 = null;
        Statics.field1933 = null;
        Statics.field1450 = null;
        Statics.field879 = null;
        Statics.field2445 = (byte[][]) null;
    }
}
