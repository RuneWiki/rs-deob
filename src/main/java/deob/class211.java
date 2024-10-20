package deob;

@ObfuscatedName("hb")
public class class211 {

    @ObfuscatedName("hb.v")
    public static int field2595 = 0;

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.m(Lik;Lik;Lik;Lhp;I)Z")
    public static boolean method191(class243 arg0, class243 arg1, class243 arg2, class212 arg3) {
        Statics.field2601 = arg0;
        Statics.field3811 = arg1;
        Statics.field2598 = arg2;
        Statics.field2597 = arg3;
        return true;
    }

    @ObfuscatedName("n.p(Lik;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method46(class243 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3985(arg1);
        int var6 = arg0.method3947(var5, arg2);
        method3245(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("gm.i(Lik;IIIZB)V")
    public static void method3245(class243 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2595 = 1;
        Statics.field2517 = arg0;
        Statics.field2599 = arg1;
        Statics.field2600 = arg2;
        Statics.field486 = arg3;
        Statics.field2596 = arg4;
        Statics.field585 = 10000;
    }

    @ObfuscatedName("dw.j(B)V")
    public static void method2290() {
        Statics.field2597.method3664();
        field2595 = 1;
        Statics.field2517 = null;
    }

    @ObfuscatedName("ah.v(II)V")
    public static void method511(int arg0) {
        field2595 = 1;
        Statics.field2517 = null;
        Statics.field2599 = -1;
        Statics.field2600 = -1;
        Statics.field486 = 0;
        Statics.field2596 = false;
        Statics.field585 = arg0;
    }

    @ObfuscatedName("ah.x(I)V")
    public static void method512() {
        try {
            if (field2595 == 1) {
                int var0 = Statics.field2597.method3567();
                if (var0 > 0 && Statics.field2597.method3573()) {
                    int var1 = var0 - Statics.field585;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2597.method3566(var1);
                    return;
                }
                Statics.field2597.method3664();
                Statics.field2597.method3570();
                if (Statics.field2517 == null) {
                    field2595 = 0;
                } else {
                    field2595 = 2;
                }
                Statics.field2602 = null;
                Statics.field540 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2597.method3664();
            field2595 = 0;
            Statics.field2602 = null;
            Statics.field540 = null;
            Statics.field2517 = null;
        }
    }
}
