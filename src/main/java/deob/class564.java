package deob;

@ObfuscatedName("vv")
public class class564 {

    public class564() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.ab(Lob;III)[Lvb;")
    public static class562[] method2310(class389 arg0, int arg1, int arg2) {
        if (!method7069(arg0, arg1, arg2)) {
            return null;
        }
        class562[] var3 = new class562[Statics.field5489];
        for (int var4 = 0; var4 < Statics.field5489; var4++) {
            class562 var5 = var3[var4] = new class562();
            var5.field5475 = Statics.field3978;
            var5.field5474 = Statics.field5490;
            var5.field5473 = Statics.field1681[var4];
            var5.field5471 = Statics.field5491[var4];
            var5.field5476 = Statics.field5492[var4];
            var5.field5472 = Statics.field4030[var4];
            var5.field5470 = Statics.field2966;
            var5.field5469 = Statics.field5493[var4];
        }
        Statics.field1681 = null;
        Statics.field5491 = null;
        Statics.field5492 = null;
        Statics.field4030 = null;
        Statics.field2966 = null;
        Statics.field5493 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("rd.ay(Lob;III)[Lvc;")
    public static class563[] method7766(class389 arg0, int arg1, int arg2) {
        if (!method7069(arg0, arg1, arg2)) {
            return null;
        }
        class563[] var3 = new class563[Statics.field5489];
        for (int var4 = 0; var4 < Statics.field5489; var4++) {
            class563 var5 = var3[var4] = new class563();
            var5.field5477 = Statics.field3978;
            var5.field5483 = Statics.field5490;
            var5.field5480 = Statics.field1681[var4];
            var5.field5484 = Statics.field5491[var4];
            var5.field5478 = Statics.field5492[var4];
            var5.field5479 = Statics.field4030[var4];
            int var6 = var5.field5479 * var5.field5478;
            byte[] var7 = Statics.field5493[var4];
            var5.field5481 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field5481[var8] = Statics.field2966[var7[var8] & 0xFF];
            }
        }
        Statics.field1681 = null;
        Statics.field5491 = null;
        Statics.field5492 = null;
        Statics.field4030 = null;
        Statics.field2966 = null;
        Statics.field5493 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("hg.an(Lob;III)Lvc;")
    public static class563 method3898(class389 arg0, int arg1, int arg2) {
        return method7069(arg0, arg1, arg2) ? method5866() : null;
    }

    @ObfuscatedName("bv.au(Lob;Lob;III)Lqe;")
    public static class433 method653(class389 arg0, class389 arg1, int arg2, int arg3) {
        return method7069(arg0, arg2, arg3) ? method7667(arg1.method6670(arg2, arg3)) : null;
    }

    @ObfuscatedName("uq.ax(Lob;Ljava/lang/String;Ljava/lang/String;I)[Lvb;")
    public static class562[] method8730(class389 arg0, String arg1, String arg2) {
        if (arg0.method6728(arg1, arg2)) {
            int var3 = arg0.method6654(arg1);
            int var4 = arg0.method6655(var3, arg2);
            return method2310(arg0, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("eb.ao(Lob;Ljava/lang/String;Ljava/lang/String;B)Lvb;")
    public static class562 method2731(class389 arg0, String arg1, String arg2) {
        if (!arg0.method6728(arg1, arg2)) {
            return null;
        }
        int var3 = arg0.method6654(arg1);
        int var4 = arg0.method6655(var3, arg2);
        class562 var5;
        if (method7069(arg0, var3, var4)) {
            class562 var6 = new class562();
            var6.field5475 = Statics.field3978;
            var6.field5474 = Statics.field5490;
            var6.field5473 = Statics.field1681[0];
            var6.field5471 = Statics.field5491[0];
            var6.field5476 = Statics.field5492[0];
            var6.field5472 = Statics.field4030[0];
            var6.field5470 = Statics.field2966;
            var6.field5469 = Statics.field5493[0];
            Statics.field1681 = null;
            Statics.field5491 = null;
            Statics.field5492 = null;
            Statics.field4030 = null;
            Statics.field2966 = null;
            Statics.field5493 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("jx.am(Lob;Ljava/lang/String;Ljava/lang/String;I)[Lvc;")
    public static class563[] method4569(class389 arg0, String arg1, String arg2) {
        if (arg0.method6728(arg1, arg2)) {
            int var3 = arg0.method6654(arg1);
            int var4 = arg0.method6655(var3, arg2);
            return method7766(arg0, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("mq.ac(I)Lvc;")
    public static class563 method5866() {
        class563 var0 = new class563();
        var0.field5477 = Statics.field3978;
        var0.field5483 = Statics.field5490;
        var0.field5480 = Statics.field1681[0];
        var0.field5484 = Statics.field5491[0];
        var0.field5478 = Statics.field5492[0];
        var0.field5479 = Statics.field4030[0];
        int var1 = var0.field5479 * var0.field5478;
        byte[] var2 = Statics.field5493[0];
        var0.field5481 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field5481[var3] = Statics.field2966[var2[var3] & 0xFF];
        }
        Statics.field1681 = null;
        Statics.field5491 = null;
        Statics.field5492 = null;
        Statics.field4030 = null;
        Statics.field2966 = null;
        Statics.field5493 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ro.ae([BI)Lqe;")
    public static class433 method7667(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class433 var1 = new class433(arg0, Statics.field1681, Statics.field5491, Statics.field5492, Statics.field4030, Statics.field2966, Statics.field5493);
        Statics.field1681 = null;
        Statics.field5491 = null;
        Statics.field5492 = null;
        Statics.field4030 = null;
        Statics.field2966 = null;
        Statics.field5493 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("pm.ad(Lob;III)Z")
    public static boolean method7069(class389 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6670(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2626(var3);
            return true;
        }
    }

    @ObfuscatedName("dy.aq([BI)V")
    public static void method2626(byte[] arg0) {
        class549 var1 = new class549(arg0);
        var1.field5378 = arg0.length - 2;
        Statics.field5489 = var1.method8968();
        Statics.field1681 = new int[Statics.field5489];
        Statics.field5491 = new int[Statics.field5489];
        Statics.field5492 = new int[Statics.field5489];
        Statics.field4030 = new int[Statics.field5489];
        Statics.field5493 = new byte[Statics.field5489][];
        var1.field5378 = arg0.length - 7 - Statics.field5489 * 8;
        Statics.field3978 = var1.method8968();
        Statics.field5490 = var1.method8968();
        int var2 = (var1.method9025() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field5489; var3++) {
            Statics.field1681[var3] = var1.method8968();
        }
        for (int var4 = 0; var4 < Statics.field5489; var4++) {
            Statics.field5491[var4] = var1.method8968();
        }
        for (int var5 = 0; var5 < Statics.field5489; var5++) {
            Statics.field5492[var5] = var1.method8968();
        }
        for (int var6 = 0; var6 < Statics.field5489; var6++) {
            Statics.field4030[var6] = var1.method8968();
        }
        var1.field5378 = arg0.length - 7 - Statics.field5489 * 8 - (var2 - 1) * 3;
        Statics.field2966 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2966[var7] = var1.method8801();
            if (Statics.field2966[var7] == 0) {
                Statics.field2966[var7] = 1;
            }
        }
        var1.field5378 = 0;
        for (int var8 = 0; var8 < Statics.field5489; var8++) {
            int var9 = Statics.field5492[var8];
            int var10 = Statics.field4030[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field5493[var8] = var12;
            int var13 = var1.method9025();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method8798();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method8798();
                    }
                }
            }
        }
    }
}
