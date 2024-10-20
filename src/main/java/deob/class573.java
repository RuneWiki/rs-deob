package deob;

@ObfuscatedName("wk")
public class class573 {

    public class573() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ex.ap(Lpe;III)[Lvv;")
    public static class572[] method3098(class392 arg0, int arg1, int arg2) {
        if (!method1049(arg0, arg1, arg2)) {
            return null;
        }
        class572[] var3 = new class572[Statics.field5574];
        for (int var4 = 0; var4 < Statics.field5574; var4++) {
            class572 var5 = var3[var4] = new class572();
            var5.field5565 = Statics.field5569;
            var5.field5563 = Statics.field5571;
            var5.field5562 = Statics.field5572[var4];
            var5.field5560 = Statics.field5125[var4];
            var5.field5558 = Statics.field22[var4];
            var5.field5559 = Statics.field5573[var4];
            int var6 = var5.field5559 * var5.field5558;
            byte[] var7 = Statics.field3079[var4];
            var5.field5567 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field5567[var8] = Statics.field5575[var7[var8] & 0xFF];
            }
        }
        Statics.field5572 = null;
        Statics.field5125 = null;
        Statics.field22 = null;
        Statics.field5573 = null;
        Statics.field5575 = null;
        Statics.field3079 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("tk.aw(Lpe;IIB)Lvv;")
    public static class572 method8571(class392 arg0, int arg1, int arg2) {
        if (!method1049(arg0, arg1, arg2)) {
            return null;
        }
        class572 var3 = new class572();
        var3.field5565 = Statics.field5569;
        var3.field5563 = Statics.field5571;
        var3.field5562 = Statics.field5572[0];
        var3.field5560 = Statics.field5125[0];
        var3.field5558 = Statics.field22[0];
        var3.field5559 = Statics.field5573[0];
        int var4 = var3.field5559 * var3.field5558;
        byte[] var5 = Statics.field3079[0];
        var3.field5567 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field5567[var6] = Statics.field5575[var5[var6] & 0xFF];
        }
        Statics.field5572 = null;
        Statics.field5125 = null;
        Statics.field22 = null;
        Statics.field5573 = null;
        Statics.field5575 = null;
        Statics.field3079 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("dc.ak(Lpe;Lpe;III)Lqi;")
    public static class436 method2351(class392 arg0, class392 arg1, int arg2, int arg3) {
        if (!method1049(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method7009(arg2, arg3);
        class436 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class436 var6 = new class436(var4, Statics.field5572, Statics.field5125, Statics.field22, Statics.field5573, Statics.field5575, Statics.field3079);
            Statics.field5572 = null;
            Statics.field5125 = null;
            Statics.field22 = null;
            Statics.field5573 = null;
            Statics.field5575 = null;
            Statics.field3079 = (byte[][]) null;
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("ol.aj(Lpe;Ljava/lang/String;Ljava/lang/String;I)[Lvc;")
    public static class571[] method6944(class392 arg0, String arg1, String arg2) {
        if (!arg0.method7012(arg1, arg2)) {
            return null;
        }
        int var3 = arg0.method7010(arg1);
        int var4 = arg0.method7069(var3, arg2);
        class571[] var5;
        if (method1049(arg0, var3, var4)) {
            class571[] var6 = new class571[Statics.field5574];
            for (int var7 = 0; var7 < Statics.field5574; var7++) {
                class571 var8 = var6[var7] = new class571();
                var8.field5555 = Statics.field5569;
                var8.field5556 = Statics.field5571;
                var8.field5553 = Statics.field5572[var7];
                var8.field5554 = Statics.field5125[var7];
                var8.field5549 = Statics.field22[var7];
                var8.field5551 = Statics.field5573[var7];
                var8.field5550 = Statics.field5575;
                var8.field5552 = Statics.field3079[var7];
            }
            Statics.field5572 = null;
            Statics.field5125 = null;
            Statics.field22 = null;
            Statics.field5573 = null;
            Statics.field5575 = null;
            Statics.field3079 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ey.ai(Lpe;Ljava/lang/String;Ljava/lang/String;I)Lvc;")
    public static class571 method2923(class392 arg0, String arg1, String arg2) {
        if (!arg0.method7012(arg1, arg2)) {
            return null;
        }
        int var3 = arg0.method7010(arg1);
        int var4 = arg0.method7069(var3, arg2);
        class571 var5;
        if (method1049(arg0, var3, var4)) {
            var5 = method1875();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ed.ay(Lpe;Ljava/lang/String;Ljava/lang/String;I)[Lvv;")
    public static class572[] method3072(class392 arg0, String arg1, String arg2) {
        if (arg0.method7012(arg1, arg2)) {
            int var3 = arg0.method7010(arg1);
            int var4 = arg0.method7069(var3, arg2);
            return method3098(arg0, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("cg.as(Lpe;Lpe;Ljava/lang/String;Ljava/lang/String;I)Lqi;")
    public static class436 method1203(class392 arg0, class392 arg1, String arg2, String arg3) {
        if (arg0.method7012(arg2, arg3)) {
            int var4 = arg0.method7010(arg2);
            int var5 = arg0.method7069(var4, arg3);
            return method2351(arg0, arg1, var4, var5);
        } else {
            return null;
        }
    }

    @ObfuscatedName("client.ae(I)Lvc;")
    public static class571 method1875() {
        class571 var0 = new class571();
        var0.field5555 = Statics.field5569;
        var0.field5556 = Statics.field5571;
        var0.field5553 = Statics.field5572[0];
        var0.field5554 = Statics.field5125[0];
        var0.field5549 = Statics.field22[0];
        var0.field5551 = Statics.field5573[0];
        var0.field5550 = Statics.field5575;
        var0.field5552 = Statics.field3079[0];
        Statics.field5572 = null;
        Statics.field5125 = null;
        Statics.field22 = null;
        Statics.field5573 = null;
        Statics.field5575 = null;
        Statics.field3079 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("cb.am(Lpe;III)Z")
    public static boolean method1049(class392 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method7009(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3559(var3);
            return true;
        }
    }

    @ObfuscatedName("dk.at(Lpe;II)Z")
    public static boolean method2469(class392 arg0, int arg1) {
        byte[] var2 = arg0.method7052(arg1);
        if (var2 == null) {
            return false;
        } else {
            method3559(var2);
            return true;
        }
    }

    @ObfuscatedName("gw.au([BI)V")
    public static void method3559(byte[] arg0) {
        class558 var1 = new class558(arg0);
        var1.field5462 = arg0.length - 2;
        Statics.field5574 = var1.method9260();
        Statics.field5572 = new int[Statics.field5574];
        Statics.field5125 = new int[Statics.field5574];
        Statics.field22 = new int[Statics.field5574];
        Statics.field5573 = new int[Statics.field5574];
        Statics.field3079 = new byte[Statics.field5574][];
        var1.field5462 = arg0.length - 7 - Statics.field5574 * 8;
        Statics.field5569 = var1.method9260();
        Statics.field5571 = var1.method9260();
        int var2 = (var1.method9258() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field5574; var3++) {
            Statics.field5572[var3] = var1.method9260();
        }
        for (int var4 = 0; var4 < Statics.field5574; var4++) {
            Statics.field5125[var4] = var1.method9260();
        }
        for (int var5 = 0; var5 < Statics.field5574; var5++) {
            Statics.field22[var5] = var1.method9260();
        }
        for (int var6 = 0; var6 < Statics.field5574; var6++) {
            Statics.field5573[var6] = var1.method9260();
        }
        var1.field5462 = arg0.length - 7 - Statics.field5574 * 8 - (var2 - 1) * 3;
        Statics.field5575 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field5575[var7] = var1.method9380();
            if (Statics.field5575[var7] == 0) {
                Statics.field5575[var7] = 1;
            }
        }
        var1.field5462 = 0;
        for (int var8 = 0; var8 < Statics.field5574; var8++) {
            int var9 = Statics.field22[var8];
            int var10 = Statics.field5573[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3079[var8] = var12;
            int var13 = var1.method9258();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method9259();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method9259();
                    }
                }
            }
        }
    }
}
