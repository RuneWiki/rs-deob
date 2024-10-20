package deob;

@ObfuscatedName("fh")
public class class162 {

    @ObfuscatedName("fh.h")
    public static int field2723 = 0;

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.k(Lei;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method2503(class147 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2743(arg1);
        int var6 = arg0.method2744(var5, arg2);
        method2875(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ef.y(Lei;IIIZB)V")
    public static void method2875(class147 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2723 = 1;
        Statics.field2725 = arg0;
        Statics.field2718 = arg1;
        Statics.field139 = arg2;
        Statics.field1807 = arg3;
        Statics.field1904 = arg4;
        Statics.field2724 = 10000;
    }

    @ObfuscatedName("q.s(I)V")
    public static void method464() {
        Statics.field2720.method3084();
        field2723 = 1;
        Statics.field2725 = null;
    }

    @ObfuscatedName("ag.g(IB)V")
    public static void method860(int arg0) {
        field2723 = 1;
        Statics.field2725 = null;
        Statics.field2718 = -1;
        Statics.field139 = -1;
        Statics.field1807 = 0;
        Statics.field1904 = false;
        Statics.field2724 = arg0;
    }

    @ObfuscatedName("cq.h(B)V")
    public static void method1982() {
        try {
            if (field2723 == 1) {
                int var0 = Statics.field2720.method3080();
                if (var0 > 0 && Statics.field2720.method3085()) {
                    int var1 = var0 - Statics.field2724;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2720.method3170(var1);
                    return;
                }
                Statics.field2720.method3084();
                Statics.field2720.method3104();
                if (Statics.field2725 == null) {
                    field2723 = 0;
                } else {
                    field2723 = 2;
                }
                Statics.field2680 = null;
                Statics.field235 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2720.method3084();
            field2723 = 0;
            Statics.field2680 = null;
            Statics.field235 = null;
            Statics.field2725 = null;
        }
    }

    @ObfuscatedName("ei.l(I)Z")
    public static boolean method2813() {
        try {
            if (field2723 == 2) {
                if (Statics.field2680 == null) {
                    Statics.field2680 = class159.method2985(Statics.field2725, Statics.field2718, Statics.field139);
                    if (Statics.field2680 == null) {
                        return false;
                    }
                }
                if (Statics.field235 == null) {
                    Statics.field235 = new class53(Statics.field2719, Statics.field2413);
                }
                if (Statics.field2720.method3122(Statics.field2680, Statics.field2726, Statics.field235, 22050)) {
                    Statics.field2720.method3081();
                    Statics.field2720.method3170(Statics.field1807);
                    Statics.field2720.method3155(Statics.field2680, Statics.field1904);
                    field2723 = 0;
                    Statics.field2680 = null;
                    Statics.field235 = null;
                    Statics.field2725 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2720.method3084();
            field2723 = 0;
            Statics.field2680 = null;
            Statics.field235 = null;
            Statics.field2725 = null;
        }
        return false;
    }
}
