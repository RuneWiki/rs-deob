package deob;

@ObfuscatedName("qt")
public class class458 {

    public class458() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("nm.s(Lls;III)[Lqe;")
    public static class456[] method6180(class316 arg0, int arg1, int arg2) {
        if (!method3595(arg0, arg1, arg2)) {
            return null;
        }
        class456[] var3 = new class456[Statics.field4808];
        for (int var4 = 0; var4 < Statics.field4808; var4++) {
            class456 var5 = var3[var4] = new class456();
            var5.field4793 = Statics.field4807;
            var5.field4794 = Statics.field4809;
            var5.field4791 = Statics.field4810[var4];
            var5.field4792 = Statics.field1029[var4];
            var5.field4790 = Statics.field4812[var4];
            var5.field4787 = Statics.field325[var4];
            var5.field4788 = Statics.field4811;
            var5.field4789 = Statics.field1982[var4];
        }
        Statics.field4810 = null;
        Statics.field1029 = null;
        Statics.field4812 = null;
        Statics.field325 = null;
        Statics.field4811 = null;
        Statics.field1982 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("fa.h(Lls;III)Lqe;")
    public static class456 method2929(class316 arg0, int arg1, int arg2) {
        if (!method3595(arg0, arg1, arg2)) {
            return null;
        }
        class456 var3 = new class456();
        var3.field4793 = Statics.field4807;
        var3.field4794 = Statics.field4809;
        var3.field4791 = Statics.field4810[0];
        var3.field4792 = Statics.field1029[0];
        var3.field4790 = Statics.field4812[0];
        var3.field4787 = Statics.field325[0];
        var3.field4788 = Statics.field4811;
        var3.field4789 = Statics.field1982[0];
        Statics.field4810 = null;
        Statics.field1029 = null;
        Statics.field4812 = null;
        Statics.field325 = null;
        Statics.field4811 = null;
        Statics.field1982 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("bj.w(Lls;III)[Lqn;")
    public static class457[] method1918(class316 arg0, int arg1, int arg2) {
        if (!method3595(arg0, arg1, arg2)) {
            return null;
        }
        class457[] var3 = new class457[Statics.field4808];
        for (int var4 = 0; var4 < Statics.field4808; var4++) {
            class457 var5 = var3[var4] = new class457();
            var5.field4800 = Statics.field4807;
            var5.field4801 = Statics.field4809;
            var5.field4795 = Statics.field4810[var4];
            var5.field4798 = Statics.field1029[var4];
            var5.field4799 = Statics.field4812[var4];
            var5.field4797 = Statics.field325[var4];
            int var6 = var5.field4799 * var5.field4797;
            byte[] var7 = Statics.field1982[var4];
            var5.field4803 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field4803[var8] = Statics.field4811[var7[var8] & 0xFF];
            }
        }
        Statics.field4810 = null;
        Statics.field1029 = null;
        Statics.field4812 = null;
        Statics.field325 = null;
        Statics.field4811 = null;
        Statics.field1982 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("ih.v(Lls;III)Lqn;")
    public static class457 method4559(class316 arg0, int arg1, int arg2) {
        if (!method3595(arg0, arg1, arg2)) {
            return null;
        }
        class457 var3 = new class457();
        var3.field4800 = Statics.field4807;
        var3.field4801 = Statics.field4809;
        var3.field4795 = Statics.field4810[0];
        var3.field4798 = Statics.field1029[0];
        var3.field4799 = Statics.field4812[0];
        var3.field4797 = Statics.field325[0];
        int var4 = var3.field4799 * var3.field4797;
        byte[] var5 = Statics.field1982[0];
        var3.field4803 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field4803[var6] = Statics.field4811[var5[var6] & 0xFF];
        }
        Statics.field4810 = null;
        Statics.field1029 = null;
        Statics.field4812 = null;
        Statics.field325 = null;
        Statics.field4811 = null;
        Statics.field1982 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("nh.c(Lls;Ljava/lang/String;Ljava/lang/String;I)[Lqe;")
    public static class456[] method6208(class316 arg0, String arg1, String arg2) {
        int var3 = arg0.method5269(arg1);
        int var4 = arg0.method5196(var3, arg2);
        return method6180(arg0, var3, var4);
    }

    @ObfuscatedName("ed.q(Lls;Ljava/lang/String;Ljava/lang/String;I)Lqe;")
    public static class456 method2786(class316 arg0, String arg1, String arg2) {
        int var3 = arg0.method5269(arg1);
        int var4 = arg0.method5196(var3, arg2);
        return method2929(arg0, var3, var4);
    }

    @ObfuscatedName("gs.i(Lls;Ljava/lang/String;Ljava/lang/String;S)[Lqn;")
    public static class457[] method3476(class316 arg0, String arg1, String arg2) {
        int var3 = arg0.method5269(arg1);
        int var4 = arg0.method5196(var3, arg2);
        return method1918(arg0, var3, var4);
    }

    @ObfuscatedName("b.k(Lls;Lls;Ljava/lang/String;Ljava/lang/String;I)Lmg;")
    public static class350 method284(class316 arg0, class316 arg1, String arg2, String arg3) {
        int var4 = arg0.method5269(arg2);
        int var5 = arg0.method5196(var4, arg3);
        class350 var6;
        if (method3595(arg0, var4, var5)) {
            byte[] var7 = arg1.method5179(var4, var5);
            class350 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class350 var9 = new class350(var7, Statics.field4810, Statics.field1029, Statics.field4812, Statics.field325, Statics.field4811, Statics.field1982);
                Statics.field4810 = null;
                Statics.field1029 = null;
                Statics.field4812 = null;
                Statics.field325 = null;
                Statics.field4811 = null;
                Statics.field1982 = (byte[][]) null;
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("mv.o(Lls;II)Lqe;")
    public static class456 method5910(class316 arg0, int arg1) {
        return method5133(arg0, arg1) ? method968() : null;
    }

    @ObfuscatedName("bb.n(I)Lqe;")
    public static class456 method968() {
        class456 var0 = new class456();
        var0.field4793 = Statics.field4807;
        var0.field4794 = Statics.field4809;
        var0.field4791 = Statics.field4810[0];
        var0.field4792 = Statics.field1029[0];
        var0.field4790 = Statics.field4812[0];
        var0.field4787 = Statics.field325[0];
        var0.field4788 = Statics.field4811;
        var0.field4789 = Statics.field1982[0];
        Statics.field4810 = null;
        Statics.field1029 = null;
        Statics.field4812 = null;
        Statics.field325 = null;
        Statics.field4811 = null;
        Statics.field1982 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("gg.d(Lls;IIB)Z")
    public static boolean method3595(class316 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5179(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2546(var3);
            return true;
        }
    }

    @ObfuscatedName("lk.a(Lls;II)Z")
    public static boolean method5133(class316 arg0, int arg1) {
        byte[] var2 = arg0.method5186(arg1);
        if (var2 == null) {
            return false;
        } else {
            method2546(var2);
            return true;
        }
    }

    @ObfuscatedName("dj.m([BB)V")
    public static void method2546(byte[] arg0) {
        class444 var1 = new class444(arg0);
        var1.field4708 = arg0.length - 2;
        Statics.field4808 = var1.method7120();
        Statics.field4810 = new int[Statics.field4808];
        Statics.field1029 = new int[Statics.field4808];
        Statics.field4812 = new int[Statics.field4808];
        Statics.field325 = new int[Statics.field4808];
        Statics.field1982 = new byte[Statics.field4808][];
        var1.field4708 = arg0.length - 7 - Statics.field4808 * 8;
        Statics.field4807 = var1.method7120();
        Statics.field4809 = var1.method7120();
        int var2 = (var1.method6929() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field4808; var3++) {
            Statics.field4810[var3] = var1.method7120();
        }
        for (int var4 = 0; var4 < Statics.field4808; var4++) {
            Statics.field1029[var4] = var1.method7120();
        }
        for (int var5 = 0; var5 < Statics.field4808; var5++) {
            Statics.field4812[var5] = var1.method7120();
        }
        for (int var6 = 0; var6 < Statics.field4808; var6++) {
            Statics.field325[var6] = var1.method7120();
        }
        var1.field4708 = arg0.length - 7 - Statics.field4808 * 8 - (var2 - 1) * 3;
        Statics.field4811 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field4811[var7] = var1.method7095();
            if (Statics.field4811[var7] == 0) {
                Statics.field4811[var7] = 1;
            }
        }
        var1.field4708 = 0;
        for (int var8 = 0; var8 < Statics.field4808; var8++) {
            int var9 = Statics.field4812[var8];
            int var10 = Statics.field325[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1982[var8] = var12;
            int var13 = var1.method6929();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method6930();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method6930();
                    }
                }
            }
        }
    }
}
