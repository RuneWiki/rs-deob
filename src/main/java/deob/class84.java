package deob;

@ObfuscatedName("cb")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eq.l(Lem;IIB)Lcv;")
    public static class87 method2724(class154 arg0, int arg1, int arg2) {
        if (!method96(arg0, arg1, arg2)) {
            return null;
        }
        class87 var3 = new class87();
        var3.field1471 = Statics.field1441;
        var3.field1476 = Statics.field1443;
        var3.field1474 = Statics.field2476[0];
        var3.field1469 = Statics.field2749[0];
        var3.field1473 = Statics.field1442[0];
        var3.field1472 = Statics.field1445[0];
        var3.field1470 = Statics.field1258;
        var3.field1475 = Statics.field2469[0];
        method1333();
        return var3;
    }

    @ObfuscatedName("an.b(Lem;III)[Lch;")
    public static class86[] method574(class154 arg0, int arg1, int arg2) {
        if (!method96(arg0, arg1, arg2)) {
            return null;
        }
        class86[] var3 = new class86[Statics.field1449];
        for (int var4 = 0; var4 < Statics.field1449; var4++) {
            class86 var5 = var3[var4] = new class86();
            var5.field1462 = Statics.field1441;
            var5.field1463 = Statics.field1443;
            var5.field1460 = Statics.field2476[var4];
            var5.field1467 = Statics.field2749[var4];
            var5.field1458 = Statics.field1442[var4];
            var5.field1459 = Statics.field1445[var4];
            int var6 = var5.field1459 * var5.field1458;
            byte[] var7 = Statics.field2469[var4];
            var5.field1464 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1464[var8] = Statics.field1258[var7[var8] & 0xFF];
            }
        }
        method1333();
        return var3;
    }

    @ObfuscatedName("am.o(Lem;Lem;IIB)Lgv;")
    public static class184 method837(class154 arg0, class154 arg1, int arg2, int arg3) {
        return method96(arg0, arg2, arg3) ? method167(arg1.method3029(arg2, arg3)) : null;
    }

    @ObfuscatedName("bq.w(Lem;Ljava/lang/String;Ljava/lang/String;I)[Lcv;")
    public static class87[] method1561(class154 arg0, String arg1, String arg2) {
        int var3 = arg0.method3062(arg1);
        int var4 = arg0.method3044(var3, arg2);
        class87[] var5;
        if (method96(arg0, var3, var4)) {
            var5 = Statics.method137();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("u.r(Lem;Ljava/lang/String;Ljava/lang/String;B)Lcv;")
    public static class87 method168(class154 arg0, String arg1, String arg2) {
        int var3 = arg0.method3062(arg1);
        int var4 = arg0.method3044(var3, arg2);
        return method2724(arg0, var3, var4);
    }

    @ObfuscatedName("gd.k(Lem;Ljava/lang/String;Ljava/lang/String;B)[Lch;")
    public static class86[] method3386(class154 arg0, String arg1, String arg2) {
        int var3 = arg0.method3062(arg1);
        int var4 = arg0.method3044(var3, arg2);
        return method574(arg0, var3, var4);
    }

    @ObfuscatedName("cn.z(Lem;Ljava/lang/String;Ljava/lang/String;I)Lch;")
    public static class86 method1601(class154 arg0, String arg1, String arg2) {
        int var3 = arg0.method3062(arg1);
        int var4 = arg0.method3044(var3, arg2);
        class86 var5;
        if (method96(arg0, var3, var4)) {
            class86 var6 = new class86();
            var6.field1462 = Statics.field1441;
            var6.field1463 = Statics.field1443;
            var6.field1460 = Statics.field2476[0];
            var6.field1467 = Statics.field2749[0];
            var6.field1458 = Statics.field1442[0];
            var6.field1459 = Statics.field1445[0];
            int var7 = var6.field1459 * var6.field1458;
            byte[] var8 = Statics.field2469[0];
            var6.field1464 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field1464[var9] = Statics.field1258[var8[var9] & 0xFF];
            }
            method1333();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ab.g(Lem;Lem;Ljava/lang/String;Ljava/lang/String;I)Lgv;")
    public static class184 method899(class154 arg0, class154 arg1, String arg2, String arg3) {
        int var4 = arg0.method3062(arg2);
        int var5 = arg0.method3044(var4, arg3);
        return method837(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("bc.n(Lem;II)Lcv;")
    public static class87 method1370(class154 arg0, int arg1) {
        byte[] var2 = arg0.method3034(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method1377(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class87 var4 = new class87();
        var4.field1471 = Statics.field1441;
        var4.field1476 = Statics.field1443;
        var4.field1474 = Statics.field2476[0];
        var4.field1469 = Statics.field2749[0];
        var4.field1473 = Statics.field1442[0];
        var4.field1472 = Statics.field1445[0];
        var4.field1470 = Statics.field1258;
        var4.field1475 = Statics.field2469[0];
        method1333();
        return var4;
    }

    @ObfuscatedName("u.c([BB)Lgv;")
    public static class184 method167(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class184 var1 = new class184(arg0, Statics.field2476, Statics.field2749, Statics.field1442, Statics.field1445, Statics.field1258, Statics.field2469);
            method1333();
            return var1;
        }
    }

    @ObfuscatedName("n.m(Lem;IIB)Z")
    public static boolean method96(class154 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3029(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1377(var3);
            return true;
        }
    }

    @ObfuscatedName("br.a([BI)V")
    public static void method1377(byte[] arg0) {
        class127 var1 = new class127(arg0);
        var1.field2022 = arg0.length - 2;
        Statics.field1449 = var1.method2442();
        Statics.field2476 = new int[Statics.field1449];
        Statics.field2749 = new int[Statics.field1449];
        Statics.field1442 = new int[Statics.field1449];
        Statics.field1445 = new int[Statics.field1449];
        Statics.field2469 = new byte[Statics.field1449][];
        var1.field2022 = arg0.length - 7 - Statics.field1449 * 8;
        Statics.field1441 = var1.method2442();
        Statics.field1443 = var1.method2442();
        int var2 = (var1.method2440() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1449; var3++) {
            Statics.field2476[var3] = var1.method2442();
        }
        for (int var4 = 0; var4 < Statics.field1449; var4++) {
            Statics.field2749[var4] = var1.method2442();
        }
        for (int var5 = 0; var5 < Statics.field1449; var5++) {
            Statics.field1442[var5] = var1.method2442();
        }
        for (int var6 = 0; var6 < Statics.field1449; var6++) {
            Statics.field1445[var6] = var1.method2442();
        }
        var1.field2022 = arg0.length - 7 - Statics.field1449 * 8 - (var2 - 1) * 3;
        Statics.field1258 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1258[var7] = var1.method2441();
            if (Statics.field1258[var7] == 0) {
                Statics.field1258[var7] = 1;
            }
        }
        var1.field2022 = 0;
        for (int var8 = 0; var8 < Statics.field1449; var8++) {
            int var9 = Statics.field1442[var8];
            int var10 = Statics.field1445[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2469[var8] = var12;
            int var13 = var1.method2440();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2438();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2438();
                    }
                }
            }
        }
    }

    @ObfuscatedName("be.e(I)V")
    public static void method1333() {
        Statics.field2476 = null;
        Statics.field2749 = null;
        Statics.field1442 = null;
        Statics.field1445 = null;
        Statics.field1258 = null;
        Statics.field2469 = (byte[][]) null;
    }
}
