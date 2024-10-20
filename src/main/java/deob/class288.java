package deob;

@ObfuscatedName("kg")
public class class288 {

    public class288() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.e(Lit;III)Lkn;")
    public static class287 method994(class237 arg0, int arg1, int arg2) {
        if (!method1744(arg0, arg1, arg2)) {
            return null;
        }
        class287 var3 = new class287();
        var3.field3764 = Statics.field3776;
        var3.field3774 = Statics.field3777;
        var3.field3767 = Statics.field3780[0];
        var3.field3768 = Statics.field3716[0];
        var3.field3765 = Statics.field3779[0];
        var3.field3770 = Statics.field3720[0];
        int var4 = var3.field3770 * var3.field3765;
        byte[] var5 = Statics.field3781[0];
        var3.field3771 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3771[var6] = Statics.field3778[var5[var6] & 0xFF];
        }
        method4431();
        return var3;
    }

    @ObfuscatedName("hi.n(Lit;Lit;III)Ljk;")
    public static class265 method3771(class237 arg0, class237 arg1, int arg2, int arg3) {
        if (!method1744(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3817(arg2, arg3);
        class265 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class265 var6 = new class265(var4, Statics.field3780, Statics.field3716, Statics.field3779, Statics.field3720, Statics.field3778, Statics.field3781);
            method4431();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("du.y(Lit;Ljava/lang/String;Ljava/lang/String;I)Ljp;")
    public static class286 method1974(class237 arg0, String arg1, String arg2) {
        int var3 = arg0.method3829(arg1);
        int var4 = arg0.method3834(var3, arg2);
        class286 var5;
        if (method1744(arg0, var3, var4)) {
            var5 = method74();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("hh.w(Lit;Ljava/lang/String;Ljava/lang/String;I)[Lkn;")
    public static class287[] method3780(class237 arg0, String arg1, String arg2) {
        int var3 = arg0.method3829(arg1);
        int var4 = arg0.method3834(var3, arg2);
        class287[] var5;
        if (method1744(arg0, var3, var4)) {
            var5 = method3627();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("jc.k(Lit;Ljava/lang/String;Ljava/lang/String;I)Lkn;")
    public static class287 method4572(class237 arg0, String arg1, String arg2) {
        int var3 = arg0.method3829(arg1);
        int var4 = arg0.method3834(var3, arg2);
        return method994(arg0, var3, var4);
    }

    @ObfuscatedName("hg.v(I)[Ljp;")
    public static class286[] method3716() {
        class286[] var0 = new class286[Statics.field2421];
        for (int var1 = 0; var1 < Statics.field2421; var1++) {
            class286 var2 = var0[var1] = new class286();
            var2.field3757 = Statics.field3776;
            var2.field3763 = Statics.field3777;
            var2.field3760 = Statics.field3780[var1];
            var2.field3762 = Statics.field3716[var1];
            var2.field3758 = Statics.field3779[var1];
            var2.field3759 = Statics.field3720[var1];
            var2.field3756 = Statics.field3778;
            var2.field3761 = Statics.field3781[var1];
        }
        method4431();
        return var0;
    }

    @ObfuscatedName("s.z(I)Ljp;")
    public static class286 method74() {
        class286 var0 = new class286();
        var0.field3757 = Statics.field3776;
        var0.field3763 = Statics.field3777;
        var0.field3760 = Statics.field3780[0];
        var0.field3762 = Statics.field3716[0];
        var0.field3758 = Statics.field3779[0];
        var0.field3759 = Statics.field3720[0];
        var0.field3756 = Statics.field3778;
        var0.field3761 = Statics.field3781[0];
        method4431();
        return var0;
    }

    @ObfuscatedName("hf.r(I)[Lkn;")
    public static class287[] method3627() {
        class287[] var0 = new class287[Statics.field2421];
        for (int var1 = 0; var1 < Statics.field2421; var1++) {
            class287 var2 = var0[var1] = new class287();
            var2.field3764 = Statics.field3776;
            var2.field3774 = Statics.field3777;
            var2.field3767 = Statics.field3780[var1];
            var2.field3768 = Statics.field3716[var1];
            var2.field3765 = Statics.field3779[var1];
            var2.field3770 = Statics.field3720[var1];
            int var3 = var2.field3770 * var2.field3765;
            byte[] var4 = Statics.field3781[var1];
            var2.field3771 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3771[var5] = Statics.field3778[var4[var5] & 0xFF];
            }
        }
        method4431();
        return var0;
    }

    @ObfuscatedName("cc.u(Lit;III)Z")
    public static boolean method1744(class237 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3817(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3761(var3);
            return true;
        }
    }

    @ObfuscatedName("jb.d(Lit;II)Z")
    public static boolean method4605(class237 arg0, int arg1) {
        byte[] var2 = arg0.method3823(arg1);
        if (var2 == null) {
            return false;
        } else {
            method3761(var2);
            return true;
        }
    }

    @ObfuscatedName("hg.o([BI)V")
    public static void method3761(byte[] arg0) {
        class175 var1 = new class175(arg0);
        var1.field2381 = arg0.length - 2;
        Statics.field2421 = var1.method3091();
        Statics.field3780 = new int[Statics.field2421];
        Statics.field3716 = new int[Statics.field2421];
        Statics.field3779 = new int[Statics.field2421];
        Statics.field3720 = new int[Statics.field2421];
        Statics.field3781 = new byte[Statics.field2421][];
        var1.field2381 = arg0.length - 7 - Statics.field2421 * 8;
        Statics.field3776 = var1.method3091();
        Statics.field3777 = var1.method3091();
        int var2 = (var1.method2928() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field2421; var3++) {
            Statics.field3780[var3] = var1.method3091();
        }
        for (int var4 = 0; var4 < Statics.field2421; var4++) {
            Statics.field3716[var4] = var1.method3091();
        }
        for (int var5 = 0; var5 < Statics.field2421; var5++) {
            Statics.field3779[var5] = var1.method3091();
        }
        for (int var6 = 0; var6 < Statics.field2421; var6++) {
            Statics.field3720[var6] = var1.method3091();
        }
        var1.field2381 = arg0.length - 7 - Statics.field2421 * 8 - (var2 - 1) * 3;
        Statics.field3778 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3778[var7] = var1.method2932();
            if (Statics.field3778[var7] == 0) {
                Statics.field3778[var7] = 1;
            }
        }
        var1.field2381 = 0;
        for (int var8 = 0; var8 < Statics.field2421; var8++) {
            int var9 = Statics.field3779[var8];
            int var10 = Statics.field3720[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3781[var8] = var12;
            int var13 = var1.method2928();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2998();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2998();
                    }
                }
            }
        }
    }

    @ObfuscatedName("jn.s(I)V")
    public static void method4431() {
        Statics.field3780 = null;
        Statics.field3716 = null;
        Statics.field3779 = null;
        Statics.field3720 = null;
        Statics.field3778 = null;
        Statics.field3781 = (byte[][]) null;
    }
}
