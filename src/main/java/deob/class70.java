package deob;

@ObfuscatedName("bg")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.g(Lec;IIB)Lbt;")
    public static class74 method589(class146 arg0, int arg1, int arg2) {
        return Statics.method485(arg0, arg1, arg2) ? method102() : null;
    }

    @ObfuscatedName("as.v(Lec;III)[Lbk;")
    public static class72[] method567(class146 arg0, int arg1, int arg2) {
        if (!Statics.method485(arg0, arg1, arg2)) {
            return null;
        }
        class72[] var3 = new class72[Statics.field1277];
        for (int var4 = 0; var4 < Statics.field1277; var4++) {
            class72 var5 = var3[var4] = new class72();
            var5.field1303 = Statics.field1274;
            var5.field1301 = Statics.field1273;
            var5.field1298 = Statics.field2661[var4];
            var5.field1295 = Statics.field1275[var4];
            var5.field1296 = Statics.field1758[var4];
            var5.field1297 = Statics.field1278[var4];
            int var6 = var5.field1297 * var5.field1296;
            byte[] var7 = Statics.field1662[var4];
            var5.field1305 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1305[var8] = Statics.field1282[var7[var8] & 0xFF];
            }
        }
        method2();
        return var3;
    }

    @ObfuscatedName("aa.z(Lec;IIB)Lbk;")
    public static class72 method576(class146 arg0, int arg1, int arg2) {
        if (!Statics.method485(arg0, arg1, arg2)) {
            return null;
        }
        class72 var3 = new class72();
        var3.field1303 = Statics.field1274;
        var3.field1301 = Statics.field1273;
        var3.field1298 = Statics.field2661[0];
        var3.field1295 = Statics.field1275[0];
        var3.field1296 = Statics.field1758[0];
        var3.field1297 = Statics.field1278[0];
        int var4 = var3.field1297 * var3.field1296;
        byte[] var5 = Statics.field1662[0];
        var3.field1305 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1305[var6] = Statics.field1282[var5[var6] & 0xFF];
        }
        method2();
        return var3;
    }

    @ObfuscatedName("af.h(Lec;Lec;III)Lgj;")
    public static class193 method862(class146 arg0, class146 arg1, int arg2, int arg3) {
        if (!Statics.method485(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method2708(arg2, arg3);
        class193 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class193 var6 = new class193(var4, Statics.field2661, Statics.field1275, Statics.field1758, Statics.field1278, Statics.field1282, Statics.field1662);
            method2();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("client.k(Lec;Ljava/lang/String;Ljava/lang/String;B)[Lbt;")
    public static class74[] method452(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2709(arg1);
        int var4 = arg0.method2724(var3, arg2);
        class74[] var5;
        if (Statics.method485(arg0, var3, var4)) {
            class74[] var6 = new class74[Statics.field1277];
            for (int var7 = 0; var7 < Statics.field1277; var7++) {
                class74 var8 = var6[var7] = new class74();
                var8.field1321 = Statics.field1274;
                var8.field1315 = Statics.field1273;
                var8.field1318 = Statics.field2661[var7];
                var8.field1314 = Statics.field1275[var7];
                var8.field1316 = Statics.field1758[var7];
                var8.field1317 = Statics.field1278[var7];
                var8.field1319 = Statics.field1282;
                var8.field1320 = Statics.field1662[var7];
            }
            method2();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bj.l(Lec;Ljava/lang/String;Ljava/lang/String;B)Lbt;")
    public static class74 method1623(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2709(arg1);
        int var4 = arg0.method2724(var3, arg2);
        return method589(arg0, var3, var4);
    }

    @ObfuscatedName("l.e(Lec;Ljava/lang/String;Ljava/lang/String;S)[Lbk;")
    public static class72[] method70(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2709(arg1);
        int var4 = arg0.method2724(var3, arg2);
        return method567(arg0, var3, var4);
    }

    @ObfuscatedName("b.j(Lec;Ljava/lang/String;Ljava/lang/String;I)Lbk;")
    public static class72 method496(class146 arg0, String arg1, String arg2) {
        int var3 = arg0.method2709(arg1);
        int var4 = arg0.method2724(var3, arg2);
        return method576(arg0, var3, var4);
    }

    @ObfuscatedName("n.n(I)Lbt;")
    public static class74 method102() {
        class74 var0 = new class74();
        var0.field1321 = Statics.field1274;
        var0.field1315 = Statics.field1273;
        var0.field1318 = Statics.field2661[0];
        var0.field1314 = Statics.field1275[0];
        var0.field1316 = Statics.field1758[0];
        var0.field1317 = Statics.field1278[0];
        var0.field1319 = Statics.field1282;
        var0.field1320 = Statics.field1662[0];
        method2();
        return var0;
    }

    @ObfuscatedName("cd.a([BI)V")
    public static void method1874(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1839 = arg0.length - 2;
        Statics.field1277 = var1.method2141();
        Statics.field2661 = new int[Statics.field1277];
        Statics.field1275 = new int[Statics.field1277];
        Statics.field1758 = new int[Statics.field1277];
        Statics.field1278 = new int[Statics.field1277];
        Statics.field1662 = new byte[Statics.field1277][];
        var1.field1839 = arg0.length - 7 - Statics.field1277 * 8;
        Statics.field1274 = var1.method2141();
        Statics.field1273 = var1.method2141();
        int var2 = (var1.method2139() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1277; var3++) {
            Statics.field2661[var3] = var1.method2141();
        }
        for (int var4 = 0; var4 < Statics.field1277; var4++) {
            Statics.field1275[var4] = var1.method2141();
        }
        for (int var5 = 0; var5 < Statics.field1277; var5++) {
            Statics.field1758[var5] = var1.method2141();
        }
        for (int var6 = 0; var6 < Statics.field1277; var6++) {
            Statics.field1278[var6] = var1.method2141();
        }
        var1.field1839 = arg0.length - 7 - Statics.field1277 * 8 - (var2 - 1) * 3;
        Statics.field1282 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1282[var7] = var1.method2230();
            if (Statics.field1282[var7] == 0) {
                Statics.field1282[var7] = 1;
            }
        }
        var1.field1839 = 0;
        for (int var8 = 0; var8 < Statics.field1277; var8++) {
            int var9 = Statics.field1758[var8];
            int var10 = Statics.field1278[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1662[var8] = var12;
            int var13 = var1.method2139();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2140();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2140();
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.i(B)V")
    public static void method2() {
        Statics.field2661 = null;
        Statics.field1275 = null;
        Statics.field1758 = null;
        Statics.field1278 = null;
        Statics.field1282 = null;
        Statics.field1662 = (byte[][]) null;
    }
}
