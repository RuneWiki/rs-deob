package deob;

@ObfuscatedName("cm")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.a(Leb;III)[Lcf;")
    public static class87[] method38(class152 arg0, int arg1, int arg2) {
        return method230(arg0, arg1, arg2) ? method884() : null;
    }

    @ObfuscatedName("s.x(Leb;Leb;III)Lgd;")
    public static class183 method163(class152 arg0, class152 arg1, int arg2, int arg3) {
        if (!method230(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method2961(arg2, arg3);
        class183 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class183 var6 = new class183(var4, Statics.field1458, Statics.field1459, Statics.field2007, Statics.field1236, Statics.field256, Statics.field1461);
            method171();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("r.e(Leb;Ljava/lang/String;Ljava/lang/String;B)[Lcf;")
    public static class87[] method29(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3003(arg1);
        int var4 = arg0.method2953(var3, arg2);
        return method38(arg0, var3, var4);
    }

    @ObfuscatedName("f.r(Leb;Ljava/lang/String;Ljava/lang/String;I)Lcf;")
    public static class87 method170(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3003(arg1);
        int var4 = arg0.method2953(var3, arg2);
        class87 var5;
        if (method230(arg0, var3, var4)) {
            class87 var6 = new class87();
            var6.field1488 = Statics.field1239;
            var6.field1489 = Statics.field1460;
            var6.field1482 = Statics.field1458[0];
            var6.field1487 = Statics.field1459[0];
            var6.field1484 = Statics.field2007[0];
            var6.field1483 = Statics.field1236[0];
            var6.field1486 = Statics.field256;
            var6.field1485 = Statics.field1461[0];
            method171();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("af.p(Leb;Ljava/lang/String;Ljava/lang/String;I)[Lcj;")
    public static class86[] method812(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3003(arg1);
        int var4 = arg0.method2953(var3, arg2);
        class86[] var5;
        if (method230(arg0, var3, var4)) {
            class86[] var6 = new class86[Statics.field1462];
            for (int var7 = 0; var7 < Statics.field1462; var7++) {
                class86 var8 = var6[var7] = new class86();
                var8.field1475 = Statics.field1239;
                var8.field1476 = Statics.field1460;
                var8.field1473 = Statics.field1458[var7];
                var8.field1474 = Statics.field1459[var7];
                var8.field1477 = Statics.field2007[var7];
                var8.field1481 = Statics.field1236[var7];
                int var9 = var8.field1481 * var8.field1477;
                byte[] var10 = Statics.field1461[var7];
                var8.field1479 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1479[var11] = Statics.field256[var10[var11] & 0xFF];
                }
            }
            method171();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ai.n(Leb;Ljava/lang/String;Ljava/lang/String;I)Lcj;")
    public static class86 method830(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3003(arg1);
        int var4 = arg0.method2953(var3, arg2);
        class86 var5;
        if (method230(arg0, var3, var4)) {
            var5 = method194();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("m.o(Leb;Leb;Ljava/lang/String;Ljava/lang/String;I)Lgd;")
    public static class183 method239(class152 arg0, class152 arg1, String arg2, String arg3) {
        int var4 = arg0.method3003(arg2);
        int var5 = arg0.method2953(var4, arg3);
        return method163(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("q.l(Leb;IB)Lcf;")
    public static class87 method126(class152 arg0, int arg1) {
        byte[] var2 = arg0.method2934(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method179(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class87 var4 = new class87();
        var4.field1488 = Statics.field1239;
        var4.field1489 = Statics.field1460;
        var4.field1482 = Statics.field1458[0];
        var4.field1487 = Statics.field1459[0];
        var4.field1484 = Statics.field2007[0];
        var4.field1483 = Statics.field1236[0];
        var4.field1486 = Statics.field256;
        var4.field1485 = Statics.field1461[0];
        Statics.field1458 = null;
        Statics.field1459 = null;
        Statics.field2007 = null;
        Statics.field1236 = null;
        Statics.field256 = null;
        Statics.field1461 = (byte[][]) null;
        return var4;
    }

    @ObfuscatedName("aj.t(I)[Lcf;")
    public static class87[] method884() {
        class87[] var0 = new class87[Statics.field1462];
        for (int var1 = 0; var1 < Statics.field1462; var1++) {
            class87 var2 = var0[var1] = new class87();
            var2.field1488 = Statics.field1239;
            var2.field1489 = Statics.field1460;
            var2.field1482 = Statics.field1458[var1];
            var2.field1487 = Statics.field1459[var1];
            var2.field1484 = Statics.field2007[var1];
            var2.field1483 = Statics.field1236[var1];
            var2.field1486 = Statics.field256;
            var2.field1485 = Statics.field1461[var1];
        }
        method171();
        return var0;
    }

    @ObfuscatedName("g.q(B)Lcj;")
    public static class86 method194() {
        class86 var0 = new class86();
        var0.field1475 = Statics.field1239;
        var0.field1476 = Statics.field1460;
        var0.field1473 = Statics.field1458[0];
        var0.field1474 = Statics.field1459[0];
        var0.field1477 = Statics.field2007[0];
        var0.field1481 = Statics.field1236[0];
        int var1 = var0.field1481 * var0.field1477;
        byte[] var2 = Statics.field1461[0];
        var0.field1479 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1479[var3] = Statics.field256[var2[var3] & 0xFF];
        }
        method171();
        return var0;
    }

    @ObfuscatedName("b.c(Leb;IIS)Z")
    public static boolean method230(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2961(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method179(var3);
            return true;
        }
    }

    @ObfuscatedName("d.z([BS)V")
    public static void method179(byte[] arg0) {
        class127 var1 = new class127(arg0);
        var1.field2035 = arg0.length - 2;
        Statics.field1462 = var1.method2413();
        Statics.field1458 = new int[Statics.field1462];
        Statics.field1459 = new int[Statics.field1462];
        Statics.field2007 = new int[Statics.field1462];
        Statics.field1236 = new int[Statics.field1462];
        Statics.field1461 = new byte[Statics.field1462][];
        var1.field2035 = arg0.length - 7 - Statics.field1462 * 8;
        Statics.field1239 = var1.method2413();
        Statics.field1460 = var1.method2413();
        int var2 = (var1.method2411() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1462; var3++) {
            Statics.field1458[var3] = var1.method2413();
        }
        for (int var4 = 0; var4 < Statics.field1462; var4++) {
            Statics.field1459[var4] = var1.method2413();
        }
        for (int var5 = 0; var5 < Statics.field1462; var5++) {
            Statics.field2007[var5] = var1.method2413();
        }
        for (int var6 = 0; var6 < Statics.field1462; var6++) {
            Statics.field1236[var6] = var1.method2413();
        }
        var1.field2035 = arg0.length - 7 - Statics.field1462 * 8 - (var2 - 1) * 3;
        Statics.field256 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field256[var7] = var1.method2415();
            if (Statics.field256[var7] == 0) {
                Statics.field256[var7] = 1;
            }
        }
        var1.field2035 = 0;
        for (int var8 = 0; var8 < Statics.field1462; var8++) {
            int var9 = Statics.field2007[var8];
            int var10 = Statics.field1236[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1461[var8] = var12;
            int var13 = var1.method2411();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2412();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2412();
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.s(B)V")
    public static void method171() {
        Statics.field1458 = null;
        Statics.field1459 = null;
        Statics.field2007 = null;
        Statics.field1236 = null;
        Statics.field256 = null;
        Statics.field1461 = (byte[][]) null;
    }
}
