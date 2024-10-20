package deob;

@ObfuscatedName("kw")
public class class296 {

    public class296() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fu.d(Lid;IIB)[Lkl;")
    public static class294[] method2931(class243 arg0, int arg1, int arg2) {
        return method2387(arg0, arg1, arg2) ? method238() : null;
    }

    @ObfuscatedName("bc.x(Lid;IIB)[Lky;")
    public static class295[] method1015(class243 arg0, int arg1, int arg2) {
        if (!method2387(arg0, arg1, arg2)) {
            return null;
        }
        class295[] var3 = new class295[Statics.field3850];
        for (int var4 = 0; var4 < Statics.field3850; var4++) {
            class295 var5 = var3[var4] = new class295();
            var5.field3837 = Statics.field3847;
            var5.field3840 = Statics.field3848;
            var5.field3845 = Statics.field3849[var4];
            var5.field3838 = Statics.field3851[var4];
            var5.field3835 = Statics.field3846[var4];
            var5.field3836 = Statics.field3789[var4];
            int var6 = var5.field3836 * var5.field3835;
            byte[] var7 = Statics.field290[var4];
            var5.field3841 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field3841[var8] = Statics.field1600[var7[var8] & 0xFF];
            }
        }
        Statics.field3849 = null;
        Statics.field3851 = null;
        Statics.field3846 = null;
        Statics.field3789 = null;
        Statics.field1600 = null;
        Statics.field290 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("km.k(Lid;IIB)Lky;")
    public static class295 method4769(class243 arg0, int arg1, int arg2) {
        if (!method2387(arg0, arg1, arg2)) {
            return null;
        }
        class295 var3 = new class295();
        var3.field3837 = Statics.field3847;
        var3.field3840 = Statics.field3848;
        var3.field3845 = Statics.field3849[0];
        var3.field3838 = Statics.field3851[0];
        var3.field3835 = Statics.field3846[0];
        var3.field3836 = Statics.field3789[0];
        int var4 = var3.field3836 * var3.field3835;
        byte[] var5 = Statics.field290[0];
        var3.field3841 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3841[var6] = Statics.field1600[var5[var6] & 0xFF];
        }
        Statics.field3849 = null;
        Statics.field3851 = null;
        Statics.field3846 = null;
        Statics.field3789 = null;
        Statics.field1600 = null;
        Statics.field290 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("jt.z(Lid;Lid;III)Ljp;")
    public static class271 method4738(class243 arg0, class243 arg1, int arg2, int arg3) {
        if (!method2387(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3935(arg2, arg3);
        class271 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class271 var6 = new class271(var4, Statics.field3849, Statics.field3851, Statics.field3846, Statics.field3789, Statics.field1600, Statics.field290);
            Statics.field3849 = null;
            Statics.field3851 = null;
            Statics.field3846 = null;
            Statics.field3789 = null;
            Statics.field1600 = null;
            Statics.field290 = (byte[][]) null;
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("hr.v(Lid;Ljava/lang/String;Ljava/lang/String;I)[Lkl;")
    public static class294[] method3585(class243 arg0, String arg1, String arg2) {
        int var3 = arg0.method3951(arg1);
        int var4 = arg0.method3952(var3, arg2);
        return method2931(arg0, var3, var4);
    }

    @ObfuscatedName("bu.m(Lid;Ljava/lang/String;Ljava/lang/String;I)Lkl;")
    public static class294 method1099(class243 arg0, String arg1, String arg2) {
        int var3 = arg0.method3951(arg1);
        int var4 = arg0.method3952(var3, arg2);
        class294 var5;
        if (method2387(arg0, var3, var4)) {
            var5 = method4133();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("af.b(Lid;Ljava/lang/String;Ljava/lang/String;I)[Lky;")
    public static class295[] method636(class243 arg0, String arg1, String arg2) {
        int var3 = arg0.method3951(arg1);
        int var4 = arg0.method3952(var3, arg2);
        return method1015(arg0, var3, var4);
    }

    @ObfuscatedName("n.t(Lid;Ljava/lang/String;Ljava/lang/String;I)Lky;")
    public static class295 method73(class243 arg0, String arg1, String arg2) {
        int var3 = arg0.method3951(arg1);
        int var4 = arg0.method3952(var3, arg2);
        return method4769(arg0, var3, var4);
    }

    @ObfuscatedName("by.p(Lid;Lid;Ljava/lang/String;Ljava/lang/String;I)Ljp;")
    public static class271 method1454(class243 arg0, class243 arg1, String arg2, String arg3) {
        int var4 = arg0.method3951(arg2);
        int var5 = arg0.method3952(var4, arg3);
        return method4738(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("aq.r(I)[Lkl;")
    public static class294[] method238() {
        class294[] var0 = new class294[Statics.field3850];
        for (int var1 = 0; var1 < Statics.field3850; var1++) {
            class294 var2 = var0[var1] = new class294();
            var2.field3832 = Statics.field3847;
            var2.field3833 = Statics.field3848;
            var2.field3830 = Statics.field3849[var1];
            var2.field3828 = Statics.field3851[var1];
            var2.field3827 = Statics.field3846[var1];
            var2.field3831 = Statics.field3789[var1];
            var2.field3829 = Statics.field1600;
            var2.field3826 = Statics.field290[var1];
        }
        Statics.field3849 = null;
        Statics.field3851 = null;
        Statics.field3846 = null;
        Statics.field3789 = null;
        Statics.field1600 = null;
        Statics.field290 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("if.l(I)Lkl;")
    public static class294 method4133() {
        class294 var0 = new class294();
        var0.field3832 = Statics.field3847;
        var0.field3833 = Statics.field3848;
        var0.field3830 = Statics.field3849[0];
        var0.field3828 = Statics.field3851[0];
        var0.field3827 = Statics.field3846[0];
        var0.field3831 = Statics.field3789[0];
        var0.field3829 = Statics.field1600;
        var0.field3826 = Statics.field290[0];
        Statics.field3849 = null;
        Statics.field3851 = null;
        Statics.field3846 = null;
        Statics.field3789 = null;
        Statics.field1600 = null;
        Statics.field290 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("dd.u(Lid;III)Z")
    public static boolean method2387(class243 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3935(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2050(var3);
            return true;
        }
    }

    @ObfuscatedName("hl.c(Lid;II)Z")
    public static boolean method3784(class243 arg0, int arg1) {
        byte[] var2 = arg0.method3941(arg1);
        if (var2 == null) {
            return false;
        } else {
            method2050(var2);
            return true;
        }
    }

    @ObfuscatedName("dh.j([BI)V")
    public static void method2050(byte[] arg0) {
        class181 var1 = new class181(arg0);
        var1.field2498 = arg0.length - 2;
        Statics.field3850 = var1.method3179();
        Statics.field3849 = new int[Statics.field3850];
        Statics.field3851 = new int[Statics.field3850];
        Statics.field3846 = new int[Statics.field3850];
        Statics.field3789 = new int[Statics.field3850];
        Statics.field290 = new byte[Statics.field3850][];
        var1.field2498 = arg0.length - 7 - Statics.field3850 * 8;
        Statics.field3847 = var1.method3179();
        Statics.field3848 = var1.method3179();
        int var2 = (var1.method3204() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3850; var3++) {
            Statics.field3849[var3] = var1.method3179();
        }
        for (int var4 = 0; var4 < Statics.field3850; var4++) {
            Statics.field3851[var4] = var1.method3179();
        }
        for (int var5 = 0; var5 < Statics.field3850; var5++) {
            Statics.field3846[var5] = var1.method3179();
        }
        for (int var6 = 0; var6 < Statics.field3850; var6++) {
            Statics.field3789[var6] = var1.method3179();
        }
        var1.field2498 = arg0.length - 7 - Statics.field3850 * 8 - (var2 - 1) * 3;
        Statics.field1600 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1600[var7] = var1.method3235();
            if (Statics.field1600[var7] == 0) {
                Statics.field1600[var7] = 1;
            }
        }
        var1.field2498 = 0;
        for (int var8 = 0; var8 < Statics.field3850; var8++) {
            int var9 = Statics.field3846[var8];
            int var10 = Statics.field3789[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field290[var8] = var12;
            int var13 = var1.method3204();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3236();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3236();
                    }
                }
            }
        }
    }
}
