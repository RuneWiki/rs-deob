package deob;

@ObfuscatedName("cx")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.i(Ler;IIB)[Lcj;")
    public static class87[] method1338(class152 arg0, int arg1, int arg2) {
        return method2394(arg0, arg1, arg2) ? method2344() : null;
    }

    @ObfuscatedName("bv.v(Ler;IIB)Lcj;")
    public static class87 method1565(class152 arg0, int arg1, int arg2) {
        if (!method2394(arg0, arg1, arg2)) {
            return null;
        }
        class87 var3 = new class87();
        var3.field1488 = Statics.field1453;
        var3.field1491 = Statics.field1454;
        var3.field1485 = Statics.field1457[0];
        var3.field1489 = Statics.field2014[0];
        var3.field1486 = Statics.field1456[0];
        var3.field1487 = Statics.field156[0];
        var3.field1484 = Statics.field1464;
        var3.field1490 = Statics.field1045[0];
        method752();
        return var3;
    }

    @ObfuscatedName("au.m(Ler;III)[Lco;")
    public static class86[] method757(class152 arg0, int arg1, int arg2) {
        return method2394(arg0, arg1, arg2) ? method1569() : null;
    }

    @ObfuscatedName("br.j(Ler;Ler;III)Lgb;")
    public static class183 method1264(class152 arg0, class152 arg1, int arg2, int arg3) {
        return method2394(arg0, arg2, arg3) ? Statics.method1888(arg1.method3032(arg2, arg3)) : null;
    }

    @ObfuscatedName("i.o(Ler;Ljava/lang/String;Ljava/lang/String;S)[Lcj;")
    public static class87[] method4(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3047(arg1);
        int var4 = arg0.method3048(var3, arg2);
        return method1338(arg0, var3, var4);
    }

    @ObfuscatedName("ak.l(Ler;Ljava/lang/String;Ljava/lang/String;I)Lcj;")
    public static class87 method692(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3047(arg1);
        int var4 = arg0.method3048(var3, arg2);
        return method1565(arg0, var3, var4);
    }

    @ObfuscatedName("r.g(Ler;Ljava/lang/String;Ljava/lang/String;I)[Lco;")
    public static class86[] method217(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3047(arg1);
        int var4 = arg0.method3048(var3, arg2);
        return method757(arg0, var3, var4);
    }

    @ObfuscatedName("i.w(Ler;Ler;Ljava/lang/String;Ljava/lang/String;I)Lgb;")
    public static class183 method3(class152 arg0, class152 arg1, String arg2, String arg3) {
        int var4 = arg0.method3047(arg2);
        int var5 = arg0.method3048(var4, arg3);
        return method1264(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("x.c(Ler;IB)Lcj;")
    public static class87 method152(class152 arg0, int arg1) {
        byte[] var2 = arg0.method3037(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method23(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class87 var4 = new class87();
        var4.field1488 = Statics.field1453;
        var4.field1491 = Statics.field1454;
        var4.field1485 = Statics.field1457[0];
        var4.field1489 = Statics.field2014[0];
        var4.field1486 = Statics.field1456[0];
        var4.field1487 = Statics.field156[0];
        var4.field1484 = Statics.field1464;
        var4.field1490 = Statics.field1045[0];
        method752();
        return var4;
    }

    @ObfuscatedName("dz.z(I)[Lcj;")
    public static class87[] method2344() {
        class87[] var0 = new class87[Statics.field1461];
        for (int var1 = 0; var1 < Statics.field1461; var1++) {
            class87 var2 = var0[var1] = new class87();
            var2.field1488 = Statics.field1453;
            var2.field1491 = Statics.field1454;
            var2.field1485 = Statics.field1457[var1];
            var2.field1489 = Statics.field2014[var1];
            var2.field1486 = Statics.field1456[var1];
            var2.field1487 = Statics.field156[var1];
            var2.field1484 = Statics.field1464;
            var2.field1490 = Statics.field1045[var1];
        }
        method752();
        return var0;
    }

    @ObfuscatedName("bh.f(I)[Lco;")
    public static class86[] method1569() {
        class86[] var0 = new class86[Statics.field1461];
        for (int var1 = 0; var1 < Statics.field1461; var1++) {
            class86 var2 = var0[var1] = new class86();
            var2.field1482 = Statics.field1453;
            var2.field1478 = Statics.field1454;
            var2.field1481 = Statics.field1457[var1];
            var2.field1475 = Statics.field2014[var1];
            var2.field1473 = Statics.field1456[var1];
            var2.field1474 = Statics.field156[var1];
            int var3 = var2.field1474 * var2.field1473;
            byte[] var4 = Statics.field1045[var1];
            var2.field1472 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1472[var5] = Statics.field1464[var4[var5] & 0xFF];
            }
        }
        method752();
        return var0;
    }

    @ObfuscatedName("dt.d(Ler;IIB)Z")
    public static boolean method2394(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3032(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method23(var3);
            return true;
        }
    }

    @ObfuscatedName("j.e([BI)V")
    public static void method23(byte[] arg0) {
        class127 var1 = new class127(arg0);
        var1.field2039 = arg0.length - 2;
        Statics.field1461 = var1.method2493();
        Statics.field1457 = new int[Statics.field1461];
        Statics.field2014 = new int[Statics.field1461];
        Statics.field1456 = new int[Statics.field1461];
        Statics.field156 = new int[Statics.field1461];
        Statics.field1045 = new byte[Statics.field1461][];
        var1.field2039 = arg0.length - 7 - Statics.field1461 * 8;
        Statics.field1453 = var1.method2493();
        Statics.field1454 = var1.method2493();
        int var2 = (var1.method2491() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1461; var3++) {
            Statics.field1457[var3] = var1.method2493();
        }
        for (int var4 = 0; var4 < Statics.field1461; var4++) {
            Statics.field2014[var4] = var1.method2493();
        }
        for (int var5 = 0; var5 < Statics.field1461; var5++) {
            Statics.field1456[var5] = var1.method2493();
        }
        for (int var6 = 0; var6 < Statics.field1461; var6++) {
            Statics.field156[var6] = var1.method2493();
        }
        var1.field2039 = arg0.length - 7 - Statics.field1461 * 8 - (var2 - 1) * 3;
        Statics.field1464 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1464[var7] = var1.method2494();
            if (Statics.field1464[var7] == 0) {
                Statics.field1464[var7] = 1;
            }
        }
        var1.field2039 = 0;
        for (int var8 = 0; var8 < Statics.field1461; var8++) {
            int var9 = Statics.field1456[var8];
            int var10 = Statics.field156[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1045[var8] = var12;
            int var13 = var1.method2491();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2492();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2492();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ap.y(B)V")
    public static void method752() {
        Statics.field1457 = null;
        Statics.field2014 = null;
        Statics.field1456 = null;
        Statics.field156 = null;
        Statics.field1464 = null;
        Statics.field1045 = (byte[][]) null;
    }
}
