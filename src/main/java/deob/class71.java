package deob;

@ObfuscatedName("be")
public class class71 {

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fp.v(Lem;III)[Lbh;")
    public static class75[] method3221(class151 arg0, int arg1, int arg2) {
        if (!method610(arg0, arg1, arg2)) {
            return null;
        }
        class75[] var3 = new class75[Statics.field1276];
        for (int var4 = 0; var4 < Statics.field1276; var4++) {
            class75 var5 = var3[var4] = new class75();
            var5.field1317 = Statics.field3037;
            var5.field1324 = Statics.field1275;
            var5.field1323 = Statics.field1286[var4];
            var5.field1322 = Statics.field1277[var4];
            var5.field1321 = Statics.field1274[var4];
            var5.field1319 = Statics.field1279[var4];
            var5.field1320 = Statics.field1280;
            var5.field1318 = Statics.field1062[var4];
        }
        method820();
        return var3;
    }

    @ObfuscatedName("e.t(Lem;III)Lbh;")
    public static class75 method157(class151 arg0, int arg1, int arg2) {
        if (!method610(arg0, arg1, arg2)) {
            return null;
        }
        class75 var3 = new class75();
        var3.field1317 = Statics.field3037;
        var3.field1324 = Statics.field1275;
        var3.field1323 = Statics.field1286[0];
        var3.field1322 = Statics.field1277[0];
        var3.field1321 = Statics.field1274[0];
        var3.field1319 = Statics.field1279[0];
        var3.field1320 = Statics.field1280;
        var3.field1318 = Statics.field1062[0];
        method820();
        return var3;
    }

    @ObfuscatedName("bj.f(Lem;III)[Lbw;")
    public static class73[] method1070(class151 arg0, int arg1, int arg2) {
        if (!method610(arg0, arg1, arg2)) {
            return null;
        }
        class73[] var3 = new class73[Statics.field1276];
        for (int var4 = 0; var4 < Statics.field1276; var4++) {
            class73 var5 = var3[var4] = new class73();
            var5.field1303 = Statics.field3037;
            var5.field1305 = Statics.field1275;
            var5.field1301 = Statics.field1286[var4];
            var5.field1302 = Statics.field1277[var4];
            var5.field1299 = Statics.field1274[var4];
            var5.field1298 = Statics.field1279[var4];
            int var6 = var5.field1299 * var5.field1298;
            byte[] var7 = Statics.field1062[var4];
            var5.field1308 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1308[var8] = Statics.field1280[var7[var8] & 0xFF];
            }
        }
        method820();
        return var3;
    }

    @ObfuscatedName("ah.j(Lem;Lem;IIB)Lgh;")
    public static class207 method543(class151 arg0, class151 arg1, int arg2, int arg3) {
        return method610(arg0, arg2, arg3) ? Statics.method3216(arg1.method2852(arg2, arg3)) : null;
    }

    @ObfuscatedName("dc.l(Lem;Ljava/lang/String;Ljava/lang/String;I)[Lbh;")
    public static class75[] method2462(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2799(arg1);
        int var4 = arg0.method2841(var3, arg2);
        return method3221(arg0, var3, var4);
    }

    @ObfuscatedName("c.g(Lem;Ljava/lang/String;Ljava/lang/String;B)Lbh;")
    public static class75 method126(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2799(arg1);
        int var4 = arg0.method2841(var3, arg2);
        return method157(arg0, var3, var4);
    }

    @ObfuscatedName("ct.k(Lem;Ljava/lang/String;Ljava/lang/String;I)[Lbw;")
    public static class73[] method1894(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2799(arg1);
        int var4 = arg0.method2841(var3, arg2);
        return method1070(arg0, var3, var4);
    }

    @ObfuscatedName("w.p(Lem;IB)Lbh;")
    public static class75 method499(class151 arg0, int arg1) {
        if (!method130(arg0, arg1)) {
            return null;
        }
        class75 var2 = new class75();
        var2.field1317 = Statics.field3037;
        var2.field1324 = Statics.field1275;
        var2.field1323 = Statics.field1286[0];
        var2.field1322 = Statics.field1277[0];
        var2.field1321 = Statics.field1274[0];
        var2.field1319 = Statics.field1279[0];
        var2.field1320 = Statics.field1280;
        var2.field1318 = Statics.field1062[0];
        method820();
        return var2;
    }

    @ObfuscatedName("m.y(B)Lbw;")
    public static class73 method111() {
        class73 var0 = new class73();
        var0.field1303 = Statics.field3037;
        var0.field1305 = Statics.field1275;
        var0.field1301 = Statics.field1286[0];
        var0.field1302 = Statics.field1277[0];
        var0.field1299 = Statics.field1274[0];
        var0.field1298 = Statics.field1279[0];
        int var1 = var0.field1299 * var0.field1298;
        byte[] var2 = Statics.field1062[0];
        var0.field1308 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1308[var3] = Statics.field1280[var2[var3] & 0xFF];
        }
        method820();
        return var0;
    }

    @ObfuscatedName("aj.o(Lem;IIB)Z")
    public static boolean method610(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2852(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2765(var3);
            return true;
        }
    }

    @ObfuscatedName("r.c(Lem;II)Z")
    public static boolean method130(class151 arg0, int arg1) {
        byte[] var2 = arg0.method2797(arg1);
        if (var2 == null) {
            return false;
        } else {
            method2765(var2);
            return true;
        }
    }

    @ObfuscatedName("en.r([BB)V")
    public static void method2765(byte[] arg0) {
        class110 var1 = new class110(arg0);
        var1.field1847 = arg0.length - 2;
        Statics.field1276 = var1.method2194();
        Statics.field1286 = new int[Statics.field1276];
        Statics.field1277 = new int[Statics.field1276];
        Statics.field1274 = new int[Statics.field1276];
        Statics.field1279 = new int[Statics.field1276];
        Statics.field1062 = new byte[Statics.field1276][];
        var1.field1847 = arg0.length - 7 - Statics.field1276 * 8;
        Statics.field3037 = var1.method2194();
        Statics.field1275 = var1.method2194();
        int var2 = (var1.method2257() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1276; var3++) {
            Statics.field1286[var3] = var1.method2194();
        }
        for (int var4 = 0; var4 < Statics.field1276; var4++) {
            Statics.field1277[var4] = var1.method2194();
        }
        for (int var5 = 0; var5 < Statics.field1276; var5++) {
            Statics.field1274[var5] = var1.method2194();
        }
        for (int var6 = 0; var6 < Statics.field1276; var6++) {
            Statics.field1279[var6] = var1.method2194();
        }
        var1.field1847 = arg0.length - 7 - Statics.field1276 * 8 - (var2 - 1) * 3;
        Statics.field1280 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1280[var7] = var1.method2267();
            if (Statics.field1280[var7] == 0) {
                Statics.field1280[var7] = 1;
            }
        }
        var1.field1847 = 0;
        for (int var8 = 0; var8 < Statics.field1276; var8++) {
            int var9 = Statics.field1274[var8];
            int var10 = Statics.field1279[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1062[var8] = var12;
            int var13 = var1.method2257();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2162();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2162();
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.s(I)V")
    public static void method820() {
        Statics.field1286 = null;
        Statics.field1277 = null;
        Statics.field1274 = null;
        Statics.field1279 = null;
        Statics.field1280 = null;
        Statics.field1062 = (byte[][]) null;
    }
}
