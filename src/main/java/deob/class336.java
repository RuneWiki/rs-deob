package deob;

@ObfuscatedName("lj")
public class class336 {

    public class336() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fb.z(Lic;IIB)[Lls;")
    public static class334[] method3244(class244 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3873(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3149(var3);
            var4 = true;
        }
        return var4 ? method5134() : null;
    }

    @ObfuscatedName("al.k(Lic;IIB)Lls;")
    public static class334 method537(class244 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3873(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3149(var3);
            var4 = true;
        }
        return var4 ? method4064() : null;
    }

    @ObfuscatedName("ij.s(Lic;III)[Llp;")
    public static class335[] method3856(class244 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3873(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3149(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class335[] var5 = new class335[Statics.field3915];
        for (int var6 = 0; var6 < Statics.field3915; var6++) {
            class335 var7 = var5[var6] = new class335();
            var7.field3911 = Statics.field3918;
            var7.field3904 = Statics.field3913;
            var7.field3902 = Statics.field3648[var6];
            var7.field3901 = Statics.field3916[var6];
            var7.field3905 = Statics.field3917[var6];
            var7.field3907 = Statics.field3920[var6];
            int var8 = var7.field3907 * var7.field3905;
            byte[] var9 = Statics.field1189[var6];
            var7.field3906 = new int[var8];
            for (int var10 = 0; var10 < var8; var10++) {
                var7.field3906[var10] = Statics.field2074[var9[var10] & 0xFF];
            }
        }
        Statics.field3648 = null;
        Statics.field3916 = null;
        Statics.field3917 = null;
        Statics.field3920 = null;
        Statics.field2074 = null;
        Statics.field1189 = (byte[][]) null;
        return var5;
    }

    @ObfuscatedName("jn.t(Lic;III)Llp;")
    public static class335 method4791(class244 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3873(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3149(var3);
            var4 = true;
        }
        return var4 ? Statics.method1973() : null;
    }

    @ObfuscatedName("gk.i(Lic;Lic;III)Lkr;")
    public static class305 method3394(class244 arg0, class244 arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method3873(arg2, arg3);
        boolean var5;
        if (var4 == null) {
            var5 = false;
        } else {
            method3149(var4);
            var5 = true;
        }
        if (!var5) {
            return null;
        }
        byte[] var6 = arg1.method3873(arg2, arg3);
        class305 var7;
        if (var6 == null) {
            var7 = null;
        } else {
            class305 var8 = new class305(var6, Statics.field3648, Statics.field3916, Statics.field3917, Statics.field3920, Statics.field2074, Statics.field1189);
            Statics.field3648 = null;
            Statics.field3916 = null;
            Statics.field3917 = null;
            Statics.field3920 = null;
            Statics.field2074 = null;
            Statics.field1189 = (byte[][]) null;
            var7 = var8;
        }
        return var7;
    }

    @ObfuscatedName("ia.o(Lic;Ljava/lang/String;Ljava/lang/String;I)Lls;")
    public static class334 method3851(class244 arg0, String arg1, String arg2) {
        int var3 = arg0.method3909(arg1);
        int var4 = arg0.method3927(var3, arg2);
        return method537(arg0, var3, var4);
    }

    @ObfuscatedName("lf.x(Lic;Lic;Ljava/lang/String;Ljava/lang/String;I)Lkr;")
    public static class305 method5521(class244 arg0, class244 arg1, String arg2, String arg3) {
        int var4 = arg0.method3909(arg2);
        int var5 = arg0.method3927(var4, arg3);
        return method3394(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("kq.w(B)[Lls;")
    public static class334[] method5134() {
        class334[] var0 = new class334[Statics.field3915];
        for (int var1 = 0; var1 < Statics.field3915; var1++) {
            class334 var2 = var0[var1] = new class334();
            var2.field3896 = Statics.field3918;
            var2.field3895 = Statics.field3913;
            var2.field3897 = Statics.field3648[var1];
            var2.field3900 = Statics.field3916[var1];
            var2.field3893 = Statics.field3917[var1];
            var2.field3898 = Statics.field3920[var1];
            var2.field3894 = Statics.field2074;
            var2.field3899 = Statics.field1189[var1];
        }
        Statics.field3648 = null;
        Statics.field3916 = null;
        Statics.field3917 = null;
        Statics.field3920 = null;
        Statics.field2074 = null;
        Statics.field1189 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("iq.g(I)Lls;")
    public static class334 method4064() {
        class334 var0 = new class334();
        var0.field3896 = Statics.field3918;
        var0.field3895 = Statics.field3913;
        var0.field3897 = Statics.field3648[0];
        var0.field3900 = Statics.field3916[0];
        var0.field3893 = Statics.field3917[0];
        var0.field3898 = Statics.field3920[0];
        var0.field3894 = Statics.field2074;
        var0.field3899 = Statics.field1189[0];
        Statics.field3648 = null;
        Statics.field3916 = null;
        Statics.field3917 = null;
        Statics.field3920 = null;
        Statics.field2074 = null;
        Statics.field1189 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("gp.n(Lic;IB)Z")
    public static boolean method3448(class244 arg0, int arg1) {
        byte[] var2 = arg0.method3879(arg1);
        if (var2 == null) {
            return false;
        } else {
            method3149(var2);
            return true;
        }
    }

    @ObfuscatedName("ew.d([BB)V")
    public static void method3149(byte[] arg0) {
        class310 var1 = new class310(arg0);
        var1.field3734 = arg0.length - 2;
        Statics.field3915 = var1.method5195();
        Statics.field3648 = new int[Statics.field3915];
        Statics.field3916 = new int[Statics.field3915];
        Statics.field3917 = new int[Statics.field3915];
        Statics.field3920 = new int[Statics.field3915];
        Statics.field1189 = new byte[Statics.field3915][];
        var1.field3734 = arg0.length - 7 - Statics.field3915 * 8;
        Statics.field3918 = var1.method5195();
        Statics.field3913 = var1.method5195();
        int var2 = (var1.method5193() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3915; var3++) {
            Statics.field3648[var3] = var1.method5195();
        }
        for (int var4 = 0; var4 < Statics.field3915; var4++) {
            Statics.field3916[var4] = var1.method5195();
        }
        for (int var5 = 0; var5 < Statics.field3915; var5++) {
            Statics.field3917[var5] = var1.method5195();
        }
        for (int var6 = 0; var6 < Statics.field3915; var6++) {
            Statics.field3920[var6] = var1.method5195();
        }
        var1.field3734 = arg0.length - 7 - Statics.field3915 * 8 - (var2 - 1) * 3;
        Statics.field2074 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2074[var7] = var1.method5197();
            if (Statics.field2074[var7] == 0) {
                Statics.field2074[var7] = 1;
            }
        }
        var1.field3734 = 0;
        for (int var8 = 0; var8 < Statics.field3915; var8++) {
            int var9 = Statics.field3917[var8];
            int var10 = Statics.field3920[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1189[var8] = var12;
            int var13 = var1.method5193();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method5194();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method5194();
                    }
                }
            }
        }
    }
}
