package deob;

@ObfuscatedName("co")
public class class146 {

    @ObfuscatedName("co.p(Leg;Leg;III)Lgk;")
    public static class23 method2740(class81 arg0, class81 arg1, int arg2, int arg3) {
        if (!method3194(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method1083(arg2, arg3);
        class23 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class23 var6 = new class23(var4, Statics.field2185, Statics.field2195, Statics.field2196, Statics.field2188, Statics.field2856, Statics.field2183);
            method1526();
            var5 = var6;
        }
        return var5;
    }

    public class146() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.h(Leg;Ljava/lang/String;Ljava/lang/String;I)[Lcs;")
    public static class143[] method854(class81 arg0, String arg1, String arg2) {
        int var3 = arg0.method1098(arg1);
        int var4 = arg0.method1099(var3, arg2);
        class143[] var5;
        if (method3194(arg0, var3, var4)) {
            class143[] var6 = new class143[Statics.field2187];
            for (int var7 = 0; var7 < Statics.field2187; var7++) {
                class143 var8 = var6[var7] = new class143();
                var8.field2166 = Statics.field2189;
                var8.field2167 = Statics.field2443;
                var8.field2164 = Statics.field2185[var7];
                var8.field2162 = Statics.field2195[var7];
                var8.field2165 = Statics.field2196[var7];
                var8.field2161 = Statics.field2188[var7];
                int var9 = var8.field2165 * var8.field2161;
                byte[] var10 = Statics.field2183[var7];
                var8.field2171 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field2171[var11] = Statics.field2856[var10[var11] & 0xFF];
                }
            }
            method1526();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("j.t(Leg;Ljava/lang/String;Ljava/lang/String;B)Lcr;")
    public static class145 method958(class81 arg0, String arg1, String arg2) {
        int var3 = arg0.method1098(arg1);
        int var4 = arg0.method1099(var3, arg2);
        return method2890(arg0, var3, var4);
    }

    @ObfuscatedName("h.g(I)[Lcr;")
    public static class145[] method1047() {
        class145[] var0 = new class145[Statics.field2187];
        for (int var1 = 0; var1 < Statics.field2187; var1++) {
            class145 var2 = var0[var1] = new class145();
            var2.field2177 = Statics.field2189;
            var2.field2181 = Statics.field2443;
            var2.field2179 = Statics.field2185[var1];
            var2.field2175 = Statics.field2195[var1];
            var2.field2180 = Statics.field2196[var1];
            var2.field2178 = Statics.field2188[var1];
            var2.field2176 = Statics.field2856;
            var2.field2182 = Statics.field2183[var1];
        }
        method1526();
        return var0;
    }

    @ObfuscatedName("ee.r(Leg;Ljava/lang/String;Ljava/lang/String;B)Lcs;")
    public static class143 method1180(class81 arg0, String arg1, String arg2) {
        int var3 = arg0.method1098(arg1);
        int var4 = arg0.method1099(var3, arg2);
        class143 var5;
        if (method3194(arg0, var3, var4)) {
            class143 var6 = new class143();
            var6.field2166 = Statics.field2189;
            var6.field2167 = Statics.field2443;
            var6.field2164 = Statics.field2185[0];
            var6.field2162 = Statics.field2195[0];
            var6.field2165 = Statics.field2196[0];
            var6.field2161 = Statics.field2188[0];
            int var7 = var6.field2165 * var6.field2161;
            byte[] var8 = Statics.field2183[0];
            var6.field2171 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field2171[var9] = Statics.field2856[var8[var9] & 0xFF];
            }
            method1526();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("s.n(Leg;Leg;Ljava/lang/String;Ljava/lang/String;B)Lgk;")
    public static class23 method1308(class81 arg0, class81 arg1, String arg2, String arg3) {
        int var4 = arg0.method1098(arg2);
        int var5 = arg0.method1099(var4, arg3);
        return method2740(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("y.l(B)V")
    public static void method1526() {
        Statics.field2185 = null;
        Statics.field2195 = null;
        Statics.field2196 = null;
        Statics.field2188 = null;
        Statics.field2856 = null;
        Statics.field2183 = (byte[][]) null;
    }

    @ObfuscatedName("bd.e(B)Lcr;")
    public static class145 method2210() {
        class145 var0 = new class145();
        var0.field2177 = Statics.field2189;
        var0.field2181 = Statics.field2443;
        var0.field2179 = Statics.field2185[0];
        var0.field2175 = Statics.field2195[0];
        var0.field2180 = Statics.field2196[0];
        var0.field2178 = Statics.field2188[0];
        var0.field2176 = Statics.field2856;
        var0.field2182 = Statics.field2183[0];
        method1526();
        return var0;
    }

    @ObfuscatedName("cc.j(Leg;IIB)Lcr;")
    public static class145 method2890(class81 arg0, int arg1, int arg2) {
        return method3194(arg0, arg1, arg2) ? method2210() : null;
    }

    @ObfuscatedName("ay.o(Leg;Ljava/lang/String;Ljava/lang/String;I)[Lcr;")
    public static class145[] method3072(class81 arg0, String arg1, String arg2) {
        int var3 = arg0.method1098(arg1);
        int var4 = arg0.method1099(var3, arg2);
        class145[] var5;
        if (method3194(arg0, var3, var4)) {
            var5 = method1047();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("aq.f(Leg;III)Z")
    public static boolean method3194(class81 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1083(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            Statics.method814(var3);
            return true;
        }
    }

    @ObfuscatedName("ag.x(Leg;II)Z")
    public static boolean method3473(class81 arg0, int arg1) {
        byte[] var2 = arg0.method1151(arg1);
        if (var2 == null) {
            return false;
        } else {
            Statics.method814(var2);
            return true;
        }
    }
}
