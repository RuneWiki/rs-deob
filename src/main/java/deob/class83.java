package deob;

@ObfuscatedName("cr")
public class class83 {

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.c(Lew;III)[Lcq;")
    public static class86[] method13(class150 arg0, int arg1, int arg2) {
        if (!method1512(arg0, arg1, arg2)) {
            return null;
        }
        class86[] var3 = new class86[Statics.field1425];
        for (int var4 = 0; var4 < Statics.field1425; var4++) {
            class86 var5 = var3[var4] = new class86();
            var5.field1456 = Statics.field2447;
            var5.field1454 = Statics.field1412;
            var5.field1455 = Statics.field1424[var4];
            var5.field1457 = Statics.field1414[var4];
            var5.field1452 = Statics.field1418[var4];
            var5.field1450 = Statics.field1416[var4];
            var5.field1451 = Statics.field1417;
            var5.field1453 = Statics.field1421[var4];
        }
        Statics.field1424 = null;
        Statics.field1414 = null;
        Statics.field1418 = null;
        Statics.field1416 = null;
        Statics.field1417 = null;
        Statics.field1421 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("ca.j(Lew;Lew;III)Lfx;")
    public static class181 method1757(class150 arg0, class150 arg1, int arg2, int arg3) {
        if (!method1512(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method2821(arg2, arg3);
        class181 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class181 var6 = new class181(var4, Statics.field1424, Statics.field1414, Statics.field1418, Statics.field1416, Statics.field1417, Statics.field1421);
            Statics.field1424 = null;
            Statics.field1414 = null;
            Statics.field1418 = null;
            Statics.field1416 = null;
            Statics.field1417 = null;
            Statics.field1421 = (byte[][]) null;
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("cy.f(Lew;Ljava/lang/String;Ljava/lang/String;I)[Lcq;")
    public static class86[] method1559(class150 arg0, String arg1, String arg2) {
        int var3 = arg0.method2836(arg1);
        int var4 = arg0.method2844(var3, arg2);
        return method13(arg0, var3, var4);
    }

    @ObfuscatedName("m.y(Lew;Ljava/lang/String;Ljava/lang/String;I)Lcq;")
    public static class86 method49(class150 arg0, String arg1, String arg2) {
        int var3 = arg0.method2836(arg1);
        int var4 = arg0.method2844(var3, arg2);
        class86 var5;
        if (method1512(arg0, var3, var4)) {
            class86 var6 = new class86();
            var6.field1456 = Statics.field2447;
            var6.field1454 = Statics.field1412;
            var6.field1455 = Statics.field1424[0];
            var6.field1457 = Statics.field1414[0];
            var6.field1452 = Statics.field1418[0];
            var6.field1450 = Statics.field1416[0];
            var6.field1451 = Statics.field1417;
            var6.field1453 = Statics.field1421[0];
            Statics.field1424 = null;
            Statics.field1414 = null;
            Statics.field1418 = null;
            Statics.field1416 = null;
            Statics.field1417 = null;
            Statics.field1421 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("j.x(Lew;Ljava/lang/String;Ljava/lang/String;I)[Lcu;")
    public static class85[] method11(class150 arg0, String arg1, String arg2) {
        int var3 = arg0.method2836(arg1);
        int var4 = arg0.method2844(var3, arg2);
        class85[] var5;
        if (method1512(arg0, var3, var4)) {
            var5 = method788();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ad.e(Lew;Ljava/lang/String;Ljava/lang/String;S)Lcu;")
    public static class85 method527(class150 arg0, String arg1, String arg2) {
        int var3 = arg0.method2836(arg1);
        int var4 = arg0.method2844(var3, arg2);
        class85 var5;
        if (method1512(arg0, var3, var4)) {
            class85 var6 = new class85();
            var6.field1443 = Statics.field2447;
            var6.field1438 = Statics.field1412;
            var6.field1441 = Statics.field1424[0];
            var6.field1442 = Statics.field1414[0];
            var6.field1439 = Statics.field1418[0];
            var6.field1440 = Statics.field1416[0];
            int var7 = var6.field1440 * var6.field1439;
            byte[] var8 = Statics.field1421[0];
            var6.field1449 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field1449[var9] = Statics.field1417[var8[var9] & 0xFF];
            }
            Statics.field1424 = null;
            Statics.field1414 = null;
            Statics.field1418 = null;
            Statics.field1416 = null;
            Statics.field1417 = null;
            Statics.field1421 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("am.m(Lew;Lew;Ljava/lang/String;Ljava/lang/String;I)Lfx;")
    public static class181 method809(class150 arg0, class150 arg1, String arg2, String arg3) {
        int var4 = arg0.method2836(arg2);
        int var5 = arg0.method2844(var4, arg3);
        return method1757(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("ag.s(I)[Lcu;")
    public static class85[] method788() {
        class85[] var0 = new class85[Statics.field1425];
        for (int var1 = 0; var1 < Statics.field1425; var1++) {
            class85 var2 = var0[var1] = new class85();
            var2.field1443 = Statics.field2447;
            var2.field1438 = Statics.field1412;
            var2.field1441 = Statics.field1424[var1];
            var2.field1442 = Statics.field1414[var1];
            var2.field1439 = Statics.field1418[var1];
            var2.field1440 = Statics.field1416[var1];
            int var3 = var2.field1440 * var2.field1439;
            byte[] var4 = Statics.field1421[var1];
            var2.field1449 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1449[var5] = Statics.field1417[var4[var5] & 0xFF];
            }
        }
        Statics.field1424 = null;
        Statics.field1414 = null;
        Statics.field1418 = null;
        Statics.field1416 = null;
        Statics.field1417 = null;
        Statics.field1421 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("cd.p(Lew;IIB)Z")
    public static boolean method1512(class150 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2821(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1921(var3);
            return true;
        }
    }

    @ObfuscatedName("h.w(Lew;IB)Z")
    public static boolean method127(class150 arg0, int arg1) {
        byte[] var2 = arg0.method2826(arg1);
        if (var2 == null) {
            return false;
        } else {
            method1921(var2);
            return true;
        }
    }

    @ObfuscatedName("co.r([BI)V")
    public static void method1921(byte[] arg0) {
        class125 var1 = new class125(arg0);
        var1.field2003 = arg0.length - 2;
        Statics.field1425 = var1.method2328();
        Statics.field1424 = new int[Statics.field1425];
        Statics.field1414 = new int[Statics.field1425];
        Statics.field1418 = new int[Statics.field1425];
        Statics.field1416 = new int[Statics.field1425];
        Statics.field1421 = new byte[Statics.field1425][];
        var1.field2003 = arg0.length - 7 - Statics.field1425 * 8;
        Statics.field2447 = var1.method2328();
        Statics.field1412 = var1.method2328();
        int var2 = (var1.method2326() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1425; var3++) {
            Statics.field1424[var3] = var1.method2328();
        }
        for (int var4 = 0; var4 < Statics.field1425; var4++) {
            Statics.field1414[var4] = var1.method2328();
        }
        for (int var5 = 0; var5 < Statics.field1425; var5++) {
            Statics.field1418[var5] = var1.method2328();
        }
        for (int var6 = 0; var6 < Statics.field1425; var6++) {
            Statics.field1416[var6] = var1.method2328();
        }
        var1.field2003 = arg0.length - 7 - Statics.field1425 * 8 - (var2 - 1) * 3;
        Statics.field1417 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1417[var7] = var1.method2330();
            if (Statics.field1417[var7] == 0) {
                Statics.field1417[var7] = 1;
            }
        }
        var1.field2003 = 0;
        for (int var8 = 0; var8 < Statics.field1425; var8++) {
            int var9 = Statics.field1418[var8];
            int var10 = Statics.field1416[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1421[var8] = var12;
            int var13 = var1.method2326();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2347();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2347();
                    }
                }
            }
        }
    }
}
