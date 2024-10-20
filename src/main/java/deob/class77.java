package deob;

@ObfuscatedName("bx")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ev.y(Lfu;IIB)[Lcr;")
    public static class81[] method2786(class167 arg0, int arg1, int arg2) {
        if (!method994(arg0, arg1, arg2)) {
            return null;
        }
        class81[] var3 = new class81[Statics.field1384];
        for (int var4 = 0; var4 < Statics.field1384; var4++) {
            class81 var5 = var3[var4] = new class81();
            var5.field1425 = Statics.field1754;
            var5.field1427 = Statics.field1559;
            var5.field1424 = Statics.field1108[var4];
            var5.field1420 = Statics.field1386[var4];
            var5.field1422 = Statics.field2122[var4];
            var5.field1423 = Statics.field2209[var4];
            var5.field1421 = Statics.field1989;
            var5.field1426 = Statics.field711[var4];
        }
        method2115();
        return var3;
    }

    @ObfuscatedName("cf.d(Lfu;III)Lcr;")
    public static class81 method2022(class167 arg0, int arg1, int arg2) {
        if (!method994(arg0, arg1, arg2)) {
            return null;
        }
        class81 var3 = new class81();
        var3.field1425 = Statics.field1754;
        var3.field1427 = Statics.field1559;
        var3.field1424 = Statics.field1108[0];
        var3.field1420 = Statics.field1386[0];
        var3.field1422 = Statics.field2122[0];
        var3.field1423 = Statics.field2209[0];
        var3.field1421 = Statics.field1989;
        var3.field1426 = Statics.field711[0];
        method2115();
        return var3;
    }

    @ObfuscatedName("r.g(Lfu;Ljava/lang/String;Ljava/lang/String;B)[Lcr;")
    public static class81[] method195(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3005(arg1);
        int var4 = arg0.method3012(var3, arg2);
        return method2786(arg0, var3, var4);
    }

    @ObfuscatedName("au.w(Lfu;Ljava/lang/String;Ljava/lang/String;I)Lcr;")
    public static class81 method917(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3005(arg1);
        int var4 = arg0.method3012(var3, arg2);
        return method2022(arg0, var3, var4);
    }

    @ObfuscatedName("dm.e(Lfu;Ljava/lang/String;Ljava/lang/String;B)[Lcy;")
    public static class79[] method2569(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3005(arg1);
        int var4 = arg0.method3012(var3, arg2);
        class79[] var5;
        if (method994(arg0, var3, var4)) {
            class79[] var6 = new class79[Statics.field1384];
            for (int var7 = 0; var7 < Statics.field1384; var7++) {
                class79 var8 = var6[var7] = new class79();
                var8.field1406 = Statics.field1754;
                var8.field1407 = Statics.field1559;
                var8.field1411 = Statics.field1108[var7];
                var8.field1405 = Statics.field1386[var7];
                var8.field1402 = Statics.field2122[var7];
                var8.field1409 = Statics.field2209[var7];
                int var9 = var8.field1409 * var8.field1402;
                byte[] var10 = Statics.field711[var7];
                var8.field1408 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1408[var11] = Statics.field1989[var10[var11] & 0xFF];
                }
            }
            method2115();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bk.c(Lfu;Ljava/lang/String;Ljava/lang/String;I)Lcy;")
    public static class79 method1161(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3005(arg1);
        int var4 = arg0.method3012(var3, arg2);
        class79 var5;
        if (method994(arg0, var3, var4)) {
            var5 = method40();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("r.a(I)Lcr;")
    public static class81 method193() {
        class81 var0 = new class81();
        var0.field1425 = Statics.field1754;
        var0.field1427 = Statics.field1559;
        var0.field1424 = Statics.field1108[0];
        var0.field1420 = Statics.field1386[0];
        var0.field1422 = Statics.field2122[0];
        var0.field1423 = Statics.field2209[0];
        var0.field1421 = Statics.field1989;
        var0.field1426 = Statics.field711[0];
        method2115();
        return var0;
    }

    @ObfuscatedName("w.q(B)Lcy;")
    public static class79 method40() {
        class79 var0 = new class79();
        var0.field1406 = Statics.field1754;
        var0.field1407 = Statics.field1559;
        var0.field1411 = Statics.field1108[0];
        var0.field1405 = Statics.field1386[0];
        var0.field1402 = Statics.field2122[0];
        var0.field1409 = Statics.field2209[0];
        int var1 = var0.field1409 * var0.field1402;
        byte[] var2 = Statics.field711[0];
        var0.field1408 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1408[var3] = Statics.field1989[var2[var3] & 0xFF];
        }
        method2115();
        return var0;
    }

    @ObfuscatedName("aa.m([BI)Lhi;")
    public static class224 method622(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class224 var1 = new class224(arg0, Statics.field1108, Statics.field1386, Statics.field2122, Statics.field2209, Statics.field1989, Statics.field711);
            method2115();
            return var1;
        }
    }

    @ObfuscatedName("ax.n(Lfu;III)Z")
    public static boolean method994(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3045(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1011(var3);
            return true;
        }
    }

    @ObfuscatedName("at.k([BI)V")
    public static void method1011(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1973 = arg0.length - 2;
        Statics.field1384 = var1.method2525();
        Statics.field1108 = new int[Statics.field1384];
        Statics.field1386 = new int[Statics.field1384];
        Statics.field2122 = new int[Statics.field1384];
        Statics.field2209 = new int[Statics.field1384];
        Statics.field711 = new byte[Statics.field1384][];
        var1.field1973 = arg0.length - 7 - Statics.field1384 * 8;
        Statics.field1754 = var1.method2525();
        Statics.field1559 = var1.method2525();
        int var2 = (var1.method2326() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1384; var3++) {
            Statics.field1108[var3] = var1.method2525();
        }
        for (int var4 = 0; var4 < Statics.field1384; var4++) {
            Statics.field1386[var4] = var1.method2525();
        }
        for (int var5 = 0; var5 < Statics.field1384; var5++) {
            Statics.field2122[var5] = var1.method2525();
        }
        for (int var6 = 0; var6 < Statics.field1384; var6++) {
            Statics.field2209[var6] = var1.method2525();
        }
        var1.field1973 = arg0.length - 7 - Statics.field1384 * 8 - (var2 - 1) * 3;
        Statics.field1989 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1989[var7] = var1.method2476();
            if (Statics.field1989[var7] == 0) {
                Statics.field1989[var7] = 1;
            }
        }
        var1.field1973 = 0;
        for (int var8 = 0; var8 < Statics.field1384; var8++) {
            int var9 = Statics.field2122[var8];
            int var10 = Statics.field2209[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field711[var8] = var12;
            int var13 = var1.method2326();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2461();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2461();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ca.o(I)V")
    public static void method2115() {
        Statics.field1108 = null;
        Statics.field1386 = null;
        Statics.field2122 = null;
        Statics.field2209 = null;
        Statics.field1989 = null;
        Statics.field711 = (byte[][]) null;
    }
}
