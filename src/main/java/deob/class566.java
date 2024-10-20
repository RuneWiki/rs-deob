package deob;

@ObfuscatedName("vp")
public class class566 {

    public class566() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("rz.ac(Lpo;IIB)Lvt;")
    public static class564 method7998(class391 arg0, int arg1, int arg2) {
        if (!method8328(arg0, arg1, arg2)) {
            return null;
        }
        class564 var3 = new class564();
        var3.field5505 = Statics.field5522;
        var3.field5501 = Statics.field5521;
        var3.field5508 = Statics.field4920[0];
        var3.field5506 = Statics.field988[0];
        var3.field5503 = Statics.field4598[0];
        var3.field5504 = Statics.field2922[0];
        var3.field5502 = Statics.field5524;
        var3.field5507 = Statics.field3699[0];
        method3270();
        return var3;
    }

    @ObfuscatedName("ec.ae(Lpo;III)[Lvv;")
    public static class565[] method3068(class391 arg0, int arg1, int arg2) {
        return method8328(arg0, arg1, arg2) ? method8899() : null;
    }

    @ObfuscatedName("se.ag(Lpo;III)Lvv;")
    public static class565 method8084(class391 arg0, int arg1, int arg2) {
        if (!method8328(arg0, arg1, arg2)) {
            return null;
        }
        class565 var3 = new class565();
        var3.field5514 = Statics.field5522;
        var3.field5515 = Statics.field5521;
        var3.field5512 = Statics.field4920[0];
        var3.field5510 = Statics.field988[0];
        var3.field5518 = Statics.field4598[0];
        var3.field5511 = Statics.field2922[0];
        int var4 = var3.field5518 * var3.field5511;
        byte[] var5 = Statics.field3699[0];
        var3.field5513 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field5513[var6] = Statics.field5524[var5[var6] & 0xFF];
        }
        method3270();
        return var3;
    }

    @ObfuscatedName("it.am(Lpo;Ljava/lang/String;Ljava/lang/String;B)[Lvt;")
    public static class564[] method4103(class391 arg0, String arg1, String arg2) {
        if (!arg0.method6799(arg1, arg2)) {
            return null;
        }
        int var3 = arg0.method6797(arg1);
        int var4 = arg0.method6806(var3, arg2);
        class564[] var5;
        if (method8328(arg0, var3, var4)) {
            var5 = method2824();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("sq.ax(Lpo;Ljava/lang/String;Ljava/lang/String;I)Lvt;")
    public static class564 method8168(class391 arg0, String arg1, String arg2) {
        if (arg0.method6799(arg1, arg2)) {
            int var3 = arg0.method6797(arg1);
            int var4 = arg0.method6806(var3, arg2);
            return method7998(arg0, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("kx.aq(Lpo;Ljava/lang/String;Ljava/lang/String;S)[Lvv;")
    public static class565[] method5136(class391 arg0, String arg1, String arg2) {
        if (arg0.method6799(arg1, arg2)) {
            int var3 = arg0.method6797(arg1);
            int var4 = arg0.method6806(var3, arg2);
            return method3068(arg0, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ew.af(I)[Lvt;")
    public static class564[] method2824() {
        class564[] var0 = new class564[Statics.field5523];
        for (int var1 = 0; var1 < Statics.field5523; var1++) {
            class564 var2 = var0[var1] = new class564();
            var2.field5505 = Statics.field5522;
            var2.field5501 = Statics.field5521;
            var2.field5508 = Statics.field4920[var1];
            var2.field5506 = Statics.field988[var1];
            var2.field5503 = Statics.field4598[var1];
            var2.field5504 = Statics.field2922[var1];
            var2.field5502 = Statics.field5524;
            var2.field5507 = Statics.field3699[var1];
        }
        method3270();
        return var0;
    }

    @ObfuscatedName("um.at(I)[Lvv;")
    public static class565[] method8899() {
        class565[] var0 = new class565[Statics.field5523];
        for (int var1 = 0; var1 < Statics.field5523; var1++) {
            class565 var2 = var0[var1] = new class565();
            var2.field5514 = Statics.field5522;
            var2.field5515 = Statics.field5521;
            var2.field5512 = Statics.field4920[var1];
            var2.field5510 = Statics.field988[var1];
            var2.field5518 = Statics.field4598[var1];
            var2.field5511 = Statics.field2922[var1];
            int var3 = var2.field5518 * var2.field5511;
            byte[] var4 = Statics.field3699[var1];
            var2.field5513 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field5513[var5] = Statics.field5524[var4[var5] & 0xFF];
            }
        }
        method3270();
        return var0;
    }

    @ObfuscatedName("tb.au(Lpo;IIS)Z")
    public static boolean method8328(class391 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6782(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method8813(var3);
            return true;
        }
    }

    @ObfuscatedName("uy.ar([BI)V")
    public static void method8813(byte[] arg0) {
        class551 var1 = new class551(arg0);
        var1.field5415 = arg0.length - 2;
        Statics.field5523 = var1.method9119();
        Statics.field4920 = new int[Statics.field5523];
        Statics.field988 = new int[Statics.field5523];
        Statics.field4598 = new int[Statics.field5523];
        Statics.field2922 = new int[Statics.field5523];
        Statics.field3699 = new byte[Statics.field5523][];
        var1.field5415 = arg0.length - 7 - Statics.field5523 * 8;
        Statics.field5522 = var1.method9119();
        Statics.field5521 = var1.method9119();
        int var2 = (var1.method8955() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field5523; var3++) {
            Statics.field4920[var3] = var1.method9119();
        }
        for (int var4 = 0; var4 < Statics.field5523; var4++) {
            Statics.field988[var4] = var1.method9119();
        }
        for (int var5 = 0; var5 < Statics.field5523; var5++) {
            Statics.field4598[var5] = var1.method9119();
        }
        for (int var6 = 0; var6 < Statics.field5523; var6++) {
            Statics.field2922[var6] = var1.method9119();
        }
        var1.field5415 = arg0.length - 7 - Statics.field5523 * 8 - (var2 - 1) * 3;
        Statics.field5524 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field5524[var7] = var1.method8978();
            if (Statics.field5524[var7] == 0) {
                Statics.field5524[var7] = 1;
            }
        }
        var1.field5415 = 0;
        for (int var8 = 0; var8 < Statics.field5523; var8++) {
            int var9 = Statics.field4598[var8];
            int var10 = Statics.field2922[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3699[var8] = var12;
            int var13 = var1.method8955();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method8975();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method8975();
                    }
                }
            }
        }
    }

    @ObfuscatedName("fx.al(B)V")
    public static void method3270() {
        Statics.field4920 = null;
        Statics.field988 = null;
        Statics.field4598 = null;
        Statics.field2922 = null;
        Statics.field5524 = null;
        Statics.field3699 = (byte[][]) null;
    }
}
