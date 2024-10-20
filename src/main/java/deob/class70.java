package deob;

@ObfuscatedName("bw")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.n(Lej;III)[Lby;")
    public static class74[] method82(class147 arg0, int arg1, int arg2) {
        return method521(arg0, arg1, arg2) ? method263() : null;
    }

    @ObfuscatedName("bj.x(Lej;IIB)[Lbq;")
    public static class72[] method1431(class147 arg0, int arg1, int arg2) {
        return method521(arg0, arg1, arg2) ? method510() : null;
    }

    @ObfuscatedName("bt.i(Lej;Ljava/lang/String;Ljava/lang/String;B)Lby;")
    public static class74 method1319(class147 arg0, String arg1, String arg2) {
        int var3 = arg0.method2729(arg1);
        int var4 = arg0.method2690(var3, arg2);
        class74 var5;
        if (method521(arg0, var3, var4)) {
            var5 = method803();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ao.d(Lej;Ljava/lang/String;Ljava/lang/String;I)[Lbq;")
    public static class72[] method822(class147 arg0, String arg1, String arg2) {
        int var3 = arg0.method2729(arg1);
        int var4 = arg0.method2690(var3, arg2);
        return method1431(arg0, var3, var4);
    }

    @ObfuscatedName("b.q(Lej;Ljava/lang/String;Ljava/lang/String;S)Lbq;")
    public static class72 method536(class147 arg0, String arg1, String arg2) {
        int var3 = arg0.method2729(arg1);
        int var4 = arg0.method2690(var3, arg2);
        class72 var5;
        if (method521(arg0, var3, var4)) {
            class72 var6 = new class72();
            var6.field1293 = Statics.field1277;
            var6.field1294 = Statics.field1272;
            var6.field1295 = Statics.field1813[0];
            var6.field1292 = Statics.field1801[0];
            var6.field1291 = Statics.field1275[0];
            var6.field1290 = Statics.field1276[0];
            int var7 = var6.field1291 * var6.field1290;
            byte[] var8 = Statics.field146[0];
            var6.field1298 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field1298[var9] = Statics.field2008[var8[var9] & 0xFF];
            }
            method2546();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("aa.m(Lej;Lej;Ljava/lang/String;Ljava/lang/String;I)Lgu;")
    public static class194 method577(class147 arg0, class147 arg1, String arg2, String arg3) {
        int var4 = arg0.method2729(arg2);
        int var5 = arg0.method2690(var4, arg3);
        class194 var6;
        if (method521(arg0, var4, var5)) {
            byte[] var7 = arg1.method2738(var4, var5);
            class194 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class194 var9 = new class194(var7, Statics.field1813, Statics.field1801, Statics.field1275, Statics.field1276, Statics.field2008, Statics.field146);
                method2546();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("client.a(I)[Lby;")
    public static class74[] method263() {
        class74[] var0 = new class74[Statics.field1273];
        for (int var1 = 0; var1 < Statics.field1273; var1++) {
            class74 var2 = var0[var1] = new class74();
            var2.field1308 = Statics.field1277;
            var2.field1314 = Statics.field1272;
            var2.field1311 = Statics.field1813[var1];
            var2.field1309 = Statics.field1801[var1];
            var2.field1307 = Statics.field1275[var1];
            var2.field1310 = Statics.field1276[var1];
            var2.field1313 = Statics.field2008;
            var2.field1312 = Statics.field146[var1];
        }
        method2546();
        return var0;
    }

    @ObfuscatedName("au.w(I)Lby;")
    public static class74 method803() {
        class74 var0 = new class74();
        var0.field1308 = Statics.field1277;
        var0.field1314 = Statics.field1272;
        var0.field1311 = Statics.field1813[0];
        var0.field1309 = Statics.field1801[0];
        var0.field1307 = Statics.field1275[0];
        var0.field1310 = Statics.field1276[0];
        var0.field1313 = Statics.field2008;
        var0.field1312 = Statics.field146[0];
        method2546();
        return var0;
    }

    @ObfuscatedName("g.e(I)[Lbq;")
    public static class72[] method510() {
        class72[] var0 = new class72[Statics.field1273];
        for (int var1 = 0; var1 < Statics.field1273; var1++) {
            class72 var2 = var0[var1] = new class72();
            var2.field1293 = Statics.field1277;
            var2.field1294 = Statics.field1272;
            var2.field1295 = Statics.field1813[var1];
            var2.field1292 = Statics.field1801[var1];
            var2.field1291 = Statics.field1275[var1];
            var2.field1290 = Statics.field1276[var1];
            int var3 = var2.field1291 * var2.field1290;
            byte[] var4 = Statics.field146[var1];
            var2.field1298 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1298[var5] = Statics.field2008[var4[var5] & 0xFF];
            }
        }
        method2546();
        return var0;
    }

    @ObfuscatedName("y.o(Lej;III)Z")
    public static boolean method521(class147 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2738(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method5(var3);
            return true;
        }
    }

    @ObfuscatedName("cw.v(Lej;IB)Z")
    public static boolean method1858(class147 arg0, int arg1) {
        byte[] var2 = arg0.method2679(arg1);
        if (var2 == null) {
            return false;
        } else {
            method5(var2);
            return true;
        }
    }

    @ObfuscatedName("x.z([BI)V")
    public static void method5(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1826 = arg0.length - 2;
        Statics.field1273 = var1.method2140();
        Statics.field1813 = new int[Statics.field1273];
        Statics.field1801 = new int[Statics.field1273];
        Statics.field1275 = new int[Statics.field1273];
        Statics.field1276 = new int[Statics.field1273];
        Statics.field146 = new byte[Statics.field1273][];
        var1.field1826 = arg0.length - 7 - Statics.field1273 * 8;
        Statics.field1277 = var1.method2140();
        Statics.field1272 = var1.method2140();
        int var2 = (var1.method2148() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1273; var3++) {
            Statics.field1813[var3] = var1.method2140();
        }
        for (int var4 = 0; var4 < Statics.field1273; var4++) {
            Statics.field1801[var4] = var1.method2140();
        }
        for (int var5 = 0; var5 < Statics.field1273; var5++) {
            Statics.field1275[var5] = var1.method2140();
        }
        for (int var6 = 0; var6 < Statics.field1273; var6++) {
            Statics.field1276[var6] = var1.method2140();
        }
        var1.field1826 = arg0.length - 7 - Statics.field1273 * 8 - (var2 - 1) * 3;
        Statics.field2008 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2008[var7] = var1.method2142();
            if (Statics.field2008[var7] == 0) {
                Statics.field2008[var7] = 1;
            }
        }
        var1.field1826 = 0;
        for (int var8 = 0; var8 < Statics.field1273; var8++) {
            int var9 = Statics.field1275[var8];
            int var10 = Statics.field1276[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field146[var8] = var12;
            int var13 = var1.method2148();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2175();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2175();
                    }
                }
            }
        }
    }

    @ObfuscatedName("dq.j(I)V")
    public static void method2546() {
        Statics.field1813 = null;
        Statics.field1801 = null;
        Statics.field1275 = null;
        Statics.field1276 = null;
        Statics.field2008 = null;
        Statics.field146 = (byte[][]) null;
    }
}
