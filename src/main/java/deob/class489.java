package deob;

@ObfuscatedName("rk")
public class class489 {

    public class489() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hl.f(Lln;III)[Lrs;")
    public static class488[] method4285(class337 arg0, int arg1, int arg2) {
        if (!method8212(arg0, arg1, arg2)) {
            return null;
        }
        class488[] var3 = new class488[Statics.field5044];
        for (int var4 = 0; var4 < Statics.field5044; var4++) {
            class488 var5 = var3[var4] = new class488();
            var5.field5030 = Statics.field5042;
            var5.field5040 = Statics.field5043;
            var5.field5033 = Statics.field5045[var4];
            var5.field5035 = Statics.field489[var4];
            var5.field5034 = Statics.field4537[var4];
            var5.field5032 = Statics.field1597[var4];
            int var6 = var5.field5034 * var5.field5032;
            byte[] var7 = Statics.field1655[var4];
            var5.field5041 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field5041[var8] = Statics.field1335[var7[var8] & 0xFF];
            }
        }
        method2590();
        return var3;
    }

    @ObfuscatedName("ri.w(Lln;III)Lrs;")
    public static class488 method8225(class337 arg0, int arg1, int arg2) {
        if (!method8212(arg0, arg1, arg2)) {
            return null;
        }
        class488 var3 = new class488();
        var3.field5030 = Statics.field5042;
        var3.field5040 = Statics.field5043;
        var3.field5033 = Statics.field5045[0];
        var3.field5035 = Statics.field489[0];
        var3.field5034 = Statics.field4537[0];
        var3.field5032 = Statics.field1597[0];
        int var4 = var3.field5034 * var3.field5032;
        byte[] var5 = Statics.field1655[0];
        var3.field5041 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field5041[var6] = Statics.field1335[var5[var6] & 0xFF];
        }
        method2590();
        return var3;
    }

    @ObfuscatedName("at.v(Lln;Lln;IIS)Lnv;")
    public static class372 method481(class337 arg0, class337 arg1, int arg2, int arg3) {
        if (!method8212(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method5990(arg2, arg3);
        class372 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class372 var6 = new class372(var4, Statics.field5045, Statics.field489, Statics.field4537, Statics.field1597, Statics.field1335, Statics.field1655);
            method2590();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("da.s(Lln;Ljava/lang/String;Ljava/lang/String;I)[Lrg;")
    public static class487[] method2924(class337 arg0, String arg1, String arg2) {
        int var3 = arg0.method5988(arg1);
        int var4 = arg0.method6057(var3, arg2);
        class487[] var5;
        if (method8212(arg0, var3, var4)) {
            class487[] var6 = new class487[Statics.field5044];
            for (int var7 = 0; var7 < Statics.field5044; var7++) {
                class487 var8 = var6[var7] = new class487();
                var8.field5022 = Statics.field5042;
                var8.field5025 = Statics.field5043;
                var8.field5028 = Statics.field5045[var7];
                var8.field5029 = Statics.field489[var7];
                var8.field5024 = Statics.field4537[var7];
                var8.field5026 = Statics.field1597[var7];
                var8.field5023 = Statics.field1335;
                var8.field5027 = Statics.field1655[var7];
            }
            method2590();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ga.z(Lln;Ljava/lang/String;Ljava/lang/String;I)Lrg;")
    public static class487 method3345(class337 arg0, String arg1, String arg2) {
        int var3 = arg0.method5988(arg1);
        int var4 = arg0.method6057(var3, arg2);
        class487 var5;
        if (method8212(arg0, var3, var4)) {
            class487 var6 = new class487();
            var6.field5022 = Statics.field5042;
            var6.field5025 = Statics.field5043;
            var6.field5028 = Statics.field5045[0];
            var6.field5029 = Statics.field489[0];
            var6.field5024 = Statics.field4537[0];
            var6.field5026 = Statics.field1597[0];
            var6.field5023 = Statics.field1335;
            var6.field5027 = Statics.field1655[0];
            method2590();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bl.j(Lln;Lln;Ljava/lang/String;Ljava/lang/String;I)Lnv;")
    public static class372 method1085(class337 arg0, class337 arg1, String arg2, String arg3) {
        int var4 = arg0.method5988(arg2);
        int var5 = arg0.method6057(var4, arg3);
        return method481(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("rd.i(Lln;III)Z")
    public static boolean method8212(class337 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5990(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method6997(var3);
            return true;
        }
    }

    @ObfuscatedName("md.n(Lln;II)Z")
    public static boolean method6207(class337 arg0, int arg1) {
        byte[] var2 = arg0.method5978(arg1);
        if (var2 == null) {
            return false;
        } else {
            method6997(var2);
            return true;
        }
    }

    @ObfuscatedName("oo.l([BI)V")
    public static void method6997(byte[] arg0) {
        class474 var1 = new class474(arg0);
        var1.field4939 = arg0.length - 2;
        Statics.field5044 = var1.method8032();
        Statics.field5045 = new int[Statics.field5044];
        Statics.field489 = new int[Statics.field5044];
        Statics.field4537 = new int[Statics.field5044];
        Statics.field1597 = new int[Statics.field5044];
        Statics.field1655 = new byte[Statics.field5044][];
        var1.field4939 = arg0.length - 7 - Statics.field5044 * 8;
        Statics.field5042 = var1.method8032();
        Statics.field5043 = var1.method8032();
        int var2 = (var1.method7964() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field5044; var3++) {
            Statics.field5045[var3] = var1.method8032();
        }
        for (int var4 = 0; var4 < Statics.field5044; var4++) {
            Statics.field489[var4] = var1.method8032();
        }
        for (int var5 = 0; var5 < Statics.field5044; var5++) {
            Statics.field4537[var5] = var1.method8032();
        }
        for (int var6 = 0; var6 < Statics.field5044; var6++) {
            Statics.field1597[var6] = var1.method8032();
        }
        var1.field4939 = arg0.length - 7 - Statics.field5044 * 8 - (var2 - 1) * 3;
        Statics.field1335 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1335[var7] = var1.method8132();
            if (Statics.field1335[var7] == 0) {
                Statics.field1335[var7] = 1;
            }
        }
        var1.field4939 = 0;
        for (int var8 = 0; var8 < Statics.field5044; var8++) {
            int var9 = Statics.field4537[var8];
            int var10 = Statics.field1597[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1655[var8] = var12;
            int var13 = var1.method7964();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method7965();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method7965();
                    }
                }
            }
        }
    }

    @ObfuscatedName("cj.k(B)V")
    public static void method2590() {
        Statics.field5045 = null;
        Statics.field489 = null;
        Statics.field4537 = null;
        Statics.field1597 = null;
        Statics.field1335 = null;
        Statics.field1655 = (byte[][]) null;
    }
}
