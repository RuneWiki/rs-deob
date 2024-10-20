package deob;

@ObfuscatedName("cj")
public class class80 {

    public class80() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.i(Lfu;IIS)[Lcs;")
    public static class84[] method2686(class171 arg0, int arg1, int arg2) {
        return method550(arg0, arg1, arg2) ? method148() : null;
    }

    @ObfuscatedName("h.h(Lfu;III)Lcm;")
    public static class82 method14(class171 arg0, int arg1, int arg2) {
        return method550(arg0, arg1, arg2) ? method520() : null;
    }

    @ObfuscatedName("az.e(Lfu;Lfu;IIS)Lhe;")
    public static class228 method966(class171 arg0, class171 arg1, int arg2, int arg3) {
        if (!method550(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3086(arg2, arg3);
        class228 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class228 var6 = new class228(var4, Statics.field1440, Statics.field1439, Statics.field1444, Statics.field1441, Statics.field2093, Statics.field1442);
            method640();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("at.g(Lfu;Ljava/lang/String;Ljava/lang/String;I)[Lcs;")
    public static class84[] method1038(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3098(arg1);
        int var4 = arg0.method3099(var3, arg2);
        return method2686(arg0, var3, var4);
    }

    @ObfuscatedName("ak.n(Lfu;Ljava/lang/String;Ljava/lang/String;B)Lcs;")
    public static class84 method645(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3098(arg1);
        int var4 = arg0.method3099(var3, arg2);
        class84 var5;
        if (method550(arg0, var3, var4)) {
            var5 = method149();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ar.u(Lfu;Ljava/lang/String;Ljava/lang/String;I)[Lcm;")
    public static class82[] method728(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3098(arg1);
        int var4 = arg0.method3099(var3, arg2);
        class82[] var5;
        if (method550(arg0, var3, var4)) {
            var5 = method2189();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ap.d(Lfu;Lfu;Ljava/lang/String;Ljava/lang/String;B)Lhe;")
    public static class228 method854(class171 arg0, class171 arg1, String arg2, String arg3) {
        int var4 = arg0.method3098(arg2);
        int var5 = arg0.method3099(var4, arg3);
        class228 var6;
        if (method550(arg0, var4, var5)) {
            byte[] var7 = arg1.method3086(var4, var5);
            class228 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class228 var9 = new class228(var7, Statics.field1440, Statics.field1439, Statics.field1444, Statics.field1441, Statics.field2093, Statics.field1442);
                method640();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("p.m(I)[Lcs;")
    public static class84[] method148() {
        class84[] var0 = new class84[Statics.field1437];
        for (int var1 = 0; var1 < Statics.field1437; var1++) {
            class84 var2 = var0[var1] = new class84();
            var2.field1473 = Statics.field2714;
            var2.field1480 = Statics.field1436;
            var2.field1478 = Statics.field1440[var1];
            var2.field1477 = Statics.field1439[var1];
            var2.field1475 = Statics.field1444[var1];
            var2.field1476 = Statics.field1441[var1];
            var2.field1474 = Statics.field2093;
            var2.field1479 = Statics.field1442[var1];
        }
        method640();
        return var0;
    }

    @ObfuscatedName("p.j(I)Lcs;")
    public static class84 method149() {
        class84 var0 = new class84();
        var0.field1473 = Statics.field2714;
        var0.field1480 = Statics.field1436;
        var0.field1478 = Statics.field1440[0];
        var0.field1477 = Statics.field1439[0];
        var0.field1475 = Statics.field1444[0];
        var0.field1476 = Statics.field1441[0];
        var0.field1474 = Statics.field2093;
        var0.field1479 = Statics.field1442[0];
        method640();
        return var0;
    }

    @ObfuscatedName("db.y(B)[Lcm;")
    public static class82[] method2189() {
        class82[] var0 = new class82[Statics.field1437];
        for (int var1 = 0; var1 < Statics.field1437; var1++) {
            class82 var2 = var0[var1] = new class82();
            var2.field1454 = Statics.field2714;
            var2.field1460 = Statics.field1436;
            var2.field1459 = Statics.field1440[var1];
            var2.field1458 = Statics.field1439[var1];
            var2.field1455 = Statics.field1444[var1];
            var2.field1456 = Statics.field1441[var1];
            int var3 = var2.field1456 * var2.field1455;
            byte[] var4 = Statics.field1442[var1];
            var2.field1465 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1465[var5] = Statics.field2093[var4[var5] & 0xFF];
            }
        }
        method640();
        return var0;
    }

    @ObfuscatedName("q.s(I)Lcm;")
    public static class82 method520() {
        class82 var0 = new class82();
        var0.field1454 = Statics.field2714;
        var0.field1460 = Statics.field1436;
        var0.field1459 = Statics.field1440[0];
        var0.field1458 = Statics.field1439[0];
        var0.field1455 = Statics.field1444[0];
        var0.field1456 = Statics.field1441[0];
        int var1 = var0.field1456 * var0.field1455;
        byte[] var2 = Statics.field1442[0];
        var0.field1465 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1465[var3] = Statics.field2093[var2[var3] & 0xFF];
        }
        method640();
        return var0;
    }

    @ObfuscatedName("f.p(Lfu;III)Z")
    public static boolean method550(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3086(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method732(var3);
            return true;
        }
    }

    @ObfuscatedName("am.v(Lfu;IB)Z")
    public static boolean method581(class171 arg0, int arg1) {
        byte[] var2 = arg0.method3105(arg1);
        if (var2 == null) {
            return false;
        } else {
            method732(var2);
            return true;
        }
    }

    @ObfuscatedName("ar.r([BB)V")
    public static void method732(byte[] arg0) {
        class123 var1 = new class123(arg0);
        var1.field2046 = arg0.length - 2;
        Statics.field1437 = var1.method2406();
        Statics.field1440 = new int[Statics.field1437];
        Statics.field1439 = new int[Statics.field1437];
        Statics.field1444 = new int[Statics.field1437];
        Statics.field1441 = new int[Statics.field1437];
        Statics.field1442 = new byte[Statics.field1437][];
        var1.field2046 = arg0.length - 7 - Statics.field1437 * 8;
        Statics.field2714 = var1.method2406();
        Statics.field1436 = var1.method2406();
        int var2 = (var1.method2404() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1437; var3++) {
            Statics.field1440[var3] = var1.method2406();
        }
        for (int var4 = 0; var4 < Statics.field1437; var4++) {
            Statics.field1439[var4] = var1.method2406();
        }
        for (int var5 = 0; var5 < Statics.field1437; var5++) {
            Statics.field1444[var5] = var1.method2406();
        }
        for (int var6 = 0; var6 < Statics.field1437; var6++) {
            Statics.field1441[var6] = var1.method2406();
        }
        var1.field2046 = arg0.length - 7 - Statics.field1437 * 8 - (var2 - 1) * 3;
        Statics.field2093 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2093[var7] = var1.method2408();
            if (Statics.field2093[var7] == 0) {
                Statics.field2093[var7] = 1;
            }
        }
        var1.field2046 = 0;
        for (int var8 = 0; var8 < Statics.field1437; var8++) {
            int var9 = Statics.field1444[var8];
            int var10 = Statics.field1441[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1442[var8] = var12;
            int var13 = var1.method2404();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2405();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2405();
                    }
                }
            }
        }
    }

    @ObfuscatedName("af.c(I)V")
    public static void method640() {
        Statics.field1440 = null;
        Statics.field1439 = null;
        Statics.field1444 = null;
        Statics.field1441 = null;
        Statics.field2093 = null;
        Statics.field1442 = (byte[][]) null;
    }
}
