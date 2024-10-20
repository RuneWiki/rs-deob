package deob;

@ObfuscatedName("by")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.t(Leg;IIB)[Lbv;")
    public static class72[] method498(class146 arg0, int arg1, int arg2) {
        return method1027(arg0, arg1, arg2) ? method2416() : null;
    }

    @ObfuscatedName("ak.s(Leg;Ljava/lang/String;Ljava/lang/String;S)[Lbj;")
    public static class74[] method508(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2724(arg1);
        int var4 = arg0.method2725(var3, arg2);
        class74[] var5;
        if (method1027(arg0, var3, var4)) {
            class74[] var6 = new class74[Statics.field1268];
            for (int var7 = 0; var7 < Statics.field1268; var7++) {
                class74 var8 = var6[var7] = new class74();
                var8.field1312 = Statics.field1276;
                var8.field1313 = Statics.field1269;
                var8.field1310 = Statics.field1273[var7];
                var8.field1307 = Statics.field1271[var7];
                var8.field1308 = Statics.field1238[var7];
                var8.field1309 = Statics.field1897[var7];
                var8.field1306 = Statics.field2967;
                var8.field1311 = Statics.field127[var7];
            }
            method163();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("m.f(Leg;Ljava/lang/String;Ljava/lang/String;B)Lbj;")
    public static class74 method506(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2724(arg1);
        int var4 = arg0.method2725(var3, arg2);
        class74 var5;
        if (method1027(arg0, var3, var4)) {
            var5 = method2384();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("n.e(Leg;Ljava/lang/String;Ljava/lang/String;B)[Lbv;")
    public static class72[] method82(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2724(arg1);
        int var4 = arg0.method2725(var3, arg2);
        return method498(arg0, var3, var4);
    }

    @ObfuscatedName("an.d(Leg;Ljava/lang/String;Ljava/lang/String;I)Lbv;")
    public static class72 method715(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2724(arg1);
        int var4 = arg0.method2725(var3, arg2);
        class72 var5;
        if (method1027(arg0, var3, var4)) {
            var5 = method2();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("g.n(Leg;II)Lbj;")
    public static class74 method128(class146 arg0, int arg1) {
        return method995(arg0, arg1) ? method2384() : null;
    }

    @ObfuscatedName("dh.v(I)Lbj;")
    public static class74 method2384() {
        class74 var0 = new class74();
        var0.field1312 = Statics.field1276;
        var0.field1313 = Statics.field1269;
        var0.field1310 = Statics.field1273[0];
        var0.field1307 = Statics.field1271[0];
        var0.field1308 = Statics.field1238[0];
        var0.field1309 = Statics.field1897[0];
        var0.field1306 = Statics.field2967;
        var0.field1311 = Statics.field127[0];
        method163();
        return var0;
    }

    @ObfuscatedName("di.z(B)[Lbv;")
    public static class72[] method2416() {
        class72[] var0 = new class72[Statics.field1268];
        for (int var1 = 0; var1 < Statics.field1268; var1++) {
            class72 var2 = var0[var1] = new class72();
            var2.field1293 = Statics.field1276;
            var2.field1292 = Statics.field1269;
            var2.field1290 = Statics.field1273[var1];
            var2.field1291 = Statics.field1271[var1];
            var2.field1288 = Statics.field1238[var1];
            var2.field1294 = Statics.field1897[var1];
            int var3 = var2.field1294 * var2.field1288;
            byte[] var4 = Statics.field127[var1];
            var2.field1287 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1287[var5] = Statics.field2967[var4[var5] & 0xFF];
            }
        }
        method163();
        return var0;
    }

    @ObfuscatedName("t.j(I)Lbv;")
    public static class72 method2() {
        class72 var0 = new class72();
        var0.field1293 = Statics.field1276;
        var0.field1292 = Statics.field1269;
        var0.field1290 = Statics.field1273[0];
        var0.field1291 = Statics.field1271[0];
        var0.field1288 = Statics.field1238[0];
        var0.field1294 = Statics.field1897[0];
        int var1 = var0.field1294 * var0.field1288;
        byte[] var2 = Statics.field127[0];
        var0.field1287 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1287[var3] = Statics.field2967[var2[var3] & 0xFF];
        }
        method163();
        return var0;
    }

    @ObfuscatedName("w.u([BI)Lgv;")
    public static class193 method155(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class193 var1 = new class193(arg0, Statics.field1273, Statics.field1271, Statics.field1238, Statics.field1897, Statics.field2967, Statics.field127);
            method163();
            return var1;
        }
    }

    @ObfuscatedName("bf.g(Leg;IIB)Z")
    public static boolean method1027(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2709(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method167(var3);
            return true;
        }
    }

    @ObfuscatedName("ai.a(Leg;IB)Z")
    public static boolean method995(class146 arg0, int arg1) {
        byte[] var2 = arg0.method2714(arg1);
        if (var2 == null) {
            return false;
        } else {
            method167(var2);
            return true;
        }
    }

    @ObfuscatedName("q.c([BI)V")
    public static void method167(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1830 = arg0.length - 2;
        Statics.field1268 = var1.method2103();
        Statics.field1273 = new int[Statics.field1268];
        Statics.field1271 = new int[Statics.field1268];
        Statics.field1238 = new int[Statics.field1268];
        Statics.field1897 = new int[Statics.field1268];
        Statics.field127 = new byte[Statics.field1268][];
        var1.field1830 = arg0.length - 7 - Statics.field1268 * 8;
        Statics.field1276 = var1.method2103();
        Statics.field1269 = var1.method2103();
        int var2 = (var1.method2101() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1268; var3++) {
            Statics.field1273[var3] = var1.method2103();
        }
        for (int var4 = 0; var4 < Statics.field1268; var4++) {
            Statics.field1271[var4] = var1.method2103();
        }
        for (int var5 = 0; var5 < Statics.field1268; var5++) {
            Statics.field1238[var5] = var1.method2103();
        }
        for (int var6 = 0; var6 < Statics.field1268; var6++) {
            Statics.field1897[var6] = var1.method2103();
        }
        var1.field1830 = arg0.length - 7 - Statics.field1268 * 8 - (var2 - 1) * 3;
        Statics.field2967 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2967[var7] = var1.method2304();
            if (Statics.field2967[var7] == 0) {
                Statics.field2967[var7] = 1;
            }
        }
        var1.field1830 = 0;
        for (int var8 = 0; var8 < Statics.field1268; var8++) {
            int var9 = Statics.field1238[var8];
            int var10 = Statics.field1897[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field127[var8] = var12;
            int var13 = var1.method2101();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2102();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2102();
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.w(I)V")
    public static void method163() {
        Statics.field1273 = null;
        Statics.field1271 = null;
        Statics.field1238 = null;
        Statics.field1897 = null;
        Statics.field2967 = null;
        Statics.field127 = (byte[][]) null;
    }
}
