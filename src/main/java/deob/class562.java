package deob;

@ObfuscatedName("vh")
public class class562 {

    public class562() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mk.aq(Lok;IIB)[Lvv;")
    public static class560[] method5596(class388 arg0, int arg1, int arg2) {
        if (!method3083(arg0, arg1, arg2)) {
            return null;
        }
        class560[] var3 = new class560[Statics.field5474];
        for (int var4 = 0; var4 < Statics.field5474; var4++) {
            class560 var5 = var3[var4] = new class560();
            var5.field5455 = Statics.field5470;
            var5.field5454 = Statics.field5475;
            var5.field5450 = Statics.field1488[var4];
            var5.field5449 = Statics.field1688[var4];
            var5.field5451 = Statics.field5472[var4];
            var5.field5452 = Statics.field3267[var4];
            var5.field5456 = Statics.field5469;
            var5.field5453 = Statics.field5471[var4];
        }
        method6405();
        return var3;
    }

    @ObfuscatedName("sd.ad(Lok;IIB)[Lvg;")
    public static class561[] method7834(class388 arg0, int arg1, int arg2) {
        return method3083(arg0, arg1, arg2) ? method4449() : null;
    }

    @ObfuscatedName("ou.ag(Lok;III)Lvg;")
    public static class561 method6477(class388 arg0, int arg1, int arg2) {
        if (!method3083(arg0, arg1, arg2)) {
            return null;
        }
        class561 var3 = new class561();
        var3.field5462 = Statics.field5470;
        var3.field5463 = Statics.field5475;
        var3.field5460 = Statics.field1488[0];
        var3.field5457 = Statics.field1688[0];
        var3.field5458 = Statics.field5472[0];
        var3.field5461 = Statics.field3267[0];
        int var4 = var3.field5461 * var3.field5458;
        byte[] var5 = Statics.field5471[0];
        var3.field5466 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field5466[var6] = Statics.field5469[var5[var6] & 0xFF];
        }
        method6405();
        return var3;
    }

    @ObfuscatedName("fm.ak(Lok;Lok;III)Lqh;")
    public static class432 method3086(class388 arg0, class388 arg1, int arg2, int arg3) {
        if (!method3083(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method6539(arg2, arg3);
        class432 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class432 var6 = new class432(var4, Statics.field1488, Statics.field1688, Statics.field5472, Statics.field3267, Statics.field5469, Statics.field5471);
            method6405();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("pl.an(Lok;Ljava/lang/String;Ljava/lang/String;I)Lvv;")
    public static class560 method6773(class388 arg0, String arg1, String arg2) {
        if (!arg0.method6544(arg1, arg2)) {
            return null;
        }
        int var3 = arg0.method6555(arg1);
        int var4 = arg0.method6609(var3, arg2);
        class560 var5;
        if (method3083(arg0, var3, var4)) {
            var5 = method3181();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("rx.aj(Lok;Lok;Ljava/lang/String;Ljava/lang/String;I)Lqh;")
    public static class432 method7661(class388 arg0, class388 arg1, String arg2, String arg3) {
        if (!arg0.method6544(arg2, arg3)) {
            return null;
        }
        int var4 = arg0.method6555(arg2);
        int var5 = arg0.method6609(var4, arg3);
        class432 var6;
        if (method3083(arg0, var4, var5)) {
            byte[] var7 = arg1.method6539(var4, var5);
            class432 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class432 var9 = new class432(var7, Statics.field1488, Statics.field1688, Statics.field5472, Statics.field3267, Statics.field5469, Statics.field5471);
                method6405();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("la.av(Lok;IB)Lvv;")
    public static class560 method5459(class388 arg0, int arg1) {
        byte[] var2 = arg0.method6545(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method8034(var2);
            var3 = true;
        }
        return var3 ? method3181() : null;
    }

    @ObfuscatedName("ge.ab(I)Lvv;")
    public static class560 method3181() {
        class560 var0 = new class560();
        var0.field5455 = Statics.field5470;
        var0.field5454 = Statics.field5475;
        var0.field5450 = Statics.field1488[0];
        var0.field5449 = Statics.field1688[0];
        var0.field5451 = Statics.field5472[0];
        var0.field5452 = Statics.field3267[0];
        var0.field5456 = Statics.field5469;
        var0.field5453 = Statics.field5471[0];
        method6405();
        return var0;
    }

    @ObfuscatedName("jc.ai(I)[Lvg;")
    public static class561[] method4449() {
        class561[] var0 = new class561[Statics.field5474];
        for (int var1 = 0; var1 < Statics.field5474; var1++) {
            class561 var2 = var0[var1] = new class561();
            var2.field5462 = Statics.field5470;
            var2.field5463 = Statics.field5475;
            var2.field5460 = Statics.field1488[var1];
            var2.field5457 = Statics.field1688[var1];
            var2.field5458 = Statics.field5472[var1];
            var2.field5461 = Statics.field3267[var1];
            int var3 = var2.field5461 * var2.field5458;
            byte[] var4 = Statics.field5471[var1];
            var2.field5466 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field5466[var5] = Statics.field5469[var4[var5] & 0xFF];
            }
        }
        method6405();
        return var0;
    }

    @ObfuscatedName("fu.ae(Lok;III)Z")
    public static boolean method3083(class388 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6539(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method8034(var3);
            return true;
        }
    }

    @ObfuscatedName("sw.au([BI)V")
    public static void method8034(byte[] arg0) {
        class547 var1 = new class547(arg0);
        var1.field5363 = arg0.length - 2;
        Statics.field5474 = var1.method8899();
        Statics.field1488 = new int[Statics.field5474];
        Statics.field1688 = new int[Statics.field5474];
        Statics.field5472 = new int[Statics.field5474];
        Statics.field3267 = new int[Statics.field5474];
        Statics.field5471 = new byte[Statics.field5474][];
        var1.field5363 = arg0.length - 7 - Statics.field5474 * 8;
        Statics.field5470 = var1.method8899();
        Statics.field5475 = var1.method8899();
        int var2 = (var1.method8804() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field5474; var3++) {
            Statics.field1488[var3] = var1.method8899();
        }
        for (int var4 = 0; var4 < Statics.field5474; var4++) {
            Statics.field1688[var4] = var1.method8899();
        }
        for (int var5 = 0; var5 < Statics.field5474; var5++) {
            Statics.field5472[var5] = var1.method8899();
        }
        for (int var6 = 0; var6 < Statics.field5474; var6++) {
            Statics.field3267[var6] = var1.method8899();
        }
        var1.field5363 = arg0.length - 7 - Statics.field5474 * 8 - (var2 - 1) * 3;
        Statics.field5469 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field5469[var7] = var1.method8732();
            if (Statics.field5469[var7] == 0) {
                Statics.field5469[var7] = 1;
            }
        }
        var1.field5363 = 0;
        for (int var8 = 0; var8 < Statics.field5474; var8++) {
            int var9 = Statics.field5472[var8];
            int var10 = Statics.field3267[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field5471[var8] = var12;
            int var13 = var1.method8804();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method8857();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method8857();
                    }
                }
            }
        }
    }

    @ObfuscatedName("nr.ah(I)V")
    public static void method6405() {
        Statics.field1488 = null;
        Statics.field1688 = null;
        Statics.field5472 = null;
        Statics.field3267 = null;
        Statics.field5469 = null;
        Statics.field5471 = (byte[][]) null;
    }
}
