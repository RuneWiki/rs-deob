package deob;

@ObfuscatedName("ge")
public class class207 {

    @ObfuscatedName("ge.y")
    public static int field2436 = 0;

    public class207() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("be.n(Lig;Lig;Lig;Lgg;I)Z")
    public static boolean method1118(class245 arg0, class245 arg1, class245 arg2, class208 arg3) {
        Statics.field2437 = arg0;
        Statics.field2435 = arg1;
        Statics.field2440 = arg2;
        Statics.field1773 = arg3;
        return true;
    }

    @ObfuscatedName("du.v(Lig;IIIZB)V")
    public static void method2270(class245 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2436 = 1;
        Statics.field2438 = arg0;
        Statics.field2434 = arg1;
        Statics.field1454 = arg2;
        Statics.field436 = arg3;
        Statics.field2439 = arg4;
        Statics.field43 = 10000;
    }

    @ObfuscatedName("by.d(I)V")
    public static void method1134() {
        Statics.field1773.method3586();
        field2436 = 1;
        Statics.field2438 = null;
    }

    @ObfuscatedName("bu.c(ILig;IIIZI)V")
    public static void method1238(int arg0, class245 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2436 = 1;
        Statics.field2438 = arg1;
        Statics.field2434 = arg2;
        Statics.field1454 = arg3;
        Statics.field436 = arg4;
        Statics.field2439 = arg5;
        Statics.field43 = arg0;
    }

    @ObfuscatedName("y.y(I)Z")
    public static boolean method42() {
        return field2436 == 0 ? Statics.field1773.method3587() : true;
    }

    @ObfuscatedName("gv.h(I)V")
    public static void method3500() {
        try {
            if (field2436 == 1) {
                int var0 = Statics.field1773.method3581();
                if (var0 > 0 && Statics.field1773.method3587()) {
                    int var1 = var0 - Statics.field43;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1773.method3637(var1);
                    return;
                }
                Statics.field1773.method3586();
                Statics.field1773.method3584();
                if (Statics.field2438 == null) {
                    field2436 = 0;
                } else {
                    field2436 = 2;
                }
                Statics.field2422 = null;
                Statics.field2124 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1773.method3586();
            field2436 = 0;
            Statics.field2422 = null;
            Statics.field2124 = null;
            Statics.field2438 = null;
        }
    }
}
