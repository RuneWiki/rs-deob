package deob;

@ObfuscatedName("cs")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("be.d(Lej;III)[Lck;")
    public static class87[] method1348(class152 arg0, int arg1, int arg2) {
        if (!method7(arg0, arg1, arg2)) {
            return null;
        }
        class87[] var3 = new class87[Statics.field1443];
        for (int var4 = 0; var4 < Statics.field1443; var4++) {
            class87 var5 = var3[var4] = new class87();
            var5.field1472 = Statics.field1447;
            var5.field1477 = Statics.field1922;
            var5.field1474 = Statics.field190[var4];
            var5.field1471 = Statics.field1442[var4];
            var5.field1470 = Statics.field1445[var4];
            var5.field1473 = Statics.field1040[var4];
            var5.field1476 = Statics.field1446;
            var5.field1475 = Statics.field245[var4];
        }
        Statics.field190 = null;
        Statics.field1442 = null;
        Statics.field1445 = null;
        Statics.field1040 = null;
        Statics.field1446 = null;
        Statics.field245 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("ew.g(Lej;III)[Lcv;")
    public static class86[] method2679(class152 arg0, int arg1, int arg2) {
        return method7(arg0, arg1, arg2) ? method47() : null;
    }

    @ObfuscatedName("by.a(Lej;Lej;III)Lgc;")
    public static class183 method1479(class152 arg0, class152 arg1, int arg2, int arg3) {
        return method7(arg0, arg2, arg3) ? method1346(arg1.method2958(arg2, arg3)) : null;
    }

    @ObfuscatedName("bn.t(Lej;Ljava/lang/String;Ljava/lang/String;I)[Lck;")
    public static class87[] method1526(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2948(arg1);
        int var4 = arg0.method3007(var3, arg2);
        return method1348(arg0, var3, var4);
    }

    @ObfuscatedName("bx.f(Lej;Ljava/lang/String;Ljava/lang/String;S)Lck;")
    public static class87 method1391(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2948(arg1);
        int var4 = arg0.method3007(var3, arg2);
        class87 var5;
        if (method7(arg0, var3, var4)) {
            class87 var6 = new class87();
            var6.field1472 = Statics.field1447;
            var6.field1477 = Statics.field1922;
            var6.field1474 = Statics.field190[0];
            var6.field1471 = Statics.field1442[0];
            var6.field1470 = Statics.field1445[0];
            var6.field1473 = Statics.field1040[0];
            var6.field1476 = Statics.field1446;
            var6.field1475 = Statics.field245[0];
            Statics.field190 = null;
            Statics.field1442 = null;
            Statics.field1445 = null;
            Statics.field1040 = null;
            Statics.field1446 = null;
            Statics.field245 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("s.c(Lej;Ljava/lang/String;Ljava/lang/String;I)[Lcv;")
    public static class86[] method59(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2948(arg1);
        int var4 = arg0.method3007(var3, arg2);
        return method2679(arg0, var3, var4);
    }

    @ObfuscatedName("au.p(Lej;Ljava/lang/String;Ljava/lang/String;B)Lcv;")
    public static class86 method779(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2948(arg1);
        int var4 = arg0.method3007(var3, arg2);
        class86 var5;
        if (method7(arg0, var3, var4)) {
            var5 = method57();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("cn.k(Lej;II)Lck;")
    public static class87 method1998(class152 arg0, int arg1) {
        if (!method656(arg0, arg1)) {
            return null;
        }
        class87 var2 = new class87();
        var2.field1472 = Statics.field1447;
        var2.field1477 = Statics.field1922;
        var2.field1474 = Statics.field190[0];
        var2.field1471 = Statics.field1442[0];
        var2.field1470 = Statics.field1445[0];
        var2.field1473 = Statics.field1040[0];
        var2.field1476 = Statics.field1446;
        var2.field1475 = Statics.field245[0];
        Statics.field190 = null;
        Statics.field1442 = null;
        Statics.field1445 = null;
        Statics.field1040 = null;
        Statics.field1446 = null;
        Statics.field245 = (byte[][]) null;
        return var2;
    }

    @ObfuscatedName("c.m(S)[Lcv;")
    public static class86[] method47() {
        class86[] var0 = new class86[Statics.field1443];
        for (int var1 = 0; var1 < Statics.field1443; var1++) {
            class86 var2 = var0[var1] = new class86();
            var2.field1462 = Statics.field1447;
            var2.field1464 = Statics.field1922;
            var2.field1461 = Statics.field190[var1];
            var2.field1460 = Statics.field1442[var1];
            var2.field1459 = Statics.field1445[var1];
            var2.field1458 = Statics.field1040[var1];
            int var3 = var2.field1459 * var2.field1458;
            byte[] var4 = Statics.field245[var1];
            var2.field1463 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1463[var5] = Statics.field1446[var4[var5] & 0xFF];
            }
        }
        Statics.field190 = null;
        Statics.field1442 = null;
        Statics.field1445 = null;
        Statics.field1040 = null;
        Statics.field1446 = null;
        Statics.field245 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("p.y(B)Lcv;")
    public static class86 method57() {
        class86 var0 = new class86();
        var0.field1462 = Statics.field1447;
        var0.field1464 = Statics.field1922;
        var0.field1461 = Statics.field190[0];
        var0.field1460 = Statics.field1442[0];
        var0.field1459 = Statics.field1445[0];
        var0.field1458 = Statics.field1040[0];
        int var1 = var0.field1459 * var0.field1458;
        byte[] var2 = Statics.field245[0];
        var0.field1463 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1463[var3] = Statics.field1446[var2[var3] & 0xFF];
        }
        Statics.field190 = null;
        Statics.field1442 = null;
        Statics.field1445 = null;
        Statics.field1040 = null;
        Statics.field1446 = null;
        Statics.field245 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("be.b([BB)Lgc;")
    public static class183 method1346(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class183 var1 = new class183(arg0, Statics.field190, Statics.field1442, Statics.field1445, Statics.field1040, Statics.field1446, Statics.field245);
        Statics.field190 = null;
        Statics.field1442 = null;
        Statics.field1445 = null;
        Statics.field1040 = null;
        Statics.field1446 = null;
        Statics.field245 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("g.l(Lej;III)Z")
    public static boolean method7(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2958(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1376(var3);
            return true;
        }
    }

    @ObfuscatedName("ai.x(Lej;II)Z")
    public static boolean method656(class152 arg0, int arg1) {
        byte[] var2 = arg0.method2939(arg1);
        if (var2 == null) {
            return false;
        } else {
            method1376(var2);
            return true;
        }
    }

    @ObfuscatedName("br.z([BI)V")
    public static void method1376(byte[] arg0) {
        class127 var1 = new class127(arg0);
        var1.field2042 = arg0.length - 2;
        Statics.field1443 = var1.method2512();
        Statics.field190 = new int[Statics.field1443];
        Statics.field1442 = new int[Statics.field1443];
        Statics.field1445 = new int[Statics.field1443];
        Statics.field1040 = new int[Statics.field1443];
        Statics.field245 = new byte[Statics.field1443][];
        var1.field2042 = arg0.length - 7 - Statics.field1443 * 8;
        Statics.field1447 = var1.method2512();
        Statics.field1922 = var1.method2512();
        int var2 = (var1.method2509() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1443; var3++) {
            Statics.field190[var3] = var1.method2512();
        }
        for (int var4 = 0; var4 < Statics.field1443; var4++) {
            Statics.field1442[var4] = var1.method2512();
        }
        for (int var5 = 0; var5 < Statics.field1443; var5++) {
            Statics.field1445[var5] = var1.method2512();
        }
        for (int var6 = 0; var6 < Statics.field1443; var6++) {
            Statics.field1040[var6] = var1.method2512();
        }
        var1.field2042 = arg0.length - 7 - Statics.field1443 * 8 - (var2 - 1) * 3;
        Statics.field1446 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1446[var7] = var1.method2404();
            if (Statics.field1446[var7] == 0) {
                Statics.field1446[var7] = 1;
            }
        }
        var1.field2042 = 0;
        for (int var8 = 0; var8 < Statics.field1443; var8++) {
            int var9 = Statics.field1445[var8];
            int var10 = Statics.field1040[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field245[var8] = var12;
            int var13 = var1.method2509();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2500();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2500();
                    }
                }
            }
        }
    }
}
