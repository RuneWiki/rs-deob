package deob;

@ObfuscatedName("ev")
public class class137 {

    @ObfuscatedName("ev.i")
    public static int field2294 = 0;

    public class137() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.z(Len;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method141(class150 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2966(arg1);
        int var6 = arg0.method2967(var5, arg2);
        method1823(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("cf.h(Len;IIIZI)V")
    public static void method1823(class150 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2294 = 1;
        Statics.field2288 = arg0;
        Statics.field2295 = arg1;
        Statics.field2292 = arg2;
        Statics.field2297 = arg3;
        Statics.field355 = arg4;
        Statics.field2298 = 10000;
    }

    @ObfuscatedName("cw.c(II)V")
    public static void method1594(int arg0) {
        if (field2294 == 0) {
            Statics.field2293.method2728(arg0);
        } else {
            Statics.field2297 = arg0;
        }
    }

    @ObfuscatedName("u.i(ILen;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method148(int arg0, class150 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2966(arg2);
        int var7 = arg1.method2967(var6, arg3);
        method163(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("n.v(ILen;IIIZB)V")
    public static void method163(int arg0, class150 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2294 = 1;
        Statics.field2288 = arg1;
        Statics.field2295 = arg2;
        Statics.field2292 = arg3;
        Statics.field2297 = arg4;
        Statics.field355 = arg5;
        Statics.field2298 = arg0;
    }

    @ObfuscatedName("bo.l(IB)V")
    public static void method1399(int arg0) {
        field2294 = 1;
        Statics.field2288 = null;
        Statics.field2295 = -1;
        Statics.field2292 = -1;
        Statics.field2297 = 0;
        Statics.field355 = false;
        Statics.field2298 = arg0;
    }

    @ObfuscatedName("eo.m(B)V")
    public static void method2667() {
        try {
            if (field2294 == 1) {
                int var0 = Statics.field2293.method2715();
                if (var0 > 0 && Statics.field2293.method2721()) {
                    int var1 = var0 - Statics.field2298;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2293.method2728(var1);
                    return;
                }
                Statics.field2293.method2720();
                Statics.field2293.method2718();
                if (Statics.field2288 == null) {
                    field2294 = 0;
                } else {
                    field2294 = 2;
                }
                Statics.field956 = null;
                Statics.field382 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2293.method2720();
            field2294 = 0;
            Statics.field956 = null;
            Statics.field382 = null;
            Statics.field2288 = null;
        }
    }

    @ObfuscatedName("v.g(I)Z")
    public static boolean method40() {
        try {
            if (field2294 == 2) {
                if (Statics.field956 == null) {
                    Statics.field956 = class138.method2700(Statics.field2288, Statics.field2295, Statics.field2292);
                    if (Statics.field956 == null) {
                        return false;
                    }
                }
                if (Statics.field382 == null) {
                    Statics.field382 = new class57(Statics.field2299, Statics.field2301);
                }
                if (Statics.field2293.method2716(Statics.field956, Statics.field2426, Statics.field382, 22050)) {
                    Statics.field2293.method2717();
                    Statics.field2293.method2728(Statics.field2297);
                    Statics.field2293.method2719(Statics.field956, Statics.field355);
                    field2294 = 0;
                    Statics.field956 = null;
                    Statics.field382 = null;
                    Statics.field2288 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2293.method2720();
            field2294 = 0;
            Statics.field956 = null;
            Statics.field382 = null;
            Statics.field2288 = null;
        }
        return false;
    }
}
