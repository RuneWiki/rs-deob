package deob;

@ObfuscatedName("hi")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gh.k(Lgh;III)[Lhv;")
    public static class225[] method3125(class183 arg0, int arg1, int arg2) {
        return method1126(arg0, arg1, arg2) ? method3823() : null;
    }

    @ObfuscatedName("bf.y(Lgh;III)Lhv;")
    public static class225 method1109(class183 arg0, int arg1, int arg2) {
        return method1126(arg0, arg1, arg2) ? method2941() : null;
    }

    @ObfuscatedName("ax.o(Lgh;Lgh;III)Lhm;")
    public static class209 method802(class183 arg0, class183 arg1, int arg2, int arg3) {
        if (!method1126(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3065(arg2, arg3);
        class209 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class209 var6 = new class209(var4, Statics.field2288, Statics.field3215, Statics.field933, Statics.field3212, Statics.field3216, Statics.field3219);
            method3824();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("co.r(Lgh;Ljava/lang/String;Ljava/lang/String;I)[Lhg;")
    public static class223[] method1619(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3076(arg1);
        int var4 = arg0.method3077(var3, arg2);
        class223[] var5;
        if (method1126(arg0, var3, var4)) {
            class223[] var6 = new class223[Statics.field3217];
            for (int var7 = 0; var7 < Statics.field3217; var7++) {
                class223 var8 = var6[var7] = new class223();
                var8.field3189 = Statics.field3213;
                var8.field3190 = Statics.field3214;
                var8.field3193 = Statics.field2288[var7];
                var8.field3194 = Statics.field3215[var7];
                var8.field3191 = Statics.field933[var7];
                var8.field3192 = Statics.field3212[var7];
                var8.field3195 = Statics.field3216;
                var8.field3196 = Statics.field3219[var7];
            }
            method3824();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fh.w(Lgh;Ljava/lang/String;Ljava/lang/String;B)Lhg;")
    public static class223 method3003(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3076(arg1);
        int var4 = arg0.method3077(var3, arg2);
        class223 var5;
        if (method1126(arg0, var3, var4)) {
            class223 var6 = new class223();
            var6.field3189 = Statics.field3213;
            var6.field3190 = Statics.field3214;
            var6.field3193 = Statics.field2288[0];
            var6.field3194 = Statics.field3215[0];
            var6.field3191 = Statics.field933[0];
            var6.field3192 = Statics.field3212[0];
            var6.field3195 = Statics.field3216;
            var6.field3196 = Statics.field3219[0];
            method3824();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ap.j(Lgh;Ljava/lang/String;Ljava/lang/String;I)[Lhv;")
    public static class225[] method623(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3076(arg1);
        int var4 = arg0.method3077(var3, arg2);
        return method3125(arg0, var3, var4);
    }

    @ObfuscatedName("cl.c(Lgh;Lgh;Ljava/lang/String;Ljava/lang/String;I)Lhm;")
    public static class209 method1799(class183 arg0, class183 arg1, String arg2, String arg3) {
        int var4 = arg0.method3076(arg2);
        int var5 = arg0.method3077(var4, arg3);
        return method802(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("hp.g(Lgh;IB)Lhg;")
    public static class223 method3737(class183 arg0, int arg1) {
        if (!method3045(arg0, arg1)) {
            return null;
        }
        class223 var2 = new class223();
        var2.field3189 = Statics.field3213;
        var2.field3190 = Statics.field3214;
        var2.field3193 = Statics.field2288[0];
        var2.field3194 = Statics.field3215[0];
        var2.field3191 = Statics.field933[0];
        var2.field3192 = Statics.field3212[0];
        var2.field3195 = Statics.field3216;
        var2.field3196 = Statics.field3219[0];
        method3824();
        return var2;
    }

    @ObfuscatedName("hz.i(I)[Lhv;")
    public static class225[] method3823() {
        class225[] var0 = new class225[Statics.field3217];
        for (int var1 = 0; var1 < Statics.field3217; var1++) {
            class225 var2 = var0[var1] = new class225();
            var2.field3206 = Statics.field3213;
            var2.field3211 = Statics.field3214;
            var2.field3203 = Statics.field2288[var1];
            var2.field3204 = Statics.field3215[var1];
            var2.field3201 = Statics.field933[var1];
            var2.field3209 = Statics.field3212[var1];
            int var3 = var2.field3209 * var2.field3201;
            byte[] var4 = Statics.field3219[var1];
            var2.field3202 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3202[var5] = Statics.field3216[var4[var5] & 0xFF];
            }
        }
        method3824();
        return var0;
    }

    @ObfuscatedName("fq.v(B)Lhv;")
    public static class225 method2941() {
        class225 var0 = new class225();
        var0.field3206 = Statics.field3213;
        var0.field3211 = Statics.field3214;
        var0.field3203 = Statics.field2288[0];
        var0.field3204 = Statics.field3215[0];
        var0.field3201 = Statics.field933[0];
        var0.field3209 = Statics.field3212[0];
        int var1 = var0.field3209 * var0.field3201;
        byte[] var2 = Statics.field3219[0];
        var0.field3202 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3202[var3] = Statics.field3216[var2[var3] & 0xFF];
        }
        method3824();
        return var0;
    }

    @ObfuscatedName("bp.a(Lgh;III)Z")
    public static boolean method1126(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3065(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method867(var3);
            return true;
        }
    }

    @ObfuscatedName("fj.h(Lgh;II)Z")
    public static boolean method3045(class183 arg0, int arg1) {
        byte[] var2 = arg0.method3070(arg1);
        if (var2 == null) {
            return false;
        } else {
            method867(var2);
            return true;
        }
    }

    @ObfuscatedName("al.p([BB)V")
    public static void method867(byte[] arg0) {
        class161 var1 = new class161(arg0);
        var1.field2267 = arg0.length - 2;
        Statics.field3217 = var1.method2735();
        Statics.field2288 = new int[Statics.field3217];
        Statics.field3215 = new int[Statics.field3217];
        Statics.field933 = new int[Statics.field3217];
        Statics.field3212 = new int[Statics.field3217];
        Statics.field3219 = new byte[Statics.field3217][];
        var1.field2267 = arg0.length - 7 - Statics.field3217 * 8;
        Statics.field3213 = var1.method2735();
        Statics.field3214 = var1.method2735();
        int var2 = (var1.method2733() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3217; var3++) {
            Statics.field2288[var3] = var1.method2735();
        }
        for (int var4 = 0; var4 < Statics.field3217; var4++) {
            Statics.field3215[var4] = var1.method2735();
        }
        for (int var5 = 0; var5 < Statics.field3217; var5++) {
            Statics.field933[var5] = var1.method2735();
        }
        for (int var6 = 0; var6 < Statics.field3217; var6++) {
            Statics.field3212[var6] = var1.method2735();
        }
        var1.field2267 = arg0.length - 7 - Statics.field3217 * 8 - (var2 - 1) * 3;
        Statics.field3216 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3216[var7] = var1.method2876();
            if (Statics.field3216[var7] == 0) {
                Statics.field3216[var7] = 1;
            }
        }
        var1.field2267 = 0;
        for (int var8 = 0; var8 < Statics.field3217; var8++) {
            int var9 = Statics.field933[var8];
            int var10 = Statics.field3212[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3219[var8] = var12;
            int var13 = var1.method2733();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2734();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2734();
                    }
                }
            }
        }
    }

    @ObfuscatedName("hj.t(I)V")
    public static void method3824() {
        Statics.field2288 = null;
        Statics.field3215 = null;
        Statics.field933 = null;
        Statics.field3212 = null;
        Statics.field3216 = null;
        Statics.field3219 = (byte[][]) null;
    }
}
