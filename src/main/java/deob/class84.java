package deob;

@ObfuscatedName("cb")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.j(Lez;III)Lcl;")
    public static class87 method796(class152 arg0, int arg1, int arg2) {
        return method30(arg0, arg1, arg2) ? method1669() : null;
    }

    @ObfuscatedName("eo.r(Lez;III)[Lci;")
    public static class86[] method2669(class152 arg0, int arg1, int arg2) {
        return method30(arg0, arg1, arg2) ? method13() : null;
    }

    @ObfuscatedName("bu.v(Lez;III)Lci;")
    public static class86 method1339(class152 arg0, int arg1, int arg2) {
        if (!method30(arg0, arg1, arg2)) {
            return null;
        }
        class86 var3 = new class86();
        var3.field1450 = Statics.field1427;
        var3.field1451 = Statics.field1431;
        var3.field1445 = Statics.field1429[0];
        var3.field1449 = Statics.field1430[0];
        var3.field1448 = Statics.field1426[0];
        var3.field1456 = Statics.field1432[0];
        int var4 = var3.field1456 * var3.field1448;
        byte[] var5 = Statics.field110[0];
        var3.field1446 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1446[var6] = Statics.field55[var5[var6] & 0xFF];
        }
        method806();
        return var3;
    }

    @ObfuscatedName("l.p(Lez;Ljava/lang/String;Ljava/lang/String;I)[Lcl;")
    public static class87[] method197(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2974(arg1);
        int var4 = arg0.method2975(var3, arg2);
        class87[] var5;
        if (method30(arg0, var3, var4)) {
            class87[] var6 = new class87[Statics.field1435];
            for (int var7 = 0; var7 < Statics.field1435; var7++) {
                class87 var8 = var6[var7] = new class87();
                var8.field1457 = Statics.field1427;
                var8.field1463 = Statics.field1431;
                var8.field1461 = Statics.field1429[var7];
                var8.field1462 = Statics.field1430[var7];
                var8.field1459 = Statics.field1426[var7];
                var8.field1458 = Statics.field1432[var7];
                var8.field1464 = Statics.field55;
                var8.field1460 = Statics.field110[var7];
            }
            method806();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("e.e(Lez;Ljava/lang/String;Ljava/lang/String;I)Lcl;")
    public static class87 method40(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2974(arg1);
        int var4 = arg0.method2975(var3, arg2);
        return method796(arg0, var3, var4);
    }

    @ObfuscatedName("a.d(Lez;Ljava/lang/String;Ljava/lang/String;I)[Lci;")
    public static class86[] method165(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2974(arg1);
        int var4 = arg0.method2975(var3, arg2);
        return method2669(arg0, var3, var4);
    }

    @ObfuscatedName("a.y(Lez;Ljava/lang/String;Ljava/lang/String;I)Lci;")
    public static class86 method163(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2974(arg1);
        int var4 = arg0.method2975(var3, arg2);
        return method1339(arg0, var3, var4);
    }

    @ObfuscatedName("cm.x(Lez;II)Lcl;")
    public static class87 method2129(class152 arg0, int arg1) {
        byte[] var2 = arg0.method2964(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            Statics.method631(var2);
            var3 = true;
        }
        return var3 ? method1669() : null;
    }

    @ObfuscatedName("cg.t(I)Lcl;")
    public static class87 method1669() {
        class87 var0 = new class87();
        var0.field1457 = Statics.field1427;
        var0.field1463 = Statics.field1431;
        var0.field1461 = Statics.field1429[0];
        var0.field1462 = Statics.field1430[0];
        var0.field1459 = Statics.field1426[0];
        var0.field1458 = Statics.field1432[0];
        var0.field1464 = Statics.field55;
        var0.field1460 = Statics.field110[0];
        method806();
        return var0;
    }

    @ObfuscatedName("r.i(I)[Lci;")
    public static class86[] method13() {
        class86[] var0 = new class86[Statics.field1435];
        for (int var1 = 0; var1 < Statics.field1435; var1++) {
            class86 var2 = var0[var1] = new class86();
            var2.field1450 = Statics.field1427;
            var2.field1451 = Statics.field1431;
            var2.field1445 = Statics.field1429[var1];
            var2.field1449 = Statics.field1430[var1];
            var2.field1448 = Statics.field1426[var1];
            var2.field1456 = Statics.field1432[var1];
            int var3 = var2.field1456 * var2.field1448;
            byte[] var4 = Statics.field110[var1];
            var2.field1446 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1446[var5] = Statics.field55[var4[var5] & 0xFF];
            }
        }
        method806();
        return var0;
    }

    @ObfuscatedName("v.z(Lez;IIB)Z")
    public static boolean method30(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3016(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            Statics.method631(var3);
            return true;
        }
    }

    @ObfuscatedName("aj.u(I)V")
    public static void method806() {
        Statics.field1429 = null;
        Statics.field1430 = null;
        Statics.field1426 = null;
        Statics.field1432 = null;
        Statics.field55 = null;
        Statics.field110 = (byte[][]) null;
    }
}
