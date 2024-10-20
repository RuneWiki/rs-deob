package deob;

@ObfuscatedName("ko")
public class class288 {

    public class288() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cx.w(Lip;III)[Ljo;")
    public static class286[] method1651(class236 arg0, int arg1, int arg2) {
        if (!method4488(arg0, arg1, arg2)) {
            return null;
        }
        class286[] var3 = new class286[Statics.field3806];
        for (int var4 = 0; var4 < Statics.field3806; var4++) {
            class286 var5 = var3[var4] = new class286();
            var5.field3792 = Statics.field3810;
            var5.field3790 = Statics.field3808;
            var5.field3789 = Statics.field3809[var4];
            var5.field3793 = Statics.field348[var4];
            var5.field3788 = Statics.field3807[var4];
            var5.field3786 = Statics.field701[var4];
            var5.field3787 = Statics.field1676;
            var5.field3791 = Statics.field3148[var4];
        }
        Statics.method4163();
        return var3;
    }

    @ObfuscatedName("al.s(Lip;III)[Lky;")
    public static class287[] method450(class236 arg0, int arg1, int arg2) {
        return method4488(arg0, arg1, arg2) ? method2731() : null;
    }

    @ObfuscatedName("hr.q(Lip;IIB)Lky;")
    public static class287 method3863(class236 arg0, int arg1, int arg2) {
        if (!method4488(arg0, arg1, arg2)) {
            return null;
        }
        class287 var3 = new class287();
        var3.field3799 = Statics.field3810;
        var3.field3800 = Statics.field3808;
        var3.field3797 = Statics.field3809[0];
        var3.field3798 = Statics.field348[0];
        var3.field3795 = Statics.field3807[0];
        var3.field3796 = Statics.field701[0];
        int var4 = var3.field3796 * var3.field3795;
        byte[] var5 = Statics.field3148[0];
        var3.field3804 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3804[var6] = Statics.field1676[var5[var6] & 0xFF];
        }
        Statics.method4163();
        return var3;
    }

    @ObfuscatedName("hy.o(Lip;Ljava/lang/String;Ljava/lang/String;I)[Ljo;")
    public static class286[] method3837(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3955(arg1);
        int var4 = arg0.method3893(var3, arg2);
        return method1651(arg0, var3, var4);
    }

    @ObfuscatedName("iu.g(Lip;Ljava/lang/String;Ljava/lang/String;I)Ljo;")
    public static class286 method4020(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3955(arg1);
        int var4 = arg0.method3893(var3, arg2);
        class286 var5;
        if (method4488(arg0, var3, var4)) {
            var5 = method3211();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("eg.v(Lip;Ljava/lang/String;Ljava/lang/String;I)[Lky;")
    public static class287[] method2514(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3955(arg1);
        int var4 = arg0.method3893(var3, arg2);
        return method450(arg0, var3, var4);
    }

    @ObfuscatedName("hc.p(Lip;Ljava/lang/String;Ljava/lang/String;B)Lky;")
    public static class287 method3851(class236 arg0, String arg1, String arg2) {
        int var3 = arg0.method3955(arg1);
        int var4 = arg0.method3893(var3, arg2);
        return method3863(arg0, var3, var4);
    }

    @ObfuscatedName("a.e(Lip;Lip;Ljava/lang/String;Ljava/lang/String;B)Ljh;")
    public static class264 method75(class236 arg0, class236 arg1, String arg2, String arg3) {
        int var4 = arg0.method3955(arg2);
        int var5 = arg0.method3893(var4, arg3);
        class264 var6;
        if (method4488(arg0, var4, var5)) {
            byte[] var7 = arg1.method3876(var4, var5);
            class264 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class264 var9 = new class264(var7, Statics.field3809, Statics.field348, Statics.field3807, Statics.field701, Statics.field1676, Statics.field3148);
                Statics.method4163();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("ab.d(Lip;II)Ljo;")
    public static class286 method479(class236 arg0, int arg1) {
        return method1428(arg0, arg1) ? method3211() : null;
    }

    @ObfuscatedName("fd.x(I)Ljo;")
    public static class286 method3211() {
        class286 var0 = new class286();
        var0.field3792 = Statics.field3810;
        var0.field3790 = Statics.field3808;
        var0.field3789 = Statics.field3809[0];
        var0.field3793 = Statics.field348[0];
        var0.field3788 = Statics.field3807[0];
        var0.field3786 = Statics.field701[0];
        var0.field3787 = Statics.field1676;
        var0.field3791 = Statics.field3148[0];
        Statics.method4163();
        return var0;
    }

    @ObfuscatedName("eq.u(I)[Lky;")
    public static class287[] method2731() {
        class287[] var0 = new class287[Statics.field3806];
        for (int var1 = 0; var1 < Statics.field3806; var1++) {
            class287 var2 = var0[var1] = new class287();
            var2.field3799 = Statics.field3810;
            var2.field3800 = Statics.field3808;
            var2.field3797 = Statics.field3809[var1];
            var2.field3798 = Statics.field348[var1];
            var2.field3795 = Statics.field3807[var1];
            var2.field3796 = Statics.field701[var1];
            int var3 = var2.field3796 * var2.field3795;
            byte[] var4 = Statics.field3148[var1];
            var2.field3804 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3804[var5] = Statics.field1676[var4[var5] & 0xFF];
            }
        }
        Statics.method4163();
        return var0;
    }

    @ObfuscatedName("jz.i(Lip;IIB)Z")
    public static boolean method4488(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3876(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1668(var3);
            return true;
        }
    }

    @ObfuscatedName("bu.h(Lip;II)Z")
    public static boolean method1428(class236 arg0, int arg1) {
        byte[] var2 = arg0.method3916(arg1);
        if (var2 == null) {
            return false;
        } else {
            method1668(var2);
            return true;
        }
    }

    @ObfuscatedName("cc.b([BI)V")
    public static void method1668(byte[] arg0) {
        class174 var1 = new class174(arg0);
        var1.field2390 = arg0.length - 2;
        Statics.field3806 = var1.method3178();
        Statics.field3809 = new int[Statics.field3806];
        Statics.field348 = new int[Statics.field3806];
        Statics.field3807 = new int[Statics.field3806];
        Statics.field701 = new int[Statics.field3806];
        Statics.field3148 = new byte[Statics.field3806][];
        var1.field2390 = arg0.length - 7 - Statics.field3806 * 8;
        Statics.field3810 = var1.method3178();
        Statics.field3808 = var1.method3178();
        int var2 = (var1.method2971() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3806; var3++) {
            Statics.field3809[var3] = var1.method3178();
        }
        for (int var4 = 0; var4 < Statics.field3806; var4++) {
            Statics.field348[var4] = var1.method3178();
        }
        for (int var5 = 0; var5 < Statics.field3806; var5++) {
            Statics.field3807[var5] = var1.method3178();
        }
        for (int var6 = 0; var6 < Statics.field3806; var6++) {
            Statics.field701[var6] = var1.method3178();
        }
        var1.field2390 = arg0.length - 7 - Statics.field3806 * 8 - (var2 - 1) * 3;
        Statics.field1676 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1676[var7] = var1.method2975();
            if (Statics.field1676[var7] == 0) {
                Statics.field1676[var7] = 1;
            }
        }
        var1.field2390 = 0;
        for (int var8 = 0; var8 < Statics.field3806; var8++) {
            int var9 = Statics.field3807[var8];
            int var10 = Statics.field701[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3148[var8] = var12;
            int var13 = var1.method2971();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2972();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2972();
                    }
                }
            }
        }
    }
}
