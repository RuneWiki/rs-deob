package deob;

@ObfuscatedName("lo")
public class class326 {

    public class326() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kz.z(Lhp;IIB)[Llp;")
    public static class324[] method4937(class234 arg0, int arg1, int arg2) {
        if (!method2697(arg0, arg1, arg2)) {
            return null;
        }
        class324[] var3 = new class324[Statics.field3883];
        for (int var4 = 0; var4 < Statics.field3883; var4++) {
            class324 var5 = var3[var4] = new class324();
            var5.field3867 = Statics.field3882;
            var5.field3861 = Statics.field1871;
            var5.field3865 = Statics.field3885[var4];
            var5.field3866 = Statics.field2471[var4];
            var5.field3863 = Statics.field3884[var4];
            var5.field3864 = Statics.field4047[var4];
            var5.field3862 = Statics.field3881;
            var5.field3868 = Statics.field2320[var4];
        }
        Statics.field3885 = null;
        Statics.field2471 = null;
        Statics.field3884 = null;
        Statics.field4047 = null;
        Statics.field3881 = null;
        Statics.field2320 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("il.v(Lhp;III)Llf;")
    public static class325 method4283(class234 arg0, int arg1, int arg2) {
        return method2697(arg0, arg1, arg2) ? method5511() : null;
    }

    @ObfuscatedName("jo.u(Lhp;Lhp;III)Lkn;")
    public static class295 method4568(class234 arg0, class234 arg1, int arg2, int arg3) {
        return method2697(arg0, arg2, arg3) ? method737(arg1.method3726(arg2, arg3)) : null;
    }

    @ObfuscatedName("j.p(Lhp;Ljava/lang/String;Ljava/lang/String;I)Llp;")
    public static class324 method268(class234 arg0, String arg1, String arg2) {
        int var3 = arg0.method3765(arg1);
        int var4 = arg0.method3745(var3, arg2);
        class324 var5;
        if (method2697(arg0, var3, var4)) {
            class324 var6 = new class324();
            var6.field3867 = Statics.field3882;
            var6.field3861 = Statics.field1871;
            var6.field3865 = Statics.field3885[0];
            var6.field3866 = Statics.field2471[0];
            var6.field3863 = Statics.field3884[0];
            var6.field3864 = Statics.field4047[0];
            var6.field3862 = Statics.field3881;
            var6.field3868 = Statics.field2320[0];
            Statics.field3885 = null;
            Statics.field2471 = null;
            Statics.field3884 = null;
            Statics.field4047 = null;
            Statics.field3881 = null;
            Statics.field2320 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("as.q(I)[Llf;")
    public static class325[] method537() {
        class325[] var0 = new class325[Statics.field3883];
        for (int var1 = 0; var1 < Statics.field3883; var1++) {
            class325 var2 = var0[var1] = new class325();
            var2.field3876 = Statics.field3882;
            var2.field3874 = Statics.field1871;
            var2.field3872 = Statics.field3885[var1];
            var2.field3873 = Statics.field2471[var1];
            var2.field3870 = Statics.field3884[var1];
            var2.field3871 = Statics.field4047[var1];
            int var3 = var2.field3871 * var2.field3870;
            byte[] var4 = Statics.field2320[var1];
            var2.field3875 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3875[var5] = Statics.field3881[var4[var5] & 0xFF];
            }
        }
        Statics.field3885 = null;
        Statics.field2471 = null;
        Statics.field3884 = null;
        Statics.field4047 = null;
        Statics.field3881 = null;
        Statics.field2320 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("lu.m(I)Llf;")
    public static class325 method5511() {
        class325 var0 = new class325();
        var0.field3876 = Statics.field3882;
        var0.field3874 = Statics.field1871;
        var0.field3872 = Statics.field3885[0];
        var0.field3873 = Statics.field2471[0];
        var0.field3870 = Statics.field3884[0];
        var0.field3871 = Statics.field4047[0];
        int var1 = var0.field3871 * var0.field3870;
        byte[] var2 = Statics.field2320[0];
        var0.field3875 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3875[var3] = Statics.field3881[var2[var3] & 0xFF];
        }
        Statics.field3885 = null;
        Statics.field2471 = null;
        Statics.field3884 = null;
        Statics.field4047 = null;
        Statics.field3881 = null;
        Statics.field2320 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("au.y([BI)Lkn;")
    public static class295 method737(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class295 var1 = new class295(arg0, Statics.field3885, Statics.field2471, Statics.field3884, Statics.field4047, Statics.field3881, Statics.field2320);
        Statics.field3885 = null;
        Statics.field2471 = null;
        Statics.field3884 = null;
        Statics.field4047 = null;
        Statics.field3881 = null;
        Statics.field2320 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("dp.i(Lhp;IIS)Z")
    public static boolean method2697(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3726(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method999(var3);
            return true;
        }
    }

    @ObfuscatedName("bm.c([BB)V")
    public static void method999(byte[] arg0) {
        class300 var1 = new class300(arg0);
        var1.field3702 = arg0.length - 2;
        Statics.field3883 = var1.method4992();
        Statics.field3885 = new int[Statics.field3883];
        Statics.field2471 = new int[Statics.field3883];
        Statics.field3884 = new int[Statics.field3883];
        Statics.field4047 = new int[Statics.field3883];
        Statics.field2320 = new byte[Statics.field3883][];
        var1.field3702 = arg0.length - 7 - Statics.field3883 * 8;
        Statics.field3882 = var1.method4992();
        Statics.field1871 = var1.method4992();
        int var2 = (var1.method4990() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3883; var3++) {
            Statics.field3885[var3] = var1.method4992();
        }
        for (int var4 = 0; var4 < Statics.field3883; var4++) {
            Statics.field2471[var4] = var1.method4992();
        }
        for (int var5 = 0; var5 < Statics.field3883; var5++) {
            Statics.field3884[var5] = var1.method4992();
        }
        for (int var6 = 0; var6 < Statics.field3883; var6++) {
            Statics.field4047[var6] = var1.method4992();
        }
        var1.field3702 = arg0.length - 7 - Statics.field3883 * 8 - (var2 - 1) * 3;
        Statics.field3881 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3881[var7] = var1.method4994();
            if (Statics.field3881[var7] == 0) {
                Statics.field3881[var7] = 1;
            }
        }
        var1.field3702 = 0;
        for (int var8 = 0; var8 < Statics.field3883; var8++) {
            int var9 = Statics.field3884[var8];
            int var10 = Statics.field4047[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2320[var8] = var12;
            int var13 = var1.method4990();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method5002();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method5002();
                    }
                }
            }
        }
    }
}
