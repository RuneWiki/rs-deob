package deob;

@ObfuscatedName("ri")
public class class482 {

    public class482() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("in.h(Lly;IIB)[Lra;")
    public static class480[] method4765(class333 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5909(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3204(var3);
            var4 = true;
        }
        return var4 ? method4963() : null;
    }

    @ObfuscatedName("ga.e(Lly;III)[Lrx;")
    public static class481[] method3715(class333 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5909(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3204(var3);
            var4 = true;
        }
        return var4 ? method6678() : null;
    }

    @ObfuscatedName("nh.x(Lly;Lly;III)Lnv;")
    public static class368 method6718(class333 arg0, class333 arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method5909(arg2, arg3);
        boolean var5;
        if (var4 == null) {
            var5 = false;
        } else {
            method3204(var4);
            var5 = true;
        }
        if (!var5) {
            return null;
        }
        byte[] var6 = arg1.method5909(arg2, arg3);
        class368 var7;
        if (var6 == null) {
            var7 = null;
        } else {
            class368 var8 = new class368(var6, Statics.field5024, Statics.field4644, Statics.field59, Statics.field2128, Statics.field3022, Statics.field2432);
            Statics.field5024 = null;
            Statics.field4644 = null;
            Statics.field59 = null;
            Statics.field2128 = null;
            Statics.field3022 = null;
            Statics.field2432 = (byte[][]) null;
            var7 = var8;
        }
        return var7;
    }

    @ObfuscatedName("bj.m(Lly;Ljava/lang/String;Ljava/lang/String;I)Lra;")
    public static class480 method1995(class333 arg0, String arg1, String arg2) {
        int var3 = arg0.method5861(arg1);
        int var4 = arg0.method5868(var3, arg2);
        byte[] var5 = arg0.method5909(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method3204(var5);
            var6 = true;
        }
        class480 var7;
        if (var6) {
            class480 var8 = new class480();
            var8.field5006 = Statics.field4246;
            var8.field5009 = Statics.field5022;
            var8.field5004 = Statics.field5024[0];
            var8.field5007 = Statics.field4644[0];
            var8.field5008 = Statics.field59[0];
            var8.field5005 = Statics.field2128[0];
            var8.field5003 = Statics.field3022;
            var8.field5002 = Statics.field2432[0];
            Statics.field5024 = null;
            Statics.field4644 = null;
            Statics.field59 = null;
            Statics.field2128 = null;
            Statics.field3022 = null;
            Statics.field2432 = (byte[][]) null;
            var7 = var8;
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("jc.q(I)[Lra;")
    public static class480[] method4963() {
        class480[] var0 = new class480[Statics.field5023];
        for (int var1 = 0; var1 < Statics.field5023; var1++) {
            class480 var2 = var0[var1] = new class480();
            var2.field5006 = Statics.field4246;
            var2.field5009 = Statics.field5022;
            var2.field5004 = Statics.field5024[var1];
            var2.field5007 = Statics.field4644[var1];
            var2.field5008 = Statics.field59[var1];
            var2.field5005 = Statics.field2128[var1];
            var2.field5003 = Statics.field3022;
            var2.field5002 = Statics.field2432[var1];
        }
        Statics.field5024 = null;
        Statics.field4644 = null;
        Statics.field59 = null;
        Statics.field2128 = null;
        Statics.field3022 = null;
        Statics.field2432 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("nk.f(I)[Lrx;")
    public static class481[] method6678() {
        class481[] var0 = new class481[Statics.field5023];
        for (int var1 = 0; var1 < Statics.field5023; var1++) {
            class481 var2 = var0[var1] = new class481();
            var2.field5015 = Statics.field4246;
            var2.field5016 = Statics.field5022;
            var2.field5013 = Statics.field5024[var1];
            var2.field5014 = Statics.field4644[var1];
            var2.field5011 = Statics.field59[var1];
            var2.field5010 = Statics.field2128[var1];
            int var3 = var2.field5011 * var2.field5010;
            byte[] var4 = Statics.field2432[var1];
            var2.field5021 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field5021[var5] = Statics.field3022[var4[var5] & 0xFF];
            }
        }
        Statics.field5024 = null;
        Statics.field4644 = null;
        Statics.field59 = null;
        Statics.field2128 = null;
        Statics.field3022 = null;
        Statics.field2432 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("mc.r(I)Lrx;")
    public static class481 method6331() {
        class481 var0 = new class481();
        var0.field5015 = Statics.field4246;
        var0.field5016 = Statics.field5022;
        var0.field5013 = Statics.field5024[0];
        var0.field5014 = Statics.field4644[0];
        var0.field5011 = Statics.field59[0];
        var0.field5010 = Statics.field2128[0];
        int var1 = var0.field5011 * var0.field5010;
        byte[] var2 = Statics.field2432[0];
        var0.field5021 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field5021[var3] = Statics.field3022[var2[var3] & 0xFF];
        }
        Statics.field5024 = null;
        Statics.field4644 = null;
        Statics.field59 = null;
        Statics.field2128 = null;
        Statics.field3022 = null;
        Statics.field2432 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("fi.u([BI)V")
    public static void method3204(byte[] arg0) {
        class467 var1 = new class467(arg0);
        var1.field4915 = arg0.length - 2;
        Statics.field5023 = var1.method7794();
        Statics.field5024 = new int[Statics.field5023];
        Statics.field4644 = new int[Statics.field5023];
        Statics.field59 = new int[Statics.field5023];
        Statics.field2128 = new int[Statics.field5023];
        Statics.field2432 = new byte[Statics.field5023][];
        var1.field4915 = arg0.length - 7 - Statics.field5023 * 8;
        Statics.field4246 = var1.method7794();
        Statics.field5022 = var1.method7794();
        int var2 = (var1.method7792() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field5023; var3++) {
            Statics.field5024[var3] = var1.method7794();
        }
        for (int var4 = 0; var4 < Statics.field5023; var4++) {
            Statics.field4644[var4] = var1.method7794();
        }
        for (int var5 = 0; var5 < Statics.field5023; var5++) {
            Statics.field59[var5] = var1.method7794();
        }
        for (int var6 = 0; var6 < Statics.field5023; var6++) {
            Statics.field2128[var6] = var1.method7794();
        }
        var1.field4915 = arg0.length - 7 - Statics.field5023 * 8 - (var2 - 1) * 3;
        Statics.field3022 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3022[var7] = var1.method7796();
            if (Statics.field3022[var7] == 0) {
                Statics.field3022[var7] = 1;
            }
        }
        var1.field4915 = 0;
        for (int var8 = 0; var8 < Statics.field5023; var8++) {
            int var9 = Statics.field59[var8];
            int var10 = Statics.field2128[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2432[var8] = var12;
            int var13 = var1.method7792();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method7793();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method7793();
                    }
                }
            }
        }
    }
}
