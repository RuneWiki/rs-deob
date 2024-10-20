package deob;

@ObfuscatedName("kn")
public class class287 {

    public class287() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("au.i(Liy;IIB)Ljp;")
    public static class285 method677(class236 arg0, int arg1, int arg2) {
        return method3825(arg0, arg1, arg2) ? method1031() : null;
    }

    @ObfuscatedName("dj.h(Liy;IIS)Ljk;")
    public static class286 method2165(class236 arg0, int arg1, int arg2) {
        if (!method3825(arg0, arg1, arg2)) {
            return null;
        }
        class286 var3 = new class286();
        var3.field3772 = Statics.field3785;
        var3.field3778 = Statics.field3788;
        var3.field3775 = Statics.field3786[0];
        var3.field3782 = Statics.field3784[0];
        var3.field3777 = Statics.field3388[0];
        var3.field3774 = Statics.field3668[0];
        int var4 = var3.field3777 * var3.field3774;
        byte[] var5 = Statics.field844[0];
        var3.field3779 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3779[var6] = Statics.field1356[var5[var6] & 0xFF];
        }
        Statics.field3786 = null;
        Statics.field3784 = null;
        Statics.field3388 = null;
        Statics.field3668 = null;
        Statics.field1356 = null;
        Statics.field844 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("aq.u(Liy;Liy;III)Ljj;")
    public static class264 method234(class236 arg0, class236 arg1, int arg2, int arg3) {
        if (!method3825(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3836(arg2, arg3);
        class264 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class264 var6 = new class264(var4, Statics.field3786, Statics.field3784, Statics.field3388, Statics.field3668, Statics.field1356, Statics.field844);
            method1026();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("bb.q(Liy;Ljava/lang/String;Ljava/lang/String;I)[Ljp;")
    public static class285[] method735(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3851(arg1);
        int var4 = arg0.method3852(var3, arg2);
        class285[] var5;
        if (method3825(arg0, var3, var4)) {
            class285[] var6 = new class285[Statics.field3787];
            for (int var7 = 0; var7 < Statics.field3787; var7++) {
                class285 var8 = var6[var7] = new class285();
                var8.field3770 = Statics.field3785;
                var8.field3771 = Statics.field3788;
                var8.field3765 = Statics.field3786[var7];
                var8.field3768 = Statics.field3784[var7];
                var8.field3766 = Statics.field3388[var7];
                var8.field3764 = Statics.field3668[var7];
                var8.field3769 = Statics.field1356;
                var8.field3767 = Statics.field844[var7];
            }
            Statics.field3786 = null;
            Statics.field3784 = null;
            Statics.field3388 = null;
            Statics.field3668 = null;
            Statics.field1356 = null;
            Statics.field844 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("il.g(Liy;Ljava/lang/String;Ljava/lang/String;I)Ljp;")
    public static class285 method3985(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3851(arg1);
        int var4 = arg0.method3852(var3, arg2);
        return method677(arg0, var3, var4);
    }

    @ObfuscatedName("bg.v(Liy;Ljava/lang/String;Ljava/lang/String;I)[Ljk;")
    public static class286[] method992(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3851(arg1);
        int var4 = arg0.method3852(var3, arg2);
        class286[] var5;
        if (method3825(arg0, var3, var4)) {
            class286[] var6 = new class286[Statics.field3787];
            for (int var7 = 0; var7 < Statics.field3787; var7++) {
                class286 var8 = var6[var7] = new class286();
                var8.field3772 = Statics.field3785;
                var8.field3778 = Statics.field3788;
                var8.field3775 = Statics.field3786[var7];
                var8.field3782 = Statics.field3784[var7];
                var8.field3777 = Statics.field3388[var7];
                var8.field3774 = Statics.field3668[var7];
                int var9 = var8.field3777 * var8.field3774;
                byte[] var10 = Statics.field844[var7];
                var8.field3779 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field3779[var11] = Statics.field1356[var10[var11] & 0xFF];
                }
            }
            method1026();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("be.t(B)Ljp;")
    public static class285 method1031() {
        class285 var0 = new class285();
        var0.field3770 = Statics.field3785;
        var0.field3771 = Statics.field3788;
        var0.field3765 = Statics.field3786[0];
        var0.field3768 = Statics.field3784[0];
        var0.field3766 = Statics.field3388[0];
        var0.field3764 = Statics.field3668[0];
        var0.field3769 = Statics.field1356;
        var0.field3767 = Statics.field844[0];
        method1026();
        return var0;
    }

    @ObfuscatedName("hh.p(Liy;III)Z")
    public static boolean method3825(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3836(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method567(var3);
            return true;
        }
    }

    @ObfuscatedName("ap.l([BI)V")
    public static void method567(byte[] arg0) {
        class174 var1 = new class174(arg0);
        var1.field2384 = arg0.length - 2;
        Statics.field3787 = var1.method2932();
        Statics.field3786 = new int[Statics.field3787];
        Statics.field3784 = new int[Statics.field3787];
        Statics.field3388 = new int[Statics.field3787];
        Statics.field3668 = new int[Statics.field3787];
        Statics.field844 = new byte[Statics.field3787][];
        var1.field2384 = arg0.length - 7 - Statics.field3787 * 8;
        Statics.field3785 = var1.method2932();
        Statics.field3788 = var1.method2932();
        int var2 = (var1.method2930() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3787; var3++) {
            Statics.field3786[var3] = var1.method2932();
        }
        for (int var4 = 0; var4 < Statics.field3787; var4++) {
            Statics.field3784[var4] = var1.method2932();
        }
        for (int var5 = 0; var5 < Statics.field3787; var5++) {
            Statics.field3388[var5] = var1.method2932();
        }
        for (int var6 = 0; var6 < Statics.field3787; var6++) {
            Statics.field3668[var6] = var1.method2932();
        }
        var1.field2384 = arg0.length - 7 - Statics.field3787 * 8 - (var2 - 1) * 3;
        Statics.field1356 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1356[var7] = var1.method3033();
            if (Statics.field1356[var7] == 0) {
                Statics.field1356[var7] = 1;
            }
        }
        var1.field2384 = 0;
        for (int var8 = 0; var8 < Statics.field3787; var8++) {
            int var9 = Statics.field3388[var8];
            int var10 = Statics.field3668[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field844[var8] = var12;
            int var13 = var1.method2930();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2931();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2931();
                    }
                }
            }
        }
    }

    @ObfuscatedName("bs.a(I)V")
    public static void method1026() {
        Statics.field3786 = null;
        Statics.field3784 = null;
        Statics.field3388 = null;
        Statics.field3668 = null;
        Statics.field1356 = null;
        Statics.field844 = (byte[][]) null;
    }
}
