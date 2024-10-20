package deob;

@ObfuscatedName("hd")
public class class225 {

    @ObfuscatedName("hd.h")
    public static int field2558 = 0;

    public class225() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.a(Liz;IIIZI)V")
    public static void method540(class255 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2558 = 1;
        Statics.field279 = arg0;
        Statics.field2552 = arg1;
        Statics.field2553 = arg2;
        Statics.field537 = arg3;
        Statics.field2554 = arg4;
        Statics.field1526 = 10000;
    }

    @ObfuscatedName("fw.s(IS)V")
    public static void method3385(int arg0) {
        if (field2558 == 0) {
            Statics.field1861.method4072(arg0);
        } else {
            Statics.field537 = arg0;
        }
    }

    @ObfuscatedName("fm.g(B)V")
    public static void method3246() {
        Statics.field1861.method4077();
        field2558 = 1;
        Statics.field279 = null;
    }

    @ObfuscatedName("ft.x(ILiz;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method3351(int arg0, class255 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method4439(arg2);
        int var7 = arg1.method4444(var6, arg3);
        method3397(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("gn.h(ILiz;IIIZI)V")
    public static void method3397(int arg0, class255 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2558 = 1;
        Statics.field279 = arg1;
        Statics.field2552 = arg2;
        Statics.field2553 = arg3;
        Statics.field537 = arg4;
        Statics.field2554 = arg5;
        Statics.field1526 = arg0;
    }

    @ObfuscatedName("em.f(II)V")
    public static void method3061(int arg0) {
        field2558 = 1;
        Statics.field279 = null;
        Statics.field2552 = -1;
        Statics.field2553 = -1;
        Statics.field537 = 0;
        Statics.field2554 = false;
        Statics.field1526 = arg0;
    }

    @ObfuscatedName("dx.p(I)Z")
    public static boolean method2533() {
        return field2558 == 0 ? Statics.field1861.method4173() : true;
    }

    @ObfuscatedName("k.m(B)V")
    public static void method204() {
        try {
            if (field2558 == 1) {
                int var0 = Statics.field1861.method4170();
                if (var0 > 0 && Statics.field1861.method4173()) {
                    int var1 = var0 - Statics.field1526;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1861.method4072(var1);
                    return;
                }
                Statics.field1861.method4077();
                Statics.field1861.method4075();
                if (Statics.field279 == null) {
                    field2558 = 0;
                } else {
                    field2558 = 2;
                }
                Statics.field303 = null;
                Statics.field2549 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1861.method4077();
            field2558 = 0;
            Statics.field303 = null;
            Statics.field2549 = null;
            Statics.field279 = null;
        }
    }
}
