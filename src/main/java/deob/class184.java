package deob;

@ObfuscatedName("gf")
public class class184 {

    @ObfuscatedName("gf.l")
    public static int field2954 = 0;

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.f(Lfl;Lfl;Lfl;Lgb;I)Z")
    public static boolean method189(class168 arg0, class168 arg1, class168 arg2, class185 arg3) {
        Statics.field2959 = arg0;
        Statics.field2953 = arg1;
        Statics.field2955 = arg2;
        Statics.field2956 = arg3;
        return true;
    }

    @ObfuscatedName("cd.u(Lfl;IIIZI)V")
    public static void method2099(class168 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2954 = 1;
        Statics.field583 = arg0;
        Statics.field590 = arg1;
        Statics.field3146 = arg2;
        Statics.field2957 = arg3;
        Statics.field584 = arg4;
        Statics.field2958 = 10000;
    }

    @ObfuscatedName("aq.x(B)V")
    public static void method780() {
        Statics.field2956.method3411();
        field2954 = 1;
        Statics.field583 = null;
    }

    @ObfuscatedName("u.b(IB)V")
    public static void method7(int arg0) {
        field2954 = 1;
        Statics.field583 = null;
        Statics.field590 = -1;
        Statics.field3146 = -1;
        Statics.field2957 = 0;
        Statics.field584 = false;
        Statics.field2958 = arg0;
    }

    @ObfuscatedName("fj.l(I)V")
    public static void method3254() {
        try {
            if (field2954 == 1) {
                int var0 = Statics.field2956.method3420();
                if (var0 > 0 && Statics.field2956.method3413()) {
                    int var1 = var0 - Statics.field2958;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2956.method3405(var1);
                    return;
                }
                Statics.field2956.method3411();
                Statics.field2956.method3409();
                if (Statics.field583 == null) {
                    field2954 = 0;
                } else {
                    field2954 = 2;
                }
                Statics.field2073 = null;
                Statics.field134 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2956.method3411();
            field2954 = 0;
            Statics.field2073 = null;
            Statics.field134 = null;
            Statics.field583 = null;
        }
    }
}
