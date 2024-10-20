package deob;

@ObfuscatedName("ld")
public class class326 {

    public class326() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.a(Lhq;IIB)Llw;")
    public static class324 method618(class234 arg0, int arg1, int arg2) {
        if (!method539(arg0, arg1, arg2)) {
            return null;
        }
        class324 var3 = new class324();
        var3.field3860 = Statics.field3877;
        var3.field3861 = Statics.field3876;
        var3.field3858 = Statics.field1222[0];
        var3.field3859 = Statics.field1105[0];
        var3.field3854 = Statics.field515[0];
        var3.field3857 = Statics.field1156[0];
        var3.field3856 = Statics.field3874;
        var3.field3855 = Statics.field3878[0];
        method639();
        return var3;
    }

    @ObfuscatedName("cn.t(Lhq;III)[Llx;")
    public static class325[] method1993(class234 arg0, int arg1, int arg2) {
        if (!method539(arg0, arg1, arg2)) {
            return null;
        }
        class325[] var3 = new class325[Statics.field3875];
        for (int var4 = 0; var4 < Statics.field3875; var4++) {
            class325 var5 = var3[var4] = new class325();
            var5.field3867 = Statics.field3877;
            var5.field3865 = Statics.field3876;
            var5.field3868 = Statics.field1222[var4];
            var5.field3864 = Statics.field1105[var4];
            var5.field3863 = Statics.field515[var4];
            var5.field3870 = Statics.field1156[var4];
            int var6 = var5.field3870 * var5.field3863;
            byte[] var7 = Statics.field3878[var4];
            var5.field3866 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field3866[var8] = Statics.field3874[var7[var8] & 0xFF];
            }
        }
        method639();
        return var3;
    }

    @ObfuscatedName("cd.n(Lhq;III)Llx;")
    public static class325 method1991(class234 arg0, int arg1, int arg2) {
        return method539(arg0, arg1, arg2) ? method4870() : null;
    }

    @ObfuscatedName("jz.q(Lhq;Lhq;III)Lks;")
    public static class295 method4665(class234 arg0, class234 arg1, int arg2, int arg3) {
        return method539(arg0, arg2, arg3) ? method3377(arg1.method3873(arg2, arg3)) : null;
    }

    @ObfuscatedName("he.v(Lhq;Ljava/lang/String;Ljava/lang/String;I)[Llw;")
    public static class324[] method3743(class234 arg0, String arg1, String arg2) {
        int var3 = arg0.method3891(arg1);
        int var4 = arg0.method3870(var3, arg2);
        class324[] var5;
        if (method539(arg0, var3, var4)) {
            class324[] var6 = new class324[Statics.field3875];
            for (int var7 = 0; var7 < Statics.field3875; var7++) {
                class324 var8 = var6[var7] = new class324();
                var8.field3860 = Statics.field3877;
                var8.field3861 = Statics.field3876;
                var8.field3858 = Statics.field1222[var7];
                var8.field3859 = Statics.field1105[var7];
                var8.field3854 = Statics.field515[var7];
                var8.field3857 = Statics.field1156[var7];
                var8.field3856 = Statics.field3874;
                var8.field3855 = Statics.field3878[var7];
            }
            method639();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("gx.l(Lhq;Ljava/lang/String;Ljava/lang/String;I)Llw;")
    public static class324 method3399(class234 arg0, String arg1, String arg2) {
        int var3 = arg0.method3891(arg1);
        int var4 = arg0.method3870(var3, arg2);
        return method618(arg0, var3, var4);
    }

    @ObfuscatedName("as.o(I)Llw;")
    public static class324 method801() {
        class324 var0 = new class324();
        var0.field3860 = Statics.field3877;
        var0.field3861 = Statics.field3876;
        var0.field3858 = Statics.field1222[0];
        var0.field3859 = Statics.field1105[0];
        var0.field3854 = Statics.field515[0];
        var0.field3857 = Statics.field1156[0];
        var0.field3856 = Statics.field3874;
        var0.field3855 = Statics.field3878[0];
        method639();
        return var0;
    }

    @ObfuscatedName("ju.i(I)Llx;")
    public static class325 method4870() {
        class325 var0 = new class325();
        var0.field3867 = Statics.field3877;
        var0.field3865 = Statics.field3876;
        var0.field3868 = Statics.field1222[0];
        var0.field3864 = Statics.field1105[0];
        var0.field3863 = Statics.field515[0];
        var0.field3870 = Statics.field1156[0];
        int var1 = var0.field3870 * var0.field3863;
        byte[] var2 = Statics.field3878[0];
        var0.field3866 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3866[var3] = Statics.field3874[var2[var3] & 0xFF];
        }
        method639();
        return var0;
    }

    @ObfuscatedName("fc.d([BI)Lks;")
    public static class295 method3377(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class295 var1 = new class295(arg0, Statics.field1222, Statics.field1105, Statics.field515, Statics.field1156, Statics.field3874, Statics.field3878);
            method639();
            return var1;
        }
    }

    @ObfuscatedName("ak.m(Lhq;III)Z")
    public static boolean method539(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3873(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1119(var3);
            return true;
        }
    }

    @ObfuscatedName("bt.p([BI)V")
    public static void method1119(byte[] arg0) {
        class300 var1 = new class300(arg0);
        var1.field3694 = arg0.length - 2;
        Statics.field3875 = var1.method5166();
        Statics.field1222 = new int[Statics.field3875];
        Statics.field1105 = new int[Statics.field3875];
        Statics.field515 = new int[Statics.field3875];
        Statics.field1156 = new int[Statics.field3875];
        Statics.field3878 = new byte[Statics.field3875][];
        var1.field3694 = arg0.length - 7 - Statics.field3875 * 8;
        Statics.field3877 = var1.method5166();
        Statics.field3876 = var1.method5166();
        int var2 = (var1.method5123() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3875; var3++) {
            Statics.field1222[var3] = var1.method5166();
        }
        for (int var4 = 0; var4 < Statics.field3875; var4++) {
            Statics.field1105[var4] = var1.method5166();
        }
        for (int var5 = 0; var5 < Statics.field3875; var5++) {
            Statics.field515[var5] = var1.method5166();
        }
        for (int var6 = 0; var6 < Statics.field3875; var6++) {
            Statics.field1156[var6] = var1.method5166();
        }
        var1.field3694 = arg0.length - 7 - Statics.field3875 * 8 - (var2 - 1) * 3;
        Statics.field3874 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3874[var7] = var1.method5127();
            if (Statics.field3874[var7] == 0) {
                Statics.field3874[var7] = 1;
            }
        }
        var1.field3694 = 0;
        for (int var8 = 0; var8 < Statics.field3875; var8++) {
            int var9 = Statics.field515[var8];
            int var10 = Statics.field1156[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3878[var8] = var12;
            int var13 = var1.method5123();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method5268();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method5268();
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.h(I)V")
    public static void method639() {
        Statics.field1222 = null;
        Statics.field1105 = null;
        Statics.field515 = null;
        Statics.field1156 = null;
        Statics.field3874 = null;
        Statics.field3878 = (byte[][]) null;
    }
}
