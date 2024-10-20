package deob;

@ObfuscatedName("bz")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.j(Lfy;IIB)[Lcr;")
    public static class81[] method2298(class168 arg0, int arg1, int arg2) {
        if (!method684(arg0, arg1, arg2)) {
            return null;
        }
        class81[] var3 = new class81[Statics.field1369];
        for (int var4 = 0; var4 < Statics.field1369; var4++) {
            class81 var5 = var3[var4] = new class81();
            var5.field1408 = Statics.field1365;
            var5.field1409 = Statics.field2028;
            var5.field1407 = Statics.field1367[var4];
            var5.field1405 = Statics.field1368[var4];
            var5.field1404 = Statics.field1146[var4];
            var5.field1402 = Statics.field1372[var4];
            var5.field1406 = Statics.field3221;
            var5.field1403 = Statics.field558[var4];
        }
        method2930();
        return var3;
    }

    @ObfuscatedName("ax.h(Lfy;III)Lcr;")
    public static class81 method739(class168 arg0, int arg1, int arg2) {
        if (!method684(arg0, arg1, arg2)) {
            return null;
        }
        class81 var3 = new class81();
        var3.field1408 = Statics.field1365;
        var3.field1409 = Statics.field2028;
        var3.field1407 = Statics.field1367[0];
        var3.field1405 = Statics.field1368[0];
        var3.field1404 = Statics.field1146[0];
        var3.field1402 = Statics.field1372[0];
        var3.field1406 = Statics.field3221;
        var3.field1403 = Statics.field558[0];
        method2930();
        return var3;
    }

    @ObfuscatedName("d.m(Lfy;IIB)Lce;")
    public static class79 method164(class168 arg0, int arg1, int arg2) {
        if (!method684(arg0, arg1, arg2)) {
            return null;
        }
        class79 var3 = new class79();
        var3.field1388 = Statics.field1365;
        var3.field1389 = Statics.field2028;
        var3.field1386 = Statics.field1367[0];
        var3.field1383 = Statics.field1368[0];
        var3.field1384 = Statics.field1146[0];
        var3.field1385 = Statics.field1372[0];
        int var4 = var3.field1385 * var3.field1384;
        byte[] var5 = Statics.field558[0];
        var3.field1393 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1393[var6] = Statics.field3221[var5[var6] & 0xFF];
        }
        method2930();
        return var3;
    }

    @ObfuscatedName("bm.z(Lfy;Lfy;III)Lhf;")
    public static class225 method1225(class168 arg0, class168 arg1, int arg2, int arg3) {
        return method684(arg0, arg2, arg3) ? method624(arg1.method3011(arg2, arg3)) : null;
    }

    @ObfuscatedName("ag.x(Lfy;Ljava/lang/String;Ljava/lang/String;B)[Lcr;")
    public static class81[] method712(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3026(arg1);
        int var4 = arg0.method3027(var3, arg2);
        return method2298(arg0, var3, var4);
    }

    @ObfuscatedName("cw.e(Lfy;Ljava/lang/String;Ljava/lang/String;B)Lcr;")
    public static class81 method2146(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3026(arg1);
        int var4 = arg0.method3027(var3, arg2);
        return method739(arg0, var3, var4);
    }

    @ObfuscatedName("cb.i(Lfy;Ljava/lang/String;Ljava/lang/String;I)[Lce;")
    public static class79[] method2058(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3026(arg1);
        int var4 = arg0.method3027(var3, arg2);
        class79[] var5;
        if (method684(arg0, var3, var4)) {
            var5 = method674();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fy.c(Lfy;Ljava/lang/String;Ljava/lang/String;I)Lce;")
    public static class79 method3089(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3026(arg1);
        int var4 = arg0.method3027(var3, arg2);
        return method164(arg0, var3, var4);
    }

    @ObfuscatedName("ak.n(Lfy;II)Lcr;")
    public static class81 method1055(class168 arg0, int arg1) {
        byte[] var2 = arg0.method3066(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method38(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class81 var4 = new class81();
        var4.field1408 = Statics.field1365;
        var4.field1409 = Statics.field2028;
        var4.field1407 = Statics.field1367[0];
        var4.field1405 = Statics.field1368[0];
        var4.field1404 = Statics.field1146[0];
        var4.field1402 = Statics.field1372[0];
        var4.field1406 = Statics.field3221;
        var4.field1403 = Statics.field558[0];
        method2930();
        return var4;
    }

    @ObfuscatedName("aj.l(I)[Lce;")
    public static class79[] method674() {
        class79[] var0 = new class79[Statics.field1369];
        for (int var1 = 0; var1 < Statics.field1369; var1++) {
            class79 var2 = var0[var1] = new class79();
            var2.field1388 = Statics.field1365;
            var2.field1389 = Statics.field2028;
            var2.field1386 = Statics.field1367[var1];
            var2.field1383 = Statics.field1368[var1];
            var2.field1384 = Statics.field1146[var1];
            var2.field1385 = Statics.field1372[var1];
            int var3 = var2.field1385 * var2.field1384;
            byte[] var4 = Statics.field558[var1];
            var2.field1393 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1393[var5] = Statics.field3221[var4[var5] & 0xFF];
            }
        }
        method2930();
        return var0;
    }

    @ObfuscatedName("au.u([BS)Lhf;")
    public static class225 method624(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class225 var1 = new class225(arg0, Statics.field1367, Statics.field1368, Statics.field1146, Statics.field1372, Statics.field3221, Statics.field558);
            method2930();
            return var1;
        }
    }

    @ObfuscatedName("aj.r(Lfy;III)Z")
    public static boolean method684(class168 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3011(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method38(var3);
            return true;
        }
    }

    @ObfuscatedName("x.a([BI)V")
    public static void method38(byte[] arg0) {
        class120 var1 = new class120(arg0);
        var1.field1972 = arg0.length - 2;
        Statics.field1369 = var1.method2363();
        Statics.field1367 = new int[Statics.field1369];
        Statics.field1368 = new int[Statics.field1369];
        Statics.field1146 = new int[Statics.field1369];
        Statics.field1372 = new int[Statics.field1369];
        Statics.field558 = new byte[Statics.field1369][];
        var1.field1972 = arg0.length - 7 - Statics.field1369 * 8;
        Statics.field1365 = var1.method2363();
        Statics.field2028 = var1.method2363();
        int var2 = (var1.method2361() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1369; var3++) {
            Statics.field1367[var3] = var1.method2363();
        }
        for (int var4 = 0; var4 < Statics.field1369; var4++) {
            Statics.field1368[var4] = var1.method2363();
        }
        for (int var5 = 0; var5 < Statics.field1369; var5++) {
            Statics.field1146[var5] = var1.method2363();
        }
        for (int var6 = 0; var6 < Statics.field1369; var6++) {
            Statics.field1372[var6] = var1.method2363();
        }
        var1.field1972 = arg0.length - 7 - Statics.field1369 * 8 - (var2 - 1) * 3;
        Statics.field3221 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3221[var7] = var1.method2523();
            if (Statics.field3221[var7] == 0) {
                Statics.field3221[var7] = 1;
            }
        }
        var1.field1972 = 0;
        for (int var8 = 0; var8 < Statics.field1369; var8++) {
            int var9 = Statics.field1146[var8];
            int var10 = Statics.field1372[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field558[var8] = var12;
            int var13 = var1.method2361();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2531();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2531();
                    }
                }
            }
        }
    }

    @ObfuscatedName("fz.d(I)V")
    public static void method2930() {
        Statics.field1367 = null;
        Statics.field1368 = null;
        Statics.field1146 = null;
        Statics.field1372 = null;
        Statics.field3221 = null;
        Statics.field558 = (byte[][]) null;
    }
}
