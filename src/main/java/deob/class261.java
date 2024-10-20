package deob;

@ObfuscatedName("jd")
public class class261 {

    @ObfuscatedName("jd.t")
    public static int field3065 = 0;

    public class261() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cw.c(Lku;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2259(class302 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method5118(arg1);
        int var6 = arg0.method5070(var5, arg2);
        method2841(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ff.b(Lku;IIIZI)V")
    public static void method2841(class302 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3065 = 1;
        Statics.field1487 = arg0;
        Statics.field1780 = arg1;
        Statics.field3066 = arg2;
        Statics.field959 = arg3;
        Statics.field949 = arg4;
        Statics.field3067 = 10000;
    }

    @ObfuscatedName("fp.p(B)V")
    public static void method3135() {
        Statics.field3064.method4693();
        field3065 = 1;
        Statics.field1487 = null;
    }

    @ObfuscatedName("bn.m(ILku;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method1948(int arg0, class302 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method5118(arg2);
        int var7 = arg1.method5070(var6, arg3);
        field3065 = 1;
        Statics.field1487 = arg1;
        Statics.field1780 = var6;
        Statics.field3066 = var7;
        Statics.field959 = arg4;
        Statics.field949 = arg5;
        Statics.field3067 = arg0;
    }

    @ObfuscatedName("bt.t(I)Z")
    public static boolean method1916() {
        return field3065 == 0 ? Statics.field3064.method4601() : true;
    }

    @ObfuscatedName("cb.s(B)V")
    public static void method2223() {
        try {
            if (field3065 == 1) {
                int var0 = Statics.field3064.method4596();
                if (var0 > 0 && Statics.field3064.method4601()) {
                    int var1 = var0 - Statics.field3067;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field3064.method4628(var1);
                    return;
                }
                Statics.field3064.method4693();
                Statics.field3064.method4618();
                if (Statics.field1487 == null) {
                    field3065 = 0;
                } else {
                    field3065 = 2;
                }
                Statics.field114 = null;
                Statics.field3047 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field3064.method4693();
            field3065 = 0;
            Statics.field114 = null;
            Statics.field3047 = null;
            Statics.field1487 = null;
        }
    }
}
