package deob;

@ObfuscatedName("cx")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.y(Lel;III)[Lcj;")
    public static class87[] method203(class152 arg0, int arg1, int arg2) {
        if (!method140(arg0, arg1, arg2)) {
            return null;
        }
        class87[] var3 = new class87[Statics.field1439];
        for (int var4 = 0; var4 < Statics.field1439; var4++) {
            class87 var5 = var3[var4] = new class87();
            var5.field1474 = Statics.field1440;
            var5.field1478 = Statics.field2830;
            var5.field1475 = Statics.field2780[var4];
            var5.field1476 = Statics.field1442[var4];
            var5.field1473 = Statics.field1445[var4];
            var5.field1471 = Statics.field1303[var4];
            var5.field1472 = Statics.field1298;
            var5.field1477 = Statics.field1433[var4];
        }
        method2334();
        return var3;
    }

    @ObfuscatedName("ae.m(Lel;IIB)Lcj;")
    public static class87 method662(class152 arg0, int arg1, int arg2) {
        return method140(arg0, arg1, arg2) ? method215() : null;
    }

    @ObfuscatedName("eq.d(Lel;III)[Lcz;")
    public static class86[] method2966(class152 arg0, int arg1, int arg2) {
        if (!method140(arg0, arg1, arg2)) {
            return null;
        }
        class86[] var3 = new class86[Statics.field1439];
        for (int var4 = 0; var4 < Statics.field1439; var4++) {
            class86 var5 = var3[var4] = new class86();
            var5.field1464 = Statics.field1440;
            var5.field1465 = Statics.field2830;
            var5.field1462 = Statics.field2780[var4];
            var5.field1463 = Statics.field1442[var4];
            var5.field1460 = Statics.field1445[var4];
            var5.field1466 = Statics.field1303[var4];
            int var6 = var5.field1466 * var5.field1460;
            byte[] var7 = Statics.field1433[var4];
            var5.field1459 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1459[var8] = Statics.field1298[var7[var8] & 0xFF];
            }
        }
        method2334();
        return var3;
    }

    @ObfuscatedName("cd.k(Lel;Lel;III)Lge;")
    public static class183 method1592(class152 arg0, class152 arg1, int arg2, int arg3) {
        return method140(arg0, arg2, arg3) ? method34(arg1.method2991(arg2, arg3)) : null;
    }

    @ObfuscatedName("v.s(Lel;Ljava/lang/String;Ljava/lang/String;I)Lcj;")
    public static class87 method194(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3022(arg1);
        int var4 = arg0.method3007(var3, arg2);
        return method662(arg0, var3, var4);
    }

    @ObfuscatedName("m.x(Lel;Ljava/lang/String;Ljava/lang/String;I)[Lcz;")
    public static class86[] method15(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3022(arg1);
        int var4 = arg0.method3007(var3, arg2);
        return method2966(arg0, var3, var4);
    }

    @ObfuscatedName("a.b(Lel;Lel;Ljava/lang/String;Ljava/lang/String;B)Lge;")
    public static class183 method147(class152 arg0, class152 arg1, String arg2, String arg3) {
        int var4 = arg0.method3022(arg2);
        int var5 = arg0.method3007(var4, arg3);
        return method1592(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("e.j(B)Lcj;")
    public static class87 method215() {
        class87 var0 = new class87();
        var0.field1474 = Statics.field1440;
        var0.field1478 = Statics.field2830;
        var0.field1475 = Statics.field2780[0];
        var0.field1476 = Statics.field1442[0];
        var0.field1473 = Statics.field1445[0];
        var0.field1471 = Statics.field1303[0];
        var0.field1472 = Statics.field1298;
        var0.field1477 = Statics.field1433[0];
        method2334();
        return var0;
    }

    @ObfuscatedName("cb.p(B)Lcz;")
    public static class86 method1632() {
        class86 var0 = new class86();
        var0.field1464 = Statics.field1440;
        var0.field1465 = Statics.field2830;
        var0.field1462 = Statics.field2780[0];
        var0.field1463 = Statics.field1442[0];
        var0.field1460 = Statics.field1445[0];
        var0.field1466 = Statics.field1303[0];
        int var1 = var0.field1466 * var0.field1460;
        byte[] var2 = Statics.field1433[0];
        var0.field1459 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1459[var3] = Statics.field1298[var2[var3] & 0xFF];
        }
        method2334();
        return var0;
    }

    @ObfuscatedName("k.l([BS)Lge;")
    public static class183 method34(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class183 var1 = new class183(arg0, Statics.field2780, Statics.field1442, Statics.field1445, Statics.field1303, Statics.field1298, Statics.field1433);
            method2334();
            return var1;
        }
    }

    @ObfuscatedName("a.i(Lel;III)Z")
    public static boolean method140(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2991(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            Statics.method1416(var3);
            return true;
        }
    }

    @ObfuscatedName("bc.r(Lel;II)Z")
    public static boolean method1422(class152 arg0, int arg1) {
        byte[] var2 = arg0.method2996(arg1);
        if (var2 == null) {
            return false;
        } else {
            Statics.method1416(var2);
            return true;
        }
    }

    @ObfuscatedName("dm.c(B)V")
    public static void method2334() {
        Statics.field2780 = null;
        Statics.field1442 = null;
        Statics.field1445 = null;
        Statics.field1303 = null;
        Statics.field1298 = null;
        Statics.field1433 = (byte[][]) null;
    }
}
