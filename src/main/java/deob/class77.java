package deob;

@ObfuscatedName("bi")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.f(Lfl;IIB)Lci;")
    public static class81 method94(class168 arg0, int arg1, int arg2) {
        return method2082(arg0, arg1, arg2) ? method2970() : null;
    }

    @ObfuscatedName("ae.u(Lfl;III)Lcr;")
    public static class79 method991(class168 arg0, int arg1, int arg2) {
        return method2082(arg0, arg1, arg2) ? method1622() : null;
    }

    @ObfuscatedName("dx.x(Lfl;Lfl;III)Lhv;")
    public static class225 method2645(class168 arg0, class168 arg1, int arg2, int arg3) {
        if (!method2082(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3061(arg2, arg3);
        class225 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class225 var6 = new class225(var4, Statics.field1398, Statics.field1179, Statics.field691, Statics.field745, Statics.field136, Statics.field1401);
            method734();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("client.b(Lfl;Ljava/lang/String;Ljava/lang/String;I)[Lci;")
    public static class81[] method588(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3075(arg1);
        int var4 = arg0.method3076(var3, arg2);
        class81[] var5;
        if (method2082(arg0, var3, var4)) {
            class81[] var6 = new class81[Statics.field1400];
            for (int var7 = 0; var7 < Statics.field1400; var7++) {
                class81 var8 = var6[var7] = new class81();
                var8.field1427 = Statics.field1397;
                var8.field1433 = Statics.field1399;
                var8.field1434 = Statics.field1398[var7];
                var8.field1432 = Statics.field1179[var7];
                var8.field1429 = Statics.field691[var7];
                var8.field1430 = Statics.field745[var7];
                var8.field1428 = Statics.field136;
                var8.field1431 = Statics.field1401[var7];
            }
            method734();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("er.l(Lfl;Ljava/lang/String;Ljava/lang/String;I)Lci;")
    public static class81 method2948(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3075(arg1);
        int var4 = arg0.method3076(var3, arg2);
        return method94(arg0, var3, var4);
    }

    @ObfuscatedName("bp.n(Lfl;Lfl;Ljava/lang/String;Ljava/lang/String;B)Lhv;")
    public static class225 method1111(class168 arg0, class168 arg1, String arg2, String arg3) {
        int var4 = arg0.method3075(arg2);
        int var5 = arg0.method3076(var4, arg3);
        return method2645(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("fk.m(I)Lci;")
    public static class81 method2970() {
        class81 var0 = new class81();
        var0.field1427 = Statics.field1397;
        var0.field1433 = Statics.field1399;
        var0.field1434 = Statics.field1398[0];
        var0.field1432 = Statics.field1179[0];
        var0.field1429 = Statics.field691[0];
        var0.field1430 = Statics.field745[0];
        var0.field1428 = Statics.field136;
        var0.field1431 = Statics.field1401[0];
        method734();
        return var0;
    }

    @ObfuscatedName("l.g(I)[Lcr;")
    public static class79[] method53() {
        class79[] var0 = new class79[Statics.field1400];
        for (int var1 = 0; var1 < Statics.field1400; var1++) {
            class79 var2 = var0[var1] = new class79();
            var2.field1413 = Statics.field1397;
            var2.field1416 = Statics.field1399;
            var2.field1411 = Statics.field1398[var1];
            var2.field1412 = Statics.field1179[var1];
            var2.field1409 = Statics.field691[var1];
            var2.field1415 = Statics.field745[var1];
            int var3 = var2.field1415 * var2.field1409;
            byte[] var4 = Statics.field1401[var1];
            var2.field1410 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1410[var5] = Statics.field136[var4[var5] & 0xFF];
            }
        }
        method734();
        return var0;
    }

    @ObfuscatedName("bn.s(I)Lcr;")
    public static class79 method1622() {
        class79 var0 = new class79();
        var0.field1413 = Statics.field1397;
        var0.field1416 = Statics.field1399;
        var0.field1411 = Statics.field1398[0];
        var0.field1412 = Statics.field1179[0];
        var0.field1409 = Statics.field691[0];
        var0.field1415 = Statics.field745[0];
        int var1 = var0.field1415 * var0.field1409;
        byte[] var2 = Statics.field1401[0];
        var0.field1410 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1410[var3] = Statics.field136[var2[var3] & 0xFF];
        }
        method734();
        return var0;
    }

    @ObfuscatedName("cs.r(Lfl;III)Z")
    public static boolean method2082(class168 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3061(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2678(var3);
            return true;
        }
    }

    @ObfuscatedName("es.k([BS)V")
    public static void method2678(byte[] arg0) {
        class120 var1 = new class120(arg0);
        var1.field1999 = arg0.length - 2;
        Statics.field1400 = var1.method2387();
        Statics.field1398 = new int[Statics.field1400];
        Statics.field1179 = new int[Statics.field1400];
        Statics.field691 = new int[Statics.field1400];
        Statics.field745 = new int[Statics.field1400];
        Statics.field1401 = new byte[Statics.field1400][];
        var1.field1999 = arg0.length - 7 - Statics.field1400 * 8;
        Statics.field1397 = var1.method2387();
        Statics.field1399 = var1.method2387();
        int var2 = (var1.method2385() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1400; var3++) {
            Statics.field1398[var3] = var1.method2387();
        }
        for (int var4 = 0; var4 < Statics.field1400; var4++) {
            Statics.field1179[var4] = var1.method2387();
        }
        for (int var5 = 0; var5 < Statics.field1400; var5++) {
            Statics.field691[var5] = var1.method2387();
        }
        for (int var6 = 0; var6 < Statics.field1400; var6++) {
            Statics.field745[var6] = var1.method2387();
        }
        var1.field1999 = arg0.length - 7 - Statics.field1400 * 8 - (var2 - 1) * 3;
        Statics.field136 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field136[var7] = var1.method2389();
            if (Statics.field136[var7] == 0) {
                Statics.field136[var7] = 1;
            }
        }
        var1.field1999 = 0;
        for (int var8 = 0; var8 < Statics.field1400; var8++) {
            int var9 = Statics.field691[var8];
            int var10 = Statics.field745[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1401[var8] = var12;
            int var13 = var1.method2385();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2369();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2369();
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.o(I)V")
    public static void method734() {
        Statics.field1398 = null;
        Statics.field1179 = null;
        Statics.field691 = null;
        Statics.field745 = null;
        Statics.field136 = null;
        Statics.field1401 = (byte[][]) null;
    }
}
