package deob;

@ObfuscatedName("lu")
public class class329 {

    public class329() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ge.a(Liz;IIB)[Lld;")
    public static class328[] method3757(class255 arg0, int arg1, int arg2) {
        if (!method4330(arg0, arg1, arg2)) {
            return null;
        }
        class328[] var3 = new class328[Statics.field3906];
        for (int var4 = 0; var4 < Statics.field3906; var4++) {
            class328 var5 = var3[var4] = new class328();
            var5.field3893 = Statics.field3901;
            var5.field3894 = Statics.field3905;
            var5.field3891 = Statics.field3900[var4];
            var5.field3889 = Statics.field427[var4];
            var5.field3899 = Statics.field3904[var4];
            var5.field3890 = Statics.field3902[var4];
            int var6 = var5.field3899 * var5.field3890;
            byte[] var7 = Statics.field2455[var4];
            var5.field3895 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field3895[var8] = Statics.field3903[var7[var8] & 0xFF];
            }
        }
        Statics.method1977();
        return var3;
    }

    @ObfuscatedName("jx.s(Liz;III)Lld;")
    public static class328 method4673(class255 arg0, int arg1, int arg2) {
        return method4330(arg0, arg1, arg2) ? method1931() : null;
    }

    @ObfuscatedName("dx.g(Liz;Liz;III)Lkt;")
    public static class305 method2537(class255 arg0, class255 arg1, int arg2, int arg3) {
        return method4330(arg0, arg2, arg3) ? method3124(arg1.method4422(arg2, arg3)) : null;
    }

    @ObfuscatedName("aa.x(Liz;Ljava/lang/String;Ljava/lang/String;I)[Llv;")
    public static class327[] method510(class255 arg0, String arg1, String arg2) {
        int var3 = arg0.method4439(arg1);
        int var4 = arg0.method4444(var3, arg2);
        class327[] var5;
        if (method4330(arg0, var3, var4)) {
            class327[] var6 = new class327[Statics.field3906];
            for (int var7 = 0; var7 < Statics.field3906; var7++) {
                class327 var8 = var6[var7] = new class327();
                var8.field3886 = Statics.field3901;
                var8.field3881 = Statics.field3905;
                var8.field3883 = Statics.field3900[var7];
                var8.field3885 = Statics.field427[var7];
                var8.field3882 = Statics.field3904[var7];
                var8.field3880 = Statics.field3902[var7];
                var8.field3887 = Statics.field3903;
                var8.field3884 = Statics.field2455[var7];
            }
            Statics.method1977();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("aa.h(Liz;Ljava/lang/String;Ljava/lang/String;I)Llv;")
    public static class327 method450(class255 arg0, String arg1, String arg2) {
        int var3 = arg0.method4439(arg1);
        int var4 = arg0.method4444(var3, arg2);
        class327 var5;
        if (method4330(arg0, var3, var4)) {
            class327 var6 = new class327();
            var6.field3886 = Statics.field3901;
            var6.field3881 = Statics.field3905;
            var6.field3883 = Statics.field3900[0];
            var6.field3885 = Statics.field427[0];
            var6.field3882 = Statics.field3904[0];
            var6.field3880 = Statics.field3902[0];
            var6.field3887 = Statics.field3903;
            var6.field3884 = Statics.field2455[0];
            Statics.method1977();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("el.f(Liz;Ljava/lang/String;Ljava/lang/String;B)[Lld;")
    public static class328[] method3151(class255 arg0, String arg1, String arg2) {
        int var3 = arg0.method4439(arg1);
        int var4 = arg0.method4444(var3, arg2);
        return method3757(arg0, var3, var4);
    }

    @ObfuscatedName("ct.p(Liz;II)Llv;")
    public static class327 method1954(class255 arg0, int arg1) {
        byte[] var2 = arg0.method4429(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            Statics.method3074(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class327 var4 = new class327();
        var4.field3886 = Statics.field3901;
        var4.field3881 = Statics.field3905;
        var4.field3883 = Statics.field3900[0];
        var4.field3885 = Statics.field427[0];
        var4.field3882 = Statics.field3904[0];
        var4.field3880 = Statics.field3902[0];
        var4.field3887 = Statics.field3903;
        var4.field3884 = Statics.field2455[0];
        Statics.method1977();
        return var4;
    }

    @ObfuscatedName("cx.m(B)Lld;")
    public static class328 method1931() {
        class328 var0 = new class328();
        var0.field3893 = Statics.field3901;
        var0.field3894 = Statics.field3905;
        var0.field3891 = Statics.field3900[0];
        var0.field3889 = Statics.field427[0];
        var0.field3899 = Statics.field3904[0];
        var0.field3890 = Statics.field3902[0];
        int var1 = var0.field3899 * var0.field3890;
        byte[] var2 = Statics.field2455[0];
        var0.field3895 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3895[var3] = Statics.field3903[var2[var3] & 0xFF];
        }
        Statics.method1977();
        return var0;
    }

    @ObfuscatedName("eg.q([BI)Lkt;")
    public static class305 method3124(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class305 var1 = new class305(arg0, Statics.field3900, Statics.field427, Statics.field3904, Statics.field3902, Statics.field3903, Statics.field2455);
            Statics.method1977();
            return var1;
        }
    }

    @ObfuscatedName("ic.b(Liz;IIB)Z")
    public static boolean method4330(class255 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4422(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            Statics.method3074(var3);
            return true;
        }
    }
}
