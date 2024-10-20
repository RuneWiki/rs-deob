package deob;

@ObfuscatedName("gk")
public class class205 {

    @ObfuscatedName("gk.x")
    public static int field2508 = 0;

    public class205() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cm.j(Lia;Lia;Lia;Lgx;I)Z")
    public static boolean method1487(class237 arg0, class237 arg1, class237 arg2, class206 arg3) {
        Statics.field2504 = arg0;
        Statics.field2500 = arg1;
        Statics.field2501 = arg2;
        Statics.field2502 = arg3;
        return true;
    }

    @ObfuscatedName("ai.h(Lia;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method657(class237 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3789(arg1);
        int var6 = arg0.method3826(var5, arg2);
        method1033(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("bq.f(Lia;IIIZI)V")
    public static void method1033(class237 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2508 = 1;
        Statics.field2503 = arg0;
        Statics.field2206 = arg1;
        Statics.field2223 = arg2;
        Statics.field2505 = arg3;
        Statics.field1533 = arg4;
        Statics.field2506 = 10000;
    }

    @ObfuscatedName("hk.p(II)V")
    public static void method3755(int arg0) {
        if (field2508 == 0) {
            Statics.field2502.method3406(arg0);
        } else {
            Statics.field2505 = arg0;
        }
    }

    @ObfuscatedName("z.x(ILia;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method155(int arg0, class237 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3789(arg2);
        int var7 = arg1.method3826(var6, arg3);
        field2508 = 1;
        Statics.field2503 = arg1;
        Statics.field2206 = var6;
        Statics.field2223 = var7;
        Statics.field2505 = arg4;
        Statics.field1533 = arg5;
        Statics.field2506 = arg0;
    }

    @ObfuscatedName("fv.g(I)Z")
    public static boolean method2762() {
        return field2508 == 0 ? Statics.field2502.method3412() : true;
    }

    @ObfuscatedName("ft.c(I)V")
    public static void method2816() {
        try {
            if (field2508 == 1) {
                int var0 = Statics.field2502.method3420();
                if (var0 > 0 && Statics.field2502.method3412()) {
                    int var1 = var0 - Statics.field2506;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2502.method3406(var1);
                    return;
                }
                Statics.field2502.method3460();
                Statics.field2502.method3409();
                if (Statics.field2503 == null) {
                    field2508 = 0;
                } else {
                    field2508 = 2;
                }
                Statics.field2507 = null;
                Statics.field2510 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2502.method3460();
            field2508 = 0;
            Statics.field2507 = null;
            Statics.field2510 = null;
            Statics.field2503 = null;
        }
    }
}
