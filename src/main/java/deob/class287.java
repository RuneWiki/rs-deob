package deob;

@ObfuscatedName("kb")
public class class287 {

    public class287() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gq.n(Lis;III)[Lje;")
    public static class285[] method3544(class236 arg0, int arg1, int arg2) {
        return method1934(arg0, arg1, arg2) ? method4353() : null;
    }

    @ObfuscatedName("p.p(Lis;III)[Ljp;")
    public static class286[] method5(class236 arg0, int arg1, int arg2) {
        if (!method1934(arg0, arg1, arg2)) {
            return null;
        }
        class286[] var3 = new class286[Statics.field3793];
        for (int var4 = 0; var4 < Statics.field3793; var4++) {
            class286 var5 = var3[var4] = new class286();
            var5.field3784 = Statics.field1378;
            var5.field3786 = Statics.field3792;
            var5.field3782 = Statics.field1494[var4];
            var5.field3783 = Statics.field3791[var4];
            var5.field3779 = Statics.field3794[var4];
            var5.field3785 = Statics.field3294[var4];
            int var6 = var5.field3785 * var5.field3779;
            byte[] var7 = Statics.field450[var4];
            var5.field3788 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field3788[var8] = Statics.field2411[var7[var8] & 0xFF];
            }
        }
        method2401();
        return var3;
    }

    @ObfuscatedName("eo.i(Lis;III)Ljp;")
    public static class286 method2679(class236 arg0, int arg1, int arg2) {
        if (!method1934(arg0, arg1, arg2)) {
            return null;
        }
        class286 var3 = new class286();
        var3.field3784 = Statics.field1378;
        var3.field3786 = Statics.field3792;
        var3.field3782 = Statics.field1494[0];
        var3.field3783 = Statics.field3791[0];
        var3.field3779 = Statics.field3794[0];
        var3.field3785 = Statics.field3294[0];
        int var4 = var3.field3785 * var3.field3779;
        byte[] var5 = Statics.field450[0];
        var3.field3788 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3788[var6] = Statics.field2411[var5[var6] & 0xFF];
        }
        method2401();
        return var3;
    }

    @ObfuscatedName("ax.j(Lis;Ljava/lang/String;Ljava/lang/String;I)[Lje;")
    public static class285[] method531(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3846(arg1);
        int var4 = arg0.method3914(var3, arg2);
        return method3544(arg0, var3, var4);
    }

    @ObfuscatedName("et.f(Lis;Ljava/lang/String;Ljava/lang/String;I)Lje;")
    public static class285 method2706(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3846(arg1);
        int var4 = arg0.method3914(var3, arg2);
        class285 var5;
        if (method1934(arg0, var3, var4)) {
            var5 = method880();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("jm.m(Lis;Ljava/lang/String;Ljava/lang/String;I)[Ljp;")
    public static class286[] method4619(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3846(arg1);
        int var4 = arg0.method3914(var3, arg2);
        return method5(arg0, var3, var4);
    }

    @ObfuscatedName("hq.c(Lis;Lis;Ljava/lang/String;Ljava/lang/String;I)Ljz;")
    public static class264 method3821(class236 arg0, class236 arg1, String arg2, String arg3) {
        int var4 = arg0.method3846(arg2);
        int var5 = arg0.method3914(var4, arg3);
        class264 var6;
        if (method1934(arg0, var4, var5)) {
            byte[] var7 = arg1.method3880(var4, var5);
            class264 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class264 var9 = new class264(var7, Statics.field1494, Statics.field3791, Statics.field3794, Statics.field3294, Statics.field2411, Statics.field450);
                method2401();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("ic.z(I)[Lje;")
    public static class285[] method4353() {
        class285[] var0 = new class285[Statics.field3793];
        for (int var1 = 0; var1 < Statics.field3793; var1++) {
            class285 var2 = var0[var1] = new class285();
            var2.field3777 = Statics.field1378;
            var2.field3778 = Statics.field3792;
            var2.field3771 = Statics.field1494[var1];
            var2.field3774 = Statics.field3791[var1];
            var2.field3773 = Statics.field3794[var1];
            var2.field3775 = Statics.field3294[var1];
            var2.field3772 = Statics.field2411;
            var2.field3776 = Statics.field450[var1];
        }
        method2401();
        return var0;
    }

    @ObfuscatedName("bn.h(I)Lje;")
    public static class285 method880() {
        class285 var0 = new class285();
        var0.field3777 = Statics.field1378;
        var0.field3778 = Statics.field3792;
        var0.field3771 = Statics.field1494[0];
        var0.field3774 = Statics.field3791[0];
        var0.field3773 = Statics.field3794[0];
        var0.field3775 = Statics.field3294[0];
        var0.field3772 = Statics.field2411;
        var0.field3776 = Statics.field450[0];
        method2401();
        return var0;
    }

    @ObfuscatedName("dk.g(Lis;III)Z")
    public static boolean method1934(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3880(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2678(var3);
            return true;
        }
    }

    @ObfuscatedName("iu.e(Lis;IB)Z")
    public static boolean method4139(class236 arg0, int arg1) {
        byte[] var2 = arg0.method3836(arg1);
        if (var2 == null) {
            return false;
        } else {
            method2678(var2);
            return true;
        }
    }

    @ObfuscatedName("ef.o([BI)V")
    public static void method2678(byte[] arg0) {
        class174 var1 = new class174(arg0);
        var1.field2400 = arg0.length - 2;
        Statics.field3793 = var1.method3065();
        Statics.field1494 = new int[Statics.field3793];
        Statics.field3791 = new int[Statics.field3793];
        Statics.field3794 = new int[Statics.field3793];
        Statics.field3294 = new int[Statics.field3793];
        Statics.field450 = new byte[Statics.field3793][];
        var1.field2400 = arg0.length - 7 - Statics.field3793 * 8;
        Statics.field1378 = var1.method3065();
        Statics.field3792 = var1.method3065();
        int var2 = (var1.method2925() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3793; var3++) {
            Statics.field1494[var3] = var1.method3065();
        }
        for (int var4 = 0; var4 < Statics.field3793; var4++) {
            Statics.field3791[var4] = var1.method3065();
        }
        for (int var5 = 0; var5 < Statics.field3793; var5++) {
            Statics.field3794[var5] = var1.method3065();
        }
        for (int var6 = 0; var6 < Statics.field3793; var6++) {
            Statics.field3294[var6] = var1.method3065();
        }
        var1.field2400 = arg0.length - 7 - Statics.field3793 * 8 - (var2 - 1) * 3;
        Statics.field2411 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2411[var7] = var1.method2910();
            if (Statics.field2411[var7] == 0) {
                Statics.field2411[var7] = 1;
            }
        }
        var1.field2400 = 0;
        for (int var8 = 0; var8 < Statics.field3793; var8++) {
            int var9 = Statics.field3794[var8];
            int var10 = Statics.field3294[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field450[var8] = var12;
            int var13 = var1.method2925();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2922();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2922();
                    }
                }
            }
        }
    }

    @ObfuscatedName("eq.x(I)V")
    public static void method2401() {
        Statics.field1494 = null;
        Statics.field3791 = null;
        Statics.field3794 = null;
        Statics.field3294 = null;
        Statics.field2411 = null;
        Statics.field450 = (byte[][]) null;
    }
}
