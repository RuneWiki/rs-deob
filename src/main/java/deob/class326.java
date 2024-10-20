package deob;

@ObfuscatedName("ld")
public class class326 {

    public class326() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fs.s(Lhz;IIB)Llq;")
    public static class324 method3221(class234 arg0, int arg1, int arg2) {
        if (!method1599(arg0, arg1, arg2)) {
            return null;
        }
        class324 var3 = new class324();
        var3.field3871 = Statics.field72;
        var3.field3872 = Statics.field3888;
        var3.field3869 = Statics.field3886[0];
        var3.field3870 = Statics.field3887[0];
        var3.field3867 = Statics.field3889[0];
        var3.field3868 = Statics.field3042[0];
        var3.field3865 = Statics.field3890;
        var3.field3866 = Statics.field283[0];
        method3139();
        return var3;
    }

    @ObfuscatedName("aj.j(Lhz;IIB)[Lls;")
    public static class325[] method480(class234 arg0, int arg1, int arg2) {
        return method1599(arg0, arg1, arg2) ? Statics.method774() : null;
    }

    @ObfuscatedName("ef.i(Lhz;III)Lls;")
    public static class325 method2824(class234 arg0, int arg1, int arg2) {
        if (!method1599(arg0, arg1, arg2)) {
            return null;
        }
        class325 var3 = new class325();
        var3.field3876 = Statics.field72;
        var3.field3873 = Statics.field3888;
        var3.field3879 = Statics.field3886[0];
        var3.field3877 = Statics.field3887[0];
        var3.field3878 = Statics.field3889[0];
        var3.field3875 = Statics.field3042[0];
        int var4 = var3.field3878 * var3.field3875;
        byte[] var5 = Statics.field283[0];
        var3.field3874 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3874[var6] = Statics.field3890[var5[var6] & 0xFF];
        }
        method3139();
        return var3;
    }

    @ObfuscatedName("fj.k(Lhz;Lhz;III)Lkb;")
    public static class295 method3212(class234 arg0, class234 arg1, int arg2, int arg3) {
        if (!method1599(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3790(arg2, arg3);
        class295 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class295 var6 = new class295(var4, Statics.field3886, Statics.field3887, Statics.field3889, Statics.field3042, Statics.field3890, Statics.field283);
            method3139();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("dl.u(Lhz;Ljava/lang/String;Ljava/lang/String;S)Llq;")
    public static class324 method2742(class234 arg0, String arg1, String arg2) {
        int var3 = arg0.method3775(arg1);
        int var4 = arg0.method3786(var3, arg2);
        return method3221(arg0, var3, var4);
    }

    @ObfuscatedName("az.n(Lhz;Ljava/lang/String;Ljava/lang/String;B)[Lls;")
    public static class325[] method477(class234 arg0, String arg1, String arg2) {
        int var3 = arg0.method3775(arg1);
        int var4 = arg0.method3786(var3, arg2);
        return method480(arg0, var3, var4);
    }

    @ObfuscatedName("dd.t(Lhz;Lhz;Ljava/lang/String;Ljava/lang/String;B)Lkb;")
    public static class295 method2215(class234 arg0, class234 arg1, String arg2, String arg3) {
        int var4 = arg0.method3775(arg2);
        int var5 = arg0.method3786(var4, arg3);
        return method3212(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("bl.x(Lhz;IIB)Z")
    public static boolean method1599(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3790(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1104(var3);
            return true;
        }
    }

    @ObfuscatedName("kq.d(Lhz;II)Z")
    public static boolean method4881(class234 arg0, int arg1) {
        byte[] var2 = arg0.method3831(arg1);
        if (var2 == null) {
            return false;
        } else {
            method1104(var2);
            return true;
        }
    }

    @ObfuscatedName("bd.f([BS)V")
    public static void method1104(byte[] arg0) {
        class300 var1 = new class300(arg0);
        var1.field3704 = arg0.length - 2;
        Statics.field3885 = var1.method5054();
        Statics.field3886 = new int[Statics.field3885];
        Statics.field3887 = new int[Statics.field3885];
        Statics.field3889 = new int[Statics.field3885];
        Statics.field3042 = new int[Statics.field3885];
        Statics.field283 = new byte[Statics.field3885][];
        var1.field3704 = arg0.length - 7 - Statics.field3885 * 8;
        Statics.field72 = var1.method5054();
        Statics.field3888 = var1.method5054();
        int var2 = (var1.method5179() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3885; var3++) {
            Statics.field3886[var3] = var1.method5054();
        }
        for (int var4 = 0; var4 < Statics.field3885; var4++) {
            Statics.field3887[var4] = var1.method5054();
        }
        for (int var5 = 0; var5 < Statics.field3885; var5++) {
            Statics.field3889[var5] = var1.method5054();
        }
        for (int var6 = 0; var6 < Statics.field3885; var6++) {
            Statics.field3042[var6] = var1.method5054();
        }
        var1.field3704 = arg0.length - 7 - Statics.field3885 * 8 - (var2 - 1) * 3;
        Statics.field3890 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3890[var7] = var1.method5169();
            if (Statics.field3890[var7] == 0) {
                Statics.field3890[var7] = 1;
            }
        }
        var1.field3704 = 0;
        for (int var8 = 0; var8 < Statics.field3885; var8++) {
            int var9 = Statics.field3889[var8];
            int var10 = Statics.field3042[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field283[var8] = var12;
            int var13 = var1.method5179();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method5034();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method5034();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ev.c(B)V")
    public static void method3139() {
        Statics.field3886 = null;
        Statics.field3887 = null;
        Statics.field3889 = null;
        Statics.field3042 = null;
        Statics.field3890 = null;
        Statics.field283 = (byte[][]) null;
    }
}
