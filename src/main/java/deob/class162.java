package deob;

@ObfuscatedName("fg")
public class class162 {

    @ObfuscatedName("fg.w")
    public static int field2729 = 0;

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.g(Leo;Leo;Leo;Lfd;B)Z")
    public static boolean method2(class147 arg0, class147 arg1, class147 arg2, class163 arg3) {
        Statics.field2727 = arg0;
        Statics.field2736 = arg1;
        Statics.field2728 = arg2;
        Statics.field2473 = arg3;
        return true;
    }

    @ObfuscatedName("ey.i(Leo;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2666(class147 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2699(arg1);
        int var6 = arg0.method2700(var5, arg2);
        method1832(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("cd.k(Leo;IIIZI)V")
    public static void method1832(class147 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2729 = 1;
        Statics.field2726 = arg0;
        Statics.field1247 = arg1;
        Statics.field2731 = arg2;
        Statics.field134 = arg3;
        Statics.field2730 = arg4;
        Statics.field1063 = 10000;
    }

    @ObfuscatedName("dv.e(II)V")
    public static void method2508(int arg0) {
        field2729 = 1;
        Statics.field2726 = null;
        Statics.field1247 = -1;
        Statics.field2731 = -1;
        Statics.field134 = 0;
        Statics.field2730 = false;
        Statics.field1063 = arg0;
    }

    @ObfuscatedName("eq.w(I)Z")
    public static boolean method2861() {
        return field2729 == 0 ? Statics.field2473.method3025() : true;
    }

    @ObfuscatedName("ed.m(I)V")
    public static void method2651() {
        try {
            if (field2729 == 1) {
                int var0 = Statics.field2473.method3071();
                if (var0 > 0 && Statics.field2473.method3025()) {
                    int var1 = var0 - Statics.field1063;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2473.method3066(var1);
                    return;
                }
                Statics.field2473.method3024();
                Statics.field2473.method3040();
                if (Statics.field2726 == null) {
                    field2729 = 0;
                } else {
                    field2729 = 2;
                }
                Statics.field2165 = null;
                Statics.field2732 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2473.method3024();
            field2729 = 0;
            Statics.field2165 = null;
            Statics.field2732 = null;
            Statics.field2726 = null;
        }
    }

    @ObfuscatedName("dw.u(I)Z")
    public static boolean method2573() {
        try {
            if (field2729 == 2) {
                if (Statics.field2165 == null) {
                    Statics.field2165 = class159.method2931(Statics.field2726, Statics.field1247, Statics.field2731);
                    if (Statics.field2165 == null) {
                        return false;
                    }
                }
                if (Statics.field2732 == null) {
                    Statics.field2732 = new class53(Statics.field2728, Statics.field2736);
                }
                if (Statics.field2473.method3020(Statics.field2165, Statics.field2727, Statics.field2732, 22050)) {
                    Statics.field2473.method3021();
                    Statics.field2473.method3066(Statics.field134);
                    Statics.field2473.method3023(Statics.field2165, Statics.field2730);
                    field2729 = 0;
                    Statics.field2165 = null;
                    Statics.field2732 = null;
                    Statics.field2726 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2473.method3024();
            field2729 = 0;
            Statics.field2165 = null;
            Statics.field2732 = null;
            Statics.field2726 = null;
        }
        return false;
    }
}
