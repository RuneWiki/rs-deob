package deob;

@ObfuscatedName("gs")
public class class207 {

    @ObfuscatedName("gs.p")
    public static int field2440 = 0;

    public class207() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("av.m(Lic;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method556(class244 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3909(arg1);
        int var6 = arg0.method3910(var5, arg2);
        method3192(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ft.o(Lic;IIIZB)V")
    public static void method3192(class244 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2440 = 1;
        Statics.field2544 = arg0;
        Statics.field2437 = arg1;
        Statics.field2040 = arg2;
        Statics.field2442 = arg3;
        Statics.field3914 = arg4;
        Statics.field2443 = 10000;
    }

    @ObfuscatedName("cp.q(I)V")
    public static void method1954() {
        Statics.field257.method3504();
        field2440 = 1;
        Statics.field2544 = null;
    }

    @ObfuscatedName("ae.j(ILic;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method277(int arg0, class244 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3909(arg2);
        int var7 = arg1.method3910(var6, arg3);
        method1963(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("cu.p(ILic;IIIZI)V")
    public static void method1963(int arg0, class244 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2440 = 1;
        Statics.field2544 = arg1;
        Statics.field2437 = arg2;
        Statics.field2040 = arg3;
        Statics.field2442 = arg4;
        Statics.field3914 = arg5;
        Statics.field2443 = arg0;
    }

    @ObfuscatedName("ah.g(I)Z")
    public static boolean method222() {
        return field2440 == 0 ? Statics.field257.method3480() : true;
    }
}
