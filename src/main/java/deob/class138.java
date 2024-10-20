package deob;

@ObfuscatedName("eq")
public class class138 {

    @ObfuscatedName("eq.f")
    public static int field2340 = 0;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ah.d(Lej;IIIZI)V")
    public static void method574(class152 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2340 = 1;
        Statics.field2341 = arg0;
        Statics.field2342 = arg1;
        Statics.field2344 = arg2;
        Statics.field2012 = arg3;
        Statics.field2030 = arg4;
        Statics.field2038 = 10000;
    }

    @ObfuscatedName("cs.g(II)V")
    public static void method1620(int arg0) {
        if (field2340 == 0) {
            Statics.field2339.method2752(arg0);
        } else {
            Statics.field2012 = arg0;
        }
    }

    @ObfuscatedName("x.a(S)V")
    public static void method138() {
        Statics.field2339.method2694();
        field2340 = 1;
        Statics.field2341 = null;
    }

    @ObfuscatedName("y.t(ILej;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method113(int arg0, class152 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2948(arg2);
        int var7 = arg1.method3007(var6, arg3);
        field2340 = 1;
        Statics.field2341 = arg1;
        Statics.field2342 = var6;
        Statics.field2344 = var7;
        Statics.field2012 = arg4;
        Statics.field2030 = arg5;
        Statics.field2038 = arg0;
    }

    @ObfuscatedName("cd.f(B)Z")
    public static boolean method1809() {
        return field2340 == 0 ? Statics.field2339.method2695() : true;
    }

    @ObfuscatedName("dq.c(I)V")
    public static void method2299() {
        try {
            if (field2340 == 1) {
                int var0 = Statics.field2339.method2773();
                if (var0 > 0 && Statics.field2339.method2695()) {
                    int var1 = var0 - Statics.field2038;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2339.method2752(var1);
                    return;
                }
                Statics.field2339.method2694();
                Statics.field2339.method2692();
                if (Statics.field2341 == null) {
                    field2340 = 0;
                } else {
                    field2340 = 2;
                }
                Statics.field2336 = null;
                Statics.field2346 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2339.method2694();
            field2340 = 0;
            Statics.field2336 = null;
            Statics.field2346 = null;
            Statics.field2341 = null;
        }
    }

    @ObfuscatedName("f.p(B)Z")
    public static boolean method44() {
        try {
            if (field2340 == 2) {
                if (Statics.field2336 == null) {
                    Statics.field2336 = class139.method2663(Statics.field2341, Statics.field2342, Statics.field2344);
                    if (Statics.field2336 == null) {
                        return false;
                    }
                }
                if (Statics.field2346 == null) {
                    Statics.field2346 = new class58(Statics.field2338, Statics.field2337);
                }
                if (Statics.field2339.method2690(Statics.field2336, Statics.field2343, Statics.field2346, 22050)) {
                    Statics.field2339.method2775();
                    Statics.field2339.method2752(Statics.field2012);
                    Statics.field2339.method2700(Statics.field2336, Statics.field2030);
                    field2340 = 0;
                    Statics.field2336 = null;
                    Statics.field2346 = null;
                    Statics.field2341 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2339.method2694();
            field2340 = 0;
            Statics.field2336 = null;
            Statics.field2346 = null;
            Statics.field2341 = null;
        }
        return false;
    }
}
