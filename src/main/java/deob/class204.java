package deob;

@ObfuscatedName("gd")
public class class204 {

    @ObfuscatedName("gd.f")
    public static int field2516 = 0;

    public class204() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.n(Lis;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method52(class236 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3846(arg1);
        int var6 = arg0.method3914(var5, arg2);
        method3180(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("gw.p(Lis;IIIZI)V")
    public static void method3180(class236 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2516 = 1;
        Statics.field2517 = arg0;
        Statics.field2276 = arg1;
        Statics.field3731 = arg2;
        Statics.field1775 = arg3;
        Statics.field3691 = arg4;
        Statics.field2262 = 10000;
    }

    @ObfuscatedName("af.i(II)V")
    public static void method544(int arg0) {
        if (field2516 == 0) {
            Statics.field2518.method3510(arg0);
        } else {
            Statics.field1775 = arg0;
        }
    }

    @ObfuscatedName("e.j(ILis;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method59(int arg0, class236 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3846(arg2);
        int var7 = arg1.method3914(var6, arg3);
        method688(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("bc.f(ILis;IIIZI)V")
    public static void method688(int arg0, class236 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2516 = 1;
        Statics.field2517 = arg1;
        Statics.field2276 = arg2;
        Statics.field3731 = arg3;
        Statics.field1775 = arg4;
        Statics.field3691 = arg5;
        Statics.field2262 = arg0;
    }

    @ObfuscatedName("af.m(I)Z")
    public static boolean method547() {
        return field2516 == 0 ? Statics.field2518.method3494() : true;
    }

    @ObfuscatedName("eq.c(S)V")
    public static void method2400() {
        try {
            if (field2516 == 1) {
                int var0 = Statics.field2518.method3460();
                if (var0 > 0 && Statics.field2518.method3494()) {
                    int var1 = var0 - Statics.field2262;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2518.method3510(var1);
                    return;
                }
                Statics.field2518.method3477();
                Statics.field2518.method3462();
                if (Statics.field2517 == null) {
                    field2516 = 0;
                } else {
                    field2516 = 2;
                }
                Statics.field2609 = null;
                Statics.field329 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2518.method3477();
            field2516 = 0;
            Statics.field2609 = null;
            Statics.field329 = null;
            Statics.field2517 = null;
        }
    }
}
