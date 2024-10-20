package deob;

@ObfuscatedName("cu")
public class class141 {

    public class141() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.y(Lel;IIB)Z")
    public static boolean method750(class87 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1298(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1261(var3);
            return true;
        }
    }

    @ObfuscatedName("k.c(Lel;III)Lcn;")
    public static class149 method1183(class87 arg0, int arg1, int arg2) {
        if (!method750(arg0, arg1, arg2)) {
            return null;
        }
        class149 var3 = new class149();
        var3.field2224 = Statics.field533;
        var3.field2230 = Statics.field2144;
        var3.field2228 = Statics.field2146[0];
        var3.field2229 = Statics.field2150[0];
        var3.field2231 = Statics.field2145[0];
        var3.field2227 = Statics.field1281[0];
        var3.field2225 = Statics.field2148;
        var3.field2226 = Statics.field2149[0];
        Statics.field2146 = null;
        Statics.field2150 = null;
        Statics.field2145 = null;
        Statics.field1281 = null;
        Statics.field2148 = null;
        Statics.field2149 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("u.a([BI)V")
    public static void method1261(byte[] arg0) {
        class28 var1 = new class28(arg0);
        var1.field303 = arg0.length - 2;
        Statics.field2147 = var1.method349();
        Statics.field2146 = new int[Statics.field2147];
        Statics.field2150 = new int[Statics.field2147];
        Statics.field2145 = new int[Statics.field2147];
        Statics.field1281 = new int[Statics.field2147];
        Statics.field2149 = new byte[Statics.field2147][];
        var1.field303 = arg0.length - 7 - Statics.field2147 * 8;
        Statics.field533 = var1.method349();
        Statics.field2144 = var1.method349();
        int var2 = (var1.method450() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field2147; var3++) {
            Statics.field2146[var3] = var1.method349();
        }
        for (int var4 = 0; var4 < Statics.field2147; var4++) {
            Statics.field2150[var4] = var1.method349();
        }
        for (int var5 = 0; var5 < Statics.field2147; var5++) {
            Statics.field2145[var5] = var1.method349();
        }
        for (int var6 = 0; var6 < Statics.field2147; var6++) {
            Statics.field1281[var6] = var1.method349();
        }
        var1.field303 = arg0.length - 7 - Statics.field2147 * 8 - (var2 - 1) * 3;
        Statics.field2148 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2148[var7] = var1.method316();
            if (Statics.field2148[var7] == 0) {
                Statics.field2148[var7] = 1;
            }
        }
        var1.field303 = 0;
        for (int var8 = 0; var8 < Statics.field2147; var8++) {
            int var9 = Statics.field2145[var8];
            int var10 = Statics.field1281[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2149[var8] = var12;
            int var13 = var1.method450();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method313();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method313();
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.m(Lel;Ljava/lang/String;Ljava/lang/String;I)Lcn;")
    public static class149 method1397(class87 arg0, String arg1, String arg2) {
        int var3 = arg0.method1310(arg1);
        int var4 = arg0.method1311(var3, arg2);
        return method1183(arg0, var3, var4);
    }

    @ObfuscatedName("bu.d(Lel;II)Lcn;")
    public static class149 method2076(class87 arg0, int arg1) {
        byte[] var2 = arg0.method1313(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method1261(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class149 var4 = new class149();
        var4.field2224 = Statics.field533;
        var4.field2230 = Statics.field2144;
        var4.field2228 = Statics.field2146[0];
        var4.field2229 = Statics.field2150[0];
        var4.field2231 = Statics.field2145[0];
        var4.field2227 = Statics.field1281[0];
        var4.field2225 = Statics.field2148;
        var4.field2226 = Statics.field2149[0];
        Statics.field2146 = null;
        Statics.field2150 = null;
        Statics.field2145 = null;
        Statics.field1281 = null;
        Statics.field2148 = null;
        Statics.field2149 = (byte[][]) null;
        return var4;
    }

    @ObfuscatedName("bt.v(Lel;III)[Lcn;")
    public static class149[] method2108(class87 arg0, int arg1, int arg2) {
        return method750(arg0, arg1, arg2) ? method2750() : null;
    }

    @ObfuscatedName("bk.i(Lel;Ljava/lang/String;Ljava/lang/String;I)[Lcn;")
    public static class149[] method2164(class87 arg0, String arg1, String arg2) {
        int var3 = arg0.method1310(arg1);
        int var4 = arg0.method1311(var3, arg2);
        return method2108(arg0, var3, var4);
    }

    @ObfuscatedName("db.x(Lel;Lel;Ljava/lang/String;Ljava/lang/String;I)Lgx;")
    public static class23 method2277(class87 arg0, class87 arg1, String arg2, String arg3) {
        int var4 = arg0.method1310(arg2);
        int var5 = arg0.method1311(var4, arg3);
        class23 var6;
        if (method750(arg0, var4, var5)) {
            var6 = Statics.method3143(arg1.method1298(var4, var5));
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("cj.j(I)[Lcn;")
    public static class149[] method2750() {
        class149[] var0 = new class149[Statics.field2147];
        for (int var1 = 0; var1 < Statics.field2147; var1++) {
            class149 var2 = var0[var1] = new class149();
            var2.field2224 = Statics.field533;
            var2.field2230 = Statics.field2144;
            var2.field2228 = Statics.field2146[var1];
            var2.field2229 = Statics.field2150[var1];
            var2.field2231 = Statics.field2145[var1];
            var2.field2227 = Statics.field1281[var1];
            var2.field2225 = Statics.field2148;
            var2.field2226 = Statics.field2149[var1];
        }
        Statics.field2146 = null;
        Statics.field2150 = null;
        Statics.field2145 = null;
        Statics.field1281 = null;
        Statics.field2148 = null;
        Statics.field2149 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("au.b(Lel;IIB)Lcv;")
    public static class140 method3052(class87 arg0, int arg1, int arg2) {
        if (!method750(arg0, arg1, arg2)) {
            return null;
        }
        class140 var3 = new class140();
        var3.field2133 = Statics.field533;
        var3.field2137 = Statics.field2144;
        var3.field2132 = Statics.field2146[0];
        var3.field2134 = Statics.field2150[0];
        var3.field2131 = Statics.field2145[0];
        var3.field2136 = Statics.field1281[0];
        int var4 = var3.field2136 * var3.field2131;
        byte[] var5 = Statics.field2149[0];
        var3.field2135 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field2135[var6] = Statics.field2148[var5[var6] & 0xFF];
        }
        Statics.field2146 = null;
        Statics.field2150 = null;
        Statics.field2145 = null;
        Statics.field1281 = null;
        Statics.field2148 = null;
        Statics.field2149 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("am.z(Lel;Ljava/lang/String;Ljava/lang/String;B)[Lcv;")
    public static class140[] method3232(class87 arg0, String arg1, String arg2) {
        int var3 = arg0.method1310(arg1);
        int var4 = arg0.method1311(var3, arg2);
        class140[] var5;
        if (method750(arg0, var3, var4)) {
            class140[] var6 = new class140[Statics.field2147];
            for (int var7 = 0; var7 < Statics.field2147; var7++) {
                class140 var8 = var6[var7] = new class140();
                var8.field2133 = Statics.field533;
                var8.field2137 = Statics.field2144;
                var8.field2132 = Statics.field2146[var7];
                var8.field2134 = Statics.field2150[var7];
                var8.field2131 = Statics.field2145[var7];
                var8.field2136 = Statics.field1281[var7];
                int var9 = var8.field2136 * var8.field2131;
                byte[] var10 = Statics.field2149[var7];
                var8.field2135 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field2135[var11] = Statics.field2148[var10[var11] & 0xFF];
                }
            }
            Statics.field2146 = null;
            Statics.field2150 = null;
            Statics.field2145 = null;
            Statics.field1281 = null;
            Statics.field2148 = null;
            Statics.field2149 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }
}
