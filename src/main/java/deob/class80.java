package deob;

@ObfuscatedName("cs")
public class class80 {

    public class80() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.k(Lfo;III)[Lcu;")
    public static class84[] method759(class171 arg0, int arg1, int arg2) {
        if (!method595(arg0, arg1, arg2)) {
            return null;
        }
        class84[] var3 = new class84[Statics.field1442];
        for (int var4 = 0; var4 < Statics.field1442; var4++) {
            class84 var5 = var3[var4] = new class84();
            var5.field1481 = Statics.field1437;
            var5.field1482 = Statics.field1438;
            var5.field1480 = Statics.field2118[var4];
            var5.field1476 = Statics.field1439[var4];
            var5.field1477 = Statics.field1440[var4];
            var5.field1478 = Statics.field694[var4];
            var5.field1475 = Statics.field635;
            var5.field1479 = Statics.field1937[var4];
        }
        method721();
        return var3;
    }

    @ObfuscatedName("client.q(Lfo;III)Lcn;")
    public static class82 method419(class171 arg0, int arg1, int arg2) {
        return method595(arg0, arg1, arg2) ? method2035() : null;
    }

    @ObfuscatedName("hn.f(Lfo;Lfo;III)Lhd;")
    public static class228 method3738(class171 arg0, class171 arg1, int arg2, int arg3) {
        if (!method595(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3097(arg2, arg3);
        class228 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class228 var6 = new class228(var4, Statics.field2118, Statics.field1439, Statics.field1440, Statics.field694, Statics.field635, Statics.field1937);
            method721();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("az.c(Lfo;Ljava/lang/String;Ljava/lang/String;B)[Lcu;")
    public static class84[] method950(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3119(arg1);
        int var4 = arg0.method3117(var3, arg2);
        return method759(arg0, var3, var4);
    }

    @ObfuscatedName("cy.v(Lfo;Ljava/lang/String;Ljava/lang/String;I)Lcu;")
    public static class84 method2134(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3119(arg1);
        int var4 = arg0.method3117(var3, arg2);
        class84 var5;
        if (method595(arg0, var3, var4)) {
            var5 = method173();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("de.j(Lfo;Ljava/lang/String;Ljava/lang/String;B)[Lcn;")
    public static class82[] method2625(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3119(arg1);
        int var4 = arg0.method3117(var3, arg2);
        class82[] var5;
        if (method595(arg0, var3, var4)) {
            class82[] var6 = new class82[Statics.field1442];
            for (int var7 = 0; var7 < Statics.field1442; var7++) {
                class82 var8 = var6[var7] = new class82();
                var8.field1461 = Statics.field1437;
                var8.field1465 = Statics.field1438;
                var8.field1456 = Statics.field2118[var7];
                var8.field1460 = Statics.field1439[var7];
                var8.field1457 = Statics.field1440[var7];
                var8.field1462 = Statics.field694[var7];
                int var9 = var8.field1462 * var8.field1457;
                byte[] var10 = Statics.field1937[var7];
                var8.field1463 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1463[var11] = Statics.field635[var10[var11] & 0xFF];
                }
            }
            method721();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("am.m(Lfo;Lfo;Ljava/lang/String;Ljava/lang/String;B)Lhd;")
    public static class228 method670(class171 arg0, class171 arg1, String arg2, String arg3) {
        int var4 = arg0.method3119(arg2);
        int var5 = arg0.method3117(var4, arg3);
        return method3738(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("dn.y(Lfo;II)Lcu;")
    public static class84 method2344(class171 arg0, int arg1) {
        byte[] var2 = arg0.method3102(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method742(var2);
            var3 = true;
        }
        return var3 ? method173() : null;
    }

    @ObfuscatedName("r.u(I)Lcu;")
    public static class84 method173() {
        class84 var0 = new class84();
        var0.field1481 = Statics.field1437;
        var0.field1482 = Statics.field1438;
        var0.field1480 = Statics.field2118[0];
        var0.field1476 = Statics.field1439[0];
        var0.field1477 = Statics.field1440[0];
        var0.field1478 = Statics.field694[0];
        var0.field1475 = Statics.field635;
        var0.field1479 = Statics.field1937[0];
        method721();
        return var0;
    }

    @ObfuscatedName("cj.h(I)Lcn;")
    public static class82 method2035() {
        class82 var0 = new class82();
        var0.field1461 = Statics.field1437;
        var0.field1465 = Statics.field1438;
        var0.field1456 = Statics.field2118[0];
        var0.field1460 = Statics.field1439[0];
        var0.field1457 = Statics.field1440[0];
        var0.field1462 = Statics.field694[0];
        int var1 = var0.field1462 * var0.field1457;
        byte[] var2 = Statics.field1937[0];
        var0.field1463 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1463[var3] = Statics.field635[var2[var3] & 0xFF];
        }
        method721();
        return var0;
    }

    @ObfuscatedName("o.l(Lfo;IIS)Z")
    public static boolean method595(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3097(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method742(var3);
            return true;
        }
    }

    @ObfuscatedName("ax.b([BI)V")
    public static void method742(byte[] arg0) {
        class123 var1 = new class123(arg0);
        var1.field2060 = arg0.length - 2;
        Statics.field1442 = var1.method2547();
        Statics.field2118 = new int[Statics.field1442];
        Statics.field1439 = new int[Statics.field1442];
        Statics.field1440 = new int[Statics.field1442];
        Statics.field694 = new int[Statics.field1442];
        Statics.field1937 = new byte[Statics.field1442][];
        var1.field2060 = arg0.length - 7 - Statics.field1442 * 8;
        Statics.field1437 = var1.method2547();
        Statics.field1438 = var1.method2547();
        int var2 = (var1.method2427() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1442; var3++) {
            Statics.field2118[var3] = var1.method2547();
        }
        for (int var4 = 0; var4 < Statics.field1442; var4++) {
            Statics.field1439[var4] = var1.method2547();
        }
        for (int var5 = 0; var5 < Statics.field1442; var5++) {
            Statics.field1440[var5] = var1.method2547();
        }
        for (int var6 = 0; var6 < Statics.field1442; var6++) {
            Statics.field694[var6] = var1.method2547();
        }
        var1.field2060 = arg0.length - 7 - Statics.field1442 * 8 - (var2 - 1) * 3;
        Statics.field635 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field635[var7] = var1.method2431();
            if (Statics.field635[var7] == 0) {
                Statics.field635[var7] = 1;
            }
        }
        var1.field2060 = 0;
        for (int var8 = 0; var8 < Statics.field1442; var8++) {
            int var9 = Statics.field1440[var8];
            int var10 = Statics.field694[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1937[var8] = var12;
            int var13 = var1.method2427();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2428();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2428();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.g(I)V")
    public static void method721() {
        Statics.field2118 = null;
        Statics.field1439 = null;
        Statics.field1440 = null;
        Statics.field694 = null;
        Statics.field635 = null;
        Statics.field1937 = (byte[][]) null;
    }
}
