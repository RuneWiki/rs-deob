package deob;

@ObfuscatedName("tt")
public class class516 {

    public class516() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ko.at(Lnq;III)[Ltm;")
    public static class515[] method5081(class357 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6080(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method8451(var3);
            var4 = true;
        }
        return var4 ? method5084() : null;
    }

    @ObfuscatedName("eu.an(Lnq;III)Ltm;")
    public static class515 method2561(class357 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6080(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method8451(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class515 var5 = new class515();
        var5.field5119 = Statics.field3756;
        var5.field5117 = Statics.field4971;
        var5.field5114 = Statics.field5127[0];
        var5.field5118 = Statics.field4512[0];
        var5.field5115 = Statics.field5126[0];
        var5.field5120 = Statics.field5129[0];
        int var6 = var5.field5120 * var5.field5115;
        byte[] var7 = Statics.field5131[0];
        var5.field5123 = new int[var6];
        for (int var8 = 0; var8 < var6; var8++) {
            var5.field5123[var8] = Statics.field5130[var7[var8] & 0xFF];
        }
        method4394();
        return var5;
    }

    @ObfuscatedName("qs.av(Lnq;Lnq;III)Lph;")
    public static class392 method7332(class357 arg0, class357 arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method6080(arg2, arg3);
        boolean var5;
        if (var4 == null) {
            var5 = false;
        } else {
            method8451(var4);
            var5 = true;
        }
        if (!var5) {
            return null;
        }
        byte[] var6 = arg1.method6080(arg2, arg3);
        class392 var7;
        if (var6 == null) {
            var7 = null;
        } else {
            class392 var8 = new class392(var6, Statics.field5127, Statics.field4512, Statics.field5126, Statics.field5129, Statics.field5130, Statics.field5131);
            method4394();
            var7 = var8;
        }
        return var7;
    }

    @ObfuscatedName("kx.as(Lnq;Ljava/lang/String;Ljava/lang/String;I)[Ltj;")
    public static class514[] method4990(class357 arg0, String arg1, String arg2) {
        if (!arg0.method6099(arg1, arg2)) {
            return null;
        }
        int var3 = arg0.method6097(arg1);
        int var4 = arg0.method6098(var3, arg2);
        byte[] var5 = arg0.method6080(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method8451(var5);
            var6 = true;
        }
        class514[] var7;
        if (var6) {
            class514[] var8 = new class514[Statics.field5128];
            for (int var9 = 0; var9 < Statics.field5128; var9++) {
                class514 var10 = var8[var9] = new class514();
                var10.field5112 = Statics.field3756;
                var10.field5113 = Statics.field4971;
                var10.field5106 = Statics.field5127[var9];
                var10.field5110 = Statics.field4512[var9];
                var10.field5108 = Statics.field5126[var9];
                var10.field5109 = Statics.field5129[var9];
                var10.field5107 = Statics.field5130;
                var10.field5111 = Statics.field5131[var9];
            }
            method4394();
            var7 = var8;
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("kx.ax(Lnq;Ljava/lang/String;Ljava/lang/String;B)Ltj;")
    public static class514 method4989(class357 arg0, String arg1, String arg2) {
        if (!arg0.method6099(arg1, arg2)) {
            return null;
        }
        int var3 = arg0.method6097(arg1);
        int var4 = arg0.method6098(var3, arg2);
        byte[] var5 = arg0.method6080(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method8451(var5);
            var6 = true;
        }
        class514 var7;
        if (var6) {
            class514 var8 = new class514();
            var8.field5112 = Statics.field3756;
            var8.field5113 = Statics.field4971;
            var8.field5106 = Statics.field5127[0];
            var8.field5110 = Statics.field4512[0];
            var8.field5108 = Statics.field5126[0];
            var8.field5109 = Statics.field5129[0];
            var8.field5107 = Statics.field5130;
            var8.field5111 = Statics.field5131[0];
            method4394();
            var7 = var8;
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("ic.ap(Lnq;Ljava/lang/String;Ljava/lang/String;B)[Ltm;")
    public static class515[] method3857(class357 arg0, String arg1, String arg2) {
        if (arg0.method6099(arg1, arg2)) {
            int var3 = arg0.method6097(arg1);
            int var4 = arg0.method6098(var3, arg2);
            return method5081(arg0, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("sy.ab(Lnq;Lnq;Ljava/lang/String;Ljava/lang/String;I)Lph;")
    public static class392 method7894(class357 arg0, class357 arg1, String arg2, String arg3) {
        if (!arg0.method6099(arg2, arg3)) {
            return null;
        }
        int var4 = arg0.method6097(arg2);
        int var5 = arg0.method6098(var4, arg3);
        byte[] var6 = arg0.method6080(var4, var5);
        boolean var7;
        if (var6 == null) {
            var7 = false;
        } else {
            method8451(var6);
            var7 = true;
        }
        class392 var8;
        if (var7) {
            byte[] var9 = arg1.method6080(var4, var5);
            class392 var10;
            if (var9 == null) {
                var10 = null;
            } else {
                class392 var11 = new class392(var9, Statics.field5127, Statics.field4512, Statics.field5126, Statics.field5129, Statics.field5130, Statics.field5131);
                method4394();
                var10 = var11;
            }
            var8 = var10;
        } else {
            var8 = null;
        }
        return var8;
    }

    @ObfuscatedName("kt.ak(I)[Ltm;")
    public static class515[] method5084() {
        class515[] var0 = new class515[Statics.field5128];
        for (int var1 = 0; var1 < Statics.field5128; var1++) {
            class515 var2 = var0[var1] = new class515();
            var2.field5119 = Statics.field3756;
            var2.field5117 = Statics.field4971;
            var2.field5114 = Statics.field5127[var1];
            var2.field5118 = Statics.field4512[var1];
            var2.field5115 = Statics.field5126[var1];
            var2.field5120 = Statics.field5129[var1];
            int var3 = var2.field5120 * var2.field5115;
            byte[] var4 = Statics.field5131[var1];
            var2.field5123 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field5123[var5] = Statics.field5130[var4[var5] & 0xFF];
            }
        }
        method4394();
        return var0;
    }

    @ObfuscatedName("ny.ae(Lnq;II)Z")
    public static boolean method6077(class357 arg0, int arg1) {
        byte[] var2 = arg0.method6143(arg1);
        if (var2 == null) {
            return false;
        } else {
            method8451(var2);
            return true;
        }
    }

    @ObfuscatedName("ty.af([BI)V")
    public static void method8451(byte[] arg0) {
        class501 var1 = new class501(arg0);
        var1.field5017 = arg0.length - 2;
        Statics.field5128 = var1.method8195();
        Statics.field5127 = new int[Statics.field5128];
        Statics.field4512 = new int[Statics.field5128];
        Statics.field5126 = new int[Statics.field5128];
        Statics.field5129 = new int[Statics.field5128];
        Statics.field5131 = new byte[Statics.field5128][];
        var1.field5017 = arg0.length - 7 - Statics.field5128 * 8;
        Statics.field3756 = var1.method8195();
        Statics.field4971 = var1.method8195();
        int var2 = (var1.method8129() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field5128; var3++) {
            Statics.field5127[var3] = var1.method8195();
        }
        for (int var4 = 0; var4 < Statics.field5128; var4++) {
            Statics.field4512[var4] = var1.method8195();
        }
        for (int var5 = 0; var5 < Statics.field5128; var5++) {
            Statics.field5126[var5] = var1.method8195();
        }
        for (int var6 = 0; var6 < Statics.field5128; var6++) {
            Statics.field5129[var6] = var1.method8195();
        }
        var1.field5017 = arg0.length - 7 - Statics.field5128 * 8 - (var2 - 1) * 3;
        Statics.field5130 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field5130[var7] = var1.method8133();
            if (Statics.field5130[var7] == 0) {
                Statics.field5130[var7] = 1;
            }
        }
        var1.field5017 = 0;
        for (int var8 = 0; var8 < Statics.field5128; var8++) {
            int var9 = Statics.field5126[var8];
            int var10 = Statics.field5129[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field5131[var8] = var12;
            int var13 = var1.method8129();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method8130();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method8130();
                    }
                }
            }
        }
    }

    @ObfuscatedName("jp.ao(I)V")
    public static void method4394() {
        Statics.field5127 = null;
        Statics.field4512 = null;
        Statics.field5126 = null;
        Statics.field5129 = null;
        Statics.field5130 = null;
        Statics.field5131 = (byte[][]) null;
    }
}
