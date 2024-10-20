package deob;

@ObfuscatedName("vq")
public class class550 {

    public class550() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iv.az(Loc;IIB)[Lvl;")
    public static class548[] method3944(class379 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6328(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method7827(var3);
            var4 = true;
        }
        return var4 ? method7662() : null;
    }

    @ObfuscatedName("oo.ah(Loc;III)Lvl;")
    public static class548 method6480(class379 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6328(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method7827(var3);
            var4 = true;
        }
        return var4 ? method3592() : null;
    }

    @ObfuscatedName("di.af(Loc;IIB)[Lvg;")
    public static class549[] method2272(class379 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6328(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method7827(var3);
            var4 = true;
        }
        return var4 ? method4565() : null;
    }

    @ObfuscatedName("cz.at(Loc;III)Lvg;")
    public static class549 method1978(class379 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6328(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method7827(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class549 var5 = new class549();
        var5.field5332 = Statics.field5345;
        var5.field5335 = Statics.field5343;
        var5.field5329 = Statics.field5344[0];
        var5.field5333 = Statics.field5348[0];
        var5.field5330 = Statics.field5346[0];
        var5.field5331 = Statics.field4802[0];
        int var6 = var5.field5331 * var5.field5330;
        byte[] var7 = Statics.field5347[0];
        var5.field5336 = new int[var6];
        for (int var8 = 0; var8 < var6; var8++) {
            var5.field5336[var8] = Statics.field1518[var7[var8] & 0xFF];
        }
        method3621();
        return var5;
    }

    @ObfuscatedName("qt.an(Loc;Ljava/lang/String;Ljava/lang/String;I)[Lvl;")
    public static class548[] method7006(class379 arg0, String arg1, String arg2) {
        if (arg0.method6411(arg1, arg2)) {
            int var3 = arg0.method6386(arg1);
            int var4 = arg0.method6345(var3, arg2);
            return method3944(arg0, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("fg.ao(Loc;Ljava/lang/String;Ljava/lang/String;I)Lvl;")
    public static class548 method3016(class379 arg0, String arg1, String arg2) {
        if (arg0.method6411(arg1, arg2)) {
            int var3 = arg0.method6386(arg1);
            int var4 = arg0.method6345(var3, arg2);
            return method6480(arg0, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("sh.ab(I)[Lvl;")
    public static class548[] method7662() {
        class548[] var0 = new class548[Statics.field5342];
        for (int var1 = 0; var1 < Statics.field5342; var1++) {
            class548 var2 = var0[var1] = new class548();
            var2.field5327 = Statics.field5345;
            var2.field5326 = Statics.field5343;
            var2.field5325 = Statics.field5344[var1];
            var2.field5323 = Statics.field5348[var1];
            var2.field5321 = Statics.field5346[var1];
            var2.field5324 = Statics.field4802[var1];
            var2.field5322 = Statics.field1518;
            var2.field5328 = Statics.field5347[var1];
        }
        method3621();
        return var0;
    }

    @ObfuscatedName("ib.aw(I)Lvl;")
    public static class548 method3592() {
        class548 var0 = new class548();
        var0.field5327 = Statics.field5345;
        var0.field5326 = Statics.field5343;
        var0.field5325 = Statics.field5344[0];
        var0.field5323 = Statics.field5348[0];
        var0.field5321 = Statics.field5346[0];
        var0.field5324 = Statics.field4802[0];
        var0.field5322 = Statics.field1518;
        var0.field5328 = Statics.field5347[0];
        Statics.field5344 = null;
        Statics.field5348 = null;
        Statics.field5346 = null;
        Statics.field4802 = null;
        Statics.field1518 = null;
        Statics.field5347 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("je.ad(I)[Lvg;")
    public static class549[] method4565() {
        class549[] var0 = new class549[Statics.field5342];
        for (int var1 = 0; var1 < Statics.field5342; var1++) {
            class549 var2 = var0[var1] = new class549();
            var2.field5332 = Statics.field5345;
            var2.field5335 = Statics.field5343;
            var2.field5329 = Statics.field5344[var1];
            var2.field5333 = Statics.field5348[var1];
            var2.field5330 = Statics.field5346[var1];
            var2.field5331 = Statics.field4802[var1];
            int var3 = var2.field5331 * var2.field5330;
            byte[] var4 = Statics.field5347[var1];
            var2.field5336 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field5336[var5] = Statics.field1518[var4[var5] & 0xFF];
            }
        }
        Statics.field5344 = null;
        Statics.field5348 = null;
        Statics.field5346 = null;
        Statics.field4802 = null;
        Statics.field1518 = null;
        Statics.field5347 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("si.al([BB)V")
    public static void method7827(byte[] arg0) {
        class535 var1 = new class535(arg0);
        var1.field5233 = arg0.length - 2;
        Statics.field5342 = var1.method8670();
        Statics.field5344 = new int[Statics.field5342];
        Statics.field5348 = new int[Statics.field5342];
        Statics.field5346 = new int[Statics.field5342];
        Statics.field4802 = new int[Statics.field5342];
        Statics.field5347 = new byte[Statics.field5342][];
        var1.field5233 = arg0.length - 7 - Statics.field5342 * 8;
        Statics.field5345 = var1.method8670();
        Statics.field5343 = var1.method8670();
        int var2 = (var1.method8462() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field5342; var3++) {
            Statics.field5344[var3] = var1.method8670();
        }
        for (int var4 = 0; var4 < Statics.field5342; var4++) {
            Statics.field5348[var4] = var1.method8670();
        }
        for (int var5 = 0; var5 < Statics.field5342; var5++) {
            Statics.field5346[var5] = var1.method8670();
        }
        for (int var6 = 0; var6 < Statics.field5342; var6++) {
            Statics.field4802[var6] = var1.method8670();
        }
        var1.field5233 = arg0.length - 7 - Statics.field5342 * 8 - (var2 - 1) * 3;
        Statics.field1518 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1518[var7] = var1.method8466();
            if (Statics.field1518[var7] == 0) {
                Statics.field1518[var7] = 1;
            }
        }
        var1.field5233 = 0;
        for (int var8 = 0; var8 < Statics.field5342; var8++) {
            int var9 = Statics.field5346[var8];
            int var10 = Statics.field4802[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field5347[var8] = var12;
            int var13 = var1.method8462();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method8463();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method8463();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ie.as(B)V")
    public static void method3621() {
        Statics.field5344 = null;
        Statics.field5348 = null;
        Statics.field5346 = null;
        Statics.field4802 = null;
        Statics.field1518 = null;
        Statics.field5347 = (byte[][]) null;
    }
}
