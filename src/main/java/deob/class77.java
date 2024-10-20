package deob;

@ObfuscatedName("bn")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.h(Lfv;III)[Lcn;")
    public static class81[] method43(class167 arg0, int arg1, int arg2) {
        return method2792(arg0, arg1, arg2) ? method3191() : null;
    }

    @ObfuscatedName("client.m(Lfv;III)Lcn;")
    public static class81 method527(class167 arg0, int arg1, int arg2) {
        return method2792(arg0, arg1, arg2) ? method550() : null;
    }

    @ObfuscatedName("bg.i(Lfv;IIB)[Lcg;")
    public static class79[] method1466(class167 arg0, int arg1, int arg2) {
        return method2792(arg0, arg1, arg2) ? method3() : null;
    }

    @ObfuscatedName("ch.q(Lfv;III)Lcg;")
    public static class79 method2105(class167 arg0, int arg1, int arg2) {
        if (!method2792(arg0, arg1, arg2)) {
            return null;
        }
        class79 var3 = new class79();
        var3.field1415 = Statics.field1388;
        var3.field1413 = Statics.field1389;
        var3.field1418 = Statics.field1394[0];
        var3.field1414 = Statics.field1358[0];
        var3.field1411 = Statics.field1970[0];
        var3.field1416 = Statics.field1078[0];
        int var4 = var3.field1416 * var3.field1411;
        byte[] var5 = Statics.field1683[0];
        var3.field1421 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1421[var6] = Statics.field1973[var5[var6] & 0xFF];
        }
        method1223();
        return var3;
    }

    @ObfuscatedName("ac.p(Lfv;Lfv;III)Lhd;")
    public static class224 method858(class167 arg0, class167 arg1, int arg2, int arg3) {
        return method2792(arg0, arg2, arg3) ? method3212(arg1.method3051(arg2, arg3)) : null;
    }

    @ObfuscatedName("c.c(Lfv;Ljava/lang/String;Ljava/lang/String;I)[Lcn;")
    public static class81[] method45(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3022(arg1);
        int var4 = arg0.method3023(var3, arg2);
        return method43(arg0, var3, var4);
    }

    @ObfuscatedName("i.f(Lfv;Ljava/lang/String;Ljava/lang/String;I)Lcn;")
    public static class81 method29(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3022(arg1);
        int var4 = arg0.method3023(var3, arg2);
        return method527(arg0, var3, var4);
    }

    @ObfuscatedName("w.y(Lfv;Ljava/lang/String;Ljava/lang/String;I)[Lcg;")
    public static class79[] method102(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3022(arg1);
        int var4 = arg0.method3023(var3, arg2);
        return method1466(arg0, var3, var4);
    }

    @ObfuscatedName("ah.w(Lfv;Lfv;Ljava/lang/String;Ljava/lang/String;I)Lhd;")
    public static class224 method970(class167 arg0, class167 arg1, String arg2, String arg3) {
        int var4 = arg0.method3022(arg2);
        int var5 = arg0.method3023(var4, arg3);
        return method858(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("fy.l(B)[Lcn;")
    public static class81[] method3191() {
        class81[] var0 = new class81[Statics.field1387];
        for (int var1 = 0; var1 < Statics.field1387; var1++) {
            class81 var2 = var0[var1] = new class81();
            var2.field1435 = Statics.field1388;
            var2.field1433 = Statics.field1389;
            var2.field1436 = Statics.field1394[var1];
            var2.field1429 = Statics.field1358[var1];
            var2.field1431 = Statics.field1970[var1];
            var2.field1432 = Statics.field1078[var1];
            var2.field1434 = Statics.field1973;
            var2.field1430 = Statics.field1683[var1];
        }
        method1223();
        return var0;
    }

    @ObfuscatedName("d.v(I)Lcn;")
    public static class81 method550() {
        class81 var0 = new class81();
        var0.field1435 = Statics.field1388;
        var0.field1433 = Statics.field1389;
        var0.field1436 = Statics.field1394[0];
        var0.field1429 = Statics.field1358[0];
        var0.field1431 = Statics.field1970[0];
        var0.field1432 = Statics.field1078[0];
        var0.field1434 = Statics.field1973;
        var0.field1430 = Statics.field1683[0];
        method1223();
        return var0;
    }

    @ObfuscatedName("h.k(I)[Lcg;")
    public static class79[] method3() {
        class79[] var0 = new class79[Statics.field1387];
        for (int var1 = 0; var1 < Statics.field1387; var1++) {
            class79 var2 = var0[var1] = new class79();
            var2.field1415 = Statics.field1388;
            var2.field1413 = Statics.field1389;
            var2.field1418 = Statics.field1394[var1];
            var2.field1414 = Statics.field1358[var1];
            var2.field1411 = Statics.field1970[var1];
            var2.field1416 = Statics.field1078[var1];
            int var3 = var2.field1416 * var2.field1411;
            byte[] var4 = Statics.field1683[var1];
            var2.field1421 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1421[var5] = Statics.field1973[var4[var5] & 0xFF];
            }
        }
        method1223();
        return var0;
    }

    @ObfuscatedName("fx.o([BI)Lhd;")
    public static class224 method3212(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class224 var1 = new class224(arg0, Statics.field1394, Statics.field1358, Statics.field1970, Statics.field1078, Statics.field1973, Statics.field1683);
            method1223();
            return var1;
        }
    }

    @ObfuscatedName("em.u(Lfv;IIS)Z")
    public static boolean method2792(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3051(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method627(var3);
            return true;
        }
    }

    @ObfuscatedName("ax.s([BB)V")
    public static void method627(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1988 = arg0.length - 2;
        Statics.field1387 = var1.method2322();
        Statics.field1394 = new int[Statics.field1387];
        Statics.field1358 = new int[Statics.field1387];
        Statics.field1970 = new int[Statics.field1387];
        Statics.field1078 = new int[Statics.field1387];
        Statics.field1683 = new byte[Statics.field1387][];
        var1.field1988 = arg0.length - 7 - Statics.field1387 * 8;
        Statics.field1388 = var1.method2322();
        Statics.field1389 = var1.method2322();
        int var2 = (var1.method2320() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1387; var3++) {
            Statics.field1394[var3] = var1.method2322();
        }
        for (int var4 = 0; var4 < Statics.field1387; var4++) {
            Statics.field1358[var4] = var1.method2322();
        }
        for (int var5 = 0; var5 < Statics.field1387; var5++) {
            Statics.field1970[var5] = var1.method2322();
        }
        for (int var6 = 0; var6 < Statics.field1387; var6++) {
            Statics.field1078[var6] = var1.method2322();
        }
        var1.field1988 = arg0.length - 7 - Statics.field1387 * 8 - (var2 - 1) * 3;
        Statics.field1973 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1973[var7] = var1.method2487();
            if (Statics.field1973[var7] == 0) {
                Statics.field1973[var7] = 1;
            }
        }
        var1.field1988 = 0;
        for (int var8 = 0; var8 < Statics.field1387; var8++) {
            int var9 = Statics.field1970[var8];
            int var10 = Statics.field1078[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1683[var8] = var12;
            int var13 = var1.method2320();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2425();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2425();
                    }
                }
            }
        }
    }

    @ObfuscatedName("be.g(B)V")
    public static void method1223() {
        Statics.field1394 = null;
        Statics.field1358 = null;
        Statics.field1970 = null;
        Statics.field1078 = null;
        Statics.field1973 = null;
        Statics.field1683 = (byte[][]) null;
    }
}
