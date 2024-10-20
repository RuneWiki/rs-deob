package deob;

@ObfuscatedName("ez")
public class class139 {

    @ObfuscatedName("ez.w")
    public static int field1918 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.n(Lgj;IIIZI)V")
    public static void method2173(class183 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1918 = 1;
        Statics.field13 = arg0;
        Statics.field1919 = arg1;
        Statics.field1567 = arg2;
        Statics.field1650 = arg3;
        Statics.field743 = arg4;
        Statics.field1793 = 10000;
    }

    @ObfuscatedName("az.d(II)V")
    public static void method752(int arg0) {
        if (field1918 == 0) {
            Statics.field1920.method2374(arg0);
        } else {
            Statics.field1650 = arg0;
        }
    }

    @ObfuscatedName("e.m(B)V")
    public static void method187() {
        Statics.field1920.method2380();
        field1918 = 1;
        Statics.field13 = null;
    }

    @ObfuscatedName("ab.h(ILgj;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method756(int arg0, class183 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3114(arg2);
        int var7 = arg1.method3109(var6, arg3);
        field1918 = 1;
        Statics.field13 = arg1;
        Statics.field1919 = var6;
        Statics.field1567 = var7;
        Statics.field1650 = arg4;
        Statics.field743 = arg5;
        Statics.field1793 = arg0;
    }

    @ObfuscatedName("fj.w(B)Z")
    public static boolean method2978() {
        return field1918 == 0 ? Statics.field1920.method2381() : true;
    }

    @ObfuscatedName("ay.r(I)Z")
    public static boolean method629() {
        try {
            if (field1918 == 2) {
                if (Statics.field2289 == null) {
                    Statics.field2289 = class145.method2567(Statics.field13, Statics.field1919, Statics.field1567);
                    if (Statics.field2289 == null) {
                        return false;
                    }
                }
                if (Statics.field761 == null) {
                    Statics.field761 = new class61(Statics.field1916, Statics.field1914);
                }
                if (Statics.field1920.method2376(Statics.field2289, Statics.field1915, Statics.field761, 22050)) {
                    Statics.field1920.method2377();
                    Statics.field1920.method2374(Statics.field1650);
                    Statics.field1920.method2415(Statics.field2289, Statics.field743);
                    field1918 = 0;
                    Statics.field2289 = null;
                    Statics.field761 = null;
                    Statics.field13 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field1920.method2380();
            field1918 = 0;
            Statics.field2289 = null;
            Statics.field761 = null;
            Statics.field13 = null;
        }
        return false;
    }
}
