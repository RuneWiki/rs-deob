package deob;

@ObfuscatedName("ft")
public class class164 {

    @ObfuscatedName("ft.w")
    public static int field2701 = 0;

    public class164() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.l(Leo;IIIZB)V")
    public static void method2101(class149 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2701 = 1;
        Statics.field2706 = arg0;
        Statics.field688 = arg1;
        Statics.field2702 = arg2;
        Statics.field1795 = arg3;
        Statics.field2707 = arg4;
        Statics.field2708 = 10000;
    }

    @ObfuscatedName("en.y(II)V")
    public static void method2615(int arg0) {
        if (field2701 == 0) {
            Statics.field2704.method3087(arg0);
        } else {
            Statics.field1795 = arg0;
        }
    }

    @ObfuscatedName("bu.g(I)V")
    public static void method1385() {
        Statics.field2704.method3136();
        field2701 = 1;
        Statics.field2706 = null;
    }

    @ObfuscatedName("fo.j(ILeo;IIIZI)V")
    public static void method3017(int arg0, class149 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2701 = 1;
        Statics.field2706 = arg1;
        Statics.field688 = arg2;
        Statics.field2702 = arg3;
        Statics.field1795 = arg4;
        Statics.field2707 = arg5;
        Statics.field2708 = arg0;
    }

    @ObfuscatedName("cf.w(II)V")
    public static void method1868(int arg0) {
        field2701 = 1;
        Statics.field2706 = null;
        Statics.field688 = -1;
        Statics.field2702 = -1;
        Statics.field1795 = 0;
        Statics.field2707 = false;
        Statics.field2708 = arg0;
    }

    @ObfuscatedName("cq.c(I)Z")
    public static boolean method1985() {
        return field2701 == 0 ? Statics.field2704.method3188() : true;
    }

    @ObfuscatedName("et.x(I)Z")
    public static boolean method2732() {
        try {
            if (field2701 == 2) {
                if (Statics.field2710 == null) {
                    Statics.field2710 = class161.method3005(Statics.field2706, Statics.field688, Statics.field2702);
                    if (Statics.field2710 == null) {
                        return false;
                    }
                }
                if (Statics.field582 == null) {
                    Statics.field582 = new class54(Statics.field2703, Statics.field2713);
                }
                if (Statics.field2704.method3093(Statics.field2710, Statics.field2709, Statics.field582, 22050)) {
                    Statics.field2704.method3090();
                    Statics.field2704.method3087(Statics.field1795);
                    Statics.field2704.method3086(Statics.field2710, Statics.field2707);
                    field2701 = 0;
                    Statics.field2710 = null;
                    Statics.field582 = null;
                    Statics.field2706 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2704.method3136();
            field2701 = 0;
            Statics.field2710 = null;
            Statics.field582 = null;
            Statics.field2706 = null;
        }
        return false;
    }
}
