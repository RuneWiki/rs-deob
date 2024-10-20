package deob;

@ObfuscatedName("kz")
public class class311 {

    public class311() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iu.s(Lir;III)[Lki;")
    public static class310[] method4467(class247 arg0, int arg1, int arg2) {
        return method456(arg0, arg1, arg2) ? method662() : null;
    }

    @ObfuscatedName("bc.g(Lir;IIB)Lki;")
    public static class310 method983(class247 arg0, int arg1, int arg2) {
        if (!method456(arg0, arg1, arg2)) {
            return null;
        }
        class310 var3 = new class310();
        var3.field3898 = Statics.field3909;
        var3.field3903 = Statics.field3911;
        var3.field3906 = Statics.field2699[0];
        var3.field3897 = Statics.field3477[0];
        var3.field3900 = Statics.field709[0];
        var3.field3899 = Statics.field3912[0];
        int var4 = var3.field3900 * var3.field3899;
        byte[] var5 = Statics.field3913[0];
        var3.field3901 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3901[var6] = Statics.field3787[var5[var6] & 0xFF];
        }
        method4929();
        return var3;
    }

    @ObfuscatedName("hm.m(Lir;Ljava/lang/String;Ljava/lang/String;B)[Lkh;")
    public static class309[] method4160(class247 arg0, String arg1, String arg2) {
        int var3 = arg0.method4201(arg1);
        int var4 = arg0.method4217(var3, arg2);
        class309[] var5;
        if (method456(arg0, var3, var4)) {
            var5 = method242();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fo.h(Lir;Ljava/lang/String;Ljava/lang/String;I)Lkh;")
    public static class309 method3059(class247 arg0, String arg1, String arg2) {
        int var3 = arg0.method4201(arg1);
        int var4 = arg0.method4217(var3, arg2);
        class309 var5;
        if (method456(arg0, var3, var4)) {
            var5 = method1781();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ai.i(Lir;Ljava/lang/String;Ljava/lang/String;I)[Lki;")
    public static class310[] method459(class247 arg0, String arg1, String arg2) {
        int var3 = arg0.method4201(arg1);
        int var4 = arg0.method4217(var3, arg2);
        return method4467(arg0, var3, var4);
    }

    @ObfuscatedName("kg.w(Lir;Ljava/lang/String;Ljava/lang/String;I)Lki;")
    public static class310 method5124(class247 arg0, String arg1, String arg2) {
        int var3 = arg0.method4201(arg1);
        int var4 = arg0.method4217(var3, arg2);
        return method983(arg0, var3, var4);
    }

    @ObfuscatedName("af.d(I)[Lkh;")
    public static class309[] method242() {
        class309[] var0 = new class309[Statics.field3910];
        for (int var1 = 0; var1 < Statics.field3910; var1++) {
            class309 var2 = var0[var1] = new class309();
            var2.field3895 = Statics.field3909;
            var2.field3894 = Statics.field3911;
            var2.field3893 = Statics.field2699[var1];
            var2.field3896 = Statics.field3477[var1];
            var2.field3889 = Statics.field709[var1];
            var2.field3892 = Statics.field3912[var1];
            var2.field3890 = Statics.field3787;
            var2.field3891 = Statics.field3913[var1];
        }
        method4929();
        return var0;
    }

    @ObfuscatedName("cg.z(B)Lkh;")
    public static class309 method1781() {
        class309 var0 = new class309();
        var0.field3895 = Statics.field3909;
        var0.field3894 = Statics.field3911;
        var0.field3893 = Statics.field2699[0];
        var0.field3896 = Statics.field3477[0];
        var0.field3889 = Statics.field709[0];
        var0.field3892 = Statics.field3912[0];
        var0.field3890 = Statics.field3787;
        var0.field3891 = Statics.field3913[0];
        method4929();
        return var0;
    }

    @ObfuscatedName("br.k(I)[Lki;")
    public static class310[] method662() {
        class310[] var0 = new class310[Statics.field3910];
        for (int var1 = 0; var1 < Statics.field3910; var1++) {
            class310 var2 = var0[var1] = new class310();
            var2.field3898 = Statics.field3909;
            var2.field3903 = Statics.field3911;
            var2.field3906 = Statics.field2699[var1];
            var2.field3897 = Statics.field3477[var1];
            var2.field3900 = Statics.field709[var1];
            var2.field3899 = Statics.field3912[var1];
            int var3 = var2.field3900 * var2.field3899;
            byte[] var4 = Statics.field3913[var1];
            var2.field3901 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3901[var5] = Statics.field3787[var4[var5] & 0xFF];
            }
        }
        method4929();
        return var0;
    }

    @ObfuscatedName("aw.c(Lir;III)Z")
    public static boolean method456(class247 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4231(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method6(var3);
            return true;
        }
    }

    @ObfuscatedName("jr.o(Lir;II)Z")
    public static boolean method4827(class247 arg0, int arg1) {
        byte[] var2 = arg0.method4207(arg1);
        if (var2 == null) {
            return false;
        } else {
            method6(var2);
            return true;
        }
    }

    @ObfuscatedName("h.l([BI)V")
    public static void method6(byte[] arg0) {
        class185 var1 = new class185(arg0);
        var1.field2514 = arg0.length - 2;
        Statics.field3910 = var1.method3241();
        Statics.field2699 = new int[Statics.field3910];
        Statics.field3477 = new int[Statics.field3910];
        Statics.field709 = new int[Statics.field3910];
        Statics.field3912 = new int[Statics.field3910];
        Statics.field3913 = new byte[Statics.field3910][];
        var1.field2514 = arg0.length - 7 - Statics.field3910 * 8;
        Statics.field3909 = var1.method3241();
        Statics.field3911 = var1.method3241();
        int var2 = (var1.method3239() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3910; var3++) {
            Statics.field2699[var3] = var1.method3241();
        }
        for (int var4 = 0; var4 < Statics.field3910; var4++) {
            Statics.field3477[var4] = var1.method3241();
        }
        for (int var5 = 0; var5 < Statics.field3910; var5++) {
            Statics.field709[var5] = var1.method3241();
        }
        for (int var6 = 0; var6 < Statics.field3910; var6++) {
            Statics.field3912[var6] = var1.method3241();
        }
        var1.field2514 = arg0.length - 7 - Statics.field3910 * 8 - (var2 - 1) * 3;
        Statics.field3787 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3787[var7] = var1.method3243();
            if (Statics.field3787[var7] == 0) {
                Statics.field3787[var7] = 1;
            }
        }
        var1.field2514 = 0;
        for (int var8 = 0; var8 < Statics.field3910; var8++) {
            int var9 = Statics.field709[var8];
            int var10 = Statics.field3912[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3913[var8] = var12;
            int var13 = var1.method3239();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3240();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3240();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ja.f(B)V")
    public static void method4929() {
        Statics.field2699 = null;
        Statics.field3477 = null;
        Statics.field709 = null;
        Statics.field3912 = null;
        Statics.field3787 = null;
        Statics.field3913 = (byte[][]) null;
    }
}
