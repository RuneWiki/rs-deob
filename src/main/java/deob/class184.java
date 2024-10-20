package deob;

@ObfuscatedName("gk")
public class class184 {

    @ObfuscatedName("gk.d")
    public static int field2974 = 0;

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.s(Lfa;Lfa;Lfa;Lgw;B)Z")
    public static boolean method1542(class168 arg0, class168 arg1, class168 arg2, class185 arg3) {
        Statics.field2981 = arg0;
        Statics.field2979 = arg1;
        Statics.field1572 = arg2;
        Statics.field2973 = arg3;
        return true;
    }

    @ObfuscatedName("ab.j(Lfa;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method613(class168 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3028(arg1);
        int var6 = arg0.method3029(var5, arg2);
        method1747(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("cb.p(Lfa;IIIZI)V")
    public static void method1747(class168 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2974 = 1;
        Statics.field2975 = arg0;
        Statics.field3185 = arg1;
        Statics.field2269 = arg2;
        Statics.field2972 = arg3;
        Statics.field2978 = arg4;
        Statics.field2977 = 10000;
    }

    @ObfuscatedName("dg.x(I)V")
    public static void method2225() {
        Statics.field2973.method3354();
        field2974 = 1;
        Statics.field2975 = null;
    }

    @ObfuscatedName("fv.d(ILfa;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method2941(int arg0, class168 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3028(arg2);
        int var7 = arg1.method3029(var6, arg3);
        field2974 = 1;
        Statics.field2975 = arg1;
        Statics.field3185 = var6;
        Statics.field2269 = var7;
        Statics.field2972 = arg4;
        Statics.field2978 = arg5;
        Statics.field2977 = arg0;
    }

    @ObfuscatedName("cx.o(I)V")
    public static void method2136() {
        try {
            if (field2974 == 1) {
                int var0 = Statics.field2973.method3350();
                if (var0 > 0 && Statics.field2973.method3355()) {
                    int var1 = var0 - Statics.field2977;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2973.method3349(var1);
                    return;
                }
                Statics.field2973.method3354();
                Statics.field2973.method3446();
                if (Statics.field2975 == null) {
                    field2974 = 0;
                } else {
                    field2974 = 2;
                }
                Statics.field163 = null;
                Statics.field2976 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2973.method3354();
            field2974 = 0;
            Statics.field163 = null;
            Statics.field2976 = null;
            Statics.field2975 = null;
        }
    }

    @ObfuscatedName("y.b(I)Z")
    public static boolean method552() {
        try {
            if (field2974 == 2) {
                if (Statics.field163 == null) {
                    Statics.field163 = class181.method3275(Statics.field2975, Statics.field3185, Statics.field2269);
                    if (Statics.field163 == null) {
                        return false;
                    }
                }
                if (Statics.field2976 == null) {
                    Statics.field2976 = new class60(Statics.field1572, Statics.field2979);
                }
                if (Statics.field2973.method3351(Statics.field163, Statics.field2981, Statics.field2976, 22050)) {
                    Statics.field2973.method3389();
                    Statics.field2973.method3349(Statics.field2972);
                    Statics.field2973.method3353(Statics.field163, Statics.field2978);
                    field2974 = 0;
                    Statics.field163 = null;
                    Statics.field2976 = null;
                    Statics.field2975 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2973.method3354();
            field2974 = 0;
            Statics.field163 = null;
            Statics.field2976 = null;
            Statics.field2975 = null;
        }
        return false;
    }
}
