package deob;

@ObfuscatedName("bx")
public class class67 {

    public class67() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fa.m(Lek;III)[Lbu;")
    public static class71[] method3121(class142 arg0, int arg1, int arg2) {
        return method609(arg0, arg1, arg2) ? method777() : null;
    }

    @ObfuscatedName("x.k(Lek;IIB)Lbu;")
    public static class71 method517(class142 arg0, int arg1, int arg2) {
        if (!method609(arg0, arg1, arg2)) {
            return null;
        }
        class71 var3 = new class71();
        var3.field1289 = Statics.field1236;
        var3.field1290 = Statics.field1251;
        var3.field1287 = Statics.field1249[0];
        var3.field1283 = Statics.field1250[0];
        var3.field1285 = Statics.field972[0];
        var3.field1288 = Statics.field950[0];
        var3.field1284 = Statics.field1247;
        var3.field1286 = Statics.field1252[0];
        method793();
        return var3;
    }

    @ObfuscatedName("av.y(Lek;III)[Lbb;")
    public static class69[] method550(class142 arg0, int arg1, int arg2) {
        return method609(arg0, arg1, arg2) ? method166() : null;
    }

    @ObfuscatedName("y.g(Lek;Ljava/lang/String;Ljava/lang/String;I)[Lbu;")
    public static class71[] method24(class142 arg0, String arg1, String arg2) {
        int var3 = arg0.method2757(arg1);
        int var4 = arg0.method2715(var3, arg2);
        return method3121(arg0, var3, var4);
    }

    @ObfuscatedName("an.r(Lek;Ljava/lang/String;Ljava/lang/String;I)Lbu;")
    public static class71 method767(class142 arg0, String arg1, String arg2) {
        int var3 = arg0.method2757(arg1);
        int var4 = arg0.method2715(var3, arg2);
        return method517(arg0, var3, var4);
    }

    @ObfuscatedName("ej.i(Lek;Ljava/lang/String;Ljava/lang/String;I)[Lbb;")
    public static class69[] method2948(class142 arg0, String arg1, String arg2) {
        int var3 = arg0.method2757(arg1);
        int var4 = arg0.method2715(var3, arg2);
        return method550(arg0, var3, var4);
    }

    @ObfuscatedName("ax.f(Lek;Ljava/lang/String;Ljava/lang/String;I)Lbb;")
    public static class69 method989(class142 arg0, String arg1, String arg2) {
        int var3 = arg0.method2757(arg1);
        int var4 = arg0.method2715(var3, arg2);
        class69 var5;
        if (method609(arg0, var3, var4)) {
            var5 = method40();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("au.a(I)[Lbu;")
    public static class71[] method777() {
        class71[] var0 = new class71[Statics.field1253];
        for (int var1 = 0; var1 < Statics.field1253; var1++) {
            class71 var2 = var0[var1] = new class71();
            var2.field1289 = Statics.field1236;
            var2.field1290 = Statics.field1251;
            var2.field1287 = Statics.field1249[var1];
            var2.field1283 = Statics.field1250[var1];
            var2.field1285 = Statics.field972[var1];
            var2.field1288 = Statics.field950[var1];
            var2.field1284 = Statics.field1247;
            var2.field1286 = Statics.field1252[var1];
        }
        method793();
        return var0;
    }

    @ObfuscatedName("v.w(I)[Lbb;")
    public static class69[] method166() {
        class69[] var0 = new class69[Statics.field1253];
        for (int var1 = 0; var1 < Statics.field1253; var1++) {
            class69 var2 = var0[var1] = new class69();
            var2.field1269 = Statics.field1236;
            var2.field1270 = Statics.field1251;
            var2.field1267 = Statics.field1249[var1];
            var2.field1275 = Statics.field1250[var1];
            var2.field1273 = Statics.field972[var1];
            var2.field1266 = Statics.field950[var1];
            int var3 = var2.field1273 * var2.field1266;
            byte[] var4 = Statics.field1252[var1];
            var2.field1265 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1265[var5] = Statics.field1247[var4[var5] & 0xFF];
            }
        }
        method793();
        return var0;
    }

    @ObfuscatedName("r.u(B)Lbb;")
    public static class69 method40() {
        class69 var0 = new class69();
        var0.field1269 = Statics.field1236;
        var0.field1270 = Statics.field1251;
        var0.field1267 = Statics.field1249[0];
        var0.field1275 = Statics.field1250[0];
        var0.field1273 = Statics.field972[0];
        var0.field1266 = Statics.field950[0];
        int var1 = var0.field1273 * var0.field1266;
        byte[] var2 = Statics.field1252[0];
        var0.field1265 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1265[var3] = Statics.field1247[var2[var3] & 0xFF];
        }
        method793();
        return var0;
    }

    @ObfuscatedName("aj.d(Lek;III)Z")
    public static boolean method609(class142 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2725(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method610(var3);
            return true;
        }
    }

    @ObfuscatedName("aj.t([BI)V")
    public static void method610(byte[] arg0) {
        class104 var1 = new class104(arg0);
        var1.field1806 = arg0.length - 2;
        Statics.field1253 = var1.method2132();
        Statics.field1249 = new int[Statics.field1253];
        Statics.field1250 = new int[Statics.field1253];
        Statics.field972 = new int[Statics.field1253];
        Statics.field950 = new int[Statics.field1253];
        Statics.field1252 = new byte[Statics.field1253][];
        var1.field1806 = arg0.length - 7 - Statics.field1253 * 8;
        Statics.field1236 = var1.method2132();
        Statics.field1251 = var1.method2132();
        int var2 = (var1.method2190() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1253; var3++) {
            Statics.field1249[var3] = var1.method2132();
        }
        for (int var4 = 0; var4 < Statics.field1253; var4++) {
            Statics.field1250[var4] = var1.method2132();
        }
        for (int var5 = 0; var5 < Statics.field1253; var5++) {
            Statics.field972[var5] = var1.method2132();
        }
        for (int var6 = 0; var6 < Statics.field1253; var6++) {
            Statics.field950[var6] = var1.method2132();
        }
        var1.field1806 = arg0.length - 7 - Statics.field1253 * 8 - (var2 - 1) * 3;
        Statics.field1247 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1247[var7] = var1.method2134();
            if (Statics.field1247[var7] == 0) {
                Statics.field1247[var7] = 1;
            }
        }
        var1.field1806 = 0;
        for (int var8 = 0; var8 < Statics.field1253; var8++) {
            int var9 = Statics.field972[var8];
            int var10 = Statics.field950[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1252[var8] = var12;
            int var13 = var1.method2190();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2159();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2159();
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.j(I)V")
    public static void method793() {
        Statics.field1249 = null;
        Statics.field1250 = null;
        Statics.field972 = null;
        Statics.field950 = null;
        Statics.field1247 = null;
        Statics.field1252 = (byte[][]) null;
    }
}
