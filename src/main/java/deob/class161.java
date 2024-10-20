package deob;

@ObfuscatedName("fm")
public class class161 {

    @ObfuscatedName("fm.o")
    public static int field2705 = 0;

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("er.b(Leg;IIIZI)V")
    public static void method2681(class146 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2705 = 1;
        Statics.field2519 = arg0;
        Statics.field2103 = arg1;
        Statics.field2709 = arg2;
        Statics.field985 = arg3;
        Statics.field2708 = arg4;
        Statics.field2710 = 10000;
    }

    @ObfuscatedName("ba.u(II)V")
    public static void method1614(int arg0) {
        if (field2705 == 0) {
            Statics.field1003.method3020(arg0);
        } else {
            Statics.field985 = arg0;
        }
    }

    @ObfuscatedName("cb.x(B)Z")
    public static boolean method2072() {
        return field2705 == 0 ? Statics.field1003.method3004() : true;
    }

    @ObfuscatedName("di.j(I)V")
    public static void method2497() {
        try {
            if (field2705 == 1) {
                int var0 = Statics.field1003.method2998();
                if (var0 > 0 && Statics.field1003.method3004()) {
                    int var1 = var0 - Statics.field2710;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1003.method3020(var1);
                    return;
                }
                Statics.field1003.method3003();
                Statics.field1003.method3030();
                if (Statics.field2519 == null) {
                    field2705 = 0;
                } else {
                    field2705 = 2;
                }
                Statics.field1992 = null;
                Statics.field1451 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1003.method3003();
            field2705 = 0;
            Statics.field1992 = null;
            Statics.field1451 = null;
            Statics.field2519 = null;
        }
    }
}
