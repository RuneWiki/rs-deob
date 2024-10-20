package deob;

@ObfuscatedName("bo")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.j(Lff;III)[Lch;")
    public static class81[] method2023(class167 arg0, int arg1, int arg2) {
        if (!method147(arg0, arg1, arg2)) {
            return null;
        }
        class81[] var3 = new class81[Statics.field1396];
        for (int var4 = 0; var4 < Statics.field1396; var4++) {
            class81 var5 = var3[var4] = new class81();
            var5.field1436 = Statics.field1391;
            var5.field1437 = Statics.field1392;
            var5.field1434 = Statics.field1393[var4];
            var5.field1431 = Statics.field1885[var4];
            var5.field1432 = Statics.field3154[var4];
            var5.field1435 = Statics.field2231[var4];
            var5.field1433 = Statics.field2049;
            var5.field1430 = Statics.field978[var4];
        }
        Statics.field1393 = null;
        Statics.field1885 = null;
        Statics.field3154 = null;
        Statics.field2231 = null;
        Statics.field2049 = null;
        Statics.field978 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("ac.l(Lff;III)Lcr;")
    public static class79 method682(class167 arg0, int arg1, int arg2) {
        return method147(arg0, arg1, arg2) ? method2021() : null;
    }

    @ObfuscatedName("bp.a(Lff;Lff;IIB)Lhg;")
    public static class224 method1540(class167 arg0, class167 arg1, int arg2, int arg3) {
        return method147(arg0, arg2, arg3) ? method53(arg1.method3005(arg2, arg3)) : null;
    }

    @ObfuscatedName("fp.i(Lff;Ljava/lang/String;Ljava/lang/String;B)[Lch;")
    public static class81[] method2929(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3039(arg1);
        int var4 = arg0.method3029(var3, arg2);
        return method2023(arg0, var3, var4);
    }

    @ObfuscatedName("aj.f(Lff;Ljava/lang/String;Ljava/lang/String;I)Lch;")
    public static class81 method1034(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3039(arg1);
        int var4 = arg0.method3029(var3, arg2);
        class81 var5;
        if (method147(arg0, var3, var4)) {
            class81 var6 = new class81();
            var6.field1436 = Statics.field1391;
            var6.field1437 = Statics.field1392;
            var6.field1434 = Statics.field1393[0];
            var6.field1431 = Statics.field1885[0];
            var6.field1432 = Statics.field3154[0];
            var6.field1435 = Statics.field2231[0];
            var6.field1433 = Statics.field2049;
            var6.field1430 = Statics.field978[0];
            Statics.field1393 = null;
            Statics.field1885 = null;
            Statics.field3154 = null;
            Statics.field2231 = null;
            Statics.field2049 = null;
            Statics.field978 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("dx.m(Lff;Ljava/lang/String;Ljava/lang/String;I)[Lcr;")
    public static class79[] method2617(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3039(arg1);
        int var4 = arg0.method3029(var3, arg2);
        class79[] var5;
        if (method147(arg0, var3, var4)) {
            class79[] var6 = new class79[Statics.field1396];
            for (int var7 = 0; var7 < Statics.field1396; var7++) {
                class79 var8 = var6[var7] = new class79();
                var8.field1422 = Statics.field1391;
                var8.field1417 = Statics.field1392;
                var8.field1414 = Statics.field1393[var7];
                var8.field1421 = Statics.field1885[var7];
                var8.field1412 = Statics.field3154[var7];
                var8.field1415 = Statics.field2231[var7];
                int var9 = var8.field1415 * var8.field1412;
                byte[] var10 = Statics.field978[var7];
                var8.field1413 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1413[var11] = Statics.field2049[var10[var11] & 0xFF];
                }
            }
            Statics.field1393 = null;
            Statics.field1885 = null;
            Statics.field3154 = null;
            Statics.field2231 = null;
            Statics.field2049 = null;
            Statics.field978 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fm.o(Lff;IB)Lch;")
    public static class81 method3132(class167 arg0, int arg1) {
        if (!method25(arg0, arg1)) {
            return null;
        }
        class81 var2 = new class81();
        var2.field1436 = Statics.field1391;
        var2.field1437 = Statics.field1392;
        var2.field1434 = Statics.field1393[0];
        var2.field1431 = Statics.field1885[0];
        var2.field1432 = Statics.field3154[0];
        var2.field1435 = Statics.field2231[0];
        var2.field1433 = Statics.field2049;
        var2.field1430 = Statics.field978[0];
        Statics.field1393 = null;
        Statics.field1885 = null;
        Statics.field3154 = null;
        Statics.field2231 = null;
        Statics.field2049 = null;
        Statics.field978 = (byte[][]) null;
        return var2;
    }

    @ObfuscatedName("ct.h(I)Lcr;")
    public static class79 method2021() {
        class79 var0 = new class79();
        var0.field1422 = Statics.field1391;
        var0.field1417 = Statics.field1392;
        var0.field1414 = Statics.field1393[0];
        var0.field1421 = Statics.field1885[0];
        var0.field1412 = Statics.field3154[0];
        var0.field1415 = Statics.field2231[0];
        int var1 = var0.field1415 * var0.field1412;
        byte[] var2 = Statics.field978[0];
        var0.field1413 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1413[var3] = Statics.field2049[var2[var3] & 0xFF];
        }
        Statics.field1393 = null;
        Statics.field1885 = null;
        Statics.field3154 = null;
        Statics.field2231 = null;
        Statics.field2049 = null;
        Statics.field978 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("m.n([BI)Lhg;")
    public static class224 method53(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class224 var1 = new class224(arg0, Statics.field1393, Statics.field1885, Statics.field3154, Statics.field2231, Statics.field2049, Statics.field978);
        Statics.field1393 = null;
        Statics.field1885 = null;
        Statics.field3154 = null;
        Statics.field2231 = null;
        Statics.field2049 = null;
        Statics.field978 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("b.k(Lff;III)Z")
    public static boolean method147(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3005(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1021(var3);
            return true;
        }
    }

    @ObfuscatedName("a.r(Lff;II)Z")
    public static boolean method25(class167 arg0, int arg1) {
        byte[] var2 = arg0.method3010(arg1);
        if (var2 == null) {
            return false;
        } else {
            method1021(var2);
            return true;
        }
    }

    @ObfuscatedName("aj.b([BB)V")
    public static void method1021(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1999 = arg0.length - 2;
        Statics.field1396 = var1.method2318();
        Statics.field1393 = new int[Statics.field1396];
        Statics.field1885 = new int[Statics.field1396];
        Statics.field3154 = new int[Statics.field1396];
        Statics.field2231 = new int[Statics.field1396];
        Statics.field978 = new byte[Statics.field1396][];
        var1.field1999 = arg0.length - 7 - Statics.field1396 * 8;
        Statics.field1391 = var1.method2318();
        Statics.field1392 = var1.method2318();
        int var2 = (var1.method2316() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1396; var3++) {
            Statics.field1393[var3] = var1.method2318();
        }
        for (int var4 = 0; var4 < Statics.field1396; var4++) {
            Statics.field1885[var4] = var1.method2318();
        }
        for (int var5 = 0; var5 < Statics.field1396; var5++) {
            Statics.field3154[var5] = var1.method2318();
        }
        for (int var6 = 0; var6 < Statics.field1396; var6++) {
            Statics.field2231[var6] = var1.method2318();
        }
        var1.field1999 = arg0.length - 7 - Statics.field1396 * 8 - (var2 - 1) * 3;
        Statics.field2049 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2049[var7] = var1.method2416();
            if (Statics.field2049[var7] == 0) {
                Statics.field2049[var7] = 1;
            }
        }
        var1.field1999 = 0;
        for (int var8 = 0; var8 < Statics.field1396; var8++) {
            int var9 = Statics.field3154[var8];
            int var10 = Statics.field2231[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field978[var8] = var12;
            int var13 = var1.method2316();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2317();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2317();
                    }
                }
            }
        }
    }
}
