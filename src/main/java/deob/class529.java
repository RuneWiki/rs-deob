package deob;

@ObfuscatedName("uv")
public class class529 {

    public class529() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("de.aw(Lnd;III)Luu;")
    public static class527 method2203(class360 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6117(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3490(var3);
            var4 = true;
        }
        return var4 ? method2079() : null;
    }

    @ObfuscatedName("rp.ay(Lnd;III)[Lud;")
    public static class528[] method7579(class360 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6117(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3490(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class528[] var5 = new class528[Statics.field5179];
        for (int var6 = 0; var6 < Statics.field5179; var6++) {
            class528 var7 = var5[var6] = new class528();
            var7.field5165 = Statics.field5175;
            var7.field5163 = Statics.field5177;
            var7.field5166 = Statics.field4984[var6];
            var7.field5167 = Statics.field1598[var6];
            var7.field5169 = Statics.field1832[var6];
            var7.field5174 = Statics.field5178[var6];
            int var8 = var7.field5174 * var7.field5169;
            byte[] var9 = Statics.field4241[var6];
            var7.field5168 = new int[var8];
            for (int var10 = 0; var10 < var8; var10++) {
                var7.field5168[var10] = Statics.field5176[var9[var10] & 0xFF];
            }
        }
        method8143();
        return var5;
    }

    @ObfuscatedName("sq.ar(Lnd;IIB)Lud;")
    public static class528 method7931(class360 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6117(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3490(var3);
            var4 = true;
        }
        return var4 ? method3233() : null;
    }

    @ObfuscatedName("pf.am(Lnd;Lnd;IIS)Lpc;")
    public static class395 method6975(class360 arg0, class360 arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method6117(arg2, arg3);
        boolean var5;
        if (var4 == null) {
            var5 = false;
        } else {
            method3490(var4);
            var5 = true;
        }
        if (!var5) {
            return null;
        }
        byte[] var6 = arg1.method6117(arg2, arg3);
        class395 var7;
        if (var6 == null) {
            var7 = null;
        } else {
            class395 var8 = new class395(var6, Statics.field4984, Statics.field1598, Statics.field1832, Statics.field5178, Statics.field5176, Statics.field4241);
            method8143();
            var7 = var8;
        }
        return var7;
    }

    @ObfuscatedName("su.as(Lnd;Ljava/lang/String;Ljava/lang/String;I)[Luu;")
    public static class527[] method7668(class360 arg0, String arg1, String arg2) {
        if (!arg0.method6135(arg1, arg2)) {
            return null;
        }
        int var3 = arg0.method6129(arg1);
        int var4 = arg0.method6134(var3, arg2);
        byte[] var5 = arg0.method6117(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method3490(var5);
            var6 = true;
        }
        class527[] var7;
        if (var6) {
            class527[] var8 = new class527[Statics.field5179];
            for (int var9 = 0; var9 < Statics.field5179; var9++) {
                class527 var10 = var8[var9] = new class527();
                var10.field5162 = Statics.field5175;
                var10.field5159 = Statics.field5177;
                var10.field5158 = Statics.field4984[var9];
                var10.field5160 = Statics.field1598[var9];
                var10.field5157 = Statics.field1832[var9];
                var10.field5155 = Statics.field5178[var9];
                var10.field5156 = Statics.field5176;
                var10.field5161 = Statics.field4241[var9];
            }
            method8143();
            var7 = var8;
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("rm.aj(Lnd;Ljava/lang/String;Ljava/lang/String;I)Luu;")
    public static class527 method7552(class360 arg0, String arg1, String arg2) {
        if (arg0.method6135(arg1, arg2)) {
            int var3 = arg0.method6129(arg1);
            int var4 = arg0.method6134(var3, arg2);
            return method2203(arg0, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ta.ag(Lnd;IB)Luu;")
    public static class527 method8015(class360 arg0, int arg1) {
        byte[] var2 = arg0.method6123(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method3490(var2);
            var3 = true;
        }
        return var3 ? method2079() : null;
    }

    @ObfuscatedName("dc.az(I)Luu;")
    public static class527 method2079() {
        class527 var0 = new class527();
        var0.field5162 = Statics.field5175;
        var0.field5159 = Statics.field5177;
        var0.field5158 = Statics.field4984[0];
        var0.field5160 = Statics.field1598[0];
        var0.field5157 = Statics.field1832[0];
        var0.field5155 = Statics.field5178[0];
        var0.field5156 = Statics.field5176;
        var0.field5161 = Statics.field4241[0];
        method8143();
        return var0;
    }

    @ObfuscatedName("gk.av(B)Lud;")
    public static class528 method3233() {
        class528 var0 = new class528();
        var0.field5165 = Statics.field5175;
        var0.field5163 = Statics.field5177;
        var0.field5166 = Statics.field4984[0];
        var0.field5167 = Statics.field1598[0];
        var0.field5169 = Statics.field1832[0];
        var0.field5174 = Statics.field5178[0];
        int var1 = var0.field5174 * var0.field5169;
        byte[] var2 = Statics.field4241[0];
        var0.field5168 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field5168[var3] = Statics.field5176[var2[var3] & 0xFF];
        }
        method8143();
        return var0;
    }

    @ObfuscatedName("hn.ap([BI)V")
    public static void method3490(byte[] arg0) {
        class514 var1 = new class514(arg0);
        var1.field5072 = arg0.length - 2;
        Statics.field5179 = var1.method8246();
        Statics.field4984 = new int[Statics.field5179];
        Statics.field1598 = new int[Statics.field5179];
        Statics.field1832 = new int[Statics.field5179];
        Statics.field5178 = new int[Statics.field5179];
        Statics.field4241 = new byte[Statics.field5179][];
        var1.field5072 = arg0.length - 7 - Statics.field5179 * 8;
        Statics.field5175 = var1.method8246();
        Statics.field5177 = var1.method8246();
        int var2 = (var1.method8244() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field5179; var3++) {
            Statics.field4984[var3] = var1.method8246();
        }
        for (int var4 = 0; var4 < Statics.field5179; var4++) {
            Statics.field1598[var4] = var1.method8246();
        }
        for (int var5 = 0; var5 < Statics.field5179; var5++) {
            Statics.field1832[var5] = var1.method8246();
        }
        for (int var6 = 0; var6 < Statics.field5179; var6++) {
            Statics.field5178[var6] = var1.method8246();
        }
        var1.field5072 = arg0.length - 7 - Statics.field5179 * 8 - (var2 - 1) * 3;
        Statics.field5176 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field5176[var7] = var1.method8248();
            if (Statics.field5176[var7] == 0) {
                Statics.field5176[var7] = 1;
            }
        }
        var1.field5072 = 0;
        for (int var8 = 0; var8 < Statics.field5179; var8++) {
            int var9 = Statics.field1832[var8];
            int var10 = Statics.field5178[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field4241[var8] = var12;
            int var13 = var1.method8244();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method8264();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method8264();
                    }
                }
            }
        }
    }

    @ObfuscatedName("tk.aq(I)V")
    public static void method8143() {
        Statics.field4984 = null;
        Statics.field1598 = null;
        Statics.field1832 = null;
        Statics.field5178 = null;
        Statics.field5176 = null;
        Statics.field4241 = (byte[][]) null;
    }
}
