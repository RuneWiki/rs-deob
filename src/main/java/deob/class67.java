package deob;

@ObfuscatedName("bw")
public class class67 {

    public class67() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ci.z(Lel;IIB)[Lbu;")
    public static class71[] method1892(class142 arg0, int arg1, int arg2) {
        if (!method1309(arg0, arg1, arg2)) {
            return null;
        }
        class71[] var3 = new class71[Statics.field1253];
        for (int var4 = 0; var4 < Statics.field1253; var4++) {
            class71 var5 = var3[var4] = new class71();
            var5.field1291 = Statics.field1250;
            var5.field1292 = Statics.field1252;
            var5.field1285 = Statics.field1860[var4];
            var5.field1290 = Statics.field2871[var4];
            var5.field1287 = Statics.field1254[var4];
            var5.field1288 = Statics.field1223[var4];
            var5.field1286 = Statics.field1251;
            var5.field1289 = Statics.field229[var4];
        }
        method2566();
        return var3;
    }

    @ObfuscatedName("dy.n(Lel;IIB)Lbu;")
    public static class71 method2454(class142 arg0, int arg1, int arg2) {
        if (!method1309(arg0, arg1, arg2)) {
            return null;
        }
        class71 var3 = new class71();
        var3.field1291 = Statics.field1250;
        var3.field1292 = Statics.field1252;
        var3.field1285 = Statics.field1860[0];
        var3.field1290 = Statics.field2871[0];
        var3.field1287 = Statics.field1254[0];
        var3.field1288 = Statics.field1223[0];
        var3.field1286 = Statics.field1251;
        var3.field1289 = Statics.field229[0];
        method2566();
        return var3;
    }

    @ObfuscatedName("y.u(Lel;III)[Lbb;")
    public static class69[] method542(class142 arg0, int arg1, int arg2) {
        if (!method1309(arg0, arg1, arg2)) {
            return null;
        }
        class69[] var3 = new class69[Statics.field1253];
        for (int var4 = 0; var4 < Statics.field1253; var4++) {
            class69 var5 = var3[var4] = new class69();
            var5.field1271 = Statics.field1250;
            var5.field1272 = Statics.field1252;
            var5.field1269 = Statics.field1860[var4];
            var5.field1275 = Statics.field2871[var4];
            var5.field1266 = Statics.field1254[var4];
            var5.field1268 = Statics.field1223[var4];
            int var6 = var5.field1268 * var5.field1266;
            byte[] var7 = Statics.field229[var4];
            var5.field1274 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1274[var8] = Statics.field1251[var7[var8] & 0xFF];
            }
        }
        method2566();
        return var3;
    }

    @ObfuscatedName("am.t(Lel;III)Lbb;")
    public static class69 method845(class142 arg0, int arg1, int arg2) {
        return method1309(arg0, arg1, arg2) ? method588() : null;
    }

    @ObfuscatedName("v.e(Lel;Lel;III)Lgs;")
    public static class183 method118(class142 arg0, class142 arg1, int arg2, int arg3) {
        if (!method1309(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method2768(arg2, arg3);
        class183 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class183 var6 = new class183(var4, Statics.field1860, Statics.field2871, Statics.field1254, Statics.field1223, Statics.field1251, Statics.field229);
            method2566();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("bo.a(Lel;Ljava/lang/String;Ljava/lang/String;B)[Lbu;")
    public static class71[] method1310(class142 arg0, String arg1, String arg2) {
        int var3 = arg0.method2760(arg1);
        int var4 = arg0.method2761(var3, arg2);
        return method1892(arg0, var3, var4);
    }

    @ObfuscatedName("aj.l(Lel;Ljava/lang/String;Ljava/lang/String;B)Lbu;")
    public static class71 method812(class142 arg0, String arg1, String arg2) {
        int var3 = arg0.method2760(arg1);
        int var4 = arg0.method2761(var3, arg2);
        return method2454(arg0, var3, var4);
    }

    @ObfuscatedName("as.v(Lel;Ljava/lang/String;Ljava/lang/String;I)[Lbb;")
    public static class69[] method639(class142 arg0, String arg1, String arg2) {
        int var3 = arg0.method2760(arg1);
        int var4 = arg0.method2761(var3, arg2);
        return method542(arg0, var3, var4);
    }

    @ObfuscatedName("co.j(Lel;Ljava/lang/String;Ljava/lang/String;I)Lbb;")
    public static class69 method1787(class142 arg0, String arg1, String arg2) {
        int var3 = arg0.method2760(arg1);
        int var4 = arg0.method2761(var3, arg2);
        return method845(arg0, var3, var4);
    }

    @ObfuscatedName("d.k(Lel;IB)Lbu;")
    public static class71 method151(class142 arg0, int arg1) {
        byte[] var2 = arg0.method2815(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method658(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class71 var4 = new class71();
        var4.field1291 = Statics.field1250;
        var4.field1292 = Statics.field1252;
        var4.field1285 = Statics.field1860[0];
        var4.field1290 = Statics.field2871[0];
        var4.field1287 = Statics.field1254[0];
        var4.field1288 = Statics.field1223[0];
        var4.field1286 = Statics.field1251;
        var4.field1289 = Statics.field229[0];
        method2566();
        return var4;
    }

    @ObfuscatedName("ak.g(I)Lbb;")
    public static class69 method588() {
        class69 var0 = new class69();
        var0.field1271 = Statics.field1250;
        var0.field1272 = Statics.field1252;
        var0.field1269 = Statics.field1860[0];
        var0.field1275 = Statics.field2871[0];
        var0.field1266 = Statics.field1254[0];
        var0.field1268 = Statics.field1223[0];
        int var1 = var0.field1268 * var0.field1266;
        byte[] var2 = Statics.field229[0];
        var0.field1274 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1274[var3] = Statics.field1251[var2[var3] & 0xFF];
        }
        method2566();
        return var0;
    }

    @ObfuscatedName("bo.d(Lel;IIB)Z")
    public static boolean method1309(class142 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2768(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method658(var3);
            return true;
        }
    }

    @ObfuscatedName("ar.b([BI)V")
    public static void method658(byte[] arg0) {
        class104 var1 = new class104(arg0);
        var1.field1815 = arg0.length - 2;
        Statics.field1253 = var1.method2206();
        Statics.field1860 = new int[Statics.field1253];
        Statics.field2871 = new int[Statics.field1253];
        Statics.field1254 = new int[Statics.field1253];
        Statics.field1223 = new int[Statics.field1253];
        Statics.field229 = new byte[Statics.field1253][];
        var1.field1815 = arg0.length - 7 - Statics.field1253 * 8;
        Statics.field1250 = var1.method2206();
        Statics.field1252 = var1.method2206();
        int var2 = (var1.method2257() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1253; var3++) {
            Statics.field1860[var3] = var1.method2206();
        }
        for (int var4 = 0; var4 < Statics.field1253; var4++) {
            Statics.field2871[var4] = var1.method2206();
        }
        for (int var5 = 0; var5 < Statics.field1253; var5++) {
            Statics.field1254[var5] = var1.method2206();
        }
        for (int var6 = 0; var6 < Statics.field1253; var6++) {
            Statics.field1223[var6] = var1.method2206();
        }
        var1.field1815 = arg0.length - 7 - Statics.field1253 * 8 - (var2 - 1) * 3;
        Statics.field1251 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1251[var7] = var1.method2167();
            if (Statics.field1251[var7] == 0) {
                Statics.field1251[var7] = 1;
            }
        }
        var1.field1815 = 0;
        for (int var8 = 0; var8 < Statics.field1253; var8++) {
            int var9 = Statics.field1254[var8];
            int var10 = Statics.field1223[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field229[var8] = var12;
            int var13 = var1.method2257();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2237();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2237();
                    }
                }
            }
        }
    }

    @ObfuscatedName("di.i(I)V")
    public static void method2566() {
        Statics.field1860 = null;
        Statics.field2871 = null;
        Statics.field1254 = null;
        Statics.field1223 = null;
        Statics.field1251 = null;
        Statics.field229 = (byte[][]) null;
    }
}
