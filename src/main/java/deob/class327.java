package deob;

@ObfuscatedName("lm")
public class class327 {

    public class327() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kx.w(Lhp;III)Llx;")
    public static class325 method5047(class234 arg0, int arg1, int arg2) {
        if (!method4812(arg0, arg1, arg2)) {
            return null;
        }
        class325 var3 = new class325();
        var3.field3897 = Statics.field3914;
        var3.field3895 = Statics.field3911;
        var3.field3891 = Statics.field2524[0];
        var3.field3892 = Statics.field3916[0];
        var3.field3898 = Statics.field3915[0];
        var3.field3894 = Statics.field2549[0];
        var3.field3893 = Statics.field1896;
        var3.field3896 = Statics.field3913[0];
        method160();
        return var3;
    }

    @ObfuscatedName("et.e(Lhp;III)[Lly;")
    public static class326[] method2805(class234 arg0, int arg1, int arg2) {
        if (!method4812(arg0, arg1, arg2)) {
            return null;
        }
        class326[] var3 = new class326[Statics.field3912];
        for (int var4 = 0; var4 < Statics.field3912; var4++) {
            class326 var5 = var3[var4] = new class326();
            var5.field3899 = Statics.field3914;
            var5.field3905 = Statics.field3911;
            var5.field3902 = Statics.field2524[var4];
            var5.field3903 = Statics.field3916[var4];
            var5.field3900 = Statics.field3915[var4];
            var5.field3901 = Statics.field2549[var4];
            int var6 = var5.field3901 * var5.field3900;
            byte[] var7 = Statics.field3913[var4];
            var5.field3909 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field3909[var8] = Statics.field1896[var7[var8] & 0xFF];
            }
        }
        method160();
        return var3;
    }

    @ObfuscatedName("bl.p(Lhp;III)Lly;")
    public static class326 method1040(class234 arg0, int arg1, int arg2) {
        if (!method4812(arg0, arg1, arg2)) {
            return null;
        }
        class326 var3 = new class326();
        var3.field3899 = Statics.field3914;
        var3.field3905 = Statics.field3911;
        var3.field3902 = Statics.field2524[0];
        var3.field3903 = Statics.field3916[0];
        var3.field3900 = Statics.field3915[0];
        var3.field3901 = Statics.field2549[0];
        int var4 = var3.field3901 * var3.field3900;
        byte[] var5 = Statics.field3913[0];
        var3.field3909 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3909[var6] = Statics.field1896[var5[var6] & 0xFF];
        }
        method160();
        return var3;
    }

    @ObfuscatedName("es.k(Lhp;Lhp;III)Lke;")
    public static class296 method3013(class234 arg0, class234 arg1, int arg2, int arg3) {
        return method4812(arg0, arg2, arg3) ? Statics.method3012(arg1.method3775(arg2, arg3)) : null;
    }

    @ObfuscatedName("hy.l(Lhp;Ljava/lang/String;Ljava/lang/String;I)Llx;")
    public static class325 method3658(class234 arg0, String arg1, String arg2) {
        int var3 = arg0.method3791(arg1);
        int var4 = arg0.method3792(var3, arg2);
        return method5047(arg0, var3, var4);
    }

    @ObfuscatedName("kj.b(Lhp;Lhp;Ljava/lang/String;Ljava/lang/String;I)Lke;")
    public static class296 method4839(class234 arg0, class234 arg1, String arg2, String arg3) {
        int var4 = arg0.method3791(arg2);
        int var5 = arg0.method3792(var4, arg3);
        class296 var6;
        if (method4812(arg0, var4, var5)) {
            var6 = Statics.method3012(arg1.method3775(var4, var5));
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("js.c(Lhp;IIB)Z")
    public static boolean method4812(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3775(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3296(var3);
            return true;
        }
    }

    @ObfuscatedName("hh.u(Lhp;II)Z")
    public static boolean method3657(class234 arg0, int arg1) {
        byte[] var2 = arg0.method3839(arg1);
        if (var2 == null) {
            return false;
        } else {
            method3296(var2);
            return true;
        }
    }

    @ObfuscatedName("gw.x([BB)V")
    public static void method3296(byte[] arg0) {
        class301 var1 = new class301(arg0);
        var1.field3733 = arg0.length - 2;
        Statics.field3912 = var1.method5069();
        Statics.field2524 = new int[Statics.field3912];
        Statics.field3916 = new int[Statics.field3912];
        Statics.field3915 = new int[Statics.field3912];
        Statics.field2549 = new int[Statics.field3912];
        Statics.field3913 = new byte[Statics.field3912][];
        var1.field3733 = arg0.length - 7 - Statics.field3912 * 8;
        Statics.field3914 = var1.method5069();
        Statics.field3911 = var1.method5069();
        int var2 = (var1.method5077() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3912; var3++) {
            Statics.field2524[var3] = var1.method5069();
        }
        for (int var4 = 0; var4 < Statics.field3912; var4++) {
            Statics.field3916[var4] = var1.method5069();
        }
        for (int var5 = 0; var5 < Statics.field3912; var5++) {
            Statics.field3915[var5] = var1.method5069();
        }
        for (int var6 = 0; var6 < Statics.field3912; var6++) {
            Statics.field2549[var6] = var1.method5069();
        }
        var1.field3733 = arg0.length - 7 - Statics.field3912 * 8 - (var2 - 1) * 3;
        Statics.field1896 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1896[var7] = var1.method5140();
            if (Statics.field1896[var7] == 0) {
                Statics.field1896[var7] = 1;
            }
        }
        var1.field3733 = 0;
        for (int var8 = 0; var8 < Statics.field3912; var8++) {
            int var9 = Statics.field3915[var8];
            int var10 = Statics.field2549[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3913[var8] = var12;
            int var13 = var1.method5077();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method5068();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method5068();
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.r(I)V")
    public static void method160() {
        Statics.field2524 = null;
        Statics.field3916 = null;
        Statics.field3915 = null;
        Statics.field2549 = null;
        Statics.field1896 = null;
        Statics.field3913 = (byte[][]) null;
    }
}
