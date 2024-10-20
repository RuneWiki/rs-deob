package deob;

@ObfuscatedName("uf")
public class class546 {

    public class546() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hk.am(Low;IIB)[Lut;")
    public static class544[] method3531(class375 arg0, int arg1, int arg2) {
        if (!method2710(arg0, arg1, arg2)) {
            return null;
        }
        class544[] var3 = new class544[Statics.field5289];
        for (int var4 = 0; var4 < Statics.field5289; var4++) {
            class544 var5 = var3[var4] = new class544();
            var5.field5272 = Statics.field5288;
            var5.field5274 = Statics.field5287;
            var5.field5271 = Statics.field5290[var4];
            var5.field5273 = Statics.field4444[var4];
            var5.field5269 = Statics.field4707[var4];
            var5.field5270 = Statics.field490[var4];
            var5.field5268 = Statics.field1433;
            var5.field5267 = Statics.field2456[var4];
        }
        Statics.field5290 = null;
        Statics.field4444 = null;
        Statics.field4707 = null;
        Statics.field490 = null;
        Statics.field1433 = null;
        Statics.field2456 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("ia.ap(Low;III)[Luc;")
    public static class545[] method3951(class375 arg0, int arg1, int arg2) {
        return method2710(arg0, arg1, arg2) ? method3732() : null;
    }

    @ObfuscatedName("fr.af(Low;III)Luc;")
    public static class545 method3015(class375 arg0, int arg1, int arg2) {
        if (!method2710(arg0, arg1, arg2)) {
            return null;
        }
        class545 var3 = new class545();
        var3.field5275 = Statics.field5288;
        var3.field5279 = Statics.field5287;
        var3.field5278 = Statics.field5290[0];
        var3.field5280 = Statics.field4444[0];
        var3.field5276 = Statics.field4707[0];
        var3.field5277 = Statics.field490[0];
        int var4 = var3.field5277 * var3.field5276;
        byte[] var5 = Statics.field2456[0];
        var3.field5281 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field5281[var6] = Statics.field1433[var5[var6] & 0xFF];
        }
        Statics.field5290 = null;
        Statics.field4444 = null;
        Statics.field4707 = null;
        Statics.field490 = null;
        Statics.field1433 = null;
        Statics.field2456 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("pc.aj(Low;Ljava/lang/String;Ljava/lang/String;I)[Lut;")
    public static class544[] method7095(class375 arg0, String arg1, String arg2) {
        if (arg0.method6414(arg1, arg2)) {
            int var3 = arg0.method6412(arg1);
            int var4 = arg0.method6413(var3, arg2);
            return method3531(arg0, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gp.aq(Low;Ljava/lang/String;Ljava/lang/String;B)Lut;")
    public static class544 method3314(class375 arg0, String arg1, String arg2) {
        if (!arg0.method6414(arg1, arg2)) {
            return null;
        }
        int var3 = arg0.method6412(arg1);
        int var4 = arg0.method6413(var3, arg2);
        class544 var5;
        if (method2710(arg0, var3, var4)) {
            var5 = method7768();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("sa.ar(Low;Low;Ljava/lang/String;Ljava/lang/String;I)Lpv;")
    public static class410 method8019(class375 arg0, class375 arg1, String arg2, String arg3) {
        if (!arg0.method6414(arg2, arg3)) {
            return null;
        }
        int var4 = arg0.method6412(arg2);
        int var5 = arg0.method6413(var4, arg3);
        class410 var6;
        if (method2710(arg0, var4, var5)) {
            var6 = method2067(arg1.method6396(var4, var5));
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("dn.ag(Low;II)Lut;")
    public static class544 method2340(class375 arg0, int arg1) {
        return method8962(arg0, arg1) ? method7768() : null;
    }

    @ObfuscatedName("rc.ao(I)Lut;")
    public static class544 method7768() {
        class544 var0 = new class544();
        var0.field5272 = Statics.field5288;
        var0.field5274 = Statics.field5287;
        var0.field5271 = Statics.field5290[0];
        var0.field5273 = Statics.field4444[0];
        var0.field5269 = Statics.field4707[0];
        var0.field5270 = Statics.field490[0];
        var0.field5268 = Statics.field1433;
        var0.field5267 = Statics.field2456[0];
        Statics.field5290 = null;
        Statics.field4444 = null;
        Statics.field4707 = null;
        Statics.field490 = null;
        Statics.field1433 = null;
        Statics.field2456 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("hp.ae(I)[Luc;")
    public static class545[] method3732() {
        class545[] var0 = new class545[Statics.field5289];
        for (int var1 = 0; var1 < Statics.field5289; var1++) {
            class545 var2 = var0[var1] = new class545();
            var2.field5275 = Statics.field5288;
            var2.field5279 = Statics.field5287;
            var2.field5278 = Statics.field5290[var1];
            var2.field5280 = Statics.field4444[var1];
            var2.field5276 = Statics.field4707[var1];
            var2.field5277 = Statics.field490[var1];
            int var3 = var2.field5277 * var2.field5276;
            byte[] var4 = Statics.field2456[var1];
            var2.field5281 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field5281[var5] = Statics.field1433[var4[var5] & 0xFF];
            }
        }
        Statics.field5290 = null;
        Statics.field4444 = null;
        Statics.field4707 = null;
        Statics.field490 = null;
        Statics.field1433 = null;
        Statics.field2456 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("cm.aa([BB)Lpv;")
    public static class410 method2067(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class410 var1 = new class410(arg0, Statics.field5290, Statics.field4444, Statics.field4707, Statics.field490, Statics.field1433, Statics.field2456);
        Statics.field5290 = null;
        Statics.field4444 = null;
        Statics.field4707 = null;
        Statics.field490 = null;
        Statics.field1433 = null;
        Statics.field2456 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("ev.au(Low;III)Z")
    public static boolean method2710(class375 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6396(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2169(var3);
            return true;
        }
    }

    @ObfuscatedName("ui.an(Low;II)Z")
    public static boolean method8962(class375 arg0, int arg1) {
        byte[] var2 = arg0.method6402(arg1);
        if (var2 == null) {
            return false;
        } else {
            method2169(var2);
            return true;
        }
    }

    @ObfuscatedName("dc.ad([BB)V")
    public static void method2169(byte[] arg0) {
        class531 var1 = new class531(arg0);
        var1.field5181 = arg0.length - 2;
        Statics.field5289 = var1.method8775();
        Statics.field5290 = new int[Statics.field5289];
        Statics.field4444 = new int[Statics.field5289];
        Statics.field4707 = new int[Statics.field5289];
        Statics.field490 = new int[Statics.field5289];
        Statics.field2456 = new byte[Statics.field5289][];
        var1.field5181 = arg0.length - 7 - Statics.field5289 * 8;
        Statics.field5288 = var1.method8775();
        Statics.field5287 = var1.method8775();
        int var2 = (var1.method8561() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field5289; var3++) {
            Statics.field5290[var3] = var1.method8775();
        }
        for (int var4 = 0; var4 < Statics.field5289; var4++) {
            Statics.field4444[var4] = var1.method8775();
        }
        for (int var5 = 0; var5 < Statics.field5289; var5++) {
            Statics.field4707[var5] = var1.method8775();
        }
        for (int var6 = 0; var6 < Statics.field5289; var6++) {
            Statics.field490[var6] = var1.method8775();
        }
        var1.field5181 = arg0.length - 7 - Statics.field5289 * 8 - (var2 - 1) * 3;
        Statics.field1433 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1433[var7] = var1.method8688();
            if (Statics.field1433[var7] == 0) {
                Statics.field1433[var7] = 1;
            }
        }
        var1.field5181 = 0;
        for (int var8 = 0; var8 < Statics.field5289; var8++) {
            int var9 = Statics.field4707[var8];
            int var10 = Statics.field490[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2456[var8] = var12;
            int var13 = var1.method8561();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method8562();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method8562();
                    }
                }
            }
        }
    }
}
