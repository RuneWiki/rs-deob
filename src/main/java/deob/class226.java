package deob;

@ObfuscatedName("hj")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.s(Lgp;IIB)[Lhl;")
    public static class223[] method149(class183 arg0, int arg1, int arg2) {
        if (!method707(arg0, arg1, arg2)) {
            return null;
        }
        class223[] var3 = new class223[Statics.field3222];
        for (int var4 = 0; var4 < Statics.field3222; var4++) {
            class223 var5 = var3[var4] = new class223();
            var5.field3196 = Statics.field3219;
            var5.field3203 = Statics.field3220;
            var5.field3200 = Statics.field2711[var4];
            var5.field3201 = Statics.field3221[var4];
            var5.field3198 = Statics.field1866[var4];
            var5.field3199 = Statics.field1743[var4];
            var5.field3197 = Statics.field3218;
            var5.field3202 = Statics.field889[var4];
        }
        method646();
        return var3;
    }

    @ObfuscatedName("cr.c(Lgp;IIB)[Lhk;")
    public static class225[] method1781(class183 arg0, int arg1, int arg2) {
        return method707(arg0, arg1, arg2) ? method2846() : null;
    }

    @ObfuscatedName("ar.f(Lgp;III)Lhk;")
    public static class225 method706(class183 arg0, int arg1, int arg2) {
        return method707(arg0, arg1, arg2) ? method3170() : null;
    }

    @ObfuscatedName("fa.g(Lgp;Lgp;IIB)Lhi;")
    public static class209 method2978(class183 arg0, class183 arg1, int arg2, int arg3) {
        return method707(arg0, arg2, arg3) ? method589(arg1.method2986(arg2, arg3)) : null;
    }

    @ObfuscatedName("cm.k(Lgp;Ljava/lang/String;Ljava/lang/String;I)[Lhl;")
    public static class223[] method1749(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3001(arg1);
        int var4 = arg0.method3002(var3, arg2);
        return method149(arg0, var3, var4);
    }

    @ObfuscatedName("cv.u(Lgp;Ljava/lang/String;Ljava/lang/String;B)Lhl;")
    public static class223 method1746(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3001(arg1);
        int var4 = arg0.method3002(var3, arg2);
        class223 var5;
        if (method707(arg0, var3, var4)) {
            class223 var6 = new class223();
            var6.field3196 = Statics.field3219;
            var6.field3203 = Statics.field3220;
            var6.field3200 = Statics.field2711[0];
            var6.field3201 = Statics.field3221[0];
            var6.field3198 = Statics.field1866[0];
            var6.field3199 = Statics.field1743[0];
            var6.field3197 = Statics.field3218;
            var6.field3202 = Statics.field889[0];
            method646();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("hp.b(Lgp;Ljava/lang/String;Ljava/lang/String;I)[Lhk;")
    public static class225[] method3620(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3001(arg1);
        int var4 = arg0.method3002(var3, arg2);
        return method1781(arg0, var3, var4);
    }

    @ObfuscatedName("hw.x(Lgp;Ljava/lang/String;Ljava/lang/String;I)Lhk;")
    public static class225 method3615(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3001(arg1);
        int var4 = arg0.method3002(var3, arg2);
        return method706(arg0, var3, var4);
    }

    @ObfuscatedName("c.r(Lgp;Lgp;Ljava/lang/String;Ljava/lang/String;I)Lhi;")
    public static class209 method8(class183 arg0, class183 arg1, String arg2, String arg3) {
        int var4 = arg0.method3001(arg2);
        int var5 = arg0.method3002(var4, arg3);
        return method2978(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("fn.n(B)[Lhk;")
    public static class225[] method2846() {
        class225[] var0 = new class225[Statics.field3222];
        for (int var1 = 0; var1 < Statics.field3222; var1++) {
            class225 var2 = var0[var1] = new class225();
            var2.field3206 = Statics.field3219;
            var2.field3212 = Statics.field3220;
            var2.field3209 = Statics.field2711[var1];
            var2.field3217 = Statics.field3221[var1];
            var2.field3210 = Statics.field1866[var1];
            var2.field3208 = Statics.field1743[var1];
            int var3 = var2.field3210 * var2.field3208;
            byte[] var4 = Statics.field889[var1];
            var2.field3207 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3207[var5] = Statics.field3218[var4[var5] & 0xFF];
            }
        }
        method646();
        return var0;
    }

    @ObfuscatedName("gm.m(B)Lhk;")
    public static class225 method3170() {
        class225 var0 = new class225();
        var0.field3206 = Statics.field3219;
        var0.field3212 = Statics.field3220;
        var0.field3209 = Statics.field2711[0];
        var0.field3217 = Statics.field3221[0];
        var0.field3210 = Statics.field1866[0];
        var0.field3208 = Statics.field1743[0];
        int var1 = var0.field3210 * var0.field3208;
        byte[] var2 = Statics.field889[0];
        var0.field3207 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3207[var3] = Statics.field3218[var2[var3] & 0xFF];
        }
        method646();
        return var0;
    }

    @ObfuscatedName("ai.j([BB)Lhi;")
    public static class209 method589(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class209 var1 = new class209(arg0, Statics.field2711, Statics.field3221, Statics.field1866, Statics.field1743, Statics.field3218, Statics.field889);
            method646();
            return var1;
        }
    }

    @ObfuscatedName("ar.w(Lgp;III)Z")
    public static boolean method707(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2986(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method99(var3);
            return true;
        }
    }

    @ObfuscatedName("ex.p(Lgp;II)Z")
    public static boolean method2745(class183 arg0, int arg1) {
        byte[] var2 = arg0.method2991(arg1);
        if (var2 == null) {
            return false;
        } else {
            method99(var2);
            return true;
        }
    }

    @ObfuscatedName("x.o([BB)V")
    public static void method99(byte[] arg0) {
        class154 var1 = new class154(arg0);
        var1.field2098 = arg0.length - 2;
        Statics.field3222 = var1.method2541();
        Statics.field2711 = new int[Statics.field3222];
        Statics.field3221 = new int[Statics.field3222];
        Statics.field1866 = new int[Statics.field3222];
        Statics.field1743 = new int[Statics.field3222];
        Statics.field889 = new byte[Statics.field3222][];
        var1.field2098 = arg0.length - 7 - Statics.field3222 * 8;
        Statics.field3219 = var1.method2541();
        Statics.field3220 = var1.method2541();
        int var2 = (var1.method2545() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3222; var3++) {
            Statics.field2711[var3] = var1.method2541();
        }
        for (int var4 = 0; var4 < Statics.field3222; var4++) {
            Statics.field3221[var4] = var1.method2541();
        }
        for (int var5 = 0; var5 < Statics.field3222; var5++) {
            Statics.field1866[var5] = var1.method2541();
        }
        for (int var6 = 0; var6 < Statics.field3222; var6++) {
            Statics.field1743[var6] = var1.method2541();
        }
        var1.field2098 = arg0.length - 7 - Statics.field3222 * 8 - (var2 - 1) * 3;
        Statics.field3218 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3218[var7] = var1.method2549();
            if (Statics.field3218[var7] == 0) {
                Statics.field3218[var7] = 1;
            }
        }
        var1.field2098 = 0;
        for (int var8 = 0; var8 < Statics.field3222; var8++) {
            int var9 = Statics.field1866[var8];
            int var10 = Statics.field1743[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field889[var8] = var12;
            int var13 = var1.method2545();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2657();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2657();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.i(B)V")
    public static void method646() {
        Statics.field2711 = null;
        Statics.field3221 = null;
        Statics.field1866 = null;
        Statics.field1743 = null;
        Statics.field3218 = null;
        Statics.field889 = (byte[][]) null;
    }
}
