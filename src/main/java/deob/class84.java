package deob;

@ObfuscatedName("ce")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.p(Leu;III)Lcw;")
    public static class87 method2149(class153 arg0, int arg1, int arg2) {
        if (!method620(arg0, arg1, arg2)) {
            return null;
        }
        class87 var3 = new class87();
        var3.field1493 = Statics.field1457;
        var3.field1487 = Statics.field1284;
        var3.field1494 = Statics.field1458[0];
        var3.field1492 = Statics.field1459[0];
        var3.field1489 = Statics.field246[0];
        var3.field1490 = Statics.field1460[0];
        var3.field1488 = Statics.field2345;
        var3.field1491 = Statics.field1461[0];
        method820();
        return var3;
    }

    @ObfuscatedName("f.e(Leu;IIB)[Lct;")
    public static class86[] method60(class153 arg0, int arg1, int arg2) {
        return method620(arg0, arg1, arg2) ? method1443() : null;
    }

    @ObfuscatedName("br.a(Leu;Leu;III)Lgs;")
    public static class183 method1438(class153 arg0, class153 arg1, int arg2, int arg3) {
        return method620(arg0, arg2, arg3) ? method1180(arg1.method3048(arg2, arg3)) : null;
    }

    @ObfuscatedName("bb.h(Leu;Ljava/lang/String;Ljava/lang/String;I)[Lcw;")
    public static class87[] method1513(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3063(arg1);
        int var4 = arg0.method3114(var3, arg2);
        class87[] var5;
        if (method620(arg0, var3, var4)) {
            class87[] var6 = new class87[Statics.field1456];
            for (int var7 = 0; var7 < Statics.field1456; var7++) {
                class87 var8 = var6[var7] = new class87();
                var8.field1493 = Statics.field1457;
                var8.field1487 = Statics.field1284;
                var8.field1494 = Statics.field1458[var7];
                var8.field1492 = Statics.field1459[var7];
                var8.field1489 = Statics.field246[var7];
                var8.field1490 = Statics.field1460[var7];
                var8.field1488 = Statics.field2345;
                var8.field1491 = Statics.field1461[var7];
            }
            method820();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("az.y(Leu;Ljava/lang/String;Ljava/lang/String;I)Lcw;")
    public static class87 method619(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3063(arg1);
        int var4 = arg0.method3114(var3, arg2);
        return method2149(arg0, var3, var4);
    }

    @ObfuscatedName("af.j(Leu;Ljava/lang/String;Ljava/lang/String;B)[Lct;")
    public static class86[] method693(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3063(arg1);
        int var4 = arg0.method3114(var3, arg2);
        return method60(arg0, var3, var4);
    }

    @ObfuscatedName("el.l(Leu;Ljava/lang/String;Ljava/lang/String;B)Lct;")
    public static class86 method2919(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3063(arg1);
        int var4 = arg0.method3114(var3, arg2);
        class86 var5;
        if (method620(arg0, var3, var4)) {
            var5 = method1569();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("a.f(Leu;Leu;Ljava/lang/String;Ljava/lang/String;I)Lgs;")
    public static class183 method32(class153 arg0, class153 arg1, String arg2, String arg3) {
        int var4 = arg0.method3063(arg2);
        int var5 = arg0.method3114(var4, arg3);
        return method1438(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("ay.n(Leu;II)Lcw;")
    public static class87 method904(class153 arg0, int arg1) {
        byte[] var2 = arg0.method3053(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method36(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class87 var4 = new class87();
        var4.field1493 = Statics.field1457;
        var4.field1487 = Statics.field1284;
        var4.field1494 = Statics.field1458[0];
        var4.field1492 = Statics.field1459[0];
        var4.field1489 = Statics.field246[0];
        var4.field1490 = Statics.field1460[0];
        var4.field1488 = Statics.field2345;
        var4.field1491 = Statics.field1461[0];
        method820();
        return var4;
    }

    @ObfuscatedName("bm.k(I)[Lct;")
    public static class86[] method1443() {
        class86[] var0 = new class86[Statics.field1456];
        for (int var1 = 0; var1 < Statics.field1456; var1++) {
            class86 var2 = var0[var1] = new class86();
            var2.field1475 = Statics.field1457;
            var2.field1484 = Statics.field1284;
            var2.field1480 = Statics.field1458[var1];
            var2.field1479 = Statics.field1459[var1];
            var2.field1476 = Statics.field246[var1];
            var2.field1481 = Statics.field1460[var1];
            int var3 = var2.field1481 * var2.field1476;
            byte[] var4 = Statics.field1461[var1];
            var2.field1482 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1482[var5] = Statics.field2345[var4[var5] & 0xFF];
            }
        }
        method820();
        return var0;
    }

    @ObfuscatedName("bs.q(I)Lct;")
    public static class86 method1569() {
        class86 var0 = new class86();
        var0.field1475 = Statics.field1457;
        var0.field1484 = Statics.field1284;
        var0.field1480 = Statics.field1458[0];
        var0.field1479 = Statics.field1459[0];
        var0.field1476 = Statics.field246[0];
        var0.field1481 = Statics.field1460[0];
        int var1 = var0.field1481 * var0.field1476;
        byte[] var2 = Statics.field1461[0];
        var0.field1482 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1482[var3] = Statics.field2345[var2[var3] & 0xFF];
        }
        method820();
        return var0;
    }

    @ObfuscatedName("au.w([BI)Lgs;")
    public static class183 method1180(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class183 var1 = new class183(arg0, Statics.field1458, Statics.field1459, Statics.field246, Statics.field1460, Statics.field2345, Statics.field1461);
            method820();
            return var1;
        }
    }

    @ObfuscatedName("az.v(Leu;IIB)Z")
    public static boolean method620(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3048(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method36(var3);
            return true;
        }
    }

    @ObfuscatedName("h.z([BI)V")
    public static void method36(byte[] arg0) {
        class127 var1 = new class127(arg0);
        var1.field2029 = arg0.length - 2;
        Statics.field1456 = var1.method2496();
        Statics.field1458 = new int[Statics.field1456];
        Statics.field1459 = new int[Statics.field1456];
        Statics.field246 = new int[Statics.field1456];
        Statics.field1460 = new int[Statics.field1456];
        Statics.field1461 = new byte[Statics.field1456][];
        var1.field2029 = arg0.length - 7 - Statics.field1456 * 8;
        Statics.field1457 = var1.method2496();
        Statics.field1284 = var1.method2496();
        int var2 = (var1.method2494() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1456; var3++) {
            Statics.field1458[var3] = var1.method2496();
        }
        for (int var4 = 0; var4 < Statics.field1456; var4++) {
            Statics.field1459[var4] = var1.method2496();
        }
        for (int var5 = 0; var5 < Statics.field1456; var5++) {
            Statics.field246[var5] = var1.method2496();
        }
        for (int var6 = 0; var6 < Statics.field1456; var6++) {
            Statics.field1460[var6] = var1.method2496();
        }
        var1.field2029 = arg0.length - 7 - Statics.field1456 * 8 - (var2 - 1) * 3;
        Statics.field2345 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2345[var7] = var1.method2498();
            if (Statics.field2345[var7] == 0) {
                Statics.field2345[var7] = 1;
            }
        }
        var1.field2029 = 0;
        for (int var8 = 0; var8 < Statics.field1456; var8++) {
            int var9 = Statics.field246[var8];
            int var10 = Statics.field1460[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1461[var8] = var12;
            int var13 = var1.method2494();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2604();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2604();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ah.m(B)V")
    public static void method820() {
        Statics.field1458 = null;
        Statics.field1459 = null;
        Statics.field246 = null;
        Statics.field1460 = null;
        Statics.field2345 = null;
        Statics.field1461 = (byte[][]) null;
    }
}
