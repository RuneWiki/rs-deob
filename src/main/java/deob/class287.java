package deob;

@ObfuscatedName("kl")
public class class287 {

    public class287() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bf.i(Liw;III)Ljs;")
    public static class286 method718(class236 arg0, int arg1, int arg2) {
        return method27(arg0, arg1, arg2) ? method2269() : null;
    }

    @ObfuscatedName("fd.c(Liw;Ljava/lang/String;Ljava/lang/String;S)[Ljd;")
    public static class285[] method2800(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3785(arg1);
        int var4 = arg0.method3786(var3, arg2);
        class285[] var5;
        if (method27(arg0, var3, var4)) {
            class285[] var6 = new class285[Statics.field3792];
            for (int var7 = 0; var7 < Statics.field3792; var7++) {
                class285 var8 = var6[var7] = new class285();
                var8.field3777 = Statics.field3791;
                var8.field3773 = Statics.field3793;
                var8.field3771 = Statics.field3794[var7];
                var8.field3776 = Statics.field3658[var7];
                var8.field3772 = Statics.field3206[var7];
                var8.field3774 = Statics.field780[var7];
                var8.field3778 = Statics.field34;
                var8.field3775 = Statics.field2308[var7];
            }
            method4100();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("cj.e(Liw;Ljava/lang/String;Ljava/lang/String;I)Ljd;")
    public static class285 method1534(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3785(arg1);
        int var4 = arg0.method3786(var3, arg2);
        class285 var5;
        if (method27(arg0, var3, var4)) {
            class285 var6 = new class285();
            var6.field3777 = Statics.field3791;
            var6.field3773 = Statics.field3793;
            var6.field3771 = Statics.field3794[0];
            var6.field3776 = Statics.field3658[0];
            var6.field3772 = Statics.field3206[0];
            var6.field3774 = Statics.field780[0];
            var6.field3778 = Statics.field34;
            var6.field3775 = Statics.field2308[0];
            method4100();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fh.v(Liw;Ljava/lang/String;Ljava/lang/String;I)[Ljs;")
    public static class286[] method2788(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3785(arg1);
        int var4 = arg0.method3786(var3, arg2);
        class286[] var5;
        if (method27(arg0, var3, var4)) {
            class286[] var6 = new class286[Statics.field3792];
            for (int var7 = 0; var7 < Statics.field3792; var7++) {
                class286 var8 = var6[var7] = new class286();
                var8.field3779 = Statics.field3791;
                var8.field3785 = Statics.field3793;
                var8.field3782 = Statics.field3794[var7];
                var8.field3781 = Statics.field3658[var7];
                var8.field3786 = Statics.field3206[var7];
                var8.field3789 = Statics.field780[var7];
                int var9 = var8.field3789 * var8.field3786;
                byte[] var10 = Statics.field2308[var7];
                var8.field3783 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field3783[var11] = Statics.field34[var10[var11] & 0xFF];
                }
            }
            method4100();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("iq.b(Liw;Ljava/lang/String;Ljava/lang/String;I)Ljs;")
    public static class286 method3977(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3785(arg1);
        int var4 = arg0.method3786(var3, arg2);
        return method718(arg0, var3, var4);
    }

    @ObfuscatedName("er.h(I)Ljs;")
    public static class286 method2269() {
        class286 var0 = new class286();
        var0.field3779 = Statics.field3791;
        var0.field3785 = Statics.field3793;
        var0.field3782 = Statics.field3794[0];
        var0.field3781 = Statics.field3658[0];
        var0.field3786 = Statics.field3206[0];
        var0.field3789 = Statics.field780[0];
        int var1 = var0.field3789 * var0.field3786;
        byte[] var2 = Statics.field2308[0];
        var0.field3783 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3783[var3] = Statics.field34[var2[var3] & 0xFF];
        }
        method4100();
        return var0;
    }

    @ObfuscatedName("iz.x([BI)Lji;")
    public static class264 method4173(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class264 var1 = new class264(arg0, Statics.field3794, Statics.field3658, Statics.field3206, Statics.field780, Statics.field34, Statics.field2308);
            method4100();
            return var1;
        }
    }

    @ObfuscatedName("x.f(Liw;III)Z")
    public static boolean method27(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3769(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method228(var3);
            return true;
        }
    }

    @ObfuscatedName("co.n(Liw;IB)Z")
    public static boolean method1558(class236 arg0, int arg1) {
        byte[] var2 = arg0.method3775(arg1);
        if (var2 == null) {
            return false;
        } else {
            method228(var2);
            return true;
        }
    }

    @ObfuscatedName("ah.a([BI)V")
    public static void method228(byte[] arg0) {
        class174 var1 = new class174(arg0);
        var1.field2407 = arg0.length - 2;
        Statics.field3792 = var1.method2872();
        Statics.field3794 = new int[Statics.field3792];
        Statics.field3658 = new int[Statics.field3792];
        Statics.field3206 = new int[Statics.field3792];
        Statics.field780 = new int[Statics.field3792];
        Statics.field2308 = new byte[Statics.field3792][];
        var1.field2407 = arg0.length - 7 - Statics.field3792 * 8;
        Statics.field3791 = var1.method2872();
        Statics.field3793 = var1.method2872();
        int var2 = (var1.method2870() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3792; var3++) {
            Statics.field3794[var3] = var1.method2872();
        }
        for (int var4 = 0; var4 < Statics.field3792; var4++) {
            Statics.field3658[var4] = var1.method2872();
        }
        for (int var5 = 0; var5 < Statics.field3792; var5++) {
            Statics.field3206[var5] = var1.method2872();
        }
        for (int var6 = 0; var6 < Statics.field3792; var6++) {
            Statics.field780[var6] = var1.method2872();
        }
        var1.field2407 = arg0.length - 7 - Statics.field3792 * 8 - (var2 - 1) * 3;
        Statics.field34 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field34[var7] = var1.method2874();
            if (Statics.field34[var7] == 0) {
                Statics.field34[var7] = 1;
            }
        }
        var1.field2407 = 0;
        for (int var8 = 0; var8 < Statics.field3792; var8++) {
            int var9 = Statics.field3206[var8];
            int var10 = Statics.field780[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2308[var8] = var12;
            int var13 = var1.method2870();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2938();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2938();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ij.o(B)V")
    public static void method4100() {
        Statics.field3794 = null;
        Statics.field3658 = null;
        Statics.field3206 = null;
        Statics.field780 = null;
        Statics.field34 = null;
        Statics.field2308 = (byte[][]) null;
    }
}
