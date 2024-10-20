package deob;

@ObfuscatedName("bh")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gl.v(Lfh;III)[Lcs;")
    public static class81[] method3477(class167 arg0, int arg1, int arg2) {
        return method640(arg0, arg1, arg2) ? method37() : null;
    }

    @ObfuscatedName("c.f(Lfh;III)Lcs;")
    public static class81 method86(class167 arg0, int arg1, int arg2) {
        if (!method640(arg0, arg1, arg2)) {
            return null;
        }
        class81 var3 = new class81();
        var3.field1419 = Statics.field1381;
        var3.field1418 = Statics.field1384;
        var3.field1416 = Statics.field81[0];
        var3.field1417 = Statics.field1382[0];
        var3.field1414 = Statics.field2215[0];
        var3.field1412 = Statics.field751[0];
        var3.field1413 = Statics.field3159;
        var3.field1415 = Statics.field1345[0];
        method124();
        return var3;
    }

    @ObfuscatedName("av.i(Lfh;IIB)Lcl;")
    public static class79 method870(class167 arg0, int arg1, int arg2) {
        if (!method640(arg0, arg1, arg2)) {
            return null;
        }
        class79 var3 = new class79();
        var3.field1398 = Statics.field1381;
        var3.field1394 = Statics.field1384;
        var3.field1396 = Statics.field81[0];
        var3.field1400 = Statics.field1382[0];
        var3.field1401 = Statics.field2215[0];
        var3.field1395 = Statics.field751[0];
        int var4 = var3.field1401 * var3.field1395;
        byte[] var5 = Statics.field1345[0];
        var3.field1397 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1397[var6] = Statics.field3159[var5[var6] & 0xFF];
        }
        method124();
        return var3;
    }

    @ObfuscatedName("z.d(Lfh;Lfh;IIB)Lhi;")
    public static class224 method153(class167 arg0, class167 arg1, int arg2, int arg3) {
        return method640(arg0, arg2, arg3) ? method166(arg1.method3082(arg2, arg3)) : null;
    }

    @ObfuscatedName("p.o(Lfh;Ljava/lang/String;Ljava/lang/String;I)[Lcs;")
    public static class81[] method95(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3040(arg1);
        int var4 = arg0.method3041(var3, arg2);
        return method3477(arg0, var3, var4);
    }

    @ObfuscatedName("be.p(Lfh;Ljava/lang/String;Ljava/lang/String;I)[Lcl;")
    public static class79[] method1501(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3040(arg1);
        int var4 = arg0.method3041(var3, arg2);
        class79[] var5;
        if (method640(arg0, var3, var4)) {
            class79[] var6 = new class79[Statics.field2028];
            for (int var7 = 0; var7 < Statics.field2028; var7++) {
                class79 var8 = var6[var7] = new class79();
                var8.field1398 = Statics.field1381;
                var8.field1394 = Statics.field1384;
                var8.field1396 = Statics.field81[var7];
                var8.field1400 = Statics.field1382[var7];
                var8.field1401 = Statics.field2215[var7];
                var8.field1395 = Statics.field751[var7];
                int var9 = var8.field1401 * var8.field1395;
                byte[] var10 = Statics.field1345[var7];
                var8.field1397 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1397[var11] = Statics.field3159[var10[var11] & 0xFF];
                }
            }
            method124();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("v.j(Lfh;Ljava/lang/String;Ljava/lang/String;I)Lcl;")
    public static class79 method4(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method3040(arg1);
        int var4 = arg0.method3041(var3, arg2);
        return method870(arg0, var3, var4);
    }

    @ObfuscatedName("au.a(Lfh;Lfh;Ljava/lang/String;Ljava/lang/String;I)Lhi;")
    public static class224 method641(class167 arg0, class167 arg1, String arg2, String arg3) {
        int var4 = arg0.method3040(arg2);
        int var5 = arg0.method3041(var4, arg3);
        return method153(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("cy.y(Lfh;II)Lcs;")
    public static class81 method1778(class167 arg0, int arg1) {
        if (!method1503(arg0, arg1)) {
            return null;
        }
        class81 var2 = new class81();
        var2.field1419 = Statics.field1381;
        var2.field1418 = Statics.field1384;
        var2.field1416 = Statics.field81[0];
        var2.field1417 = Statics.field1382[0];
        var2.field1414 = Statics.field2215[0];
        var2.field1412 = Statics.field751[0];
        var2.field1413 = Statics.field3159;
        var2.field1415 = Statics.field1345[0];
        method124();
        return var2;
    }

    @ObfuscatedName("i.h(I)[Lcs;")
    public static class81[] method37() {
        class81[] var0 = new class81[Statics.field2028];
        for (int var1 = 0; var1 < Statics.field2028; var1++) {
            class81 var2 = var0[var1] = new class81();
            var2.field1419 = Statics.field1381;
            var2.field1418 = Statics.field1384;
            var2.field1416 = Statics.field81[var1];
            var2.field1417 = Statics.field1382[var1];
            var2.field1414 = Statics.field2215[var1];
            var2.field1412 = Statics.field751[var1];
            var2.field1413 = Statics.field3159;
            var2.field1415 = Statics.field1345[var1];
        }
        method124();
        return var0;
    }

    @ObfuscatedName("l.z([BI)Lhi;")
    public static class224 method166(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class224 var1 = new class224(arg0, Statics.field81, Statics.field1382, Statics.field2215, Statics.field751, Statics.field3159, Statics.field1345);
            method124();
            return var1;
        }
    }

    @ObfuscatedName("au.w(Lfh;III)Z")
    public static boolean method640(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3082(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method972(var3);
            return true;
        }
    }

    @ObfuscatedName("be.l(Lfh;II)Z")
    public static boolean method1503(class167 arg0, int arg1) {
        byte[] var2 = arg0.method3030(arg1);
        if (var2 == null) {
            return false;
        } else {
            method972(var2);
            return true;
        }
    }

    @ObfuscatedName("ab.q([BB)V")
    public static void method972(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1984 = arg0.length - 2;
        Statics.field2028 = var1.method2334();
        Statics.field81 = new int[Statics.field2028];
        Statics.field1382 = new int[Statics.field2028];
        Statics.field2215 = new int[Statics.field2028];
        Statics.field751 = new int[Statics.field2028];
        Statics.field1345 = new byte[Statics.field2028][];
        var1.field1984 = arg0.length - 7 - Statics.field2028 * 8;
        Statics.field1381 = var1.method2334();
        Statics.field1384 = var1.method2334();
        int var2 = (var1.method2400() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field2028; var3++) {
            Statics.field81[var3] = var1.method2334();
        }
        for (int var4 = 0; var4 < Statics.field2028; var4++) {
            Statics.field1382[var4] = var1.method2334();
        }
        for (int var5 = 0; var5 < Statics.field2028; var5++) {
            Statics.field2215[var5] = var1.method2334();
        }
        for (int var6 = 0; var6 < Statics.field2028; var6++) {
            Statics.field751[var6] = var1.method2334();
        }
        var1.field1984 = arg0.length - 7 - Statics.field2028 * 8 - (var2 - 1) * 3;
        Statics.field3159 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3159[var7] = var1.method2353();
            if (Statics.field3159[var7] == 0) {
                Statics.field3159[var7] = 1;
            }
        }
        var1.field1984 = 0;
        for (int var8 = 0; var8 < Statics.field2028; var8++) {
            int var9 = Statics.field2215[var8];
            int var10 = Statics.field751[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1345[var8] = var12;
            int var13 = var1.method2400();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2350();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2350();
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.x(B)V")
    public static void method124() {
        Statics.field81 = null;
        Statics.field1382 = null;
        Statics.field2215 = null;
        Statics.field751 = null;
        Statics.field3159 = null;
        Statics.field1345 = (byte[][]) null;
    }
}
