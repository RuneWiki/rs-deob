package deob;

@ObfuscatedName("hq")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("v.x(Lgk;III)Lhv;")
    public static class223 method193(class183 arg0, int arg1, int arg2) {
        if (!method1198(arg0, arg1, arg2)) {
            return null;
        }
        class223 var3 = new class223();
        var3.field3208 = Statics.field3084;
        var3.field3213 = Statics.field3233;
        var3.field3215 = Statics.field148[0];
        var3.field3214 = Statics.field3086[0];
        var3.field3210 = Statics.field3234[0];
        var3.field3211 = Statics.field3232[0];
        var3.field3209 = Statics.field3238;
        var3.field3212 = Statics.field1767[0];
        Statics.field148 = null;
        Statics.field3086 = null;
        Statics.field3234 = null;
        Statics.field3232 = null;
        Statics.field3238 = null;
        Statics.field1767 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("ez.j(Lgk;III)[Lhs;")
    public static class225[] method2612(class183 arg0, int arg1, int arg2) {
        if (!method1198(arg0, arg1, arg2)) {
            return null;
        }
        class225[] var3 = new class225[Statics.field3236];
        for (int var4 = 0; var4 < Statics.field3236; var4++) {
            class225 var5 = var3[var4] = new class225();
            var5.field3225 = Statics.field3084;
            var5.field3226 = Statics.field3233;
            var5.field3230 = Statics.field148[var4];
            var5.field3221 = Statics.field3086[var4];
            var5.field3223 = Statics.field3234[var4];
            var5.field3222 = Statics.field3232[var4];
            int var6 = var5.field3223 * var5.field3222;
            byte[] var7 = Statics.field1767[var4];
            var5.field3231 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field3231[var8] = Statics.field3238[var7[var8] & 0xFF];
            }
        }
        Statics.field148 = null;
        Statics.field3086 = null;
        Statics.field3234 = null;
        Statics.field3232 = null;
        Statics.field3238 = null;
        Statics.field1767 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("co.c(Lgk;III)Lhs;")
    public static class225 method1887(class183 arg0, int arg1, int arg2) {
        return method1198(arg0, arg1, arg2) ? method611() : null;
    }

    @ObfuscatedName("bh.d(Lgk;Lgk;IIB)Lhf;")
    public static class209 method1431(class183 arg0, class183 arg1, int arg2, int arg3) {
        return method1198(arg0, arg2, arg3) ? method1901(arg1.method3121(arg2, arg3)) : null;
    }

    @ObfuscatedName("x.w(Lgk;Ljava/lang/String;Ljava/lang/String;B)[Lhv;")
    public static class223[] method16(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3113(arg1);
        int var4 = arg0.method3114(var3, arg2);
        class223[] var5;
        if (method1198(arg0, var3, var4)) {
            class223[] var6 = new class223[Statics.field3236];
            for (int var7 = 0; var7 < Statics.field3236; var7++) {
                class223 var8 = var6[var7] = new class223();
                var8.field3208 = Statics.field3084;
                var8.field3213 = Statics.field3233;
                var8.field3215 = Statics.field148[var7];
                var8.field3214 = Statics.field3086[var7];
                var8.field3210 = Statics.field3234[var7];
                var8.field3211 = Statics.field3232[var7];
                var8.field3209 = Statics.field3238;
                var8.field3212 = Statics.field1767[var7];
            }
            Statics.field148 = null;
            Statics.field3086 = null;
            Statics.field3234 = null;
            Statics.field3232 = null;
            Statics.field3238 = null;
            Statics.field1767 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("an.u(Lgk;Ljava/lang/String;Ljava/lang/String;I)Lhv;")
    public static class223 method601(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3113(arg1);
        int var4 = arg0.method3114(var3, arg2);
        return method193(arg0, var3, var4);
    }

    @ObfuscatedName("eo.y(Lgk;Ljava/lang/String;Ljava/lang/String;B)[Lhs;")
    public static class225[] method2540(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3113(arg1);
        int var4 = arg0.method3114(var3, arg2);
        return method2612(arg0, var3, var4);
    }

    @ObfuscatedName("gc.e(Lgk;Lgk;Ljava/lang/String;Ljava/lang/String;B)Lhf;")
    public static class209 method3354(class183 arg0, class183 arg1, String arg2, String arg3) {
        int var4 = arg0.method3113(arg2);
        int var5 = arg0.method3114(var4, arg3);
        return method1431(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("ff.q(Lgk;IB)Lhv;")
    public static class223 method3070(class183 arg0, int arg1) {
        byte[] var2 = arg0.method3103(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method3344(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class223 var4 = new class223();
        var4.field3208 = Statics.field3084;
        var4.field3213 = Statics.field3233;
        var4.field3215 = Statics.field148[0];
        var4.field3214 = Statics.field3086[0];
        var4.field3210 = Statics.field3234[0];
        var4.field3211 = Statics.field3232[0];
        var4.field3209 = Statics.field3238;
        var4.field3212 = Statics.field1767[0];
        Statics.field148 = null;
        Statics.field3086 = null;
        Statics.field3234 = null;
        Statics.field3232 = null;
        Statics.field3238 = null;
        Statics.field1767 = (byte[][]) null;
        return var4;
    }

    @ObfuscatedName("ar.v(I)Lhs;")
    public static class225 method611() {
        class225 var0 = new class225();
        var0.field3225 = Statics.field3084;
        var0.field3226 = Statics.field3233;
        var0.field3230 = Statics.field148[0];
        var0.field3221 = Statics.field3086[0];
        var0.field3223 = Statics.field3234[0];
        var0.field3222 = Statics.field3232[0];
        int var1 = var0.field3223 * var0.field3222;
        byte[] var2 = Statics.field1767[0];
        var0.field3231 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3231[var3] = Statics.field3238[var2[var3] & 0xFF];
        }
        Statics.field148 = null;
        Statics.field3086 = null;
        Statics.field3234 = null;
        Statics.field3232 = null;
        Statics.field3238 = null;
        Statics.field1767 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ct.l([BB)Lhf;")
    public static class209 method1901(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class209 var1 = new class209(arg0, Statics.field148, Statics.field3086, Statics.field3234, Statics.field3232, Statics.field3238, Statics.field1767);
        Statics.field148 = null;
        Statics.field3086 = null;
        Statics.field3234 = null;
        Statics.field3232 = null;
        Statics.field3238 = null;
        Statics.field1767 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("bw.s(Lgk;III)Z")
    public static boolean method1198(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3121(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3344(var3);
            return true;
        }
    }

    @ObfuscatedName("gc.r([BB)V")
    public static void method3344(byte[] arg0) {
        class154 var1 = new class154(arg0);
        var1.field2086 = arg0.length - 2;
        Statics.field3236 = var1.method2745();
        Statics.field148 = new int[Statics.field3236];
        Statics.field3086 = new int[Statics.field3236];
        Statics.field3234 = new int[Statics.field3236];
        Statics.field3232 = new int[Statics.field3236];
        Statics.field1767 = new byte[Statics.field3236][];
        var1.field2086 = arg0.length - 7 - Statics.field3236 * 8;
        Statics.field3084 = var1.method2745();
        Statics.field3233 = var1.method2745();
        int var2 = (var1.method2701() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3236; var3++) {
            Statics.field148[var3] = var1.method2745();
        }
        for (int var4 = 0; var4 < Statics.field3236; var4++) {
            Statics.field3086[var4] = var1.method2745();
        }
        for (int var5 = 0; var5 < Statics.field3236; var5++) {
            Statics.field3234[var5] = var1.method2745();
        }
        for (int var6 = 0; var6 < Statics.field3236; var6++) {
            Statics.field3232[var6] = var1.method2745();
        }
        var1.field2086 = arg0.length - 7 - Statics.field3236 * 8 - (var2 - 1) * 3;
        Statics.field3238 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3238[var7] = var1.method2643();
            if (Statics.field3238[var7] == 0) {
                Statics.field3238[var7] = 1;
            }
        }
        var1.field2086 = 0;
        for (int var8 = 0; var8 < Statics.field3236; var8++) {
            int var9 = Statics.field3234[var8];
            int var10 = Statics.field3232[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1767[var8] = var12;
            int var13 = var1.method2701();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2640();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2640();
                    }
                }
            }
        }
    }
}
