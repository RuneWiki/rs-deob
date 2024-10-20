package deob;

@ObfuscatedName("cj")
public class class83 {

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bv.v(Ley;Ley;III)Lfb;")
    public static class182 method1408(class151 arg0, class151 arg1, int arg2, int arg3) {
        return method215(arg0, arg2, arg3) ? method1345(arg1.method3020(arg2, arg3)) : null;
    }

    @ObfuscatedName("o.f(Ley;Ljava/lang/String;Ljava/lang/String;I)[Lct;")
    public static class86[] method114(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2976(arg1);
        int var4 = arg0.method3004(var3, arg2);
        class86[] var5;
        if (method215(arg0, var3, var4)) {
            var5 = method783();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("am.n(Ley;Ljava/lang/String;Ljava/lang/String;I)Lct;")
    public static class86 method689(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2976(arg1);
        int var4 = arg0.method3004(var3, arg2);
        class86 var5;
        if (method215(arg0, var3, var4)) {
            class86 var6 = new class86();
            var6.field1455 = Statics.field2018;
            var6.field1462 = Statics.field1429;
            var6.field1461 = Statics.field56[0];
            var6.field1460 = Statics.field2708[0];
            var6.field1459 = Statics.field1091[0];
            var6.field1458 = Statics.field1430[0];
            var6.field1456 = Statics.field1428;
            var6.field1457 = Statics.field850[0];
            method830();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("aa.c(Ley;Ljava/lang/String;Ljava/lang/String;I)[Lcc;")
    public static class85[] method676(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2976(arg1);
        int var4 = arg0.method3004(var3, arg2);
        class85[] var5;
        if (method215(arg0, var3, var4)) {
            var5 = method1561();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("j.r(Ley;II)Lct;")
    public static class86 method183(class151 arg0, int arg1) {
        if (!method160(arg0, arg1)) {
            return null;
        }
        class86 var2 = new class86();
        var2.field1455 = Statics.field2018;
        var2.field1462 = Statics.field1429;
        var2.field1461 = Statics.field56[0];
        var2.field1460 = Statics.field2708[0];
        var2.field1459 = Statics.field1091[0];
        var2.field1458 = Statics.field1430[0];
        var2.field1456 = Statics.field1428;
        var2.field1457 = Statics.field850[0];
        method830();
        return var2;
    }

    @ObfuscatedName("ab.k(I)[Lct;")
    public static class86[] method783() {
        class86[] var0 = new class86[Statics.field1432];
        for (int var1 = 0; var1 < Statics.field1432; var1++) {
            class86 var2 = var0[var1] = new class86();
            var2.field1455 = Statics.field2018;
            var2.field1462 = Statics.field1429;
            var2.field1461 = Statics.field56[var1];
            var2.field1460 = Statics.field2708[var1];
            var2.field1459 = Statics.field1091[var1];
            var2.field1458 = Statics.field1430[var1];
            var2.field1456 = Statics.field1428;
            var2.field1457 = Statics.field850[var1];
        }
        method830();
        return var0;
    }

    @ObfuscatedName("bq.e(B)[Lcc;")
    public static class85[] method1561() {
        class85[] var0 = new class85[Statics.field1432];
        for (int var1 = 0; var1 < Statics.field1432; var1++) {
            class85 var2 = var0[var1] = new class85();
            var2.field1449 = Statics.field2018;
            var2.field1450 = Statics.field1429;
            var2.field1446 = Statics.field56[var1];
            var2.field1443 = Statics.field2708[var1];
            var2.field1444 = Statics.field1091[var1];
            var2.field1453 = Statics.field1430[var1];
            int var3 = var2.field1453 * var2.field1444;
            byte[] var4 = Statics.field850[var1];
            var2.field1448 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1448[var5] = Statics.field1428[var4[var5] & 0xFF];
            }
        }
        method830();
        return var0;
    }

    @ObfuscatedName("by.q([BB)Lfb;")
    public static class182 method1345(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class182 var1 = new class182(arg0, Statics.field56, Statics.field2708, Statics.field1091, Statics.field1430, Statics.field1428, Statics.field850);
            method830();
            return var1;
        }
    }

    @ObfuscatedName("b.u(Ley;III)Z")
    public static boolean method215(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3020(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method217(var3);
            return true;
        }
    }

    @ObfuscatedName("i.s(Ley;IB)Z")
    public static boolean method160(class151 arg0, int arg1) {
        byte[] var2 = arg0.method2967(arg1);
        if (var2 == null) {
            return false;
        } else {
            method217(var2);
            return true;
        }
    }

    @ObfuscatedName("w.l([BS)V")
    public static void method217(byte[] arg0) {
        class126 var1 = new class126(arg0);
        var1.field2027 = arg0.length - 2;
        Statics.field1432 = var1.method2468();
        Statics.field56 = new int[Statics.field1432];
        Statics.field2708 = new int[Statics.field1432];
        Statics.field1091 = new int[Statics.field1432];
        Statics.field1430 = new int[Statics.field1432];
        Statics.field850 = new byte[Statics.field1432][];
        var1.field2027 = arg0.length - 7 - Statics.field1432 * 8;
        Statics.field2018 = var1.method2468();
        Statics.field1429 = var1.method2468();
        int var2 = (var1.method2466() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1432; var3++) {
            Statics.field56[var3] = var1.method2468();
        }
        for (int var4 = 0; var4 < Statics.field1432; var4++) {
            Statics.field2708[var4] = var1.method2468();
        }
        for (int var5 = 0; var5 < Statics.field1432; var5++) {
            Statics.field1091[var5] = var1.method2468();
        }
        for (int var6 = 0; var6 < Statics.field1432; var6++) {
            Statics.field1430[var6] = var1.method2468();
        }
        var1.field2027 = arg0.length - 7 - Statics.field1432 * 8 - (var2 - 1) * 3;
        Statics.field1428 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1428[var7] = var1.method2470();
            if (Statics.field1428[var7] == 0) {
                Statics.field1428[var7] = 1;
            }
        }
        var1.field2027 = 0;
        for (int var8 = 0; var8 < Statics.field1432; var8++) {
            int var9 = Statics.field1091[var8];
            int var10 = Statics.field1430[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field850[var8] = var12;
            int var13 = var1.method2466();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2499();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2499();
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.o(B)V")
    public static void method830() {
        Statics.field56 = null;
        Statics.field2708 = null;
        Statics.field1091 = null;
        Statics.field1430 = null;
        Statics.field1428 = null;
        Statics.field850 = (byte[][]) null;
    }
}
