package deob;

@ObfuscatedName("bc")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bo.d(Lfn;III)[Lco;")
    public static class79[] method1511(class167 arg0, int arg1, int arg2) {
        if (!method4(arg0, arg1, arg2)) {
            return null;
        }
        class79[] var3 = new class79[Statics.field1390];
        for (int var4 = 0; var4 < Statics.field1390; var4++) {
            class79 var5 = var3[var4] = new class79();
            var5.field1403 = Statics.field1382;
            var5.field1404 = Statics.field1392;
            var5.field1398 = Statics.field1384[var4];
            var5.field1407 = Statics.field1163[var4];
            var5.field1399 = Statics.field1385[var4];
            var5.field1400 = Statics.field1386[var4];
            int var6 = var5.field1400 * var5.field1399;
            byte[] var7 = Statics.field788[var4];
            var5.field1408 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1408[var8] = Statics.field2633[var7[var8] & 0xFF];
            }
        }
        method2991();
        return var3;
    }

    @ObfuscatedName("ac.p(Lfn;Ljava/lang/String;Ljava/lang/String;S)[Lcx;")
    public static class81[] method809(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3106(arg1);
        int var4 = arg0.method3107(var3, arg2);
        class81[] var5;
        if (method4(arg0, var3, var4)) {
            var5 = method2961();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("af.v(Lfn;Ljava/lang/String;Ljava/lang/String;I)Lcx;")
    public static class81 method848(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3106(arg1);
        int var4 = arg0.method3107(var3, arg2);
        class81 var5;
        if (method4(arg0, var3, var4)) {
            var5 = method1953();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("x.l(Lfn;Ljava/lang/String;Ljava/lang/String;I)[Lco;")
    public static class79[] method157(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3106(arg1);
        int var4 = arg0.method3107(var3, arg2);
        return method1511(arg0, var3, var4);
    }

    @ObfuscatedName("ds.y(Lfn;Ljava/lang/String;Ljava/lang/String;I)Lco;")
    public static class79 method2663(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3106(arg1);
        int var4 = arg0.method3107(var3, arg2);
        class79 var5;
        if (method4(arg0, var3, var4)) {
            class79 var6 = new class79();
            var6.field1403 = Statics.field1382;
            var6.field1404 = Statics.field1392;
            var6.field1398 = Statics.field1384[0];
            var6.field1407 = Statics.field1163[0];
            var6.field1399 = Statics.field1385[0];
            var6.field1400 = Statics.field1386[0];
            int var7 = var6.field1400 * var6.field1399;
            byte[] var8 = Statics.field788[0];
            var6.field1408 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field1408[var9] = Statics.field2633[var8[var9] & 0xFF];
            }
            method2991();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("e.w(Lfn;Lfn;Ljava/lang/String;Ljava/lang/String;I)Lhb;")
    public static class224 method124(class167 arg0, class167 arg1, String arg2, String arg3) {
        int var4 = arg0.method3106(arg2);
        int var5 = arg0.method3107(var4, arg3);
        class224 var6;
        if (method4(arg0, var4, var5)) {
            var6 = method108(arg1.method3134(var4, var5));
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("ed.u(Lfn;IB)Lcx;")
    public static class81 method2733(class167 arg0, int arg1) {
        byte[] var2 = arg0.method3096(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method16(var2);
            var3 = true;
        }
        return var3 ? method1953() : null;
    }

    @ObfuscatedName("ea.a(S)[Lcx;")
    public static class81[] method2961() {
        class81[] var0 = new class81[Statics.field1390];
        for (int var1 = 0; var1 < Statics.field1390; var1++) {
            class81 var2 = var0[var1] = new class81();
            var2.field1423 = Statics.field1382;
            var2.field1424 = Statics.field1392;
            var2.field1422 = Statics.field1384[var1];
            var2.field1421 = Statics.field1163[var1];
            var2.field1419 = Statics.field1385[var1];
            var2.field1420 = Statics.field1386[var1];
            var2.field1417 = Statics.field2633;
            var2.field1418 = Statics.field788[var1];
        }
        method2991();
        return var0;
    }

    @ObfuscatedName("cq.e(B)Lcx;")
    public static class81 method1953() {
        class81 var0 = new class81();
        var0.field1423 = Statics.field1382;
        var0.field1424 = Statics.field1392;
        var0.field1422 = Statics.field1384[0];
        var0.field1421 = Statics.field1163[0];
        var0.field1419 = Statics.field1385[0];
        var0.field1420 = Statics.field1386[0];
        var0.field1417 = Statics.field2633;
        var0.field1418 = Statics.field788[0];
        method2991();
        return var0;
    }

    @ObfuscatedName("a.b([BI)Lhb;")
    public static class224 method108(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class224 var1 = new class224(arg0, Statics.field1384, Statics.field1163, Statics.field1385, Statics.field1386, Statics.field2633, Statics.field788);
            method2991();
            return var1;
        }
    }

    @ObfuscatedName("p.o(Lfn;III)Z")
    public static boolean method4(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3134(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method16(var3);
            return true;
        }
    }

    @ObfuscatedName("v.m([BS)V")
    public static void method16(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1966 = arg0.length - 2;
        Statics.field1390 = var1.method2359();
        Statics.field1384 = new int[Statics.field1390];
        Statics.field1163 = new int[Statics.field1390];
        Statics.field1385 = new int[Statics.field1390];
        Statics.field1386 = new int[Statics.field1390];
        Statics.field788 = new byte[Statics.field1390][];
        var1.field1966 = arg0.length - 7 - Statics.field1390 * 8;
        Statics.field1382 = var1.method2359();
        Statics.field1392 = var1.method2359();
        int var2 = (var1.method2357() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1390; var3++) {
            Statics.field1384[var3] = var1.method2359();
        }
        for (int var4 = 0; var4 < Statics.field1390; var4++) {
            Statics.field1163[var4] = var1.method2359();
        }
        for (int var5 = 0; var5 < Statics.field1390; var5++) {
            Statics.field1385[var5] = var1.method2359();
        }
        for (int var6 = 0; var6 < Statics.field1390; var6++) {
            Statics.field1386[var6] = var1.method2359();
        }
        var1.field1966 = arg0.length - 7 - Statics.field1390 * 8 - (var2 - 1) * 3;
        Statics.field2633 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2633[var7] = var1.method2361();
            if (Statics.field2633[var7] == 0) {
                Statics.field2633[var7] = 1;
            }
        }
        var1.field1966 = 0;
        for (int var8 = 0; var8 < Statics.field1390; var8++) {
            int var9 = Statics.field1385[var8];
            int var10 = Statics.field1386[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field788[var8] = var12;
            int var13 = var1.method2357();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2477();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2477();
                    }
                }
            }
        }
    }

    @ObfuscatedName("eh.x(B)V")
    public static void method2991() {
        Statics.field1384 = null;
        Statics.field1163 = null;
        Statics.field1385 = null;
        Statics.field1386 = null;
        Statics.field2633 = null;
        Statics.field788 = (byte[][]) null;
    }
}
