package deob;

@ObfuscatedName("ho")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bo.x(Lgo;III)Lht;")
    public static class223 method1406(class183 arg0, int arg1, int arg2) {
        if (!method2405(arg0, arg1, arg2)) {
            return null;
        }
        class223 var3 = new class223();
        var3.field3216 = Statics.field3235;
        var3.field3210 = Statics.field3;
        var3.field3214 = Statics.field3237[0];
        var3.field3215 = Statics.field2014[0];
        var3.field3217 = Statics.field2776[0];
        var3.field3213 = Statics.field3236[0];
        var3.field3211 = Statics.field3238;
        var3.field3212 = Statics.field212[0];
        method1899();
        return var3;
    }

    @ObfuscatedName("dg.n(Lgo;IIB)Lhe;")
    public static class225 method2149(class183 arg0, int arg1, int arg2) {
        if (!method2405(arg0, arg1, arg2)) {
            return null;
        }
        class225 var3 = new class225();
        var3.field3232 = Statics.field3235;
        var3.field3228 = Statics.field3;
        var3.field3229 = Statics.field3237[0];
        var3.field3226 = Statics.field2014[0];
        var3.field3223 = Statics.field2776[0];
        var3.field3224 = Statics.field3236[0];
        int var4 = var3.field3224 * var3.field3223;
        byte[] var5 = Statics.field212[0];
        var3.field3227 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3227[var6] = Statics.field3238[var5[var6] & 0xFF];
        }
        method1899();
        return var3;
    }

    @ObfuscatedName("ah.g(Lgo;Lgo;III)Lhi;")
    public static class209 method958(class183 arg0, class183 arg1, int arg2, int arg3) {
        if (!method2405(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3153(arg2, arg3);
        class209 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class209 var6 = new class209(var4, Statics.field3237, Statics.field2014, Statics.field2776, Statics.field3236, Statics.field3238, Statics.field212);
            method1899();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("f.v(Lgo;Ljava/lang/String;Ljava/lang/String;B)[Lht;")
    public static class223[] method170(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3224(arg1);
        int var4 = arg0.method3168(var3, arg2);
        class223[] var5;
        if (method2405(arg0, var3, var4)) {
            var5 = method3082();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fk.y(Lgo;Ljava/lang/String;Ljava/lang/String;B)Lht;")
    public static class223 method2990(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3224(arg1);
        int var4 = arg0.method3168(var3, arg2);
        return method1406(arg0, var3, var4);
    }

    @ObfuscatedName("eg.p(Lgo;Ljava/lang/String;Ljava/lang/String;I)[Lhe;")
    public static class225[] method2664(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3224(arg1);
        int var4 = arg0.method3168(var3, arg2);
        class225[] var5;
        if (method2405(arg0, var3, var4)) {
            class225[] var6 = new class225[Statics.field3234];
            for (int var7 = 0; var7 < Statics.field3234; var7++) {
                class225 var8 = var6[var7] = new class225();
                var8.field3232 = Statics.field3235;
                var8.field3228 = Statics.field3;
                var8.field3229 = Statics.field3237[var7];
                var8.field3226 = Statics.field2014[var7];
                var8.field3223 = Statics.field2776[var7];
                var8.field3224 = Statics.field3236[var7];
                int var9 = var8.field3224 * var8.field3223;
                byte[] var10 = Statics.field212[var7];
                var8.field3227 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field3227[var11] = Statics.field3238[var10[var11] & 0xFF];
                }
            }
            method1899();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("cs.j(Lgo;Lgo;Ljava/lang/String;Ljava/lang/String;I)Lhi;")
    public static class209 method1904(class183 arg0, class183 arg1, String arg2, String arg3) {
        int var4 = arg0.method3224(arg2);
        int var5 = arg0.method3168(var4, arg3);
        return method958(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("fs.s(I)[Lht;")
    public static class223[] method3082() {
        class223[] var0 = new class223[Statics.field3234];
        for (int var1 = 0; var1 < Statics.field3234; var1++) {
            class223 var2 = var0[var1] = new class223();
            var2.field3216 = Statics.field3235;
            var2.field3210 = Statics.field3;
            var2.field3214 = Statics.field3237[var1];
            var2.field3215 = Statics.field2014[var1];
            var2.field3217 = Statics.field2776[var1];
            var2.field3213 = Statics.field3236[var1];
            var2.field3211 = Statics.field3238;
            var2.field3212 = Statics.field212[var1];
        }
        method1899();
        return var0;
    }

    @ObfuscatedName("er.k(Lgo;IIB)Z")
    public static boolean method2405(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3153(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            Statics.method2061(var3);
            return true;
        }
    }

    @ObfuscatedName("cb.o(B)V")
    public static void method1899() {
        Statics.field3237 = null;
        Statics.field2014 = null;
        Statics.field2776 = null;
        Statics.field3236 = null;
        Statics.field3238 = null;
        Statics.field212 = (byte[][]) null;
    }
}
