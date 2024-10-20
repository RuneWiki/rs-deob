package deob;

@ObfuscatedName("ew")
public class class139 {

    @ObfuscatedName("ew.y")
    public static int field2353 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.p(Leu;IIIZI)V")
    public static void method2150(class153 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2353 = 1;
        Statics.field1029 = arg0;
        Statics.field1820 = arg1;
        Statics.field1311 = arg2;
        Statics.field1821 = arg3;
        Statics.field2356 = arg4;
        Statics.field2355 = 10000;
    }

    @ObfuscatedName("aq.e(II)V")
    public static void method799(int arg0) {
        field2353 = 1;
        Statics.field1029 = null;
        Statics.field1820 = -1;
        Statics.field1311 = -1;
        Statics.field1821 = 0;
        Statics.field2356 = false;
        Statics.field2355 = arg0;
    }

    @ObfuscatedName("db.a(B)V")
    public static void method2348() {
        try {
            if (field2353 == 1) {
                int var0 = Statics.field2815.method2813();
                if (var0 > 0 && Statics.field2815.method2819()) {
                    int var1 = var0 - Statics.field2355;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2815.method2812(var1);
                    return;
                }
                Statics.field2815.method2909();
                Statics.field2815.method2816();
                if (Statics.field1029 == null) {
                    field2353 = 0;
                } else {
                    field2353 = 2;
                }
                Statics.field1200 = null;
                Statics.field1278 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2815.method2909();
            field2353 = 0;
            Statics.field1200 = null;
            Statics.field1278 = null;
            Statics.field1029 = null;
        }
    }

    @ObfuscatedName("z.h(B)Z")
    public static boolean method146() {
        try {
            if (field2353 == 2) {
                if (Statics.field1200 == null) {
                    Statics.field1200 = class140.method2793(Statics.field1029, Statics.field1820, Statics.field1311);
                    if (Statics.field1200 == null) {
                        return false;
                    }
                }
                if (Statics.field1278 == null) {
                    Statics.field1278 = new class58(Statics.field2358, Statics.field2360);
                }
                if (Statics.field2815.method2884(Statics.field1200, Statics.field2351, Statics.field1278, 22050)) {
                    Statics.field2815.method2815();
                    Statics.field2815.method2812(Statics.field1821);
                    Statics.field2815.method2817(Statics.field1200, Statics.field2356);
                    field2353 = 0;
                    Statics.field1200 = null;
                    Statics.field1278 = null;
                    Statics.field1029 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2815.method2909();
            field2353 = 0;
            Statics.field1200 = null;
            Statics.field1278 = null;
            Statics.field1029 = null;
        }
        return false;
    }
}
