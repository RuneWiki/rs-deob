package deob;

@ObfuscatedName("gv")
public class class198 {

    @ObfuscatedName("gv.p")
    public static int field2393 = 0;

    public class198() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ft.f(Lhz;IIIZI)V")
    public static void method3259(class234 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2393 = 1;
        Statics.field2519 = arg0;
        Statics.field102 = arg1;
        Statics.field62 = arg2;
        Statics.field2395 = arg3;
        Statics.field199 = arg4;
        Statics.field3276 = 10000;
    }

    @ObfuscatedName("dt.i(IB)V")
    public static void method2540(int arg0) {
        if (field2393 == 0) {
            Statics.field4005.method3374(arg0);
        } else {
            Statics.field2395 = arg0;
        }
    }

    @ObfuscatedName("bv.y(S)V")
    public static void method1587() {
        Statics.field4005.method3379();
        field2393 = 1;
        Statics.field2519 = null;
    }

    @ObfuscatedName("an.w(ILhz;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method518(int arg0, class234 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3847(arg2);
        int var7 = arg1.method3846(var6, arg3);
        method40(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("p.p(ILhz;IIIZI)V")
    public static void method40(int arg0, class234 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2393 = 1;
        Statics.field2519 = arg1;
        Statics.field102 = arg2;
        Statics.field62 = arg3;
        Statics.field2395 = arg4;
        Statics.field199 = arg5;
        Statics.field3276 = arg0;
    }

    @ObfuscatedName("er.b(IB)V")
    public static void method3013(int arg0) {
        field2393 = 1;
        Statics.field2519 = null;
        Statics.field102 = -1;
        Statics.field62 = -1;
        Statics.field2395 = 0;
        Statics.field199 = false;
        Statics.field3276 = arg0;
    }

    @ObfuscatedName("ae.e(I)Z")
    public static boolean method651() {
        return field2393 == 0 ? Statics.field4005.method3380() : true;
    }

    @ObfuscatedName("an.x(I)Z")
    public static boolean method521() {
        try {
            if (field2393 == 2) {
                if (Statics.field2396 == null) {
                    Statics.field2396 = class204.method3548(Statics.field2519, Statics.field102, Statics.field62);
                    if (Statics.field2396 == null) {
                        return false;
                    }
                }
                if (Statics.field3527 == null) {
                    Statics.field3527 = new class107(Statics.field2400, Statics.field2391);
                }
                if (Statics.field4005.method3376(Statics.field2396, Statics.field2397, Statics.field3527, 22050)) {
                    Statics.field4005.method3392();
                    Statics.field4005.method3374(Statics.field2395);
                    Statics.field4005.method3436(Statics.field2396, Statics.field199);
                    field2393 = 0;
                    Statics.field2396 = null;
                    Statics.field3527 = null;
                    Statics.field2519 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field4005.method3379();
            field2393 = 0;
            Statics.field2396 = null;
            Statics.field3527 = null;
            Statics.field2519 = null;
        }
        return false;
    }
}
