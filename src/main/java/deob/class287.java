package deob;

@ObfuscatedName("kf")
public class class287 {

    public class287() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ci.a(Lif;IIB)Ljf;")
    public static class285 method1587(class236 arg0, int arg1, int arg2) {
        if (!method3873(arg0, arg1, arg2)) {
            return null;
        }
        class285 var3 = new class285();
        var3.field3773 = Statics.field3794;
        var3.field3777 = Statics.field3793;
        var3.field3779 = Statics.field3796[0];
        var3.field3778 = Statics.field440[0];
        var3.field3775 = Statics.field3798[0];
        var3.field3776 = Statics.field1406[0];
        var3.field3774 = Statics.field3797;
        var3.field3780 = Statics.field2415[0];
        method131();
        return var3;
    }

    @ObfuscatedName("ae.j(Lif;III)Ljt;")
    public static class286 method208(class236 arg0, int arg1, int arg2) {
        if (!method3873(arg0, arg1, arg2)) {
            return null;
        }
        class286 var3 = new class286();
        var3.field3786 = Statics.field3794;
        var3.field3784 = Statics.field3793;
        var3.field3787 = Statics.field3796[0];
        var3.field3781 = Statics.field440[0];
        var3.field3782 = Statics.field3798[0];
        var3.field3783 = Statics.field1406[0];
        int var4 = var3.field3783 * var3.field3782;
        byte[] var5 = Statics.field2415[0];
        var3.field3792 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3792[var6] = Statics.field3797[var5[var6] & 0xFF];
        }
        method131();
        return var3;
    }

    @ObfuscatedName("jh.n(Lif;Ljava/lang/String;Ljava/lang/String;I)[Ljf;")
    public static class285[] method4435(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3777(arg1);
        int var4 = arg0.method3827(var3, arg2);
        class285[] var5;
        if (method3873(arg0, var3, var4)) {
            var5 = method3601();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fg.r(Lif;Ljava/lang/String;Ljava/lang/String;B)Ljf;")
    public static class285 method3147(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3777(arg1);
        int var4 = arg0.method3827(var3, arg2);
        return method1587(arg0, var3, var4);
    }

    @ObfuscatedName("ap.v(Lif;Ljava/lang/String;Ljava/lang/String;I)[Ljt;")
    public static class286[] method238(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3777(arg1);
        int var4 = arg0.method3827(var3, arg2);
        class286[] var5;
        if (method3873(arg0, var3, var4)) {
            var5 = method4010();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("he.e(I)[Ljf;")
    public static class285[] method3601() {
        class285[] var0 = new class285[Statics.field3795];
        for (int var1 = 0; var1 < Statics.field3795; var1++) {
            class285 var2 = var0[var1] = new class285();
            var2.field3773 = Statics.field3794;
            var2.field3777 = Statics.field3793;
            var2.field3779 = Statics.field3796[var1];
            var2.field3778 = Statics.field440[var1];
            var2.field3775 = Statics.field3798[var1];
            var2.field3776 = Statics.field1406[var1];
            var2.field3774 = Statics.field3797;
            var2.field3780 = Statics.field2415[var1];
        }
        method131();
        return var0;
    }

    @ObfuscatedName("it.l(I)[Ljt;")
    public static class286[] method4010() {
        class286[] var0 = new class286[Statics.field3795];
        for (int var1 = 0; var1 < Statics.field3795; var1++) {
            class286 var2 = var0[var1] = new class286();
            var2.field3786 = Statics.field3794;
            var2.field3784 = Statics.field3793;
            var2.field3787 = Statics.field3796[var1];
            var2.field3781 = Statics.field440[var1];
            var2.field3782 = Statics.field3798[var1];
            var2.field3783 = Statics.field1406[var1];
            int var3 = var2.field3783 * var2.field3782;
            byte[] var4 = Statics.field2415[var1];
            var2.field3792 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3792[var5] = Statics.field3797[var4[var5] & 0xFF];
            }
        }
        method131();
        return var0;
    }

    @ObfuscatedName("ig.s(Lif;III)Z")
    public static boolean method3873(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3787(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method453(var3);
            return true;
        }
    }

    @ObfuscatedName("ag.w([BI)V")
    public static void method453(byte[] arg0) {
        class174 var1 = new class174(arg0);
        var1.field2394 = arg0.length - 2;
        Statics.field3795 = var1.method2873();
        Statics.field3796 = new int[Statics.field3795];
        Statics.field440 = new int[Statics.field3795];
        Statics.field3798 = new int[Statics.field3795];
        Statics.field1406 = new int[Statics.field3795];
        Statics.field2415 = new byte[Statics.field3795][];
        var1.field2394 = arg0.length - 7 - Statics.field3795 * 8;
        Statics.field3794 = var1.method2873();
        Statics.field3793 = var1.method2873();
        int var2 = (var1.method2871() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3795; var3++) {
            Statics.field3796[var3] = var1.method2873();
        }
        for (int var4 = 0; var4 < Statics.field3795; var4++) {
            Statics.field440[var4] = var1.method2873();
        }
        for (int var5 = 0; var5 < Statics.field3795; var5++) {
            Statics.field3798[var5] = var1.method2873();
        }
        for (int var6 = 0; var6 < Statics.field3795; var6++) {
            Statics.field1406[var6] = var1.method2873();
        }
        var1.field2394 = arg0.length - 7 - Statics.field3795 * 8 - (var2 - 1) * 3;
        Statics.field3797 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3797[var7] = var1.method2875();
            if (Statics.field3797[var7] == 0) {
                Statics.field3797[var7] = 1;
            }
        }
        var1.field2394 = 0;
        for (int var8 = 0; var8 < Statics.field3795; var8++) {
            int var9 = Statics.field3798[var8];
            int var10 = Statics.field1406[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2415[var8] = var12;
            int var13 = var1.method2871();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2872();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2872();
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.p(I)V")
    public static void method131() {
        Statics.field3796 = null;
        Statics.field440 = null;
        Statics.field3798 = null;
        Statics.field1406 = null;
        Statics.field3797 = null;
        Statics.field2415 = (byte[][]) null;
    }
}
