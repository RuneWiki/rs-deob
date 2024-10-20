package deob;

@ObfuscatedName("bv")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.a(Lft;III)[Lcg;")
    public static class81[] method153(class168 arg0, int arg1, int arg2) {
        if (!method737(arg0, arg1, arg2)) {
            return null;
        }
        class81[] var3 = new class81[Statics.field1385];
        for (int var4 = 0; var4 < Statics.field1385; var4++) {
            class81 var5 = var3[var4] = new class81();
            var5.field1426 = Statics.field1386;
            var5.field1427 = Statics.field1774;
            var5.field1422 = Statics.field1390[var4];
            var5.field1425 = Statics.field1388[var4];
            var5.field1420 = Statics.field2043[var4];
            var5.field1421 = Statics.field1398[var4];
            var5.field1424 = Statics.field154;
            var5.field1423 = Statics.field1389[var4];
        }
        method198();
        return var3;
    }

    @ObfuscatedName("ew.w(Lft;III)Lcd;")
    public static class79 method3038(class168 arg0, int arg1, int arg2) {
        if (!method737(arg0, arg1, arg2)) {
            return null;
        }
        class79 var3 = new class79();
        var3.field1406 = Statics.field1386;
        var3.field1408 = Statics.field1774;
        var3.field1404 = Statics.field1390[0];
        var3.field1405 = Statics.field1388[0];
        var3.field1402 = Statics.field2043[0];
        var3.field1403 = Statics.field1398[0];
        int var4 = var3.field1403 * var3.field1402;
        byte[] var5 = Statics.field1389[0];
        var3.field1412 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1412[var6] = Statics.field154[var5[var6] & 0xFF];
        }
        method198();
        return var3;
    }

    @ObfuscatedName("a.d(Lft;Lft;III)Lhr;")
    public static class225 method5(class168 arg0, class168 arg1, int arg2, int arg3) {
        return method737(arg0, arg2, arg3) ? method1856(arg1.method3188(arg2, arg3)) : null;
    }

    @ObfuscatedName("ct.c(Lft;Ljava/lang/String;Ljava/lang/String;B)[Lcg;")
    public static class81[] method1869(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3162(arg1);
        int var4 = arg0.method3163(var3, arg2);
        return method153(arg0, var3, var4);
    }

    @ObfuscatedName("r.y(Lft;Ljava/lang/String;Ljava/lang/String;I)Lcg;")
    public static class81 method131(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3162(arg1);
        int var4 = arg0.method3163(var3, arg2);
        class81 var5;
        if (method737(arg0, var3, var4)) {
            var5 = Statics.method1599();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("j.k(Lft;Ljava/lang/String;Ljava/lang/String;B)[Lcd;")
    public static class79[] method222(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3162(arg1);
        int var4 = arg0.method3163(var3, arg2);
        class79[] var5;
        if (method737(arg0, var3, var4)) {
            var5 = method2740();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("u.r(Lft;Lft;Ljava/lang/String;Ljava/lang/String;B)Lhr;")
    public static class225 method210(class168 arg0, class168 arg1, String arg2, String arg3) {
        int var4 = arg0.method3162(arg2);
        int var5 = arg0.method3163(var4, arg3);
        return method5(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("bb.p(Lft;II)Lcg;")
    public static class81 method1169(class168 arg0, int arg1) {
        byte[] var2 = arg0.method3199(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method2230(var2);
            var3 = true;
        }
        return var3 ? Statics.method1599() : null;
    }

    @ObfuscatedName("dl.m(B)[Lcd;")
    public static class79[] method2740() {
        class79[] var0 = new class79[Statics.field1385];
        for (int var1 = 0; var1 < Statics.field1385; var1++) {
            class79 var2 = var0[var1] = new class79();
            var2.field1406 = Statics.field1386;
            var2.field1408 = Statics.field1774;
            var2.field1404 = Statics.field1390[var1];
            var2.field1405 = Statics.field1388[var1];
            var2.field1402 = Statics.field2043[var1];
            var2.field1403 = Statics.field1398[var1];
            int var3 = var2.field1403 * var2.field1402;
            byte[] var4 = Statics.field1389[var1];
            var2.field1412 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1412[var5] = Statics.field154[var4[var5] & 0xFF];
            }
        }
        method198();
        return var0;
    }

    @ObfuscatedName("ce.e([BB)Lhr;")
    public static class225 method1856(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class225 var1 = new class225(arg0, Statics.field1390, Statics.field1388, Statics.field2043, Statics.field1398, Statics.field154, Statics.field1389);
            method198();
            return var1;
        }
    }

    @ObfuscatedName("af.x(Lft;III)Z")
    public static boolean method737(class168 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3188(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2230(var3);
            return true;
        }
    }

    @ObfuscatedName("cw.z([BI)V")
    public static void method2230(byte[] arg0) {
        class120 var1 = new class120(arg0);
        var1.field1993 = arg0.length - 2;
        Statics.field1385 = var1.method2464();
        Statics.field1390 = new int[Statics.field1385];
        Statics.field1388 = new int[Statics.field1385];
        Statics.field2043 = new int[Statics.field1385];
        Statics.field1398 = new int[Statics.field1385];
        Statics.field1389 = new byte[Statics.field1385][];
        var1.field1993 = arg0.length - 7 - Statics.field1385 * 8;
        Statics.field1386 = var1.method2464();
        Statics.field1774 = var1.method2464();
        int var2 = (var1.method2462() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1385; var3++) {
            Statics.field1390[var3] = var1.method2464();
        }
        for (int var4 = 0; var4 < Statics.field1385; var4++) {
            Statics.field1388[var4] = var1.method2464();
        }
        for (int var5 = 0; var5 < Statics.field1385; var5++) {
            Statics.field2043[var5] = var1.method2464();
        }
        for (int var6 = 0; var6 < Statics.field1385; var6++) {
            Statics.field1398[var6] = var1.method2464();
        }
        var1.field1993 = arg0.length - 7 - Statics.field1385 * 8 - (var2 - 1) * 3;
        Statics.field154 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field154[var7] = var1.method2466();
            if (Statics.field154[var7] == 0) {
                Statics.field154[var7] = 1;
            }
        }
        var1.field1993 = 0;
        for (int var8 = 0; var8 < Statics.field1385; var8++) {
            int var9 = Statics.field2043[var8];
            int var10 = Statics.field1398[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1389[var8] = var12;
            int var13 = var1.method2462();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2548();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2548();
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.i(B)V")
    public static void method198() {
        Statics.field1390 = null;
        Statics.field1388 = null;
        Statics.field2043 = null;
        Statics.field1398 = null;
        Statics.field154 = null;
        Statics.field1389 = (byte[][]) null;
    }
}
