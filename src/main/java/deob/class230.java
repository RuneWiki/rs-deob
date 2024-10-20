package deob;

@ObfuscatedName("hw")
public class class230 {

    public class230() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.d(Lgd;IIB)Lhu;")
    public static class229 method204(class185 arg0, int arg1, int arg2) {
        if (!method3407(arg0, arg1, arg2)) {
            return null;
        }
        class229 var3 = new class229();
        var3.field3243 = Statics.field3256;
        var3.field3244 = Statics.field3252;
        var3.field3241 = Statics.field2878[0];
        var3.field3240 = Statics.field3253[0];
        var3.field3239 = Statics.field3255[0];
        var3.field3242 = Statics.field773[0];
        int var4 = var3.field3242 * var3.field3239;
        byte[] var5 = Statics.field3254[0];
        var3.field3238 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3238[var6] = Statics.field3250[var5[var6] & 0xFF];
        }
        Statics.field2878 = null;
        Statics.field3253 = null;
        Statics.field3255 = null;
        Statics.field773 = null;
        Statics.field3250 = null;
        Statics.field3254 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("ck.c(Lgd;Lgd;IIS)Lgo;")
    public static class208 method1483(class185 arg0, class185 arg1, int arg2, int arg3) {
        if (!method3407(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3129(arg2, arg3);
        class208 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class208 var6 = new class208(var4, Statics.field2878, Statics.field3253, Statics.field3255, Statics.field773, Statics.field3250, Statics.field3254);
            Statics.field2878 = null;
            Statics.field3253 = null;
            Statics.field3255 = null;
            Statics.field773 = null;
            Statics.field3250 = null;
            Statics.field3254 = (byte[][]) null;
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("hb.n(Lgd;Ljava/lang/String;Ljava/lang/String;I)[Lhd;")
    public static class227[] method3788(class185 arg0, String arg1, String arg2) {
        int var3 = arg0.method3088(arg1);
        int var4 = arg0.method3102(var3, arg2);
        class227[] var5;
        if (method3407(arg0, var3, var4)) {
            class227[] var6 = new class227[Statics.field3251];
            for (int var7 = 0; var7 < Statics.field3251; var7++) {
                class227 var8 = var6[var7] = new class227();
                var8.field3234 = Statics.field3256;
                var8.field3229 = Statics.field3252;
                var8.field3231 = Statics.field2878[var7];
                var8.field3232 = Statics.field3253[var7];
                var8.field3233 = Statics.field3255[var7];
                var8.field3230 = Statics.field773[var7];
                var8.field3227 = Statics.field3250;
                var8.field3228 = Statics.field3254[var7];
            }
            Statics.field2878 = null;
            Statics.field3253 = null;
            Statics.field3255 = null;
            Statics.field773 = null;
            Statics.field3250 = null;
            Statics.field3254 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fn.q(Lgd;Ljava/lang/String;Ljava/lang/String;I)Lhd;")
    public static class227 method3058(class185 arg0, String arg1, String arg2) {
        int var3 = arg0.method3088(arg1);
        int var4 = arg0.method3102(var3, arg2);
        class227 var5;
        if (method3407(arg0, var3, var4)) {
            class227 var6 = new class227();
            var6.field3234 = Statics.field3256;
            var6.field3229 = Statics.field3252;
            var6.field3231 = Statics.field2878[0];
            var6.field3232 = Statics.field3253[0];
            var6.field3233 = Statics.field3255[0];
            var6.field3230 = Statics.field773[0];
            var6.field3227 = Statics.field3250;
            var6.field3228 = Statics.field3254[0];
            Statics.field2878 = null;
            Statics.field3253 = null;
            Statics.field3255 = null;
            Statics.field773 = null;
            Statics.field3250 = null;
            Statics.field3254 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("gy.t(Lgd;Ljava/lang/String;Ljava/lang/String;B)[Lhu;")
    public static class229[] method3521(class185 arg0, String arg1, String arg2) {
        int var3 = arg0.method3088(arg1);
        int var4 = arg0.method3102(var3, arg2);
        class229[] var5;
        if (method3407(arg0, var3, var4)) {
            class229[] var6 = new class229[Statics.field3251];
            for (int var7 = 0; var7 < Statics.field3251; var7++) {
                class229 var8 = var6[var7] = new class229();
                var8.field3243 = Statics.field3256;
                var8.field3244 = Statics.field3252;
                var8.field3241 = Statics.field2878[var7];
                var8.field3240 = Statics.field3253[var7];
                var8.field3239 = Statics.field3255[var7];
                var8.field3242 = Statics.field773[var7];
                int var9 = var8.field3242 * var8.field3239;
                byte[] var10 = Statics.field3254[var7];
                var8.field3238 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field3238[var11] = Statics.field3250[var10[var11] & 0xFF];
                }
            }
            Statics.field2878 = null;
            Statics.field3253 = null;
            Statics.field3255 = null;
            Statics.field773 = null;
            Statics.field3250 = null;
            Statics.field3254 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("gc.p(Lgd;III)Z")
    public static boolean method3407(class185 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3129(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3055(var3);
            return true;
        }
    }

    @ObfuscatedName("fb.u([BB)V")
    public static void method3055(byte[] arg0) {
        class130 var1 = new class130(arg0);
        var1.field1956 = arg0.length - 2;
        Statics.field3251 = var1.method2232();
        Statics.field2878 = new int[Statics.field3251];
        Statics.field3253 = new int[Statics.field3251];
        Statics.field3255 = new int[Statics.field3251];
        Statics.field773 = new int[Statics.field3251];
        Statics.field3254 = new byte[Statics.field3251][];
        var1.field1956 = arg0.length - 7 - Statics.field3251 * 8;
        Statics.field3256 = var1.method2232();
        Statics.field3252 = var1.method2232();
        int var2 = (var1.method2379() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3251; var3++) {
            Statics.field2878[var3] = var1.method2232();
        }
        for (int var4 = 0; var4 < Statics.field3251; var4++) {
            Statics.field3253[var4] = var1.method2232();
        }
        for (int var5 = 0; var5 < Statics.field3251; var5++) {
            Statics.field3255[var5] = var1.method2232();
        }
        for (int var6 = 0; var6 < Statics.field3251; var6++) {
            Statics.field773[var6] = var1.method2232();
        }
        var1.field1956 = arg0.length - 7 - Statics.field3251 * 8 - (var2 - 1) * 3;
        Statics.field3250 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3250[var7] = var1.method2233();
            if (Statics.field3250[var7] == 0) {
                Statics.field3250[var7] = 1;
            }
        }
        var1.field1956 = 0;
        for (int var8 = 0; var8 < Statics.field3251; var8++) {
            int var9 = Statics.field3255[var8];
            int var10 = Statics.field773[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3254[var8] = var12;
            int var13 = var1.method2379();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2230();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2230();
                    }
                }
            }
        }
    }
}
