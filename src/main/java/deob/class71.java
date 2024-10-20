package deob;

@ObfuscatedName("bk")
public class class71 {

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eg.j(Ler;Ljava/lang/String;Ljava/lang/String;B)[Lbs;")
    public static class75[] method2728(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2761(arg1);
        int var4 = arg0.method2762(var3, arg2);
        class75[] var5;
        if (method2722(arg0, var3, var4)) {
            var5 = Statics.method1881();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("v.y(Ler;Ljava/lang/String;Ljava/lang/String;I)Lbs;")
    public static class75 method107(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2761(arg1);
        int var4 = arg0.method2762(var3, arg2);
        return Statics.method1982(arg0, var3, var4);
    }

    @ObfuscatedName("d.r(Ler;Ljava/lang/String;Ljava/lang/String;I)[Lbj;")
    public static class73[] method488(class149 arg0, String arg1, String arg2) {
        int var3 = arg0.method2761(arg1);
        int var4 = arg0.method2762(var3, arg2);
        class73[] var5;
        if (method2722(arg0, var3, var4)) {
            var5 = method19();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("t.f(Ler;Ler;Ljava/lang/String;Ljava/lang/String;I)Lgt;")
    public static class205 method518(class149 arg0, class149 arg1, String arg2, String arg3) {
        int var4 = arg0.method2761(arg2);
        int var5 = arg0.method2762(var4, arg3);
        class205 var6;
        if (method2722(arg0, var4, var5)) {
            byte[] var7 = arg1.method2746(var4, var5);
            class205 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class205 var9 = new class205(var7, Statics.field1279, Statics.field1281, Statics.field1887, Statics.field1276, Statics.field711, Statics.field2707);
                method2343();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("dz.b(B)Lbs;")
    public static class75 method2438() {
        class75 var0 = new class75();
        var0.field1319 = Statics.field1277;
        var0.field1320 = Statics.field1278;
        var0.field1314 = Statics.field1279[0];
        var0.field1317 = Statics.field1281[0];
        var0.field1315 = Statics.field1887[0];
        var0.field1316 = Statics.field1276[0];
        var0.field1318 = Statics.field711;
        var0.field1313 = Statics.field2707[0];
        method2343();
        return var0;
    }

    @ObfuscatedName("y.k(I)[Lbj;")
    public static class73[] method19() {
        class73[] var0 = new class73[Statics.field1280];
        for (int var1 = 0; var1 < Statics.field1280; var1++) {
            class73 var2 = var0[var1] = new class73();
            var2.field1299 = Statics.field1277;
            var2.field1300 = Statics.field1278;
            var2.field1305 = Statics.field1279[var1];
            var2.field1304 = Statics.field1281[var1];
            var2.field1295 = Statics.field1887[var1];
            var2.field1296 = Statics.field1276[var1];
            int var3 = var2.field1296 * var2.field1295;
            byte[] var4 = Statics.field2707[var1];
            var2.field1298 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1298[var5] = Statics.field711[var4[var5] & 0xFF];
            }
        }
        method2343();
        return var0;
    }

    @ObfuscatedName("aj.g(B)Lbj;")
    public static class73 method773() {
        class73 var0 = new class73();
        var0.field1299 = Statics.field1277;
        var0.field1300 = Statics.field1278;
        var0.field1305 = Statics.field1279[0];
        var0.field1304 = Statics.field1281[0];
        var0.field1295 = Statics.field1887[0];
        var0.field1296 = Statics.field1276[0];
        int var1 = var0.field1296 * var0.field1295;
        byte[] var2 = Statics.field2707[0];
        var0.field1298 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1298[var3] = Statics.field711[var2[var3] & 0xFF];
        }
        method2343();
        return var0;
    }

    @ObfuscatedName("ez.v(Ler;III)Z")
    public static boolean method2722(class149 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2746(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2448(var3);
            return true;
        }
    }

    @ObfuscatedName("client.i(Ler;II)Z")
    public static boolean method460(class149 arg0, int arg1) {
        byte[] var2 = arg0.method2751(arg1);
        if (var2 == null) {
            return false;
        } else {
            method2448(var2);
            return true;
        }
    }

    @ObfuscatedName("dp.x([BI)V")
    public static void method2448(byte[] arg0) {
        class108 var1 = new class108(arg0);
        var1.field1826 = arg0.length - 2;
        Statics.field1280 = var1.method2136();
        Statics.field1279 = new int[Statics.field1280];
        Statics.field1281 = new int[Statics.field1280];
        Statics.field1887 = new int[Statics.field1280];
        Statics.field1276 = new int[Statics.field1280];
        Statics.field2707 = new byte[Statics.field1280][];
        var1.field1826 = arg0.length - 7 - Statics.field1280 * 8;
        Statics.field1277 = var1.method2136();
        Statics.field1278 = var1.method2136();
        int var2 = (var1.method2134() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1280; var3++) {
            Statics.field1279[var3] = var1.method2136();
        }
        for (int var4 = 0; var4 < Statics.field1280; var4++) {
            Statics.field1281[var4] = var1.method2136();
        }
        for (int var5 = 0; var5 < Statics.field1280; var5++) {
            Statics.field1887[var5] = var1.method2136();
        }
        for (int var6 = 0; var6 < Statics.field1280; var6++) {
            Statics.field1276[var6] = var1.method2136();
        }
        var1.field1826 = arg0.length - 7 - Statics.field1280 * 8 - (var2 - 1) * 3;
        Statics.field711 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field711[var7] = var1.method2138();
            if (Statics.field711[var7] == 0) {
                Statics.field711[var7] = 1;
            }
        }
        var1.field1826 = 0;
        for (int var8 = 0; var8 < Statics.field1280; var8++) {
            int var9 = Statics.field1887[var8];
            int var10 = Statics.field1276[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2707[var8] = var12;
            int var13 = var1.method2134();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2229();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2229();
                    }
                }
            }
        }
    }

    @ObfuscatedName("dx.h(I)V")
    public static void method2343() {
        Statics.field1279 = null;
        Statics.field1281 = null;
        Statics.field1887 = null;
        Statics.field1276 = null;
        Statics.field711 = null;
        Statics.field2707 = (byte[][]) null;
    }
}
