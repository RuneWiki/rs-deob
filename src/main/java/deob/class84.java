package deob;

@ObfuscatedName("cm")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.a(Lev;III)Lcb;")
    public static class87 method1401(class152 arg0, int arg1, int arg2) {
        if (!method123(arg0, arg1, arg2)) {
            return null;
        }
        class87 var3 = new class87();
        var3.field1455 = Statics.field375;
        var3.field1460 = Statics.field1901;
        var3.field1457 = Statics.field1424[0];
        var3.field1458 = Statics.field1425[0];
        var3.field1459 = Statics.field1430[0];
        var3.field1453 = Statics.field1413[0];
        var3.field1456 = Statics.field1427;
        var3.field1454 = Statics.field1428[0];
        Statics.field1424 = null;
        Statics.field1425 = null;
        Statics.field1430 = null;
        Statics.field1413 = null;
        Statics.field1427 = null;
        Statics.field1428 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("dl.r(Lev;IIB)Lct;")
    public static class86 method2327(class152 arg0, int arg1, int arg2) {
        return method123(arg0, arg1, arg2) ? method682() : null;
    }

    @ObfuscatedName("eh.u(Lev;Ljava/lang/String;Ljava/lang/String;I)[Lcb;")
    public static class87[] method2624(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2958(arg1);
        int var4 = arg0.method3006(var3, arg2);
        class87[] var5;
        if (method123(arg0, var3, var4)) {
            class87[] var6 = new class87[Statics.field1433];
            for (int var7 = 0; var7 < Statics.field1433; var7++) {
                class87 var8 = var6[var7] = new class87();
                var8.field1455 = Statics.field375;
                var8.field1460 = Statics.field1901;
                var8.field1457 = Statics.field1424[var7];
                var8.field1458 = Statics.field1425[var7];
                var8.field1459 = Statics.field1430[var7];
                var8.field1453 = Statics.field1413[var7];
                var8.field1456 = Statics.field1427;
                var8.field1454 = Statics.field1428[var7];
            }
            Statics.field1424 = null;
            Statics.field1425 = null;
            Statics.field1430 = null;
            Statics.field1413 = null;
            Statics.field1427 = null;
            Statics.field1428 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("r.t(Lev;Ljava/lang/String;Ljava/lang/String;I)Lcb;")
    public static class87 method7(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2958(arg1);
        int var4 = arg0.method3006(var3, arg2);
        return method1401(arg0, var3, var4);
    }

    @ObfuscatedName("z.k(Lev;Ljava/lang/String;Ljava/lang/String;I)[Lct;")
    public static class86[] method149(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2958(arg1);
        int var4 = arg0.method3006(var3, arg2);
        class86[] var5;
        if (method123(arg0, var3, var4)) {
            var5 = method1415();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("s.x(Lev;Lev;Ljava/lang/String;Ljava/lang/String;I)Lgd;")
    public static class183 method119(class152 arg0, class152 arg1, String arg2, String arg3) {
        int var4 = arg0.method2958(arg2);
        int var5 = arg0.method3006(var4, arg3);
        class183 var6;
        if (method123(arg0, var4, var5)) {
            byte[] var7 = arg1.method2943(var4, var5);
            class183 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class183 var9 = new class183(var7, Statics.field1424, Statics.field1425, Statics.field1430, Statics.field1413, Statics.field1427, Statics.field1428);
                Statics.field1424 = null;
                Statics.field1425 = null;
                Statics.field1430 = null;
                Statics.field1413 = null;
                Statics.field1427 = null;
                Statics.field1428 = (byte[][]) null;
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("bs.v(I)[Lct;")
    public static class86[] method1415() {
        class86[] var0 = new class86[Statics.field1433];
        for (int var1 = 0; var1 < Statics.field1433; var1++) {
            class86 var2 = var0[var1] = new class86();
            var2.field1450 = Statics.field375;
            var2.field1446 = Statics.field1901;
            var2.field1444 = Statics.field1424[var1];
            var2.field1445 = Statics.field1425[var1];
            var2.field1442 = Statics.field1430[var1];
            var2.field1441 = Statics.field1413[var1];
            int var3 = var2.field1442 * var2.field1441;
            byte[] var4 = Statics.field1428[var1];
            var2.field1443 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1443[var5] = Statics.field1427[var4[var5] & 0xFF];
            }
        }
        Statics.field1424 = null;
        Statics.field1425 = null;
        Statics.field1430 = null;
        Statics.field1413 = null;
        Statics.field1427 = null;
        Statics.field1428 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("af.g(I)Lct;")
    public static class86 method682() {
        class86 var0 = new class86();
        var0.field1450 = Statics.field375;
        var0.field1446 = Statics.field1901;
        var0.field1444 = Statics.field1424[0];
        var0.field1445 = Statics.field1425[0];
        var0.field1442 = Statics.field1430[0];
        var0.field1441 = Statics.field1413[0];
        int var1 = var0.field1442 * var0.field1441;
        byte[] var2 = Statics.field1428[0];
        var0.field1443 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1443[var3] = Statics.field1427[var2[var3] & 0xFF];
        }
        Statics.field1424 = null;
        Statics.field1425 = null;
        Statics.field1430 = null;
        Statics.field1413 = null;
        Statics.field1427 = null;
        Statics.field1428 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("b.n(Lev;III)Z")
    public static boolean method123(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2943(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2292(var3);
            return true;
        }
    }

    @ObfuscatedName("t.q(Lev;II)Z")
    public static boolean method28(class152 arg0, int arg1) {
        byte[] var2 = arg0.method2948(arg1);
        if (var2 == null) {
            return false;
        } else {
            method2292(var2);
            return true;
        }
    }

    @ObfuscatedName("dq.i([BI)V")
    public static void method2292(byte[] arg0) {
        class126 var1 = new class126(arg0);
        var1.field2016 = arg0.length - 2;
        Statics.field1433 = var1.method2373();
        Statics.field1424 = new int[Statics.field1433];
        Statics.field1425 = new int[Statics.field1433];
        Statics.field1430 = new int[Statics.field1433];
        Statics.field1413 = new int[Statics.field1433];
        Statics.field1428 = new byte[Statics.field1433][];
        var1.field2016 = arg0.length - 7 - Statics.field1433 * 8;
        Statics.field375 = var1.method2373();
        Statics.field1901 = var1.method2373();
        int var2 = (var1.method2481() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1433; var3++) {
            Statics.field1424[var3] = var1.method2373();
        }
        for (int var4 = 0; var4 < Statics.field1433; var4++) {
            Statics.field1425[var4] = var1.method2373();
        }
        for (int var5 = 0; var5 < Statics.field1433; var5++) {
            Statics.field1430[var5] = var1.method2373();
        }
        for (int var6 = 0; var6 < Statics.field1433; var6++) {
            Statics.field1413[var6] = var1.method2373();
        }
        var1.field2016 = arg0.length - 7 - Statics.field1433 * 8 - (var2 - 1) * 3;
        Statics.field1427 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1427[var7] = var1.method2382();
            if (Statics.field1427[var7] == 0) {
                Statics.field1427[var7] = 1;
            }
        }
        var1.field2016 = 0;
        for (int var8 = 0; var8 < Statics.field1433; var8++) {
            int var9 = Statics.field1430[var8];
            int var10 = Statics.field1413[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1428[var8] = var12;
            int var13 = var1.method2481();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2379();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2379();
                    }
                }
            }
        }
    }
}
