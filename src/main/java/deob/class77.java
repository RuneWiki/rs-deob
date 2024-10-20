package deob;

@ObfuscatedName("bm")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cu.a(Lfz;III)Lcj;")
    public static class81 method1959(class167 arg0, int arg1, int arg2) {
        return method170(arg0, arg1, arg2) ? method2039() : null;
    }

    @ObfuscatedName("ew.r(Lfz;Lfz;III)Lht;")
    public static class224 method2777(class167 arg0, class167 arg1, int arg2, int arg3) {
        if (!method170(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3025(arg2, arg3);
        class224 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class224 var6 = new class224(var4, Statics.field1387, Statics.field1383, Statics.field1765, Statics.field1384, Statics.field1969, Statics.field709);
            method8();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("ak.f(Lfz;Ljava/lang/String;Ljava/lang/String;I)[Lcj;")
    public static class81[] method649(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3040(arg1);
        int var4 = arg0.method3090(var3, arg2);
        class81[] var5;
        if (method170(arg0, var3, var4)) {
            class81[] var6 = new class81[Statics.field1386];
            for (int var7 = 0; var7 < Statics.field1386; var7++) {
                class81 var8 = var6[var7] = new class81();
                var8.field1423 = Statics.field1380;
                var8.field1417 = Statics.field1382;
                var8.field1420 = Statics.field1387[var7];
                var8.field1422 = Statics.field1383[var7];
                var8.field1419 = Statics.field1765[var7];
                var8.field1418 = Statics.field1384[var7];
                var8.field1421 = Statics.field1969;
                var8.field1424 = Statics.field709[var7];
            }
            method8();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ay.s(Lfz;Ljava/lang/String;Ljava/lang/String;I)Lcj;")
    public static class81 method992(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3040(arg1);
        int var4 = arg0.method3090(var3, arg2);
        return method1959(arg0, var3, var4);
    }

    @ObfuscatedName("ba.y(Lfz;Ljava/lang/String;Ljava/lang/String;B)[Lca;")
    public static class79[] method1520(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3040(arg1);
        int var4 = arg0.method3090(var3, arg2);
        class79[] var5;
        if (method170(arg0, var3, var4)) {
            class79[] var6 = new class79[Statics.field1386];
            for (int var7 = 0; var7 < Statics.field1386; var7++) {
                class79 var8 = var6[var7] = new class79();
                var8.field1403 = Statics.field1380;
                var8.field1404 = Statics.field1382;
                var8.field1401 = Statics.field1387[var7];
                var8.field1406 = Statics.field1383[var7];
                var8.field1400 = Statics.field1765[var7];
                var8.field1402 = Statics.field1384[var7];
                int var9 = var8.field1402 * var8.field1400;
                byte[] var10 = Statics.field709[var7];
                var8.field1398 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1398[var11] = Statics.field1969[var10[var11] & 0xFF];
                }
            }
            method8();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("a.e(Lfz;Ljava/lang/String;Ljava/lang/String;I)Lca;")
    public static class79 method1(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3040(arg1);
        int var4 = arg0.method3090(var3, arg2);
        class79 var5;
        if (method170(arg0, var3, var4)) {
            var5 = method194();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bk.g(Lfz;Lfz;Ljava/lang/String;Ljava/lang/String;I)Lht;")
    public static class224 method1556(class167 arg0, class167 arg1, String arg2, String arg3) {
        int var4 = arg0.method3040(arg2);
        int var5 = arg0.method3090(var4, arg3);
        return method2777(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("ck.m(B)Lcj;")
    public static class81 method2039() {
        class81 var0 = new class81();
        var0.field1423 = Statics.field1380;
        var0.field1417 = Statics.field1382;
        var0.field1420 = Statics.field1387[0];
        var0.field1422 = Statics.field1383[0];
        var0.field1419 = Statics.field1765[0];
        var0.field1418 = Statics.field1384[0];
        var0.field1421 = Statics.field1969;
        var0.field1424 = Statics.field709[0];
        method8();
        return var0;
    }

    @ObfuscatedName("t.j(B)Lca;")
    public static class79 method194() {
        class79 var0 = new class79();
        var0.field1403 = Statics.field1380;
        var0.field1404 = Statics.field1382;
        var0.field1401 = Statics.field1387[0];
        var0.field1406 = Statics.field1383[0];
        var0.field1400 = Statics.field1765[0];
        var0.field1402 = Statics.field1384[0];
        int var1 = var0.field1402 * var0.field1400;
        byte[] var2 = Statics.field709[0];
        var0.field1398 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1398[var3] = Statics.field1969[var2[var3] & 0xFF];
        }
        method8();
        return var0;
    }

    @ObfuscatedName("i.n(Lfz;III)Z")
    public static boolean method170(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3025(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1599(var3);
            return true;
        }
    }

    @ObfuscatedName("a.l(Lfz;IB)Z")
    public static boolean method4(class167 arg0, int arg1) {
        byte[] var2 = arg0.method3030(arg1);
        if (var2 == null) {
            return false;
        } else {
            method1599(var2);
            return true;
        }
    }

    @ObfuscatedName("bh.h([BB)V")
    public static void method1599(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1980 = arg0.length - 2;
        Statics.field1386 = var1.method2347();
        Statics.field1387 = new int[Statics.field1386];
        Statics.field1383 = new int[Statics.field1386];
        Statics.field1765 = new int[Statics.field1386];
        Statics.field1384 = new int[Statics.field1386];
        Statics.field709 = new byte[Statics.field1386][];
        var1.field1980 = arg0.length - 7 - Statics.field1386 * 8;
        Statics.field1380 = var1.method2347();
        Statics.field1382 = var1.method2347();
        int var2 = (var1.method2412() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1386; var3++) {
            Statics.field1387[var3] = var1.method2347();
        }
        for (int var4 = 0; var4 < Statics.field1386; var4++) {
            Statics.field1383[var4] = var1.method2347();
        }
        for (int var5 = 0; var5 < Statics.field1386; var5++) {
            Statics.field1765[var5] = var1.method2347();
        }
        for (int var6 = 0; var6 < Statics.field1386; var6++) {
            Statics.field1384[var6] = var1.method2347();
        }
        var1.field1980 = arg0.length - 7 - Statics.field1386 * 8 - (var2 - 1) * 3;
        Statics.field1969 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1969[var7] = var1.method2349();
            if (Statics.field1969[var7] == 0) {
                Statics.field1969[var7] = 1;
            }
        }
        var1.field1980 = 0;
        for (int var8 = 0; var8 < Statics.field1386; var8++) {
            int var9 = Statics.field1765[var8];
            int var10 = Statics.field1384[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field709[var8] = var12;
            int var13 = var1.method2412();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2540();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2540();
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.i(I)V")
    public static void method8() {
        Statics.field1387 = null;
        Statics.field1383 = null;
        Statics.field1765 = null;
        Statics.field1384 = null;
        Statics.field1969 = null;
        Statics.field709 = (byte[][]) null;
    }
}
