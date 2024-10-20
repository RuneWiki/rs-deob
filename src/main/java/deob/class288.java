package deob;

@ObfuscatedName("kj")
public class class288 {

    public class288() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eo.i(Lii;IIB)[Ljx;")
    public static class286[] method2792(class237 arg0, int arg1, int arg2) {
        return method3215(arg0, arg1, arg2) ? method527() : null;
    }

    @ObfuscatedName("av.j(Lii;IIB)[Lkd;")
    public static class287[] method511(class237 arg0, int arg1, int arg2) {
        if (!method3215(arg0, arg1, arg2)) {
            return null;
        }
        class287[] var3 = new class287[Statics.field2348];
        for (int var4 = 0; var4 < Statics.field2348; var4++) {
            class287 var5 = var3[var4] = new class287();
            var5.field3794 = Statics.field3798;
            var5.field3791 = Statics.field3799;
            var5.field3788 = Statics.field3680[var4];
            var5.field3789 = Statics.field333[var4];
            var5.field3785 = Statics.field3797[var4];
            var5.field3790 = Statics.field3325[var4];
            int var6 = var5.field3790 * var5.field3785;
            byte[] var7 = Statics.field3714[var4];
            var5.field3787 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field3787[var8] = Statics.field3388[var7[var8] & 0xFF];
            }
        }
        method3077();
        return var3;
    }

    @ObfuscatedName("ip.a(Lii;III)Lkd;")
    public static class287 method4185(class237 arg0, int arg1, int arg2) {
        if (!method3215(arg0, arg1, arg2)) {
            return null;
        }
        class287 var3 = new class287();
        var3.field3794 = Statics.field3798;
        var3.field3791 = Statics.field3799;
        var3.field3788 = Statics.field3680[0];
        var3.field3789 = Statics.field333[0];
        var3.field3785 = Statics.field3797[0];
        var3.field3790 = Statics.field3325[0];
        int var4 = var3.field3790 * var3.field3785;
        byte[] var5 = Statics.field3714[0];
        var3.field3787 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3787[var6] = Statics.field3388[var5[var6] & 0xFF];
        }
        method3077();
        return var3;
    }

    @ObfuscatedName("ep.o(Lii;Ljava/lang/String;Ljava/lang/String;I)[Ljx;")
    public static class286[] method2704(class237 arg0, String arg1, String arg2) {
        int var3 = arg0.method3840(arg1);
        int var4 = arg0.method3841(var3, arg2);
        return method2792(arg0, var3, var4);
    }

    @ObfuscatedName("d.q(Lii;Ljava/lang/String;Ljava/lang/String;I)[Lkd;")
    public static class287[] method49(class237 arg0, String arg1, String arg2) {
        int var3 = arg0.method3840(arg1);
        int var4 = arg0.method3841(var3, arg2);
        return method511(arg0, var3, var4);
    }

    @ObfuscatedName("fs.b(Lii;Ljava/lang/String;Ljava/lang/String;B)Lkd;")
    public static class287 method2904(class237 arg0, String arg1, String arg2) {
        int var3 = arg0.method3840(arg1);
        int var4 = arg0.method3841(var3, arg2);
        return method4185(arg0, var3, var4);
    }

    @ObfuscatedName("cq.k(Lii;Lii;Ljava/lang/String;Ljava/lang/String;I)Ljm;")
    public static class265 method1458(class237 arg0, class237 arg1, String arg2, String arg3) {
        int var4 = arg0.method3840(arg2);
        int var5 = arg0.method3841(var4, arg3);
        return Statics.method3728(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("jc.s(Lii;II)Ljx;")
    public static class286 method4627(class237 arg0, int arg1) {
        if (!method2505(arg0, arg1)) {
            return null;
        }
        class286 var2 = new class286();
        var2.field3783 = Statics.field3798;
        var2.field3780 = Statics.field3799;
        var2.field3781 = Statics.field3680[0];
        var2.field3779 = Statics.field333[0];
        var2.field3777 = Statics.field3797[0];
        var2.field3782 = Statics.field3325[0];
        var2.field3784 = Statics.field3388;
        var2.field3778 = Statics.field3714[0];
        method3077();
        return var2;
    }

    @ObfuscatedName("ao.d(I)[Ljx;")
    public static class286[] method527() {
        class286[] var0 = new class286[Statics.field2348];
        for (int var1 = 0; var1 < Statics.field2348; var1++) {
            class286 var2 = var0[var1] = new class286();
            var2.field3783 = Statics.field3798;
            var2.field3780 = Statics.field3799;
            var2.field3781 = Statics.field3680[var1];
            var2.field3779 = Statics.field333[var1];
            var2.field3777 = Statics.field3797[var1];
            var2.field3782 = Statics.field3325[var1];
            var2.field3784 = Statics.field3388;
            var2.field3778 = Statics.field3714[var1];
        }
        method3077();
        return var0;
    }

    @ObfuscatedName("ak.l(B)Ljx;")
    public static class286 method641() {
        class286 var0 = new class286();
        var0.field3783 = Statics.field3798;
        var0.field3780 = Statics.field3799;
        var0.field3781 = Statics.field3680[0];
        var0.field3779 = Statics.field333[0];
        var0.field3777 = Statics.field3797[0];
        var0.field3782 = Statics.field3325[0];
        var0.field3784 = Statics.field3388;
        var0.field3778 = Statics.field3714[0];
        method3077();
        return var0;
    }

    @ObfuscatedName("es.c([BI)Ljm;")
    public static class265 method2714(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class265 var1 = new class265(arg0, Statics.field3680, Statics.field333, Statics.field3797, Statics.field3325, Statics.field3388, Statics.field3714);
            method3077();
            return var1;
        }
    }

    @ObfuscatedName("fy.u(Lii;III)Z")
    public static boolean method3215(class237 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3824(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1547(var3);
            return true;
        }
    }

    @ObfuscatedName("ei.e(Lii;II)Z")
    public static boolean method2505(class237 arg0, int arg1) {
        byte[] var2 = arg0.method3898(arg1);
        if (var2 == null) {
            return false;
        } else {
            method1547(var2);
            return true;
        }
    }

    @ObfuscatedName("cf.p([BB)V")
    public static void method1547(byte[] arg0) {
        class175 var1 = new class175(arg0);
        var1.field2395 = arg0.length - 2;
        Statics.field2348 = var1.method2995();
        Statics.field3680 = new int[Statics.field2348];
        Statics.field333 = new int[Statics.field2348];
        Statics.field3797 = new int[Statics.field2348];
        Statics.field3325 = new int[Statics.field2348];
        Statics.field3714 = new byte[Statics.field2348][];
        var1.field2395 = arg0.length - 7 - Statics.field2348 * 8;
        Statics.field3798 = var1.method2995();
        Statics.field3799 = var1.method2995();
        int var2 = (var1.method2999() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field2348; var3++) {
            Statics.field3680[var3] = var1.method2995();
        }
        for (int var4 = 0; var4 < Statics.field2348; var4++) {
            Statics.field333[var4] = var1.method2995();
        }
        for (int var5 = 0; var5 < Statics.field2348; var5++) {
            Statics.field3797[var5] = var1.method2995();
        }
        for (int var6 = 0; var6 < Statics.field2348; var6++) {
            Statics.field3325[var6] = var1.method2995();
        }
        var1.field2395 = arg0.length - 7 - Statics.field2348 * 8 - (var2 - 1) * 3;
        Statics.field3388 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3388[var7] = var1.method2997();
            if (Statics.field3388[var7] == 0) {
                Statics.field3388[var7] = 1;
            }
        }
        var1.field2395 = 0;
        for (int var8 = 0; var8 < Statics.field2348; var8++) {
            int var9 = Statics.field3797[var8];
            int var10 = Statics.field3325[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3714[var8] = var12;
            int var13 = var1.method2999();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3172();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3172();
                    }
                }
            }
        }
    }

    @ObfuscatedName("fp.m(B)V")
    public static void method3077() {
        Statics.field3680 = null;
        Statics.field333 = null;
        Statics.field3797 = null;
        Statics.field3325 = null;
        Statics.field3388 = null;
        Statics.field3714 = (byte[][]) null;
    }
}
