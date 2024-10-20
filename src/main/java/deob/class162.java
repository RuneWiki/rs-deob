package deob;

@ObfuscatedName("fa")
public class class162 {

    @ObfuscatedName("fa.u")
    public static int field2718 = 0;

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ei.g(Leh;Leh;Leh;Lfb;B)Z")
    public static boolean method2858(class147 arg0, class147 arg1, class147 arg2, class163 arg3) {
        Statics.field2721 = arg0;
        Statics.field2715 = arg1;
        Statics.field2716 = arg2;
        Statics.field2522 = arg3;
        return true;
    }

    @ObfuscatedName("ac.s(Leh;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method739(class147 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2682(arg1);
        int var6 = arg0.method2683(var5, arg2);
        method1421(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("bt.h(Leh;IIIZB)V")
    public static void method1421(class147 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2718 = 1;
        Statics.field560 = arg0;
        Statics.field2723 = arg1;
        Statics.field2663 = arg2;
        Statics.field2719 = arg3;
        Statics.field2714 = arg4;
        Statics.field2720 = 10000;
    }

    @ObfuscatedName("ag.m(IB)V")
    public static void method810(int arg0) {
        if (field2718 == 0) {
            Statics.field2522.method3004(arg0);
        } else {
            Statics.field2719 = arg0;
        }
    }

    @ObfuscatedName("cj.u(I)V")
    public static void method1755() {
        Statics.field2522.method3010();
        field2718 = 1;
        Statics.field560 = null;
    }

    @ObfuscatedName("bx.j(ILeh;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1308(int arg0, class147 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2682(arg2);
        int var7 = arg1.method2683(var6, arg3);
        field2718 = 1;
        Statics.field560 = arg1;
        Statics.field2723 = var6;
        Statics.field2663 = var7;
        Statics.field2719 = arg4;
        Statics.field2714 = arg5;
        Statics.field2720 = arg0;
    }
}
