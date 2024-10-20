package deob;

@ObfuscatedName("gg")
public class class184 {

    @ObfuscatedName("gg.e")
    public static int field2969 = 0;

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.w(Lfx;Lfx;Lfx;Lgq;B)Z")
    public static boolean method2648(class168 arg0, class168 arg1, class168 arg2, class185 arg3) {
        Statics.field2970 = arg0;
        Statics.field2966 = arg1;
        Statics.field2967 = arg2;
        Statics.field2968 = arg3;
        return true;
    }

    @ObfuscatedName("ag.x(Lfx;IIIZB)V")
    public static void method800(class168 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2969 = 1;
        Statics.field2280 = arg0;
        Statics.field1359 = arg1;
        Statics.field2965 = arg2;
        Statics.field2971 = arg3;
        Statics.field226 = arg4;
        Statics.field1385 = 10000;
    }

    @ObfuscatedName("fz.t(IB)V")
    public static void method3337(int arg0) {
        if (field2969 == 0) {
            Statics.field2968.method3400(arg0);
        } else {
            Statics.field2971 = arg0;
        }
    }

    @ObfuscatedName("bd.e(II)V")
    public static void method1097(int arg0) {
        field2969 = 1;
        Statics.field2280 = null;
        Statics.field1359 = -1;
        Statics.field2965 = -1;
        Statics.field2971 = 0;
        Statics.field226 = false;
        Statics.field1385 = arg0;
    }
}
