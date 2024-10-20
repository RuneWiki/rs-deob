package deob;

@ObfuscatedName("cb")
public class class83 {

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bi.z(Len;IIB)[Lci;")
    public static class86[] method1353(class150 arg0, int arg1, int arg2) {
        return method1258(arg0, arg1, arg2) ? method2924() : null;
    }

    @ObfuscatedName("bs.h(Len;IIB)[Lcm;")
    public static class85[] method1343(class150 arg0, int arg1, int arg2) {
        return method1258(arg0, arg1, arg2) ? method1826() : null;
    }

    @ObfuscatedName("bo.c(Len;Len;IIB)Lfd;")
    public static class181 method1392(class150 arg0, class150 arg1, int arg2, int arg3) {
        if (!method1258(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method2951(arg2, arg3);
        class181 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class181 var6 = new class181(var4, Statics.field385, Statics.field1446, Statics.field1444, Statics.field250, Statics.field1264, Statics.field1981);
            method59();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("e.p(Len;Ljava/lang/String;Ljava/lang/String;B)[Lci;")
    public static class86[] method144(class150 arg0, String arg1, String arg2) {
        int var3 = arg0.method2966(arg1);
        int var4 = arg0.method2967(var3, arg2);
        return method1353(arg0, var3, var4);
    }

    @ObfuscatedName("z.i(Len;Ljava/lang/String;Ljava/lang/String;I)Lci;")
    public static class86 method4(class150 arg0, String arg1, String arg2) {
        int var3 = arg0.method2966(arg1);
        int var4 = arg0.method2967(var3, arg2);
        class86 var5;
        if (method1258(arg0, var3, var4)) {
            class86 var6 = new class86();
            var6.field1472 = Statics.field1441;
            var6.field1469 = Statics.field1440;
            var6.field1470 = Statics.field385[0];
            var6.field1471 = Statics.field1446[0];
            var6.field1468 = Statics.field1444[0];
            var6.field1473 = Statics.field250[0];
            var6.field1467 = Statics.field1264;
            var6.field1466 = Statics.field1981[0];
            method59();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("de.v(Len;Ljava/lang/String;Ljava/lang/String;I)[Lcm;")
    public static class85[] method2190(class150 arg0, String arg1, String arg2) {
        int var3 = arg0.method2966(arg1);
        int var4 = arg0.method2967(var3, arg2);
        return method1343(arg0, var3, var4);
    }

    @ObfuscatedName("dx.l(Len;Ljava/lang/String;Ljava/lang/String;I)Lcm;")
    public static class85 method2198(class150 arg0, String arg1, String arg2) {
        int var3 = arg0.method2966(arg1);
        int var4 = arg0.method2967(var3, arg2);
        class85 var5;
        if (method1258(arg0, var3, var4)) {
            class85 var6 = new class85();
            var6.field1459 = Statics.field1441;
            var6.field1458 = Statics.field1440;
            var6.field1457 = Statics.field385[0];
            var6.field1464 = Statics.field1446[0];
            var6.field1455 = Statics.field1444[0];
            var6.field1456 = Statics.field250[0];
            int var7 = var6.field1456 * var6.field1455;
            byte[] var8 = Statics.field1981[0];
            var6.field1461 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field1461[var9] = Statics.field1264[var8[var9] & 0xFF];
            }
            method59();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("o.m(Len;II)Lci;")
    public static class86 method120(class150 arg0, int arg1) {
        byte[] var2 = arg0.method2956(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method19(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class86 var4 = new class86();
        var4.field1472 = Statics.field1441;
        var4.field1469 = Statics.field1440;
        var4.field1470 = Statics.field385[0];
        var4.field1471 = Statics.field1446[0];
        var4.field1468 = Statics.field1444[0];
        var4.field1473 = Statics.field250[0];
        var4.field1467 = Statics.field1264;
        var4.field1466 = Statics.field1981[0];
        method59();
        return var4;
    }

    @ObfuscatedName("ea.g(I)[Lci;")
    public static class86[] method2924() {
        class86[] var0 = new class86[Statics.field1443];
        for (int var1 = 0; var1 < Statics.field1443; var1++) {
            class86 var2 = var0[var1] = new class86();
            var2.field1472 = Statics.field1441;
            var2.field1469 = Statics.field1440;
            var2.field1470 = Statics.field385[var1];
            var2.field1471 = Statics.field1446[var1];
            var2.field1468 = Statics.field1444[var1];
            var2.field1473 = Statics.field250[var1];
            var2.field1467 = Statics.field1264;
            var2.field1466 = Statics.field1981[var1];
        }
        method59();
        return var0;
    }

    @ObfuscatedName("cf.t(I)[Lcm;")
    public static class85[] method1826() {
        class85[] var0 = new class85[Statics.field1443];
        for (int var1 = 0; var1 < Statics.field1443; var1++) {
            class85 var2 = var0[var1] = new class85();
            var2.field1459 = Statics.field1441;
            var2.field1458 = Statics.field1440;
            var2.field1457 = Statics.field385[var1];
            var2.field1464 = Statics.field1446[var1];
            var2.field1455 = Statics.field1444[var1];
            var2.field1456 = Statics.field250[var1];
            int var3 = var2.field1456 * var2.field1455;
            byte[] var4 = Statics.field1981[var1];
            var2.field1461 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1461[var5] = Statics.field1264[var4[var5] & 0xFF];
            }
        }
        method59();
        return var0;
    }

    @ObfuscatedName("bu.o(Len;IIS)Z")
    public static boolean method1258(class150 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2951(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method19(var3);
            return true;
        }
    }

    @ObfuscatedName("c.b([BB)V")
    public static void method19(byte[] arg0) {
        class126 var1 = new class126(arg0);
        var1.field2003 = arg0.length - 2;
        Statics.field1443 = var1.method2627();
        Statics.field385 = new int[Statics.field1443];
        Statics.field1446 = new int[Statics.field1443];
        Statics.field1444 = new int[Statics.field1443];
        Statics.field250 = new int[Statics.field1443];
        Statics.field1981 = new byte[Statics.field1443][];
        var1.field2003 = arg0.length - 7 - Statics.field1443 * 8;
        Statics.field1441 = var1.method2627();
        Statics.field1440 = var1.method2627();
        int var2 = (var1.method2450() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1443; var3++) {
            Statics.field385[var3] = var1.method2627();
        }
        for (int var4 = 0; var4 < Statics.field1443; var4++) {
            Statics.field1446[var4] = var1.method2627();
        }
        for (int var5 = 0; var5 < Statics.field1443; var5++) {
            Statics.field1444[var5] = var1.method2627();
        }
        for (int var6 = 0; var6 < Statics.field1443; var6++) {
            Statics.field250[var6] = var1.method2627();
        }
        var1.field2003 = arg0.length - 7 - Statics.field1443 * 8 - (var2 - 1) * 3;
        Statics.field1264 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1264[var7] = var1.method2454();
            if (Statics.field1264[var7] == 0) {
                Statics.field1264[var7] = 1;
            }
        }
        var1.field2003 = 0;
        for (int var8 = 0; var8 < Statics.field1443; var8++) {
            int var9 = Statics.field1444[var8];
            int var10 = Statics.field250[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1981[var8] = var12;
            int var13 = var1.method2450();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2451();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2451();
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.d(I)V")
    public static void method59() {
        Statics.field385 = null;
        Statics.field1446 = null;
        Statics.field1444 = null;
        Statics.field250 = null;
        Statics.field1264 = null;
        Statics.field1981 = (byte[][]) null;
    }
}
