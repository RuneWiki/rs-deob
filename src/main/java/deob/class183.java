package deob;

@ObfuscatedName("gh")
public class class183 {

    @ObfuscatedName("gh.q")
    public static int field2946 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.o(Lfd;Lfd;Lfd;Lgl;I)Z")
    public static boolean method1426(class167 arg0, class167 arg1, class167 arg2, class184 arg3) {
        Statics.field2945 = arg0;
        Statics.field2944 = arg1;
        Statics.field2947 = arg2;
        Statics.field3197 = arg3;
        return true;
    }

    @ObfuscatedName("l.f(Lfd;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method134(class167 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2989(arg1);
        int var6 = arg0.method2990(var5, arg2);
        method3076(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ft.i(Lfd;IIIZB)V")
    public static void method3076(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2946 = 1;
        Statics.field714 = arg0;
        Statics.field2943 = arg1;
        Statics.field2024 = arg2;
        Statics.field2948 = arg3;
        Statics.field2061 = arg4;
        Statics.field72 = 10000;
    }

    @ObfuscatedName("cu.h(II)V")
    public static void method1976(int arg0) {
        if (field2946 == 0) {
            Statics.field3197.method3314(arg0);
        } else {
            Statics.field2948 = arg0;
        }
    }

    @ObfuscatedName("ds.q(ILfd;IIIZI)V")
    public static void method2169(int arg0, class167 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2946 = 1;
        Statics.field714 = arg1;
        Statics.field2943 = arg2;
        Statics.field2024 = arg3;
        Statics.field2948 = arg4;
        Statics.field2061 = arg5;
        Statics.field72 = arg0;
    }
}
