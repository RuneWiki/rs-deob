package deob;

@ObfuscatedName("fw")
public class class174 {

    @ObfuscatedName("fw.t")
    public static int field2874 = 0;

    public class174() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.y(Lfd;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method2735(class158 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2888(arg1);
        int var6 = arg0.method2889(var5, arg2);
        method2487(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("da.k(Lfd;IIIZI)V")
    public static void method2487(class158 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2874 = 1;
        Statics.field2875 = arg0;
        Statics.field214 = arg1;
        Statics.field2826 = arg2;
        Statics.field2152 = arg3;
        Statics.field579 = arg4;
        Statics.field2876 = 10000;
    }

    @ObfuscatedName("ek.g(IB)V")
    public static void method2737(int arg0) {
        if (field2874 == 0) {
            Statics.field730.method3208(arg0);
        } else {
            Statics.field2152 = arg0;
        }
    }

    @ObfuscatedName("ee.n(S)V")
    public static void method2786() {
        Statics.field730.method3214();
        field2874 = 1;
        Statics.field2875 = null;
    }

    @ObfuscatedName("el.t(ILfd;IIIZI)V")
    public static void method2788(int arg0, class158 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2874 = 1;
        Statics.field2875 = arg1;
        Statics.field214 = arg2;
        Statics.field2826 = arg3;
        Statics.field2152 = arg4;
        Statics.field579 = arg5;
        Statics.field2876 = arg0;
    }

    @ObfuscatedName("f.e(IB)V")
    public static void method115(int arg0) {
        field2874 = 1;
        Statics.field2875 = null;
        Statics.field214 = -1;
        Statics.field2826 = -1;
        Statics.field2152 = 0;
        Statics.field579 = false;
        Statics.field2876 = arg0;
    }

    @ObfuscatedName("el.q(B)V")
    public static void method2789() {
        try {
            if (field2874 == 1) {
                int var0 = Statics.field730.method3254();
                if (var0 > 0 && Statics.field730.method3275()) {
                    int var1 = var0 - Statics.field2876;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field730.method3208(var1);
                    return;
                }
                Statics.field730.method3214();
                Statics.field730.method3212();
                if (Statics.field2875 == null) {
                    field2874 = 0;
                } else {
                    field2874 = 2;
                }
                Statics.field2090 = null;
                Statics.field605 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field730.method3214();
            field2874 = 0;
            Statics.field2090 = null;
            Statics.field605 = null;
            Statics.field2875 = null;
        }
    }
}
