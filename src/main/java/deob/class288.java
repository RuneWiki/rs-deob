package deob;

@ObfuscatedName("kc")
public class class288 {

    public class288() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ed.j(Lia;III)[Ljr;")
    public static class286[] method2285(class237 arg0, int arg1, int arg2) {
        return method2163(arg0, arg1, arg2) ? Statics.method4304() : null;
    }

    @ObfuscatedName("jj.h(Lia;III)[Lkp;")
    public static class287[] method4567(class237 arg0, int arg1, int arg2) {
        if (!method2163(arg0, arg1, arg2)) {
            return null;
        }
        class287[] var3 = new class287[Statics.field3781];
        for (int var4 = 0; var4 < Statics.field3781; var4++) {
            class287 var5 = var3[var4] = new class287();
            var5.field3774 = Statics.field3780;
            var5.field3771 = Statics.field2436;
            var5.field3770 = Statics.field3782[var4];
            var5.field3772 = Statics.field2601[var4];
            var5.field3769 = Statics.field3648[var4];
            var5.field3773 = Statics.field3783[var4];
            int var6 = var5.field3773 * var5.field3769;
            byte[] var7 = Statics.field3700[var4];
            var5.field3768 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field3768[var8] = Statics.field3784[var7[var8] & 0xFF];
            }
        }
        Statics.field3782 = null;
        Statics.field2601 = null;
        Statics.field3648 = null;
        Statics.field3783 = null;
        Statics.field3784 = null;
        Statics.field3700 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("ic.f(Lia;III)Lkp;")
    public static class287 method4115(class237 arg0, int arg1, int arg2) {
        if (!method2163(arg0, arg1, arg2)) {
            return null;
        }
        class287 var3 = new class287();
        var3.field3774 = Statics.field3780;
        var3.field3771 = Statics.field2436;
        var3.field3770 = Statics.field3782[0];
        var3.field3772 = Statics.field2601[0];
        var3.field3769 = Statics.field3648[0];
        var3.field3773 = Statics.field3783[0];
        int var4 = var3.field3773 * var3.field3769;
        byte[] var5 = Statics.field3700[0];
        var3.field3768 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3768[var6] = Statics.field3784[var5[var6] & 0xFF];
        }
        Statics.field3782 = null;
        Statics.field2601 = null;
        Statics.field3648 = null;
        Statics.field3783 = null;
        Statics.field3784 = null;
        Statics.field3700 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("ir.p(Lia;Lia;III)Ljh;")
    public static class265 method3768(class237 arg0, class237 arg1, int arg2, int arg3) {
        if (!method2163(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3773(arg2, arg3);
        class265 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class265 var6 = new class265(var4, Statics.field3782, Statics.field2601, Statics.field3648, Statics.field3783, Statics.field3784, Statics.field3700);
            Statics.field3782 = null;
            Statics.field2601 = null;
            Statics.field3648 = null;
            Statics.field3783 = null;
            Statics.field3784 = null;
            Statics.field3700 = (byte[][]) null;
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("d.x(Lia;Ljava/lang/String;Ljava/lang/String;I)[Ljr;")
    public static class286[] method186(class237 arg0, String arg1, String arg2) {
        int var3 = arg0.method3789(arg1);
        int var4 = arg0.method3826(var3, arg2);
        return method2285(arg0, var3, var4);
    }

    @ObfuscatedName("cw.g(Lia;Ljava/lang/String;Ljava/lang/String;B)Ljr;")
    public static class286 method1621(class237 arg0, String arg1, String arg2) {
        int var3 = arg0.method3789(arg1);
        int var4 = arg0.method3826(var3, arg2);
        class286 var5;
        if (method2163(arg0, var3, var4)) {
            class286 var6 = new class286();
            var6.field3766 = Statics.field3780;
            var6.field3767 = Statics.field2436;
            var6.field3764 = Statics.field3782[0];
            var6.field3763 = Statics.field2601[0];
            var6.field3762 = Statics.field3648[0];
            var6.field3765 = Statics.field3783[0];
            var6.field3760 = Statics.field3784;
            var6.field3761 = Statics.field3700[0];
            Statics.field3782 = null;
            Statics.field2601 = null;
            Statics.field3648 = null;
            Statics.field3783 = null;
            Statics.field3784 = null;
            Statics.field3700 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ba.c(Lia;Ljava/lang/String;Ljava/lang/String;I)[Lkp;")
    public static class287[] method722(class237 arg0, String arg1, String arg2) {
        int var3 = arg0.method3789(arg1);
        int var4 = arg0.method3826(var3, arg2);
        return method4567(arg0, var3, var4);
    }

    @ObfuscatedName("il.l(Lia;Ljava/lang/String;Ljava/lang/String;I)Lkp;")
    public static class287 method3890(class237 arg0, String arg1, String arg2) {
        int var3 = arg0.method3789(arg1);
        int var4 = arg0.method3826(var3, arg2);
        return method4115(arg0, var3, var4);
    }

    @ObfuscatedName("aj.w(Lia;Lia;Ljava/lang/String;Ljava/lang/String;I)Ljh;")
    public static class265 method336(class237 arg0, class237 arg1, String arg2, String arg3) {
        int var4 = arg0.method3789(arg2);
        int var5 = arg0.method3826(var4, arg3);
        return method3768(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("jf.b(Lia;II)Ljr;")
    public static class286 method4395(class237 arg0, int arg1) {
        byte[] var2 = arg0.method3779(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method4573(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class286 var4 = new class286();
        var4.field3766 = Statics.field3780;
        var4.field3767 = Statics.field2436;
        var4.field3764 = Statics.field3782[0];
        var4.field3763 = Statics.field2601[0];
        var4.field3762 = Statics.field3648[0];
        var4.field3765 = Statics.field3783[0];
        var4.field3760 = Statics.field3784;
        var4.field3761 = Statics.field3700[0];
        Statics.field3782 = null;
        Statics.field2601 = null;
        Statics.field3648 = null;
        Statics.field3783 = null;
        Statics.field3784 = null;
        Statics.field3700 = (byte[][]) null;
        return var4;
    }

    @ObfuscatedName("dr.m(Lia;III)Z")
    public static boolean method2163(class237 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3773(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method4573(var3);
            return true;
        }
    }

    @ObfuscatedName("ju.e([BI)V")
    public static void method4573(byte[] arg0) {
        class175 var1 = new class175(arg0);
        var1.field2394 = arg0.length - 2;
        Statics.field3781 = var1.method3023();
        Statics.field3782 = new int[Statics.field3781];
        Statics.field2601 = new int[Statics.field3781];
        Statics.field3648 = new int[Statics.field3781];
        Statics.field3783 = new int[Statics.field3781];
        Statics.field3700 = new byte[Statics.field3781][];
        var1.field2394 = arg0.length - 7 - Statics.field3781 * 8;
        Statics.field3780 = var1.method3023();
        Statics.field2436 = var1.method3023();
        int var2 = (var1.method2903() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3781; var3++) {
            Statics.field3782[var3] = var1.method3023();
        }
        for (int var4 = 0; var4 < Statics.field3781; var4++) {
            Statics.field2601[var4] = var1.method3023();
        }
        for (int var5 = 0; var5 < Statics.field3781; var5++) {
            Statics.field3648[var5] = var1.method3023();
        }
        for (int var6 = 0; var6 < Statics.field3781; var6++) {
            Statics.field3783[var6] = var1.method3023();
        }
        var1.field2394 = arg0.length - 7 - Statics.field3781 * 8 - (var2 - 1) * 3;
        Statics.field3784 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3784[var7] = var1.method3070();
            if (Statics.field3784[var7] == 0) {
                Statics.field3784[var7] = 1;
            }
        }
        var1.field2394 = 0;
        for (int var8 = 0; var8 < Statics.field3781; var8++) {
            int var9 = Statics.field3648[var8];
            int var10 = Statics.field3783[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3700[var8] = var12;
            int var13 = var1.method2903();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2980();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2980();
                    }
                }
            }
        }
    }
}
