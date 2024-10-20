package deob;

@ObfuscatedName("cs")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.b(Lej;Ljava/lang/String;Ljava/lang/String;I)[Lcy;")
    public static class87[] method2354(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3011(arg1);
        int var4 = arg0.method3012(var3, arg2);
        class87[] var5;
        if (method1355(arg0, var3, var4)) {
            var5 = method1563();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("dz.e(Lej;Ljava/lang/String;Ljava/lang/String;I)Lcy;")
    public static class87 method2377(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3011(arg1);
        int var4 = arg0.method3012(var3, arg2);
        class87 var5;
        if (method1355(arg0, var3, var4)) {
            var5 = method2110();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("cs.g(Lej;Ljava/lang/String;Ljava/lang/String;I)[Lcv;")
    public static class86[] method1648(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3011(arg1);
        int var4 = arg0.method3012(var3, arg2);
        class86[] var5;
        if (method1355(arg0, var3, var4)) {
            var5 = method1383();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("as.o(Lej;Ljava/lang/String;Ljava/lang/String;B)Lcv;")
    public static class86 method543(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3011(arg1);
        int var4 = arg0.method3012(var3, arg2);
        class86 var5;
        if (method1355(arg0, var3, var4)) {
            var5 = method2201();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("aw.a(Lej;IB)Lcy;")
    public static class87 method747(class153 arg0, int arg1) {
        return method2298(arg0, arg1) ? method2110() : null;
    }

    @ObfuscatedName("ch.h(I)[Lcy;")
    public static class87[] method1563() {
        class87[] var0 = new class87[Statics.field1434];
        for (int var1 = 0; var1 < Statics.field1434; var1++) {
            class87 var2 = var0[var1] = new class87();
            var2.field1467 = Statics.field1433;
            var2.field1463 = Statics.field85;
            var2.field1465 = Statics.field2483[var1];
            var2.field1466 = Statics.field1432[var1];
            var2.field1462 = Statics.field125[var1];
            var2.field1464 = Statics.field1435[var1];
            var2.field1461 = Statics.field1436;
            var2.field1468 = Statics.field1437[var1];
        }
        Statics.method2291();
        return var0;
    }

    @ObfuscatedName("ce.j(I)Lcy;")
    public static class87 method2110() {
        class87 var0 = new class87();
        var0.field1467 = Statics.field1433;
        var0.field1463 = Statics.field85;
        var0.field1465 = Statics.field2483[0];
        var0.field1466 = Statics.field1432[0];
        var0.field1462 = Statics.field125[0];
        var0.field1464 = Statics.field1435[0];
        var0.field1461 = Statics.field1436;
        var0.field1468 = Statics.field1437[0];
        Statics.method2291();
        return var0;
    }

    @ObfuscatedName("bm.f(B)[Lcv;")
    public static class86[] method1383() {
        class86[] var0 = new class86[Statics.field1434];
        for (int var1 = 0; var1 < Statics.field1434; var1++) {
            class86 var2 = var0[var1] = new class86();
            var2.field1454 = Statics.field1433;
            var2.field1457 = Statics.field85;
            var2.field1459 = Statics.field2483[var1];
            var2.field1453 = Statics.field1432[var1];
            var2.field1450 = Statics.field125[var1];
            var2.field1451 = Statics.field1435[var1];
            int var3 = var2.field1451 * var2.field1450;
            byte[] var4 = Statics.field1437[var1];
            var2.field1455 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1455[var5] = Statics.field1436[var4[var5] & 0xFF];
            }
        }
        Statics.method2291();
        return var0;
    }

    @ObfuscatedName("di.q(B)Lcv;")
    public static class86 method2201() {
        class86 var0 = new class86();
        var0.field1454 = Statics.field1433;
        var0.field1457 = Statics.field85;
        var0.field1459 = Statics.field2483[0];
        var0.field1453 = Statics.field1432[0];
        var0.field1450 = Statics.field125[0];
        var0.field1451 = Statics.field1435[0];
        int var1 = var0.field1451 * var0.field1450;
        byte[] var2 = Statics.field1437[0];
        var0.field1455 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1455[var3] = Statics.field1436[var2[var3] & 0xFF];
        }
        Statics.method2291();
        return var0;
    }

    @ObfuscatedName("bp.d(Lej;III)Z")
    public static boolean method1355(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3026(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            Statics.method119(var3);
            return true;
        }
    }

    @ObfuscatedName("dy.z(Lej;IB)Z")
    public static boolean method2298(class153 arg0, int arg1) {
        byte[] var2 = arg0.method3037(arg1);
        if (var2 == null) {
            return false;
        } else {
            Statics.method119(var2);
            return true;
        }
    }
}
