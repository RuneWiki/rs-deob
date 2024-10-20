package deob;

@ObfuscatedName("sa")
public class class493 {

    public class493() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("rn.aj(Lne;III)[Lsp;")
    public static class491[] method7638(class340 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5860(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3806(var3);
            var4 = true;
        }
        return var4 ? method2888() : null;
    }

    @ObfuscatedName("cw.al(Lne;IIB)Lsp;")
    public static class491 method1965(class340 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5860(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3806(var3);
            var4 = true;
        }
        return var4 ? method6059() : null;
    }

    @ObfuscatedName("cu.ac(Lne;IIB)[Lsn;")
    public static class492[] method1952(class340 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5860(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3806(var3);
            var4 = true;
        }
        return var4 ? method4393() : null;
    }

    @ObfuscatedName("kn.ab(Lne;IIB)Lsn;")
    public static class492 method4861(class340 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5860(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3806(var3);
            var4 = true;
        }
        return var4 ? method52() : null;
    }

    @ObfuscatedName("ov.an(Lne;Ljava/lang/String;Ljava/lang/String;I)Lsp;")
    public static class491 method6337(class340 arg0, String arg1, String arg2) {
        int var3 = arg0.method5875(arg1);
        int var4 = arg0.method5876(var3, arg2);
        return method1965(arg0, var3, var4);
    }

    @ObfuscatedName("kq.ao(Lne;Ljava/lang/String;Ljava/lang/String;B)[Lsn;")
    public static class492[] method4941(class340 arg0, String arg1, String arg2) {
        int var3 = arg0.method5875(arg1);
        int var4 = arg0.method5876(var3, arg2);
        return method1952(arg0, var3, var4);
    }

    @ObfuscatedName("sz.av(Lne;Lne;Ljava/lang/String;Ljava/lang/String;I)Loe;")
    public static class375 method8178(class340 arg0, class340 arg1, String arg2, String arg3) {
        int var4 = arg0.method5875(arg2);
        int var5 = arg0.method5876(var4, arg3);
        byte[] var6 = arg0.method5860(var4, var5);
        boolean var7;
        if (var6 == null) {
            var7 = false;
        } else {
            method3806(var6);
            var7 = true;
        }
        class375 var8;
        if (var7) {
            byte[] var9 = arg1.method5860(var4, var5);
            class375 var10;
            if (var9 == null) {
                var10 = null;
            } else {
                class375 var11 = new class375(var9, Statics.field5010, Statics.field125, Statics.field1045, Statics.field1645, Statics.field1881, Statics.field1646);
                method6860();
                var10 = var11;
            }
            var8 = var10;
        } else {
            var8 = null;
        }
        return var8;
    }

    @ObfuscatedName("bb.aq(Lne;II)Lsp;")
    public static class491 method824(class340 arg0, int arg1) {
        byte[] var2 = arg0.method5865(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method3806(var2);
            var3 = true;
        }
        return var3 ? method6059() : null;
    }

    @ObfuscatedName("fz.ap(I)[Lsp;")
    public static class491[] method2888() {
        class491[] var0 = new class491[Statics.field5008];
        for (int var1 = 0; var1 < Statics.field5008; var1++) {
            class491 var2 = var0[var1] = new class491();
            var2.field4993 = Statics.field5007;
            var2.field4989 = Statics.field5009;
            var2.field4991 = Statics.field5010[var1];
            var2.field4994 = Statics.field125[var1];
            var2.field4992 = Statics.field1045[var1];
            var2.field4987 = Statics.field1645[var1];
            var2.field4988 = Statics.field1881;
            var2.field4990 = Statics.field1646[var1];
        }
        method6860();
        return var0;
    }

    @ObfuscatedName("np.ar(B)Lsp;")
    public static class491 method6059() {
        class491 var0 = new class491();
        var0.field4993 = Statics.field5007;
        var0.field4989 = Statics.field5009;
        var0.field4991 = Statics.field5010[0];
        var0.field4994 = Statics.field125[0];
        var0.field4992 = Statics.field1045[0];
        var0.field4987 = Statics.field1645[0];
        var0.field4988 = Statics.field1881;
        var0.field4990 = Statics.field1646[0];
        method6860();
        return var0;
    }

    @ObfuscatedName("iv.ak(I)[Lsn;")
    public static class492[] method4393() {
        class492[] var0 = new class492[Statics.field5008];
        for (int var1 = 0; var1 < Statics.field5008; var1++) {
            class492 var2 = var0[var1] = new class492();
            var2.field5000 = Statics.field5007;
            var2.field5001 = Statics.field5009;
            var2.field4998 = Statics.field5010[var1];
            var2.field4999 = Statics.field125[var1];
            var2.field5006 = Statics.field1045[var1];
            var2.field4996 = Statics.field1645[var1];
            int var3 = var2.field5006 * var2.field4996;
            byte[] var4 = Statics.field1646[var1];
            var2.field4997 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field4997[var5] = Statics.field1881[var4[var5] & 0xFF];
            }
        }
        method6860();
        return var0;
    }

    @ObfuscatedName("aq.ax(I)Lsn;")
    public static class492 method52() {
        class492 var0 = new class492();
        var0.field5000 = Statics.field5007;
        var0.field5001 = Statics.field5009;
        var0.field4998 = Statics.field5010[0];
        var0.field4999 = Statics.field125[0];
        var0.field5006 = Statics.field1045[0];
        var0.field4996 = Statics.field1645[0];
        int var1 = var0.field5006 * var0.field4996;
        byte[] var2 = Statics.field1646[0];
        var0.field4997 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field4997[var3] = Statics.field1881[var2[var3] & 0xFF];
        }
        method6860();
        return var0;
    }

    @ObfuscatedName("im.as([BI)V")
    public static void method3806(byte[] arg0) {
        class478 var1 = new class478(arg0);
        var1.field4904 = arg0.length - 2;
        Statics.field5008 = var1.method7905();
        Statics.field5010 = new int[Statics.field5008];
        Statics.field125 = new int[Statics.field5008];
        Statics.field1045 = new int[Statics.field5008];
        Statics.field1645 = new int[Statics.field5008];
        Statics.field1646 = new byte[Statics.field5008][];
        var1.field4904 = arg0.length - 7 - Statics.field5008 * 8;
        Statics.field5007 = var1.method7905();
        Statics.field5009 = var1.method7905();
        int var2 = (var1.method7909() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field5008; var3++) {
            Statics.field5010[var3] = var1.method7905();
        }
        for (int var4 = 0; var4 < Statics.field5008; var4++) {
            Statics.field125[var4] = var1.method7905();
        }
        for (int var5 = 0; var5 < Statics.field5008; var5++) {
            Statics.field1045[var5] = var1.method7905();
        }
        for (int var6 = 0; var6 < Statics.field5008; var6++) {
            Statics.field1645[var6] = var1.method7905();
        }
        var1.field4904 = arg0.length - 7 - Statics.field5008 * 8 - (var2 - 1) * 3;
        Statics.field1881 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1881[var7] = var1.method7907();
            if (Statics.field1881[var7] == 0) {
                Statics.field1881[var7] = 1;
            }
        }
        var1.field4904 = 0;
        for (int var8 = 0; var8 < Statics.field5008; var8++) {
            int var9 = Statics.field1045[var8];
            int var10 = Statics.field1645[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1646[var8] = var12;
            int var13 = var1.method7909();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method8163();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method8163();
                    }
                }
            }
        }
    }

    @ObfuscatedName("py.ay(I)V")
    public static void method6860() {
        Statics.field5010 = null;
        Statics.field125 = null;
        Statics.field1045 = null;
        Statics.field1645 = null;
        Statics.field1881 = null;
        Statics.field1646 = (byte[][]) null;
    }
}
