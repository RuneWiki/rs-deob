package deob;

@ObfuscatedName("lr")
public class class329 {

    public class329() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("le.m(Lir;III)Lln;")
    public static class328 method5456(class245 arg0, int arg1, int arg2) {
        return method3998(arg0, arg1, arg2) ? method4486() : null;
    }

    @ObfuscatedName("lg.f(Lir;Lir;III)Lkk;")
    public static class302 method5358(class245 arg0, class245 arg1, int arg2, int arg3) {
        if (!method3998(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method4156(arg2, arg3);
        class302 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class302 var6 = new class302(var4, Statics.field3911, Statics.field3912, Statics.field3375, Statics.field504, Statics.field3913, Statics.field3914);
            Statics.field3911 = null;
            Statics.field3912 = null;
            Statics.field3375 = null;
            Statics.field504 = null;
            Statics.field3913 = null;
            Statics.field3914 = (byte[][]) null;
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("cs.q(Lir;Ljava/lang/String;Ljava/lang/String;B)Llq;")
    public static class327 method1850(class245 arg0, String arg1, String arg2) {
        int var3 = arg0.method4174(arg1);
        int var4 = arg0.method4175(var3, arg2);
        class327 var5;
        if (method3998(arg0, var3, var4)) {
            var5 = method3312();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("cm.o(Lir;II)Llq;")
    public static class327 method1853(class245 arg0, int arg1) {
        return method3293(arg0, arg1) ? method3312() : null;
    }

    @ObfuscatedName("aj.u(I)[Llq;")
    public static class327[] method387() {
        class327[] var0 = new class327[Statics.field3908];
        for (int var1 = 0; var1 < Statics.field3908; var1++) {
            class327 var2 = var0[var1] = new class327();
            var2.field3894 = Statics.field3909;
            var2.field3890 = Statics.field3910;
            var2.field3895 = Statics.field3911[var1];
            var2.field3893 = Statics.field3912[var1];
            var2.field3892 = Statics.field3375[var1];
            var2.field3888 = Statics.field504[var1];
            var2.field3889 = Statics.field3913;
            var2.field3891 = Statics.field3914[var1];
        }
        Statics.field3911 = null;
        Statics.field3912 = null;
        Statics.field3375 = null;
        Statics.field504 = null;
        Statics.field3913 = null;
        Statics.field3914 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ge.g(I)Llq;")
    public static class327 method3312() {
        class327 var0 = new class327();
        var0.field3894 = Statics.field3909;
        var0.field3890 = Statics.field3910;
        var0.field3895 = Statics.field3911[0];
        var0.field3893 = Statics.field3912[0];
        var0.field3892 = Statics.field3375[0];
        var0.field3888 = Statics.field504[0];
        var0.field3889 = Statics.field3913;
        var0.field3891 = Statics.field3914[0];
        Statics.field3911 = null;
        Statics.field3912 = null;
        Statics.field3375 = null;
        Statics.field504 = null;
        Statics.field3913 = null;
        Statics.field3914 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ea.l(I)[Lln;")
    public static class328[] method3062() {
        class328[] var0 = new class328[Statics.field3908];
        for (int var1 = 0; var1 < Statics.field3908; var1++) {
            class328 var2 = var0[var1] = new class328();
            var2.field3901 = Statics.field3909;
            var2.field3902 = Statics.field3910;
            var2.field3906 = Statics.field3911[var1];
            var2.field3905 = Statics.field3912[var1];
            var2.field3897 = Statics.field3375[var1];
            var2.field3904 = Statics.field504[var1];
            int var3 = var2.field3904 * var2.field3897;
            byte[] var4 = Statics.field3914[var1];
            var2.field3900 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3900[var5] = Statics.field3913[var4[var5] & 0xFF];
            }
        }
        Statics.field3911 = null;
        Statics.field3912 = null;
        Statics.field3375 = null;
        Statics.field504 = null;
        Statics.field3913 = null;
        Statics.field3914 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ig.e(B)Lln;")
    public static class328 method4486() {
        class328 var0 = new class328();
        var0.field3901 = Statics.field3909;
        var0.field3902 = Statics.field3910;
        var0.field3906 = Statics.field3911[0];
        var0.field3905 = Statics.field3912[0];
        var0.field3897 = Statics.field3375[0];
        var0.field3904 = Statics.field504[0];
        int var1 = var0.field3904 * var0.field3897;
        byte[] var2 = Statics.field3914[0];
        var0.field3900 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3900[var3] = Statics.field3913[var2[var3] & 0xFF];
        }
        Statics.field3911 = null;
        Statics.field3912 = null;
        Statics.field3375 = null;
        Statics.field504 = null;
        Statics.field3913 = null;
        Statics.field3914 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("hp.x(Lir;IIB)Z")
    public static boolean method3998(class245 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4156(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method710(var3);
            return true;
        }
    }

    @ObfuscatedName("fe.d(Lir;II)Z")
    public static boolean method3293(class245 arg0, int arg1) {
        byte[] var2 = arg0.method4195(arg1);
        if (var2 == null) {
            return false;
        } else {
            method710(var2);
            return true;
        }
    }

    @ObfuscatedName("az.a([BB)V")
    public static void method710(byte[] arg0) {
        class202 var1 = new class202(arg0);
        var1.field2439 = arg0.length - 2;
        Statics.field3908 = var1.method3530();
        Statics.field3911 = new int[Statics.field3908];
        Statics.field3912 = new int[Statics.field3908];
        Statics.field3375 = new int[Statics.field3908];
        Statics.field504 = new int[Statics.field3908];
        Statics.field3914 = new byte[Statics.field3908][];
        var1.field2439 = arg0.length - 7 - Statics.field3908 * 8;
        Statics.field3909 = var1.method3530();
        Statics.field3910 = var1.method3530();
        int var2 = (var1.method3551() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3908; var3++) {
            Statics.field3911[var3] = var1.method3530();
        }
        for (int var4 = 0; var4 < Statics.field3908; var4++) {
            Statics.field3912[var4] = var1.method3530();
        }
        for (int var5 = 0; var5 < Statics.field3908; var5++) {
            Statics.field3375[var5] = var1.method3530();
        }
        for (int var6 = 0; var6 < Statics.field3908; var6++) {
            Statics.field504[var6] = var1.method3530();
        }
        var1.field2439 = arg0.length - 7 - Statics.field3908 * 8 - (var2 - 1) * 3;
        Statics.field3913 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3913[var7] = var1.method3421();
            if (Statics.field3913[var7] == 0) {
                Statics.field3913[var7] = 1;
            }
        }
        var1.field2439 = 0;
        for (int var8 = 0; var8 < Statics.field3908; var8++) {
            int var9 = Statics.field3375[var8];
            int var10 = Statics.field504[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3914[var8] = var12;
            int var13 = var1.method3551();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3537();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3537();
                    }
                }
            }
        }
    }
}
