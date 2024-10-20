package deob;

@ObfuscatedName("el")
public class class138 {

    @ObfuscatedName("el.e")
    public static int field2329 = 0;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cr.j(Lez;Lez;Lez;Leg;I)Z")
    public static boolean method2041(class152 arg0, class152 arg1, class152 arg2, class141 arg3) {
        Statics.field2325 = arg0;
        Statics.field2321 = arg1;
        Statics.field2323 = arg2;
        Statics.field2320 = arg3;
        return true;
    }

    @ObfuscatedName("f.r(Lez;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method149(class152 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2974(arg1);
        int var6 = arg0.method2975(var5, arg2);
        method1408(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("bt.v(Lez;IIIZI)V")
    public static void method1408(class152 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2329 = 1;
        Statics.field2327 = arg0;
        Statics.field258 = arg1;
        Statics.field2324 = arg2;
        Statics.field2326 = arg3;
        Statics.field2322 = arg4;
        Statics.field2328 = 10000;
    }

    @ObfuscatedName("ac.p(B)V")
    public static void method777() {
        Statics.field2320.method2726();
        field2329 = 1;
        Statics.field2327 = null;
    }

    @ObfuscatedName("cu.e(ILez;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2043(int arg0, class152 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2974(arg2);
        int var7 = arg1.method2975(var6, arg3);
        field2329 = 1;
        Statics.field2327 = arg1;
        Statics.field258 = var6;
        Statics.field2324 = var7;
        Statics.field2326 = arg4;
        Statics.field2322 = arg5;
        Statics.field2328 = arg0;
    }

    @ObfuscatedName("p.d(IB)V")
    public static void method33(int arg0) {
        field2329 = 1;
        Statics.field2327 = null;
        Statics.field258 = -1;
        Statics.field2324 = -1;
        Statics.field2326 = 0;
        Statics.field2322 = false;
        Statics.field2328 = arg0;
    }

    @ObfuscatedName("ej.y(B)Z")
    public static boolean method2682() {
        return field2329 == 0 ? Statics.field2320.method2727() : true;
    }

    @ObfuscatedName("cu.x(I)V")
    public static void method2044() {
        try {
            if (field2329 == 1) {
                int var0 = Statics.field2320.method2721();
                if (var0 > 0 && Statics.field2320.method2727()) {
                    int var1 = var0 - Statics.field2328;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2320.method2748(var1);
                    return;
                }
                Statics.field2320.method2726();
                Statics.field2320.method2807();
                if (Statics.field2327 == null) {
                    field2329 = 0;
                } else {
                    field2329 = 2;
                }
                Statics.field111 = null;
                Statics.field2330 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2320.method2726();
            field2329 = 0;
            Statics.field111 = null;
            Statics.field2330 = null;
            Statics.field2327 = null;
        }
    }
}
