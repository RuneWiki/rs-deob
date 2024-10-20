package deob;

@ObfuscatedName("gy")
public class class207 {

    @ObfuscatedName("gy.f")
    public static int field2521 = 0;

    public class207() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fn.w(Liq;Liq;Liq;Lgg;I)Z")
    public static boolean method2854(class239 arg0, class239 arg1, class239 arg2, class208 arg3) {
        Statics.field3692 = arg0;
        Statics.field2526 = arg1;
        Statics.field2525 = arg2;
        Statics.field458 = arg3;
        return true;
    }

    @ObfuscatedName("bg.o(Liq;IIIZB)V")
    public static void method913(class239 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2521 = 1;
        Statics.field15 = arg0;
        Statics.field630 = arg1;
        Statics.field2522 = arg2;
        Statics.field2523 = arg3;
        Statics.field2307 = arg4;
        Statics.field2524 = 10000;
    }

    @ObfuscatedName("fa.k(ILiq;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method2700(int arg0, class239 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3742(arg2);
        int var7 = arg1.method3743(var6, arg3);
        Statics.method1601(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("ai.i(I)V")
    public static void method238() {
        try {
            if (field2521 == 1) {
                int var0 = Statics.field458.method3398();
                if (var0 > 0 && Statics.field458.method3404()) {
                    int var1 = var0 - Statics.field2524;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field458.method3397(var1);
                    return;
                }
                Statics.field458.method3403();
                Statics.field458.method3430();
                if (Statics.field15 == null) {
                    field2521 = 0;
                } else {
                    field2521 = 2;
                }
                Statics.field817 = null;
                Statics.field1504 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field458.method3403();
            field2521 = 0;
            Statics.field817 = null;
            Statics.field1504 = null;
            Statics.field15 = null;
        }
    }
}
