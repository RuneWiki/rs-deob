package deob;

@ObfuscatedName("kn")
public class class300 {

    public class300() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fl.w(Lib;III)Lks;")
    public static class299 method2809(class247 arg0, int arg1, int arg2) {
        return method4647(arg0, arg1, arg2) ? method961() : null;
    }

    @ObfuscatedName("cs.e(Lib;Lib;IIB)Ljm;")
    public static class275 method1527(class247 arg0, class247 arg1, int arg2, int arg3) {
        if (!method4647(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3897(arg2, arg3);
        class275 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class275 var6 = new class275(var4, Statics.field3868, Statics.field3866, Statics.field1388, Statics.field3728, Statics.field2026, Statics.field3815);
            method1523();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("fs.k(Lib;Ljava/lang/String;Ljava/lang/String;I)[Lkg;")
    public static class298[] method2744(class247 arg0, String arg1, String arg2) {
        int var3 = arg0.method3962(arg1);
        int var4 = arg0.method3913(var3, arg2);
        class298[] var5;
        if (method4647(arg0, var3, var4)) {
            class298[] var6 = new class298[Statics.field3867];
            for (int var7 = 0; var7 < Statics.field3867; var7++) {
                class298 var8 = var6[var7] = new class298();
                var8.field3851 = Statics.field3865;
                var8.field3852 = Statics.field3869;
                var8.field3845 = Statics.field3868[var7];
                var8.field3850 = Statics.field3866[var7];
                var8.field3847 = Statics.field1388[var7];
                var8.field3848 = Statics.field3728[var7];
                var8.field3846 = Statics.field2026;
                var8.field3849 = Statics.field3815[var7];
            }
            method1523();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("jy.u(Lib;Ljava/lang/String;Ljava/lang/String;I)Lkg;")
    public static class298 method4616(class247 arg0, String arg1, String arg2) {
        int var3 = arg0.method3962(arg1);
        int var4 = arg0.method3913(var3, arg2);
        class298 var5;
        if (method4647(arg0, var3, var4)) {
            var5 = method2700();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ar.z(Lib;Ljava/lang/String;Ljava/lang/String;I)[Lks;")
    public static class299[] method634(class247 arg0, String arg1, String arg2) {
        int var3 = arg0.method3962(arg1);
        int var4 = arg0.method3913(var3, arg2);
        return Statics.method2474(arg0, var3, var4);
    }

    @ObfuscatedName("jz.t(Lib;Ljava/lang/String;Ljava/lang/String;I)Lks;")
    public static class299 method4645(class247 arg0, String arg1, String arg2) {
        int var3 = arg0.method3962(arg1);
        int var4 = arg0.method3913(var3, arg2);
        return method2809(arg0, var3, var4);
    }

    @ObfuscatedName("jo.f(Lib;Lib;Ljava/lang/String;Ljava/lang/String;B)Ljm;")
    public static class275 method4620(class247 arg0, class247 arg1, String arg2, String arg3) {
        int var4 = arg0.method3962(arg2);
        int var5 = arg0.method3913(var4, arg3);
        return method1527(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("ew.g(B)Lkg;")
    public static class298 method2700() {
        class298 var0 = new class298();
        var0.field3851 = Statics.field3865;
        var0.field3852 = Statics.field3869;
        var0.field3845 = Statics.field3868[0];
        var0.field3850 = Statics.field3866[0];
        var0.field3847 = Statics.field1388[0];
        var0.field3848 = Statics.field3728[0];
        var0.field3846 = Statics.field2026;
        var0.field3849 = Statics.field3815[0];
        method1523();
        return var0;
    }

    @ObfuscatedName("bi.x(I)Lks;")
    public static class299 method961() {
        class299 var0 = new class299();
        var0.field3858 = Statics.field3865;
        var0.field3859 = Statics.field3869;
        var0.field3856 = Statics.field3868[0];
        var0.field3857 = Statics.field3866[0];
        var0.field3853 = Statics.field1388[0];
        var0.field3855 = Statics.field3728[0];
        int var1 = var0.field3855 * var0.field3853;
        byte[] var2 = Statics.field3815[0];
        var0.field3863 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3863[var3] = Statics.field2026[var2[var3] & 0xFF];
        }
        method1523();
        return var0;
    }

    @ObfuscatedName("kp.c(Lib;III)Z")
    public static boolean method4647(class247 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3897(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2143(var3);
            return true;
        }
    }

    @ObfuscatedName("dv.n([BI)V")
    public static void method2143(byte[] arg0) {
        class185 var1 = new class185(arg0);
        var1.field2509 = arg0.length - 2;
        Statics.field3867 = var1.method3194();
        Statics.field3868 = new int[Statics.field3867];
        Statics.field3866 = new int[Statics.field3867];
        Statics.field1388 = new int[Statics.field3867];
        Statics.field3728 = new int[Statics.field3867];
        Statics.field3815 = new byte[Statics.field3867][];
        var1.field2509 = arg0.length - 7 - Statics.field3867 * 8;
        Statics.field3865 = var1.method3194();
        Statics.field3869 = var1.method3194();
        int var2 = (var1.method2962() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3867; var3++) {
            Statics.field3868[var3] = var1.method3194();
        }
        for (int var4 = 0; var4 < Statics.field3867; var4++) {
            Statics.field3866[var4] = var1.method3194();
        }
        for (int var5 = 0; var5 < Statics.field3867; var5++) {
            Statics.field1388[var5] = var1.method3194();
        }
        for (int var6 = 0; var6 < Statics.field3867; var6++) {
            Statics.field3728[var6] = var1.method3194();
        }
        var1.field2509 = arg0.length - 7 - Statics.field3867 * 8 - (var2 - 1) * 3;
        Statics.field2026 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2026[var7] = var1.method2966();
            if (Statics.field2026[var7] == 0) {
                Statics.field2026[var7] = 1;
            }
        }
        var1.field2509 = 0;
        for (int var8 = 0; var8 < Statics.field3867; var8++) {
            int var9 = Statics.field1388[var8];
            int var10 = Statics.field3728[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3815[var8] = var12;
            int var13 = var1.method2962();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3015();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3015();
                    }
                }
            }
        }
    }

    @ObfuscatedName("cw.y(I)V")
    public static void method1523() {
        Statics.field3868 = null;
        Statics.field3866 = null;
        Statics.field1388 = null;
        Statics.field3728 = null;
        Statics.field2026 = null;
        Statics.field3815 = (byte[][]) null;
    }
}
