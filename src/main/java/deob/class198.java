package deob;

@ObfuscatedName("gv")
public class class198 {

    @ObfuscatedName("gv.l")
    public static int field2377 = 0;

    public class198() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gh.c(Lhz;Lhz;Lhz;Lgt;I)Z")
    public static boolean method3385(class234 arg0, class234 arg1, class234 arg2, class199 arg3) {
        Statics.field2375 = arg0;
        Statics.field2374 = arg1;
        Statics.field2378 = arg2;
        Statics.field2376 = arg3;
        return true;
    }

    @ObfuscatedName("ex.x(Lhz;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method3137(class234 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3843(arg1);
        int var6 = arg0.method3865(var5, arg2);
        method700(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("am.t(Lhz;IIIZI)V")
    public static void method700(class234 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2377 = 1;
        Statics.field2373 = arg0;
        Statics.field2379 = arg1;
        Statics.field2380 = arg2;
        Statics.field396 = arg3;
        Statics.field564 = arg4;
        Statics.field1834 = 10000;
    }

    @ObfuscatedName("de.g(II)V")
    public static void method2322(int arg0) {
        if (field2377 == 0) {
            Statics.field2376.method3416(arg0);
        } else {
            Statics.field396 = arg0;
        }
    }

    @ObfuscatedName("hv.l(B)V")
    public static void method3802() {
        Statics.field2376.method3422();
        field2377 = 1;
        Statics.field2373 = null;
    }

    @ObfuscatedName("bo.u(ILhz;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1556(int arg0, class234 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3843(arg2);
        int var7 = arg1.method3865(var6, arg3);
        field2377 = 1;
        Statics.field2373 = arg1;
        Statics.field2379 = var6;
        Statics.field2380 = var7;
        Statics.field396 = arg4;
        Statics.field564 = arg5;
        Statics.field1834 = arg0;
    }

    @ObfuscatedName("es.j(IB)V")
    public static void method3033(int arg0) {
        field2377 = 1;
        Statics.field2373 = null;
        Statics.field2379 = -1;
        Statics.field2380 = -1;
        Statics.field396 = 0;
        Statics.field564 = false;
        Statics.field1834 = arg0;
    }
}
