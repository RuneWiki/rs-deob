package deob;

@ObfuscatedName("fn")
public class class161 {

    @ObfuscatedName("fn.q")
    public static int field2710 = 0;

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.i(Ler;Ler;Ler;Lfz;B)Z")
    public static boolean method1900(class146 arg0, class146 arg1, class146 arg2, class162 arg3) {
        Statics.field2717 = arg0;
        Statics.field2712 = arg1;
        Statics.field2713 = arg2;
        Statics.field2666 = arg3;
        return true;
    }

    @ObfuscatedName("eo.c(Ler;IIIZI)V")
    public static void method2666(class146 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2710 = 1;
        Statics.field1805 = arg0;
        Statics.field1978 = arg1;
        Statics.field2714 = arg2;
        Statics.field2715 = arg3;
        Statics.field1822 = arg4;
        Statics.field68 = 10000;
    }

    @ObfuscatedName("es.h(IS)V")
    public static void method2845(int arg0) {
        if (field2710 == 0) {
            Statics.field2666.method3070(arg0);
        } else {
            Statics.field2715 = arg0;
        }
    }

    @ObfuscatedName("ad.v(I)V")
    public static void method1028() {
        Statics.field2666.method3116();
        field2710 = 1;
        Statics.field1805 = null;
    }

    @ObfuscatedName("al.q(ILer;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method521(int arg0, class146 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2815(arg2);
        int var7 = arg1.method2756(var6, arg3);
        field2710 = 1;
        Statics.field1805 = arg1;
        Statics.field1978 = var6;
        Statics.field2714 = var7;
        Statics.field2715 = arg4;
        Statics.field1822 = arg5;
        Statics.field68 = arg0;
    }

    @ObfuscatedName("cm.s(B)Z")
    public static boolean method2084() {
        return field2710 == 0 ? Statics.field2666.method3077() : true;
    }

    @ObfuscatedName("ci.g(B)V")
    public static void method1999() {
        try {
            if (field2710 == 1) {
                int var0 = Statics.field2666.method3071();
                if (var0 > 0 && Statics.field2666.method3077()) {
                    int var1 = var0 - Statics.field68;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2666.method3070(var1);
                    return;
                }
                Statics.field2666.method3116();
                Statics.field2666.method3159();
                if (Statics.field1805 == null) {
                    field2710 = 0;
                } else {
                    field2710 = 2;
                }
                Statics.field1494 = null;
                Statics.field2716 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2666.method3116();
            field2710 = 0;
            Statics.field1494 = null;
            Statics.field2716 = null;
            Statics.field1805 = null;
        }
    }
}
