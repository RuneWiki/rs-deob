package deob;

@ObfuscatedName("ku")
public class class296 {

    public class296() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ce.m(Lik;IIS)[Lko;")
    public static class294[] method1548(class243 arg0, int arg1, int arg2) {
        if (!Statics.method1065(arg0, arg1, arg2)) {
            return null;
        }
        class294[] var3 = new class294[Statics.field3855];
        for (int var4 = 0; var4 < Statics.field3855; var4++) {
            class294 var5 = var3[var4] = new class294();
            var5.field3837 = Statics.field3851;
            var5.field3836 = Statics.field3852;
            var5.field3835 = Statics.field3854[var4];
            var5.field3831 = Statics.field490[var4];
            var5.field3834 = Statics.field746[var4];
            var5.field3833 = Statics.field429[var4];
            var5.field3832 = Statics.field3853;
            var5.field3838 = Statics.field3856[var4];
        }
        method4669();
        return var3;
    }

    @ObfuscatedName("o.p(Lik;IIB)Lkd;")
    public static class295 method166(class243 arg0, int arg1, int arg2) {
        if (!Statics.method1065(arg0, arg1, arg2)) {
            return null;
        }
        class295 var3 = new class295();
        var3.field3844 = Statics.field3851;
        var3.field3845 = Statics.field3852;
        var3.field3842 = Statics.field3854[0];
        var3.field3843 = Statics.field490[0];
        var3.field3840 = Statics.field746[0];
        var3.field3839 = Statics.field429[0];
        int var4 = var3.field3840 * var3.field3839;
        byte[] var5 = Statics.field3856[0];
        var3.field3850 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3850[var6] = Statics.field3853[var5[var6] & 0xFF];
        }
        method4669();
        return var3;
    }

    @ObfuscatedName("hx.i(Lik;Lik;IIB)Ljt;")
    public static class271 method3908(class243 arg0, class243 arg1, int arg2, int arg3) {
        return Statics.method1065(arg0, arg2, arg3) ? Statics.method4644(arg1.method3930(arg2, arg3)) : null;
    }

    @ObfuscatedName("eb.j(Lik;Ljava/lang/String;Ljava/lang/String;I)[Lko;")
    public static class294[] method2775(class243 arg0, String arg1, String arg2) {
        int var3 = arg0.method3985(arg1);
        int var4 = arg0.method3947(var3, arg2);
        return method1548(arg0, var3, var4);
    }

    @ObfuscatedName("ie.v(Lik;Ljava/lang/String;Ljava/lang/String;I)Lko;")
    public static class294 method4138(class243 arg0, String arg1, String arg2) {
        int var3 = arg0.method3985(arg1);
        int var4 = arg0.method3947(var3, arg2);
        class294 var5;
        if (Statics.method1065(arg0, var3, var4)) {
            var5 = Statics.method470();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fv.x(Lik;Ljava/lang/String;Ljava/lang/String;B)[Lkd;")
    public static class295[] method3223(class243 arg0, String arg1, String arg2) {
        int var3 = arg0.method3985(arg1);
        int var4 = arg0.method3947(var3, arg2);
        class295[] var5;
        if (Statics.method1065(arg0, var3, var4)) {
            var5 = method4335();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("hf.e(Lik;Ljava/lang/String;Ljava/lang/String;I)Lkd;")
    public static class295 method3889(class243 arg0, String arg1, String arg2) {
        int var3 = arg0.method3985(arg1);
        int var4 = arg0.method3947(var3, arg2);
        return method166(arg0, var3, var4);
    }

    @ObfuscatedName("js.l(Lik;Lik;Ljava/lang/String;Ljava/lang/String;I)Ljt;")
    public static class271 method4720(class243 arg0, class243 arg1, String arg2, String arg3) {
        int var4 = arg0.method3985(arg2);
        int var5 = arg0.method3947(var4, arg3);
        return method3908(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("fn.b(Lik;II)Lko;")
    public static class294 method3243(class243 arg0, int arg1) {
        byte[] var2 = arg0.method4026(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method2752(var2);
            var3 = true;
        }
        return var3 ? Statics.method470() : null;
    }

    @ObfuscatedName("jj.c(B)[Lkd;")
    public static class295[] method4335() {
        class295[] var0 = new class295[Statics.field3855];
        for (int var1 = 0; var1 < Statics.field3855; var1++) {
            class295 var2 = var0[var1] = new class295();
            var2.field3844 = Statics.field3851;
            var2.field3845 = Statics.field3852;
            var2.field3842 = Statics.field3854[var1];
            var2.field3843 = Statics.field490[var1];
            var2.field3840 = Statics.field746[var1];
            var2.field3839 = Statics.field429[var1];
            int var3 = var2.field3840 * var2.field3839;
            byte[] var4 = Statics.field3856[var1];
            var2.field3850 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3850[var5] = Statics.field3853[var4[var5] & 0xFF];
            }
        }
        method4669();
        return var0;
    }

    @ObfuscatedName("eh.w([BI)V")
    public static void method2752(byte[] arg0) {
        class181 var1 = new class181(arg0);
        var1.field2498 = arg0.length - 2;
        Statics.field3855 = var1.method3009();
        Statics.field3854 = new int[Statics.field3855];
        Statics.field490 = new int[Statics.field3855];
        Statics.field746 = new int[Statics.field3855];
        Statics.field429 = new int[Statics.field3855];
        Statics.field3856 = new byte[Statics.field3855][];
        var1.field2498 = arg0.length - 7 - Statics.field3855 * 8;
        Statics.field3851 = var1.method3009();
        Statics.field3852 = var1.method3009();
        int var2 = (var1.method3012() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3855; var3++) {
            Statics.field3854[var3] = var1.method3009();
        }
        for (int var4 = 0; var4 < Statics.field3855; var4++) {
            Statics.field490[var4] = var1.method3009();
        }
        for (int var5 = 0; var5 < Statics.field3855; var5++) {
            Statics.field746[var5] = var1.method3009();
        }
        for (int var6 = 0; var6 < Statics.field3855; var6++) {
            Statics.field429[var6] = var1.method3009();
        }
        var1.field2498 = arg0.length - 7 - Statics.field3855 * 8 - (var2 - 1) * 3;
        Statics.field3853 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3853[var7] = var1.method3075();
            if (Statics.field3853[var7] == 0) {
                Statics.field3853[var7] = 1;
            }
        }
        var1.field2498 = 0;
        for (int var8 = 0; var8 < Statics.field3855; var8++) {
            int var9 = Statics.field746[var8];
            int var10 = Statics.field429[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3856[var8] = var12;
            int var13 = var1.method3012();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3013();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3013();
                    }
                }
            }
        }
    }

    @ObfuscatedName("jh.k(B)V")
    public static void method4669() {
        Statics.field3854 = null;
        Statics.field490 = null;
        Statics.field746 = null;
        Statics.field429 = null;
        Statics.field3853 = null;
        Statics.field3856 = (byte[][]) null;
    }
}
