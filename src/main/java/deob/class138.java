package deob;

@ObfuscatedName("el")
public class class138 {

    @ObfuscatedName("el.p")
    public static int field2328 = 0;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dt.a(Leb;IIIZI)V")
    public static void method2147(class152 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2328 = 1;
        Statics.field2325 = arg0;
        Statics.field2327 = arg1;
        Statics.field2716 = arg2;
        Statics.field2330 = arg3;
        Statics.field2024 = arg4;
        Statics.field2331 = 10000;
    }

    @ObfuscatedName("ey.x(IB)V")
    public static void method2660(int arg0) {
        if (field2328 == 0) {
            Statics.field174.method2778(arg0);
        } else {
            Statics.field2330 = arg0;
        }
    }

    @ObfuscatedName("dz.e(ILeb;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2388(int arg0, class152 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3003(arg2);
        int var7 = arg1.method2953(var6, arg3);
        method689(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("an.r(ILeb;IIIZI)V")
    public static void method689(int arg0, class152 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2328 = 1;
        Statics.field2325 = arg1;
        Statics.field2327 = arg2;
        Statics.field2716 = arg3;
        Statics.field2330 = arg4;
        Statics.field2024 = arg5;
        Statics.field2331 = arg0;
    }

    @ObfuscatedName("v.p(I)Z")
    public static boolean method201() {
        return field2328 == 0 ? Statics.field174.method2713() : true;
    }

    @ObfuscatedName("bh.n(I)V")
    public static void method1477() {
        try {
            if (field2328 == 1) {
                int var0 = Statics.field174.method2798();
                if (var0 > 0 && Statics.field174.method2713()) {
                    int var1 = var0 - Statics.field2331;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field174.method2778(var1);
                    return;
                }
                Statics.field174.method2712();
                Statics.field174.method2730();
                if (Statics.field2325 == null) {
                    field2328 = 0;
                } else {
                    field2328 = 2;
                }
                Statics.field2332 = null;
                Statics.field2821 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field174.method2712();
            field2328 = 0;
            Statics.field2332 = null;
            Statics.field2821 = null;
            Statics.field2325 = null;
        }
    }
}
