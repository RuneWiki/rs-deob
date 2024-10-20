package deob;

@ObfuscatedName("eo")
public class class140 {

    @ObfuscatedName("eo.r")
    public static int field2352 = 0;

    public class140() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.l(Lem;Lem;Lem;Led;B)Z")
    public static boolean method2222(class154 arg0, class154 arg1, class154 arg2, class143 arg3) {
        Statics.field2359 = arg0;
        Statics.field2350 = arg1;
        Statics.field2351 = arg2;
        Statics.field246 = arg3;
        return true;
    }

    @ObfuscatedName("db.b(Lem;IIIZI)V")
    public static void method2313(class154 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2352 = 1;
        Statics.field2353 = arg0;
        Statics.field2355 = arg1;
        Statics.field2358 = arg2;
        Statics.field2356 = arg3;
        Statics.field2334 = arg4;
        Statics.field2357 = 10000;
    }

    @ObfuscatedName("aq.o(I)V")
    public static void method805() {
        Statics.field246.method2774();
        field2352 = 1;
        Statics.field2353 = null;
    }

    @ObfuscatedName("dv.w(II)V")
    public static void method2363(int arg0) {
        field2352 = 1;
        Statics.field2353 = null;
        Statics.field2355 = -1;
        Statics.field2358 = -1;
        Statics.field2356 = 0;
        Statics.field2334 = false;
        Statics.field2357 = arg0;
    }

    @ObfuscatedName("er.r(I)Z")
    public static boolean method2734() {
        try {
            if (field2352 == 2) {
                if (Statics.field2349 == null) {
                    Statics.field2349 = class141.method2758(Statics.field2353, Statics.field2355, Statics.field2358);
                    if (Statics.field2349 == null) {
                        return false;
                    }
                }
                if (Statics.field2354 == null) {
                    Statics.field2354 = new class58(Statics.field2351, Statics.field2350);
                }
                if (Statics.field246.method2771(Statics.field2349, Statics.field2359, Statics.field2354, 22050)) {
                    Statics.field246.method2803();
                    Statics.field246.method2783(Statics.field2356);
                    Statics.field246.method2773(Statics.field2349, Statics.field2334);
                    field2352 = 0;
                    Statics.field2349 = null;
                    Statics.field2354 = null;
                    Statics.field2353 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field246.method2774();
            field2352 = 0;
            Statics.field2349 = null;
            Statics.field2354 = null;
            Statics.field2353 = null;
        }
        return false;
    }
}
