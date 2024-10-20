package deob;

@ObfuscatedName("gw")
public class class183 {

    @ObfuscatedName("gw.y")
    public static int field2948 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cl.a(Lfz;IIIZI)V")
    public static void method1958(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2948 = 1;
        Statics.field2947 = arg0;
        Statics.field2946 = arg1;
        Statics.field2949 = arg2;
        Statics.field2078 = arg3;
        Statics.field2950 = arg4;
        Statics.field1044 = 10000;
    }

    @ObfuscatedName("w.r(II)V")
    public static void method576(int arg0) {
        if (field2948 == 0) {
            Statics.field2943.method3377(arg0);
        } else {
            Statics.field2078 = arg0;
        }
    }

    @ObfuscatedName("q.f(ILfz;Ljava/lang/String;Ljava/lang/String;IZS)V")
    public static void method569(int arg0, class167 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3040(arg2);
        int var7 = arg1.method3090(var6, arg3);
        method713(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("am.s(ILfz;IIIZI)V")
    public static void method713(int arg0, class167 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2948 = 1;
        Statics.field2947 = arg1;
        Statics.field2946 = arg2;
        Statics.field2949 = arg3;
        Statics.field2078 = arg4;
        Statics.field2950 = arg5;
        Statics.field1044 = arg0;
    }

    @ObfuscatedName("eb.y(IB)V")
    public static void method2941(int arg0) {
        field2948 = 1;
        Statics.field2947 = null;
        Statics.field2946 = -1;
        Statics.field2949 = -1;
        Statics.field2078 = 0;
        Statics.field2950 = false;
        Statics.field1044 = arg0;
    }

    @ObfuscatedName("an.e(I)Z")
    public static boolean method880() {
        return field2948 == 0 ? Statics.field2943.method3408() : true;
    }

    @ObfuscatedName("eo.g(I)V")
    public static void method2935() {
        try {
            if (field2948 == 1) {
                int var0 = Statics.field2943.method3378();
                if (var0 > 0 && Statics.field2943.method3408()) {
                    int var1 = var0 - Statics.field1044;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2943.method3377(var1);
                    return;
                }
                Statics.field2943.method3382();
                Statics.field2943.method3418();
                if (Statics.field2947 == null) {
                    field2948 = 0;
                } else {
                    field2948 = 2;
                }
                Statics.field2951 = null;
                Statics.field2122 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2943.method3382();
            field2948 = 0;
            Statics.field2951 = null;
            Statics.field2122 = null;
            Statics.field2947 = null;
        }
    }
}
