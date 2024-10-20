package deob;

@ObfuscatedName("bt")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.i(Lfn;IIB)[Lcw;")
    public static class81[] method2905(class167 arg0, int arg1, int arg2) {
        return method1178(arg0, arg1, arg2) ? method708() : null;
    }

    @ObfuscatedName("g.v(Lfn;III)Lcm;")
    public static class79 method164(class167 arg0, int arg1, int arg2) {
        if (!method1178(arg0, arg1, arg2)) {
            return null;
        }
        class79 var3 = new class79();
        var3.field1405 = Statics.field1389;
        var3.field1406 = Statics.field1384;
        var3.field1408 = Statics.field3146[0];
        var3.field1404 = Statics.field1383[0];
        var3.field1402 = Statics.field1382[0];
        var3.field1410 = Statics.field1385[0];
        int var4 = var3.field1410 * var3.field1402;
        byte[] var5 = Statics.field1386[0];
        var3.field1401 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1401[var6] = Statics.field1942[var5[var6] & 0xFF];
        }
        method2978();
        return var3;
    }

    @ObfuscatedName("am.f(Lfn;Lfn;III)Lhw;")
    public static class224 method872(class167 arg0, class167 arg1, int arg2, int arg3) {
        if (!method1178(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3080(arg2, arg3);
        class224 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class224 var6 = new class224(var4, Statics.field3146, Statics.field1383, Statics.field1382, Statics.field1385, Statics.field1942, Statics.field1386);
            method2978();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("da.h(Lfn;Ljava/lang/String;Ljava/lang/String;I)[Lcw;")
    public static class81[] method2227(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3033(arg1);
        int var4 = arg0.method3035(var3, arg2);
        return method2905(arg0, var3, var4);
    }

    @ObfuscatedName("b.a(Lfn;Ljava/lang/String;Ljava/lang/String;S)Lcw;")
    public static class81 method156(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3033(arg1);
        int var4 = arg0.method3035(var3, arg2);
        class81 var5;
        if (method1178(arg0, var3, var4)) {
            class81 var6 = new class81();
            var6.field1425 = Statics.field1389;
            var6.field1426 = Statics.field1384;
            var6.field1424 = Statics.field3146[0];
            var6.field1419 = Statics.field1383[0];
            var6.field1421 = Statics.field1382[0];
            var6.field1422 = Statics.field1385[0];
            var6.field1423 = Statics.field1942;
            var6.field1420 = Statics.field1386[0];
            method2978();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("e.s(Lfn;Ljava/lang/String;Ljava/lang/String;I)[Lcm;")
    public static class79[] method530(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3033(arg1);
        int var4 = arg0.method3035(var3, arg2);
        class79[] var5;
        if (method1178(arg0, var3, var4)) {
            var5 = method145();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("af.p(Lfn;Ljava/lang/String;Ljava/lang/String;I)Lcm;")
    public static class79 method767(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3033(arg1);
        int var4 = arg0.method3035(var3, arg2);
        return method164(arg0, var3, var4);
    }

    @ObfuscatedName("ai.r(B)[Lcw;")
    public static class81[] method708() {
        class81[] var0 = new class81[Statics.field1381];
        for (int var1 = 0; var1 < Statics.field1381; var1++) {
            class81 var2 = var0[var1] = new class81();
            var2.field1425 = Statics.field1389;
            var2.field1426 = Statics.field1384;
            var2.field1424 = Statics.field3146[var1];
            var2.field1419 = Statics.field1383[var1];
            var2.field1421 = Statics.field1382[var1];
            var2.field1422 = Statics.field1385[var1];
            var2.field1423 = Statics.field1942;
            var2.field1420 = Statics.field1386[var1];
        }
        method2978();
        return var0;
    }

    @ObfuscatedName("z.k(B)[Lcm;")
    public static class79[] method145() {
        class79[] var0 = new class79[Statics.field1381];
        for (int var1 = 0; var1 < Statics.field1381; var1++) {
            class79 var2 = var0[var1] = new class79();
            var2.field1405 = Statics.field1389;
            var2.field1406 = Statics.field1384;
            var2.field1408 = Statics.field3146[var1];
            var2.field1404 = Statics.field1383[var1];
            var2.field1402 = Statics.field1382[var1];
            var2.field1410 = Statics.field1385[var1];
            int var3 = var2.field1410 * var2.field1402;
            byte[] var4 = Statics.field1386[var1];
            var2.field1401 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1401[var5] = Statics.field1942[var4[var5] & 0xFF];
            }
        }
        method2978();
        return var0;
    }

    @ObfuscatedName("bw.d(Lfn;III)Z")
    public static boolean method1178(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3080(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method147(var3);
            return true;
        }
    }

    @ObfuscatedName("c.n([BI)V")
    public static void method147(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1984 = arg0.length - 2;
        Statics.field1381 = var1.method2312();
        Statics.field3146 = new int[Statics.field1381];
        Statics.field1383 = new int[Statics.field1381];
        Statics.field1382 = new int[Statics.field1381];
        Statics.field1385 = new int[Statics.field1381];
        Statics.field1386 = new byte[Statics.field1381][];
        var1.field1984 = arg0.length - 7 - Statics.field1381 * 8;
        Statics.field1389 = var1.method2312();
        Statics.field1384 = var1.method2312();
        int var2 = (var1.method2310() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1381; var3++) {
            Statics.field3146[var3] = var1.method2312();
        }
        for (int var4 = 0; var4 < Statics.field1381; var4++) {
            Statics.field1383[var4] = var1.method2312();
        }
        for (int var5 = 0; var5 < Statics.field1381; var5++) {
            Statics.field1382[var5] = var1.method2312();
        }
        for (int var6 = 0; var6 < Statics.field1381; var6++) {
            Statics.field1385[var6] = var1.method2312();
        }
        var1.field1984 = arg0.length - 7 - Statics.field1381 * 8 - (var2 - 1) * 3;
        Statics.field1942 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1942[var7] = var1.method2314();
            if (Statics.field1942[var7] == 0) {
                Statics.field1942[var7] = 1;
            }
        }
        var1.field1984 = 0;
        for (int var8 = 0; var8 < Statics.field1381; var8++) {
            int var9 = Statics.field1382[var8];
            int var10 = Statics.field1385[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1386[var8] = var12;
            int var13 = var1.method2310();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2311();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2311();
                    }
                }
            }
        }
    }

    @ObfuscatedName("fw.z(B)V")
    public static void method2978() {
        Statics.field3146 = null;
        Statics.field1383 = null;
        Statics.field1382 = null;
        Statics.field1385 = null;
        Statics.field1942 = null;
        Statics.field1386 = (byte[][]) null;
    }
}
