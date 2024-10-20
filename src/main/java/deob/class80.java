package deob;

@ObfuscatedName("cb")
public class class80 {

    public class80() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.e(Lfe;III)[Lcf;")
    public static class82[] method701(class171 arg0, int arg1, int arg2) {
        return method852(arg0, arg1, arg2) ? method2837() : null;
    }

    @ObfuscatedName("dl.l(Lfe;IIB)Lcf;")
    public static class82 method2387(class171 arg0, int arg1, int arg2) {
        return method852(arg0, arg1, arg2) ? method42() : null;
    }

    @ObfuscatedName("db.c(Lfe;Lfe;III)Lhu;")
    public static class228 method2373(class171 arg0, class171 arg1, int arg2, int arg3) {
        return method852(arg0, arg2, arg3) ? method991(arg1.method3130(arg2, arg3)) : null;
    }

    @ObfuscatedName("fp.h(Lfe;Ljava/lang/String;Ljava/lang/String;B)[Lcc;")
    public static class84[] method3322(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3132(arg1);
        int var4 = arg0.method3147(var3, arg2);
        class84[] var5;
        if (method852(arg0, var3, var4)) {
            var5 = method2403();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("d.r(Lfe;Ljava/lang/String;Ljava/lang/String;B)Lcc;")
    public static class84 method571(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3132(arg1);
        int var4 = arg0.method3147(var3, arg2);
        class84 var5;
        if (method852(arg0, var3, var4)) {
            class84 var6 = new class84();
            var6.field1486 = Statics.field1459;
            var6.field1485 = Statics.field1453;
            var6.field1489 = Statics.field1450[0];
            var6.field1492 = Statics.field193[0];
            var6.field1487 = Statics.field2135[0];
            var6.field1490 = Statics.field2704[0];
            var6.field1488 = Statics.field2942;
            var6.field1491 = Statics.field1627[0];
            method1102();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("er.b(Lfe;Ljava/lang/String;Ljava/lang/String;I)Lcf;")
    public static class82 method3016(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3132(arg1);
        int var4 = arg0.method3147(var3, arg2);
        return method2387(arg0, var3, var4);
    }

    @ObfuscatedName("dh.u(Lfe;Lfe;Ljava/lang/String;Ljava/lang/String;I)Lhu;")
    public static class228 method2706(class171 arg0, class171 arg1, String arg2, String arg3) {
        int var4 = arg0.method3132(arg2);
        int var5 = arg0.method3147(var4, arg3);
        return method2373(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("dt.o(I)[Lcc;")
    public static class84[] method2403() {
        class84[] var0 = new class84[Statics.field1451];
        for (int var1 = 0; var1 < Statics.field1451; var1++) {
            class84 var2 = var0[var1] = new class84();
            var2.field1486 = Statics.field1459;
            var2.field1485 = Statics.field1453;
            var2.field1489 = Statics.field1450[var1];
            var2.field1492 = Statics.field193[var1];
            var2.field1487 = Statics.field2135[var1];
            var2.field1490 = Statics.field2704[var1];
            var2.field1488 = Statics.field2942;
            var2.field1491 = Statics.field1627[var1];
        }
        method1102();
        return var0;
    }

    @ObfuscatedName("ea.p(I)[Lcf;")
    public static class82[] method2837() {
        class82[] var0 = new class82[Statics.field1451];
        for (int var1 = 0; var1 < Statics.field1451; var1++) {
            class82 var2 = var0[var1] = new class82();
            var2.field1472 = Statics.field1459;
            var2.field1470 = Statics.field1453;
            var2.field1469 = Statics.field1450[var1];
            var2.field1476 = Statics.field193[var1];
            var2.field1467 = Statics.field2135[var1];
            var2.field1468 = Statics.field2704[var1];
            int var3 = var2.field1468 * var2.field1467;
            byte[] var4 = Statics.field1627[var1];
            var2.field1477 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1477[var5] = Statics.field2942[var4[var5] & 0xFF];
            }
        }
        method1102();
        return var0;
    }

    @ObfuscatedName("r.i(I)Lcf;")
    public static class82 method42() {
        class82 var0 = new class82();
        var0.field1472 = Statics.field1459;
        var0.field1470 = Statics.field1453;
        var0.field1469 = Statics.field1450[0];
        var0.field1476 = Statics.field193[0];
        var0.field1467 = Statics.field2135[0];
        var0.field1468 = Statics.field2704[0];
        int var1 = var0.field1468 * var0.field1467;
        byte[] var2 = Statics.field1627[0];
        var0.field1477 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1477[var3] = Statics.field2942[var2[var3] & 0xFF];
        }
        method1102();
        return var0;
    }

    @ObfuscatedName("au.q([BI)Lhu;")
    public static class228 method991(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class228 var1 = new class228(arg0, Statics.field1450, Statics.field193, Statics.field2135, Statics.field2704, Statics.field2942, Statics.field1627);
            method1102();
            return var1;
        }
    }

    @ObfuscatedName("ax.g(Lfe;IIB)Z")
    public static boolean method852(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3130(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1043(var3);
            return true;
        }
    }

    @ObfuscatedName("k.j(Lfe;II)Z")
    public static boolean method554(class171 arg0, int arg1) {
        byte[] var2 = arg0.method3205(arg1);
        if (var2 == null) {
            return false;
        } else {
            method1043(var2);
            return true;
        }
    }

    @ObfuscatedName("az.w([BI)V")
    public static void method1043(byte[] arg0) {
        class123 var1 = new class123(arg0);
        var1.field2062 = arg0.length - 2;
        Statics.field1451 = var1.method2466();
        Statics.field1450 = new int[Statics.field1451];
        Statics.field193 = new int[Statics.field1451];
        Statics.field2135 = new int[Statics.field1451];
        Statics.field2704 = new int[Statics.field1451];
        Statics.field1627 = new byte[Statics.field1451][];
        var1.field2062 = arg0.length - 7 - Statics.field1451 * 8;
        Statics.field1459 = var1.method2466();
        Statics.field1453 = var1.method2466();
        int var2 = (var1.method2464() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1451; var3++) {
            Statics.field1450[var3] = var1.method2466();
        }
        for (int var4 = 0; var4 < Statics.field1451; var4++) {
            Statics.field193[var4] = var1.method2466();
        }
        for (int var5 = 0; var5 < Statics.field1451; var5++) {
            Statics.field2135[var5] = var1.method2466();
        }
        for (int var6 = 0; var6 < Statics.field1451; var6++) {
            Statics.field2704[var6] = var1.method2466();
        }
        var1.field2062 = arg0.length - 7 - Statics.field1451 * 8 - (var2 - 1) * 3;
        Statics.field2942 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2942[var7] = var1.method2557();
            if (Statics.field2942[var7] == 0) {
                Statics.field2942[var7] = 1;
            }
        }
        var1.field2062 = 0;
        for (int var8 = 0; var8 < Statics.field1451; var8++) {
            int var9 = Statics.field2135[var8];
            int var10 = Statics.field2704[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1627[var8] = var12;
            int var13 = var1.method2464();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2465();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2465();
                    }
                }
            }
        }
    }

    @ObfuscatedName("bw.x(I)V")
    public static void method1102() {
        Statics.field1450 = null;
        Statics.field193 = null;
        Statics.field2135 = null;
        Statics.field2704 = null;
        Statics.field2942 = null;
        Statics.field1627 = (byte[][]) null;
    }
}
