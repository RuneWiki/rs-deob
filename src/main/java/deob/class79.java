package deob;

@ObfuscatedName("cr")
public class class79 {

    @ObfuscatedName("cr.c")
    public static int field1130 = 0;

    public class79() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.q(Lcv;IIIZI)V")
    public static void method278(class87 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1130 = 1;
        Statics.field1125 = arg0;
        Statics.field563 = arg1;
        Statics.field1128 = arg2;
        Statics.field736 = arg3;
        Statics.field1134 = arg4;
        Statics.field40 = 10000;
    }

    @ObfuscatedName("l.a(ILcv;IIIZI)V")
    public static void method6(int arg0, class87 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1130 = 1;
        Statics.field1125 = arg1;
        Statics.field563 = arg2;
        Statics.field1128 = arg3;
        Statics.field736 = arg4;
        Statics.field1134 = arg5;
        Statics.field40 = arg0;
    }

    @ObfuscatedName("ac.o(I)V")
    public static void method478() {
        try {
            if (field1130 == 1) {
                int var0 = Statics.field1131.method2208();
                if (var0 > 0 && Statics.field1131.method2214()) {
                    int var1 = var0 - Statics.field40;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1131.method2207(var1);
                    return;
                }
                Statics.field1131.method2286();
                Statics.field1131.method2211();
                if (Statics.field1125 == null) {
                    field1130 = 0;
                } else {
                    field1130 = 2;
                }
                Statics.field41 = null;
                Statics.field1132 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1131.method2286();
            field1130 = 0;
            Statics.field41 = null;
            Statics.field1132 = null;
            Statics.field1125 = null;
        }
    }
}
