package deob;

@ObfuscatedName("kn")
public class class287 {

    public class287() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cs.d(Lim;IIB)[Ljw;")
    public static class285[] method1563(class236 arg0, int arg1, int arg2) {
        if (!method2654(arg0, arg1, arg2)) {
            return null;
        }
        class285[] var3 = new class285[Statics.field3782];
        for (int var4 = 0; var4 < Statics.field3782; var4++) {
            class285 var5 = var3[var4] = new class285();
            var5.field3765 = Statics.field3780;
            var5.field3759 = Statics.field3781;
            var5.field3762 = Statics.field3667[var4];
            var5.field3763 = Statics.field3778[var4];
            var5.field3760 = Statics.field3779[var4];
            var5.field3758 = Statics.field3783[var4];
            var5.field3764 = Statics.field3784;
            var5.field3761 = Statics.field2391[var4];
        }
        method3738();
        return var3;
    }

    @ObfuscatedName("ar.q(Lim;III)Ljw;")
    public static class285 method236(class236 arg0, int arg1, int arg2) {
        if (!method2654(arg0, arg1, arg2)) {
            return null;
        }
        class285 var3 = new class285();
        var3.field3765 = Statics.field3780;
        var3.field3759 = Statics.field3781;
        var3.field3762 = Statics.field3667[0];
        var3.field3763 = Statics.field3778[0];
        var3.field3760 = Statics.field3779[0];
        var3.field3758 = Statics.field3783[0];
        var3.field3764 = Statics.field3784;
        var3.field3761 = Statics.field2391[0];
        method3738();
        return var3;
    }

    @ObfuscatedName("p.x(Lim;III)Lji;")
    public static class286 method65(class236 arg0, int arg1, int arg2) {
        if (!method2654(arg0, arg1, arg2)) {
            return null;
        }
        class286 var3 = new class286();
        var3.field3771 = Statics.field3780;
        var3.field3775 = Statics.field3781;
        var3.field3769 = Statics.field3667[0];
        var3.field3770 = Statics.field3778[0];
        var3.field3766 = Statics.field3779[0];
        var3.field3768 = Statics.field3783[0];
        int var4 = var3.field3768 * var3.field3766;
        byte[] var5 = Statics.field2391[0];
        var3.field3767 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3767[var6] = Statics.field3784[var5[var6] & 0xFF];
        }
        method3738();
        return var3;
    }

    @ObfuscatedName("cm.y(Lim;Lim;III)Ljt;")
    public static class264 method1560(class236 arg0, class236 arg1, int arg2, int arg3) {
        if (!method2654(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3750(arg2, arg3);
        class264 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class264 var6 = new class264(var4, Statics.field3667, Statics.field3778, Statics.field3779, Statics.field3783, Statics.field3784, Statics.field2391);
            method3738();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("ha.e(Lim;Ljava/lang/String;Ljava/lang/String;B)[Ljw;")
    public static class285[] method3595(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3766(arg1);
        int var4 = arg0.method3767(var3, arg2);
        return method1563(arg0, var3, var4);
    }

    @ObfuscatedName("fp.f(Lim;Ljava/lang/String;Ljava/lang/String;I)Ljw;")
    public static class285 method2817(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3766(arg1);
        int var4 = arg0.method3767(var3, arg2);
        return method236(arg0, var3, var4);
    }

    @ObfuscatedName("ju.v(Lim;Ljava/lang/String;Ljava/lang/String;I)[Lji;")
    public static class286[] method4481(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3766(arg1);
        int var4 = arg0.method3767(var3, arg2);
        class286[] var5;
        if (method2654(arg0, var3, var4)) {
            class286[] var6 = new class286[Statics.field3782];
            for (int var7 = 0; var7 < Statics.field3782; var7++) {
                class286 var8 = var6[var7] = new class286();
                var8.field3771 = Statics.field3780;
                var8.field3775 = Statics.field3781;
                var8.field3769 = Statics.field3667[var7];
                var8.field3770 = Statics.field3778[var7];
                var8.field3766 = Statics.field3779[var7];
                var8.field3768 = Statics.field3783[var7];
                int var9 = var8.field3768 * var8.field3766;
                byte[] var10 = Statics.field2391[var7];
                var8.field3767 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field3767[var11] = Statics.field3784[var10[var11] & 0xFF];
                }
            }
            method3738();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("jl.t(Lim;Lim;Ljava/lang/String;Ljava/lang/String;B)Ljt;")
    public static class264 method4524(class236 arg0, class236 arg1, String arg2, String arg3) {
        int var4 = arg0.method3766(arg2);
        int var5 = arg0.method3767(var4, arg3);
        return method1560(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("ew.i(Lim;III)Z")
    public static boolean method2654(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3750(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2730(var3);
            return true;
        }
    }

    @ObfuscatedName("jl.r(Lim;II)Z")
    public static boolean method4525(class236 arg0, int arg1) {
        byte[] var2 = arg0.method3756(arg1);
        if (var2 == null) {
            return false;
        } else {
            method2730(var2);
            return true;
        }
    }

    @ObfuscatedName("ff.g([BI)V")
    public static void method2730(byte[] arg0) {
        class174 var1 = new class174(arg0);
        var1.field2364 = arg0.length - 2;
        Statics.field3782 = var1.method2916();
        Statics.field3667 = new int[Statics.field3782];
        Statics.field3778 = new int[Statics.field3782];
        Statics.field3779 = new int[Statics.field3782];
        Statics.field3783 = new int[Statics.field3782];
        Statics.field2391 = new byte[Statics.field3782][];
        var1.field2364 = arg0.length - 7 - Statics.field3782 * 8;
        Statics.field3780 = var1.method2916();
        Statics.field3781 = var1.method2916();
        int var2 = (var1.method2921() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3782; var3++) {
            Statics.field3667[var3] = var1.method2916();
        }
        for (int var4 = 0; var4 < Statics.field3782; var4++) {
            Statics.field3778[var4] = var1.method2916();
        }
        for (int var5 = 0; var5 < Statics.field3782; var5++) {
            Statics.field3779[var5] = var1.method2916();
        }
        for (int var6 = 0; var6 < Statics.field3782; var6++) {
            Statics.field3783[var6] = var1.method2916();
        }
        var1.field2364 = arg0.length - 7 - Statics.field3782 * 8 - (var2 - 1) * 3;
        Statics.field3784 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3784[var7] = var1.method2918();
            if (Statics.field3784[var7] == 0) {
                Statics.field3784[var7] = 1;
            }
        }
        var1.field2364 = 0;
        for (int var8 = 0; var8 < Statics.field3782; var8++) {
            int var9 = Statics.field3779[var8];
            int var10 = Statics.field3783[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2391[var8] = var12;
            int var13 = var1.method2921();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3082();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3082();
                    }
                }
            }
        }
    }

    @ObfuscatedName("hk.s(I)V")
    public static void method3738() {
        Statics.field3667 = null;
        Statics.field3778 = null;
        Statics.field3779 = null;
        Statics.field3783 = null;
        Statics.field3784 = null;
        Statics.field2391 = (byte[][]) null;
    }
}
