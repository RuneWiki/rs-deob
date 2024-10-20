package deob;

@ObfuscatedName("be")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.z(Lfl;III)Lcl;")
    public static class81 method2623(class167 arg0, int arg1, int arg2) {
        return method1440(arg0, arg1, arg2) ? method185() : null;
    }

    @ObfuscatedName("t.q(Lfl;III)[Lcg;")
    public static class79[] method177(class167 arg0, int arg1, int arg2) {
        if (!method1440(arg0, arg1, arg2)) {
            return null;
        }
        class79[] var3 = new class79[Statics.field3151];
        for (int var4 = 0; var4 < Statics.field3151; var4++) {
            class79 var5 = var3[var4] = new class79();
            var5.field1403 = Statics.field1380;
            var5.field1404 = Statics.field1378;
            var5.field1401 = Statics.field1377[var4];
            var5.field1402 = Statics.field3134[var4];
            var5.field1399 = Statics.field3148[var4];
            var5.field1398 = Statics.field1379[var4];
            int var6 = var5.field1399 * var5.field1398;
            byte[] var7 = Statics.field1381[var4];
            var5.field1400 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1400[var8] = Statics.field2303[var7[var8] & 0xFF];
            }
        }
        method3086();
        return var3;
    }

    @ObfuscatedName("ao.k(Lfl;III)Lcg;")
    public static class79 method872(class167 arg0, int arg1, int arg2) {
        return method1440(arg0, arg1, arg2) ? method911() : null;
    }

    @ObfuscatedName("fd.f(Lfl;Ljava/lang/String;Ljava/lang/String;B)[Lcl;")
    public static class81[] method3119(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3021(arg1);
        int var4 = arg0.method3002(var3, arg2);
        class81[] var5;
        if (method1440(arg0, var3, var4)) {
            class81[] var6 = new class81[Statics.field3151];
            for (int var7 = 0; var7 < Statics.field3151; var7++) {
                class81 var8 = var6[var7] = new class81();
                var8.field1423 = Statics.field1380;
                var8.field1420 = Statics.field1378;
                var8.field1421 = Statics.field1377[var7];
                var8.field1424 = Statics.field3134[var7];
                var8.field1417 = Statics.field3148[var7];
                var8.field1422 = Statics.field1379[var7];
                var8.field1418 = Statics.field2303;
                var8.field1419 = Statics.field1381[var7];
            }
            method3086();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ab.d(Lfl;Ljava/lang/String;Ljava/lang/String;B)Lcl;")
    public static class81 method616(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3021(arg1);
        int var4 = arg0.method3002(var3, arg2);
        return method2623(arg0, var3, var4);
    }

    @ObfuscatedName("g.l(Lfl;Ljava/lang/String;Ljava/lang/String;I)[Lcg;")
    public static class79[] method106(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3021(arg1);
        int var4 = arg0.method3002(var3, arg2);
        return method177(arg0, var3, var4);
    }

    @ObfuscatedName("u.r(I)Lcl;")
    public static class81 method185() {
        class81 var0 = new class81();
        var0.field1423 = Statics.field1380;
        var0.field1420 = Statics.field1378;
        var0.field1421 = Statics.field1377[0];
        var0.field1424 = Statics.field3134[0];
        var0.field1417 = Statics.field3148[0];
        var0.field1422 = Statics.field1379[0];
        var0.field1418 = Statics.field2303;
        var0.field1419 = Statics.field1381[0];
        method3086();
        return var0;
    }

    @ObfuscatedName("ax.g(B)Lcg;")
    public static class79 method911() {
        class79 var0 = new class79();
        var0.field1403 = Statics.field1380;
        var0.field1404 = Statics.field1378;
        var0.field1401 = Statics.field1377[0];
        var0.field1402 = Statics.field3134[0];
        var0.field1399 = Statics.field3148[0];
        var0.field1398 = Statics.field1379[0];
        int var1 = var0.field1399 * var0.field1398;
        byte[] var2 = Statics.field1381[0];
        var0.field1400 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1400[var3] = Statics.field2303[var2[var3] & 0xFF];
        }
        method3086();
        return var0;
    }

    @ObfuscatedName("by.h(Lfl;III)Z")
    public static boolean method1440(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2986(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method620(var3);
            return true;
        }
    }

    @ObfuscatedName("ff.n(Lfl;II)Z")
    public static boolean method2975(class167 arg0, int arg1) {
        byte[] var2 = arg0.method3060(arg1);
        if (var2 == null) {
            return false;
        } else {
            method620(var2);
            return true;
        }
    }

    @ObfuscatedName("al.j([BB)V")
    public static void method620(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1986 = arg0.length - 2;
        Statics.field3151 = var1.method2415();
        Statics.field1377 = new int[Statics.field3151];
        Statics.field3134 = new int[Statics.field3151];
        Statics.field3148 = new int[Statics.field3151];
        Statics.field1379 = new int[Statics.field3151];
        Statics.field1381 = new byte[Statics.field3151][];
        var1.field1986 = arg0.length - 7 - Statics.field3151 * 8;
        Statics.field1380 = var1.method2415();
        Statics.field1378 = var1.method2415();
        int var2 = (var1.method2457() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3151; var3++) {
            Statics.field1377[var3] = var1.method2415();
        }
        for (int var4 = 0; var4 < Statics.field3151; var4++) {
            Statics.field3134[var4] = var1.method2415();
        }
        for (int var5 = 0; var5 < Statics.field3151; var5++) {
            Statics.field3148[var5] = var1.method2415();
        }
        for (int var6 = 0; var6 < Statics.field3151; var6++) {
            Statics.field1379[var6] = var1.method2415();
        }
        var1.field1986 = arg0.length - 7 - Statics.field3151 * 8 - (var2 - 1) * 3;
        Statics.field2303 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2303[var7] = var1.method2305();
            if (Statics.field2303[var7] == 0) {
                Statics.field2303[var7] = 1;
            }
        }
        var1.field1986 = 0;
        for (int var8 = 0; var8 < Statics.field3151; var8++) {
            int var9 = Statics.field3148[var8];
            int var10 = Statics.field1379[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1381[var8] = var12;
            int var13 = var1.method2457();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2423();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2423();
                    }
                }
            }
        }
    }

    @ObfuscatedName("fz.a(I)V")
    public static void method3086() {
        Statics.field1377 = null;
        Statics.field3134 = null;
        Statics.field3148 = null;
        Statics.field1379 = null;
        Statics.field2303 = null;
        Statics.field1381 = (byte[][]) null;
    }
}
