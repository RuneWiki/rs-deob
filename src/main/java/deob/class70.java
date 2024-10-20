package deob;

@ObfuscatedName("bq")
public class class70 {

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dp.k(Lei;III)Lbb;")
    public static class72 method2446(class147 arg0, int arg1, int arg2) {
        return method490(arg0, arg1, arg2) ? method484() : null;
    }

    @ObfuscatedName("y.y(Lei;Ljava/lang/String;Ljava/lang/String;B)[Lbz;")
    public static class74[] method15(class147 arg0, String arg1, String arg2) {
        int var3 = arg0.method2743(arg1);
        int var4 = arg0.method2744(var3, arg2);
        class74[] var5;
        if (method490(arg0, var3, var4)) {
            class74[] var6 = new class74[Statics.field1265];
            for (int var7 = 0; var7 < Statics.field1265; var7++) {
                class74 var8 = var6[var7] = new class74();
                var8.field1306 = Statics.field1259;
                var8.field1301 = Statics.field1824;
                var8.field1304 = Statics.field1261[var7];
                var8.field1305 = Statics.field2677[var7];
                var8.field1302 = Statics.field1269[var7];
                var8.field1303 = Statics.field1263[var7];
                var8.field1307 = Statics.field1266;
                var8.field1300 = Statics.field1264[var7];
            }
            method2847();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ew.s(Lei;Ljava/lang/String;Ljava/lang/String;I)Lbz;")
    public static class74 method2874(class147 arg0, String arg1, String arg2) {
        int var3 = arg0.method2743(arg1);
        int var4 = arg0.method2744(var3, arg2);
        class74 var5;
        if (method490(arg0, var3, var4)) {
            var5 = Statics.method748();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bw.g(Lei;Ljava/lang/String;Ljava/lang/String;I)[Lbb;")
    public static class72[] method1603(class147 arg0, String arg1, String arg2) {
        int var3 = arg0.method2743(arg1);
        int var4 = arg0.method2744(var3, arg2);
        class72[] var5;
        if (method490(arg0, var3, var4)) {
            var5 = method2855();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("az.h(Lei;Ljava/lang/String;Ljava/lang/String;I)Lbb;")
    public static class72 method830(class147 arg0, String arg1, String arg2) {
        int var3 = arg0.method2743(arg1);
        int var4 = arg0.method2744(var3, arg2);
        return method2446(arg0, var3, var4);
    }

    @ObfuscatedName("cs.l(Lei;II)Lbz;")
    public static class74 method1871(class147 arg0, int arg1) {
        return method535(arg0, arg1) ? Statics.method748() : null;
    }

    @ObfuscatedName("eu.u(I)[Lbb;")
    public static class72[] method2855() {
        class72[] var0 = new class72[Statics.field1265];
        for (int var1 = 0; var1 < Statics.field1265; var1++) {
            class72 var2 = var0[var1] = new class72();
            var2.field1286 = Statics.field1259;
            var2.field1287 = Statics.field1824;
            var2.field1284 = Statics.field1261[var1];
            var2.field1291 = Statics.field2677[var1];
            var2.field1282 = Statics.field1269[var1];
            var2.field1281 = Statics.field1263[var1];
            int var3 = var2.field1282 * var2.field1281;
            byte[] var4 = Statics.field1264[var1];
            var2.field1288 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1288[var5] = Statics.field1266[var4[var5] & 0xFF];
            }
        }
        method2847();
        return var0;
    }

    @ObfuscatedName("f.j(I)Lbb;")
    public static class72 method484() {
        class72 var0 = new class72();
        var0.field1286 = Statics.field1259;
        var0.field1287 = Statics.field1824;
        var0.field1284 = Statics.field1261[0];
        var0.field1291 = Statics.field2677[0];
        var0.field1282 = Statics.field1269[0];
        var0.field1281 = Statics.field1263[0];
        int var1 = var0.field1282 * var0.field1281;
        byte[] var2 = Statics.field1264[0];
        var0.field1288 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1288[var3] = Statics.field1266[var2[var3] & 0xFF];
        }
        method2847();
        return var0;
    }

    @ObfuscatedName("f.d(Lei;III)Z")
    public static boolean method490(class147 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2729(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1334(var3);
            return true;
        }
    }

    @ObfuscatedName("aw.v(Lei;II)Z")
    public static boolean method535(class147 arg0, int arg1) {
        byte[] var2 = arg0.method2734(arg1);
        if (var2 == null) {
            return false;
        } else {
            method1334(var2);
            return true;
        }
    }

    @ObfuscatedName("ba.n([BB)V")
    public static void method1334(byte[] arg0) {
        class107 var1 = new class107(arg0);
        var1.field1838 = arg0.length - 2;
        Statics.field1265 = var1.method2239();
        Statics.field1261 = new int[Statics.field1265];
        Statics.field2677 = new int[Statics.field1265];
        Statics.field1269 = new int[Statics.field1265];
        Statics.field1263 = new int[Statics.field1265];
        Statics.field1264 = new byte[Statics.field1265][];
        var1.field1838 = arg0.length - 7 - Statics.field1265 * 8;
        Statics.field1259 = var1.method2239();
        Statics.field1824 = var1.method2239();
        int var2 = (var1.method2138() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1265; var3++) {
            Statics.field1261[var3] = var1.method2239();
        }
        for (int var4 = 0; var4 < Statics.field1265; var4++) {
            Statics.field2677[var4] = var1.method2239();
        }
        for (int var5 = 0; var5 < Statics.field1265; var5++) {
            Statics.field1269[var5] = var1.method2239();
        }
        for (int var6 = 0; var6 < Statics.field1265; var6++) {
            Statics.field1263[var6] = var1.method2239();
        }
        var1.field1838 = arg0.length - 7 - Statics.field1265 * 8 - (var2 - 1) * 3;
        Statics.field1266 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1266[var7] = var1.method2142();
            if (Statics.field1266[var7] == 0) {
                Statics.field1266[var7] = 1;
            }
        }
        var1.field1838 = 0;
        for (int var8 = 0; var8 < Statics.field1265; var8++) {
            int var9 = Statics.field1269[var8];
            int var10 = Statics.field1263[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1264[var8] = var12;
            int var13 = var1.method2138();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2139();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2139();
                    }
                }
            }
        }
    }

    @ObfuscatedName("eq.z(I)V")
    public static void method2847() {
        Statics.field1261 = null;
        Statics.field2677 = null;
        Statics.field1269 = null;
        Statics.field1263 = null;
        Statics.field1266 = null;
        Statics.field1264 = (byte[][]) null;
    }
}
