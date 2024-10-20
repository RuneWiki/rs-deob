package deob;

@ObfuscatedName("bh")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fz.h(Lfv;III)[Lcj;")
    public static class81[] method2992(class167 arg0, int arg1, int arg2) {
        return method1198(arg0, arg1, arg2) ? method645() : null;
    }

    @ObfuscatedName("bi.q(Lfv;III)Lcj;")
    public static class81 method1197(class167 arg0, int arg1, int arg2) {
        if (!method1198(arg0, arg1, arg2)) {
            return null;
        }
        class81 var3 = new class81();
        var3.field1421 = Statics.field1386;
        var3.field1428 = Statics.field1387;
        var3.field1425 = Statics.field2652[0];
        var3.field1427 = Statics.field1388[0];
        var3.field1426 = Statics.field1389[0];
        var3.field1424 = Statics.field162[0];
        var3.field1423 = Statics.field1390;
        var3.field1422 = Statics.field1391[0];
        Statics.method636();
        return var3;
    }

    @ObfuscatedName("ai.v(Lfv;IIS)Lcl;")
    public static class79 method960(class167 arg0, int arg1, int arg2) {
        return method1198(arg0, arg1, arg2) ? method3007() : null;
    }

    @ObfuscatedName("bt.n(Lfv;Ljava/lang/String;Ljava/lang/String;I)[Lcj;")
    public static class81[] method1490(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3084(arg1);
        int var4 = arg0.method3076(var3, arg2);
        return method2992(arg0, var3, var4);
    }

    @ObfuscatedName("dk.f(Lfv;Ljava/lang/String;Ljava/lang/String;S)Lcj;")
    public static class81 method2308(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3084(arg1);
        int var4 = arg0.method3076(var3, arg2);
        return method1197(arg0, var3, var4);
    }

    @ObfuscatedName("client.g(Lfv;Ljava/lang/String;Ljava/lang/String;I)[Lcl;")
    public static class79[] method553(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3084(arg1);
        int var4 = arg0.method3076(var3, arg2);
        class79[] var5;
        if (method1198(arg0, var3, var4)) {
            var5 = method632();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bs.o(Lfv;Ljava/lang/String;Ljava/lang/String;I)Lcl;")
    public static class79 method1073(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3084(arg1);
        int var4 = arg0.method3076(var3, arg2);
        return method960(arg0, var3, var4);
    }

    @ObfuscatedName("v.s(Lfv;Lfv;Ljava/lang/String;Ljava/lang/String;I)Lhu;")
    public static class224 method22(class167 arg0, class167 arg1, String arg2, String arg3) {
        int var4 = arg0.method3084(arg2);
        int var5 = arg0.method3076(var4, arg3);
        class224 var6;
        if (method1198(arg0, var4, var5)) {
            byte[] var7 = arg1.method3073(var4, var5);
            class224 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class224 var9 = new class224(var7, Statics.field2652, Statics.field1388, Statics.field1389, Statics.field162, Statics.field1390, Statics.field1391);
                Statics.method636();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("ag.k(I)[Lcj;")
    public static class81[] method645() {
        class81[] var0 = new class81[Statics.field1393];
        for (int var1 = 0; var1 < Statics.field1393; var1++) {
            class81 var2 = var0[var1] = new class81();
            var2.field1421 = Statics.field1386;
            var2.field1428 = Statics.field1387;
            var2.field1425 = Statics.field2652[var1];
            var2.field1427 = Statics.field1388[var1];
            var2.field1426 = Statics.field1389[var1];
            var2.field1424 = Statics.field162[var1];
            var2.field1423 = Statics.field1390;
            var2.field1422 = Statics.field1391[var1];
        }
        Statics.method636();
        return var0;
    }

    @ObfuscatedName("aa.b(B)[Lcl;")
    public static class79[] method632() {
        class79[] var0 = new class79[Statics.field1393];
        for (int var1 = 0; var1 < Statics.field1393; var1++) {
            class79 var2 = var0[var1] = new class79();
            var2.field1407 = Statics.field1386;
            var2.field1412 = Statics.field1387;
            var2.field1406 = Statics.field2652[var1];
            var2.field1411 = Statics.field1388[var1];
            var2.field1404 = Statics.field1389[var1];
            var2.field1408 = Statics.field162[var1];
            int var3 = var2.field1408 * var2.field1404;
            byte[] var4 = Statics.field1391[var1];
            var2.field1405 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1405[var5] = Statics.field1390[var4[var5] & 0xFF];
            }
        }
        Statics.method636();
        return var0;
    }

    @ObfuscatedName("fp.c(I)Lcl;")
    public static class79 method3007() {
        class79 var0 = new class79();
        var0.field1407 = Statics.field1386;
        var0.field1412 = Statics.field1387;
        var0.field1406 = Statics.field2652[0];
        var0.field1411 = Statics.field1388[0];
        var0.field1404 = Statics.field1389[0];
        var0.field1408 = Statics.field162[0];
        int var1 = var0.field1408 * var0.field1404;
        byte[] var2 = Statics.field1391[0];
        var0.field1405 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1405[var3] = Statics.field1390[var2[var3] & 0xFF];
        }
        Statics.method636();
        return var0;
    }

    @ObfuscatedName("bi.l(Lfv;III)Z")
    public static boolean method1198(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3073(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method633(var3);
            return true;
        }
    }

    @ObfuscatedName("aa.p([BI)V")
    public static void method633(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1973 = arg0.length - 2;
        Statics.field1393 = var1.method2385();
        Statics.field2652 = new int[Statics.field1393];
        Statics.field1388 = new int[Statics.field1393];
        Statics.field1389 = new int[Statics.field1393];
        Statics.field162 = new int[Statics.field1393];
        Statics.field1391 = new byte[Statics.field1393][];
        var1.field1973 = arg0.length - 7 - Statics.field1393 * 8;
        Statics.field1386 = var1.method2385();
        Statics.field1387 = var1.method2385();
        int var2 = (var1.method2383() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1393; var3++) {
            Statics.field2652[var3] = var1.method2385();
        }
        for (int var4 = 0; var4 < Statics.field1393; var4++) {
            Statics.field1388[var4] = var1.method2385();
        }
        for (int var5 = 0; var5 < Statics.field1393; var5++) {
            Statics.field1389[var5] = var1.method2385();
        }
        for (int var6 = 0; var6 < Statics.field1393; var6++) {
            Statics.field162[var6] = var1.method2385();
        }
        var1.field1973 = arg0.length - 7 - Statics.field1393 * 8 - (var2 - 1) * 3;
        Statics.field1390 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1390[var7] = var1.method2387();
            if (Statics.field1390[var7] == 0) {
                Statics.field1390[var7] = 1;
            }
        }
        var1.field1973 = 0;
        for (int var8 = 0; var8 < Statics.field1393; var8++) {
            int var9 = Statics.field1389[var8];
            int var10 = Statics.field162[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1391[var8] = var12;
            int var13 = var1.method2383();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2370();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2370();
                    }
                }
            }
        }
    }
}
