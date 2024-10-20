package deob;

@ObfuscatedName("ho")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ci.q(Lgj;III)[Lhg;")
    public static class223[] method1893(class183 arg0, int arg1, int arg2) {
        if (!method1895(arg0, arg1, arg2)) {
            return null;
        }
        class223[] var3 = new class223[Statics.field3233];
        for (int var4 = 0; var4 < Statics.field3233; var4++) {
            class223 var5 = var3[var4] = new class223();
            var5.field3215 = Statics.field3075;
            var5.field3216 = Statics.field3232;
            var5.field3213 = Statics.field224[var4];
            var5.field3214 = Statics.field3234[var4];
            var5.field3211 = Statics.field3235[var4];
            var5.field3209 = Statics.field863[var4];
            var5.field3210 = Statics.field2147;
            var5.field3212 = Statics.field130[var4];
        }
        method633();
        return var3;
    }

    @ObfuscatedName("gj.d(Lgj;III)Lhy;")
    public static class225 method3118(class183 arg0, int arg1, int arg2) {
        return method1895(arg0, arg1, arg2) ? method1420() : null;
    }

    @ObfuscatedName("gj.h(Lgj;Lgj;IIS)Lhk;")
    public static class209 method3193(class183 arg0, class183 arg1, int arg2, int arg3) {
        return method1895(arg0, arg2, arg3) ? method3415(arg1.method3133(arg2, arg3)) : null;
    }

    @ObfuscatedName("cu.p(Lgj;Ljava/lang/String;Ljava/lang/String;I)[Lhg;")
    public static class223[] method1887(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3148(arg1);
        int var4 = arg0.method3132(var3, arg2);
        return method1893(arg0, var3, var4);
    }

    @ObfuscatedName("br.j(Lgj;Ljava/lang/String;Ljava/lang/String;B)Lhg;")
    public static class223 method1366(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3148(arg1);
        int var4 = arg0.method3132(var3, arg2);
        class223 var5;
        if (method1895(arg0, var3, var4)) {
            var5 = method2991();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ad.n(Lgj;Ljava/lang/String;Ljava/lang/String;B)[Lhy;")
    public static class225[] method708(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3148(arg1);
        int var4 = arg0.method3132(var3, arg2);
        class225[] var5;
        if (method1895(arg0, var3, var4)) {
            class225[] var6 = new class225[Statics.field3233];
            for (int var7 = 0; var7 < Statics.field3233; var7++) {
                class225 var8 = var6[var7] = new class225();
                var8.field3230 = Statics.field3075;
                var8.field3226 = Statics.field3232;
                var8.field3223 = Statics.field224[var7];
                var8.field3224 = Statics.field3234[var7];
                var8.field3225 = Statics.field3235[var7];
                var8.field3222 = Statics.field863[var7];
                int var9 = var8.field3225 * var8.field3222;
                byte[] var10 = Statics.field130[var7];
                var8.field3227 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field3227[var11] = Statics.field2147[var10[var11] & 0xFF];
                }
            }
            method633();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("cq.c(Lgj;Lgj;Ljava/lang/String;Ljava/lang/String;B)Lhk;")
    public static class209 method1531(class183 arg0, class183 arg1, String arg2, String arg3) {
        int var4 = arg0.method3148(arg2);
        int var5 = arg0.method3132(var4, arg3);
        return method3193(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("eo.o(Lgj;II)Lhg;")
    public static class223 method2587(class183 arg0, int arg1) {
        byte[] var2 = arg0.method3121(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method3785(var2);
            var3 = true;
        }
        return var3 ? method2991() : null;
    }

    @ObfuscatedName("fp.s(I)Lhg;")
    public static class223 method2991() {
        class223 var0 = new class223();
        var0.field3215 = Statics.field3075;
        var0.field3216 = Statics.field3232;
        var0.field3213 = Statics.field224[0];
        var0.field3214 = Statics.field3234[0];
        var0.field3211 = Statics.field3235[0];
        var0.field3209 = Statics.field863[0];
        var0.field3210 = Statics.field2147;
        var0.field3212 = Statics.field130[0];
        method633();
        return var0;
    }

    @ObfuscatedName("bf.u(I)Lhy;")
    public static class225 method1420() {
        class225 var0 = new class225();
        var0.field3230 = Statics.field3075;
        var0.field3226 = Statics.field3232;
        var0.field3223 = Statics.field224[0];
        var0.field3224 = Statics.field3234[0];
        var0.field3225 = Statics.field3235[0];
        var0.field3222 = Statics.field863[0];
        int var1 = var0.field3225 * var0.field3222;
        byte[] var2 = Statics.field130[0];
        var0.field3227 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3227[var3] = Statics.field2147[var2[var3] & 0xFF];
        }
        Statics.field224 = null;
        Statics.field3234 = null;
        Statics.field3235 = null;
        Statics.field863 = null;
        Statics.field2147 = null;
        Statics.field130 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("gw.b([BB)Lhk;")
    public static class209 method3415(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class209 var1 = new class209(arg0, Statics.field224, Statics.field3234, Statics.field3235, Statics.field863, Statics.field2147, Statics.field130);
        Statics.field224 = null;
        Statics.field3234 = null;
        Statics.field3235 = null;
        Statics.field863 = null;
        Statics.field2147 = null;
        Statics.field130 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("ci.v(Lgj;III)Z")
    public static boolean method1895(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3133(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3785(var3);
            return true;
        }
    }

    @ObfuscatedName("hd.f([BI)V")
    public static void method3785(byte[] arg0) {
        class154 var1 = new class154(arg0);
        var1.field2091 = arg0.length - 2;
        Statics.field3233 = var1.method2668();
        Statics.field224 = new int[Statics.field3233];
        Statics.field3234 = new int[Statics.field3233];
        Statics.field3235 = new int[Statics.field3233];
        Statics.field863 = new int[Statics.field3233];
        Statics.field130 = new byte[Statics.field3233][];
        var1.field2091 = arg0.length - 7 - Statics.field3233 * 8;
        Statics.field3075 = var1.method2668();
        Statics.field3232 = var1.method2668();
        int var2 = (var1.method2666() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3233; var3++) {
            Statics.field224[var3] = var1.method2668();
        }
        for (int var4 = 0; var4 < Statics.field3233; var4++) {
            Statics.field3234[var4] = var1.method2668();
        }
        for (int var5 = 0; var5 < Statics.field3233; var5++) {
            Statics.field3235[var5] = var1.method2668();
        }
        for (int var6 = 0; var6 < Statics.field3233; var6++) {
            Statics.field863[var6] = var1.method2668();
        }
        var1.field2091 = arg0.length - 7 - Statics.field3233 * 8 - (var2 - 1) * 3;
        Statics.field2147 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2147[var7] = var1.method2718();
            if (Statics.field2147[var7] == 0) {
                Statics.field2147[var7] = 1;
            }
        }
        var1.field2091 = 0;
        for (int var8 = 0; var8 < Statics.field3233; var8++) {
            int var9 = Statics.field3235[var8];
            int var10 = Statics.field863[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field130[var8] = var12;
            int var13 = var1.method2666();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2835();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2835();
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.z(I)V")
    public static void method633() {
        Statics.field224 = null;
        Statics.field3234 = null;
        Statics.field3235 = null;
        Statics.field863 = null;
        Statics.field2147 = null;
        Statics.field130 = (byte[][]) null;
    }
}
