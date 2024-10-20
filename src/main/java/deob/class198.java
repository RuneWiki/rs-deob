package deob;

@ObfuscatedName("gi")
public class class198 {

    @ObfuscatedName("gi.u")
    public static int field2379 = 0;

    public class198() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hh.s(Lhz;Lhz;Lhz;Lgp;I)Z")
    public static boolean method3753(class234 arg0, class234 arg1, class234 arg2, class199 arg3) {
        Statics.field2389 = arg0;
        Statics.field2380 = arg1;
        Statics.field2381 = arg2;
        Statics.field2382 = arg3;
        return true;
    }

    @ObfuscatedName("gq.j(Lhz;IIIZI)V")
    public static void method3335(class234 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2379 = 1;
        Statics.field195 = arg0;
        Statics.field2387 = arg1;
        Statics.field2384 = arg2;
        Statics.field223 = arg3;
        Statics.field1243 = arg4;
        Statics.field99 = 10000;
    }

    @ObfuscatedName("cg.i(IB)V")
    public static void method2035(int arg0) {
        if (field2379 == 0) {
            Statics.field2382.method3421(arg0);
        } else {
            Statics.field223 = arg0;
        }
    }

    @ObfuscatedName("cp.k(ILhz;IIIZI)V")
    public static void method1920(int arg0, class234 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2379 = 1;
        Statics.field195 = arg1;
        Statics.field2387 = arg2;
        Statics.field2384 = arg3;
        Statics.field223 = arg4;
        Statics.field1243 = arg5;
        Statics.field99 = arg0;
    }

    @ObfuscatedName("ad.u(II)V")
    public static void method670(int arg0) {
        field2379 = 1;
        Statics.field195 = null;
        Statics.field2387 = -1;
        Statics.field2384 = -1;
        Statics.field223 = 0;
        Statics.field1243 = false;
        Statics.field99 = arg0;
    }
}
