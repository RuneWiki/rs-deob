package deob;

@ObfuscatedName("hc")
public class class230 {

    @ObfuscatedName("hc.e")
    public static int field2695 = 0;

    public class230() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ga.d(Ljk;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method3176(class262 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method4290(arg1);
        int var6 = arg0.method4292(var5, arg2);
        method992(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("bb.z(Ljk;IIIZI)V")
    public static void method992(class262 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2695 = 1;
        Statics.field2688 = arg0;
        Statics.field2692 = arg1;
        Statics.field1332 = arg2;
        Statics.field2693 = arg3;
        Statics.field507 = arg4;
        Statics.field3700 = 10000;
    }

    @ObfuscatedName("gj.n(II)V")
    public static void method3225(int arg0) {
        if (field2695 == 0) {
            Statics.field2691.method3942(arg0);
        } else {
            Statics.field2693 = arg0;
        }
    }

    @ObfuscatedName("gp.r(B)V")
    public static void method3514() {
        Statics.field2691.method3913();
        field2695 = 1;
        Statics.field2688 = null;
    }

    @ObfuscatedName("ii.e(ILjk;IIIZI)V")
    public static void method4241(int arg0, class262 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2695 = 1;
        Statics.field2688 = arg1;
        Statics.field2692 = arg2;
        Statics.field1332 = arg3;
        Statics.field2693 = arg4;
        Statics.field507 = arg5;
        Statics.field3700 = arg0;
    }

    @ObfuscatedName("bt.y(I)V")
    public static void method881() {
        try {
            if (field2695 == 1) {
                int var0 = Statics.field2691.method3935();
                if (var0 > 0 && Statics.field2691.method3920()) {
                    int var1 = var0 - Statics.field3700;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2691.method3942(var1);
                    return;
                }
                Statics.field2691.method3913();
                Statics.field2691.method3911();
                if (Statics.field2688 == null) {
                    field2695 = 0;
                } else {
                    field2695 = 2;
                }
                Statics.field37 = null;
                Statics.field2501 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2691.method3913();
            field2695 = 0;
            Statics.field37 = null;
            Statics.field2501 = null;
            Statics.field2688 = null;
        }
    }

    @ObfuscatedName("bf.k(I)Z")
    public static boolean method921() {
        try {
            if (field2695 == 2) {
                if (Statics.field37 == null) {
                    Statics.field37 = class236.method4077(Statics.field2688, Statics.field2692, Statics.field1332);
                    if (Statics.field37 == null) {
                        return false;
                    }
                }
                if (Statics.field2501 == null) {
                    Statics.field2501 = new class111(Statics.field2690, Statics.field2694);
                }
                if (Statics.field2691.method3953(Statics.field37, Statics.field2689, Statics.field2501, 22050)) {
                    Statics.field2691.method3909();
                    Statics.field2691.method3942(Statics.field2693);
                    Statics.field2691.method3912(Statics.field37, Statics.field507);
                    field2695 = 0;
                    Statics.field37 = null;
                    Statics.field2501 = null;
                    Statics.field2688 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2691.method3913();
            field2695 = 0;
            Statics.field37 = null;
            Statics.field2501 = null;
            Statics.field2688 = null;
        }
        return false;
    }
}
