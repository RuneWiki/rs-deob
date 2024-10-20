package deob;

@ObfuscatedName("fz")
public class class164 {

    @ObfuscatedName("fz.q")
    public static int field2732 = 0;

    public class164() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("co.e(Lep;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method2049(class149 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2735(arg1);
        int var6 = arg0.method2766(var5, arg2);
        method1775(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("cj.v(Lep;IIIZB)V")
    public static void method1775(class149 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2732 = 1;
        Statics.field1022 = arg0;
        Statics.field2032 = arg1;
        Statics.field226 = arg2;
        Statics.field2734 = arg3;
        Statics.field2733 = arg4;
        Statics.field61 = 10000;
    }

    @ObfuscatedName("dl.k(II)V")
    public static void method2354(int arg0) {
        if (field2732 == 0) {
            Statics.field2730.method3131(arg0);
        } else {
            Statics.field2734 = arg0;
        }
    }

    @ObfuscatedName("at.g(ILep;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method749(int arg0, class149 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2735(arg2);
        int var7 = arg1.method2766(var6, arg3);
        field2732 = 1;
        Statics.field1022 = arg1;
        Statics.field2032 = var6;
        Statics.field226 = var7;
        Statics.field2734 = arg4;
        Statics.field2733 = arg5;
        Statics.field61 = arg0;
    }

    @ObfuscatedName("at.q(II)V")
    public static void method750(int arg0) {
        field2732 = 1;
        Statics.field1022 = null;
        Statics.field2032 = -1;
        Statics.field226 = -1;
        Statics.field2734 = 0;
        Statics.field2733 = false;
        Statics.field61 = arg0;
    }

    @ObfuscatedName("dp.l(I)Z")
    public static boolean method2436() {
        return field2732 == 0 ? Statics.field2730.method3041() : true;
    }

    @ObfuscatedName("bj.a(I)V")
    public static void method1592() {
        try {
            if (field2732 == 1) {
                int var0 = Statics.field2730.method3036();
                if (var0 > 0 && Statics.field2730.method3041()) {
                    int var1 = var0 - Statics.field61;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2730.method3131(var1);
                    return;
                }
                Statics.field2730.method3062();
                Statics.field2730.method3039();
                if (Statics.field1022 == null) {
                    field2732 = 0;
                } else {
                    field2732 = 2;
                }
                Statics.field710 = null;
                Statics.field2735 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2730.method3062();
            field2732 = 0;
            Statics.field710 = null;
            Statics.field2735 = null;
            Statics.field1022 = null;
        }
    }

    @ObfuscatedName("v.b(I)Z")
    public static boolean method10() {
        try {
            if (field2732 == 2) {
                if (Statics.field710 == null) {
                    Statics.field710 = class161.method2949(Statics.field1022, Statics.field2032, Statics.field226);
                    if (Statics.field710 == null) {
                        return false;
                    }
                }
                if (Statics.field2735 == null) {
                    Statics.field2735 = new class54(Statics.field2729, Statics.field3013);
                }
                if (Statics.field2730.method3037(Statics.field710, Statics.field2731, Statics.field2735, 22050)) {
                    Statics.field2730.method3038();
                    Statics.field2730.method3131(Statics.field2734);
                    Statics.field2730.method3079(Statics.field710, Statics.field2733);
                    field2732 = 0;
                    Statics.field710 = null;
                    Statics.field2735 = null;
                    Statics.field1022 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2730.method3062();
            field2732 = 0;
            Statics.field710 = null;
            Statics.field2735 = null;
            Statics.field1022 = null;
        }
        return false;
    }
}
