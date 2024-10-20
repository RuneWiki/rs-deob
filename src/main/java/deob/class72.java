package deob;

@ObfuscatedName("by")
public class class72 {

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.e(Lfv;III)[Lbs;")
    public static class76[] method859(class158 arg0, int arg1, int arg2) {
        return method565(arg0, arg1, arg2) ? method196() : null;
    }

    @ObfuscatedName("ch.a(Lfv;IIB)Lbs;")
    public static class76 method1658(class158 arg0, int arg1, int arg2) {
        if (!method565(arg0, arg1, arg2)) {
            return null;
        }
        class76 var3 = new class76();
        var3.field1296 = Statics.field1257;
        var3.field1292 = Statics.field1259;
        var3.field1294 = Statics.field3019[0];
        var3.field1295 = Statics.field2500[0];
        var3.field1297 = Statics.field1256[0];
        var3.field1293 = Statics.field1262[0];
        var3.field1291 = Statics.field1502;
        var3.field1290 = Statics.field971[0];
        method620();
        return var3;
    }

    @ObfuscatedName("bm.l(Lfv;IIB)[Lbh;")
    public static class74[] method1102(class158 arg0, int arg1, int arg2) {
        return method565(arg0, arg1, arg2) ? method610() : null;
    }

    @ObfuscatedName("f.c(Lfv;III)Lbh;")
    public static class74 method126(class158 arg0, int arg1, int arg2) {
        if (!method565(arg0, arg1, arg2)) {
            return null;
        }
        class74 var3 = new class74();
        var3.field1276 = Statics.field1257;
        var3.field1277 = Statics.field1259;
        var3.field1274 = Statics.field3019[0];
        var3.field1275 = Statics.field2500[0];
        var3.field1280 = Statics.field1256[0];
        var3.field1273 = Statics.field1262[0];
        int var4 = var3.field1280 * var3.field1273;
        byte[] var5 = Statics.field971[0];
        var3.field1271 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1271[var6] = Statics.field1502[var5[var6] & 0xFF];
        }
        method620();
        return var3;
    }

    @ObfuscatedName("j.u(Lfv;Ljava/lang/String;Ljava/lang/String;B)[Lbs;")
    public static class76[] method172(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2912(arg1);
        int var4 = arg0.method2853(var3, arg2);
        return method859(arg0, var3, var4);
    }

    @ObfuscatedName("an.w(Lfv;Ljava/lang/String;Ljava/lang/String;I)Lbs;")
    public static class76 method951(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2912(arg1);
        int var4 = arg0.method2853(var3, arg2);
        return method1658(arg0, var3, var4);
    }

    @ObfuscatedName("bm.i(Lfv;Ljava/lang/String;Ljava/lang/String;I)[Lbh;")
    public static class74[] method1112(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2912(arg1);
        int var4 = arg0.method2853(var3, arg2);
        return method1102(arg0, var3, var4);
    }

    @ObfuscatedName("s.r(Lfv;Lfv;Ljava/lang/String;Ljava/lang/String;I)Lhh;")
    public static class214 method162(class158 arg0, class158 arg1, String arg2, String arg3) {
        int var4 = arg0.method2912(arg2);
        int var5 = arg0.method2853(var4, arg3);
        class214 var6;
        if (method565(arg0, var4, var5)) {
            var6 = method14(arg1.method2843(var4, var5));
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("z.f(S)[Lbs;")
    public static class76[] method196() {
        class76[] var0 = new class76[Statics.field1260];
        for (int var1 = 0; var1 < Statics.field1260; var1++) {
            class76 var2 = var0[var1] = new class76();
            var2.field1296 = Statics.field1257;
            var2.field1292 = Statics.field1259;
            var2.field1294 = Statics.field3019[var1];
            var2.field1295 = Statics.field2500[var1];
            var2.field1297 = Statics.field1256[var1];
            var2.field1293 = Statics.field1262[var1];
            var2.field1291 = Statics.field1502;
            var2.field1290 = Statics.field971[var1];
        }
        method620();
        return var0;
    }

    @ObfuscatedName("ai.g(I)[Lbh;")
    public static class74[] method610() {
        class74[] var0 = new class74[Statics.field1260];
        for (int var1 = 0; var1 < Statics.field1260; var1++) {
            class74 var2 = var0[var1] = new class74();
            var2.field1276 = Statics.field1257;
            var2.field1277 = Statics.field1259;
            var2.field1274 = Statics.field3019[var1];
            var2.field1275 = Statics.field2500[var1];
            var2.field1280 = Statics.field1256[var1];
            var2.field1273 = Statics.field1262[var1];
            int var3 = var2.field1280 * var2.field1273;
            byte[] var4 = Statics.field971[var1];
            var2.field1271 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1271[var5] = Statics.field1502[var4[var5] & 0xFF];
            }
        }
        method620();
        return var0;
    }

    @ObfuscatedName("l.o([BI)Lhh;")
    public static class214 method14(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class214 var1 = new class214(arg0, Statics.field3019, Statics.field2500, Statics.field1256, Statics.field1262, Statics.field1502, Statics.field971);
            method620();
            return var1;
        }
    }

    @ObfuscatedName("ax.h(Lfv;III)Z")
    public static boolean method565(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2843(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method131(var3);
            return true;
        }
    }

    @ObfuscatedName("g.s([BI)V")
    public static void method131(byte[] arg0) {
        class111 var1 = new class111(arg0);
        var1.field1834 = arg0.length - 2;
        Statics.field1260 = var1.method2178();
        Statics.field3019 = new int[Statics.field1260];
        Statics.field2500 = new int[Statics.field1260];
        Statics.field1256 = new int[Statics.field1260];
        Statics.field1262 = new int[Statics.field1260];
        Statics.field971 = new byte[Statics.field1260][];
        var1.field1834 = arg0.length - 7 - Statics.field1260 * 8;
        Statics.field1257 = var1.method2178();
        Statics.field1259 = var1.method2178();
        int var2 = (var1.method2176() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1260; var3++) {
            Statics.field3019[var3] = var1.method2178();
        }
        for (int var4 = 0; var4 < Statics.field1260; var4++) {
            Statics.field2500[var4] = var1.method2178();
        }
        for (int var5 = 0; var5 < Statics.field1260; var5++) {
            Statics.field1256[var5] = var1.method2178();
        }
        for (int var6 = 0; var6 < Statics.field1260; var6++) {
            Statics.field1262[var6] = var1.method2178();
        }
        var1.field1834 = arg0.length - 7 - Statics.field1260 * 8 - (var2 - 1) * 3;
        Statics.field1502 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1502[var7] = var1.method2179();
            if (Statics.field1502[var7] == 0) {
                Statics.field1502[var7] = 1;
            }
        }
        var1.field1834 = 0;
        for (int var8 = 0; var8 < Statics.field1260; var8++) {
            int var9 = Statics.field1256[var8];
            int var10 = Statics.field1262[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field971[var8] = var12;
            int var13 = var1.method2176();
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

    @ObfuscatedName("au.j(I)V")
    public static void method620() {
        Statics.field3019 = null;
        Statics.field2500 = null;
        Statics.field1256 = null;
        Statics.field1262 = null;
        Statics.field1502 = null;
        Statics.field971 = (byte[][]) null;
    }
}
