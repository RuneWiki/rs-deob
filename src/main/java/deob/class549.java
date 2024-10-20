package deob;

@ObfuscatedName("vp")
public class class549 {

    public class549() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ny.aq(Lof;III)Lvg;")
    public static class547 method6312(class378 arg0, int arg1, int arg2) {
        return method2926(arg0, arg1, arg2) ? method2013() : null;
    }

    @ObfuscatedName("iv.al(Lof;III)Lvd;")
    public static class548 method3899(class378 arg0, int arg1, int arg2) {
        return method2926(arg0, arg1, arg2) ? method2116() : null;
    }

    @ObfuscatedName("hf.ai(Lof;Ljava/lang/String;Ljava/lang/String;I)[Lvg;")
    public static class547[] method3698(class378 arg0, String arg1, String arg2) {
        if (!arg0.method6496(arg1, arg2)) {
            return null;
        }
        int var3 = arg0.method6435(arg1);
        int var4 = arg0.method6436(var3, arg2);
        class547[] var5;
        if (method2926(arg0, var3, var4)) {
            class547[] var6 = new class547[Statics.field5312];
            for (int var7 = 0; var7 < Statics.field5312; var7++) {
                class547 var8 = var6[var7] = new class547();
                var8.field5294 = Statics.field5309;
                var8.field5291 = Statics.field5310;
                var8.field5292 = Statics.field5311[var7];
                var8.field5293 = Statics.field5313[var7];
                var8.field5290 = Statics.field2482[var7];
                var8.field5295 = Statics.field5315[var7];
                var8.field5289 = Statics.field4778;
                var8.field5288 = Statics.field5314[var7];
            }
            Statics.field5311 = null;
            Statics.field5313 = null;
            Statics.field2482 = null;
            Statics.field5315 = null;
            Statics.field4778 = null;
            Statics.field5314 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("gq.ar(Lof;Ljava/lang/String;Ljava/lang/String;I)Lvg;")
    public static class547 method3219(class378 arg0, String arg1, String arg2) {
        if (arg0.method6496(arg1, arg2)) {
            int var3 = arg0.method6435(arg1);
            int var4 = arg0.method6436(var3, arg2);
            return method6312(arg0, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("hh.as(Lof;Ljava/lang/String;Ljava/lang/String;B)[Lvd;")
    public static class548[] method3544(class378 arg0, String arg1, String arg2) {
        if (arg0.method6496(arg1, arg2)) {
            int var3 = arg0.method6435(arg1);
            int var4 = arg0.method6436(var3, arg2);
            return Statics.method2990(arg0, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gw.aa(Lof;IB)Lvg;")
    public static class547 method3150(class378 arg0, int arg1) {
        byte[] var2 = arg0.method6425(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method5449(var2);
            var3 = true;
        }
        return var3 ? method2013() : null;
    }

    @ObfuscatedName("ca.az(I)Lvg;")
    public static class547 method2013() {
        class547 var0 = new class547();
        var0.field5294 = Statics.field5309;
        var0.field5291 = Statics.field5310;
        var0.field5292 = Statics.field5311[0];
        var0.field5293 = Statics.field5313[0];
        var0.field5290 = Statics.field2482[0];
        var0.field5295 = Statics.field5315[0];
        var0.field5289 = Statics.field4778;
        var0.field5288 = Statics.field5314[0];
        Statics.field5311 = null;
        Statics.field5313 = null;
        Statics.field2482 = null;
        Statics.field5315 = null;
        Statics.field4778 = null;
        Statics.field5314 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("cr.ao(I)Lvd;")
    public static class548 method2116() {
        class548 var0 = new class548();
        var0.field5297 = Statics.field5309;
        var0.field5302 = Statics.field5310;
        var0.field5299 = Statics.field5311[0];
        var0.field5305 = Statics.field5313[0];
        var0.field5304 = Statics.field2482[0];
        var0.field5298 = Statics.field5315[0];
        int var1 = var0.field5304 * var0.field5298;
        byte[] var2 = Statics.field5314[0];
        var0.field5296 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field5296[var3] = Statics.field4778[var2[var3] & 0xFF];
        }
        Statics.field5311 = null;
        Statics.field5313 = null;
        Statics.field2482 = null;
        Statics.field5315 = null;
        Statics.field4778 = null;
        Statics.field5314 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("uu.au([BI)Lpb;")
    public static class413 method8535(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class413 var1 = new class413(arg0, Statics.field5311, Statics.field5313, Statics.field2482, Statics.field5315, Statics.field4778, Statics.field5314);
        Statics.field5311 = null;
        Statics.field5313 = null;
        Statics.field2482 = null;
        Statics.field5315 = null;
        Statics.field4778 = null;
        Statics.field5314 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("fh.ak(Lof;IIB)Z")
    public static boolean method2926(class378 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6489(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method5449(var3);
            return true;
        }
    }

    @ObfuscatedName("mj.ah([BS)V")
    public static void method5449(byte[] arg0) {
        class534 var1 = new class534(arg0);
        var1.field5200 = arg0.length - 2;
        Statics.field5312 = var1.method8593();
        Statics.field5311 = new int[Statics.field5312];
        Statics.field5313 = new int[Statics.field5312];
        Statics.field2482 = new int[Statics.field5312];
        Statics.field5315 = new int[Statics.field5312];
        Statics.field5314 = new byte[Statics.field5312][];
        var1.field5200 = arg0.length - 7 - Statics.field5312 * 8;
        Statics.field5309 = var1.method8593();
        Statics.field5310 = var1.method8593();
        int var2 = (var1.method8591() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field5312; var3++) {
            Statics.field5311[var3] = var1.method8593();
        }
        for (int var4 = 0; var4 < Statics.field5312; var4++) {
            Statics.field5313[var4] = var1.method8593();
        }
        for (int var5 = 0; var5 < Statics.field5312; var5++) {
            Statics.field2482[var5] = var1.method8593();
        }
        for (int var6 = 0; var6 < Statics.field5312; var6++) {
            Statics.field5315[var6] = var1.method8593();
        }
        var1.field5200 = arg0.length - 7 - Statics.field5312 * 8 - (var2 - 1) * 3;
        Statics.field4778 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field4778[var7] = var1.method8595();
            if (Statics.field4778[var7] == 0) {
                Statics.field4778[var7] = 1;
            }
        }
        var1.field5200 = 0;
        for (int var8 = 0; var8 < Statics.field5312; var8++) {
            int var9 = Statics.field2482[var8];
            int var10 = Statics.field5315[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field5314[var8] = var12;
            int var13 = var1.method8591();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method8592();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method8592();
                    }
                }
            }
        }
    }
}
