package deob;

@ObfuscatedName("lz")
public class class326 {

    public class326() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.f(Lhz;III)[Lls;")
    public static class325[] method118(class234 arg0, int arg1, int arg2) {
        if (!method4199(arg0, arg1, arg2)) {
            return null;
        }
        class325[] var3 = new class325[Statics.field3879];
        for (int var4 = 0; var4 < Statics.field3879; var4++) {
            class325 var5 = var3[var4] = new class325();
            var5.field3869 = Statics.field3876;
            var5.field3864 = Statics.field3877;
            var5.field3867 = Statics.field3878[var4];
            var5.field3868 = Statics.field3880[var4];
            var5.field3875 = Statics.field3818[var4];
            var5.field3865 = Statics.field3881[var4];
            int var6 = var5.field3875 * var5.field3865;
            byte[] var7 = Statics.field3638[var4];
            var5.field3873 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field3873[var8] = Statics.field3524[var7[var8] & 0xFF];
            }
        }
        method1082();
        return var3;
    }

    @ObfuscatedName("s.y(Lhz;Lhz;III)Lko;")
    public static class294 method140(class234 arg0, class234 arg1, int arg2, int arg3) {
        return method4199(arg0, arg2, arg3) ? method2080(arg1.method3752(arg2, arg3)) : null;
    }

    @ObfuscatedName("ge.w(Lhz;Ljava/lang/String;Ljava/lang/String;I)[Lli;")
    public static class324[] method3348(class234 arg0, String arg1, String arg2) {
        int var3 = arg0.method3847(arg1);
        int var4 = arg0.method3846(var3, arg2);
        class324[] var5;
        if (method4199(arg0, var3, var4)) {
            class324[] var6 = new class324[Statics.field3879];
            for (int var7 = 0; var7 < Statics.field3879; var7++) {
                class324 var8 = var6[var7] = new class324();
                var8.field3859 = Statics.field3876;
                var8.field3863 = Statics.field3877;
                var8.field3862 = Statics.field3878[var7];
                var8.field3861 = Statics.field3880[var7];
                var8.field3860 = Statics.field3818[var7];
                var8.field3857 = Statics.field3881[var7];
                var8.field3856 = Statics.field3524;
                var8.field3858 = Statics.field3638[var7];
            }
            method1082();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("af.p(Lhz;Ljava/lang/String;Ljava/lang/String;I)Lli;")
    public static class324 method716(class234 arg0, String arg1, String arg2) {
        int var3 = arg0.method3847(arg1);
        int var4 = arg0.method3846(var3, arg2);
        class324 var5;
        if (method4199(arg0, var3, var4)) {
            var5 = method264();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("cd.b(Lhz;Ljava/lang/String;Ljava/lang/String;B)[Lls;")
    public static class325[] method1882(class234 arg0, String arg1, String arg2) {
        int var3 = arg0.method3847(arg1);
        int var4 = arg0.method3846(var3, arg2);
        return method118(arg0, var3, var4);
    }

    @ObfuscatedName("kg.e(Lhz;Lhz;Ljava/lang/String;Ljava/lang/String;I)Lko;")
    public static class294 method5428(class234 arg0, class234 arg1, String arg2, String arg3) {
        int var4 = arg0.method3847(arg2);
        int var5 = arg0.method3846(var4, arg3);
        return method140(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("bq.x(Lhz;II)Lli;")
    public static class324 method1010(class234 arg0, int arg1) {
        return method41(arg0, arg1) ? method264() : null;
    }

    @ObfuscatedName("q.a(I)Lli;")
    public static class324 method264() {
        class324 var0 = new class324();
        var0.field3859 = Statics.field3876;
        var0.field3863 = Statics.field3877;
        var0.field3862 = Statics.field3878[0];
        var0.field3861 = Statics.field3880[0];
        var0.field3860 = Statics.field3818[0];
        var0.field3857 = Statics.field3881[0];
        var0.field3856 = Statics.field3524;
        var0.field3858 = Statics.field3638[0];
        method1082();
        return var0;
    }

    @ObfuscatedName("kq.d(I)Lls;")
    public static class325 method5256() {
        class325 var0 = new class325();
        var0.field3869 = Statics.field3876;
        var0.field3864 = Statics.field3877;
        var0.field3867 = Statics.field3878[0];
        var0.field3868 = Statics.field3880[0];
        var0.field3875 = Statics.field3818[0];
        var0.field3865 = Statics.field3881[0];
        int var1 = var0.field3875 * var0.field3865;
        byte[] var2 = Statics.field3638[0];
        var0.field3873 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3873[var3] = Statics.field3524[var2[var3] & 0xFF];
        }
        method1082();
        return var0;
    }

    @ObfuscatedName("ct.c([BI)Lko;")
    public static class294 method2080(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class294 var1 = new class294(arg0, Statics.field3878, Statics.field3880, Statics.field3818, Statics.field3881, Statics.field3524, Statics.field3638);
            method1082();
            return var1;
        }
    }

    @ObfuscatedName("id.o(Lhz;III)Z")
    public static boolean method4199(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3752(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method517(var3);
            return true;
        }
    }

    @ObfuscatedName("p.l(Lhz;IB)Z")
    public static boolean method41(class234 arg0, int arg1) {
        byte[] var2 = arg0.method3759(arg1);
        if (var2 == null) {
            return false;
        } else {
            method517(var2);
            return true;
        }
    }

    @ObfuscatedName("ao.t([BI)V")
    public static void method517(byte[] arg0) {
        class300 var1 = new class300(arg0);
        var1.field3703 = arg0.length - 2;
        Statics.field3879 = var1.method5112();
        Statics.field3878 = new int[Statics.field3879];
        Statics.field3880 = new int[Statics.field3879];
        Statics.field3818 = new int[Statics.field3879];
        Statics.field3881 = new int[Statics.field3879];
        Statics.field3638 = new byte[Statics.field3879][];
        var1.field3703 = arg0.length - 7 - Statics.field3879 * 8;
        Statics.field3876 = var1.method5112();
        Statics.field3877 = var1.method5112();
        int var2 = (var1.method5110() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3879; var3++) {
            Statics.field3878[var3] = var1.method5112();
        }
        for (int var4 = 0; var4 < Statics.field3879; var4++) {
            Statics.field3880[var4] = var1.method5112();
        }
        for (int var5 = 0; var5 < Statics.field3879; var5++) {
            Statics.field3818[var5] = var1.method5112();
        }
        for (int var6 = 0; var6 < Statics.field3879; var6++) {
            Statics.field3881[var6] = var1.method5112();
        }
        var1.field3703 = arg0.length - 7 - Statics.field3879 * 8 - (var2 - 1) * 3;
        Statics.field3524 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3524[var7] = var1.method5226();
            if (Statics.field3524[var7] == 0) {
                Statics.field3524[var7] = 1;
            }
        }
        var1.field3703 = 0;
        for (int var8 = 0; var8 < Statics.field3879; var8++) {
            int var9 = Statics.field3818[var8];
            int var10 = Statics.field3881[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3638[var8] = var12;
            int var13 = var1.method5110();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method5297();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method5297();
                    }
                }
            }
        }
    }

    @ObfuscatedName("bs.j(I)V")
    public static void method1082() {
        Statics.field3878 = null;
        Statics.field3880 = null;
        Statics.field3818 = null;
        Statics.field3881 = null;
        Statics.field3524 = null;
        Statics.field3638 = (byte[][]) null;
    }
}
