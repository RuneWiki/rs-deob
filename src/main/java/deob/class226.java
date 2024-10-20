package deob;

@ObfuscatedName("hu")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("au.f(Lgb;III)[Lhy;")
    public static class223[] method753(class183 arg0, int arg1, int arg2) {
        if (!method1580(arg0, arg1, arg2)) {
            return null;
        }
        class223[] var3 = new class223[Statics.field3234];
        for (int var4 = 0; var4 < Statics.field3234; var4++) {
            class223 var5 = var3[var4] = new class223();
            var5.field3213 = Statics.field3232;
            var5.field3215 = Statics.field2039;
            var5.field3212 = Statics.field3231[var4];
            var5.field3210 = Statics.field3004[var4];
            var5.field3214 = Statics.field3233[var4];
            var5.field3211 = Statics.field995[var4];
            var5.field3209 = Statics.field3235;
            var5.field3208 = Statics.field3200[var4];
        }
        method173();
        return var3;
    }

    @ObfuscatedName("cd.i(Lgb;III)[Lhe;")
    public static class225[] method1908(class183 arg0, int arg1, int arg2) {
        return method1580(arg0, arg1, arg2) ? method754() : null;
    }

    @ObfuscatedName("q.r(Lgb;Lgb;IIB)Lhg;")
    public static class209 method158(class183 arg0, class183 arg1, int arg2, int arg3) {
        return method1580(arg0, arg2, arg3) ? method722(arg1.method3163(arg2, arg3)) : null;
    }

    @ObfuscatedName("gu.o(Lgb;Ljava/lang/String;Ljava/lang/String;I)[Lhy;")
    public static class223[] method3495(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3132(arg1);
        int var4 = arg0.method3133(var3, arg2);
        return method753(arg0, var3, var4);
    }

    @ObfuscatedName("r.l(Lgb;Ljava/lang/String;Ljava/lang/String;I)Lhy;")
    public static class223 method31(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3132(arg1);
        int var4 = arg0.method3133(var3, arg2);
        class223 var5;
        if (method1580(arg0, var3, var4)) {
            class223 var6 = new class223();
            var6.field3213 = Statics.field3232;
            var6.field3215 = Statics.field2039;
            var6.field3212 = Statics.field3231[0];
            var6.field3210 = Statics.field3004[0];
            var6.field3214 = Statics.field3233[0];
            var6.field3211 = Statics.field995[0];
            var6.field3209 = Statics.field3235;
            var6.field3208 = Statics.field3200[0];
            method173();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("cy.n(Lgb;Ljava/lang/String;Ljava/lang/String;I)[Lhe;")
    public static class225[] method1862(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3132(arg1);
        int var4 = arg0.method3133(var3, arg2);
        return method1908(arg0, var3, var4);
    }

    @ObfuscatedName("gg.m(Lgb;Lgb;Ljava/lang/String;Ljava/lang/String;S)Lhg;")
    public static class209 method3249(class183 arg0, class183 arg1, String arg2, String arg3) {
        int var4 = arg0.method3132(arg2);
        int var5 = arg0.method3133(var4, arg3);
        return method158(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("bs.w(Lgb;II)Lhy;")
    public static class223 method1385(class183 arg0, int arg1) {
        if (!method28(arg0, arg1)) {
            return null;
        }
        class223 var2 = new class223();
        var2.field3213 = Statics.field3232;
        var2.field3215 = Statics.field2039;
        var2.field3212 = Statics.field3231[0];
        var2.field3210 = Statics.field3004[0];
        var2.field3214 = Statics.field3233[0];
        var2.field3211 = Statics.field995[0];
        var2.field3209 = Statics.field3235;
        var2.field3208 = Statics.field3200[0];
        method173();
        return var2;
    }

    @ObfuscatedName("au.j(I)[Lhe;")
    public static class225[] method754() {
        class225[] var0 = new class225[Statics.field3234];
        for (int var1 = 0; var1 < Statics.field3234; var1++) {
            class225 var2 = var0[var1] = new class225();
            var2.field3224 = Statics.field3232;
            var2.field3221 = Statics.field2039;
            var2.field3225 = Statics.field3231[var1];
            var2.field3223 = Statics.field3004[var1];
            var2.field3220 = Statics.field3233[var1];
            var2.field3222 = Statics.field995[var1];
            int var3 = var2.field3222 * var2.field3220;
            byte[] var4 = Statics.field3200[var1];
            var2.field3229 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3229[var5] = Statics.field3235[var4[var5] & 0xFF];
            }
        }
        method173();
        return var0;
    }

    @ObfuscatedName("ar.s([BB)Lhg;")
    public static class209 method722(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class209 var1 = new class209(arg0, Statics.field3231, Statics.field3004, Statics.field3233, Statics.field995, Statics.field3235, Statics.field3200);
            method173();
            return var1;
        }
    }

    @ObfuscatedName("cg.q(Lgb;III)Z")
    public static boolean method1580(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3163(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3227(var3);
            return true;
        }
    }

    @ObfuscatedName("h.d(Lgb;II)Z")
    public static boolean method28(class183 arg0, int arg1) {
        byte[] var2 = arg0.method3170(arg1);
        if (var2 == null) {
            return false;
        } else {
            method3227(var2);
            return true;
        }
    }

    @ObfuscatedName("gp.p([BI)V")
    public static void method3227(byte[] arg0) {
        class154 var1 = new class154(arg0);
        var1.field2111 = arg0.length - 2;
        Statics.field3234 = var1.method2668();
        Statics.field3231 = new int[Statics.field3234];
        Statics.field3004 = new int[Statics.field3234];
        Statics.field3233 = new int[Statics.field3234];
        Statics.field995 = new int[Statics.field3234];
        Statics.field3200 = new byte[Statics.field3234][];
        var1.field2111 = arg0.length - 7 - Statics.field3234 * 8;
        Statics.field3232 = var1.method2668();
        Statics.field2039 = var1.method2668();
        int var2 = (var1.method2666() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3234; var3++) {
            Statics.field3231[var3] = var1.method2668();
        }
        for (int var4 = 0; var4 < Statics.field3234; var4++) {
            Statics.field3004[var4] = var1.method2668();
        }
        for (int var5 = 0; var5 < Statics.field3234; var5++) {
            Statics.field3233[var5] = var1.method2668();
        }
        for (int var6 = 0; var6 < Statics.field3234; var6++) {
            Statics.field995[var6] = var1.method2668();
        }
        var1.field2111 = arg0.length - 7 - Statics.field3234 * 8 - (var2 - 1) * 3;
        Statics.field3235 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3235[var7] = var1.method2670();
            if (Statics.field3235[var7] == 0) {
                Statics.field3235[var7] = 1;
            }
        }
        var1.field2111 = 0;
        for (int var8 = 0; var8 < Statics.field3234; var8++) {
            int var9 = Statics.field3233[var8];
            int var10 = Statics.field995[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3200[var8] = var12;
            int var13 = var1.method2666();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2667();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2667();
                    }
                }
            }
        }
    }

    @ObfuscatedName("v.y(I)V")
    public static void method173() {
        Statics.field3231 = null;
        Statics.field3004 = null;
        Statics.field3233 = null;
        Statics.field995 = null;
        Statics.field3235 = null;
        Statics.field3200 = (byte[][]) null;
    }
}
