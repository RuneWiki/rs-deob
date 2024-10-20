package deob;

@ObfuscatedName("bj")
public class class71 {

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eu.l(Leo;III)[Lbq;")
    public static class73[] method2931(class149 arg0, int arg1, int arg2) {
        if (!method1356(arg0, arg1, arg2)) {
            return null;
        }
        class73[] var3 = new class73[Statics.field1270];
        for (int var4 = 0; var4 < Statics.field1270; var4++) {
            class73 var5 = var3[var4] = new class73();
            var5.field1291 = Statics.field1268;
            var5.field1292 = Statics.field1867;
            var5.field1289 = Statics.field1269[var4];
            var5.field1297 = Statics.field1271[var4];
            var5.field1296 = Statics.field1272[var4];
            var5.field1288 = Statics.field1267[var4];
            int var6 = var5.field1296 * var5.field1288;
            byte[] var7 = Statics.field1905[var4];
            var5.field1286 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1286[var8] = Statics.field1273[var7[var8] & 0xFF];
            }
        }
        method2492();
        return var3;
    }

    @ObfuscatedName("cc.y(Leo;Leo;III)Lgx;")
    public static class205 method1610(class149 arg0, class149 arg1, int arg2, int arg3) {
        return method1356(arg0, arg2, arg3) ? method1331(arg1.method2752(arg2, arg3)) : null;
    }

    @ObfuscatedName("ae.g(Leo;Ljava/lang/String;Ljava/lang/String;I)[Lbw;")
    public static class75[] method836(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2764(arg1);
        int var4 = arg0.method2765(var3, arg2);
        class75[] var5;
        if (method1356(arg0, var3, var4)) {
            var5 = method2341();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ca.j(Leo;Ljava/lang/String;Ljava/lang/String;I)Lbw;")
    public static class75 method2082(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2764(arg1);
        int var4 = arg0.method2765(var3, arg2);
        class75 var5;
        if (method1356(arg0, var3, var4)) {
            var5 = method2878();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("al.w(Leo;Ljava/lang/String;Ljava/lang/String;I)[Lbq;")
    public static class73[] method817(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2764(arg1);
        int var4 = arg0.method2765(var3, arg2);
        return method2931(arg0, var3, var4);
    }

    @ObfuscatedName("ct.c(Leo;Ljava/lang/String;Ljava/lang/String;I)Lbq;")
    public static class73 method1887(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2764(arg1);
        int var4 = arg0.method2765(var3, arg2);
        class73 var5;
        if (method1356(arg0, var3, var4)) {
            var5 = method2551();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("f.f(Leo;II)Lbw;")
    public static class75 method106(class149 arg0, int arg1) {
        byte[] var2 = arg0.method2781(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method819(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class75 var4 = new class75();
        var4.field1311 = Statics.field1268;
        var4.field1312 = Statics.field1867;
        var4.field1305 = Statics.field1269[0];
        var4.field1310 = Statics.field1271[0];
        var4.field1308 = Statics.field1272[0];
        var4.field1307 = Statics.field1267[0];
        var4.field1306 = Statics.field1273;
        var4.field1309 = Statics.field1905[0];
        method2492();
        return var4;
    }

    @ObfuscatedName("dk.t(I)[Lbw;")
    public static class75[] method2341() {
        class75[] var0 = new class75[Statics.field1270];
        for (int var1 = 0; var1 < Statics.field1270; var1++) {
            class75 var2 = var0[var1] = new class75();
            var2.field1311 = Statics.field1268;
            var2.field1312 = Statics.field1867;
            var2.field1305 = Statics.field1269[var1];
            var2.field1310 = Statics.field1271[var1];
            var2.field1308 = Statics.field1272[var1];
            var2.field1307 = Statics.field1267[var1];
            var2.field1306 = Statics.field1273;
            var2.field1309 = Statics.field1905[var1];
        }
        method2492();
        return var0;
    }

    @ObfuscatedName("el.n(I)Lbw;")
    public static class75 method2878() {
        class75 var0 = new class75();
        var0.field1311 = Statics.field1268;
        var0.field1312 = Statics.field1867;
        var0.field1305 = Statics.field1269[0];
        var0.field1310 = Statics.field1271[0];
        var0.field1308 = Statics.field1272[0];
        var0.field1307 = Statics.field1267[0];
        var0.field1306 = Statics.field1273;
        var0.field1309 = Statics.field1905[0];
        method2492();
        return var0;
    }

    @ObfuscatedName("dh.p(I)Lbq;")
    public static class73 method2551() {
        class73 var0 = new class73();
        var0.field1291 = Statics.field1268;
        var0.field1292 = Statics.field1867;
        var0.field1289 = Statics.field1269[0];
        var0.field1297 = Statics.field1271[0];
        var0.field1296 = Statics.field1272[0];
        var0.field1288 = Statics.field1267[0];
        int var1 = var0.field1296 * var0.field1288;
        byte[] var2 = Statics.field1905[0];
        var0.field1286 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1286[var3] = Statics.field1273[var2[var3] & 0xFF];
        }
        method2492();
        return var0;
    }

    @ObfuscatedName("bs.a([BI)Lgx;")
    public static class205 method1331(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class205 var1 = new class205(arg0, Statics.field1269, Statics.field1271, Statics.field1272, Statics.field1267, Statics.field1273, Statics.field1905);
            method2492();
            return var1;
        }
    }

    @ObfuscatedName("bu.o(Leo;III)Z")
    public static boolean method1356(class149 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2752(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method819(var3);
            return true;
        }
    }

    @ObfuscatedName("aj.b([BB)V")
    public static void method819(byte[] arg0) {
        class108 var1 = new class108(arg0);
        var1.field1823 = arg0.length - 2;
        Statics.field1270 = var1.method2163();
        Statics.field1269 = new int[Statics.field1270];
        Statics.field1271 = new int[Statics.field1270];
        Statics.field1272 = new int[Statics.field1270];
        Statics.field1267 = new int[Statics.field1270];
        Statics.field1905 = new byte[Statics.field1270][];
        var1.field1823 = arg0.length - 7 - Statics.field1270 * 8;
        Statics.field1268 = var1.method2163();
        Statics.field1867 = var1.method2163();
        int var2 = (var1.method2291() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1270; var3++) {
            Statics.field1269[var3] = var1.method2163();
        }
        for (int var4 = 0; var4 < Statics.field1270; var4++) {
            Statics.field1271[var4] = var1.method2163();
        }
        for (int var5 = 0; var5 < Statics.field1270; var5++) {
            Statics.field1272[var5] = var1.method2163();
        }
        for (int var6 = 0; var6 < Statics.field1270; var6++) {
            Statics.field1267[var6] = var1.method2163();
        }
        var1.field1823 = arg0.length - 7 - Statics.field1270 * 8 - (var2 - 1) * 3;
        Statics.field1273 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1273[var7] = var1.method2214();
            if (Statics.field1273[var7] == 0) {
                Statics.field1273[var7] = 1;
            }
        }
        var1.field1823 = 0;
        for (int var8 = 0; var8 < Statics.field1270; var8++) {
            int var9 = Statics.field1272[var8];
            int var10 = Statics.field1267[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1905[var8] = var12;
            int var13 = var1.method2291();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2292();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2292();
                    }
                }
            }
        }
    }

    @ObfuscatedName("dd.r(B)V")
    public static void method2492() {
        Statics.field1269 = null;
        Statics.field1271 = null;
        Statics.field1272 = null;
        Statics.field1267 = null;
        Statics.field1273 = null;
        Statics.field1905 = (byte[][]) null;
    }
}
