package deob;

@ObfuscatedName("ke")
public class class287 {

    public class287() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.i(Liq;IIB)[Ljz;")
    public static class285[] method160(class236 arg0, int arg1, int arg2) {
        return method3742(arg0, arg1, arg2) ? method2689() : null;
    }

    @ObfuscatedName("j.w(Liq;IIS)[Ljk;")
    public static class286[] method39(class236 arg0, int arg1, int arg2) {
        return method3742(arg0, arg1, arg2) ? method2158() : null;
    }

    @ObfuscatedName("ig.a(Liq;IIB)Ljk;")
    public static class286 method4215(class236 arg0, int arg1, int arg2) {
        if (!method3742(arg0, arg1, arg2)) {
            return null;
        }
        class286 var3 = new class286();
        var3.field3790 = Statics.field3802;
        var3.field3793 = Statics.field3797;
        var3.field3785 = Statics.field3800[0];
        var3.field3789 = Statics.field3801[0];
        var3.field3786 = Statics.field240[0];
        var3.field3788 = Statics.field3147[0];
        int var4 = var3.field3788 * var3.field3786;
        byte[] var5 = Statics.field2610[0];
        var3.field3791 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3791[var6] = Statics.field3746[var5[var6] & 0xFF];
        }
        method105();
        return var3;
    }

    @ObfuscatedName("bj.t(Liq;Ljava/lang/String;Ljava/lang/String;I)[Ljz;")
    public static class285[] method1008(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3800(arg1);
        int var4 = arg0.method3785(var3, arg2);
        return method160(arg0, var3, var4);
    }

    @ObfuscatedName("fo.s(Liq;Ljava/lang/String;Ljava/lang/String;I)Ljz;")
    public static class285 method2863(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3800(arg1);
        int var4 = arg0.method3785(var3, arg2);
        class285 var5;
        if (method3742(arg0, var3, var4)) {
            var5 = method4492();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("a.r(Liq;Ljava/lang/String;Ljava/lang/String;I)[Ljk;")
    public static class286[] method9(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3800(arg1);
        int var4 = arg0.method3785(var3, arg2);
        return method39(arg0, var3, var4);
    }

    @ObfuscatedName("z.v(Liq;Ljava/lang/String;Ljava/lang/String;I)Ljk;")
    public static class286 method51(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3800(arg1);
        int var4 = arg0.method3785(var3, arg2);
        return method4215(arg0, var3, var4);
    }

    @ObfuscatedName("eg.y(I)[Ljz;")
    public static class285[] method2689() {
        class285[] var0 = new class285[Statics.field3799];
        for (int var1 = 0; var1 < Statics.field3799; var1++) {
            class285 var2 = var0[var1] = new class285();
            var2.field3783 = Statics.field3802;
            var2.field3777 = Statics.field3797;
            var2.field3780 = Statics.field3800[var1];
            var2.field3782 = Statics.field3801[var1];
            var2.field3779 = Statics.field240[var1];
            var2.field3784 = Statics.field3147[var1];
            var2.field3778 = Statics.field3746;
            var2.field3781 = Statics.field2610[var1];
        }
        method105();
        return var0;
    }

    @ObfuscatedName("jm.j(I)Ljz;")
    public static class285 method4492() {
        class285 var0 = new class285();
        var0.field3783 = Statics.field3802;
        var0.field3777 = Statics.field3797;
        var0.field3780 = Statics.field3800[0];
        var0.field3782 = Statics.field3801[0];
        var0.field3779 = Statics.field240[0];
        var0.field3784 = Statics.field3147[0];
        var0.field3778 = Statics.field3746;
        var0.field3781 = Statics.field2610[0];
        method105();
        return var0;
    }

    @ObfuscatedName("dp.k(I)[Ljk;")
    public static class286[] method2158() {
        class286[] var0 = new class286[Statics.field3799];
        for (int var1 = 0; var1 < Statics.field3799; var1++) {
            class286 var2 = var0[var1] = new class286();
            var2.field3790 = Statics.field3802;
            var2.field3793 = Statics.field3797;
            var2.field3785 = Statics.field3800[var1];
            var2.field3789 = Statics.field3801[var1];
            var2.field3786 = Statics.field240[var1];
            var2.field3788 = Statics.field3147[var1];
            int var3 = var2.field3788 * var2.field3786;
            byte[] var4 = Statics.field2610[var1];
            var2.field3791 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3791[var5] = Statics.field3746[var4[var5] & 0xFF];
            }
        }
        method105();
        return var0;
    }

    @ObfuscatedName("hq.e(Liq;III)Z")
    public static boolean method3742(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3768(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3996(var3);
            return true;
        }
    }

    @ObfuscatedName("ci.o(Liq;IS)Z")
    public static boolean method1629(class236 arg0, int arg1) {
        byte[] var2 = arg0.method3774(arg1);
        if (var2 == null) {
            return false;
        } else {
            method3996(var2);
            return true;
        }
    }

    @ObfuscatedName("ir.z([BI)V")
    public static void method3996(byte[] arg0) {
        class174 var1 = new class174(arg0);
        var1.field2399 = arg0.length - 2;
        Statics.field3799 = var1.method2882();
        Statics.field3800 = new int[Statics.field3799];
        Statics.field3801 = new int[Statics.field3799];
        Statics.field240 = new int[Statics.field3799];
        Statics.field3147 = new int[Statics.field3799];
        Statics.field2610 = new byte[Statics.field3799][];
        var1.field2399 = arg0.length - 7 - Statics.field3799 * 8;
        Statics.field3802 = var1.method2882();
        Statics.field3797 = var1.method2882();
        int var2 = (var1.method3061() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3799; var3++) {
            Statics.field3800[var3] = var1.method2882();
        }
        for (int var4 = 0; var4 < Statics.field3799; var4++) {
            Statics.field3801[var4] = var1.method2882();
        }
        for (int var5 = 0; var5 < Statics.field3799; var5++) {
            Statics.field240[var5] = var1.method2882();
        }
        for (int var6 = 0; var6 < Statics.field3799; var6++) {
            Statics.field3147[var6] = var1.method2882();
        }
        var1.field2399 = arg0.length - 7 - Statics.field3799 * 8 - (var2 - 1) * 3;
        Statics.field3746 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3746[var7] = var1.method2917();
            if (Statics.field3746[var7] == 0) {
                Statics.field3746[var7] = 1;
            }
        }
        var1.field2399 = 0;
        for (int var8 = 0; var8 < Statics.field3799; var8++) {
            int var9 = Statics.field240[var8];
            int var10 = Statics.field3147[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2610[var8] = var12;
            int var13 = var1.method3061();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2930();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2930();
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.l(I)V")
    public static void method105() {
        Statics.field3800 = null;
        Statics.field3801 = null;
        Statics.field240 = null;
        Statics.field3147 = null;
        Statics.field3746 = null;
        Statics.field2610 = (byte[][]) null;
    }
}
