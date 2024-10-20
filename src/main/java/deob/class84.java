package deob;

@ObfuscatedName("cu")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.p(Leh;III)[Lct;")
    public static class87[] method99(class153 arg0, int arg1, int arg2) {
        return method24(arg0, arg1, arg2) ? method145() : null;
    }

    @ObfuscatedName("ap.l(Leh;IIB)Lct;")
    public static class87 method547(class153 arg0, int arg1, int arg2) {
        if (!method24(arg0, arg1, arg2)) {
            return null;
        }
        class87 var3 = new class87();
        var3.field1477 = Statics.field1449;
        var3.field1478 = Statics.field1440;
        var3.field1471 = Statics.field1441[0];
        var3.field1473 = Statics.field1442[0];
        var3.field1474 = Statics.field1443[0];
        var3.field1475 = Statics.field1444[0];
        var3.field1472 = Statics.field1445;
        var3.field1476 = Statics.field1439[0];
        method828();
        return var3;
    }

    @ObfuscatedName("b.d(Leh;III)[Lcv;")
    public static class86[] method154(class153 arg0, int arg1, int arg2) {
        if (!method24(arg0, arg1, arg2)) {
            return null;
        }
        class86[] var3 = new class86[Statics.field1438];
        for (int var4 = 0; var4 < Statics.field1438; var4++) {
            class86 var5 = var3[var4] = new class86();
            var5.field1464 = Statics.field1449;
            var5.field1465 = Statics.field1440;
            var5.field1462 = Statics.field1441[var4];
            var5.field1463 = Statics.field1442[var4];
            var5.field1460 = Statics.field1443[var4];
            var5.field1461 = Statics.field1444[var4];
            int var6 = var5.field1461 * var5.field1460;
            byte[] var7 = Statics.field1439[var4];
            var5.field1459 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1459[var8] = Statics.field1445[var7[var8] & 0xFF];
            }
        }
        method828();
        return var3;
    }

    @ObfuscatedName("p.x(Leh;Ljava/lang/String;Ljava/lang/String;B)[Lct;")
    public static class87[] method2(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3093(arg1);
        int var4 = arg0.method3094(var3, arg2);
        return method99(arg0, var3, var4);
    }

    @ObfuscatedName("bs.o(Leh;Ljava/lang/String;Ljava/lang/String;I)Lct;")
    public static class87 method1593(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3093(arg1);
        int var4 = arg0.method3094(var3, arg2);
        return method547(arg0, var3, var4);
    }

    @ObfuscatedName("de.a(Leh;Ljava/lang/String;Ljava/lang/String;I)[Lcv;")
    public static class86[] method2338(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3093(arg1);
        int var4 = arg0.method3094(var3, arg2);
        return method154(arg0, var3, var4);
    }

    @ObfuscatedName("af.w(Leh;Ljava/lang/String;Ljava/lang/String;I)Lcv;")
    public static class86 method221(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3093(arg1);
        int var4 = arg0.method3094(var3, arg2);
        class86 var5;
        if (method24(arg0, var3, var4)) {
            var5 = method1363();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("c.i(I)[Lct;")
    public static class87[] method145() {
        class87[] var0 = new class87[Statics.field1438];
        for (int var1 = 0; var1 < Statics.field1438; var1++) {
            class87 var2 = var0[var1] = new class87();
            var2.field1477 = Statics.field1449;
            var2.field1478 = Statics.field1440;
            var2.field1471 = Statics.field1441[var1];
            var2.field1473 = Statics.field1442[var1];
            var2.field1474 = Statics.field1443[var1];
            var2.field1475 = Statics.field1444[var1];
            var2.field1472 = Statics.field1445;
            var2.field1476 = Statics.field1439[var1];
        }
        method828();
        return var0;
    }

    @ObfuscatedName("bw.y(B)Lcv;")
    public static class86 method1363() {
        class86 var0 = new class86();
        var0.field1464 = Statics.field1449;
        var0.field1465 = Statics.field1440;
        var0.field1462 = Statics.field1441[0];
        var0.field1463 = Statics.field1442[0];
        var0.field1460 = Statics.field1443[0];
        var0.field1461 = Statics.field1444[0];
        int var1 = var0.field1461 * var0.field1460;
        byte[] var2 = Statics.field1439[0];
        var0.field1459 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1459[var3] = Statics.field1445[var2[var3] & 0xFF];
        }
        method828();
        return var0;
    }

    @ObfuscatedName("x.u(Leh;III)Z")
    public static boolean method24(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3078(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method156(var3);
            return true;
        }
    }

    @ObfuscatedName("bz.s(Leh;II)Z")
    public static boolean method1627(class153 arg0, int arg1) {
        byte[] var2 = arg0.method3083(arg1);
        if (var2 == null) {
            return false;
        } else {
            method156(var2);
            return true;
        }
    }

    @ObfuscatedName("b.e([BI)V")
    public static void method156(byte[] arg0) {
        class127 var1 = new class127(arg0);
        var1.field2030 = arg0.length - 2;
        Statics.field1438 = var1.method2581();
        Statics.field1441 = new int[Statics.field1438];
        Statics.field1442 = new int[Statics.field1438];
        Statics.field1443 = new int[Statics.field1438];
        Statics.field1444 = new int[Statics.field1438];
        Statics.field1439 = new byte[Statics.field1438][];
        var1.field2030 = arg0.length - 7 - Statics.field1438 * 8;
        Statics.field1449 = var1.method2581();
        Statics.field1440 = var1.method2581();
        int var2 = (var1.method2498() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1438; var3++) {
            Statics.field1441[var3] = var1.method2581();
        }
        for (int var4 = 0; var4 < Statics.field1438; var4++) {
            Statics.field1442[var4] = var1.method2581();
        }
        for (int var5 = 0; var5 < Statics.field1438; var5++) {
            Statics.field1443[var5] = var1.method2581();
        }
        for (int var6 = 0; var6 < Statics.field1438; var6++) {
            Statics.field1444[var6] = var1.method2581();
        }
        var1.field2030 = arg0.length - 7 - Statics.field1438 * 8 - (var2 - 1) * 3;
        Statics.field1445 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1445[var7] = var1.method2502();
            if (Statics.field1445[var7] == 0) {
                Statics.field1445[var7] = 1;
            }
        }
        var1.field2030 = 0;
        for (int var8 = 0; var8 < Statics.field1438; var8++) {
            int var9 = Statics.field1443[var8];
            int var10 = Statics.field1444[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1439[var8] = var12;
            int var13 = var1.method2498();
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

    @ObfuscatedName("al.r(I)V")
    public static void method828() {
        Statics.field1441 = null;
        Statics.field1442 = null;
        Statics.field1443 = null;
        Statics.field1444 = null;
        Statics.field1445 = null;
        Statics.field1439 = (byte[][]) null;
    }
}
