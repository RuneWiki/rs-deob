package deob;

@ObfuscatedName("fa")
public class class162 {

    @ObfuscatedName("fa.k")
    public static int field2729 = 0;

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.g(Let;Let;Let;Lfo;S)Z")
    public static boolean method2350(class147 arg0, class147 arg1, class147 arg2, class163 arg3) {
        Statics.field2735 = arg0;
        Statics.field2730 = arg1;
        Statics.field2731 = arg2;
        Statics.field2732 = arg3;
        return true;
    }

    @ObfuscatedName("eb.s(Let;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method2834(class147 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2656(arg1);
        int var6 = arg0.method2679(var5, arg2);
        method1821(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("cu.v(Let;IIIZI)V")
    public static void method1821(class147 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2729 = 1;
        Statics.field2508 = arg0;
        Statics.field1539 = arg1;
        Statics.field2734 = arg2;
        Statics.field2738 = arg3;
        Statics.field71 = arg4;
        Statics.field2509 = 10000;
    }

    @ObfuscatedName("ct.o(IB)V")
    public static void method2028(int arg0) {
        if (field2729 == 0) {
            Statics.field2732.method3026(arg0);
        } else {
            Statics.field2738 = arg0;
        }
    }

    @ObfuscatedName("en.k(B)V")
    public static void method2843() {
        Statics.field2732.method2993();
        field2729 = 1;
        Statics.field2508 = null;
    }

    @ObfuscatedName("bu.m(ILet;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method1352(int arg0, class147 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2656(arg2);
        int var7 = arg1.method2679(var6, arg3);
        field2729 = 1;
        Statics.field2508 = arg1;
        Statics.field1539 = var6;
        Statics.field2734 = var7;
        Statics.field2738 = arg4;
        Statics.field71 = arg5;
        Statics.field2509 = arg0;
    }

    @ObfuscatedName("ce.i(IB)V")
    public static void method1736(int arg0) {
        field2729 = 1;
        Statics.field2508 = null;
        Statics.field1539 = -1;
        Statics.field2734 = -1;
        Statics.field2738 = 0;
        Statics.field71 = false;
        Statics.field2509 = arg0;
    }

    @ObfuscatedName("a.t(B)V")
    public static void method497() {
        try {
            if (field2729 == 1) {
                int var0 = Statics.field2732.method3031();
                if (var0 > 0 && Statics.field2732.method3065()) {
                    int var1 = var0 - Statics.field2509;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2732.method3026(var1);
                    return;
                }
                Statics.field2732.method2993();
                Statics.field2732.method2991();
                if (Statics.field2508 == null) {
                    field2729 = 0;
                } else {
                    field2729 = 2;
                }
                Statics.field2736 = null;
                Statics.field1850 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2732.method2993();
            field2729 = 0;
            Statics.field2736 = null;
            Statics.field1850 = null;
            Statics.field2508 = null;
        }
    }

    @ObfuscatedName("am.l(I)Z")
    public static boolean method681() {
        try {
            if (field2729 == 2) {
                if (Statics.field2736 == null) {
                    Statics.field2736 = class159.method2895(Statics.field2508, Statics.field1539, Statics.field2734);
                    if (Statics.field2736 == null) {
                        return false;
                    }
                }
                if (Statics.field1850 == null) {
                    Statics.field1850 = new class53(Statics.field2731, Statics.field2730);
                }
                if (Statics.field2732.method2989(Statics.field2736, Statics.field2735, Statics.field1850, 22050)) {
                    Statics.field2732.method2990();
                    Statics.field2732.method3026(Statics.field2738);
                    Statics.field2732.method2992(Statics.field2736, Statics.field71);
                    field2729 = 0;
                    Statics.field2736 = null;
                    Statics.field1850 = null;
                    Statics.field2508 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2732.method2993();
            field2729 = 0;
            Statics.field2736 = null;
            Statics.field1850 = null;
            Statics.field2508 = null;
        }
        return false;
    }
}
