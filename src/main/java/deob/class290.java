package deob;

@ObfuscatedName("kq")
public class class290 {

    public class290() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("l.s(Liw;III)[Lkc;")
    public static class288[] method117(class239 arg0, int arg1, int arg2) {
        if (!method1591(arg0, arg1, arg2)) {
            return null;
        }
        class288[] var3 = new class288[Statics.field3807];
        for (int var4 = 0; var4 < Statics.field3807; var4++) {
            class288 var5 = var3[var4] = new class288();
            var5.field3789 = Statics.field3803;
            var5.field3788 = Statics.field3804;
            var5.field3786 = Statics.field3805[var4];
            var5.field3784 = Statics.field3764[var4];
            var5.field3782 = Statics.field292[var4];
            var5.field3785 = Statics.field3750[var4];
            var5.field3783 = Statics.field3806;
            var5.field3787 = Statics.field3802[var4];
        }
        Statics.field3805 = null;
        Statics.field3764 = null;
        Statics.field292 = null;
        Statics.field3750 = null;
        Statics.field3806 = null;
        Statics.field3802 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("iu.c(Liw;III)Lkc;")
    public static class288 method3834(class239 arg0, int arg1, int arg2) {
        if (!method1591(arg0, arg1, arg2)) {
            return null;
        }
        class288 var3 = new class288();
        var3.field3789 = Statics.field3803;
        var3.field3788 = Statics.field3804;
        var3.field3786 = Statics.field3805[0];
        var3.field3784 = Statics.field3764[0];
        var3.field3782 = Statics.field292[0];
        var3.field3785 = Statics.field3750[0];
        var3.field3783 = Statics.field3806;
        var3.field3787 = Statics.field3802[0];
        Statics.field3805 = null;
        Statics.field3764 = null;
        Statics.field292 = null;
        Statics.field3750 = null;
        Statics.field3806 = null;
        Statics.field3802 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("hf.f(Liw;III)[Lkb;")
    public static class289[] method3665(class239 arg0, int arg1, int arg2) {
        return method1591(arg0, arg1, arg2) ? method18() : null;
    }

    @ObfuscatedName("jr.m(Liw;III)Lkb;")
    public static class289 method4624(class239 arg0, int arg1, int arg2) {
        if (!method1591(arg0, arg1, arg2)) {
            return null;
        }
        class289 var3 = new class289();
        var3.field3795 = Statics.field3803;
        var3.field3800 = Statics.field3804;
        var3.field3793 = Statics.field3805[0];
        var3.field3794 = Statics.field3764[0];
        var3.field3791 = Statics.field292[0];
        var3.field3792 = Statics.field3750[0];
        int var4 = var3.field3792 * var3.field3791;
        byte[] var5 = Statics.field3802[0];
        var3.field3801 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3801[var6] = Statics.field3806[var5[var6] & 0xFF];
        }
        Statics.field3805 = null;
        Statics.field3764 = null;
        Statics.field292 = null;
        Statics.field3750 = null;
        Statics.field3806 = null;
        Statics.field3802 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("cy.h(Liw;Ljava/lang/String;Ljava/lang/String;I)[Lkc;")
    public static class288[] method1401(class239 arg0, String arg1, String arg2) {
        int var3 = arg0.method3855(arg1);
        int var4 = arg0.method3856(var3, arg2);
        return method117(arg0, var3, var4);
    }

    @ObfuscatedName("g.t(Liw;Ljava/lang/String;Ljava/lang/String;I)Lkc;")
    public static class288 method150(class239 arg0, String arg1, String arg2) {
        int var3 = arg0.method3855(arg1);
        int var4 = arg0.method3856(var3, arg2);
        return method3834(arg0, var3, var4);
    }

    @ObfuscatedName("cm.p(Liw;Ljava/lang/String;Ljava/lang/String;B)[Lkb;")
    public static class289[] method1672(class239 arg0, String arg1, String arg2) {
        int var3 = arg0.method3855(arg1);
        int var4 = arg0.method3856(var3, arg2);
        return method3665(arg0, var3, var4);
    }

    @ObfuscatedName("ec.d(Liw;Liw;Ljava/lang/String;Ljava/lang/String;B)Ljb;")
    public static class267 method2429(class239 arg0, class239 arg1, String arg2, String arg3) {
        int var4 = arg0.method3855(arg2);
        int var5 = arg0.method3856(var4, arg3);
        class267 var6;
        if (method1591(arg0, var4, var5)) {
            byte[] var7 = arg1.method3840(var4, var5);
            class267 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class267 var9 = new class267(var7, Statics.field3805, Statics.field3764, Statics.field292, Statics.field3750, Statics.field3806, Statics.field3802);
                Statics.field3805 = null;
                Statics.field3764 = null;
                Statics.field292 = null;
                Statics.field3750 = null;
                Statics.field3806 = null;
                Statics.field3802 = (byte[][]) null;
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("ee.n(Liw;II)Lkc;")
    public static class288 method2697(class239 arg0, int arg1) {
        byte[] var2 = arg0.method3887(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method988(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class288 var4 = new class288();
        var4.field3789 = Statics.field3803;
        var4.field3788 = Statics.field3804;
        var4.field3786 = Statics.field3805[0];
        var4.field3784 = Statics.field3764[0];
        var4.field3782 = Statics.field292[0];
        var4.field3785 = Statics.field3750[0];
        var4.field3783 = Statics.field3806;
        var4.field3787 = Statics.field3802[0];
        Statics.field3805 = null;
        Statics.field3764 = null;
        Statics.field292 = null;
        Statics.field3750 = null;
        Statics.field3806 = null;
        Statics.field3802 = (byte[][]) null;
        return var4;
    }

    @ObfuscatedName("h.z(I)[Lkb;")
    public static class289[] method18() {
        class289[] var0 = new class289[Statics.field3807];
        for (int var1 = 0; var1 < Statics.field3807; var1++) {
            class289 var2 = var0[var1] = new class289();
            var2.field3795 = Statics.field3803;
            var2.field3800 = Statics.field3804;
            var2.field3793 = Statics.field3805[var1];
            var2.field3794 = Statics.field3764[var1];
            var2.field3791 = Statics.field292[var1];
            var2.field3792 = Statics.field3750[var1];
            int var3 = var2.field3792 * var2.field3791;
            byte[] var4 = Statics.field3802[var1];
            var2.field3801 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3801[var5] = Statics.field3806[var4[var5] & 0xFF];
            }
        }
        Statics.field3805 = null;
        Statics.field3764 = null;
        Statics.field292 = null;
        Statics.field3750 = null;
        Statics.field3806 = null;
        Statics.field3802 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("cw.o(Liw;III)Z")
    public static boolean method1591(class239 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3840(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method988(var3);
            return true;
        }
    }

    @ObfuscatedName("bj.u([BI)V")
    public static void method988(byte[] arg0) {
        class177 var1 = new class177(arg0);
        var1.field2402 = arg0.length - 2;
        Statics.field3807 = var1.method2967();
        Statics.field3805 = new int[Statics.field3807];
        Statics.field3764 = new int[Statics.field3807];
        Statics.field292 = new int[Statics.field3807];
        Statics.field3750 = new int[Statics.field3807];
        Statics.field3802 = new byte[Statics.field3807][];
        var1.field2402 = arg0.length - 7 - Statics.field3807 * 8;
        Statics.field3803 = var1.method2967();
        Statics.field3804 = var1.method2967();
        int var2 = (var1.method2965() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3807; var3++) {
            Statics.field3805[var3] = var1.method2967();
        }
        for (int var4 = 0; var4 < Statics.field3807; var4++) {
            Statics.field3764[var4] = var1.method2967();
        }
        for (int var5 = 0; var5 < Statics.field3807; var5++) {
            Statics.field292[var5] = var1.method2967();
        }
        for (int var6 = 0; var6 < Statics.field3807; var6++) {
            Statics.field3750[var6] = var1.method2967();
        }
        var1.field2402 = arg0.length - 7 - Statics.field3807 * 8 - (var2 - 1) * 3;
        Statics.field3806 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3806[var7] = var1.method2969();
            if (Statics.field3806[var7] == 0) {
                Statics.field3806[var7] = 1;
            }
        }
        var1.field2402 = 0;
        for (int var8 = 0; var8 < Statics.field3807; var8++) {
            int var9 = Statics.field292[var8];
            int var10 = Statics.field3750[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3802[var8] = var12;
            int var13 = var1.method2965();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2966();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2966();
                    }
                }
            }
        }
    }
}
