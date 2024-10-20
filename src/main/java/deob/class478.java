package deob;

@ObfuscatedName("rk")
public class class478 {

    public class478() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ed.a(Llg;IIB)[Lry;")
    public static class476[] method2938(class330 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5859(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method5914(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class476[] var5 = new class476[Statics.field4972];
        for (int var6 = 0; var6 < Statics.field4972; var6++) {
            class476 var7 = var5[var6] = new class476();
            var7.field4950 = Statics.field4971;
            var7.field4952 = Statics.field4975;
            var7.field4954 = Statics.field4825[var6];
            var7.field4955 = Statics.field3756[var6];
            var7.field4951 = Statics.field4823[var6];
            var7.field4953 = Statics.field4970[var6];
            var7.field4957 = Statics.field4974;
            var7.field4956 = Statics.field4831[var6];
        }
        Statics.field4825 = null;
        Statics.field3756 = null;
        Statics.field4823 = null;
        Statics.field4970 = null;
        Statics.field4974 = null;
        Statics.field4831 = (byte[][]) null;
        return var5;
    }

    @ObfuscatedName("og.f(Llg;IIB)[Lri;")
    public static class477[] method6892(class330 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5859(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method5914(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class477[] var5 = new class477[Statics.field4972];
        for (int var6 = 0; var6 < Statics.field4972; var6++) {
            class477 var7 = var5[var6] = new class477();
            var7.field4963 = Statics.field4971;
            var7.field4964 = Statics.field4975;
            var7.field4961 = Statics.field4825[var6];
            var7.field4969 = Statics.field3756[var6];
            var7.field4966 = Statics.field4823[var6];
            var7.field4958 = Statics.field4970[var6];
            int var8 = var7.field4966 * var7.field4958;
            byte[] var9 = Statics.field4831[var6];
            var7.field4959 = new int[var8];
            for (int var10 = 0; var10 < var8; var10++) {
                var7.field4959[var10] = Statics.field4974[var9[var10] & 0xFF];
            }
        }
        Statics.field4825 = null;
        Statics.field3756 = null;
        Statics.field4823 = null;
        Statics.field4970 = null;
        Statics.field4974 = null;
        Statics.field4831 = (byte[][]) null;
        return var5;
    }

    @ObfuscatedName("ny.c(Llg;III)Lri;")
    public static class477 method6659(class330 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5859(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method5914(var3);
            var4 = true;
        }
        return var4 ? method461() : null;
    }

    @ObfuscatedName("nn.x(Llg;Llg;IIB)Lnl;")
    public static class365 method6579(class330 arg0, class330 arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method5859(arg2, arg3);
        boolean var5;
        if (var4 == null) {
            var5 = false;
        } else {
            method5914(var4);
            var5 = true;
        }
        if (!var5) {
            return null;
        }
        byte[] var6 = arg1.method5859(arg2, arg3);
        class365 var7;
        if (var6 == null) {
            var7 = null;
        } else {
            class365 var8 = new class365(var6, Statics.field4825, Statics.field3756, Statics.field4823, Statics.field4970, Statics.field4974, Statics.field4831);
            Statics.field4825 = null;
            Statics.field3756 = null;
            Statics.field4823 = null;
            Statics.field4970 = null;
            Statics.field4974 = null;
            Statics.field4831 = (byte[][]) null;
            var7 = var8;
        }
        return var7;
    }

    @ObfuscatedName("op.h(Llg;Ljava/lang/String;Ljava/lang/String;I)[Lry;")
    public static class476[] method7099(class330 arg0, String arg1, String arg2) {
        int var3 = arg0.method5813(arg1);
        int var4 = arg0.method5854(var3, arg2);
        return method2938(arg0, var3, var4);
    }

    @ObfuscatedName("oc.j(Llg;Ljava/lang/String;Ljava/lang/String;I)Lry;")
    public static class476 method6750(class330 arg0, String arg1, String arg2) {
        int var3 = arg0.method5813(arg1);
        int var4 = arg0.method5854(var3, arg2);
        byte[] var5 = arg0.method5859(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method5914(var5);
            var6 = true;
        }
        class476 var7;
        if (var6) {
            class476 var8 = new class476();
            var8.field4950 = Statics.field4971;
            var8.field4952 = Statics.field4975;
            var8.field4954 = Statics.field4825[0];
            var8.field4955 = Statics.field3756[0];
            var8.field4951 = Statics.field4823[0];
            var8.field4953 = Statics.field4970[0];
            var8.field4957 = Statics.field4974;
            var8.field4956 = Statics.field4831[0];
            Statics.field4825 = null;
            Statics.field3756 = null;
            Statics.field4823 = null;
            Statics.field4970 = null;
            Statics.field4974 = null;
            Statics.field4831 = (byte[][]) null;
            var7 = var8;
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("ov.d(Llg;IB)Lry;")
    public static class476 method7001(class330 arg0, int arg1) {
        if (!method3083(arg0, arg1)) {
            return null;
        }
        class476 var2 = new class476();
        var2.field4950 = Statics.field4971;
        var2.field4952 = Statics.field4975;
        var2.field4954 = Statics.field4825[0];
        var2.field4955 = Statics.field3756[0];
        var2.field4951 = Statics.field4823[0];
        var2.field4953 = Statics.field4970[0];
        var2.field4957 = Statics.field4974;
        var2.field4956 = Statics.field4831[0];
        Statics.field4825 = null;
        Statics.field3756 = null;
        Statics.field4823 = null;
        Statics.field4970 = null;
        Statics.field4974 = null;
        Statics.field4831 = (byte[][]) null;
        return var2;
    }

    @ObfuscatedName("af.n(I)Lri;")
    public static class477 method461() {
        class477 var0 = new class477();
        var0.field4963 = Statics.field4971;
        var0.field4964 = Statics.field4975;
        var0.field4961 = Statics.field4825[0];
        var0.field4969 = Statics.field3756[0];
        var0.field4966 = Statics.field4823[0];
        var0.field4958 = Statics.field4970[0];
        int var1 = var0.field4966 * var0.field4958;
        byte[] var2 = Statics.field4831[0];
        var0.field4959 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field4959[var3] = Statics.field4974[var2[var3] & 0xFF];
        }
        Statics.field4825 = null;
        Statics.field3756 = null;
        Statics.field4823 = null;
        Statics.field4970 = null;
        Statics.field4974 = null;
        Statics.field4831 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("fo.r(Llg;II)Z")
    public static boolean method3083(class330 arg0, int arg1) {
        byte[] var2 = arg0.method5797(arg1);
        if (var2 == null) {
            return false;
        } else {
            method5914(var2);
            return true;
        }
    }

    @ObfuscatedName("le.l([BI)V")
    public static void method5914(byte[] arg0) {
        class464 var1 = new class464(arg0);
        var1.field4864 = arg0.length - 2;
        Statics.field4972 = var1.method7716();
        Statics.field4825 = new int[Statics.field4972];
        Statics.field3756 = new int[Statics.field4972];
        Statics.field4823 = new int[Statics.field4972];
        Statics.field4970 = new int[Statics.field4972];
        Statics.field4831 = new byte[Statics.field4972][];
        var1.field4864 = arg0.length - 7 - Statics.field4972 * 8;
        Statics.field4971 = var1.method7716();
        Statics.field4975 = var1.method7716();
        int var2 = (var1.method7735() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field4972; var3++) {
            Statics.field4825[var3] = var1.method7716();
        }
        for (int var4 = 0; var4 < Statics.field4972; var4++) {
            Statics.field3756[var4] = var1.method7716();
        }
        for (int var5 = 0; var5 < Statics.field4972; var5++) {
            Statics.field4823[var5] = var1.method7716();
        }
        for (int var6 = 0; var6 < Statics.field4972; var6++) {
            Statics.field4970[var6] = var1.method7716();
        }
        var1.field4864 = arg0.length - 7 - Statics.field4972 * 8 - (var2 - 1) * 3;
        Statics.field4974 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field4974[var7] = var1.method7906();
            if (Statics.field4974[var7] == 0) {
                Statics.field4974[var7] = 1;
            }
        }
        var1.field4864 = 0;
        for (int var8 = 0; var8 < Statics.field4972; var8++) {
            int var9 = Statics.field4823[var8];
            int var10 = Statics.field4970[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field4831[var8] = var12;
            int var13 = var1.method7735();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method7881();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method7881();
                    }
                }
            }
        }
    }
}
