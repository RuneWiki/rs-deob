package deob;

@ObfuscatedName("ck")
public class class150 {

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.z(I)V")
    public static void method549() {
        Statics.field2248 = null;
        Statics.field2250 = null;
        Statics.field2597 = null;
        Statics.field728 = null;
        Statics.field2251 = null;
        Statics.field1540 = (byte[][]) null;
    }

    @ObfuscatedName("df.s(I)[Lcm;")
    public static class148[] method554() {
        class148[] var0 = new class148[Statics.field2253];
        for (int var1 = 0; var1 < Statics.field2253; var1++) {
            class148 var2 = var0[var1] = new class148();
            var2.field2243 = Statics.field2247;
            var2.field2240 = Statics.field2246;
            var2.field2241 = Statics.field2248[var1];
            var2.field2242 = Statics.field2250[var1];
            var2.field2239 = Statics.field2597[var1];
            var2.field2237 = Statics.field728[var1];
            var2.field2238 = Statics.field2251;
            var2.field2244 = Statics.field1540[var1];
        }
        Statics.field2248 = null;
        Statics.field2250 = null;
        Statics.field2597 = null;
        Statics.field728 = null;
        Statics.field2251 = null;
        Statics.field1540 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("dn.l(Lek;Lek;Ljava/lang/String;Ljava/lang/String;I)Lgk;")
    public static class23 method643(class89 arg0, class89 arg1, String arg2, String arg3) {
        int var4 = arg0.method1283(arg2);
        int var5 = arg0.method1282(var4, arg3);
        class23 var6;
        if (method1129(arg0, var4, var5)) {
            var6 = method3353(arg1.method1266(var4, var5));
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("e.b(Lek;IIS)[Lcm;")
    public static class148[] method1089(class89 arg0, int arg1, int arg2) {
        return method1129(arg0, arg1, arg2) ? method554() : null;
    }

    @ObfuscatedName("o.o(Lek;III)Z")
    public static boolean method1129(class89 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1266(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method2303(var3);
            return true;
        }
    }

    @ObfuscatedName("p.f(Lek;II)Lcm;")
    public static class148 method1373(class89 arg0, int arg1) {
        if (!method2903(arg0, arg1)) {
            return null;
        }
        class148 var2 = new class148();
        var2.field2243 = Statics.field2247;
        var2.field2240 = Statics.field2246;
        var2.field2241 = Statics.field2248[0];
        var2.field2242 = Statics.field2250[0];
        var2.field2239 = Statics.field2597[0];
        var2.field2237 = Statics.field728[0];
        var2.field2238 = Statics.field2251;
        var2.field2244 = Statics.field1540[0];
        Statics.field2248 = null;
        Statics.field2250 = null;
        Statics.field2597 = null;
        Statics.field728 = null;
        Statics.field2251 = null;
        Statics.field1540 = (byte[][]) null;
        return var2;
    }

    @ObfuscatedName("x.d(Lek;Ljava/lang/String;Ljava/lang/String;B)Lce;")
    public static class156 method1462(class89 arg0, String arg1, String arg2) {
        int var3 = arg0.method1283(arg1);
        int var4 = arg0.method1282(var3, arg2);
        class156 var5;
        if (method1129(arg0, var3, var4)) {
            var5 = method2329();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bz.j(I)[Lce;")
    public static class156[] method1983() {
        class156[] var0 = new class156[Statics.field2253];
        for (int var1 = 0; var1 < Statics.field2253; var1++) {
            class156 var2 = var0[var1] = new class156();
            var2.field2348 = Statics.field2247;
            var2.field2344 = Statics.field2246;
            var2.field2338 = Statics.field2248[var1];
            var2.field2343 = Statics.field2250[var1];
            var2.field2339 = Statics.field2597[var1];
            var2.field2340 = Statics.field728[var1];
            int var3 = var2.field2340 * var2.field2339;
            byte[] var4 = Statics.field1540[var1];
            var2.field2346 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field2346[var5] = Statics.field2251[var4[var5] & 0xFF];
            }
        }
        Statics.field2248 = null;
        Statics.field2250 = null;
        Statics.field2597 = null;
        Statics.field728 = null;
        Statics.field2251 = null;
        Statics.field1540 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("bb.q([BI)V")
    public static void method2303(byte[] arg0) {
        class50 var1 = new class50(arg0);
        var1.field540 = arg0.length - 2;
        Statics.field2253 = var1.method720();
        Statics.field2248 = new int[Statics.field2253];
        Statics.field2250 = new int[Statics.field2253];
        Statics.field2597 = new int[Statics.field2253];
        Statics.field728 = new int[Statics.field2253];
        Statics.field1540 = new byte[Statics.field2253][];
        var1.field540 = arg0.length - 7 - Statics.field2253 * 8;
        Statics.field2247 = var1.method720();
        Statics.field2246 = var1.method720();
        int var2 = (var1.method726() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field2253; var3++) {
            Statics.field2248[var3] = var1.method720();
        }
        for (int var4 = 0; var4 < Statics.field2253; var4++) {
            Statics.field2250[var4] = var1.method720();
        }
        for (int var5 = 0; var5 < Statics.field2253; var5++) {
            Statics.field2597[var5] = var1.method720();
        }
        for (int var6 = 0; var6 < Statics.field2253; var6++) {
            Statics.field728[var6] = var1.method720();
        }
        var1.field540 = arg0.length - 7 - Statics.field2253 * 8 - (var2 - 1) * 3;
        Statics.field2251 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2251[var7] = var1.method728();
            if (Statics.field2251[var7] == 0) {
                Statics.field2251[var7] = 1;
            }
        }
        var1.field540 = 0;
        for (int var8 = 0; var8 < Statics.field2253; var8++) {
            int var9 = Statics.field2597[var8];
            int var10 = Statics.field728[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1540[var8] = var12;
            int var13 = var1.method726();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method681();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method681();
                    }
                }
            }
        }
    }

    @ObfuscatedName("db.x(I)Lce;")
    public static class156 method2329() {
        class156 var0 = new class156();
        var0.field2348 = Statics.field2247;
        var0.field2344 = Statics.field2246;
        var0.field2338 = Statics.field2248[0];
        var0.field2343 = Statics.field2250[0];
        var0.field2339 = Statics.field2597[0];
        var0.field2340 = Statics.field728[0];
        int var1 = var0.field2340 * var0.field2339;
        byte[] var2 = Statics.field1540[0];
        var0.field2346 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field2346[var3] = Statics.field2251[var2[var3] & 0xFF];
        }
        method549();
        return var0;
    }

    @ObfuscatedName("cz.w(Lek;Ljava/lang/String;Ljava/lang/String;B)Lcm;")
    public static class148 method2347(class89 arg0, String arg1, String arg2) {
        int var3 = arg0.method1283(arg1);
        int var4 = arg0.method1282(var3, arg2);
        class148 var5;
        if (method1129(arg0, var3, var4)) {
            class148 var6 = new class148();
            var6.field2243 = Statics.field2247;
            var6.field2240 = Statics.field2246;
            var6.field2241 = Statics.field2248[0];
            var6.field2242 = Statics.field2250[0];
            var6.field2239 = Statics.field2597[0];
            var6.field2237 = Statics.field728[0];
            var6.field2238 = Statics.field2251;
            var6.field2244 = Statics.field1540[0];
            Statics.field2248 = null;
            Statics.field2250 = null;
            Statics.field2597 = null;
            Statics.field728 = null;
            Statics.field2251 = null;
            Statics.field1540 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ar.k(Lek;Ljava/lang/String;Ljava/lang/String;I)[Lcm;")
    public static class148[] method2857(class89 arg0, String arg1, String arg2) {
        int var3 = arg0.method1283(arg1);
        int var4 = arg0.method1282(var3, arg2);
        return method1089(arg0, var3, var4);
    }

    @ObfuscatedName("aq.e(Lek;II)Z")
    public static boolean method2903(class89 arg0, int arg1) {
        byte[] var2 = arg0.method1271(arg1);
        if (var2 == null) {
            return false;
        } else {
            method2303(var2);
            return true;
        }
    }

    @ObfuscatedName("ah.g([BI)Lgk;")
    public static class23 method3353(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class23 var1 = new class23(arg0, Statics.field2248, Statics.field2250, Statics.field2597, Statics.field728, Statics.field2251, Statics.field1540);
        Statics.field2248 = null;
        Statics.field2250 = null;
        Statics.field2597 = null;
        Statics.field728 = null;
        Statics.field2251 = null;
        Statics.field1540 = (byte[][]) null;
        return var1;
    }
}
