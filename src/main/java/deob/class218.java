package deob;

@ObfuscatedName("hn")
public class class218 {

    @ObfuscatedName("hn.f")
    public static int field2487 = 0;

    public class218() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dj.w(Liv;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2490(class248 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method4268(arg1);
        int var6 = arg0.method4317(var5, arg2);
        method3231(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("fj.m(Liv;IIIZB)V")
    public static void method3231(class248 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2487 = 1;
        Statics.field237 = arg0;
        Statics.field168 = arg1;
        Statics.field2488 = arg2;
        Statics.field186 = arg3;
        Statics.field2318 = arg4;
        Statics.field3747 = 10000;
    }

    @ObfuscatedName("bl.q(IB)V")
    public static void method1465(int arg0) {
        if (field2487 == 0) {
            Statics.field2486.method3954(arg0);
        } else {
            Statics.field186 = arg0;
        }
    }

    @ObfuscatedName("ao.x(B)V")
    public static void method630() {
        Statics.field2486.method3903();
        field2487 = 1;
        Statics.field237 = null;
    }

    @ObfuscatedName("fy.j(ILiv;IIIZI)V")
    public static void method3153(int arg0, class248 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2487 = 1;
        Statics.field237 = arg1;
        Statics.field168 = arg2;
        Statics.field2488 = arg3;
        Statics.field186 = arg4;
        Statics.field2318 = arg5;
        Statics.field3747 = arg0;
    }

    @ObfuscatedName("gh.a(II)V")
    public static void method3595(int arg0) {
        field2487 = 1;
        Statics.field237 = null;
        Statics.field168 = -1;
        Statics.field2488 = -1;
        Statics.field186 = 0;
        Statics.field2318 = false;
        Statics.field3747 = arg0;
    }

    @ObfuscatedName("fz.l(I)Z")
    public static boolean method3069() {
        return field2487 == 0 ? Statics.field2486.method4004() : true;
    }

    @ObfuscatedName("fw.d(I)V")
    public static void method3224() {
        try {
            if (field2487 == 1) {
                int var0 = Statics.field2486.method3896();
                if (var0 > 0 && Statics.field2486.method4004()) {
                    int var1 = var0 - Statics.field3747;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2486.method3954(var1);
                    return;
                }
                Statics.field2486.method3903();
                Statics.field2486.method3899();
                if (Statics.field237 == null) {
                    field2487 = 0;
                } else {
                    field2487 = 2;
                }
                Statics.field3645 = null;
                Statics.field558 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2486.method3903();
            field2487 = 0;
            Statics.field3645 = null;
            Statics.field558 = null;
            Statics.field237 = null;
        }
    }

    @ObfuscatedName("w.s(S)Z")
    public static boolean method1() {
        try {
            if (field2487 == 2) {
                if (Statics.field3645 == null) {
                    Statics.field3645 = class224.method4086(Statics.field237, Statics.field168, Statics.field2488);
                    if (Statics.field3645 == null) {
                        return false;
                    }
                }
                if (Statics.field558 == null) {
                    Statics.field558 = new class99(Statics.field2491, Statics.field2483);
                }
                if (Statics.field2486.method3897(Statics.field3645, Statics.field2485, Statics.field558, 22050)) {
                    Statics.field2486.method3898();
                    Statics.field2486.method3954(Statics.field186);
                    Statics.field2486.method3977(Statics.field3645, Statics.field2318);
                    field2487 = 0;
                    Statics.field3645 = null;
                    Statics.field558 = null;
                    Statics.field237 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2486.method3903();
            field2487 = 0;
            Statics.field3645 = null;
            Statics.field558 = null;
            Statics.field237 = null;
        }
        return false;
    }
}
