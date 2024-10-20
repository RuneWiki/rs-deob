package deob;

@ObfuscatedName("bj")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cy.f(Lfx;IIB)[Lcu;")
    public static class81[] method1957(class167 arg0, int arg1, int arg2) {
        if (!Statics.method2690(arg0, arg1, arg2)) {
            return null;
        }
        class81[] var3 = new class81[Statics.field1400];
        for (int var4 = 0; var4 < Statics.field1400; var4++) {
            class81 var5 = var3[var4] = new class81();
            var5.field1436 = Statics.field1392;
            var5.field1430 = Statics.field1393;
            var5.field1434 = Statics.field1399[var4];
            var5.field1433 = Statics.field1395[var4];
            var5.field1432 = Statics.field787[var4];
            var5.field1437 = Statics.field1384[var4];
            var5.field1431 = Statics.field210;
            var5.field1435 = Statics.field1223[var4];
        }
        method696();
        return var3;
    }

    @ObfuscatedName("dn.s(Lfx;III)[Lcp;")
    public static class79[] method2554(class167 arg0, int arg1, int arg2) {
        if (!Statics.method2690(arg0, arg1, arg2)) {
            return null;
        }
        class79[] var3 = new class79[Statics.field1400];
        for (int var4 = 0; var4 < Statics.field1400; var4++) {
            class79 var5 = var3[var4] = new class79();
            var5.field1416 = Statics.field1392;
            var5.field1417 = Statics.field1393;
            var5.field1412 = Statics.field1399[var4];
            var5.field1415 = Statics.field1395[var4];
            var5.field1421 = Statics.field787[var4];
            var5.field1413 = Statics.field1384[var4];
            int var6 = var5.field1421 * var5.field1413;
            byte[] var7 = Statics.field1223[var4];
            var5.field1411 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1411[var8] = Statics.field210[var7[var8] & 0xFF];
            }
        }
        method696();
        return var3;
    }

    @ObfuscatedName("da.q(Lfx;Ljava/lang/String;Ljava/lang/String;I)[Lcu;")
    public static class81[] method2619(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3052(arg1);
        int var4 = arg0.method3048(var3, arg2);
        return method1957(arg0, var3, var4);
    }

    @ObfuscatedName("df.g(Lfx;Ljava/lang/String;Ljava/lang/String;I)Lcu;")
    public static class81 method2284(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3052(arg1);
        int var4 = arg0.method3048(var3, arg2);
        class81 var5;
        if (Statics.method2690(arg0, var3, var4)) {
            var5 = method128();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ax.m(Lfx;Ljava/lang/String;Ljava/lang/String;I)[Lcp;")
    public static class79[] method654(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3052(arg1);
        int var4 = arg0.method3048(var3, arg2);
        return method2554(arg0, var3, var4);
    }

    @ObfuscatedName("bk.t(Lfx;II)Lcu;")
    public static class81 method1200(class167 arg0, int arg1) {
        byte[] var2 = arg0.method3043(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method815(var2);
            var3 = true;
        }
        return var3 ? method128() : null;
    }

    @ObfuscatedName("i.j(I)Lcu;")
    public static class81 method128() {
        class81 var0 = new class81();
        var0.field1436 = Statics.field1392;
        var0.field1430 = Statics.field1393;
        var0.field1434 = Statics.field1399[0];
        var0.field1433 = Statics.field1395[0];
        var0.field1432 = Statics.field787[0];
        var0.field1437 = Statics.field1384[0];
        var0.field1431 = Statics.field210;
        var0.field1435 = Statics.field1223[0];
        method696();
        return var0;
    }

    @ObfuscatedName("ha.n(I)Lcp;")
    public static class79 method3724() {
        class79 var0 = new class79();
        var0.field1416 = Statics.field1392;
        var0.field1417 = Statics.field1393;
        var0.field1412 = Statics.field1399[0];
        var0.field1415 = Statics.field1395[0];
        var0.field1421 = Statics.field787[0];
        var0.field1413 = Statics.field1384[0];
        int var1 = var0.field1421 * var0.field1413;
        byte[] var2 = Statics.field1223[0];
        var0.field1411 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1411[var3] = Statics.field210[var2[var3] & 0xFF];
        }
        method696();
        return var0;
    }

    @ObfuscatedName("co.l([BB)Lhb;")
    public static class224 method2153(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class224 var1 = new class224(arg0, Statics.field1399, Statics.field1395, Statics.field787, Statics.field1384, Statics.field210, Statics.field1223);
            method696();
            return var1;
        }
    }

    @ObfuscatedName("am.w([BB)V")
    public static void method815(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1994 = arg0.length - 2;
        Statics.field1400 = var1.method2353();
        Statics.field1399 = new int[Statics.field1400];
        Statics.field1395 = new int[Statics.field1400];
        Statics.field787 = new int[Statics.field1400];
        Statics.field1384 = new int[Statics.field1400];
        Statics.field1223 = new byte[Statics.field1400][];
        var1.field1994 = arg0.length - 7 - Statics.field1400 * 8;
        Statics.field1392 = var1.method2353();
        Statics.field1393 = var1.method2353();
        int var2 = (var1.method2363() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1400; var3++) {
            Statics.field1399[var3] = var1.method2353();
        }
        for (int var4 = 0; var4 < Statics.field1400; var4++) {
            Statics.field1395[var4] = var1.method2353();
        }
        for (int var5 = 0; var5 < Statics.field1400; var5++) {
            Statics.field787[var5] = var1.method2353();
        }
        for (int var6 = 0; var6 < Statics.field1400; var6++) {
            Statics.field1384[var6] = var1.method2353();
        }
        var1.field1994 = arg0.length - 7 - Statics.field1400 * 8 - (var2 - 1) * 3;
        Statics.field210 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field210[var7] = var1.method2414();
            if (Statics.field210[var7] == 0) {
                Statics.field210[var7] = 1;
            }
        }
        var1.field1994 = 0;
        for (int var8 = 0; var8 < Statics.field1400; var8++) {
            int var9 = Statics.field787[var8];
            int var10 = Statics.field1384[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1223[var8] = var12;
            int var13 = var1.method2363();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2364();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2364();
                    }
                }
            }
        }
    }

    @ObfuscatedName("az.v(I)V")
    public static void method696() {
        Statics.field1399 = null;
        Statics.field1395 = null;
        Statics.field787 = null;
        Statics.field1384 = null;
        Statics.field210 = null;
        Statics.field1223 = (byte[][]) null;
    }
}
