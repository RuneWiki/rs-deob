package deob;

@ObfuscatedName("hr")
public class class215 {

    @ObfuscatedName("hr.j")
    public static int field2597 = 0;

    public class215() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("db.p(Lik;Lik;Lik;Lhq;I)Z")
    public static boolean method2281(class247 arg0, class247 arg1, class247 arg2, class216 arg3) {
        Statics.field2599 = arg0;
        Statics.field2594 = arg1;
        Statics.field2593 = arg2;
        Statics.field2596 = arg3;
        return true;
    }

    @ObfuscatedName("fl.i(Lik;IIIZI)V")
    public static void method2935(class247 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2597 = 1;
        Statics.field1370 = arg0;
        Statics.field2421 = arg1;
        Statics.field2506 = arg2;
        Statics.field2598 = arg3;
        Statics.field2595 = arg4;
        Statics.field1269 = 10000;
    }

    @ObfuscatedName("cs.w(I)Z")
    public static boolean method1863() {
        return field2597 == 0 ? Statics.field2596.method3674() : true;
    }

    @ObfuscatedName("co.s(I)V")
    public static void method1750() {
        try {
            if (field2597 == 1) {
                int var0 = Statics.field2596.method3668();
                if (var0 > 0 && Statics.field2596.method3674()) {
                    int var1 = var0 - Statics.field1269;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2596.method3667(var1);
                    return;
                }
                Statics.field2596.method3673();
                Statics.field2596.method3705();
                if (Statics.field1370 == null) {
                    field2597 = 0;
                } else {
                    field2597 = 2;
                }
                Statics.field2600 = null;
                Statics.field1282 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2596.method3673();
            field2597 = 0;
            Statics.field2600 = null;
            Statics.field1282 = null;
            Statics.field1370 = null;
        }
    }
}
