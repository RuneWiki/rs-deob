package deob;

@ObfuscatedName("ir")
public class class248 {

    @ObfuscatedName("ir.o")
    public static int field2923 = 0;

    public class248() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gn.i(II)V")
    public static void method3534(int arg0) {
        if (field2923 == 0) {
            Statics.field2928.method4353(arg0);
        } else {
            Statics.field2925 = arg0;
        }
    }

    @ObfuscatedName("gu.w(I)V")
    public static void method3598() {
        Statics.field2928.method4269();
        field2923 = 1;
        Statics.field1471 = null;
    }

    @ObfuscatedName("ej.s(I)V")
    public static void method2509() {
        try {
            if (field2923 == 1) {
                int var0 = Statics.field2928.method4264();
                if (var0 > 0 && Statics.field2928.method4270()) {
                    int var1 = var0 - Statics.field2926;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2928.method4353(var1);
                    return;
                }
                Statics.field2928.method4269();
                Statics.field2928.method4272();
                if (Statics.field1471 == null) {
                    field2923 = 0;
                } else {
                    field2923 = 2;
                }
                Statics.field68 = null;
                Statics.field2927 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2928.method4269();
            field2923 = 0;
            Statics.field68 = null;
            Statics.field2927 = null;
            Statics.field1471 = null;
        }
    }
}
