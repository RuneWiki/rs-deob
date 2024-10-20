package deob;

@ObfuscatedName("ej")
public class class137 {

    @ObfuscatedName("ej.r")
    public static int field2322 = 0;

    public class137() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.v(Ley;Ley;Ley;Lek;I)Z")
    public static boolean method194(class151 arg0, class151 arg1, class151 arg2, class140 arg3) {
        Statics.field2321 = arg0;
        Statics.field2319 = arg1;
        Statics.field2320 = arg2;
        Statics.field2318 = arg3;
        return true;
    }

    @ObfuscatedName("i.f(Ley;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method162(class151 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2976(arg1);
        int var6 = arg0.method3004(var5, arg2);
        method799(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("as.n(Ley;IIIZI)V")
    public static void method799(class151 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2322 = 1;
        Statics.field2323 = arg0;
        Statics.field2327 = arg1;
        Statics.field2325 = arg2;
        Statics.field2326 = arg3;
        Statics.field2328 = arg4;
        Statics.field2332 = 10000;
    }

    @ObfuscatedName("cn.c(IB)V")
    public static void method1600(int arg0) {
        if (field2322 == 0) {
            Statics.field2318.method2771(arg0);
        } else {
            Statics.field2326 = arg0;
        }
    }

    @ObfuscatedName("q.r(B)V")
    public static void method51() {
        Statics.field2318.method2726();
        field2322 = 1;
        Statics.field2323 = null;
    }

    @ObfuscatedName("r.k(ILey;IIIZB)V")
    public static void method35(int arg0, class151 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2322 = 1;
        Statics.field2323 = arg1;
        Statics.field2327 = arg2;
        Statics.field2325 = arg3;
        Statics.field2326 = arg4;
        Statics.field2328 = arg5;
        Statics.field2332 = arg0;
    }

    @ObfuscatedName("ex.e(I)V")
    public static void method2879() {
        try {
            if (field2322 == 1) {
                int var0 = Statics.field2318.method2816();
                if (var0 > 0 && Statics.field2318.method2793()) {
                    int var1 = var0 - Statics.field2332;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2318.method2771(var1);
                    return;
                }
                Statics.field2318.method2726();
                Statics.field2318.method2724();
                if (Statics.field2323 == null) {
                    field2322 = 0;
                } else {
                    field2322 = 2;
                }
                Statics.field195 = null;
                Statics.field1249 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2318.method2726();
            field2322 = 0;
            Statics.field195 = null;
            Statics.field1249 = null;
            Statics.field2323 = null;
        }
    }
}
