package deob;

@ObfuscatedName("by")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.n(Lfm;IIB)[Lcj;")
    public static class79[] method723(class167 arg0, int arg1, int arg2) {
        if (!method655(arg0, arg1, arg2)) {
            return null;
        }
        class79[] var3 = new class79[Statics.field1369];
        for (int var4 = 0; var4 < Statics.field1369; var4++) {
            class79 var5 = var3[var4] = new class79();
            var5.field1392 = Statics.field1376;
            var5.field1390 = Statics.field1377;
            var5.field1389 = Statics.field1370[var4];
            var5.field1396 = Statics.field1371[var4];
            var5.field1388 = Statics.field1372[var4];
            var5.field1387 = Statics.field1620[var4];
            int var6 = var5.field1388 * var5.field1387;
            byte[] var7 = Statics.field1368[var4];
            var5.field1395 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1395[var8] = Statics.field1756[var7[var8] & 0xFF];
            }
        }
        method181();
        return var3;
    }

    @ObfuscatedName("u.q(Lfm;IIB)Lcj;")
    public static class79 method54(class167 arg0, int arg1, int arg2) {
        if (!method655(arg0, arg1, arg2)) {
            return null;
        }
        class79 var3 = new class79();
        var3.field1392 = Statics.field1376;
        var3.field1390 = Statics.field1377;
        var3.field1389 = Statics.field1370[0];
        var3.field1396 = Statics.field1371[0];
        var3.field1388 = Statics.field1372[0];
        var3.field1387 = Statics.field1620[0];
        int var4 = var3.field1388 * var3.field1387;
        byte[] var5 = Statics.field1368[0];
        var3.field1395 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1395[var6] = Statics.field1756[var5[var6] & 0xFF];
        }
        method181();
        return var3;
    }

    @ObfuscatedName("ab.c(Lfm;Lfm;III)Lhz;")
    public static class224 method982(class167 arg0, class167 arg1, int arg2, int arg3) {
        return method655(arg0, arg2, arg3) ? method3150(arg1.method3094(arg2, arg3)) : null;
    }

    @ObfuscatedName("fq.l(Lfm;Ljava/lang/String;Ljava/lang/String;I)[Lcu;")
    public static class81[] method3005(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3035(arg1);
        int var4 = arg0.method3042(var3, arg2);
        class81[] var5;
        if (method655(arg0, var3, var4)) {
            var5 = method86();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bb.r(Lfm;Ljava/lang/String;Ljava/lang/String;I)Lcu;")
    public static class81 method1510(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3035(arg1);
        int var4 = arg0.method3042(var3, arg2);
        class81 var5;
        if (method655(arg0, var3, var4)) {
            var5 = method729();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("m.u(Lfm;Ljava/lang/String;Ljava/lang/String;B)[Lcj;")
    public static class79[] method166(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3035(arg1);
        int var4 = arg0.method3042(var3, arg2);
        return method723(arg0, var3, var4);
    }

    @ObfuscatedName("ea.j(Lfm;Lfm;Ljava/lang/String;Ljava/lang/String;S)Lhz;")
    public static class224 method2785(class167 arg0, class167 arg1, String arg2, String arg3) {
        int var4 = arg0.method3035(arg2);
        int var5 = arg0.method3042(var4, arg3);
        return method982(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("u.w(B)[Lcu;")
    public static class81[] method86() {
        class81[] var0 = new class81[Statics.field1369];
        for (int var1 = 0; var1 < Statics.field1369; var1++) {
            class81 var2 = var0[var1] = new class81();
            var2.field1412 = Statics.field1376;
            var2.field1413 = Statics.field1377;
            var2.field1406 = Statics.field1370[var1];
            var2.field1411 = Statics.field1371[var1];
            var2.field1408 = Statics.field1372[var1];
            var2.field1409 = Statics.field1620[var1];
            var2.field1410 = Statics.field1756;
            var2.field1407 = Statics.field1368[var1];
        }
        method181();
        return var0;
    }

    @ObfuscatedName("ak.y(I)Lcu;")
    public static class81 method729() {
        class81 var0 = new class81();
        var0.field1412 = Statics.field1376;
        var0.field1413 = Statics.field1377;
        var0.field1406 = Statics.field1370[0];
        var0.field1411 = Statics.field1371[0];
        var0.field1408 = Statics.field1372[0];
        var0.field1409 = Statics.field1620[0];
        var0.field1410 = Statics.field1756;
        var0.field1407 = Statics.field1368[0];
        method181();
        return var0;
    }

    @ObfuscatedName("fe.o([BI)Lhz;")
    public static class224 method3150(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class224 var1 = new class224(arg0, Statics.field1370, Statics.field1371, Statics.field1372, Statics.field1620, Statics.field1756, Statics.field1368);
            method181();
            return var1;
        }
    }

    @ObfuscatedName("ac.h(Lfm;III)Z")
    public static boolean method655(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3094(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2243(var3);
            return true;
        }
    }

    @ObfuscatedName("z.e(Lfm;II)Z")
    public static boolean method200(class167 arg0, int arg1) {
        byte[] var2 = arg0.method3062(arg1);
        if (var2 == null) {
            return false;
        } else {
            method2243(var2);
            return true;
        }
    }

    @ObfuscatedName("dz.v([BI)V")
    public static void method2243(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1982 = arg0.length - 2;
        Statics.field1369 = var1.method2430();
        Statics.field1370 = new int[Statics.field1369];
        Statics.field1371 = new int[Statics.field1369];
        Statics.field1372 = new int[Statics.field1369];
        Statics.field1620 = new int[Statics.field1369];
        Statics.field1368 = new byte[Statics.field1369][];
        var1.field1982 = arg0.length - 7 - Statics.field1369 * 8;
        Statics.field1376 = var1.method2430();
        Statics.field1377 = var1.method2430();
        int var2 = (var1.method2360() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1369; var3++) {
            Statics.field1370[var3] = var1.method2430();
        }
        for (int var4 = 0; var4 < Statics.field1369; var4++) {
            Statics.field1371[var4] = var1.method2430();
        }
        for (int var5 = 0; var5 < Statics.field1369; var5++) {
            Statics.field1372[var5] = var1.method2430();
        }
        for (int var6 = 0; var6 < Statics.field1369; var6++) {
            Statics.field1620[var6] = var1.method2430();
        }
        var1.field1982 = arg0.length - 7 - Statics.field1369 * 8 - (var2 - 1) * 3;
        Statics.field1756 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1756[var7] = var1.method2364();
            if (Statics.field1756[var7] == 0) {
                Statics.field1756[var7] = 1;
            }
        }
        var1.field1982 = 0;
        for (int var8 = 0; var8 < Statics.field1369; var8++) {
            int var9 = Statics.field1372[var8];
            int var10 = Statics.field1620[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1368[var8] = var12;
            int var13 = var1.method2360();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2512();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2512();
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.p(I)V")
    public static void method181() {
        Statics.field1370 = null;
        Statics.field1371 = null;
        Statics.field1372 = null;
        Statics.field1620 = null;
        Statics.field1756 = null;
        Statics.field1368 = (byte[][]) null;
    }
}
