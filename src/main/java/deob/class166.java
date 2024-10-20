package deob;

@ObfuscatedName("fe")
public class class166 {

    @ObfuscatedName("fe.l")
    public static int field2748 = 0;

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.a(Lek;IIIZI)V")
    public static void method130(class151 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2748 = 1;
        Statics.field2749 = arg0;
        Statics.field3036 = arg1;
        Statics.field1950 = arg2;
        Statics.field210 = arg3;
        Statics.field2751 = arg4;
        Statics.field2745 = 10000;
    }

    @ObfuscatedName("a.v(I)V")
    public static void method3() {
        Statics.field3043.method3065();
        field2748 = 1;
        Statics.field2749 = null;
    }

    @ObfuscatedName("cn.b(ILek;IIIZB)V")
    public static void method1867(int arg0, class151 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2748 = 1;
        Statics.field2749 = arg1;
        Statics.field3036 = arg2;
        Statics.field1950 = arg3;
        Statics.field210 = arg4;
        Statics.field2751 = arg5;
        Statics.field2745 = arg0;
    }

    @ObfuscatedName("d.l(I)Z")
    public static boolean method141() {
        return field2748 == 0 ? Statics.field3043.method3120() : true;
    }

    @ObfuscatedName("dl.m(I)V")
    public static void method2424() {
        try {
            if (field2748 == 1) {
                int var0 = Statics.field3043.method3060();
                if (var0 > 0 && Statics.field3043.method3120()) {
                    int var1 = var0 - Statics.field2745;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field3043.method3059(var1);
                    return;
                }
                Statics.field3043.method3065();
                Statics.field3043.method3063();
                if (Statics.field2749 == null) {
                    field2748 = 0;
                } else {
                    field2748 = 2;
                }
                Statics.field2754 = null;
                Statics.field228 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field3043.method3065();
            field2748 = 0;
            Statics.field2754 = null;
            Statics.field228 = null;
            Statics.field2749 = null;
        }
    }
}
