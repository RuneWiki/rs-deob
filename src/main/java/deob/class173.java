package deob;

@ObfuscatedName("fg")
public class class173 {

    @ObfuscatedName("fg.u")
    public static int field2799 = 0;

    public class173() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.e(Lfv;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method501(class158 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2912(arg1);
        int var6 = arg0.method2853(var5, arg2);
        method631(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ae.a(Lfv;IIIZI)V")
    public static void method631(class158 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2799 = 1;
        Statics.field2800 = arg0;
        Statics.field2896 = arg1;
        Statics.field2801 = arg2;
        Statics.field2572 = arg3;
        Statics.field2440 = arg4;
        Statics.field2802 = 10000;
    }

    @ObfuscatedName("cd.l(IB)V")
    public static void method1827(int arg0) {
        if (field2799 == 0) {
            Statics.field2797.method3169(arg0);
        } else {
            Statics.field2572 = arg0;
        }
    }

    @ObfuscatedName("l.c(I)V")
    public static void method32() {
        Statics.field2797.method3174();
        field2799 = 1;
        Statics.field2800 = null;
    }

    @ObfuscatedName("f.u(I)V")
    public static void method127() {
        try {
            if (field2799 == 1) {
                int var0 = Statics.field2797.method3268();
                if (var0 > 0 && Statics.field2797.method3195()) {
                    int var1 = var0 - Statics.field2802;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2797.method3169(var1);
                    return;
                }
                Statics.field2797.method3174();
                Statics.field2797.method3267();
                if (Statics.field2800 == null) {
                    field2799 = 0;
                } else {
                    field2799 = 2;
                }
                Statics.field1926 = null;
                Statics.field2448 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2797.method3174();
            field2799 = 0;
            Statics.field1926 = null;
            Statics.field2448 = null;
            Statics.field2800 = null;
        }
    }
}
