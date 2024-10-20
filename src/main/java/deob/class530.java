package deob;

@ObfuscatedName("uf")
public class class530 {

    public class530() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bk.au(Lnu;III)[Luk;")
    public static class528[] method418(class359 arg0, int arg1, int arg2) {
        return method1168(arg0, arg1, arg2) ? method448() : null;
    }

    @ObfuscatedName("sb.ae(Lnu;IIB)[Lui;")
    public static class529[] method7773(class359 arg0, int arg1, int arg2) {
        return method1168(arg0, arg1, arg2) ? method5188() : null;
    }

    @ObfuscatedName("du.ao(Lnu;III)Lui;")
    public static class529 method2154(class359 arg0, int arg1, int arg2) {
        return method1168(arg0, arg1, arg2) ? method2797() : null;
    }

    @ObfuscatedName("lk.at(Lnu;Lnu;IIB)Lpi;")
    public static class394 method5206(class359 arg0, class359 arg1, int arg2, int arg3) {
        return method1168(arg0, arg2, arg3) ? method3361(arg1.method6128(arg2, arg3)) : null;
    }

    @ObfuscatedName("it.ac(Lnu;Ljava/lang/String;Ljava/lang/String;B)[Luk;")
    public static class528[] method3937(class359 arg0, String arg1, String arg2) {
        if (arg0.method6150(arg1, arg2)) {
            int var3 = arg0.method6167(arg1);
            int var4 = arg0.method6145(var3, arg2);
            return method418(arg0, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gy.ai(Lnu;Ljava/lang/String;Ljava/lang/String;I)Luk;")
    public static class528 method3216(class359 arg0, String arg1, String arg2) {
        if (!arg0.method6150(arg1, arg2)) {
            return null;
        }
        int var3 = arg0.method6167(arg1);
        int var4 = arg0.method6145(var3, arg2);
        class528 var5;
        if (method1168(arg0, var3, var4)) {
            var5 = method8073();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("as.az(Lnu;Ljava/lang/String;Ljava/lang/String;I)[Lui;")
    public static class529[] method297(class359 arg0, String arg1, String arg2) {
        if (arg0.method6150(arg1, arg2)) {
            int var3 = arg0.method6167(arg1);
            int var4 = arg0.method6145(var3, arg2);
            return method7773(arg0, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("bt.ap(I)[Luk;")
    public static class528[] method448() {
        class528[] var0 = new class528[Statics.field5220];
        for (int var1 = 0; var1 < Statics.field5220; var1++) {
            class528 var2 = var0[var1] = new class528();
            var2.field5200 = Statics.field5221;
            var2.field5205 = Statics.field4605;
            var2.field5199 = Statics.field5219[var1];
            var2.field5204 = Statics.field1716[var1];
            var2.field5201 = Statics.field1281[var1];
            var2.field5202 = Statics.field3530[var1];
            var2.field5206 = Statics.field5047;
            var2.field5203 = Statics.field3547[var1];
        }
        Statics.field5219 = null;
        Statics.field1716 = null;
        Statics.field1281 = null;
        Statics.field3530 = null;
        Statics.field5047 = null;
        Statics.field3547 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("sg.aa(B)Luk;")
    public static class528 method8073() {
        class528 var0 = new class528();
        var0.field5200 = Statics.field5221;
        var0.field5205 = Statics.field4605;
        var0.field5199 = Statics.field5219[0];
        var0.field5204 = Statics.field1716[0];
        var0.field5201 = Statics.field1281[0];
        var0.field5202 = Statics.field3530[0];
        var0.field5206 = Statics.field5047;
        var0.field5203 = Statics.field3547[0];
        Statics.field5219 = null;
        Statics.field1716 = null;
        Statics.field1281 = null;
        Statics.field3530 = null;
        Statics.field5047 = null;
        Statics.field3547 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("lw.af(B)[Lui;")
    public static class529[] method5188() {
        class529[] var0 = new class529[Statics.field5220];
        for (int var1 = 0; var1 < Statics.field5220; var1++) {
            class529 var2 = var0[var1] = new class529();
            var2.field5212 = Statics.field5221;
            var2.field5213 = Statics.field4605;
            var2.field5207 = Statics.field5219[var1];
            var2.field5208 = Statics.field1716[var1];
            var2.field5218 = Statics.field1281[var1];
            var2.field5209 = Statics.field3530[var1];
            int var3 = var2.field5218 * var2.field5209;
            byte[] var4 = Statics.field3547[var1];
            var2.field5216 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field5216[var5] = Statics.field5047[var4[var5] & 0xFF];
            }
        }
        Statics.field5219 = null;
        Statics.field1716 = null;
        Statics.field1281 = null;
        Statics.field3530 = null;
        Statics.field5047 = null;
        Statics.field3547 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ec.ad(B)Lui;")
    public static class529 method2797() {
        class529 var0 = new class529();
        var0.field5212 = Statics.field5221;
        var0.field5213 = Statics.field4605;
        var0.field5207 = Statics.field5219[0];
        var0.field5208 = Statics.field1716[0];
        var0.field5218 = Statics.field1281[0];
        var0.field5209 = Statics.field3530[0];
        int var1 = var0.field5218 * var0.field5209;
        byte[] var2 = Statics.field3547[0];
        var0.field5216 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field5216[var3] = Statics.field5047[var2[var3] & 0xFF];
        }
        Statics.field5219 = null;
        Statics.field1716 = null;
        Statics.field1281 = null;
        Statics.field3530 = null;
        Statics.field5047 = null;
        Statics.field3547 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("hl.aq([BI)Lpi;")
    public static class394 method3361(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class394 var1 = new class394(arg0, Statics.field5219, Statics.field1716, Statics.field1281, Statics.field3530, Statics.field5047, Statics.field3547);
        Statics.field5219 = null;
        Statics.field1716 = null;
        Statics.field1281 = null;
        Statics.field3530 = null;
        Statics.field5047 = null;
        Statics.field3547 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("cl.al(Lnu;IIB)Z")
    public static boolean method1168(class359 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6128(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2930(var3);
            return true;
        }
    }

    @ObfuscatedName("cx.an(Lnu;IB)Z")
    public static boolean method1069(class359 arg0, int arg1) {
        byte[] var2 = arg0.method6134(arg1);
        if (var2 == null) {
            return false;
        } else {
            method2930(var2);
            return true;
        }
    }

    @ObfuscatedName("fv.ar([BI)V")
    public static void method2930(byte[] arg0) {
        class515 var1 = new class515(arg0);
        var1.field5111 = arg0.length - 2;
        Statics.field5220 = var1.method8448();
        Statics.field5219 = new int[Statics.field5220];
        Statics.field1716 = new int[Statics.field5220];
        Statics.field1281 = new int[Statics.field5220];
        Statics.field3530 = new int[Statics.field5220];
        Statics.field3547 = new byte[Statics.field5220][];
        var1.field5111 = arg0.length - 7 - Statics.field5220 * 8;
        Statics.field5221 = var1.method8448();
        Statics.field4605 = var1.method8448();
        int var2 = (var1.method8300() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field5220; var3++) {
            Statics.field5219[var3] = var1.method8448();
        }
        for (int var4 = 0; var4 < Statics.field5220; var4++) {
            Statics.field1716[var4] = var1.method8448();
        }
        for (int var5 = 0; var5 < Statics.field5220; var5++) {
            Statics.field1281[var5] = var1.method8448();
        }
        for (int var6 = 0; var6 < Statics.field5220; var6++) {
            Statics.field3530[var6] = var1.method8448();
        }
        var1.field5111 = arg0.length - 7 - Statics.field5220 * 8 - (var2 - 1) * 3;
        Statics.field5047 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field5047[var7] = var1.method8466();
            if (Statics.field5047[var7] == 0) {
                Statics.field5047[var7] = 1;
            }
        }
        var1.field5111 = 0;
        for (int var8 = 0; var8 < Statics.field5220; var8++) {
            int var9 = Statics.field1281[var8];
            int var10 = Statics.field3530[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3547[var8] = var12;
            int var13 = var1.method8300();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method8301();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method8301();
                    }
                }
            }
        }
    }
}
