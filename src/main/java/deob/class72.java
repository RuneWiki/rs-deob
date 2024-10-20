package deob;

@ObfuscatedName("bu")
public class class72 {

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dd.o(Lfg;III)[Lbw;")
    public static class76[] method2551(class158 arg0, int arg1, int arg2) {
        if (!method2037(arg0, arg1, arg2)) {
            return null;
        }
        class76[] var3 = new class76[Statics.field1314];
        for (int var4 = 0; var4 < Statics.field1314; var4++) {
            class76 var5 = var3[var4] = new class76();
            var5.field1349 = Statics.field1309;
            var5.field1350 = Statics.field1310;
            var5.field1344 = Statics.field1308[var4];
            var5.field1347 = Statics.field637[var4];
            var5.field1345 = Statics.field1318[var4];
            var5.field1346 = Statics.field1313[var4];
            var5.field1343 = Statics.field1934;
            var5.field1348 = Statics.field1876[var4];
        }
        Statics.method139();
        return var3;
    }

    @ObfuscatedName("an.l(Lfg;III)Lbw;")
    public static class76 method987(class158 arg0, int arg1, int arg2) {
        return method2037(arg0, arg1, arg2) ? method534() : null;
    }

    @ObfuscatedName("eo.g(Lfg;Ljava/lang/String;Ljava/lang/String;I)[Lbw;")
    public static class76[] method2690(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method3008(arg1);
        int var4 = arg0.method2956(var3, arg2);
        return method2551(arg0, var3, var4);
    }

    @ObfuscatedName("ad.u(Lfg;Ljava/lang/String;Ljava/lang/String;B)Lbw;")
    public static class76 method773(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method3008(arg1);
        int var4 = arg0.method2956(var3, arg2);
        return method987(arg0, var3, var4);
    }

    @ObfuscatedName("bu.q(Lfg;Ljava/lang/String;Ljava/lang/String;B)[Lbc;")
    public static class74[] method1471(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method3008(arg1);
        int var4 = arg0.method2956(var3, arg2);
        class74[] var5;
        if (method2037(arg0, var3, var4)) {
            var5 = method690();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fo.r(Lfg;Ljava/lang/String;Ljava/lang/String;S)Lbc;")
    public static class74 method3054(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method3008(arg1);
        int var4 = arg0.method2956(var3, arg2);
        class74 var5;
        if (method2037(arg0, var3, var4)) {
            var5 = method2841();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("w.y(B)Lbw;")
    public static class76 method534() {
        class76 var0 = new class76();
        var0.field1349 = Statics.field1309;
        var0.field1350 = Statics.field1310;
        var0.field1344 = Statics.field1308[0];
        var0.field1347 = Statics.field637[0];
        var0.field1345 = Statics.field1318[0];
        var0.field1346 = Statics.field1313[0];
        var0.field1343 = Statics.field1934;
        var0.field1348 = Statics.field1876[0];
        Statics.method139();
        return var0;
    }

    @ObfuscatedName("aa.k(I)[Lbc;")
    public static class74[] method690() {
        class74[] var0 = new class74[Statics.field1314];
        for (int var1 = 0; var1 < Statics.field1314; var1++) {
            class74 var2 = var0[var1] = new class74();
            var2.field1329 = Statics.field1309;
            var2.field1324 = Statics.field1310;
            var2.field1327 = Statics.field1308[var1];
            var2.field1326 = Statics.field637[var1];
            var2.field1325 = Statics.field1318[var1];
            var2.field1331 = Statics.field1313[var1];
            int var3 = var2.field1331 * var2.field1325;
            byte[] var4 = Statics.field1876[var1];
            var2.field1330 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1330[var5] = Statics.field1934[var4[var5] & 0xFF];
            }
        }
        Statics.method139();
        return var0;
    }

    @ObfuscatedName("ex.c(I)Lbc;")
    public static class74 method2841() {
        class74 var0 = new class74();
        var0.field1329 = Statics.field1309;
        var0.field1324 = Statics.field1310;
        var0.field1327 = Statics.field1308[0];
        var0.field1326 = Statics.field637[0];
        var0.field1325 = Statics.field1318[0];
        var0.field1331 = Statics.field1313[0];
        int var1 = var0.field1331 * var0.field1325;
        byte[] var2 = Statics.field1876[0];
        var0.field1330 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1330[var3] = Statics.field1934[var2[var3] & 0xFF];
        }
        Statics.method139();
        return var0;
    }

    @ObfuscatedName("cg.j(Lfg;III)Z")
    public static boolean method2037(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2940(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method830(var3);
            return true;
        }
    }

    @ObfuscatedName("ef.m(Lfg;II)Z")
    public static boolean method2854(class158 arg0, int arg1) {
        byte[] var2 = arg0.method2957(arg1);
        if (var2 == null) {
            return false;
        } else {
            method830(var2);
            return true;
        }
    }

    @ObfuscatedName("ax.a([BI)V")
    public static void method830(byte[] arg0) {
        class111 var1 = new class111(arg0);
        var1.field1861 = arg0.length - 2;
        Statics.field1314 = var1.method2397();
        Statics.field1308 = new int[Statics.field1314];
        Statics.field637 = new int[Statics.field1314];
        Statics.field1318 = new int[Statics.field1314];
        Statics.field1313 = new int[Statics.field1314];
        Statics.field1876 = new byte[Statics.field1314][];
        var1.field1861 = arg0.length - 7 - Statics.field1314 * 8;
        Statics.field1309 = var1.method2397();
        Statics.field1310 = var1.method2397();
        int var2 = (var1.method2219() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1314; var3++) {
            Statics.field1308[var3] = var1.method2397();
        }
        for (int var4 = 0; var4 < Statics.field1314; var4++) {
            Statics.field637[var4] = var1.method2397();
        }
        for (int var5 = 0; var5 < Statics.field1314; var5++) {
            Statics.field1318[var5] = var1.method2397();
        }
        for (int var6 = 0; var6 < Statics.field1314; var6++) {
            Statics.field1313[var6] = var1.method2397();
        }
        var1.field1861 = arg0.length - 7 - Statics.field1314 * 8 - (var2 - 1) * 3;
        Statics.field1934 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1934[var7] = var1.method2258();
            if (Statics.field1934[var7] == 0) {
                Statics.field1934[var7] = 1;
            }
        }
        var1.field1861 = 0;
        for (int var8 = 0; var8 < Statics.field1314; var8++) {
            int var9 = Statics.field1318[var8];
            int var10 = Statics.field1313[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1876[var8] = var12;
            int var13 = var1.method2219();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2220();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2220();
                    }
                }
            }
        }
    }
}
