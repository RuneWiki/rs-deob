package deob;

@ObfuscatedName("gq")
public class class198 {

    @ObfuscatedName("gq.z")
    public static int field2412 = 0;

    public class198() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fj.u(Lhf;Lhf;Lhf;Lgz;I)Z")
    public static boolean method3182(class234 arg0, class234 arg1, class234 arg2, class199 arg3) {
        Statics.field2410 = arg0;
        Statics.field2411 = arg1;
        Statics.field2416 = arg2;
        Statics.field1879 = arg3;
        return true;
    }

    @ObfuscatedName("bb.b(Lhf;IIIZI)V")
    public static void method1088(class234 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2412 = 1;
        Statics.field2414 = arg0;
        Statics.field1936 = arg1;
        Statics.field1984 = arg2;
        Statics.field2415 = arg3;
        Statics.field533 = arg4;
        Statics.field4015 = 10000;
    }

    @ObfuscatedName("ey.g(II)V")
    public static void method2838(int arg0) {
        if (field2412 == 0) {
            Statics.field1879.method3516(arg0);
        } else {
            Statics.field2415 = arg0;
        }
    }

    @ObfuscatedName("da.z(I)V")
    public static void method2546() {
        Statics.field1879.method3472();
        field2412 = 1;
        Statics.field2414 = null;
    }

    @ObfuscatedName("bp.p(ILhf;IIIZI)V")
    public static void method1639(int arg0, class234 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2412 = 1;
        Statics.field2414 = arg1;
        Statics.field1936 = arg2;
        Statics.field1984 = arg3;
        Statics.field2415 = arg4;
        Statics.field533 = arg5;
        Statics.field4015 = arg0;
    }

    @ObfuscatedName("ez.h(II)V")
    public static void method3069(int arg0) {
        field2412 = 1;
        Statics.field2414 = null;
        Statics.field1936 = -1;
        Statics.field1984 = -1;
        Statics.field2415 = 0;
        Statics.field533 = false;
        Statics.field4015 = arg0;
    }

    @ObfuscatedName("by.y(I)V")
    public static void method1047() {
        try {
            if (field2412 == 1) {
                int var0 = Statics.field1879.method3429();
                if (var0 > 0 && Statics.field1879.method3524()) {
                    int var1 = var0 - Statics.field4015;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1879.method3516(var1);
                    return;
                }
                Statics.field1879.method3472();
                Statics.field1879.method3432();
                if (Statics.field2414 == null) {
                    field2412 = 0;
                } else {
                    field2412 = 2;
                }
                Statics.field228 = null;
                Statics.field1122 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1879.method3472();
            field2412 = 0;
            Statics.field228 = null;
            Statics.field1122 = null;
            Statics.field2414 = null;
        }
    }
}
