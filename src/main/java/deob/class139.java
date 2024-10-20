package deob;

@ObfuscatedName("ed")
public class class139 {

    @ObfuscatedName("ed.g")
    public static int field2378 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.c(Ley;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method2199(class153 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2901(arg1);
        int var6 = arg0.method2948(var5, arg2);
        method1505(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("bq.q(Ley;IIIZI)V")
    public static void method1505(class153 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2378 = 1;
        Statics.field2599 = arg0;
        Statics.field2376 = arg1;
        Statics.field2379 = arg2;
        Statics.field2842 = arg3;
        Statics.field2380 = arg4;
        Statics.field138 = 10000;
    }

    @ObfuscatedName("ct.y(ILey;IIIZI)V")
    public static void method1779(int arg0, class153 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2378 = 1;
        Statics.field2599 = arg1;
        Statics.field2376 = arg2;
        Statics.field2379 = arg3;
        Statics.field2842 = arg4;
        Statics.field2380 = arg5;
        Statics.field138 = arg0;
    }

    @ObfuscatedName("ap.v(II)V")
    public static void method244(int arg0) {
        field2378 = 1;
        Statics.field2599 = null;
        Statics.field2376 = -1;
        Statics.field2379 = -1;
        Statics.field2842 = 0;
        Statics.field2380 = false;
        Statics.field138 = arg0;
    }

    @ObfuscatedName("h.g(I)Z")
    public static boolean method99() {
        return field2378 == 0 ? Statics.field409.method2646() : true;
    }

    @ObfuscatedName("cv.x(I)V")
    public static void method1960() {
        try {
            if (field2378 == 1) {
                int var0 = Statics.field409.method2710();
                if (var0 > 0 && Statics.field409.method2646()) {
                    int var1 = var0 - Statics.field138;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field409.method2736(var1);
                    return;
                }
                Statics.field409.method2686();
                Statics.field409.method2716();
                if (Statics.field2599 == null) {
                    field2378 = 0;
                } else {
                    field2378 = 2;
                }
                Statics.field1290 = null;
                Statics.field1280 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field409.method2686();
            field2378 = 0;
            Statics.field1290 = null;
            Statics.field1280 = null;
            Statics.field2599 = null;
        }
    }

    @ObfuscatedName("bm.u(I)Z")
    public static boolean method1233() {
        try {
            if (field2378 == 2) {
                if (Statics.field1290 == null) {
                    Statics.field1290 = class140.method2621(Statics.field2599, Statics.field2376, Statics.field2379);
                    if (Statics.field1290 == null) {
                        return false;
                    }
                }
                if (Statics.field1280 == null) {
                    Statics.field1280 = new class58(Statics.field2377, Statics.field2381);
                }
                if (Statics.field409.method2641(Statics.field1290, Statics.field1289, Statics.field1280, 22050)) {
                    Statics.field409.method2674();
                    Statics.field409.method2736(Statics.field2842);
                    Statics.field409.method2726(Statics.field1290, Statics.field2380);
                    field2378 = 0;
                    Statics.field1290 = null;
                    Statics.field1280 = null;
                    Statics.field2599 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field409.method2686();
            field2378 = 0;
            Statics.field1290 = null;
            Statics.field1280 = null;
            Statics.field2599 = null;
        }
        return false;
    }
}
