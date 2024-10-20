package deob;

@ObfuscatedName("hz")
public class class215 {

    @ObfuscatedName("hz.h")
    public static int field2632 = 0;

    public class215() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ej.n(Lil;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2344(class247 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method4007(arg1);
        int var6 = arg0.method4009(var5, arg2);
        method1490(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ch.v(Lil;IIIZI)V")
    public static void method1490(class247 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2632 = 1;
        Statics.field2633 = arg0;
        Statics.field811 = arg1;
        Statics.field3475 = arg2;
        Statics.field478 = arg3;
        Statics.field2628 = arg4;
        Statics.field3712 = 10000;
    }

    @ObfuscatedName("jh.y(B)V")
    public static void method4422() {
        try {
            if (field2632 == 1) {
                int var0 = Statics.field2631.method3655();
                if (var0 > 0 && Statics.field2631.method3577()) {
                    int var1 = var0 - Statics.field3712;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2631.method3571(var1);
                    return;
                }
                Statics.field2631.method3576();
                Statics.field2631.method3574();
                if (Statics.field2633 == null) {
                    field2632 = 0;
                } else {
                    field2632 = 2;
                }
                Statics.field832 = null;
                Statics.field300 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2631.method3576();
            field2632 = 0;
            Statics.field832 = null;
            Statics.field300 = null;
            Statics.field2633 = null;
        }
    }

    @ObfuscatedName("ds.r(B)Z")
    public static boolean method2333() {
        try {
            if (field2632 == 2) {
                if (Statics.field832 == null) {
                    Statics.field832 = class221.method3763(Statics.field2633, Statics.field811, Statics.field3475);
                    if (Statics.field832 == null) {
                        return false;
                    }
                }
                if (Statics.field300 == null) {
                    Statics.field300 = new class112(Statics.field2630, Statics.field2634);
                }
                if (Statics.field2631.method3654(Statics.field832, Statics.field2636, Statics.field300, 22050)) {
                    Statics.field2631.method3573();
                    Statics.field2631.method3571(Statics.field478);
                    Statics.field2631.method3575(Statics.field832, Statics.field2628);
                    field2632 = 0;
                    Statics.field832 = null;
                    Statics.field300 = null;
                    Statics.field2633 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2631.method3576();
            field2632 = 0;
            Statics.field832 = null;
            Statics.field300 = null;
            Statics.field2633 = null;
        }
        return false;
    }
}
