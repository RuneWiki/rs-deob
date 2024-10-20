package deob;

@ObfuscatedName("lg")
public class class336 {

    public class336() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ck.m(Lic;IIB)[Llh;")
    public static class334[] method1926(class244 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3891(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method31(var3);
            var4 = true;
        }
        return var4 ? method3871() : null;
    }

    @ObfuscatedName("kx.o(Lic;III)Llh;")
    public static class334 method4904(class244 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3891(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method31(var3);
            var4 = true;
        }
        return var4 ? method1966() : null;
    }

    @ObfuscatedName("hn.q(Lic;IIB)[Llz;")
    public static class335[] method3688(class244 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3891(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method31(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class335[] var5 = new class335[Statics.field3905];
        for (int var6 = 0; var6 < Statics.field3905; var6++) {
            class335 var7 = var5[var6] = new class335();
            var7.field3893 = Statics.field3906;
            var7.field3898 = Statics.field1995;
            var7.field3894 = Statics.field3907[var6];
            var7.field3899 = Statics.field1160[var6];
            var7.field3897 = Statics.field3908[var6];
            var7.field3895 = Statics.field3909[var6];
            int var8 = var7.field3897 * var7.field3895;
            byte[] var9 = Statics.field3445[var6];
            var7.field3896 = new int[var8];
            for (int var10 = 0; var10 < var8; var10++) {
                var7.field3896[var10] = Statics.field3910[var9[var10] & 0xFF];
            }
        }
        method129();
        return var5;
    }

    @ObfuscatedName("bn.j(Lic;III)Llz;")
    public static class335 method837(class244 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3891(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method31(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class335 var5 = new class335();
        var5.field3893 = Statics.field3906;
        var5.field3898 = Statics.field1995;
        var5.field3894 = Statics.field3907[0];
        var5.field3899 = Statics.field1160[0];
        var5.field3897 = Statics.field3908[0];
        var5.field3895 = Statics.field3909[0];
        int var6 = var5.field3897 * var5.field3895;
        byte[] var7 = Statics.field3445[0];
        var5.field3896 = new int[var6];
        for (int var8 = 0; var8 < var6; var8++) {
            var5.field3896[var8] = Statics.field3910[var7[var8] & 0xFF];
        }
        method129();
        return var5;
    }

    @ObfuscatedName("eg.p(Lic;Lic;III)Lko;")
    public static class305 method3098(class244 arg0, class244 arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method3891(arg2, arg3);
        boolean var5;
        if (var4 == null) {
            var5 = false;
        } else {
            method31(var4);
            var5 = true;
        }
        return var5 ? method1961(arg1.method3891(arg2, arg3)) : null;
    }

    @ObfuscatedName("bt.g(Lic;Ljava/lang/String;Ljava/lang/String;I)[Llh;")
    public static class334[] method1615(class244 arg0, String arg1, String arg2) {
        int var3 = arg0.method3909(arg1);
        int var4 = arg0.method3910(var3, arg2);
        return method1926(arg0, var3, var4);
    }

    @ObfuscatedName("lr.n(Lic;Ljava/lang/String;Ljava/lang/String;B)Llh;")
    public static class334 method5674(class244 arg0, String arg1, String arg2) {
        int var3 = arg0.method3909(arg1);
        int var4 = arg0.method3910(var3, arg2);
        return method4904(arg0, var3, var4);
    }

    @ObfuscatedName("hs.u(I)[Llh;")
    public static class334[] method3871() {
        class334[] var0 = new class334[Statics.field3905];
        for (int var1 = 0; var1 < Statics.field3905; var1++) {
            class334 var2 = var0[var1] = new class334();
            var2.field3891 = Statics.field3906;
            var2.field3892 = Statics.field1995;
            var2.field3889 = Statics.field3907[var1];
            var2.field3890 = Statics.field1160[var1];
            var2.field3886 = Statics.field3908[var1];
            var2.field3888 = Statics.field3909[var1];
            var2.field3885 = Statics.field3910;
            var2.field3887 = Statics.field3445[var1];
        }
        method129();
        return var0;
    }

    @ObfuscatedName("co.a(I)Llh;")
    public static class334 method1966() {
        class334 var0 = new class334();
        var0.field3891 = Statics.field3906;
        var0.field3892 = Statics.field1995;
        var0.field3889 = Statics.field3907[0];
        var0.field3890 = Statics.field1160[0];
        var0.field3886 = Statics.field3908[0];
        var0.field3888 = Statics.field3909[0];
        var0.field3885 = Statics.field3910;
        var0.field3887 = Statics.field3445[0];
        method129();
        return var0;
    }

    @ObfuscatedName("ci.z([BI)Lko;")
    public static class305 method1961(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class305 var1 = new class305(arg0, Statics.field3907, Statics.field1160, Statics.field3908, Statics.field3909, Statics.field3910, Statics.field3445);
            method129();
            return var1;
        }
    }

    @ObfuscatedName("j.w([BI)V")
    public static void method31(byte[] arg0) {
        class310 var1 = new class310(arg0);
        var1.field3734 = arg0.length - 2;
        Statics.field3905 = var1.method5283();
        Statics.field3907 = new int[Statics.field3905];
        Statics.field1160 = new int[Statics.field3905];
        Statics.field3908 = new int[Statics.field3905];
        Statics.field3909 = new int[Statics.field3905];
        Statics.field3445 = new byte[Statics.field3905][];
        var1.field3734 = arg0.length - 7 - Statics.field3905 * 8;
        Statics.field3906 = var1.method5283();
        Statics.field1995 = var1.method5283();
        int var2 = (var1.method5227() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3905; var3++) {
            Statics.field3907[var3] = var1.method5283();
        }
        for (int var4 = 0; var4 < Statics.field3905; var4++) {
            Statics.field1160[var4] = var1.method5283();
        }
        for (int var5 = 0; var5 < Statics.field3905; var5++) {
            Statics.field3908[var5] = var1.method5283();
        }
        for (int var6 = 0; var6 < Statics.field3905; var6++) {
            Statics.field3909[var6] = var1.method5283();
        }
        var1.field3734 = arg0.length - 7 - Statics.field3905 * 8 - (var2 - 1) * 3;
        Statics.field3910 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3910[var7] = var1.method5231();
            if (Statics.field3910[var7] == 0) {
                Statics.field3910[var7] = 1;
            }
        }
        var1.field3734 = 0;
        for (int var8 = 0; var8 < Statics.field3905; var8++) {
            int var9 = Statics.field3908[var8];
            int var10 = Statics.field3909[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3445[var8] = var12;
            int var13 = var1.method5227();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method5228();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method5228();
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.y(I)V")
    public static void method129() {
        Statics.field3907 = null;
        Statics.field1160 = null;
        Statics.field3908 = null;
        Statics.field3909 = null;
        Statics.field3910 = null;
        Statics.field3445 = (byte[][]) null;
    }
}
