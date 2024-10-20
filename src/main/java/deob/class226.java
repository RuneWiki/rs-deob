package deob;

@ObfuscatedName("hp")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ge.b(Lgv;IIS)[Lhw;")
    public static class223[] method3395(class183 arg0, int arg1, int arg2) {
        return method196(arg0, arg1, arg2) ? method600() : null;
    }

    @ObfuscatedName("au.e(Lgv;IIB)Lhw;")
    public static class223 method619(class183 arg0, int arg1, int arg2) {
        return method196(arg0, arg1, arg2) ? method2023() : null;
    }

    @ObfuscatedName("ei.c(Lgv;IIB)Lhg;")
    public static class225 method2507(class183 arg0, int arg1, int arg2) {
        return method196(arg0, arg1, arg2) ? method3923() : null;
    }

    @ObfuscatedName("cg.l(Lgv;Ljava/lang/String;Ljava/lang/String;I)[Lhw;")
    public static class223[] method1899(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3141(arg1);
        int var4 = arg0.method3138(var3, arg2);
        return method3395(arg0, var3, var4);
    }

    @ObfuscatedName("ga.y(Lgv;Ljava/lang/String;Ljava/lang/String;B)Lhw;")
    public static class223 method3482(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3141(arg1);
        int var4 = arg0.method3138(var3, arg2);
        return method619(arg0, var3, var4);
    }

    @ObfuscatedName("aa.j(Lgv;Ljava/lang/String;Ljava/lang/String;I)[Lhg;")
    public static class225[] method663(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3141(arg1);
        int var4 = arg0.method3138(var3, arg2);
        class225[] var5;
        if (method196(arg0, var3, var4)) {
            class225[] var6 = new class225[Statics.field3230];
            for (int var7 = 0; var7 < Statics.field3230; var7++) {
                class225 var8 = var6[var7] = new class225();
                var8.field3222 = Statics.field3232;
                var8.field3223 = Statics.field3231;
                var8.field3226 = Statics.field3234[var7];
                var8.field3221 = Statics.field1835[var7];
                var8.field3217 = Statics.field198[var7];
                var8.field3219 = Statics.field2662[var7];
                int var9 = var8.field3219 * var8.field3217;
                byte[] var10 = Statics.field220[var7];
                var8.field3220 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field3220[var11] = Statics.field2100[var10[var11] & 0xFF];
                }
            }
            method2563();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fk.t(Lgv;Ljava/lang/String;Ljava/lang/String;B)Lhg;")
    public static class225 method2986(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3141(arg1);
        int var4 = arg0.method3138(var3, arg2);
        return method2507(arg0, var3, var4);
    }

    @ObfuscatedName("aj.k(B)[Lhw;")
    public static class223[] method600() {
        class223[] var0 = new class223[Statics.field3230];
        for (int var1 = 0; var1 < Statics.field3230; var1++) {
            class223 var2 = var0[var1] = new class223();
            var2.field3212 = Statics.field3232;
            var2.field3213 = Statics.field3231;
            var2.field3208 = Statics.field3234[var1];
            var2.field3211 = Statics.field1835[var1];
            var2.field3210 = Statics.field198[var1];
            var2.field3209 = Statics.field2662[var1];
            var2.field3207 = Statics.field2100;
            var2.field3206 = Statics.field220[var1];
        }
        method2563();
        return var0;
    }

    @ObfuscatedName("dt.f(I)Lhw;")
    public static class223 method2023() {
        class223 var0 = new class223();
        var0.field3212 = Statics.field3232;
        var0.field3213 = Statics.field3231;
        var0.field3208 = Statics.field3234[0];
        var0.field3211 = Statics.field1835[0];
        var0.field3210 = Statics.field198[0];
        var0.field3209 = Statics.field2662[0];
        var0.field3207 = Statics.field2100;
        var0.field3206 = Statics.field220[0];
        method2563();
        return var0;
    }

    @ObfuscatedName("hf.a(B)Lhg;")
    public static class225 method3923() {
        class225 var0 = new class225();
        var0.field3222 = Statics.field3232;
        var0.field3223 = Statics.field3231;
        var0.field3226 = Statics.field3234[0];
        var0.field3221 = Statics.field1835[0];
        var0.field3217 = Statics.field198[0];
        var0.field3219 = Statics.field2662[0];
        int var1 = var0.field3219 * var0.field3217;
        byte[] var2 = Statics.field220[0];
        var0.field3220 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3220[var3] = Statics.field2100[var2[var3] & 0xFF];
        }
        method2563();
        return var0;
    }

    @ObfuscatedName("ey.v([BI)Lhj;")
    public static class209 method2570(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class209 var1 = new class209(arg0, Statics.field3234, Statics.field1835, Statics.field198, Statics.field2662, Statics.field2100, Statics.field220);
            method2563();
            return var1;
        }
    }

    @ObfuscatedName("o.d(Lgv;IIB)Z")
    public static boolean method196(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3126(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3107(var3);
            return true;
        }
    }

    @ObfuscatedName("cz.o(Lgv;II)Z")
    public static boolean method1860(class183 arg0, int arg1) {
        byte[] var2 = arg0.method3131(arg1);
        if (var2 == null) {
            return false;
        } else {
            method3107(var2);
            return true;
        }
    }

    @ObfuscatedName("fu.q([BI)V")
    public static void method3107(byte[] arg0) {
        class154 var1 = new class154(arg0);
        var1.field2079 = arg0.length - 2;
        Statics.field3230 = var1.method2671();
        Statics.field3234 = new int[Statics.field3230];
        Statics.field1835 = new int[Statics.field3230];
        Statics.field198 = new int[Statics.field3230];
        Statics.field2662 = new int[Statics.field3230];
        Statics.field220 = new byte[Statics.field3230][];
        var1.field2079 = arg0.length - 7 - Statics.field3230 * 8;
        Statics.field3232 = var1.method2671();
        Statics.field3231 = var1.method2671();
        int var2 = (var1.method2669() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3230; var3++) {
            Statics.field3234[var3] = var1.method2671();
        }
        for (int var4 = 0; var4 < Statics.field3230; var4++) {
            Statics.field1835[var4] = var1.method2671();
        }
        for (int var5 = 0; var5 < Statics.field3230; var5++) {
            Statics.field198[var5] = var1.method2671();
        }
        for (int var6 = 0; var6 < Statics.field3230; var6++) {
            Statics.field2662[var6] = var1.method2671();
        }
        var1.field2079 = arg0.length - 7 - Statics.field3230 * 8 - (var2 - 1) * 3;
        Statics.field2100 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2100[var7] = var1.method2689();
            if (Statics.field2100[var7] == 0) {
                Statics.field2100[var7] = 1;
            }
        }
        var1.field2079 = 0;
        for (int var8 = 0; var8 < Statics.field3230; var8++) {
            int var9 = Statics.field198[var8];
            int var10 = Statics.field2662[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field220[var8] = var12;
            int var13 = var1.method2669();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2670();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2670();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ey.i(I)V")
    public static void method2563() {
        Statics.field3234 = null;
        Statics.field1835 = null;
        Statics.field198 = null;
        Statics.field2662 = null;
        Statics.field2100 = null;
        Statics.field220 = (byte[][]) null;
    }
}
