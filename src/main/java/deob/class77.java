package deob;

@ObfuscatedName("bc")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.i(Lfe;III)[Lca;")
    public static class81[] method767(class167 arg0, int arg1, int arg2) {
        return method12(arg0, arg1, arg2) ? method117() : null;
    }

    @ObfuscatedName("u.v(Lfe;III)Lca;")
    public static class81 method214(class167 arg0, int arg1, int arg2) {
        if (!method12(arg0, arg1, arg2)) {
            return null;
        }
        class81 var3 = new class81();
        var3.field1427 = Statics.field1383;
        var3.field1429 = Statics.field1390;
        var3.field1426 = Statics.field2891[0];
        var3.field1425 = Statics.field3144[0];
        var3.field1424 = Statics.field1384[0];
        var3.field1422 = Statics.field1386[0];
        var3.field1423 = Statics.field1041;
        var3.field1428 = Statics.field1755[0];
        Statics.field2891 = null;
        Statics.field3144 = null;
        Statics.field1384 = null;
        Statics.field1386 = null;
        Statics.field1041 = null;
        Statics.field1755 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("cz.r(Lfe;III)[Lck;")
    public static class79[] method2040(class167 arg0, int arg1, int arg2) {
        if (!method12(arg0, arg1, arg2)) {
            return null;
        }
        class79[] var3 = new class79[Statics.field1385];
        for (int var4 = 0; var4 < Statics.field1385; var4++) {
            class79 var5 = var3[var4] = new class79();
            var5.field1408 = Statics.field1383;
            var5.field1409 = Statics.field1390;
            var5.field1406 = Statics.field2891[var4];
            var5.field1407 = Statics.field3144[var4];
            var5.field1404 = Statics.field1384[var4];
            var5.field1403 = Statics.field1386[var4];
            int var6 = var5.field1404 * var5.field1403;
            byte[] var7 = Statics.field1755[var4];
            var5.field1414 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1414[var8] = Statics.field1041[var7[var8] & 0xFF];
            }
        }
        Statics.field2891 = null;
        Statics.field3144 = null;
        Statics.field1384 = null;
        Statics.field1386 = null;
        Statics.field1041 = null;
        Statics.field1755 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("r.n(Lfe;Ljava/lang/String;Ljava/lang/String;B)[Lca;")
    public static class81[] method44(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3049(arg1);
        int var4 = arg0.method3079(var3, arg2);
        return method767(arg0, var3, var4);
    }

    @ObfuscatedName("ah.x(Lfe;Ljava/lang/String;Ljava/lang/String;I)Lca;")
    public static class81 method671(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3049(arg1);
        int var4 = arg0.method3079(var3, arg2);
        return method214(arg0, var3, var4);
    }

    @ObfuscatedName("al.q(Lfe;Ljava/lang/String;Ljava/lang/String;I)[Lck;")
    public static class79[] method725(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3049(arg1);
        int var4 = arg0.method3079(var3, arg2);
        return method2040(arg0, var3, var4);
    }

    @ObfuscatedName("y.d(I)[Lca;")
    public static class81[] method117() {
        class81[] var0 = new class81[Statics.field1385];
        for (int var1 = 0; var1 < Statics.field1385; var1++) {
            class81 var2 = var0[var1] = new class81();
            var2.field1427 = Statics.field1383;
            var2.field1429 = Statics.field1390;
            var2.field1426 = Statics.field2891[var1];
            var2.field1425 = Statics.field3144[var1];
            var2.field1424 = Statics.field1384[var1];
            var2.field1422 = Statics.field1386[var1];
            var2.field1423 = Statics.field1041;
            var2.field1428 = Statics.field1755[var1];
        }
        Statics.field2891 = null;
        Statics.field3144 = null;
        Statics.field1384 = null;
        Statics.field1386 = null;
        Statics.field1041 = null;
        Statics.field1755 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ey.c(I)Lck;")
    public static class79 method2946() {
        class79 var0 = new class79();
        var0.field1408 = Statics.field1383;
        var0.field1409 = Statics.field1390;
        var0.field1406 = Statics.field2891[0];
        var0.field1407 = Statics.field3144[0];
        var0.field1404 = Statics.field1384[0];
        var0.field1403 = Statics.field1386[0];
        int var1 = var0.field1404 * var0.field1403;
        byte[] var2 = Statics.field1755[0];
        var0.field1414 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1414[var3] = Statics.field1041[var2[var3] & 0xFF];
        }
        Statics.field2891 = null;
        Statics.field3144 = null;
        Statics.field1384 = null;
        Statics.field1386 = null;
        Statics.field1041 = null;
        Statics.field1755 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("v.y(Lfe;III)Z")
    public static boolean method12(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3035(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3227(var3);
            return true;
        }
    }

    @ObfuscatedName("fi.m([BI)V")
    public static void method3227(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1980 = arg0.length - 2;
        Statics.field1385 = var1.method2347();
        Statics.field2891 = new int[Statics.field1385];
        Statics.field3144 = new int[Statics.field1385];
        Statics.field1384 = new int[Statics.field1385];
        Statics.field1386 = new int[Statics.field1385];
        Statics.field1755 = new byte[Statics.field1385][];
        var1.field1980 = arg0.length - 7 - Statics.field1385 * 8;
        Statics.field1383 = var1.method2347();
        Statics.field1390 = var1.method2347();
        int var2 = (var1.method2380() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1385; var3++) {
            Statics.field2891[var3] = var1.method2347();
        }
        for (int var4 = 0; var4 < Statics.field1385; var4++) {
            Statics.field3144[var4] = var1.method2347();
        }
        for (int var5 = 0; var5 < Statics.field1385; var5++) {
            Statics.field1384[var5] = var1.method2347();
        }
        for (int var6 = 0; var6 < Statics.field1385; var6++) {
            Statics.field1386[var6] = var1.method2347();
        }
        var1.field1980 = arg0.length - 7 - Statics.field1385 * 8 - (var2 - 1) * 3;
        Statics.field1041 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1041[var7] = var1.method2349();
            if (Statics.field1041[var7] == 0) {
                Statics.field1041[var7] = 1;
            }
        }
        var1.field1980 = 0;
        for (int var8 = 0; var8 < Statics.field1385; var8++) {
            int var9 = Statics.field1384[var8];
            int var10 = Statics.field1386[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1755[var8] = var12;
            int var13 = var1.method2380();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2346();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2346();
                    }
                }
            }
        }
    }
}
