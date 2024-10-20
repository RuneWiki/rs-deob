package deob;

@ObfuscatedName("ld")
public class class325 {

    public class325() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iu.f(Lie;IIB)[Llk;")
    public static class323[] method4261(class250 arg0, int arg1, int arg2) {
        return method91(arg0, arg1, arg2) ? method2091() : null;
    }

    @ObfuscatedName("il.h(Lie;III)Llk;")
    public static class323 method4239(class250 arg0, int arg1, int arg2) {
        return method91(arg0, arg1, arg2) ? method3047() : null;
    }

    @ObfuscatedName("ej.e(Lie;III)[Lly;")
    public static class324[] method2896(class250 arg0, int arg1, int arg2) {
        return method91(arg0, arg1, arg2) ? method4547() : null;
    }

    @ObfuscatedName("q.b(Lie;IIB)Lly;")
    public static class324 method149(class250 arg0, int arg1, int arg2) {
        return method91(arg0, arg1, arg2) ? method5263() : null;
    }

    @ObfuscatedName("fv.l(Lie;Ljava/lang/String;Ljava/lang/String;I)[Llk;")
    public static class323[] method3236(class250 arg0, String arg1, String arg2) {
        int var3 = arg0.method4285(arg1);
        int var4 = arg0.method4286(var3, arg2);
        return method4261(arg0, var3, var4);
    }

    @ObfuscatedName("cn.w(Lie;Ljava/lang/String;Ljava/lang/String;B)Llk;")
    public static class323 method1735(class250 arg0, String arg1, String arg2) {
        int var3 = arg0.method4285(arg1);
        int var4 = arg0.method4286(var3, arg2);
        return method4239(arg0, var3, var4);
    }

    @ObfuscatedName("as.d(Lie;IB)Llk;")
    public static class323 method460(class250 arg0, int arg1) {
        byte[] var2 = arg0.method4333(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method4878(var2);
            var3 = true;
        }
        return var3 ? method3047() : null;
    }

    @ObfuscatedName("ce.n(I)[Llk;")
    public static class323[] method2091() {
        class323[] var0 = new class323[Statics.field3883];
        for (int var1 = 0; var1 < Statics.field3883; var1++) {
            class323 var2 = var0[var1] = new class323();
            var2.field3868 = Statics.field988;
            var2.field3867 = Statics.field3885;
            var2.field3869 = Statics.field2347[var1];
            var2.field3865 = Statics.field3882[var1];
            var2.field3864 = Statics.field3884[var1];
            var2.field3862 = Statics.field3886[var1];
            var2.field3863 = Statics.field358;
            var2.field3866 = Statics.field3632[var1];
        }
        method3246();
        return var0;
    }

    @ObfuscatedName("ea.s(I)Llk;")
    public static class323 method3047() {
        class323 var0 = new class323();
        var0.field3868 = Statics.field988;
        var0.field3867 = Statics.field3885;
        var0.field3869 = Statics.field2347[0];
        var0.field3865 = Statics.field3882[0];
        var0.field3864 = Statics.field3884[0];
        var0.field3862 = Statics.field3886[0];
        var0.field3863 = Statics.field358;
        var0.field3866 = Statics.field3632[0];
        method3246();
        return var0;
    }

    @ObfuscatedName("ja.g(B)[Lly;")
    public static class324[] method4547() {
        class324[] var0 = new class324[Statics.field3883];
        for (int var1 = 0; var1 < Statics.field3883; var1++) {
            class324 var2 = var0[var1] = new class324();
            var2.field3875 = Statics.field988;
            var2.field3876 = Statics.field3885;
            var2.field3872 = Statics.field2347[var1];
            var2.field3871 = Statics.field3882[var1];
            var2.field3870 = Statics.field3884[var1];
            var2.field3878 = Statics.field3886[var1];
            int var3 = var2.field3878 * var2.field3870;
            byte[] var4 = Statics.field3632[var1];
            var2.field3873 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3873[var5] = Statics.field358[var4[var5] & 0xFF];
            }
        }
        method3246();
        return var0;
    }

    @ObfuscatedName("kb.k(I)Lly;")
    public static class324 method5263() {
        class324 var0 = new class324();
        var0.field3875 = Statics.field988;
        var0.field3876 = Statics.field3885;
        var0.field3872 = Statics.field2347[0];
        var0.field3871 = Statics.field3882[0];
        var0.field3870 = Statics.field3884[0];
        var0.field3878 = Statics.field3886[0];
        int var1 = var0.field3878 * var0.field3870;
        byte[] var2 = Statics.field3632[0];
        var0.field3873 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3873[var3] = Statics.field358[var2[var3] & 0xFF];
        }
        method3246();
        return var0;
    }

    @ObfuscatedName("ag.m([BB)Lka;")
    public static class301 method518(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class301 var1 = new class301(arg0, Statics.field2347, Statics.field3882, Statics.field3884, Statics.field3886, Statics.field358, Statics.field3632);
            method3246();
            return var1;
        }
    }

    @ObfuscatedName("d.q(Lie;III)Z")
    public static boolean method91(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4267(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method4878(var3);
            return true;
        }
    }

    @ObfuscatedName("jc.x([BB)V")
    public static void method4878(byte[] arg0) {
        class185 var1 = new class185(arg0);
        var1.field2397 = arg0.length - 2;
        Statics.field3883 = var1.method3325();
        Statics.field2347 = new int[Statics.field3883];
        Statics.field3882 = new int[Statics.field3883];
        Statics.field3884 = new int[Statics.field3883];
        Statics.field3886 = new int[Statics.field3883];
        Statics.field3632 = new byte[Statics.field3883][];
        var1.field2397 = arg0.length - 7 - Statics.field3883 * 8;
        Statics.field988 = var1.method3325();
        Statics.field3885 = var1.method3325();
        int var2 = (var1.method3323() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3883; var3++) {
            Statics.field2347[var3] = var1.method3325();
        }
        for (int var4 = 0; var4 < Statics.field3883; var4++) {
            Statics.field3882[var4] = var1.method3325();
        }
        for (int var5 = 0; var5 < Statics.field3883; var5++) {
            Statics.field3884[var5] = var1.method3325();
        }
        for (int var6 = 0; var6 < Statics.field3883; var6++) {
            Statics.field3886[var6] = var1.method3325();
        }
        var1.field2397 = arg0.length - 7 - Statics.field3883 * 8 - (var2 - 1) * 3;
        Statics.field358 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field358[var7] = var1.method3327();
            if (Statics.field358[var7] == 0) {
                Statics.field358[var7] = 1;
            }
        }
        var1.field2397 = 0;
        for (int var8 = 0; var8 < Statics.field3883; var8++) {
            int var9 = Statics.field3884[var8];
            int var10 = Statics.field3886[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3632[var8] = var12;
            int var13 = var1.method3323();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3324();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3324();
                    }
                }
            }
        }
    }

    @ObfuscatedName("fm.u(S)V")
    public static void method3246() {
        Statics.field2347 = null;
        Statics.field3882 = null;
        Statics.field3884 = null;
        Statics.field3886 = null;
        Statics.field358 = null;
        Statics.field3632 = (byte[][]) null;
    }
}
