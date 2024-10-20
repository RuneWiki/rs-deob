package deob;

@ObfuscatedName("bm")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dm.s(Lfa;III)[Lcj;")
    public static class81[] method2138(class168 arg0, int arg1, int arg2) {
        if (!method697(arg0, arg1, arg2)) {
            return null;
        }
        class81[] var3 = new class81[Statics.field1396];
        for (int var4 = 0; var4 < Statics.field1396; var4++) {
            class81 var5 = var3[var4] = new class81();
            var5.field1426 = Statics.field3215;
            var5.field1433 = Statics.field1387;
            var5.field1429 = Statics.field1388[var4];
            var5.field1432 = Statics.field1391[var4];
            var5.field1428 = Statics.field1390[var4];
            var5.field1430 = Statics.field160[var4];
            var5.field1427 = Statics.field1397;
            var5.field1431 = Statics.field576[var4];
        }
        method628();
        return var3;
    }

    @ObfuscatedName("r.j(Lfa;Ljava/lang/String;Ljava/lang/String;B)[Lcj;")
    public static class81[] method165(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3028(arg1);
        int var4 = arg0.method3029(var3, arg2);
        return method2138(arg0, var3, var4);
    }

    @ObfuscatedName("ec.p(Lfa;Ljava/lang/String;Ljava/lang/String;B)Lcj;")
    public static class81 method2752(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3028(arg1);
        int var4 = arg0.method3029(var3, arg2);
        class81 var5;
        if (method697(arg0, var3, var4)) {
            class81 var6 = new class81();
            var6.field1426 = Statics.field3215;
            var6.field1433 = Statics.field1387;
            var6.field1429 = Statics.field1388[0];
            var6.field1432 = Statics.field1391[0];
            var6.field1428 = Statics.field1390[0];
            var6.field1430 = Statics.field160[0];
            var6.field1427 = Statics.field1397;
            var6.field1431 = Statics.field576[0];
            method628();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("t.x(Lfa;Ljava/lang/String;Ljava/lang/String;I)[Lcs;")
    public static class79[] method150(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3028(arg1);
        int var4 = arg0.method3029(var3, arg2);
        class79[] var5;
        if (method697(arg0, var3, var4)) {
            var5 = method1939();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("en.d(Lfa;Lfa;Ljava/lang/String;Ljava/lang/String;S)Lhs;")
    public static class225 method2924(class168 arg0, class168 arg1, String arg2, String arg3) {
        int var4 = arg0.method3028(arg2);
        int var5 = arg0.method3029(var4, arg3);
        class225 var6;
        if (method697(arg0, var4, var5)) {
            byte[] var7 = arg1.method3014(var4, var5);
            class225 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class225 var9 = new class225(var7, Statics.field1388, Statics.field1391, Statics.field1390, Statics.field160, Statics.field1397, Statics.field576);
                method628();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("cg.u(I)[Lcs;")
    public static class79[] method1939() {
        class79[] var0 = new class79[Statics.field1396];
        for (int var1 = 0; var1 < Statics.field1396; var1++) {
            class79 var2 = var0[var1] = new class79();
            var2.field1417 = Statics.field3215;
            var2.field1413 = Statics.field1387;
            var2.field1411 = Statics.field1388[var1];
            var2.field1407 = Statics.field1391[var1];
            var2.field1408 = Statics.field1390[var1];
            var2.field1409 = Statics.field160[var1];
            int var3 = var2.field1409 * var2.field1408;
            byte[] var4 = Statics.field576[var1];
            var2.field1415 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1415[var5] = Statics.field1397[var4[var5] & 0xFF];
            }
        }
        method628();
        return var0;
    }

    @ObfuscatedName("ai.o(Lfa;IIB)Z")
    public static boolean method697(class168 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3014(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3197(var3);
            return true;
        }
    }

    @ObfuscatedName("fk.b([BI)V")
    public static void method3197(byte[] arg0) {
        class120 var1 = new class120(arg0);
        var1.field2006 = arg0.length - 2;
        Statics.field1396 = var1.method2430();
        Statics.field1388 = new int[Statics.field1396];
        Statics.field1391 = new int[Statics.field1396];
        Statics.field1390 = new int[Statics.field1396];
        Statics.field160 = new int[Statics.field1396];
        Statics.field576 = new byte[Statics.field1396][];
        var1.field2006 = arg0.length - 7 - Statics.field1396 * 8;
        Statics.field3215 = var1.method2430();
        Statics.field1387 = var1.method2430();
        int var2 = (var1.method2338() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1396; var3++) {
            Statics.field1388[var3] = var1.method2430();
        }
        for (int var4 = 0; var4 < Statics.field1396; var4++) {
            Statics.field1391[var4] = var1.method2430();
        }
        for (int var5 = 0; var5 < Statics.field1396; var5++) {
            Statics.field1390[var5] = var1.method2430();
        }
        for (int var6 = 0; var6 < Statics.field1396; var6++) {
            Statics.field160[var6] = var1.method2430();
        }
        var1.field2006 = arg0.length - 7 - Statics.field1396 * 8 - (var2 - 1) * 3;
        Statics.field1397 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1397[var7] = var1.method2359();
            if (Statics.field1397[var7] == 0) {
                Statics.field1397[var7] = 1;
            }
        }
        var1.field2006 = 0;
        for (int var8 = 0; var8 < Statics.field1396; var8++) {
            int var9 = Statics.field1390[var8];
            int var10 = Statics.field160[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field576[var8] = var12;
            int var13 = var1.method2338();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2339();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2339();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ad.k(I)V")
    public static void method628() {
        Statics.field1388 = null;
        Statics.field1391 = null;
        Statics.field1390 = null;
        Statics.field160 = null;
        Statics.field1397 = null;
        Statics.field576 = (byte[][]) null;
    }
}
