package deob;

@ObfuscatedName("be")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.t(Ley;III)[Lbg;")
    public static class74[] method171(class146 arg0, int arg1, int arg2) {
        if (!method808(arg0, arg1, arg2)) {
            return null;
        }
        class74[] var3 = new class74[Statics.field1283];
        for (int var4 = 0; var4 < Statics.field1283; var4++) {
            class74 var5 = var3[var4] = new class74();
            var5.field1321 = Statics.field1282;
            var5.field1323 = Statics.field1279;
            var5.field1320 = Statics.field1280[var4];
            var5.field1322 = Statics.field1281[var4];
            var5.field1318 = Statics.field1278[var4];
            var5.field1316 = Statics.field676[var4];
            var5.field1317 = Statics.field1965;
            var5.field1319 = Statics.field2002[var4];
        }
        method469();
        return var3;
    }

    @ObfuscatedName("s.o(Ley;III)[Lbr;")
    public static class72[] method500(class146 arg0, int arg1, int arg2) {
        return method808(arg0, arg1, arg2) ? method519() : null;
    }

    @ObfuscatedName("s.i(Ley;Ley;III)Lgu;")
    public static class193 method497(class146 arg0, class146 arg1, int arg2, int arg3) {
        if (!method808(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method2668(arg2, arg3);
        class193 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class193 var6 = new class193(var4, Statics.field1280, Statics.field1281, Statics.field1278, Statics.field676, Statics.field1965, Statics.field2002);
            method469();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("aa.p(Ley;Ljava/lang/String;Ljava/lang/String;I)[Lbg;")
    public static class74[] method569(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2711(arg1);
        int var4 = arg0.method2739(var3, arg2);
        return method171(arg0, var3, var4);
    }

    @ObfuscatedName("t.c(Ley;Ljava/lang/String;Ljava/lang/String;I)Lbg;")
    public static class74 method4(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2711(arg1);
        int var4 = arg0.method2739(var3, arg2);
        class74 var5;
        if (method808(arg0, var3, var4)) {
            var5 = method2769();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("c.y(Ley;Ljava/lang/String;Ljava/lang/String;I)[Lbr;")
    public static class72[] method32(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2711(arg1);
        int var4 = arg0.method2739(var3, arg2);
        return method500(arg0, var3, var4);
    }

    @ObfuscatedName("ae.g(Ley;Ljava/lang/String;Ljava/lang/String;I)Lbr;")
    public static class72 method888(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2711(arg1);
        int var4 = arg0.method2739(var3, arg2);
        class72 var5;
        if (method808(arg0, var3, var4)) {
            class72 var6 = new class72();
            var6.field1302 = Statics.field1282;
            var6.field1306 = Statics.field1279;
            var6.field1300 = Statics.field1280[0];
            var6.field1307 = Statics.field1281[0];
            var6.field1297 = Statics.field1278[0];
            var6.field1299 = Statics.field676[0];
            int var7 = var6.field1299 * var6.field1297;
            byte[] var8 = Statics.field2002[0];
            var6.field1303 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field1303[var9] = Statics.field1965[var8[var9] & 0xFF];
            }
            method469();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("cq.l(Ley;Ley;Ljava/lang/String;Ljava/lang/String;I)Lgu;")
    public static class193 method2064(class146 arg0, class146 arg1, String arg2, String arg3) {
        int var4 = arg0.method2711(arg2);
        int var5 = arg0.method2739(var4, arg3);
        return method497(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("eg.h(I)Lbg;")
    public static class74 method2769() {
        class74 var0 = new class74();
        var0.field1321 = Statics.field1282;
        var0.field1323 = Statics.field1279;
        var0.field1320 = Statics.field1280[0];
        var0.field1322 = Statics.field1281[0];
        var0.field1318 = Statics.field1278[0];
        var0.field1316 = Statics.field676[0];
        var0.field1317 = Statics.field1965;
        var0.field1319 = Statics.field2002[0];
        method469();
        return var0;
    }

    @ObfuscatedName("e.n(I)[Lbr;")
    public static class72[] method519() {
        class72[] var0 = new class72[Statics.field1283];
        for (int var1 = 0; var1 < Statics.field1283; var1++) {
            class72 var2 = var0[var1] = new class72();
            var2.field1302 = Statics.field1282;
            var2.field1306 = Statics.field1279;
            var2.field1300 = Statics.field1280[var1];
            var2.field1307 = Statics.field1281[var1];
            var2.field1297 = Statics.field1278[var1];
            var2.field1299 = Statics.field676[var1];
            int var3 = var2.field1299 * var2.field1297;
            byte[] var4 = Statics.field2002[var1];
            var2.field1303 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1303[var5] = Statics.field1965[var4[var5] & 0xFF];
            }
        }
        method469();
        return var0;
    }

    @ObfuscatedName("au.w(Ley;III)Z")
    public static boolean method808(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2668(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1873(var3);
            return true;
        }
    }

    @ObfuscatedName("bd.m(Ley;II)Z")
    public static boolean method1040(class146 arg0, int arg1) {
        byte[] var2 = arg0.method2673(arg1);
        if (var2 == null) {
            return false;
        } else {
            method1873(var2);
            return true;
        }
    }

    @ObfuscatedName("ct.x([BI)V")
    public static void method1873(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1827 = arg0.length - 2;
        Statics.field1283 = var1.method2120();
        Statics.field1280 = new int[Statics.field1283];
        Statics.field1281 = new int[Statics.field1283];
        Statics.field1278 = new int[Statics.field1283];
        Statics.field676 = new int[Statics.field1283];
        Statics.field2002 = new byte[Statics.field1283][];
        var1.field1827 = arg0.length - 7 - Statics.field1283 * 8;
        Statics.field1282 = var1.method2120();
        Statics.field1279 = var1.method2120();
        int var2 = (var1.method2118() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1283; var3++) {
            Statics.field1280[var3] = var1.method2120();
        }
        for (int var4 = 0; var4 < Statics.field1283; var4++) {
            Statics.field1281[var4] = var1.method2120();
        }
        for (int var5 = 0; var5 < Statics.field1283; var5++) {
            Statics.field1278[var5] = var1.method2120();
        }
        for (int var6 = 0; var6 < Statics.field1283; var6++) {
            Statics.field676[var6] = var1.method2120();
        }
        var1.field1827 = arg0.length - 7 - Statics.field1283 * 8 - (var2 - 1) * 3;
        Statics.field1965 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1965[var7] = var1.method2122();
            if (Statics.field1965[var7] == 0) {
                Statics.field1965[var7] = 1;
            }
        }
        var1.field1827 = 0;
        for (int var8 = 0; var8 < Statics.field1283; var8++) {
            int var9 = Statics.field1278[var8];
            int var10 = Statics.field676[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2002[var8] = var12;
            int var13 = var1.method2118();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2253();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2253();
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.b(I)V")
    public static void method469() {
        Statics.field1280 = null;
        Statics.field1281 = null;
        Statics.field1278 = null;
        Statics.field676 = null;
        Statics.field1965 = null;
        Statics.field2002 = (byte[][]) null;
    }
}
