package deob;

@ObfuscatedName("bq")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.l(Lfo;IIB)[Lco;")
    public static class81[] method158(class167 arg0, int arg1, int arg2) {
        return method729(arg0, arg1, arg2) ? method574() : null;
    }

    @ObfuscatedName("m.e(Lfo;III)[Lcr;")
    public static class79[] method82(class167 arg0, int arg1, int arg2) {
        if (!method729(arg0, arg1, arg2)) {
            return null;
        }
        class79[] var3 = new class79[Statics.field1368];
        for (int var4 = 0; var4 < Statics.field1368; var4++) {
            class79 var5 = var3[var4] = new class79();
            var5.field1395 = Statics.field1365;
            var5.field1396 = Statics.field1366;
            var5.field1393 = Statics.field1370[var4];
            var5.field1394 = Statics.field1376[var4];
            var5.field1398 = Statics.field2631[var4];
            var5.field1392 = Statics.field224[var4];
            int var6 = var5.field1398 * var5.field1392;
            byte[] var7 = Statics.field2035[var4];
            var5.field1401 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1401[var8] = Statics.field1954[var7[var8] & 0xFF];
            }
        }
        method757();
        return var3;
    }

    @ObfuscatedName("bz.q(Lfo;Lfo;IIB)Lhd;")
    public static class224 method1082(class167 arg0, class167 arg1, int arg2, int arg3) {
        return method729(arg0, arg2, arg3) ? Statics.method590(arg1.method3050(arg2, arg3)) : null;
    }

    @ObfuscatedName("ak.o(Lfo;Ljava/lang/String;Ljava/lang/String;I)[Lco;")
    public static class81[] method657(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3056(arg1);
        int var4 = arg0.method3091(var3, arg2);
        return method158(arg0, var3, var4);
    }

    @ObfuscatedName("d.g(Lfo;Ljava/lang/String;Ljava/lang/String;B)Lco;")
    public static class81 method599(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3056(arg1);
        int var4 = arg0.method3091(var3, arg2);
        class81 var5;
        if (method729(arg0, var3, var4)) {
            class81 var6 = new class81();
            var6.field1409 = Statics.field1365;
            var6.field1415 = Statics.field1366;
            var6.field1413 = Statics.field1370[0];
            var6.field1414 = Statics.field1376[0];
            var6.field1411 = Statics.field2631[0];
            var6.field1416 = Statics.field224[0];
            var6.field1410 = Statics.field1954;
            var6.field1412 = Statics.field2035[0];
            method757();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("h.m(Lfo;Ljava/lang/String;Ljava/lang/String;I)[Lcr;")
    public static class79[] method582(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3056(arg1);
        int var4 = arg0.method3091(var3, arg2);
        return method82(arg0, var3, var4);
    }

    @ObfuscatedName("an.b(Lfo;Lfo;Ljava/lang/String;Ljava/lang/String;B)Lhd;")
    public static class224 method935(class167 arg0, class167 arg1, String arg2, String arg3) {
        int var4 = arg0.method3056(arg2);
        int var5 = arg0.method3091(var4, arg3);
        return method1082(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("ez.p(Lfo;II)Lco;")
    public static class81 method2947(class167 arg0, int arg1) {
        byte[] var2 = arg0.method3047(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method174(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class81 var4 = new class81();
        var4.field1409 = Statics.field1365;
        var4.field1415 = Statics.field1366;
        var4.field1413 = Statics.field1370[0];
        var4.field1414 = Statics.field1376[0];
        var4.field1411 = Statics.field2631[0];
        var4.field1416 = Statics.field224[0];
        var4.field1410 = Statics.field1954;
        var4.field1412 = Statics.field2035[0];
        method757();
        return var4;
    }

    @ObfuscatedName("h.t(B)[Lco;")
    public static class81[] method574() {
        class81[] var0 = new class81[Statics.field1368];
        for (int var1 = 0; var1 < Statics.field1368; var1++) {
            class81 var2 = var0[var1] = new class81();
            var2.field1409 = Statics.field1365;
            var2.field1415 = Statics.field1366;
            var2.field1413 = Statics.field1370[var1];
            var2.field1414 = Statics.field1376[var1];
            var2.field1411 = Statics.field2631[var1];
            var2.field1416 = Statics.field224[var1];
            var2.field1410 = Statics.field1954;
            var2.field1412 = Statics.field2035[var1];
        }
        method757();
        return var0;
    }

    @ObfuscatedName("ae.x(Lfo;III)Z")
    public static boolean method729(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3050(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method174(var3);
            return true;
        }
    }

    @ObfuscatedName("f.k([BI)V")
    public static void method174(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1988 = arg0.length - 2;
        Statics.field1368 = var1.method2440();
        Statics.field1370 = new int[Statics.field1368];
        Statics.field1376 = new int[Statics.field1368];
        Statics.field2631 = new int[Statics.field1368];
        Statics.field224 = new int[Statics.field1368];
        Statics.field2035 = new byte[Statics.field1368][];
        var1.field1988 = arg0.length - 7 - Statics.field1368 * 8;
        Statics.field1365 = var1.method2440();
        Statics.field1366 = var1.method2440();
        int var2 = (var1.method2388() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1368; var3++) {
            Statics.field1370[var3] = var1.method2440();
        }
        for (int var4 = 0; var4 < Statics.field1368; var4++) {
            Statics.field1376[var4] = var1.method2440();
        }
        for (int var5 = 0; var5 < Statics.field1368; var5++) {
            Statics.field2631[var5] = var1.method2440();
        }
        for (int var6 = 0; var6 < Statics.field1368; var6++) {
            Statics.field224[var6] = var1.method2440();
        }
        var1.field1988 = arg0.length - 7 - Statics.field1368 * 8 - (var2 - 1) * 3;
        Statics.field1954 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1954[var7] = var1.method2460();
            if (Statics.field1954[var7] == 0) {
                Statics.field1954[var7] = 1;
            }
        }
        var1.field1988 = 0;
        for (int var8 = 0; var8 < Statics.field1368; var8++) {
            int var9 = Statics.field2631[var8];
            int var10 = Statics.field224[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2035[var8] = var12;
            int var13 = var1.method2388();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2389();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2389();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ab.z(I)V")
    public static void method757() {
        Statics.field1370 = null;
        Statics.field1376 = null;
        Statics.field2631 = null;
        Statics.field224 = null;
        Statics.field1954 = null;
        Statics.field2035 = (byte[][]) null;
    }
}
