package deob;

@ObfuscatedName("bg")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fj.k(Lfo;III)[Lcj;")
    public static class81[] method2963(class167 arg0, int arg1, int arg2) {
        return method1457(arg0, arg1, arg2) ? method97() : null;
    }

    @ObfuscatedName("ab.h(Lfo;III)Lcj;")
    public static class81 method935(class167 arg0, int arg1, int arg2) {
        return method1457(arg0, arg1, arg2) ? method87() : null;
    }

    @ObfuscatedName("f.o(Lfo;Ljava/lang/String;Ljava/lang/String;I)[Lcj;")
    public static class81[] method118(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3064(arg1);
        int var4 = arg0.method3065(var3, arg2);
        return method2963(arg0, var3, var4);
    }

    @ObfuscatedName("ed.z(Lfo;Ljava/lang/String;Ljava/lang/String;I)Lcj;")
    public static class81 method2825(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3064(arg1);
        int var4 = arg0.method3065(var3, arg2);
        return method935(arg0, var3, var4);
    }

    @ObfuscatedName("al.c(Lfo;Ljava/lang/String;Ljava/lang/String;B)[Lcc;")
    public static class79[] method706(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3064(arg1);
        int var4 = arg0.method3065(var3, arg2);
        class79[] var5;
        if (method1457(arg0, var3, var4)) {
            class79[] var6 = new class79[Statics.field1356];
            for (int var7 = 0; var7 < Statics.field1356; var7++) {
                class79 var8 = var6[var7] = new class79();
                var8.field1375 = Statics.field1360;
                var8.field1376 = Statics.field1355;
                var8.field1373 = Statics.field1357[var7];
                var8.field1374 = Statics.field43[var7];
                var8.field1371 = Statics.field3151[var7];
                var8.field1379 = Statics.field2651[var7];
                int var9 = var8.field1379 * var8.field1371;
                byte[] var10 = Statics.field2150[var7];
                var8.field1370 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1370[var11] = Statics.field3142[var10[var11] & 0xFF];
                }
            }
            method2267();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ba.d(Lfo;Ljava/lang/String;Ljava/lang/String;B)Lcc;")
    public static class79 method1042(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3064(arg1);
        int var4 = arg0.method3065(var3, arg2);
        class79 var5;
        if (method1457(arg0, var3, var4)) {
            class79 var6 = new class79();
            var6.field1375 = Statics.field1360;
            var6.field1376 = Statics.field1355;
            var6.field1373 = Statics.field1357[0];
            var6.field1374 = Statics.field43[0];
            var6.field1371 = Statics.field3151[0];
            var6.field1379 = Statics.field2651[0];
            int var7 = var6.field1379 * var6.field1371;
            byte[] var8 = Statics.field2150[0];
            var6.field1370 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field1370[var9] = Statics.field3142[var8[var9] & 0xFF];
            }
            method2267();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("b.b(I)[Lcj;")
    public static class81[] method97() {
        class81[] var0 = new class81[Statics.field1356];
        for (int var1 = 0; var1 < Statics.field1356; var1++) {
            class81 var2 = var0[var1] = new class81();
            var2.field1395 = Statics.field1360;
            var2.field1396 = Statics.field1355;
            var2.field1393 = Statics.field1357[var1];
            var2.field1389 = Statics.field43[var1];
            var2.field1391 = Statics.field3151[var1];
            var2.field1392 = Statics.field2651[var1];
            var2.field1394 = Statics.field3142;
            var2.field1390 = Statics.field2150[var1];
        }
        method2267();
        return var0;
    }

    @ObfuscatedName("l.j(B)Lcj;")
    public static class81 method87() {
        class81 var0 = new class81();
        var0.field1395 = Statics.field1360;
        var0.field1396 = Statics.field1355;
        var0.field1393 = Statics.field1357[0];
        var0.field1389 = Statics.field43[0];
        var0.field1391 = Statics.field3151[0];
        var0.field1392 = Statics.field2651[0];
        var0.field1394 = Statics.field3142;
        var0.field1390 = Statics.field2150[0];
        method2267();
        return var0;
    }

    @ObfuscatedName("bv.f(Lfo;IIB)Z")
    public static boolean method1457(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3118(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method832(var3);
            return true;
        }
    }

    @ObfuscatedName("t.i(Lfo;IS)Z")
    public static boolean method143(class167 arg0, int arg1) {
        byte[] var2 = arg0.method3049(arg1);
        if (var2 == null) {
            return false;
        } else {
            method832(var2);
            return true;
        }
    }

    @ObfuscatedName("ah.g([BI)V")
    public static void method832(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1949 = arg0.length - 2;
        Statics.field1356 = var1.method2332();
        Statics.field1357 = new int[Statics.field1356];
        Statics.field43 = new int[Statics.field1356];
        Statics.field3151 = new int[Statics.field1356];
        Statics.field2651 = new int[Statics.field1356];
        Statics.field2150 = new byte[Statics.field1356][];
        var1.field1949 = arg0.length - 7 - Statics.field1356 * 8;
        Statics.field1360 = var1.method2332();
        Statics.field1355 = var1.method2332();
        int var2 = (var1.method2330() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1356; var3++) {
            Statics.field1357[var3] = var1.method2332();
        }
        for (int var4 = 0; var4 < Statics.field1356; var4++) {
            Statics.field43[var4] = var1.method2332();
        }
        for (int var5 = 0; var5 < Statics.field1356; var5++) {
            Statics.field3151[var5] = var1.method2332();
        }
        for (int var6 = 0; var6 < Statics.field1356; var6++) {
            Statics.field2651[var6] = var1.method2332();
        }
        var1.field1949 = arg0.length - 7 - Statics.field1356 * 8 - (var2 - 1) * 3;
        Statics.field3142 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3142[var7] = var1.method2420();
            if (Statics.field3142[var7] == 0) {
                Statics.field3142[var7] = 1;
            }
        }
        var1.field1949 = 0;
        for (int var8 = 0; var8 < Statics.field1356; var8++) {
            int var9 = Statics.field3151[var8];
            int var10 = Statics.field2651[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2150[var8] = var12;
            int var13 = var1.method2330();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2413();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2413();
                    }
                }
            }
        }
    }

    @ObfuscatedName("dx.t(B)V")
    public static void method2267() {
        Statics.field1357 = null;
        Statics.field43 = null;
        Statics.field3151 = null;
        Statics.field2651 = null;
        Statics.field3142 = null;
        Statics.field2150 = (byte[][]) null;
    }
}
