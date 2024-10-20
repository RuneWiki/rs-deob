package deob;

@ObfuscatedName("uc")
public class class542 {

    public class542() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hm.at(Lol;IIB)Lup;")
    public static class540 method3782(class371 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6284(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3171(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class540 var5 = new class540();
        var5.field5227 = Statics.field5247;
        var5.field5234 = Statics.field4360;
        var5.field5231 = Statics.field5248[0];
        var5.field5233 = Statics.field5250[0];
        var5.field5229 = Statics.field5251[0];
        var5.field5230 = Statics.field5090[0];
        var5.field5228 = Statics.field5252;
        var5.field5232 = Statics.field4452[0];
        Statics.field5248 = null;
        Statics.field5250 = null;
        Statics.field5251 = null;
        Statics.field5090 = null;
        Statics.field5252 = null;
        Statics.field4452 = (byte[][]) null;
        return var5;
    }

    @ObfuscatedName("ky.ah(Lol;IIB)[Luz;")
    public static class541[] method5165(class371 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6284(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3171(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class541[] var5 = new class541[Statics.field5249];
        for (int var6 = 0; var6 < Statics.field5249; var6++) {
            class541 var7 = var5[var6] = new class541();
            var7.field5240 = Statics.field5247;
            var7.field5241 = Statics.field4360;
            var7.field5238 = Statics.field5248[var6];
            var7.field5243 = Statics.field5250[var6];
            var7.field5236 = Statics.field5251[var6];
            var7.field5239 = Statics.field5090[var6];
            int var8 = var7.field5239 * var7.field5236;
            byte[] var9 = Statics.field4452[var6];
            var7.field5244 = new int[var8];
            for (int var10 = 0; var10 < var8; var10++) {
                var7.field5244[var10] = Statics.field5252[var9[var10] & 0xFF];
            }
        }
        Statics.field5248 = null;
        Statics.field5250 = null;
        Statics.field5251 = null;
        Statics.field5090 = null;
        Statics.field5252 = null;
        Statics.field4452 = (byte[][]) null;
        return var5;
    }

    @ObfuscatedName("qs.ar(Lol;IIB)Luz;")
    public static class541 method7349(class371 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6284(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3171(var3);
            var4 = true;
        }
        return var4 ? method4502() : null;
    }

    @ObfuscatedName("nj.ao(Lol;Ljava/lang/String;Ljava/lang/String;I)[Lup;")
    public static class540[] method6197(class371 arg0, String arg1, String arg2) {
        if (!arg0.method6302(arg1, arg2)) {
            return null;
        }
        int var3 = arg0.method6300(arg1);
        int var4 = arg0.method6301(var3, arg2);
        byte[] var5 = arg0.method6284(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method3171(var5);
            var6 = true;
        }
        class540[] var7;
        if (var6) {
            var7 = method8311();
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("md.ab(Lol;Ljava/lang/String;Ljava/lang/String;B)Lup;")
    public static class540 method5344(class371 arg0, String arg1, String arg2) {
        if (arg0.method6302(arg1, arg2)) {
            int var3 = arg0.method6300(arg1);
            int var4 = arg0.method6301(var3, arg2);
            return method3782(arg0, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ev.au(Lol;Ljava/lang/String;Ljava/lang/String;I)[Luz;")
    public static class541[] method2631(class371 arg0, String arg1, String arg2) {
        if (arg0.method6302(arg1, arg2)) {
            int var3 = arg0.method6300(arg1);
            int var4 = arg0.method6301(var3, arg2);
            return method5165(arg0, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ap.aa(Lol;Lol;Ljava/lang/String;Ljava/lang/String;B)Lpf;")
    public static class406 method104(class371 arg0, class371 arg1, String arg2, String arg3) {
        if (!arg0.method6302(arg2, arg3)) {
            return null;
        }
        int var4 = arg0.method6300(arg2);
        int var5 = arg0.method6301(var4, arg3);
        byte[] var6 = arg0.method6284(var4, var5);
        boolean var7;
        if (var6 == null) {
            var7 = false;
        } else {
            method3171(var6);
            var7 = true;
        }
        class406 var8;
        if (var7) {
            var8 = method4213(arg1.method6284(var4, var5));
        } else {
            var8 = null;
        }
        return var8;
    }

    @ObfuscatedName("te.ac(I)[Lup;")
    public static class540[] method8311() {
        class540[] var0 = new class540[Statics.field5249];
        for (int var1 = 0; var1 < Statics.field5249; var1++) {
            class540 var2 = var0[var1] = new class540();
            var2.field5227 = Statics.field5247;
            var2.field5234 = Statics.field4360;
            var2.field5231 = Statics.field5248[var1];
            var2.field5233 = Statics.field5250[var1];
            var2.field5229 = Statics.field5251[var1];
            var2.field5230 = Statics.field5090[var1];
            var2.field5228 = Statics.field5252;
            var2.field5232 = Statics.field4452[var1];
        }
        method7630();
        return var0;
    }

    @ObfuscatedName("jz.al(B)Luz;")
    public static class541 method4502() {
        class541 var0 = new class541();
        var0.field5240 = Statics.field5247;
        var0.field5241 = Statics.field4360;
        var0.field5238 = Statics.field5248[0];
        var0.field5243 = Statics.field5250[0];
        var0.field5236 = Statics.field5251[0];
        var0.field5239 = Statics.field5090[0];
        int var1 = var0.field5239 * var0.field5236;
        byte[] var2 = Statics.field4452[0];
        var0.field5244 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field5244[var3] = Statics.field5252[var2[var3] & 0xFF];
        }
        method7630();
        return var0;
    }

    @ObfuscatedName("jv.az([BB)Lpf;")
    public static class406 method4213(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class406 var1 = new class406(arg0, Statics.field5248, Statics.field5250, Statics.field5251, Statics.field5090, Statics.field5252, Statics.field4452);
            method7630();
            return var1;
        }
    }

    @ObfuscatedName("hp.ap(Lol;IB)Z")
    public static boolean method3368(class371 arg0, int arg1) {
        byte[] var2 = arg0.method6298(arg1);
        if (var2 == null) {
            return false;
        } else {
            method3171(var2);
            return true;
        }
    }

    @ObfuscatedName("gp.av([BB)V")
    public static void method3171(byte[] arg0) {
        class527 var1 = new class527(arg0);
        var1.field5137 = arg0.length - 2;
        Statics.field5249 = var1.method8412();
        Statics.field5248 = new int[Statics.field5249];
        Statics.field5250 = new int[Statics.field5249];
        Statics.field5251 = new int[Statics.field5249];
        Statics.field5090 = new int[Statics.field5249];
        Statics.field4452 = new byte[Statics.field5249][];
        var1.field5137 = arg0.length - 7 - Statics.field5249 * 8;
        Statics.field5247 = var1.method8412();
        Statics.field4360 = var1.method8412();
        int var2 = (var1.method8410() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field5249; var3++) {
            Statics.field5248[var3] = var1.method8412();
        }
        for (int var4 = 0; var4 < Statics.field5249; var4++) {
            Statics.field5250[var4] = var1.method8412();
        }
        for (int var5 = 0; var5 < Statics.field5249; var5++) {
            Statics.field5251[var5] = var1.method8412();
        }
        for (int var6 = 0; var6 < Statics.field5249; var6++) {
            Statics.field5090[var6] = var1.method8412();
        }
        var1.field5137 = arg0.length - 7 - Statics.field5249 * 8 - (var2 - 1) * 3;
        Statics.field5252 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field5252[var7] = var1.method8414();
            if (Statics.field5252[var7] == 0) {
                Statics.field5252[var7] = 1;
            }
        }
        var1.field5137 = 0;
        for (int var8 = 0; var8 < Statics.field5249; var8++) {
            int var9 = Statics.field5251[var8];
            int var10 = Statics.field5090[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field4452[var8] = var12;
            int var13 = var1.method8410();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method8616();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method8616();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ry.ax(I)V")
    public static void method7630() {
        Statics.field5248 = null;
        Statics.field5250 = null;
        Statics.field5251 = null;
        Statics.field5090 = null;
        Statics.field5252 = null;
        Statics.field4452 = (byte[][]) null;
    }
}
