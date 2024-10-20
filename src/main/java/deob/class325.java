package deob;

@ObfuscatedName("li")
public class class325 {

    public class325() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bt.f(Lik;III)[Lle;")
    public static class323[] method1631(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4289(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3573(var3);
            var4 = true;
        }
        return var4 ? method5128() : null;
    }

    @ObfuscatedName("gm.l(Lik;III)Lle;")
    public static class323 method3561(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4289(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3573(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class323 var5 = new class323();
        var5.field3869 = Statics.field3888;
        var5.field3870 = Statics.field3885;
        var5.field3867 = Statics.field3553[0];
        var5.field3863 = Statics.field3886[0];
        var5.field3865 = Statics.field3883[0];
        var5.field3868 = Statics.field3217[0];
        var5.field3864 = Statics.field44;
        var5.field3866 = Statics.field1205[0];
        Statics.field3553 = null;
        Statics.field3886 = null;
        Statics.field3883 = null;
        Statics.field3217 = null;
        Statics.field44 = null;
        Statics.field1205 = (byte[][]) null;
        return var5;
    }

    @ObfuscatedName("an.w(Lik;IIB)[Llp;")
    public static class324[] method900(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4289(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3573(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class324[] var5 = new class324[Statics.field3887];
        for (int var6 = 0; var6 < Statics.field3887; var6++) {
            class324 var7 = var5[var6] = new class324();
            var7.field3877 = Statics.field3888;
            var7.field3880 = Statics.field3885;
            var7.field3874 = Statics.field3553[var6];
            var7.field3875 = Statics.field3886[var6];
            var7.field3872 = Statics.field3883[var6];
            var7.field3871 = Statics.field3217[var6];
            int var8 = var7.field3872 * var7.field3871;
            byte[] var9 = Statics.field1205[var6];
            var7.field3873 = new int[var8];
            for (int var10 = 0; var10 < var8; var10++) {
                var7.field3873[var10] = Statics.field44[var9[var10] & 0xFF];
            }
        }
        Statics.field3553 = null;
        Statics.field3886 = null;
        Statics.field3883 = null;
        Statics.field3217 = null;
        Statics.field44 = null;
        Statics.field1205 = (byte[][]) null;
        return var5;
    }

    @ObfuscatedName("eo.s(Lik;IIB)Llp;")
    public static class324 method2923(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4289(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3573(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class324 var5 = new class324();
        var5.field3877 = Statics.field3888;
        var5.field3880 = Statics.field3885;
        var5.field3874 = Statics.field3553[0];
        var5.field3875 = Statics.field3886[0];
        var5.field3872 = Statics.field3883[0];
        var5.field3871 = Statics.field3217[0];
        int var6 = var5.field3872 * var5.field3871;
        byte[] var7 = Statics.field1205[0];
        var5.field3873 = new int[var6];
        for (int var8 = 0; var8 < var6; var8++) {
            var5.field3873[var8] = Statics.field44[var7[var8] & 0xFF];
        }
        Statics.field3553 = null;
        Statics.field3886 = null;
        Statics.field3883 = null;
        Statics.field3217 = null;
        Statics.field44 = null;
        Statics.field1205 = (byte[][]) null;
        return var5;
    }

    @ObfuscatedName("au.e(Lik;Lik;III)Lkn;")
    public static class301 method708(class250 arg0, class250 arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method4289(arg2, arg3);
        boolean var5;
        if (var4 == null) {
            var5 = false;
        } else {
            method3573(var4);
            var5 = true;
        }
        return var5 ? method2124(arg1.method4289(arg2, arg3)) : null;
    }

    @ObfuscatedName("es.c(Lik;Ljava/lang/String;Ljava/lang/String;B)Lle;")
    public static class323 method2940(class250 arg0, String arg1, String arg2) {
        int var3 = arg0.method4312(arg1);
        int var4 = arg0.method4291(var3, arg2);
        return method3561(arg0, var3, var4);
    }

    @ObfuscatedName("jk.p(Lik;II)Lle;")
    public static class323 method4624(class250 arg0, int arg1) {
        if (!method3027(arg0, arg1)) {
            return null;
        }
        class323 var2 = new class323();
        var2.field3869 = Statics.field3888;
        var2.field3870 = Statics.field3885;
        var2.field3867 = Statics.field3553[0];
        var2.field3863 = Statics.field3886[0];
        var2.field3865 = Statics.field3883[0];
        var2.field3868 = Statics.field3217[0];
        var2.field3864 = Statics.field44;
        var2.field3866 = Statics.field1205[0];
        Statics.field3553 = null;
        Statics.field3886 = null;
        Statics.field3883 = null;
        Statics.field3217 = null;
        Statics.field44 = null;
        Statics.field1205 = (byte[][]) null;
        return var2;
    }

    @ObfuscatedName("kc.r(I)[Lle;")
    public static class323[] method5128() {
        class323[] var0 = new class323[Statics.field3887];
        for (int var1 = 0; var1 < Statics.field3887; var1++) {
            class323 var2 = var0[var1] = new class323();
            var2.field3869 = Statics.field3888;
            var2.field3870 = Statics.field3885;
            var2.field3867 = Statics.field3553[var1];
            var2.field3863 = Statics.field3886[var1];
            var2.field3865 = Statics.field3883[var1];
            var2.field3868 = Statics.field3217[var1];
            var2.field3864 = Statics.field44;
            var2.field3866 = Statics.field1205[var1];
        }
        Statics.field3553 = null;
        Statics.field3886 = null;
        Statics.field3883 = null;
        Statics.field3217 = null;
        Statics.field44 = null;
        Statics.field1205 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ch.m([BI)Lkn;")
    public static class301 method2124(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class301 var1 = new class301(arg0, Statics.field3553, Statics.field3886, Statics.field3883, Statics.field3217, Statics.field44, Statics.field1205);
        Statics.field3553 = null;
        Statics.field3886 = null;
        Statics.field3883 = null;
        Statics.field3217 = null;
        Statics.field44 = null;
        Statics.field1205 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("em.d(Lik;II)Z")
    public static boolean method3027(class250 arg0, int arg1) {
        byte[] var2 = arg0.method4296(arg1);
        if (var2 == null) {
            return false;
        } else {
            method3573(var2);
            return true;
        }
    }

    @ObfuscatedName("gi.z([BI)V")
    public static void method3573(byte[] arg0) {
        class185 var1 = new class185(arg0);
        var1.field2414 = arg0.length - 2;
        Statics.field3887 = var1.method3346();
        Statics.field3553 = new int[Statics.field3887];
        Statics.field3886 = new int[Statics.field3887];
        Statics.field3883 = new int[Statics.field3887];
        Statics.field3217 = new int[Statics.field3887];
        Statics.field1205 = new byte[Statics.field3887][];
        var1.field2414 = arg0.length - 7 - Statics.field3887 * 8;
        Statics.field3888 = var1.method3346();
        Statics.field3885 = var1.method3346();
        int var2 = (var1.method3344() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3887; var3++) {
            Statics.field3553[var3] = var1.method3346();
        }
        for (int var4 = 0; var4 < Statics.field3887; var4++) {
            Statics.field3886[var4] = var1.method3346();
        }
        for (int var5 = 0; var5 < Statics.field3887; var5++) {
            Statics.field3883[var5] = var1.method3346();
        }
        for (int var6 = 0; var6 < Statics.field3887; var6++) {
            Statics.field3217[var6] = var1.method3346();
        }
        var1.field2414 = arg0.length - 7 - Statics.field3887 * 8 - (var2 - 1) * 3;
        Statics.field44 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field44[var7] = var1.method3348();
            if (Statics.field44[var7] == 0) {
                Statics.field44[var7] = 1;
            }
        }
        var1.field2414 = 0;
        for (int var8 = 0; var8 < Statics.field3887; var8++) {
            int var9 = Statics.field3883[var8];
            int var10 = Statics.field3217[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1205[var8] = var12;
            int var13 = var1.method3344();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3345();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3345();
                    }
                }
            }
        }
    }
}
