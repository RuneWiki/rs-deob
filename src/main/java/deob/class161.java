package deob;

@ObfuscatedName("fx")
public class class161 {

    @ObfuscatedName("fx.c")
    public static int field2704 = 0;

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.t(Ley;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method890(class146 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2711(arg1);
        int var6 = arg0.method2739(var5, arg2);
        method2649(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ew.o(Ley;IIIZI)V")
    public static void method2649(class146 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2704 = 1;
        Statics.field1000 = arg0;
        Statics.field2700 = arg1;
        Statics.field2706 = arg2;
        Statics.field2707 = arg3;
        Statics.field2708 = arg4;
        Statics.field2051 = 10000;
    }

    @ObfuscatedName("client.i(IB)V")
    public static void method458(int arg0) {
        if (field2704 == 0) {
            Statics.field2703.method3043(arg0);
        } else {
            Statics.field2707 = arg0;
        }
    }

    @ObfuscatedName("k.c(ILey;IIIZI)V")
    public static void method465(int arg0, class146 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2704 = 1;
        Statics.field1000 = arg1;
        Statics.field2700 = arg2;
        Statics.field2706 = arg3;
        Statics.field2707 = arg4;
        Statics.field2708 = arg5;
        Statics.field2051 = arg0;
    }

    @ObfuscatedName("cy.y(II)V")
    public static void method1966(int arg0) {
        field2704 = 1;
        Statics.field1000 = null;
        Statics.field2700 = -1;
        Statics.field2706 = -1;
        Statics.field2707 = 0;
        Statics.field2708 = false;
        Statics.field2051 = arg0;
    }

    @ObfuscatedName("aj.g(I)V")
    public static void method636() {
        try {
            if (field2704 == 1) {
                int var0 = Statics.field2703.method3062();
                if (var0 > 0 && Statics.field2703.method2987()) {
                    int var1 = var0 - Statics.field2051;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2703.method3043(var1);
                    return;
                }
                Statics.field2703.method3035();
                Statics.field2703.method3055();
                if (Statics.field1000 == null) {
                    field2704 = 0;
                } else {
                    field2704 = 2;
                }
                Statics.field1863 = null;
                Statics.field998 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2703.method3035();
            field2704 = 0;
            Statics.field1863 = null;
            Statics.field998 = null;
            Statics.field1000 = null;
        }
    }
}
