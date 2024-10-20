package deob;

@ObfuscatedName("cx")
public class class80 {

    public class80() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("al.w(Lfa;III)Lcf;")
    public static class84 method845(class171 arg0, int arg1, int arg2) {
        return Statics.method689(arg0, arg1, arg2) ? method1587() : null;
    }

    @ObfuscatedName("ad.e(Lfa;III)[Lcz;")
    public static class82[] method707(class171 arg0, int arg1, int arg2) {
        return Statics.method689(arg0, arg1, arg2) ? method2689() : null;
    }

    @ObfuscatedName("fe.o(Lfa;IIS)Lcz;")
    public static class82 method3014(class171 arg0, int arg1, int arg2) {
        if (!Statics.method689(arg0, arg1, arg2)) {
            return null;
        }
        class82 var3 = new class82();
        var3.field1476 = Statics.field1458;
        var3.field1482 = Statics.field1459;
        var3.field1479 = Statics.field1460[0];
        var3.field1480 = Statics.field1461[0];
        var3.field1477 = Statics.field1464[0];
        var3.field1481 = Statics.field2022[0];
        int var4 = var3.field1481 * var3.field1477;
        byte[] var5 = Statics.field152[0];
        var3.field1487 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1487[var6] = Statics.field1463[var5[var6] & 0xFF];
        }
        method182();
        return var3;
    }

    @ObfuscatedName("k.l(Lfa;Ljava/lang/String;Ljava/lang/String;I)[Lcf;")
    public static class84[] method117(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3101(arg1);
        int var4 = arg0.method3150(var3, arg2);
        return Statics.method2819(arg0, var3, var4);
    }

    @ObfuscatedName("cb.j(Lfa;Ljava/lang/String;Ljava/lang/String;B)Lcf;")
    public static class84 method1849(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3101(arg1);
        int var4 = arg0.method3150(var3, arg2);
        return method845(arg0, var3, var4);
    }

    @ObfuscatedName("by.r(Lfa;Ljava/lang/String;Ljava/lang/String;I)[Lcz;")
    public static class82[] method1302(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3101(arg1);
        int var4 = arg0.method3150(var3, arg2);
        return method707(arg0, var3, var4);
    }

    @ObfuscatedName("ap.x(Lfa;Ljava/lang/String;Ljava/lang/String;S)Lcz;")
    public static class82 method638(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3101(arg1);
        int var4 = arg0.method3150(var3, arg2);
        return method3014(arg0, var3, var4);
    }

    @ObfuscatedName("x.k(Lfa;Lfa;Ljava/lang/String;Ljava/lang/String;I)Lhm;")
    public static class228 method111(class171 arg0, class171 arg1, String arg2, String arg3) {
        int var4 = arg0.method3101(arg2);
        int var5 = arg0.method3150(var4, arg3);
        return Statics.method2864(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("dz.v(B)[Lcf;")
    public static class84[] method2218() {
        class84[] var0 = new class84[Statics.field1457];
        for (int var1 = 0; var1 < Statics.field1457; var1++) {
            class84 var2 = var0[var1] = new class84();
            var2.field1497 = Statics.field1458;
            var2.field1502 = Statics.field1459;
            var2.field1499 = Statics.field1460[var1];
            var2.field1500 = Statics.field1461[var1];
            var2.field1501 = Statics.field1464[var1];
            var2.field1498 = Statics.field2022[var1];
            var2.field1496 = Statics.field1463;
            var2.field1495 = Statics.field152[var1];
        }
        method182();
        return var0;
    }

    @ObfuscatedName("bw.h(B)Lcf;")
    public static class84 method1587() {
        class84 var0 = new class84();
        var0.field1497 = Statics.field1458;
        var0.field1502 = Statics.field1459;
        var0.field1499 = Statics.field1460[0];
        var0.field1500 = Statics.field1461[0];
        var0.field1501 = Statics.field1464[0];
        var0.field1498 = Statics.field2022[0];
        var0.field1496 = Statics.field1463;
        var0.field1495 = Statics.field152[0];
        method182();
        return var0;
    }

    @ObfuscatedName("db.u(B)[Lcz;")
    public static class82[] method2689() {
        class82[] var0 = new class82[Statics.field1457];
        for (int var1 = 0; var1 < Statics.field1457; var1++) {
            class82 var2 = var0[var1] = new class82();
            var2.field1476 = Statics.field1458;
            var2.field1482 = Statics.field1459;
            var2.field1479 = Statics.field1460[var1];
            var2.field1480 = Statics.field1461[var1];
            var2.field1477 = Statics.field1464[var1];
            var2.field1481 = Statics.field2022[var1];
            int var3 = var2.field1481 * var2.field1477;
            byte[] var4 = Statics.field152[var1];
            var2.field1487 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1487[var5] = Statics.field1463[var4[var5] & 0xFF];
            }
        }
        method182();
        return var0;
    }

    @ObfuscatedName("g.p(Lfa;II)Z")
    public static boolean method44(class171 arg0, int arg1) {
        byte[] var2 = arg0.method3091(arg1);
        if (var2 == null) {
            return false;
        } else {
            method924(var2);
            return true;
        }
    }

    @ObfuscatedName("ao.s([BB)V")
    public static void method924(byte[] arg0) {
        class123 var1 = new class123(arg0);
        var1.field2046 = arg0.length - 2;
        Statics.field1457 = var1.method2548();
        Statics.field1460 = new int[Statics.field1457];
        Statics.field1461 = new int[Statics.field1457];
        Statics.field1464 = new int[Statics.field1457];
        Statics.field2022 = new int[Statics.field1457];
        Statics.field152 = new byte[Statics.field1457][];
        var1.field2046 = arg0.length - 7 - Statics.field1457 * 8;
        Statics.field1458 = var1.method2548();
        Statics.field1459 = var1.method2548();
        int var2 = (var1.method2398() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1457; var3++) {
            Statics.field1460[var3] = var1.method2548();
        }
        for (int var4 = 0; var4 < Statics.field1457; var4++) {
            Statics.field1461[var4] = var1.method2548();
        }
        for (int var5 = 0; var5 < Statics.field1457; var5++) {
            Statics.field1464[var5] = var1.method2548();
        }
        for (int var6 = 0; var6 < Statics.field1457; var6++) {
            Statics.field2022[var6] = var1.method2548();
        }
        var1.field2046 = arg0.length - 7 - Statics.field1457 * 8 - (var2 - 1) * 3;
        Statics.field1463 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1463[var7] = var1.method2418();
            if (Statics.field1463[var7] == 0) {
                Statics.field1463[var7] = 1;
            }
        }
        var1.field2046 = 0;
        for (int var8 = 0; var8 < Statics.field1457; var8++) {
            int var9 = Statics.field1464[var8];
            int var10 = Statics.field2022[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field152[var8] = var12;
            int var13 = var1.method2398();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2415();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2415();
                    }
                }
            }
        }
    }

    @ObfuscatedName("d.f(B)V")
    public static void method182() {
        Statics.field1460 = null;
        Statics.field1461 = null;
        Statics.field1464 = null;
        Statics.field2022 = null;
        Statics.field1463 = null;
        Statics.field152 = (byte[][]) null;
    }
}
