package deob;

@ObfuscatedName("lg")
public class class326 {

    public class326() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bo.c(Lhz;III)[Lli;")
    public static class325[] method1555(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3825(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method47(var3);
            var4 = true;
        }
        return var4 ? method3319() : null;
    }

    @ObfuscatedName("lq.x(Lhz;IIS)Lli;")
    public static class325 method5636(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3825(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method47(var3);
            var4 = true;
        }
        return var4 ? method2067() : null;
    }

    @ObfuscatedName("h.t(Lhz;Ljava/lang/String;Ljava/lang/String;I)[Llt;")
    public static class324[] method108(class234 arg0, String arg1, String arg2) {
        int var3 = arg0.method3843(arg1);
        int var4 = arg0.method3865(var3, arg2);
        byte[] var5 = arg0.method3825(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method47(var5);
            var6 = true;
        }
        class324[] var7;
        if (var6) {
            var7 = method3237();
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("bx.g(Lhz;Ljava/lang/String;Ljava/lang/String;B)Llt;")
    public static class324 method1789(class234 arg0, String arg1, String arg2) {
        int var3 = arg0.method3843(arg1);
        int var4 = arg0.method3865(var3, arg2);
        byte[] var5 = arg0.method3825(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method47(var5);
            var6 = true;
        }
        class324 var7;
        if (var6) {
            class324 var8 = new class324();
            var8.field3864 = Statics.field3880;
            var8.field3860 = Statics.field3881;
            var8.field3862 = Statics.field3883[0];
            var8.field3863 = Statics.field501[0];
            var8.field3865 = Statics.field3882[0];
            var8.field3861 = Statics.field1403[0];
            var8.field3859 = Statics.field3878;
            var8.field3858 = Statics.field3181[0];
            method3386();
            var7 = var8;
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("en.l(Lhz;Lhz;Ljava/lang/String;Ljava/lang/String;I)Lkf;")
    public static class295 method2833(class234 arg0, class234 arg1, String arg2, String arg3) {
        int var4 = arg0.method3843(arg2);
        int var5 = arg0.method3865(var4, arg3);
        byte[] var6 = arg0.method3825(var4, var5);
        boolean var7;
        if (var6 == null) {
            var7 = false;
        } else {
            method47(var6);
            var7 = true;
        }
        class295 var8;
        if (var7) {
            byte[] var9 = arg1.method3825(var4, var5);
            class295 var10;
            if (var9 == null) {
                var10 = null;
            } else {
                class295 var11 = new class295(var9, Statics.field3883, Statics.field501, Statics.field3882, Statics.field1403, Statics.field3878, Statics.field3181);
                method3386();
                var10 = var11;
            }
            var8 = var10;
        } else {
            var8 = null;
        }
        return var8;
    }

    @ObfuscatedName("fi.u(I)[Llt;")
    public static class324[] method3237() {
        class324[] var0 = new class324[Statics.field3879];
        for (int var1 = 0; var1 < Statics.field3879; var1++) {
            class324 var2 = var0[var1] = new class324();
            var2.field3864 = Statics.field3880;
            var2.field3860 = Statics.field3881;
            var2.field3862 = Statics.field3883[var1];
            var2.field3863 = Statics.field501[var1];
            var2.field3865 = Statics.field3882[var1];
            var2.field3861 = Statics.field1403[var1];
            var2.field3859 = Statics.field3878;
            var2.field3858 = Statics.field3181[var1];
        }
        method3386();
        return var0;
    }

    @ObfuscatedName("fw.j(S)[Lli;")
    public static class325[] method3319() {
        class325[] var0 = new class325[Statics.field3879];
        for (int var1 = 0; var1 < Statics.field3879; var1++) {
            class325 var2 = var0[var1] = new class325();
            var2.field3872 = Statics.field3880;
            var2.field3866 = Statics.field3881;
            var2.field3869 = Statics.field3883[var1];
            var2.field3870 = Statics.field501[var1];
            var2.field3867 = Statics.field3882[var1];
            var2.field3868 = Statics.field1403[var1];
            int var3 = var2.field3868 * var2.field3867;
            byte[] var4 = Statics.field3181[var1];
            var2.field3873 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3873[var5] = Statics.field3878[var4[var5] & 0xFF];
            }
        }
        method3386();
        return var0;
    }

    @ObfuscatedName("cs.v(I)Lli;")
    public static class325 method2067() {
        class325 var0 = new class325();
        var0.field3872 = Statics.field3880;
        var0.field3866 = Statics.field3881;
        var0.field3869 = Statics.field3883[0];
        var0.field3870 = Statics.field501[0];
        var0.field3867 = Statics.field3882[0];
        var0.field3868 = Statics.field1403[0];
        int var1 = var0.field3868 * var0.field3867;
        byte[] var2 = Statics.field3181[0];
        var0.field3873 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3873[var3] = Statics.field3878[var2[var3] & 0xFF];
        }
        method3386();
        return var0;
    }

    @ObfuscatedName("hx.d(Lhz;II)Z")
    public static boolean method3807(class234 arg0, int arg1) {
        byte[] var2 = arg0.method3832(arg1);
        if (var2 == null) {
            return false;
        } else {
            method47(var2);
            return true;
        }
    }

    @ObfuscatedName("u.z([BI)V")
    public static void method47(byte[] arg0) {
        class300 var1 = new class300(arg0);
        var1.field3696 = arg0.length - 2;
        Statics.field3879 = var1.method5304();
        Statics.field3883 = new int[Statics.field3879];
        Statics.field501 = new int[Statics.field3879];
        Statics.field3882 = new int[Statics.field3879];
        Statics.field1403 = new int[Statics.field3879];
        Statics.field3181 = new byte[Statics.field3879][];
        var1.field3696 = arg0.length - 7 - Statics.field3879 * 8;
        Statics.field3880 = var1.method5304();
        Statics.field3881 = var1.method5304();
        int var2 = (var1.method5103() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3879; var3++) {
            Statics.field3883[var3] = var1.method5304();
        }
        for (int var4 = 0; var4 < Statics.field3879; var4++) {
            Statics.field501[var4] = var1.method5304();
        }
        for (int var5 = 0; var5 < Statics.field3879; var5++) {
            Statics.field3882[var5] = var1.method5304();
        }
        for (int var6 = 0; var6 < Statics.field3879; var6++) {
            Statics.field1403[var6] = var1.method5304();
        }
        var1.field3696 = arg0.length - 7 - Statics.field3879 * 8 - (var2 - 1) * 3;
        Statics.field3878 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3878[var7] = var1.method5107();
            if (Statics.field3878[var7] == 0) {
                Statics.field3878[var7] = 1;
            }
        }
        var1.field3696 = 0;
        for (int var8 = 0; var8 < Statics.field3879; var8++) {
            int var9 = Statics.field3882[var8];
            int var10 = Statics.field1403[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3181[var8] = var12;
            int var13 = var1.method5103();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method5168();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method5168();
                    }
                }
            }
        }
    }

    @ObfuscatedName("gh.s(I)V")
    public static void method3386() {
        Statics.field3883 = null;
        Statics.field501 = null;
        Statics.field3882 = null;
        Statics.field1403 = null;
        Statics.field3878 = null;
        Statics.field3181 = (byte[][]) null;
    }
}
