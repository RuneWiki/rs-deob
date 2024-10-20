package deob;

@ObfuscatedName("lb")
public class class333 {

    public class333() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.o(Ljf;IIB)Lld;")
    public static class332 method704(class262 arg0, int arg1, int arg2) {
        if (!method2960(arg0, arg1, arg2)) {
            return null;
        }
        class332 var3 = new class332();
        var3.field3987 = Statics.field3999;
        var3.field3990 = Statics.field3995;
        var3.field3989 = Statics.field3997[0];
        var3.field3986 = Statics.field3372[0];
        var3.field3983 = Statics.field448[0];
        var3.field3988 = Statics.field3998[0];
        int var4 = var3.field3988 * var3.field3983;
        byte[] var5 = Statics.field4000[0];
        var3.field3984 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3984[var6] = Statics.field3996[var5[var6] & 0xFF];
        }
        method503();
        return var3;
    }

    @ObfuscatedName("kp.k(Ljf;Ljf;III)Lki;")
    public static class312 method5066(class262 arg0, class262 arg1, int arg2, int arg3) {
        return method2960(arg0, arg2, arg3) ? method755(arg1.method4241(arg2, arg3)) : null;
    }

    @ObfuscatedName("ad.t(Ljf;Ljava/lang/String;Ljava/lang/String;I)[Lll;")
    public static class331[] method562(class262 arg0, String arg1, String arg2) {
        int var3 = arg0.method4175(arg1);
        int var4 = arg0.method4176(var3, arg2);
        class331[] var5;
        if (method2960(arg0, var3, var4)) {
            class331[] var6 = new class331[Statics.field3994];
            for (int var7 = 0; var7 < Statics.field3994; var7++) {
                class331 var8 = var6[var7] = new class331();
                var8.field3976 = Statics.field3999;
                var8.field3981 = Statics.field3995;
                var8.field3978 = Statics.field3997[var7];
                var8.field3979 = Statics.field3372[var7];
                var8.field3975 = Statics.field448[var7];
                var8.field3977 = Statics.field3998[var7];
                var8.field3974 = Statics.field3996;
                var8.field3980 = Statics.field4000[var7];
            }
            method503();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("cf.d(Ljf;Ljava/lang/String;Ljava/lang/String;I)Lll;")
    public static class331 method1643(class262 arg0, String arg1, String arg2) {
        int var3 = arg0.method4175(arg1);
        int var4 = arg0.method4176(var3, arg2);
        class331 var5;
        if (method2960(arg0, var3, var4)) {
            var5 = method2910();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("jf.h(Ljf;Ljava/lang/String;Ljava/lang/String;I)[Lld;")
    public static class332[] method4256(class262 arg0, String arg1, String arg2) {
        int var3 = arg0.method4175(arg1);
        int var4 = arg0.method4176(var3, arg2);
        class332[] var5;
        if (method2960(arg0, var3, var4)) {
            var5 = method1730();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("im.m(Ljf;IB)Lll;")
    public static class331 method4125(class262 arg0, int arg1) {
        byte[] var2 = arg0.method4164(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method4364(var2);
            var3 = true;
        }
        return var3 ? method2910() : null;
    }

    @ObfuscatedName("eg.z(I)Lll;")
    public static class331 method2910() {
        class331 var0 = new class331();
        var0.field3976 = Statics.field3999;
        var0.field3981 = Statics.field3995;
        var0.field3978 = Statics.field3997[0];
        var0.field3979 = Statics.field3372[0];
        var0.field3975 = Statics.field448[0];
        var0.field3977 = Statics.field3998[0];
        var0.field3974 = Statics.field3996;
        var0.field3980 = Statics.field4000[0];
        method503();
        return var0;
    }

    @ObfuscatedName("ck.i(I)[Lld;")
    public static class332[] method1730() {
        class332[] var0 = new class332[Statics.field3994];
        for (int var1 = 0; var1 < Statics.field3994; var1++) {
            class332 var2 = var0[var1] = new class332();
            var2.field3987 = Statics.field3999;
            var2.field3990 = Statics.field3995;
            var2.field3989 = Statics.field3997[var1];
            var2.field3986 = Statics.field3372[var1];
            var2.field3983 = Statics.field448[var1];
            var2.field3988 = Statics.field3998[var1];
            int var3 = var2.field3988 * var2.field3983;
            byte[] var4 = Statics.field4000[var1];
            var2.field3984 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3984[var5] = Statics.field3996[var4[var5] & 0xFF];
            }
        }
        method503();
        return var0;
    }

    @ObfuscatedName("bs.u([BI)Lki;")
    public static class312 method755(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class312 var1 = new class312(arg0, Statics.field3997, Statics.field3372, Statics.field448, Statics.field3998, Statics.field3996, Statics.field4000);
            method503();
            return var1;
        }
    }

    @ObfuscatedName("fn.x(Ljf;IIS)Z")
    public static boolean method2960(class262 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4241(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method4364(var3);
            return true;
        }
    }

    @ObfuscatedName("jw.y([BI)V")
    public static void method4364(byte[] arg0) {
        class195 var1 = new class195(arg0);
        var1.field2575 = arg0.length - 2;
        Statics.field3994 = var1.method3207();
        Statics.field3997 = new int[Statics.field3994];
        Statics.field3372 = new int[Statics.field3994];
        Statics.field448 = new int[Statics.field3994];
        Statics.field3998 = new int[Statics.field3994];
        Statics.field4000 = new byte[Statics.field3994][];
        var1.field2575 = arg0.length - 7 - Statics.field3994 * 8;
        Statics.field3999 = var1.method3207();
        Statics.field3995 = var1.method3207();
        int var2 = (var1.method3205() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3994; var3++) {
            Statics.field3997[var3] = var1.method3207();
        }
        for (int var4 = 0; var4 < Statics.field3994; var4++) {
            Statics.field3372[var4] = var1.method3207();
        }
        for (int var5 = 0; var5 < Statics.field3994; var5++) {
            Statics.field448[var5] = var1.method3207();
        }
        for (int var6 = 0; var6 < Statics.field3994; var6++) {
            Statics.field3998[var6] = var1.method3207();
        }
        var1.field2575 = arg0.length - 7 - Statics.field3994 * 8 - (var2 - 1) * 3;
        Statics.field3996 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3996[var7] = var1.method3233();
            if (Statics.field3996[var7] == 0) {
                Statics.field3996[var7] = 1;
            }
        }
        var1.field2575 = 0;
        for (int var8 = 0; var8 < Statics.field3994; var8++) {
            int var9 = Statics.field448[var8];
            int var10 = Statics.field3998[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field4000[var8] = var12;
            int var13 = var1.method3205();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3210();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3210();
                    }
                }
            }
        }
    }

    @ObfuscatedName("az.a(I)V")
    public static void method503() {
        Statics.field3997 = null;
        Statics.field3372 = null;
        Statics.field448 = null;
        Statics.field3998 = null;
        Statics.field3996 = null;
        Statics.field4000 = (byte[][]) null;
    }
}
