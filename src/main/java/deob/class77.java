package deob;

@ObfuscatedName("bk")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dj.o(Lfd;III)Lcj;")
    public static class81 method2598(class167 arg0, int arg1, int arg2) {
        if (!method668(arg0, arg1, arg2)) {
            return null;
        }
        class81 var3 = new class81();
        var3.field1404 = Statics.field1370;
        var3.field1406 = Statics.field1372;
        var3.field1408 = Statics.field1375[0];
        var3.field1409 = Statics.field1942[0];
        var3.field1410 = Statics.field1964[0];
        var3.field1407 = Statics.field2021[0];
        var3.field1405 = Statics.field715;
        var3.field1411 = Statics.field1374[0];
        method896();
        return var3;
    }

    @ObfuscatedName("p.f(Lfd;III)Lcb;")
    public static class79 method97(class167 arg0, int arg1, int arg2) {
        return method668(arg0, arg1, arg2) ? method142() : null;
    }

    @ObfuscatedName("x.i(Lfd;Ljava/lang/String;Ljava/lang/String;I)[Lcj;")
    public static class81[] method610(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method2989(arg1);
        int var4 = arg0.method2990(var3, arg2);
        class81[] var5;
        if (method668(arg0, var3, var4)) {
            class81[] var6 = new class81[Statics.field1373];
            for (int var7 = 0; var7 < Statics.field1373; var7++) {
                class81 var8 = var6[var7] = new class81();
                var8.field1404 = Statics.field1370;
                var8.field1406 = Statics.field1372;
                var8.field1408 = Statics.field1375[var7];
                var8.field1409 = Statics.field1942[var7];
                var8.field1410 = Statics.field1964[var7];
                var8.field1407 = Statics.field2021[var7];
                var8.field1405 = Statics.field715;
                var8.field1411 = Statics.field1374[var7];
            }
            method896();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("au.h(Lfd;Ljava/lang/String;Ljava/lang/String;I)Lcj;")
    public static class81 method814(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method2989(arg1);
        int var4 = arg0.method2990(var3, arg2);
        return method2598(arg0, var3, var4);
    }

    @ObfuscatedName("bl.q(Lfd;Ljava/lang/String;Ljava/lang/String;I)[Lcb;")
    public static class79[] method1526(class167 arg0, String arg1, String arg2) {
        int var3 = arg0.method2989(arg1);
        int var4 = arg0.method2990(var3, arg2);
        class79[] var5;
        if (method668(arg0, var3, var4)) {
            class79[] var6 = new class79[Statics.field1373];
            for (int var7 = 0; var7 < Statics.field1373; var7++) {
                class79 var8 = var6[var7] = new class79();
                var8.field1396 = Statics.field1370;
                var8.field1391 = Statics.field1372;
                var8.field1388 = Statics.field1375[var7];
                var8.field1389 = Statics.field1942[var7];
                var8.field1386 = Statics.field1964[var7];
                var8.field1385 = Statics.field2021[var7];
                int var9 = var8.field1386 * var8.field1385;
                byte[] var10 = Statics.field1374[var7];
                var8.field1392 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field1392[var11] = Statics.field715[var10[var11] & 0xFF];
                }
            }
            method896();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("r.u(Lfd;Lfd;Ljava/lang/String;Ljava/lang/String;B)Lhf;")
    public static class224 method540(class167 arg0, class167 arg1, String arg2, String arg3) {
        int var4 = arg0.method2989(arg2);
        int var5 = arg0.method2990(var4, arg3);
        class224 var6;
        if (method668(arg0, var4, var5)) {
            var6 = method1148(arg1.method3030(var4, var5));
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("ci.m(Lfd;IB)Lcj;")
    public static class81 method2079(class167 arg0, int arg1) {
        if (!method3438(arg0, arg1)) {
            return null;
        }
        class81 var2 = new class81();
        var2.field1404 = Statics.field1370;
        var2.field1406 = Statics.field1372;
        var2.field1408 = Statics.field1375[0];
        var2.field1409 = Statics.field1942[0];
        var2.field1410 = Statics.field1964[0];
        var2.field1407 = Statics.field2021[0];
        var2.field1405 = Statics.field715;
        var2.field1411 = Statics.field1374[0];
        method896();
        return var2;
    }

    @ObfuscatedName("e.y(I)Lcb;")
    public static class79 method142() {
        class79 var0 = new class79();
        var0.field1396 = Statics.field1370;
        var0.field1391 = Statics.field1372;
        var0.field1388 = Statics.field1375[0];
        var0.field1389 = Statics.field1942[0];
        var0.field1386 = Statics.field1964[0];
        var0.field1385 = Statics.field2021[0];
        int var1 = var0.field1386 * var0.field1385;
        byte[] var2 = Statics.field1374[0];
        var0.field1392 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1392[var3] = Statics.field715[var2[var3] & 0xFF];
        }
        method896();
        return var0;
    }

    @ObfuscatedName("bp.p([BI)Lhf;")
    public static class224 method1148(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class224 var1 = new class224(arg0, Statics.field1375, Statics.field1942, Statics.field1964, Statics.field2021, Statics.field715, Statics.field1374);
            method896();
            return var1;
        }
    }

    @ObfuscatedName("am.t(Lfd;III)Z")
    public static boolean method668(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3030(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method29(var3);
            return true;
        }
    }

    @ObfuscatedName("go.g(Lfd;II)Z")
    public static boolean method3438(class167 arg0, int arg1) {
        byte[] var2 = arg0.method2979(arg1);
        if (var2 == null) {
            return false;
        } else {
            method29(var2);
            return true;
        }
    }

    @ObfuscatedName("i.v([BI)V")
    public static void method29(byte[] arg0) {
        class119 var1 = new class119(arg0);
        var1.field1984 = arg0.length - 2;
        Statics.field1373 = var1.method2292();
        Statics.field1375 = new int[Statics.field1373];
        Statics.field1942 = new int[Statics.field1373];
        Statics.field1964 = new int[Statics.field1373];
        Statics.field2021 = new int[Statics.field1373];
        Statics.field1374 = new byte[Statics.field1373][];
        var1.field1984 = arg0.length - 7 - Statics.field1373 * 8;
        Statics.field1370 = var1.method2292();
        Statics.field1372 = var1.method2292();
        int var2 = (var1.method2290() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1373; var3++) {
            Statics.field1375[var3] = var1.method2292();
        }
        for (int var4 = 0; var4 < Statics.field1373; var4++) {
            Statics.field1942[var4] = var1.method2292();
        }
        for (int var5 = 0; var5 < Statics.field1373; var5++) {
            Statics.field1964[var5] = var1.method2292();
        }
        for (int var6 = 0; var6 < Statics.field1373; var6++) {
            Statics.field2021[var6] = var1.method2292();
        }
        var1.field1984 = arg0.length - 7 - Statics.field1373 * 8 - (var2 - 1) * 3;
        Statics.field715 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field715[var7] = var1.method2477();
            if (Statics.field715[var7] == 0) {
                Statics.field715[var7] = 1;
            }
        }
        var1.field1984 = 0;
        for (int var8 = 0; var8 < Statics.field1373; var8++) {
            int var9 = Statics.field1964[var8];
            int var10 = Statics.field2021[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1374[var8] = var12;
            int var13 = var1.method2290();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2435();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2435();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.l(I)V")
    public static void method896() {
        Statics.field1375 = null;
        Statics.field1942 = null;
        Statics.field1964 = null;
        Statics.field2021 = null;
        Statics.field715 = null;
        Statics.field1374 = (byte[][]) null;
    }
}
