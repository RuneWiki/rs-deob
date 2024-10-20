package deob;

@ObfuscatedName("bx")
public class class72 {

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.t(Lfj;III)[Lbb;")
    public static class74[] method38(class158 arg0, int arg1, int arg2) {
        if (!Statics.method147(arg0, arg1, arg2)) {
            return null;
        }
        class74[] var3 = new class74[Statics.field1292];
        for (int var4 = 0; var4 < Statics.field1292; var4++) {
            class74 var5 = var3[var4] = new class74();
            var5.field1319 = Statics.field1290;
            var5.field1323 = Statics.field1291;
            var5.field1324 = Statics.field2795[var4];
            var5.field1314 = Statics.field1293[var4];
            var5.field1315 = Statics.field1951[var4];
            var5.field1316 = Statics.field135[var4];
            int var6 = var5.field1316 * var5.field1315;
            byte[] var7 = Statics.field1852[var4];
            var5.field1317 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1317[var8] = Statics.field1920[var7[var8] & 0xFF];
            }
        }
        method39();
        return var3;
    }

    @ObfuscatedName("af.b(Lfj;Ljava/lang/String;Ljava/lang/String;I)[Lbd;")
    public static class76[] method989(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2892(arg1);
        int var4 = arg0.method2897(var3, arg2);
        class76[] var5;
        if (Statics.method147(arg0, var3, var4)) {
            class76[] var6 = new class76[Statics.field1292];
            for (int var7 = 0; var7 < Statics.field1292; var7++) {
                class76 var8 = var6[var7] = new class76();
                var8.field1333 = Statics.field1290;
                var8.field1340 = Statics.field1291;
                var8.field1337 = Statics.field2795[var7];
                var8.field1339 = Statics.field1293[var7];
                var8.field1335 = Statics.field1951[var7];
                var8.field1336 = Statics.field135[var7];
                var8.field1334 = Statics.field1920;
                var8.field1338 = Statics.field1852[var7];
            }
            method39();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("dh.p(Lfj;Ljava/lang/String;Ljava/lang/String;B)Lbd;")
    public static class76 method2546(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2892(arg1);
        int var4 = arg0.method2897(var3, arg2);
        class76 var5;
        if (Statics.method147(arg0, var3, var4)) {
            var5 = method758();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("do.e(Lfj;Ljava/lang/String;Ljava/lang/String;B)[Lbb;")
    public static class74[] method2445(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2892(arg1);
        int var4 = arg0.method2897(var3, arg2);
        return method38(arg0, var3, var4);
    }

    @ObfuscatedName("cl.i(Lfj;IB)Lbd;")
    public static class76 method1905(class158 arg0, int arg1) {
        byte[] var2 = arg0.method2886(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method140(var2);
            var3 = true;
        }
        return var3 ? method758() : null;
    }

    @ObfuscatedName("al.o(I)Lbd;")
    public static class76 method758() {
        class76 var0 = new class76();
        var0.field1333 = Statics.field1290;
        var0.field1340 = Statics.field1291;
        var0.field1337 = Statics.field2795[0];
        var0.field1339 = Statics.field1293[0];
        var0.field1335 = Statics.field1951[0];
        var0.field1336 = Statics.field135[0];
        var0.field1334 = Statics.field1920;
        var0.field1338 = Statics.field1852[0];
        method39();
        return var0;
    }

    @ObfuscatedName("a.f(I)Lbb;")
    public static class74 method144() {
        class74 var0 = new class74();
        var0.field1319 = Statics.field1290;
        var0.field1323 = Statics.field1291;
        var0.field1324 = Statics.field2795[0];
        var0.field1314 = Statics.field1293[0];
        var0.field1315 = Statics.field1951[0];
        var0.field1316 = Statics.field135[0];
        int var1 = var0.field1316 * var0.field1315;
        byte[] var2 = Statics.field1852[0];
        var0.field1317 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1317[var3] = Statics.field1920[var2[var3] & 0xFF];
        }
        method39();
        return var0;
    }

    @ObfuscatedName("v.j([BI)V")
    public static void method140(byte[] arg0) {
        class111 var1 = new class111(arg0);
        var1.field1867 = arg0.length - 2;
        Statics.field1292 = var1.method2255();
        Statics.field2795 = new int[Statics.field1292];
        Statics.field1293 = new int[Statics.field1292];
        Statics.field1951 = new int[Statics.field1292];
        Statics.field135 = new int[Statics.field1292];
        Statics.field1852 = new byte[Statics.field1292][];
        var1.field1867 = arg0.length - 7 - Statics.field1292 * 8;
        Statics.field1290 = var1.method2255();
        Statics.field1291 = var1.method2255();
        int var2 = (var1.method2172() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1292; var3++) {
            Statics.field2795[var3] = var1.method2255();
        }
        for (int var4 = 0; var4 < Statics.field1292; var4++) {
            Statics.field1293[var4] = var1.method2255();
        }
        for (int var5 = 0; var5 < Statics.field1292; var5++) {
            Statics.field1951[var5] = var1.method2255();
        }
        for (int var6 = 0; var6 < Statics.field1292; var6++) {
            Statics.field135[var6] = var1.method2255();
        }
        var1.field1867 = arg0.length - 7 - Statics.field1292 * 8 - (var2 - 1) * 3;
        Statics.field1920 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1920[var7] = var1.method2307();
            if (Statics.field1920[var7] == 0) {
                Statics.field1920[var7] = 1;
            }
        }
        var1.field1867 = 0;
        for (int var8 = 0; var8 < Statics.field1292; var8++) {
            int var9 = Statics.field1951[var8];
            int var10 = Statics.field135[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1852[var8] = var12;
            int var13 = var1.method2172();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2358();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2358();
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.x(B)V")
    public static void method39() {
        Statics.field2795 = null;
        Statics.field1293 = null;
        Statics.field1951 = null;
        Statics.field135 = null;
        Statics.field1920 = null;
        Statics.field1852 = (byte[][]) null;
    }
}
