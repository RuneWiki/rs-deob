package deob;

@ObfuscatedName("bg")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cv.b(Lfl;III)[Lck;")
    public static class79[] method2039(class168 arg0, int arg1, int arg2) {
        return method747(arg0, arg1, arg2) ? method2952() : null;
    }

    @ObfuscatedName("eb.g(Lfl;III)Lck;")
    public static class79 method2838(class168 arg0, int arg1, int arg2) {
        if (!method747(arg0, arg1, arg2)) {
            return null;
        }
        class79 var3 = new class79();
        var3.field1371 = Statics.field1891;
        var3.field1373 = Statics.field1352;
        var3.field1370 = Statics.field1354[0];
        var3.field1374 = Statics.field2049[0];
        var3.field1375 = Statics.field1355[0];
        var3.field1372 = Statics.field675[0];
        int var4 = var3.field1375 * var3.field1372;
        byte[] var5 = Statics.field1356[0];
        var3.field1381 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1381[var6] = Statics.field136[var5[var6] & 0xFF];
        }
        Statics.method94();
        return var3;
    }

    @ObfuscatedName("f.j(Lfl;Ljava/lang/String;Ljava/lang/String;I)[Lcr;")
    public static class81[] method551(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3052(arg1);
        int var4 = arg0.method3053(var3, arg2);
        class81[] var5;
        if (method747(arg0, var3, var4)) {
            class81[] var6 = new class81[Statics.field1362];
            for (int var7 = 0; var7 < Statics.field1362; var7++) {
                class81 var8 = var6[var7] = new class81();
                var8.field1394 = Statics.field1891;
                var8.field1389 = Statics.field1352;
                var8.field1393 = Statics.field1354[var7];
                var8.field1396 = Statics.field2049[var7];
                var8.field1391 = Statics.field1355[var7];
                var8.field1392 = Statics.field675[var7];
                var8.field1390 = Statics.field136;
                var8.field1395 = Statics.field1356[var7];
            }
            Statics.method94();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("et.d(Lfl;Ljava/lang/String;Ljava/lang/String;B)Lcr;")
    public static class81 method2945(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3052(arg1);
        int var4 = arg0.method3053(var3, arg2);
        class81 var5;
        if (method747(arg0, var3, var4)) {
            class81 var6 = new class81();
            var6.field1394 = Statics.field1891;
            var6.field1389 = Statics.field1352;
            var6.field1393 = Statics.field1354[0];
            var6.field1396 = Statics.field2049[0];
            var6.field1391 = Statics.field1355[0];
            var6.field1392 = Statics.field675[0];
            var6.field1390 = Statics.field136;
            var6.field1395 = Statics.field1356[0];
            Statics.method94();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fm.y(B)[Lck;")
    public static class79[] method2952() {
        class79[] var0 = new class79[Statics.field1362];
        for (int var1 = 0; var1 < Statics.field1362; var1++) {
            class79 var2 = var0[var1] = new class79();
            var2.field1371 = Statics.field1891;
            var2.field1373 = Statics.field1352;
            var2.field1370 = Statics.field1354[var1];
            var2.field1374 = Statics.field2049[var1];
            var2.field1375 = Statics.field1355[var1];
            var2.field1372 = Statics.field675[var1];
            int var3 = var2.field1375 * var2.field1372;
            byte[] var4 = Statics.field1356[var1];
            var2.field1381 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1381[var5] = Statics.field136[var4[var5] & 0xFF];
            }
        }
        Statics.method94();
        return var0;
    }

    @ObfuscatedName("ew.r([BI)Lhx;")
    public static class225 method2930(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class225 var1 = new class225(arg0, Statics.field1354, Statics.field2049, Statics.field1355, Statics.field675, Statics.field136, Statics.field1356);
            Statics.method94();
            return var1;
        }
    }

    @ObfuscatedName("aa.c(Lfl;IIB)Z")
    public static boolean method747(class168 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3037(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2735(var3);
            return true;
        }
    }

    @ObfuscatedName("eb.l(Lfl;II)Z")
    public static boolean method2857(class168 arg0, int arg1) {
        byte[] var2 = arg0.method3042(arg1);
        if (var2 == null) {
            return false;
        } else {
            method2735(var2);
            return true;
        }
    }

    @ObfuscatedName("ef.u([BB)V")
    public static void method2735(byte[] arg0) {
        class120 var1 = new class120(arg0);
        var1.field1977 = arg0.length - 2;
        Statics.field1362 = var1.method2346();
        Statics.field1354 = new int[Statics.field1362];
        Statics.field2049 = new int[Statics.field1362];
        Statics.field1355 = new int[Statics.field1362];
        Statics.field675 = new int[Statics.field1362];
        Statics.field1356 = new byte[Statics.field1362][];
        var1.field1977 = arg0.length - 7 - Statics.field1362 * 8;
        Statics.field1891 = var1.method2346();
        Statics.field1352 = var1.method2346();
        int var2 = (var1.method2344() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1362; var3++) {
            Statics.field1354[var3] = var1.method2346();
        }
        for (int var4 = 0; var4 < Statics.field1362; var4++) {
            Statics.field2049[var4] = var1.method2346();
        }
        for (int var5 = 0; var5 < Statics.field1362; var5++) {
            Statics.field1355[var5] = var1.method2346();
        }
        for (int var6 = 0; var6 < Statics.field1362; var6++) {
            Statics.field675[var6] = var1.method2346();
        }
        var1.field1977 = arg0.length - 7 - Statics.field1362 * 8 - (var2 - 1) * 3;
        Statics.field136 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field136[var7] = var1.method2348();
            if (Statics.field136[var7] == 0) {
                Statics.field136[var7] = 1;
            }
        }
        var1.field1977 = 0;
        for (int var8 = 0; var8 < Statics.field1362; var8++) {
            int var9 = Statics.field1355[var8];
            int var10 = Statics.field675[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1356[var8] = var12;
            int var13 = var1.method2344();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2345();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2345();
                    }
                }
            }
        }
    }
}
