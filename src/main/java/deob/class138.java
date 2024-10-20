package deob;

@ObfuscatedName("er")
public class class138 {

    @ObfuscatedName("er.q")
    public static int field2315 = 0;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dr.x(Lej;IIIZI)V")
    public static void method2342(class152 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2315 = 1;
        Statics.field2384 = arg0;
        Statics.field1436 = arg1;
        Statics.field2316 = arg2;
        Statics.field2330 = arg3;
        Statics.field2043 = arg4;
        Statics.field2317 = 10000;
    }

    @ObfuscatedName("bm.p(I)V")
    public static void method1323() {
        Statics.field2313.method2771();
        field2315 = 1;
        Statics.field2384 = null;
    }

    @ObfuscatedName("q.k(ILej;IIIZB)V")
    public static void method31(int arg0, class152 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2315 = 1;
        Statics.field2384 = arg1;
        Statics.field1436 = arg2;
        Statics.field2316 = arg3;
        Statics.field2330 = arg4;
        Statics.field2043 = arg5;
        Statics.field2317 = arg0;
    }

    @ObfuscatedName("dh.a(II)V")
    public static void method2327(int arg0) {
        field2315 = 1;
        Statics.field2384 = null;
        Statics.field1436 = -1;
        Statics.field2316 = -1;
        Statics.field2330 = 0;
        Statics.field2043 = false;
        Statics.field2317 = arg0;
    }

    @ObfuscatedName("ae.q(I)Z")
    public static boolean method803() {
        return field2315 == 0 ? Statics.field2313.method2694() : true;
    }

    @ObfuscatedName("bp.j(B)V")
    public static void method1482() {
        try {
            if (field2315 == 1) {
                int var0 = Statics.field2313.method2688();
                if (var0 > 0 && Statics.field2313.method2694()) {
                    int var1 = var0 - Statics.field2317;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2313.method2687(var1);
                    return;
                }
                Statics.field2313.method2771();
                Statics.field2313.method2691();
                if (Statics.field2384 == null) {
                    field2315 = 0;
                } else {
                    field2315 = 2;
                }
                Statics.field15 = null;
                Statics.field2318 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2313.method2771();
            field2315 = 0;
            Statics.field15 = null;
            Statics.field2318 = null;
            Statics.field2384 = null;
        }
    }
}
