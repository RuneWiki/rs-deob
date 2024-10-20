package deob;

@ObfuscatedName("ht")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gs.i(Lgq;III)[Lhr;")
    public static class223[] method3106(class183 arg0, int arg1, int arg2) {
        if (!method3001(arg0, arg1, arg2)) {
            return null;
        }
        class223[] var3 = new class223[Statics.field3215];
        for (int var4 = 0; var4 < Statics.field3215; var4++) {
            class223 var5 = var3[var4] = new class223();
            var5.field3192 = Statics.field3216;
            var5.field3195 = Statics.field3217;
            var5.field3196 = Statics.field3218[var4];
            var5.field3197 = Statics.field1749[var4];
            var5.field3194 = Statics.field3219[var4];
            var5.field3198 = Statics.field898[var4];
            var5.field3193 = Statics.field2192;
            var5.field3199 = Statics.field2107[var4];
        }
        method3155();
        return var3;
    }

    @ObfuscatedName("z.e(Lgq;III)Lhj;")
    public static class225 method219(class183 arg0, int arg1, int arg2) {
        return method3001(arg0, arg1, arg2) ? method1814() : null;
    }

    @ObfuscatedName("r.f(Lgq;Ljava/lang/String;Ljava/lang/String;I)[Lhr;")
    public static class223[] method176(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3028(arg1);
        int var4 = arg0.method3029(var3, arg2);
        return method3106(arg0, var3, var4);
    }

    @ObfuscatedName("dh.k(Lgq;Ljava/lang/String;Ljava/lang/String;I)Lhr;")
    public static class223 method1928(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3028(arg1);
        int var4 = arg0.method3029(var3, arg2);
        class223 var5;
        if (method3001(arg0, var3, var4)) {
            var5 = method2772();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bx.a(Lgq;Ljava/lang/String;Ljava/lang/String;B)[Lhj;")
    public static class225[] method1007(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3028(arg1);
        int var4 = arg0.method3029(var3, arg2);
        class225[] var5;
        if (method3001(arg0, var3, var4)) {
            class225[] var6 = new class225[Statics.field3215];
            for (int var7 = 0; var7 < Statics.field3215; var7++) {
                class225 var8 = var6[var7] = new class225();
                var8.field3211 = Statics.field3216;
                var8.field3209 = Statics.field3217;
                var8.field3208 = Statics.field3218[var7];
                var8.field3207 = Statics.field1749[var7];
                var8.field3204 = Statics.field3219[var7];
                var8.field3205 = Statics.field898[var7];
                int var9 = var8.field3205 * var8.field3204;
                byte[] var10 = Statics.field2107[var7];
                var8.field3210 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field3210[var11] = Statics.field2192[var10[var11] & 0xFF];
                }
            }
            method3155();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fa.q(Lgq;Ljava/lang/String;Ljava/lang/String;I)Lhj;")
    public static class225 method2779(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3028(arg1);
        int var4 = arg0.method3029(var3, arg2);
        return method219(arg0, var3, var4);
    }

    @ObfuscatedName("z.w(Lgq;Lgq;Ljava/lang/String;Ljava/lang/String;I)Lhw;")
    public static class209 method237(class183 arg0, class183 arg1, String arg2, String arg3) {
        int var4 = arg0.method3028(arg2);
        int var5 = arg0.method3029(var4, arg3);
        class209 var6;
        if (method3001(arg0, var4, var5)) {
            byte[] var7 = arg1.method3014(var4, var5);
            class209 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class209 var9 = new class209(var7, Statics.field3218, Statics.field1749, Statics.field3219, Statics.field898, Statics.field2192, Statics.field2107);
                method3155();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("v.v(Lgq;II)Lhr;")
    public static class223 method103(class183 arg0, int arg1) {
        return method2881(arg0, arg1) ? method2772() : null;
    }

    @ObfuscatedName("ft.h(B)Lhr;")
    public static class223 method2772() {
        class223 var0 = new class223();
        var0.field3192 = Statics.field3216;
        var0.field3195 = Statics.field3217;
        var0.field3196 = Statics.field3218[0];
        var0.field3197 = Statics.field1749[0];
        var0.field3194 = Statics.field3219[0];
        var0.field3198 = Statics.field898[0];
        var0.field3193 = Statics.field2192;
        var0.field3199 = Statics.field2107[0];
        method3155();
        return var0;
    }

    @ObfuscatedName("ce.p(I)Lhj;")
    public static class225 method1814() {
        class225 var0 = new class225();
        var0.field3211 = Statics.field3216;
        var0.field3209 = Statics.field3217;
        var0.field3208 = Statics.field3218[0];
        var0.field3207 = Statics.field1749[0];
        var0.field3204 = Statics.field3219[0];
        var0.field3205 = Statics.field898[0];
        int var1 = var0.field3205 * var0.field3204;
        byte[] var2 = Statics.field2107[0];
        var0.field3210 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3210[var3] = Statics.field2192[var2[var3] & 0xFF];
        }
        method3155();
        return var0;
    }

    @ObfuscatedName("fs.l(Lgq;III)Z")
    public static boolean method3001(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3014(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3529(var3);
            return true;
        }
    }

    @ObfuscatedName("fe.c(Lgq;IB)Z")
    public static boolean method2881(class183 arg0, int arg1) {
        byte[] var2 = arg0.method3019(arg1);
        if (var2 == null) {
            return false;
        } else {
            method3529(var2);
            return true;
        }
    }

    @ObfuscatedName("gg.m([BI)V")
    public static void method3529(byte[] arg0) {
        class154 var1 = new class154(arg0);
        var1.field2091 = arg0.length - 2;
        Statics.field3215 = var1.method2575();
        Statics.field3218 = new int[Statics.field3215];
        Statics.field1749 = new int[Statics.field3215];
        Statics.field3219 = new int[Statics.field3215];
        Statics.field898 = new int[Statics.field3215];
        Statics.field2107 = new byte[Statics.field3215][];
        var1.field2091 = arg0.length - 7 - Statics.field3215 * 8;
        Statics.field3216 = var1.method2575();
        Statics.field3217 = var1.method2575();
        int var2 = (var1.method2573() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3215; var3++) {
            Statics.field3218[var3] = var1.method2575();
        }
        for (int var4 = 0; var4 < Statics.field3215; var4++) {
            Statics.field1749[var4] = var1.method2575();
        }
        for (int var5 = 0; var5 < Statics.field3215; var5++) {
            Statics.field3219[var5] = var1.method2575();
        }
        for (int var6 = 0; var6 < Statics.field3215; var6++) {
            Statics.field898[var6] = var1.method2575();
        }
        var1.field2091 = arg0.length - 7 - Statics.field3215 * 8 - (var2 - 1) * 3;
        Statics.field2192 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2192[var7] = var1.method2706();
            if (Statics.field2192[var7] == 0) {
                Statics.field2192[var7] = 1;
            }
        }
        var1.field2091 = 0;
        for (int var8 = 0; var8 < Statics.field3215; var8++) {
            int var9 = Statics.field3219[var8];
            int var10 = Statics.field898[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2107[var8] = var12;
            int var13 = var1.method2573();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2574();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2574();
                    }
                }
            }
        }
    }

    @ObfuscatedName("gv.r(I)V")
    public static void method3155() {
        Statics.field3218 = null;
        Statics.field1749 = null;
        Statics.field3219 = null;
        Statics.field898 = null;
        Statics.field2192 = null;
        Statics.field2107 = (byte[][]) null;
    }
}
