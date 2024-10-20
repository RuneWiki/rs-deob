package deob;

@ObfuscatedName("bk")
public class class72 {

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bg.n(Lfs;III)[Lbe;")
    public static class76[] method1388(class158 arg0, int arg1, int arg2) {
        return method45(arg0, arg1, arg2) ? method755() : null;
    }

    @ObfuscatedName("eo.d(Lfs;III)[Lbx;")
    public static class74[] method2856(class158 arg0, int arg1, int arg2) {
        if (!method45(arg0, arg1, arg2)) {
            return null;
        }
        class74[] var3 = new class74[Statics.field1321];
        for (int var4 = 0; var4 < Statics.field1321; var4++) {
            class74 var5 = var3[var4] = new class74();
            var5.field1340 = Statics.field2049;
            var5.field1335 = Statics.field1322;
            var5.field1339 = Statics.field1317[var4];
            var5.field1337 = Statics.field1318[var4];
            var5.field1336 = Statics.field2802[var4];
            var5.field1342 = Statics.field1319[var4];
            int var6 = var5.field1342 * var5.field1336;
            byte[] var7 = Statics.field1323[var4];
            var5.field1338 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1338[var8] = Statics.field157[var7[var8] & 0xFF];
            }
        }
        method943();
        return var3;
    }

    @ObfuscatedName("bh.z(Lfs;Lfs;III)Lhd;")
    public static class215 method1412(class158 arg0, class158 arg1, int arg2, int arg3) {
        if (!method45(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method2948(arg2, arg3);
        class215 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class215 var6 = new class215(var4, Statics.field1317, Statics.field1318, Statics.field2802, Statics.field1319, Statics.field157, Statics.field1323);
            method943();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("w.y(Lfs;Ljava/lang/String;Ljava/lang/String;B)[Lbe;")
    public static class76[] method589(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2963(arg1);
        int var4 = arg0.method2964(var3, arg2);
        return method1388(arg0, var3, var4);
    }

    @ObfuscatedName("ft.e(Lfs;Ljava/lang/String;Ljava/lang/String;I)Lbe;")
    public static class76 method3076(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2963(arg1);
        int var4 = arg0.method2964(var3, arg2);
        class76 var5;
        if (method45(arg0, var3, var4)) {
            class76 var6 = new class76();
            var6.field1355 = Statics.field2049;
            var6.field1359 = Statics.field1322;
            var6.field1358 = Statics.field1317[0];
            var6.field1360 = Statics.field1318[0];
            var6.field1356 = Statics.field2802[0];
            var6.field1357 = Statics.field1319[0];
            var6.field1361 = Statics.field157;
            var6.field1354 = Statics.field1323[0];
            method943();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("df.g(Lfs;Ljava/lang/String;Ljava/lang/String;I)[Lbx;")
    public static class74[] method2519(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2963(arg1);
        int var4 = arg0.method2964(var3, arg2);
        return method2856(arg0, var3, var4);
    }

    @ObfuscatedName("t.f(Lfs;Ljava/lang/String;Ljava/lang/String;B)Lbx;")
    public static class74 method555(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2963(arg1);
        int var4 = arg0.method2964(var3, arg2);
        class74 var5;
        if (method45(arg0, var3, var4)) {
            class74 var6 = new class74();
            var6.field1340 = Statics.field2049;
            var6.field1335 = Statics.field1322;
            var6.field1339 = Statics.field1317[0];
            var6.field1337 = Statics.field1318[0];
            var6.field1336 = Statics.field2802[0];
            var6.field1342 = Statics.field1319[0];
            int var7 = var6.field1342 * var6.field1336;
            byte[] var8 = Statics.field1323[0];
            var6.field1338 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field1338[var9] = Statics.field157[var8[var9] & 0xFF];
            }
            method943();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("j.m(Lfs;IB)Lbe;")
    public static class76 method161(class158 arg0, int arg1) {
        byte[] var2 = arg0.method2953(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method3397(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class76 var4 = new class76();
        var4.field1355 = Statics.field2049;
        var4.field1359 = Statics.field1322;
        var4.field1358 = Statics.field1317[0];
        var4.field1360 = Statics.field1318[0];
        var4.field1356 = Statics.field2802[0];
        var4.field1357 = Statics.field1319[0];
        var4.field1361 = Statics.field157;
        var4.field1354 = Statics.field1323[0];
        method943();
        return var4;
    }

    @ObfuscatedName("at.a(I)[Lbe;")
    public static class76[] method755() {
        class76[] var0 = new class76[Statics.field1321];
        for (int var1 = 0; var1 < Statics.field1321; var1++) {
            class76 var2 = var0[var1] = new class76();
            var2.field1355 = Statics.field2049;
            var2.field1359 = Statics.field1322;
            var2.field1358 = Statics.field1317[var1];
            var2.field1360 = Statics.field1318[var1];
            var2.field1356 = Statics.field2802[var1];
            var2.field1357 = Statics.field1319[var1];
            var2.field1361 = Statics.field157;
            var2.field1354 = Statics.field1323[var1];
        }
        method943();
        return var0;
    }

    @ObfuscatedName("g.h(Lfs;III)Z")
    public static boolean method45(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2948(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3397(var3);
            return true;
        }
    }

    @ObfuscatedName("fj.l([BB)V")
    public static void method3397(byte[] arg0) {
        class111 var1 = new class111(arg0);
        var1.field1889 = arg0.length - 2;
        Statics.field1321 = var1.method2231();
        Statics.field1317 = new int[Statics.field1321];
        Statics.field1318 = new int[Statics.field1321];
        Statics.field2802 = new int[Statics.field1321];
        Statics.field1319 = new int[Statics.field1321];
        Statics.field1323 = new byte[Statics.field1321][];
        var1.field1889 = arg0.length - 7 - Statics.field1321 * 8;
        Statics.field2049 = var1.method2231();
        Statics.field1322 = var1.method2231();
        int var2 = (var1.method2228() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1321; var3++) {
            Statics.field1317[var3] = var1.method2231();
        }
        for (int var4 = 0; var4 < Statics.field1321; var4++) {
            Statics.field1318[var4] = var1.method2231();
        }
        for (int var5 = 0; var5 < Statics.field1321; var5++) {
            Statics.field2802[var5] = var1.method2231();
        }
        for (int var6 = 0; var6 < Statics.field1321; var6++) {
            Statics.field1319[var6] = var1.method2231();
        }
        var1.field1889 = arg0.length - 7 - Statics.field1321 * 8 - (var2 - 1) * 3;
        Statics.field157 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field157[var7] = var1.method2232();
            if (Statics.field157[var7] == 0) {
                Statics.field157[var7] = 1;
            }
        }
        var1.field1889 = 0;
        for (int var8 = 0; var8 < Statics.field1321; var8++) {
            int var9 = Statics.field2802[var8];
            int var10 = Statics.field1319[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1323[var8] = var12;
            int var13 = var1.method2228();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2409();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2409();
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.u(I)V")
    public static void method943() {
        Statics.field1317 = null;
        Statics.field1318 = null;
        Statics.field2802 = null;
        Statics.field1319 = null;
        Statics.field157 = null;
        Statics.field1323 = (byte[][]) null;
    }
}
