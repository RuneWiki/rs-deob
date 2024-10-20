package deob;

@ObfuscatedName("ey")
public class class139 {

    @ObfuscatedName("ey.a")
    public static int field2354 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.b(Lej;IIIZI)V")
    public static void method235(class153 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2354 = 1;
        Statics.field2586 = arg0;
        Statics.field2067 = arg1;
        Statics.field1194 = arg2;
        Statics.field1971 = arg3;
        Statics.field2356 = arg4;
        Statics.field2355 = 10000;
    }

    @ObfuscatedName("dy.e(ILej;IIIZI)V")
    public static void method2296(int arg0, class153 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2354 = 1;
        Statics.field2586 = arg1;
        Statics.field2067 = arg2;
        Statics.field1194 = arg3;
        Statics.field1971 = arg4;
        Statics.field2356 = arg5;
        Statics.field2355 = arg0;
    }

    @ObfuscatedName("u.g(II)V")
    public static void method234(int arg0) {
        field2354 = 1;
        Statics.field2586 = null;
        Statics.field2067 = -1;
        Statics.field1194 = -1;
        Statics.field1971 = 0;
        Statics.field2356 = false;
        Statics.field2355 = arg0;
    }

    @ObfuscatedName("ch.o(S)V")
    public static void method1567() {
        try {
            if (field2354 == 1) {
                int var0 = Statics.field2353.method2806();
                if (var0 > 0 && Statics.field2353.method2818()) {
                    int var1 = var0 - Statics.field2355;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2353.method2836(var1);
                    return;
                }
                Statics.field2353.method2744();
                Statics.field2353.method2742();
                if (Statics.field2586 == null) {
                    field2354 = 0;
                } else {
                    field2354 = 2;
                }
                Statics.field246 = null;
                Statics.field86 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2353.method2744();
            field2354 = 0;
            Statics.field246 = null;
            Statics.field86 = null;
            Statics.field2586 = null;
        }
    }

    @ObfuscatedName("ay.a(I)Z")
    public static boolean method797() {
        try {
            if (field2354 == 2) {
                if (Statics.field246 == null) {
                    Statics.field246 = class140.method2718(Statics.field2586, Statics.field2067, Statics.field1194);
                    if (Statics.field246 == null) {
                        return false;
                    }
                }
                if (Statics.field86 == null) {
                    Statics.field86 = new class58(Statics.field2350, Statics.field2351);
                }
                if (Statics.field2353.method2740(Statics.field246, Statics.field2358, Statics.field86, 22050)) {
                    Statics.field2353.method2802();
                    Statics.field2353.method2836(Statics.field1971);
                    Statics.field2353.method2743(Statics.field246, Statics.field2356);
                    field2354 = 0;
                    Statics.field246 = null;
                    Statics.field86 = null;
                    Statics.field2586 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2353.method2744();
            field2354 = 0;
            Statics.field246 = null;
            Statics.field86 = null;
            Statics.field2586 = null;
        }
        return false;
    }
}
