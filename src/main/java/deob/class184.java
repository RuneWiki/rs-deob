package deob;

@ObfuscatedName("gd")
public class class184 {

    @ObfuscatedName("gd.z")
    public static int field2982 = 0;

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gq.t(Lfp;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method3443(class168 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3017(arg1);
        int var6 = arg0.method3018(var5, arg2);
        method2084(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("cz.i(Lfp;IIIZI)V")
    public static void method2084(class168 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2982 = 1;
        Statics.field615 = arg0;
        Statics.field2205 = arg1;
        Statics.field2978 = arg2;
        Statics.field2287 = arg3;
        Statics.field695 = arg4;
        Statics.field2981 = 10000;
    }

    @ObfuscatedName("fb.g(I)V")
    public static void method3137() {
        Statics.field2977.method3347();
        field2982 = 1;
        Statics.field615 = null;
    }

    @ObfuscatedName("fu.h(ILfp;IIIZB)V")
    public static void method2924(int arg0, class168 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2982 = 1;
        Statics.field615 = arg1;
        Statics.field2205 = arg2;
        Statics.field2978 = arg3;
        Statics.field2287 = arg4;
        Statics.field695 = arg5;
        Statics.field2981 = arg0;
    }

    @ObfuscatedName("q.z(II)V")
    public static void method540(int arg0) {
        field2982 = 1;
        Statics.field615 = null;
        Statics.field2205 = -1;
        Statics.field2978 = -1;
        Statics.field2287 = 0;
        Statics.field695 = false;
        Statics.field2981 = arg0;
    }

    @ObfuscatedName("cs.r(I)Z")
    public static boolean method1999() {
        return field2982 == 0 ? Statics.field2977.method3327() : true;
    }

    @ObfuscatedName("dr.f(I)Z")
    public static boolean method2508() {
        try {
            if (field2982 == 2) {
                if (Statics.field2975 == null) {
                    Statics.field2975 = class181.method3237(Statics.field615, Statics.field2205, Statics.field2978);
                    if (Statics.field2975 == null) {
                        return false;
                    }
                }
                if (Statics.field591 == null) {
                    Statics.field591 = new class60(Statics.field2976, Statics.field1573);
                }
                if (Statics.field2977.method3322(Statics.field2975, Statics.field2979, Statics.field591, 22050)) {
                    Statics.field2977.method3411();
                    Statics.field2977.method3369(Statics.field2287);
                    Statics.field2977.method3357(Statics.field2975, Statics.field695);
                    field2982 = 0;
                    Statics.field2975 = null;
                    Statics.field591 = null;
                    Statics.field615 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2977.method3347();
            field2982 = 0;
            Statics.field2975 = null;
            Statics.field591 = null;
            Statics.field615 = null;
        }
        return false;
    }
}
