package deob;

@ObfuscatedName("ke")
public class class287 {

    public class287() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fz.c(Lip;IIB)[Ljx;")
    public static class285[] method2710(class236 arg0, int arg1, int arg2) {
        return method3130(arg0, arg1, arg2) ? method1870() : null;
    }

    @ObfuscatedName("ib.o(Lip;III)Ljj;")
    public static class286 method4240(class236 arg0, int arg1, int arg2) {
        return method3130(arg0, arg1, arg2) ? method928() : null;
    }

    @ObfuscatedName("id.i(Lip;Lip;III)Ljt;")
    public static class264 method4090(class236 arg0, class236 arg1, int arg2, int arg3) {
        if (!method3130(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3741(arg2, arg3);
        class264 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class264 var6 = new class264(var4, Statics.field3783, Statics.field3784, Statics.field3780, Statics.field3788, Statics.field3787, Statics.field3785);
            Statics.field3783 = null;
            Statics.field3784 = null;
            Statics.field3780 = null;
            Statics.field3788 = null;
            Statics.field3787 = null;
            Statics.field3785 = (byte[][]) null;
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("jk.u(Lip;Ljava/lang/String;Ljava/lang/String;I)[Ljx;")
    public static class285[] method4440(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3730(arg1);
        int var4 = arg0.method3731(var3, arg2);
        return method2710(arg0, var3, var4);
    }

    @ObfuscatedName("eq.g(Lip;Ljava/lang/String;Ljava/lang/String;I)Ljx;")
    public static class285 method2615(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3730(arg1);
        int var4 = arg0.method3731(var3, arg2);
        class285 var5;
        if (method3130(arg0, var3, var4)) {
            class285 var6 = new class285();
            var6.field3766 = Statics.field3781;
            var6.field3760 = Statics.field3782;
            var6.field3763 = Statics.field3783[0];
            var6.field3765 = Statics.field3784[0];
            var6.field3762 = Statics.field3780[0];
            var6.field3761 = Statics.field3788[0];
            var6.field3764 = Statics.field3787;
            var6.field3767 = Statics.field3785[0];
            Statics.field3783 = null;
            Statics.field3784 = null;
            Statics.field3780 = null;
            Statics.field3788 = null;
            Statics.field3787 = null;
            Statics.field3785 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("jk.m(Lip;Ljava/lang/String;Ljava/lang/String;I)[Ljj;")
    public static class286[] method4441(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3730(arg1);
        int var4 = arg0.method3731(var3, arg2);
        class286[] var5;
        if (method3130(arg0, var3, var4)) {
            class286[] var6 = new class286[Statics.field3786];
            for (int var7 = 0; var7 < Statics.field3786; var7++) {
                class286 var8 = var6[var7] = new class286();
                var8.field3773 = Statics.field3781;
                var8.field3774 = Statics.field3782;
                var8.field3771 = Statics.field3783[var7];
                var8.field3772 = Statics.field3784[var7];
                var8.field3778 = Statics.field3780[var7];
                var8.field3768 = Statics.field3788[var7];
                int var9 = var8.field3778 * var8.field3768;
                byte[] var10 = Statics.field3785[var7];
                var8.field3770 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field3770[var11] = Statics.field3787[var10[var11] & 0xFF];
                }
            }
            Statics.field3783 = null;
            Statics.field3784 = null;
            Statics.field3780 = null;
            Statics.field3788 = null;
            Statics.field3787 = null;
            Statics.field3785 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("dt.s(I)[Ljx;")
    public static class285[] method1870() {
        class285[] var0 = new class285[Statics.field3786];
        for (int var1 = 0; var1 < Statics.field3786; var1++) {
            class285 var2 = var0[var1] = new class285();
            var2.field3766 = Statics.field3781;
            var2.field3760 = Statics.field3782;
            var2.field3763 = Statics.field3783[var1];
            var2.field3765 = Statics.field3784[var1];
            var2.field3762 = Statics.field3780[var1];
            var2.field3761 = Statics.field3788[var1];
            var2.field3764 = Statics.field3787;
            var2.field3767 = Statics.field3785[var1];
        }
        Statics.field3783 = null;
        Statics.field3784 = null;
        Statics.field3780 = null;
        Statics.field3788 = null;
        Statics.field3787 = null;
        Statics.field3785 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("bk.x(I)Ljj;")
    public static class286 method928() {
        class286 var0 = new class286();
        var0.field3773 = Statics.field3781;
        var0.field3774 = Statics.field3782;
        var0.field3771 = Statics.field3783[0];
        var0.field3772 = Statics.field3784[0];
        var0.field3778 = Statics.field3780[0];
        var0.field3768 = Statics.field3788[0];
        int var1 = var0.field3778 * var0.field3768;
        byte[] var2 = Statics.field3785[0];
        var0.field3770 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3770[var3] = Statics.field3787[var2[var3] & 0xFF];
        }
        Statics.field3783 = null;
        Statics.field3784 = null;
        Statics.field3780 = null;
        Statics.field3788 = null;
        Statics.field3787 = null;
        Statics.field3785 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ft.p(Lip;IIB)Z")
    public static boolean method3130(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3741(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method19(var3);
            return true;
        }
    }

    @ObfuscatedName("m.k([BI)V")
    public static void method19(byte[] arg0) {
        class174 var1 = new class174(arg0);
        var1.field2357 = arg0.length - 2;
        Statics.field3786 = var1.method2861();
        Statics.field3783 = new int[Statics.field3786];
        Statics.field3784 = new int[Statics.field3786];
        Statics.field3780 = new int[Statics.field3786];
        Statics.field3788 = new int[Statics.field3786];
        Statics.field3785 = new byte[Statics.field3786][];
        var1.field2357 = arg0.length - 7 - Statics.field3786 * 8;
        Statics.field3781 = var1.method2861();
        Statics.field3782 = var1.method2861();
        int var2 = (var1.method2843() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3786; var3++) {
            Statics.field3783[var3] = var1.method2861();
        }
        for (int var4 = 0; var4 < Statics.field3786; var4++) {
            Statics.field3784[var4] = var1.method2861();
        }
        for (int var5 = 0; var5 < Statics.field3786; var5++) {
            Statics.field3780[var5] = var1.method2861();
        }
        for (int var6 = 0; var6 < Statics.field3786; var6++) {
            Statics.field3788[var6] = var1.method2861();
        }
        var1.field2357 = arg0.length - 7 - Statics.field3786 * 8 - (var2 - 1) * 3;
        Statics.field3787 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3787[var7] = var1.method2994();
            if (Statics.field3787[var7] == 0) {
                Statics.field3787[var7] = 1;
            }
        }
        var1.field2357 = 0;
        for (int var8 = 0; var8 < Statics.field3786; var8++) {
            int var9 = Statics.field3780[var8];
            int var10 = Statics.field3788[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3785[var8] = var12;
            int var13 = var1.method2843();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3014();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3014();
                    }
                }
            }
        }
    }
}
