package deob;

@ObfuscatedName("lx")
public class class327 {

    public class327() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.c(Lii;IIB)Llt;")
    public static class326 method516(class235 arg0, int arg1, int arg2) {
        return Statics.method3820(arg0, arg1, arg2) ? method1571() : null;
    }

    @ObfuscatedName("et.t(Lii;Lii;III)Lko;")
    public static class296 method3063(class235 arg0, class235 arg1, int arg2, int arg3) {
        if (!Statics.method3820(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3845(arg2, arg3);
        class296 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class296 var6 = new class296(var4, Statics.field2519, Statics.field1119, Statics.field3881, Statics.field3884, Statics.field3882, Statics.field3886);
            method2096();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("et.o(Lii;Ljava/lang/String;Ljava/lang/String;I)[Lli;")
    public static class325[] method3064(class235 arg0, String arg1, String arg2) {
        int var3 = arg0.method3854(arg1);
        int var4 = arg0.method3855(var3, arg2);
        class325[] var5;
        if (Statics.method3820(arg0, var3, var4)) {
            class325[] var6 = new class325[Statics.field3885];
            for (int var7 = 0; var7 < Statics.field3885; var7++) {
                class325 var8 = var6[var7] = new class325();
                var8.field3867 = Statics.field4007;
                var8.field3868 = Statics.field3883;
                var8.field3865 = Statics.field2519[var7];
                var8.field3866 = Statics.field1119[var7];
                var8.field3863 = Statics.field3881[var7];
                var8.field3864 = Statics.field3884[var7];
                var8.field3862 = Statics.field3882;
                var8.field3861 = Statics.field3886[var7];
            }
            method2096();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ld.i(I)Lli;")
    public static class325 method5477() {
        class325 var0 = new class325();
        var0.field3867 = Statics.field4007;
        var0.field3868 = Statics.field3883;
        var0.field3865 = Statics.field2519[0];
        var0.field3866 = Statics.field1119[0];
        var0.field3863 = Statics.field3881[0];
        var0.field3864 = Statics.field3884[0];
        var0.field3862 = Statics.field3882;
        var0.field3861 = Statics.field3886[0];
        method2096();
        return var0;
    }

    @ObfuscatedName("ih.g(I)[Llt;")
    public static class326[] method4381() {
        class326[] var0 = new class326[Statics.field3885];
        for (int var1 = 0; var1 < Statics.field3885; var1++) {
            class326 var2 = var0[var1] = new class326();
            var2.field3874 = Statics.field4007;
            var2.field3876 = Statics.field3883;
            var2.field3871 = Statics.field2519[var1];
            var2.field3873 = Statics.field1119[var1];
            var2.field3870 = Statics.field3881[var1];
            var2.field3872 = Statics.field3884[var1];
            int var3 = var2.field3872 * var2.field3870;
            byte[] var4 = Statics.field3886[var1];
            var2.field3875 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3875[var5] = Statics.field3882[var4[var5] & 0xFF];
            }
        }
        method2096();
        return var0;
    }

    @ObfuscatedName("bs.d(I)Llt;")
    public static class326 method1571() {
        class326 var0 = new class326();
        var0.field3874 = Statics.field4007;
        var0.field3876 = Statics.field3883;
        var0.field3871 = Statics.field2519[0];
        var0.field3873 = Statics.field1119[0];
        var0.field3870 = Statics.field3881[0];
        var0.field3872 = Statics.field3884[0];
        int var1 = var0.field3872 * var0.field3870;
        byte[] var2 = Statics.field3886[0];
        var0.field3875 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3875[var3] = Statics.field3882[var2[var3] & 0xFF];
        }
        method2096();
        return var0;
    }

    @ObfuscatedName("hf.j([BI)V")
    public static void method3663(byte[] arg0) {
        class301 var1 = new class301(arg0);
        var1.field3707 = arg0.length - 2;
        Statics.field3885 = var1.method5124();
        Statics.field2519 = new int[Statics.field3885];
        Statics.field1119 = new int[Statics.field3885];
        Statics.field3881 = new int[Statics.field3885];
        Statics.field3884 = new int[Statics.field3885];
        Statics.field3886 = new byte[Statics.field3885][];
        var1.field3707 = arg0.length - 7 - Statics.field3885 * 8;
        Statics.field4007 = var1.method5124();
        Statics.field3883 = var1.method5124();
        int var2 = (var1.method5129() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3885; var3++) {
            Statics.field2519[var3] = var1.method5124();
        }
        for (int var4 = 0; var4 < Statics.field3885; var4++) {
            Statics.field1119[var4] = var1.method5124();
        }
        for (int var5 = 0; var5 < Statics.field3885; var5++) {
            Statics.field3881[var5] = var1.method5124();
        }
        for (int var6 = 0; var6 < Statics.field3885; var6++) {
            Statics.field3884[var6] = var1.method5124();
        }
        var1.field3707 = arg0.length - 7 - Statics.field3885 * 8 - (var2 - 1) * 3;
        Statics.field3882 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3882[var7] = var1.method5133();
            if (Statics.field3882[var7] == 0) {
                Statics.field3882[var7] = 1;
            }
        }
        var1.field3707 = 0;
        for (int var8 = 0; var8 < Statics.field3885; var8++) {
            int var9 = Statics.field3881[var8];
            int var10 = Statics.field3884[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3886[var8] = var12;
            int var13 = var1.method5129();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method5130();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method5130();
                    }
                }
            }
        }
    }

    @ObfuscatedName("cw.m(I)V")
    public static void method2096() {
        Statics.field2519 = null;
        Statics.field1119 = null;
        Statics.field3881 = null;
        Statics.field3884 = null;
        Statics.field3882 = null;
        Statics.field3886 = (byte[][]) null;
    }
}
