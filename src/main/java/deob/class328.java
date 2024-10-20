package deob;

@ObfuscatedName("lk")
public class class328 {

    public class328() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ff.n(Lij;IIB)[Lll;")
    public static class326[] method3402(class254 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4494(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method108(var3);
            var4 = true;
        }
        return var4 ? method1701() : null;
    }

    @ObfuscatedName("jt.h(Lij;IIB)Lll;")
    public static class326 method5054(class254 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4494(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method108(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class326 var5 = new class326();
        var5.field3876 = Statics.field3890;
        var5.field3877 = Statics.field3892;
        var5.field3870 = Statics.field3774[0];
        var5.field3875 = Statics.field226[0];
        var5.field3873 = Statics.field523[0];
        var5.field3874 = Statics.field3893[0];
        var5.field3871 = Statics.field3894;
        var5.field3872 = Statics.field3895[0];
        Statics.field3774 = null;
        Statics.field226 = null;
        Statics.field523 = null;
        Statics.field3893 = null;
        Statics.field3894 = null;
        Statics.field3895 = (byte[][]) null;
        return var5;
    }

    @ObfuscatedName("ii.l(Lij;IIB)[Llu;")
    public static class327[] method4364(class254 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4494(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method108(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class327[] var5 = new class327[Statics.field3891];
        for (int var6 = 0; var6 < Statics.field3891; var6++) {
            class327 var7 = var5[var6] = new class327();
            var7.field3886 = Statics.field3890;
            var7.field3884 = Statics.field3892;
            var7.field3879 = Statics.field3774[var6];
            var7.field3882 = Statics.field226[var6];
            var7.field3878 = Statics.field523[var6];
            var7.field3880 = Statics.field3893[var6];
            int var8 = var7.field3880 * var7.field3878;
            byte[] var9 = Statics.field3895[var6];
            var7.field3883 = new int[var8];
            for (int var10 = 0; var10 < var8; var10++) {
                var7.field3883[var10] = Statics.field3894[var9[var10] & 0xFF];
            }
        }
        Statics.field3774 = null;
        Statics.field226 = null;
        Statics.field523 = null;
        Statics.field3893 = null;
        Statics.field3894 = null;
        Statics.field3895 = (byte[][]) null;
        return var5;
    }

    @ObfuscatedName("bc.g(Lij;IIB)Llu;")
    public static class327 method1038(class254 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4494(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method108(var3);
            var4 = true;
        }
        return var4 ? method1937() : null;
    }

    @ObfuscatedName("bp.b(Lij;Lij;IIB)Lkf;")
    public static class304 method1720(class254 arg0, class254 arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method4494(arg2, arg3);
        boolean var5;
        if (var4 == null) {
            var5 = false;
        } else {
            method108(var4);
            var5 = true;
        }
        if (!var5) {
            return null;
        }
        byte[] var6 = arg1.method4494(arg2, arg3);
        class304 var7;
        if (var6 == null) {
            var7 = null;
        } else {
            class304 var8 = new class304(var6, Statics.field3774, Statics.field226, Statics.field523, Statics.field3893, Statics.field3894, Statics.field3895);
            Statics.field3774 = null;
            Statics.field226 = null;
            Statics.field523 = null;
            Statics.field3893 = null;
            Statics.field3894 = null;
            Statics.field3895 = (byte[][]) null;
            var7 = var8;
        }
        return var7;
    }

    @ObfuscatedName("kc.a(Lij;Ljava/lang/String;Ljava/lang/String;I)[Lll;")
    public static class326[] method5317(class254 arg0, String arg1, String arg2) {
        int var3 = arg0.method4472(arg1);
        int var4 = arg0.method4473(var3, arg2);
        return method3402(arg0, var3, var4);
    }

    @ObfuscatedName("ke.c(Lij;Ljava/lang/String;Ljava/lang/String;B)Lll;")
    public static class326 method5135(class254 arg0, String arg1, String arg2) {
        int var3 = arg0.method4472(arg1);
        int var4 = arg0.method4473(var3, arg2);
        return method5054(arg0, var3, var4);
    }

    @ObfuscatedName("jj.z(Lij;Ljava/lang/String;Ljava/lang/String;B)[Llu;")
    public static class327[] method5029(class254 arg0, String arg1, String arg2) {
        int var3 = arg0.method4472(arg1);
        int var4 = arg0.method4473(var3, arg2);
        return method4364(arg0, var3, var4);
    }

    @ObfuscatedName("bd.j(I)[Lll;")
    public static class326[] method1701() {
        class326[] var0 = new class326[Statics.field3891];
        for (int var1 = 0; var1 < Statics.field3891; var1++) {
            class326 var2 = var0[var1] = new class326();
            var2.field3876 = Statics.field3890;
            var2.field3877 = Statics.field3892;
            var2.field3870 = Statics.field3774[var1];
            var2.field3875 = Statics.field226[var1];
            var2.field3873 = Statics.field523[var1];
            var2.field3874 = Statics.field3893[var1];
            var2.field3871 = Statics.field3894;
            var2.field3872 = Statics.field3895[var1];
        }
        Statics.field3774 = null;
        Statics.field226 = null;
        Statics.field523 = null;
        Statics.field3893 = null;
        Statics.field3894 = null;
        Statics.field3895 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ce.d(I)Llu;")
    public static class327 method1937() {
        class327 var0 = new class327();
        var0.field3886 = Statics.field3890;
        var0.field3884 = Statics.field3892;
        var0.field3879 = Statics.field3774[0];
        var0.field3882 = Statics.field226[0];
        var0.field3878 = Statics.field523[0];
        var0.field3880 = Statics.field3893[0];
        int var1 = var0.field3880 * var0.field3878;
        byte[] var2 = Statics.field3895[0];
        var0.field3883 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3883[var3] = Statics.field3894[var2[var3] & 0xFF];
        }
        Statics.field3774 = null;
        Statics.field226 = null;
        Statics.field523 = null;
        Statics.field3893 = null;
        Statics.field3894 = null;
        Statics.field3895 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("d.i([BI)V")
    public static void method108(byte[] arg0) {
        class190 var1 = new class190(arg0);
        var1.field2423 = arg0.length - 2;
        Statics.field3891 = var1.method3513();
        Statics.field3774 = new int[Statics.field3891];
        Statics.field226 = new int[Statics.field3891];
        Statics.field523 = new int[Statics.field3891];
        Statics.field3893 = new int[Statics.field3891];
        Statics.field3895 = new byte[Statics.field3891][];
        var1.field2423 = arg0.length - 7 - Statics.field3891 * 8;
        Statics.field3890 = var1.method3513();
        Statics.field3892 = var1.method3513();
        int var2 = (var1.method3511() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3891; var3++) {
            Statics.field3774[var3] = var1.method3513();
        }
        for (int var4 = 0; var4 < Statics.field3891; var4++) {
            Statics.field226[var4] = var1.method3513();
        }
        for (int var5 = 0; var5 < Statics.field3891; var5++) {
            Statics.field523[var5] = var1.method3513();
        }
        for (int var6 = 0; var6 < Statics.field3891; var6++) {
            Statics.field3893[var6] = var1.method3513();
        }
        var1.field2423 = arg0.length - 7 - Statics.field3891 * 8 - (var2 - 1) * 3;
        Statics.field3894 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3894[var7] = var1.method3515();
            if (Statics.field3894[var7] == 0) {
                Statics.field3894[var7] = 1;
            }
        }
        var1.field2423 = 0;
        for (int var8 = 0; var8 < Statics.field3891; var8++) {
            int var9 = Statics.field523[var8];
            int var10 = Statics.field3893[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3895[var8] = var12;
            int var13 = var1.method3511();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3512();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3512();
                    }
                }
            }
        }
    }
}
