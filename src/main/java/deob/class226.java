package deob;

@ObfuscatedName("hi")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ed.n(Lgj;III)Lhc;")
    public static class223 method2744(class183 arg0, int arg1, int arg2) {
        return method3322(arg0, arg1, arg2) ? method3585() : null;
    }

    @ObfuscatedName("go.d(Lgj;III)Lhf;")
    public static class225 method3650(class183 arg0, int arg1, int arg2) {
        if (!method3322(arg0, arg1, arg2)) {
            return null;
        }
        class225 var3 = new class225();
        var3.field3206 = Statics.field3212;
        var3.field3204 = Statics.field3217;
        var3.field3202 = Statics.field3214[0];
        var3.field3203 = Statics.field3215[0];
        var3.field3200 = Statics.field3216[0];
        var3.field3201 = Statics.field3220[0];
        int var4 = var3.field3201 * var3.field3200;
        byte[] var5 = Statics.field3219[0];
        var3.field3207 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3207[var6] = Statics.field3211[var5[var6] & 0xFF];
        }
        method3263();
        return var3;
    }

    @ObfuscatedName("gx.m(Lgj;Lgj;IIB)Lhe;")
    public static class209 method3230(class183 arg0, class183 arg1, int arg2, int arg3) {
        return method3322(arg0, arg2, arg3) ? method3534(arg1.method3093(arg2, arg3)) : null;
    }

    @ObfuscatedName("gn.h(Lgj;Ljava/lang/String;Ljava/lang/String;B)[Lhc;")
    public static class223[] method3183(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3114(arg1);
        int var4 = arg0.method3109(var3, arg2);
        class223[] var5;
        if (method3322(arg0, var3, var4)) {
            class223[] var6 = new class223[Statics.field3213];
            for (int var7 = 0; var7 < Statics.field3213; var7++) {
                class223 var8 = var6[var7] = new class223();
                var8.field3191 = Statics.field3212;
                var8.field3192 = Statics.field3217;
                var8.field3190 = Statics.field3214[var7];
                var8.field3188 = Statics.field3215[var7];
                var8.field3187 = Statics.field3216[var7];
                var8.field3185 = Statics.field3220[var7];
                var8.field3186 = Statics.field3211;
                var8.field3189 = Statics.field3219[var7];
            }
            method3263();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("gz.w(Lgj;Ljava/lang/String;Ljava/lang/String;I)Lhc;")
    public static class223 method3262(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3114(arg1);
        int var4 = arg0.method3109(var3, arg2);
        return method2744(arg0, var3, var4);
    }

    @ObfuscatedName("ez.r(Lgj;Ljava/lang/String;Ljava/lang/String;I)[Lhf;")
    public static class225[] method2372(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3114(arg1);
        int var4 = arg0.method3109(var3, arg2);
        class225[] var5;
        if (method3322(arg0, var3, var4)) {
            var5 = method1489();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("do.c(Lgj;Ljava/lang/String;Ljava/lang/String;S)Lhf;")
    public static class225 method1976(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3114(arg1);
        int var4 = arg0.method3109(var3, arg2);
        return method3650(arg0, var3, var4);
    }

    @ObfuscatedName("gu.z(Lgj;Lgj;Ljava/lang/String;Ljava/lang/String;B)Lhe;")
    public static class209 method3551(class183 arg0, class183 arg1, String arg2, String arg3) {
        int var4 = arg0.method3114(arg2);
        int var5 = arg0.method3109(var4, arg3);
        return method3230(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("gm.q(B)Lhc;")
    public static class223 method3585() {
        class223 var0 = new class223();
        var0.field3191 = Statics.field3212;
        var0.field3192 = Statics.field3217;
        var0.field3190 = Statics.field3214[0];
        var0.field3188 = Statics.field3215[0];
        var0.field3187 = Statics.field3216[0];
        var0.field3185 = Statics.field3220[0];
        var0.field3186 = Statics.field3211;
        var0.field3189 = Statics.field3219[0];
        method3263();
        return var0;
    }

    @ObfuscatedName("cw.l(I)[Lhf;")
    public static class225[] method1489() {
        class225[] var0 = new class225[Statics.field3213];
        for (int var1 = 0; var1 < Statics.field3213; var1++) {
            class225 var2 = var0[var1] = new class225();
            var2.field3206 = Statics.field3212;
            var2.field3204 = Statics.field3217;
            var2.field3202 = Statics.field3214[var1];
            var2.field3203 = Statics.field3215[var1];
            var2.field3200 = Statics.field3216[var1];
            var2.field3201 = Statics.field3220[var1];
            int var3 = var2.field3201 * var2.field3200;
            byte[] var4 = Statics.field3219[var1];
            var2.field3207 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3207[var5] = Statics.field3211[var4[var5] & 0xFF];
            }
        }
        method3263();
        return var0;
    }

    @ObfuscatedName("gg.y([BB)Lhe;")
    public static class209 method3534(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class209 var1 = new class209(arg0, Statics.field3214, Statics.field3215, Statics.field3216, Statics.field3220, Statics.field3211, Statics.field3219);
            method3263();
            return var1;
        }
    }

    @ObfuscatedName("gc.e(Lgj;III)Z")
    public static boolean method3322(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3093(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2079(var3);
            return true;
        }
    }

    @ObfuscatedName("bc.x(Lgj;II)Z")
    public static boolean method1399(class183 arg0, int arg1) {
        byte[] var2 = arg0.method3098(arg1);
        if (var2 == null) {
            return false;
        } else {
            method2079(var2);
            return true;
        }
    }

    @ObfuscatedName("db.f([BB)V")
    public static void method2079(byte[] arg0) {
        class161 var1 = new class161(arg0);
        var1.field2285 = arg0.length - 2;
        Statics.field3213 = var1.method2887();
        Statics.field3214 = new int[Statics.field3213];
        Statics.field3215 = new int[Statics.field3213];
        Statics.field3216 = new int[Statics.field3213];
        Statics.field3220 = new int[Statics.field3213];
        Statics.field3219 = new byte[Statics.field3213][];
        var1.field2285 = arg0.length - 7 - Statics.field3213 * 8;
        Statics.field3212 = var1.method2887();
        Statics.field3217 = var1.method2887();
        int var2 = (var1.method2823() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3213; var3++) {
            Statics.field3214[var3] = var1.method2887();
        }
        for (int var4 = 0; var4 < Statics.field3213; var4++) {
            Statics.field3215[var4] = var1.method2887();
        }
        for (int var5 = 0; var5 < Statics.field3213; var5++) {
            Statics.field3216[var5] = var1.method2887();
        }
        for (int var6 = 0; var6 < Statics.field3213; var6++) {
            Statics.field3220[var6] = var1.method2887();
        }
        var1.field2285 = arg0.length - 7 - Statics.field3213 * 8 - (var2 - 1) * 3;
        Statics.field3211 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3211[var7] = var1.method2784();
            if (Statics.field3211[var7] == 0) {
                Statics.field3211[var7] = 1;
            }
        }
        var1.field2285 = 0;
        for (int var8 = 0; var8 < Statics.field3213; var8++) {
            int var9 = Statics.field3216[var8];
            int var10 = Statics.field3220[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3219[var8] = var12;
            int var13 = var1.method2823();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2837();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2837();
                    }
                }
            }
        }
    }

    @ObfuscatedName("gz.s(I)V")
    public static void method3263() {
        Statics.field3214 = null;
        Statics.field3215 = null;
        Statics.field3216 = null;
        Statics.field3220 = null;
        Statics.field3211 = null;
        Statics.field3219 = (byte[][]) null;
    }
}
