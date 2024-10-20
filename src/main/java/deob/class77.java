package deob;

@ObfuscatedName("bs")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.g(Lfc;IIB)Lco;")
    public static class81 method181(class167 arg0, int arg1, int arg2) {
        if (!method644(arg0, arg1, arg2)) {
            return null;
        }
        class81 var3 = new class81();
        var3.field1422 = Statics.field1376;
        var3.field1423 = Statics.field1374;
        var3.field1420 = Statics.field1373[0];
        var3.field1418 = Statics.field1378[0];
        var3.field1421 = Statics.field1619[0];
        var3.field1419 = Statics.field1377[0];
        var3.field1417 = Statics.field1382;
        var3.field1416 = Statics.field1380[0];
        method669();
        return var3;
    }

    @ObfuscatedName("t.b(Lfc;Lfc;IIB)Lhq;")
    public static class224 method243(class167 arg0, class167 arg1, int arg2, int arg3) {
        return method644(arg0, arg2, arg3) ? method2254(arg1.method3112(arg2, arg3)) : null;
    }

    @ObfuscatedName("bi.w(Lfc;Ljava/lang/String;Ljava/lang/String;B)[Lco;")
    public static class81[] method1533(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3079(arg1);
        int var4 = arg0.method3094(var3, arg2);
        class81[] var5;
        if (method644(arg0, var3, var4)) {
            var5 = method106();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("dw.d(Lfc;Ljava/lang/String;Ljava/lang/String;I)Lco;")
    public static class81 method2309(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3079(arg1);
        int var4 = arg0.method3094(var3, arg2);
        return method181(arg0, var3, var4);
    }

    @ObfuscatedName("ar.z(Lfc;Ljava/lang/String;Ljava/lang/String;I)[Lcy;")
    public static class79[] method995(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3079(arg1);
        int var4 = arg0.method3094(var3, arg2);
        class79[] var5;
        if (method644(arg0, var3, var4)) {
            var5 = method664();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("i.l(Lfc;Ljava/lang/String;Ljava/lang/String;S)Lcy;")
    public static class79 method607(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3079(arg1);
        int var4 = arg0.method3094(var3, arg2);
        class79 var5;
        if (method644(arg0, var3, var4)) {
            class79 var6 = new class79();
            var6.field1400 = Statics.field1376;
            var6.field1403 = Statics.field1374;
            var6.field1398 = Statics.field1373[0];
            var6.field1402 = Statics.field1378[0];
            var6.field1401 = Statics.field1619[0];
            var6.field1399 = Statics.field1377[0];
            int var7 = var6.field1401 * var6.field1399;
            byte[] var8 = Statics.field1380[0];
            var6.field1407 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field1407[var9] = Statics.field1382[var8[var9] & 0xFF];
            }
            method669();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("p.m(I)[Lco;")
    public static class81[] method106() {
        class81[] var0 = new class81[Statics.field1379];
        for (int var1 = 0; var1 < Statics.field1379; var1++) {
            class81 var2 = var0[var1] = new class81();
            var2.field1422 = Statics.field1376;
            var2.field1423 = Statics.field1374;
            var2.field1420 = Statics.field1373[var1];
            var2.field1418 = Statics.field1378[var1];
            var2.field1421 = Statics.field1619[var1];
            var2.field1419 = Statics.field1377[var1];
            var2.field1417 = Statics.field1382;
            var2.field1416 = Statics.field1380[var1];
        }
        method669();
        return var0;
    }

    @ObfuscatedName("ag.p(I)[Lcy;")
    public static class79[] method664() {
        class79[] var0 = new class79[Statics.field1379];
        for (int var1 = 0; var1 < Statics.field1379; var1++) {
            class79 var2 = var0[var1] = new class79();
            var2.field1400 = Statics.field1376;
            var2.field1403 = Statics.field1374;
            var2.field1398 = Statics.field1373[var1];
            var2.field1402 = Statics.field1378[var1];
            var2.field1401 = Statics.field1619[var1];
            var2.field1399 = Statics.field1377[var1];
            int var3 = var2.field1401 * var2.field1399;
            byte[] var4 = Statics.field1380[var1];
            var2.field1407 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1407[var5] = Statics.field1382[var4[var5] & 0xFF];
            }
        }
        method669();
        return var0;
    }

    @ObfuscatedName("ds.u([BB)Lhq;")
    public static class224 method2254(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class224 var1 = new class224(arg0, Statics.field1373, Statics.field1378, Statics.field1619, Statics.field1377, Statics.field1382, Statics.field1380);
            method669();
            return var1;
        }
    }

    @ObfuscatedName("ay.c(Lfc;III)Z")
    public static boolean method644(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3112(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method51(var3);
            return true;
        }
    }

    @ObfuscatedName("g.v(Lfc;II)Z")
    public static boolean method2(class167 arg0, int arg1) {
        byte[] var2 = arg0.method3083(arg1);
        if (var2 == null) {
            return false;
        } else {
            method51(var2);
            return true;
        }
    }

    @ObfuscatedName("z.o([BI)V")
    public static void method51(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1977 = arg0.length - 2;
        Statics.field1379 = var1.method2376();
        Statics.field1373 = new int[Statics.field1379];
        Statics.field1378 = new int[Statics.field1379];
        Statics.field1619 = new int[Statics.field1379];
        Statics.field1377 = new int[Statics.field1379];
        Statics.field1380 = new byte[Statics.field1379][];
        var1.field1977 = arg0.length - 7 - Statics.field1379 * 8;
        Statics.field1376 = var1.method2376();
        Statics.field1374 = var1.method2376();
        int var2 = (var1.method2362() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1379; var3++) {
            Statics.field1373[var3] = var1.method2376();
        }
        for (int var4 = 0; var4 < Statics.field1379; var4++) {
            Statics.field1378[var4] = var1.method2376();
        }
        for (int var5 = 0; var5 < Statics.field1379; var5++) {
            Statics.field1619[var5] = var1.method2376();
        }
        for (int var6 = 0; var6 < Statics.field1379; var6++) {
            Statics.field1377[var6] = var1.method2376();
        }
        var1.field1977 = arg0.length - 7 - Statics.field1379 * 8 - (var2 - 1) * 3;
        Statics.field1382 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1382[var7] = var1.method2366();
            if (Statics.field1382[var7] == 0) {
                Statics.field1382[var7] = 1;
            }
        }
        var1.field1977 = 0;
        for (int var8 = 0; var8 < Statics.field1379; var8++) {
            int var9 = Statics.field1619[var8];
            int var10 = Statics.field1377[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1380[var8] = var12;
            int var13 = var1.method2362();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2391();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2391();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ab.n(I)V")
    public static void method669() {
        Statics.field1373 = null;
        Statics.field1378 = null;
        Statics.field1619 = null;
        Statics.field1377 = null;
        Statics.field1382 = null;
        Statics.field1380 = (byte[][]) null;
    }
}
