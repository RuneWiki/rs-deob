package deob;

@ObfuscatedName("ck")
public class class83 {

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ew.p(Ler;Ler;III)Lfz;")
    public static class182 method3019(class151 arg0, class151 arg1, int arg2, int arg3) {
        return method769(arg0, arg2, arg3) ? method694(arg1.method2973(arg2, arg3)) : null;
    }

    @ObfuscatedName("cf.j(Ler;Ljava/lang/String;Ljava/lang/String;I)[Lcb;")
    public static class86[] method2082(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2936(arg1);
        int var4 = arg0.method2929(var3, arg2);
        class86[] var5;
        if (method769(arg0, var3, var4)) {
            class86[] var6 = new class86[Statics.field1461];
            for (int var7 = 0; var7 < Statics.field1461; var7++) {
                class86 var8 = var6[var7] = new class86();
                var8.field1489 = Statics.field1454;
                var8.field1490 = Statics.field1453;
                var8.field1487 = Statics.field389[var7];
                var8.field1488 = Statics.field1455[var7];
                var8.field1483 = Statics.field1457[var7];
                var8.field1485 = Statics.field192[var7];
                var8.field1484 = Statics.field741;
                var8.field1486 = Statics.field1459[var7];
            }
            method826();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("m.w(Ler;Ljava/lang/String;Ljava/lang/String;I)Lcb;")
    public static class86 method146(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2936(arg1);
        int var4 = arg0.method2929(var3, arg2);
        class86 var5;
        if (method769(arg0, var3, var4)) {
            var5 = method228();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("cq.h(Ler;Ljava/lang/String;Ljava/lang/String;I)[Lct;")
    public static class85[] method1566(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2936(arg1);
        int var4 = arg0.method2929(var3, arg2);
        class85[] var5;
        if (method769(arg0, var3, var4)) {
            var5 = method2360();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("am.v(Ler;Ler;Ljava/lang/String;Ljava/lang/String;I)Lfz;")
    public static class182 method726(class151 arg0, class151 arg1, String arg2, String arg3) {
        int var4 = arg0.method2936(arg2);
        int var5 = arg0.method2929(var4, arg3);
        return method3019(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("fm.k(Ler;II)Lcb;")
    public static class86 method3123(class151 arg0, int arg1) {
        return method65(arg0, arg1) ? method228() : null;
    }

    @ObfuscatedName("b.g(B)Lcb;")
    public static class86 method228() {
        class86 var0 = new class86();
        var0.field1489 = Statics.field1454;
        var0.field1490 = Statics.field1453;
        var0.field1487 = Statics.field389[0];
        var0.field1488 = Statics.field1455[0];
        var0.field1483 = Statics.field1457[0];
        var0.field1485 = Statics.field192[0];
        var0.field1484 = Statics.field741;
        var0.field1486 = Statics.field1459[0];
        method826();
        return var0;
    }

    @ObfuscatedName("dc.n(B)[Lct;")
    public static class85[] method2360() {
        class85[] var0 = new class85[Statics.field1461];
        for (int var1 = 0; var1 < Statics.field1461; var1++) {
            class85 var2 = var0[var1] = new class85();
            var2.field1476 = Statics.field1454;
            var2.field1477 = Statics.field1453;
            var2.field1471 = Statics.field389[var1];
            var2.field1474 = Statics.field1455[var1];
            var2.field1472 = Statics.field1457[var1];
            var2.field1478 = Statics.field192[var1];
            int var3 = var2.field1478 * var2.field1472;
            byte[] var4 = Statics.field1459[var1];
            var2.field1475 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1475[var5] = Statics.field741[var4[var5] & 0xFF];
            }
        }
        method826();
        return var0;
    }

    @ObfuscatedName("cj.c(I)Lct;")
    public static class85 method1550() {
        class85 var0 = new class85();
        var0.field1476 = Statics.field1454;
        var0.field1477 = Statics.field1453;
        var0.field1471 = Statics.field389[0];
        var0.field1474 = Statics.field1455[0];
        var0.field1472 = Statics.field1457[0];
        var0.field1478 = Statics.field192[0];
        int var1 = var0.field1478 * var0.field1472;
        byte[] var2 = Statics.field1459[0];
        var0.field1475 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1475[var3] = Statics.field741[var2[var3] & 0xFF];
        }
        method826();
        return var0;
    }

    @ObfuscatedName("ao.o([BI)Lfz;")
    public static class182 method694(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class182 var1 = new class182(arg0, Statics.field389, Statics.field1455, Statics.field1457, Statics.field192, Statics.field741, Statics.field1459);
            method826();
            return var1;
        }
    }

    @ObfuscatedName("an.u(Ler;IIB)Z")
    public static boolean method769(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2973(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method32(var3);
            return true;
        }
    }

    @ObfuscatedName("g.z(Ler;IB)Z")
    public static boolean method65(class151 arg0, int arg1) {
        byte[] var2 = arg0.method2918(arg1);
        if (var2 == null) {
            return false;
        } else {
            method32(var2);
            return true;
        }
    }

    @ObfuscatedName("h.e([BS)V")
    public static void method32(byte[] arg0) {
        class126 var1 = new class126(arg0);
        var1.field2043 = arg0.length - 2;
        Statics.field1461 = var1.method2489();
        Statics.field389 = new int[Statics.field1461];
        Statics.field1455 = new int[Statics.field1461];
        Statics.field1457 = new int[Statics.field1461];
        Statics.field192 = new int[Statics.field1461];
        Statics.field1459 = new byte[Statics.field1461][];
        var1.field2043 = arg0.length - 7 - Statics.field1461 * 8;
        Statics.field1454 = var1.method2489();
        Statics.field1453 = var1.method2489();
        int var2 = (var1.method2544() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1461; var3++) {
            Statics.field389[var3] = var1.method2489();
        }
        for (int var4 = 0; var4 < Statics.field1461; var4++) {
            Statics.field1455[var4] = var1.method2489();
        }
        for (int var5 = 0; var5 < Statics.field1461; var5++) {
            Statics.field1457[var5] = var1.method2489();
        }
        for (int var6 = 0; var6 < Statics.field1461; var6++) {
            Statics.field192[var6] = var1.method2489();
        }
        var1.field2043 = arg0.length - 7 - Statics.field1461 * 8 - (var2 - 1) * 3;
        Statics.field741 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field741[var7] = var1.method2530();
            if (Statics.field741[var7] == 0) {
                Statics.field741[var7] = 1;
            }
        }
        var1.field2043 = 0;
        for (int var8 = 0; var8 < Statics.field1461; var8++) {
            int var9 = Statics.field1457[var8];
            int var10 = Statics.field192[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1459[var8] = var12;
            int var13 = var1.method2544();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2376();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2376();
                    }
                }
            }
        }
    }

    @ObfuscatedName("af.l(I)V")
    public static void method826() {
        Statics.field389 = null;
        Statics.field1455 = null;
        Statics.field1457 = null;
        Statics.field192 = null;
        Statics.field741 = null;
        Statics.field1459 = (byte[][]) null;
    }
}
