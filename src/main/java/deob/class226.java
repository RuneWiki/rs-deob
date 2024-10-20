package deob;

@ObfuscatedName("hu")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gf.p(Lgp;III)[Lhl;")
    public static class223[] method3498(class183 arg0, int arg1, int arg2) {
        return method3328(arg0, arg1, arg2) ? method3263() : null;
    }

    @ObfuscatedName("gi.g(Lgp;III)Lhs;")
    public static class225 method3170(class183 arg0, int arg1, int arg2) {
        return method3328(arg0, arg1, arg2) ? method201() : null;
    }

    @ObfuscatedName("u.x(Lgp;Lgp;IIB)Lha;")
    public static class209 method183(class183 arg0, class183 arg1, int arg2, int arg3) {
        if (!method3328(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3044(arg2, arg3);
        class209 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class209 var6 = new class209(var4, Statics.field3217, Statics.field3216, Statics.field232, Statics.field3219, Statics.field2720, Statics.field950);
            Statics.field3217 = null;
            Statics.field3216 = null;
            Statics.field232 = null;
            Statics.field3219 = null;
            Statics.field2720 = null;
            Statics.field950 = (byte[][]) null;
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("o.q(Lgp;Ljava/lang/String;Ljava/lang/String;I)[Lhl;")
    public static class223[] method117(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3035(arg1);
        int var4 = arg0.method3046(var3, arg2);
        return method3498(arg0, var3, var4);
    }

    @ObfuscatedName("fb.d(Lgp;Ljava/lang/String;Ljava/lang/String;B)Lhl;")
    public static class223 method2885(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3035(arg1);
        int var4 = arg0.method3046(var3, arg2);
        class223 var5;
        if (method3328(arg0, var3, var4)) {
            var5 = method3171();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ab.k(Lgp;Ljava/lang/String;Ljava/lang/String;I)[Lhs;")
    public static class225[] method758(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3035(arg1);
        int var4 = arg0.method3046(var3, arg2);
        class225[] var5;
        if (method3328(arg0, var3, var4)) {
            class225[] var6 = new class225[Statics.field3218];
            for (int var7 = 0; var7 < Statics.field3218; var7++) {
                class225 var8 = var6[var7] = new class225();
                var8.field3208 = Statics.field3215;
                var8.field3214 = Statics.field762;
                var8.field3206 = Statics.field3217[var7];
                var8.field3207 = Statics.field3216[var7];
                var8.field3213 = Statics.field232[var7];
                var8.field3205 = Statics.field3219[var7];
                int var9 = var8.field3213 * var8.field3205;
                byte[] var10 = Statics.field950[var7];
                var8.field3209 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field3209[var11] = Statics.field2720[var10[var11] & 0xFF];
                }
            }
            Statics.field3217 = null;
            Statics.field3216 = null;
            Statics.field232 = null;
            Statics.field3219 = null;
            Statics.field2720 = null;
            Statics.field950 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("af.j(Lgp;Ljava/lang/String;Ljava/lang/String;B)Lhs;")
    public static class225 method712(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3035(arg1);
        int var4 = arg0.method3046(var3, arg2);
        return method3170(arg0, var3, var4);
    }

    @ObfuscatedName("gl.s(I)[Lhl;")
    public static class223[] method3263() {
        class223[] var0 = new class223[Statics.field3218];
        for (int var1 = 0; var1 < Statics.field3218; var1++) {
            class223 var2 = var0[var1] = new class223();
            var2.field3198 = Statics.field3215;
            var2.field3196 = Statics.field762;
            var2.field3192 = Statics.field3217[var1];
            var2.field3197 = Statics.field3216[var1];
            var2.field3199 = Statics.field232[var1];
            var2.field3195 = Statics.field3219[var1];
            var2.field3193 = Statics.field2720;
            var2.field3194 = Statics.field950[var1];
        }
        Statics.field3217 = null;
        Statics.field3216 = null;
        Statics.field232 = null;
        Statics.field3219 = null;
        Statics.field2720 = null;
        Statics.field950 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("gi.o(B)Lhl;")
    public static class223 method3171() {
        class223 var0 = new class223();
        var0.field3198 = Statics.field3215;
        var0.field3196 = Statics.field762;
        var0.field3192 = Statics.field3217[0];
        var0.field3197 = Statics.field3216[0];
        var0.field3199 = Statics.field232[0];
        var0.field3195 = Statics.field3219[0];
        var0.field3193 = Statics.field2720;
        var0.field3194 = Statics.field950[0];
        Statics.field3217 = null;
        Statics.field3216 = null;
        Statics.field232 = null;
        Statics.field3219 = null;
        Statics.field2720 = null;
        Statics.field950 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("f.a(I)Lhs;")
    public static class225 method201() {
        class225 var0 = new class225();
        var0.field3208 = Statics.field3215;
        var0.field3214 = Statics.field762;
        var0.field3206 = Statics.field3217[0];
        var0.field3207 = Statics.field3216[0];
        var0.field3213 = Statics.field232[0];
        var0.field3205 = Statics.field3219[0];
        int var1 = var0.field3213 * var0.field3205;
        byte[] var2 = Statics.field950[0];
        var0.field3209 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3209[var3] = Statics.field2720[var2[var3] & 0xFF];
        }
        Statics.field3217 = null;
        Statics.field3216 = null;
        Statics.field232 = null;
        Statics.field3219 = null;
        Statics.field2720 = null;
        Statics.field950 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("gy.c(Lgp;III)Z")
    public static boolean method3328(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3044(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1357(var3);
            return true;
        }
    }

    @ObfuscatedName("by.u([BB)V")
    public static void method1357(byte[] arg0) {
        class154 var1 = new class154(arg0);
        var1.field2098 = arg0.length - 2;
        Statics.field3218 = var1.method2595();
        Statics.field3217 = new int[Statics.field3218];
        Statics.field3216 = new int[Statics.field3218];
        Statics.field232 = new int[Statics.field3218];
        Statics.field3219 = new int[Statics.field3218];
        Statics.field950 = new byte[Statics.field3218][];
        var1.field2098 = arg0.length - 7 - Statics.field3218 * 8;
        Statics.field3215 = var1.method2595();
        Statics.field762 = var1.method2595();
        int var2 = (var1.method2593() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3218; var3++) {
            Statics.field3217[var3] = var1.method2595();
        }
        for (int var4 = 0; var4 < Statics.field3218; var4++) {
            Statics.field3216[var4] = var1.method2595();
        }
        for (int var5 = 0; var5 < Statics.field3218; var5++) {
            Statics.field232[var5] = var1.method2595();
        }
        for (int var6 = 0; var6 < Statics.field3218; var6++) {
            Statics.field3219[var6] = var1.method2595();
        }
        var1.field2098 = arg0.length - 7 - Statics.field3218 * 8 - (var2 - 1) * 3;
        Statics.field2720 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2720[var7] = var1.method2748();
            if (Statics.field2720[var7] == 0) {
                Statics.field2720[var7] = 1;
            }
        }
        var1.field2098 = 0;
        for (int var8 = 0; var8 < Statics.field3218; var8++) {
            int var9 = Statics.field232[var8];
            int var10 = Statics.field3219[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field950[var8] = var12;
            int var13 = var1.method2593();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2631();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2631();
                    }
                }
            }
        }
    }
}
