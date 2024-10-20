package deob;

@ObfuscatedName("hw")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bq.u(Lgt;III)Lhs;")
    public static class225 method1340(class183 arg0, int arg1, int arg2) {
        return method61(arg0, arg1, arg2) ? method837() : null;
    }

    @ObfuscatedName("bi.x(Lgt;Lgt;III)Lhb;")
    public static class209 method1081(class183 arg0, class183 arg1, int arg2, int arg3) {
        if (!method61(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3071(arg2, arg3);
        class209 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class209 var6 = new class209(var4, Statics.field3214, Statics.field3217, Statics.field3218, Statics.field2654, Statics.field3219, Statics.field1846);
            Statics.field3214 = null;
            Statics.field3217 = null;
            Statics.field3218 = null;
            Statics.field2654 = null;
            Statics.field3219 = null;
            Statics.field1846 = (byte[][]) null;
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("en.i(Lgt;Ljava/lang/String;Ljava/lang/String;I)[Lhl;")
    public static class223[] method2801(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3076(arg1);
        int var4 = arg0.method3077(var3, arg2);
        class223[] var5;
        if (method61(arg0, var3, var4)) {
            class223[] var6 = new class223[Statics.field3216];
            for (int var7 = 0; var7 < Statics.field3216; var7++) {
                class223 var8 = var6[var7] = new class223();
                var8.field3197 = Statics.field3215;
                var8.field3198 = Statics.field3061;
                var8.field3195 = Statics.field3214[var7];
                var8.field3193 = Statics.field3217[var7];
                var8.field3196 = Statics.field3218[var7];
                var8.field3191 = Statics.field2654[var7];
                var8.field3192 = Statics.field3219;
                var8.field3194 = Statics.field1846[var7];
            }
            Statics.field3214 = null;
            Statics.field3217 = null;
            Statics.field3218 = null;
            Statics.field2654 = null;
            Statics.field3219 = null;
            Statics.field1846 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("gh.a(Lgt;Ljava/lang/String;Ljava/lang/String;B)Lhl;")
    public static class223 method3491(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3076(arg1);
        int var4 = arg0.method3077(var3, arg2);
        class223 var5;
        if (method61(arg0, var3, var4)) {
            var5 = method3051();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("b.c(Lgt;Ljava/lang/String;Ljava/lang/String;I)[Lhs;")
    public static class225[] method593(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3076(arg1);
        int var4 = arg0.method3077(var3, arg2);
        class225[] var5;
        if (method61(arg0, var3, var4)) {
            class225[] var6 = new class225[Statics.field3216];
            for (int var7 = 0; var7 < Statics.field3216; var7++) {
                class225 var8 = var6[var7] = new class225();
                var8.field3206 = Statics.field3215;
                var8.field3208 = Statics.field3061;
                var8.field3210 = Statics.field3214[var7];
                var8.field3209 = Statics.field3217[var7];
                var8.field3205 = Statics.field3218[var7];
                var8.field3204 = Statics.field2654[var7];
                int var9 = var8.field3205 * var8.field3204;
                byte[] var10 = Statics.field1846[var7];
                var8.field3203 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field3203[var11] = Statics.field3219[var10[var11] & 0xFF];
                }
            }
            Statics.field3214 = null;
            Statics.field3217 = null;
            Statics.field3218 = null;
            Statics.field2654 = null;
            Statics.field3219 = null;
            Statics.field1846 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fl.g(B)Lhl;")
    public static class223 method3051() {
        class223 var0 = new class223();
        var0.field3197 = Statics.field3215;
        var0.field3198 = Statics.field3061;
        var0.field3195 = Statics.field3214[0];
        var0.field3193 = Statics.field3217[0];
        var0.field3196 = Statics.field3218[0];
        var0.field3191 = Statics.field2654[0];
        var0.field3192 = Statics.field3219;
        var0.field3194 = Statics.field1846[0];
        Statics.field3214 = null;
        Statics.field3217 = null;
        Statics.field3218 = null;
        Statics.field2654 = null;
        Statics.field3219 = null;
        Statics.field1846 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ab.z(B)Lhs;")
    public static class225 method837() {
        class225 var0 = new class225();
        var0.field3206 = Statics.field3215;
        var0.field3208 = Statics.field3061;
        var0.field3210 = Statics.field3214[0];
        var0.field3209 = Statics.field3217[0];
        var0.field3205 = Statics.field3218[0];
        var0.field3204 = Statics.field2654[0];
        int var1 = var0.field3205 * var0.field3204;
        byte[] var2 = Statics.field1846[0];
        var0.field3203 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3203[var3] = Statics.field3219[var2[var3] & 0xFF];
        }
        Statics.field3214 = null;
        Statics.field3217 = null;
        Statics.field3218 = null;
        Statics.field2654 = null;
        Statics.field3219 = null;
        Statics.field1846 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("f.t(Lgt;IIS)Z")
    public static boolean method61(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3071(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2919(var3);
            return true;
        }
    }

    @ObfuscatedName("ef.m(Lgt;II)Z")
    public static boolean method2556(class183 arg0, int arg1) {
        byte[] var2 = arg0.method3066(arg1);
        if (var2 == null) {
            return false;
        } else {
            method2919(var2);
            return true;
        }
    }

    @ObfuscatedName("fi.q([BI)V")
    public static void method2919(byte[] arg0) {
        class154 var1 = new class154(arg0);
        var1.field2073 = arg0.length - 2;
        Statics.field3216 = var1.method2581();
        Statics.field3214 = new int[Statics.field3216];
        Statics.field3217 = new int[Statics.field3216];
        Statics.field3218 = new int[Statics.field3216];
        Statics.field2654 = new int[Statics.field3216];
        Statics.field1846 = new byte[Statics.field3216][];
        var1.field2073 = arg0.length - 7 - Statics.field3216 * 8;
        Statics.field3215 = var1.method2581();
        Statics.field3061 = var1.method2581();
        int var2 = (var1.method2708() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3216; var3++) {
            Statics.field3214[var3] = var1.method2581();
        }
        for (int var4 = 0; var4 < Statics.field3216; var4++) {
            Statics.field3217[var4] = var1.method2581();
        }
        for (int var5 = 0; var5 < Statics.field3216; var5++) {
            Statics.field3218[var5] = var1.method2581();
        }
        for (int var6 = 0; var6 < Statics.field3216; var6++) {
            Statics.field2654[var6] = var1.method2581();
        }
        var1.field2073 = arg0.length - 7 - Statics.field3216 * 8 - (var2 - 1) * 3;
        Statics.field3219 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3219[var7] = var1.method2599();
            if (Statics.field3219[var7] == 0) {
                Statics.field3219[var7] = 1;
            }
        }
        var1.field2073 = 0;
        for (int var8 = 0; var8 < Statics.field3216; var8++) {
            int var9 = Statics.field3218[var8];
            int var10 = Statics.field2654[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1846[var8] = var12;
            int var13 = var1.method2708();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2754();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2754();
                    }
                }
            }
        }
    }
}
