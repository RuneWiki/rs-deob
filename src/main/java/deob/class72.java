package deob;

@ObfuscatedName("bx")
public class class72 {

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.n(Lfd;IIB)[Lbd;")
    public static class74[] method24(class158 arg0, int arg1, int arg2) {
        return Statics.method658(arg0, arg1, arg2) ? method933() : null;
    }

    @ObfuscatedName("a.o(Lfd;III)Lbd;")
    public static class74 method16(class158 arg0, int arg1, int arg2) {
        return Statics.method658(arg0, arg1, arg2) ? method949() : null;
    }

    @ObfuscatedName("ai.a(Lfd;Lfd;IIB)Lhe;")
    public static class215 method985(class158 arg0, class158 arg1, int arg2, int arg3) {
        return Statics.method658(arg0, arg2, arg3) ? method1505(arg1.method2925(arg2, arg3)) : null;
    }

    @ObfuscatedName("cf.w(Lfd;Ljava/lang/String;Ljava/lang/String;I)[Lbc;")
    public static class76[] method2158(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2944(arg1);
        int var4 = arg0.method2939(var3, arg2);
        class76[] var5;
        if (Statics.method658(arg0, var3, var4)) {
            var5 = method1514();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ca.m(Lfd;Ljava/lang/String;Ljava/lang/String;B)Lbc;")
    public static class76 method1967(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2944(arg1);
        int var4 = arg0.method2939(var3, arg2);
        class76 var5;
        if (Statics.method658(arg0, var3, var4)) {
            var5 = method575();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("n.h(Lfd;Ljava/lang/String;Ljava/lang/String;I)[Lbd;")
    public static class74[] method4(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2944(arg1);
        int var4 = arg0.method2939(var3, arg2);
        return method24(arg0, var3, var4);
    }

    @ObfuscatedName("al.i(Lfd;Ljava/lang/String;Ljava/lang/String;B)Lbd;")
    public static class74 method645(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2944(arg1);
        int var4 = arg0.method2939(var3, arg2);
        return method16(arg0, var3, var4);
    }

    @ObfuscatedName("u.r(Lfd;Lfd;Ljava/lang/String;Ljava/lang/String;I)Lhe;")
    public static class215 method157(class158 arg0, class158 arg1, String arg2, String arg3) {
        int var4 = arg0.method2944(arg2);
        int var5 = arg0.method2939(var4, arg3);
        return method985(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("be.l(B)[Lbc;")
    public static class76[] method1514() {
        class76[] var0 = new class76[Statics.field1328];
        for (int var1 = 0; var1 < Statics.field1328; var1++) {
            class76 var2 = var0[var1] = new class76();
            var2.field1360 = Statics.field1332;
            var2.field1361 = Statics.field1327;
            var2.field1364 = Statics.field1330[var1];
            var2.field1365 = Statics.field1331[var1];
            var2.field1366 = Statics.field1932[var1];
            var2.field1363 = Statics.field163[var1];
            var2.field1362 = Statics.field1029;
            var2.field1367 = Statics.field559[var1];
        }
        method867();
        return var0;
    }

    @ObfuscatedName("g.f(I)Lbc;")
    public static class76 method575() {
        class76 var0 = new class76();
        var0.field1360 = Statics.field1332;
        var0.field1361 = Statics.field1327;
        var0.field1364 = Statics.field1330[0];
        var0.field1365 = Statics.field1331[0];
        var0.field1366 = Statics.field1932[0];
        var0.field1363 = Statics.field163[0];
        var0.field1362 = Statics.field1029;
        var0.field1367 = Statics.field559[0];
        method867();
        return var0;
    }

    @ObfuscatedName("ad.e(I)[Lbd;")
    public static class74[] method933() {
        class74[] var0 = new class74[Statics.field1328];
        for (int var1 = 0; var1 < Statics.field1328; var1++) {
            class74 var2 = var0[var1] = new class74();
            var2.field1349 = Statics.field1332;
            var2.field1347 = Statics.field1327;
            var2.field1344 = Statics.field1330[var1];
            var2.field1345 = Statics.field1331[var1];
            var2.field1342 = Statics.field1932[var1];
            var2.field1341 = Statics.field163[var1];
            int var3 = var2.field1342 * var2.field1341;
            byte[] var4 = Statics.field559[var1];
            var2.field1348 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1348[var5] = Statics.field1029[var4[var5] & 0xFF];
            }
        }
        method867();
        return var0;
    }

    @ObfuscatedName("ad.z(B)Lbd;")
    public static class74 method949() {
        class74 var0 = new class74();
        var0.field1349 = Statics.field1332;
        var0.field1347 = Statics.field1327;
        var0.field1344 = Statics.field1330[0];
        var0.field1345 = Statics.field1331[0];
        var0.field1342 = Statics.field1932[0];
        var0.field1341 = Statics.field163[0];
        int var1 = var0.field1342 * var0.field1341;
        byte[] var2 = Statics.field559[0];
        var0.field1348 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1348[var3] = Statics.field1029[var2[var3] & 0xFF];
        }
        method867();
        return var0;
    }

    @ObfuscatedName("be.v([BI)Lhe;")
    public static class215 method1505(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class215 var1 = new class215(arg0, Statics.field1330, Statics.field1331, Statics.field1932, Statics.field163, Statics.field1029, Statics.field559);
            method867();
            return var1;
        }
    }

    @ObfuscatedName("br.q([BI)V")
    public static void method1465(byte[] arg0) {
        class111 var1 = new class111(arg0);
        var1.field1890 = arg0.length - 2;
        Statics.field1328 = var1.method2236();
        Statics.field1330 = new int[Statics.field1328];
        Statics.field1331 = new int[Statics.field1328];
        Statics.field1932 = new int[Statics.field1328];
        Statics.field163 = new int[Statics.field1328];
        Statics.field559 = new byte[Statics.field1328][];
        var1.field1890 = arg0.length - 7 - Statics.field1328 * 8;
        Statics.field1332 = var1.method2236();
        Statics.field1327 = var1.method2236();
        int var2 = (var1.method2234() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1328; var3++) {
            Statics.field1330[var3] = var1.method2236();
        }
        for (int var4 = 0; var4 < Statics.field1328; var4++) {
            Statics.field1331[var4] = var1.method2236();
        }
        for (int var5 = 0; var5 < Statics.field1328; var5++) {
            Statics.field1932[var5] = var1.method2236();
        }
        for (int var6 = 0; var6 < Statics.field1328; var6++) {
            Statics.field163[var6] = var1.method2236();
        }
        var1.field1890 = arg0.length - 7 - Statics.field1328 * 8 - (var2 - 1) * 3;
        Statics.field1029 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1029[var7] = var1.method2238();
            if (Statics.field1029[var7] == 0) {
                Statics.field1029[var7] = 1;
            }
        }
        var1.field1890 = 0;
        for (int var8 = 0; var8 < Statics.field1328; var8++) {
            int var9 = Statics.field1932[var8];
            int var10 = Statics.field163[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field559[var8] = var12;
            int var13 = var1.method2234();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2235();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2235();
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.b(I)V")
    public static void method867() {
        Statics.field1330 = null;
        Statics.field1331 = null;
        Statics.field1932 = null;
        Statics.field163 = null;
        Statics.field1029 = null;
        Statics.field559 = (byte[][]) null;
    }
}
