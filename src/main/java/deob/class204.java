package deob;

@ObfuscatedName("gr")
public class class204 {

    @ObfuscatedName("gr.g")
    public static int field2499 = 0;

    public class204() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.i(Liy;Liy;Liy;Lgy;I)Z")
    public static boolean method37(class236 arg0, class236 arg1, class236 arg2, class205 arg3) {
        Statics.field2497 = arg0;
        Statics.field2504 = arg1;
        Statics.field2503 = arg2;
        Statics.field502 = arg3;
        return true;
    }

    @ObfuscatedName("dd.h(Liy;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2198(class236 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3851(arg1);
        int var6 = arg0.method3852(var5, arg2);
        method291(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("aj.u(Liy;IIIZB)V")
    public static void method291(class236 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2499 = 1;
        Statics.field3381 = arg0;
        Statics.field2326 = arg1;
        Statics.field2500 = arg2;
        Statics.field2501 = arg3;
        Statics.field2496 = arg4;
        Statics.field2502 = 10000;
    }

    @ObfuscatedName("p.q(II)V")
    public static void method24(int arg0) {
        if (field2499 == 0) {
            Statics.field502.method3470(arg0);
        } else {
            Statics.field2501 = arg0;
        }
    }

    @ObfuscatedName("x.g(ILiy;IIIZI)V")
    public static void method55(int arg0, class236 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2499 = 1;
        Statics.field3381 = arg1;
        Statics.field2326 = arg2;
        Statics.field2500 = arg3;
        Statics.field2501 = arg4;
        Statics.field2496 = arg5;
        Statics.field2502 = arg0;
    }

    @ObfuscatedName("n.v(I)Z")
    public static boolean method141() {
        return field2499 == 0 ? Statics.field502.method3530() : true;
    }

    @ObfuscatedName("d.t(I)V")
    public static void method118() {
        try {
            if (field2499 == 1) {
                int var0 = Statics.field502.method3471();
                if (var0 > 0 && Statics.field502.method3530()) {
                    int var1 = var0 - Statics.field2502;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field502.method3470(var1);
                    return;
                }
                Statics.field502.method3508();
                Statics.field502.method3474();
                if (Statics.field3381 == null) {
                    field2499 = 0;
                } else {
                    field2499 = 2;
                }
                Statics.field2498 = null;
                Statics.field3378 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field502.method3508();
            field2499 = 0;
            Statics.field2498 = null;
            Statics.field3378 = null;
            Statics.field3381 = null;
        }
    }

    @ObfuscatedName("cx.p(I)Z")
    public static boolean method1608() {
        try {
            if (field2499 == 2) {
                if (Statics.field2498 == null) {
                    Statics.field2498 = class210.method3659(Statics.field3381, Statics.field2326, Statics.field2500);
                    if (Statics.field2498 == null) {
                        return false;
                    }
                }
                if (Statics.field3378 == null) {
                    Statics.field3378 = new class113(Statics.field2503, Statics.field2504);
                }
                if (Statics.field502.method3553(Statics.field2498, Statics.field2497, Statics.field3378, 22050)) {
                    Statics.field502.method3525();
                    Statics.field502.method3470(Statics.field2501);
                    Statics.field502.method3475(Statics.field2498, Statics.field2496);
                    field2499 = 0;
                    Statics.field2498 = null;
                    Statics.field3378 = null;
                    Statics.field3381 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field502.method3508();
            field2499 = 0;
            Statics.field2498 = null;
            Statics.field3378 = null;
            Statics.field3381 = null;
        }
        return false;
    }
}
