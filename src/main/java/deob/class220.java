package deob;

@ObfuscatedName("hs")
public class class220 {

    @ObfuscatedName("hs.e")
    public static int field2534 = 0;

    public class220() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.f(Lik;Lik;Lik;Lhc;I)Z")
    public static boolean method979(class250 arg0, class250 arg1, class250 arg2, class221 arg3) {
        Statics.field2531 = arg0;
        Statics.field2533 = arg1;
        Statics.field2532 = arg2;
        Statics.field2536 = arg3;
        return true;
    }

    @ObfuscatedName("p.l(Lik;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method71(class250 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method4312(arg1);
        int var6 = arg0.method4291(var5, arg2);
        method3920(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("hi.w(Lik;IIIZI)V")
    public static void method3920(class250 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2534 = 1;
        Statics.field2358 = arg0;
        Statics.field1397 = arg1;
        Statics.field503 = arg2;
        Statics.field1838 = arg3;
        Statics.field1959 = arg4;
        Statics.field1517 = 10000;
    }

    @ObfuscatedName("al.s(ILik;IIIZI)V")
    public static void method606(int arg0, class250 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2534 = 1;
        Statics.field2358 = arg1;
        Statics.field1397 = arg2;
        Statics.field503 = arg3;
        Statics.field1838 = arg4;
        Statics.field1959 = arg5;
        Statics.field1517 = arg0;
    }

    @ObfuscatedName("ey.e(II)V")
    public static void method2909(int arg0) {
        field2534 = 1;
        Statics.field2358 = null;
        Statics.field1397 = -1;
        Statics.field503 = -1;
        Statics.field1838 = 0;
        Statics.field1959 = false;
        Statics.field1517 = arg0;
    }

    @ObfuscatedName("p.p(B)V")
    public static void method77() {
        try {
            if (field2534 == 1) {
                int var0 = Statics.field2536.method3963();
                if (var0 > 0 && Statics.field2536.method3986()) {
                    int var1 = var0 - Statics.field1517;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2536.method3941(var1);
                    return;
                }
                Statics.field2536.method3945();
                Statics.field2536.method3969();
                if (Statics.field2358 == null) {
                    field2534 = 0;
                } else {
                    field2534 = 2;
                }
                Statics.field533 = null;
                Statics.field2535 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2536.method3945();
            field2534 = 0;
            Statics.field533 = null;
            Statics.field2535 = null;
            Statics.field2358 = null;
        }
    }

    @ObfuscatedName("cj.r(B)Z")
    public static boolean method1841() {
        try {
            if (field2534 == 2) {
                if (Statics.field533 == null) {
                    Statics.field533 = class226.method4114(Statics.field2358, Statics.field1397, Statics.field503);
                    if (Statics.field533 == null) {
                        return false;
                    }
                }
                if (Statics.field2535 == null) {
                    Statics.field2535 = new class101(Statics.field2532, Statics.field2533);
                }
                if (Statics.field2536.method3943(Statics.field533, Statics.field2531, Statics.field2535, 22050)) {
                    Statics.field2536.method3981();
                    Statics.field2536.method3941(Statics.field1838);
                    Statics.field2536.method4001(Statics.field533, Statics.field1959);
                    field2534 = 0;
                    Statics.field533 = null;
                    Statics.field2535 = null;
                    Statics.field2358 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2536.method3945();
            field2534 = 0;
            Statics.field533 = null;
            Statics.field2535 = null;
            Statics.field2358 = null;
        }
        return false;
    }
}
