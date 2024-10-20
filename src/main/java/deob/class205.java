package deob;

@ObfuscatedName("gp")
public class class205 {

    @ObfuscatedName("gp.w")
    public static int field2488 = 0;

    public class205() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bt.e(Lit;Lit;Lit;Lgl;I)Z")
    public static boolean method1021(class237 arg0, class237 arg1, class237 arg2, class206 arg3) {
        Statics.field2493 = arg0;
        Statics.field2484 = arg1;
        Statics.field2485 = arg2;
        Statics.field2487 = arg3;
        return true;
    }

    @ObfuscatedName("ao.n(Lit;IIIZI)V")
    public static void method248(class237 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2488 = 1;
        Statics.field2489 = arg0;
        Statics.field274 = arg1;
        Statics.field2490 = arg2;
        Statics.field2491 = arg3;
        Statics.field473 = arg4;
        Statics.field2492 = 10000;
    }

    @ObfuscatedName("cl.g(II)V")
    public static void method1571(int arg0) {
        if (field2488 == 0) {
            Statics.field2487.method3474(arg0);
        } else {
            Statics.field2491 = arg0;
        }
    }

    @ObfuscatedName("c.y(I)V")
    public static void method87() {
        try {
            if (field2488 == 1) {
                int var0 = Statics.field2487.method3448();
                if (var0 > 0 && Statics.field2487.method3454()) {
                    int var1 = var0 - Statics.field2492;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2487.method3474(var1);
                    return;
                }
                Statics.field2487.method3479();
                Statics.field2487.method3451();
                if (Statics.field2489 == null) {
                    field2488 = 0;
                } else {
                    field2488 = 2;
                }
                Statics.field2323 = null;
                Statics.field2271 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2487.method3479();
            field2488 = 0;
            Statics.field2323 = null;
            Statics.field2271 = null;
            Statics.field2489 = null;
        }
    }

    @ObfuscatedName("cy.w(I)Z")
    public static boolean method1707() {
        try {
            if (field2488 == 2) {
                if (Statics.field2323 == null) {
                    Statics.field2323 = class211.method3632(Statics.field2489, Statics.field274, Statics.field2490);
                    if (Statics.field2323 == null) {
                        return false;
                    }
                }
                if (Statics.field2271 == null) {
                    Statics.field2271 = new class114(Statics.field2485, Statics.field2484);
                }
                if (Statics.field2487.method3449(Statics.field2323, Statics.field2493, Statics.field2271, 22050)) {
                    Statics.field2487.method3450();
                    Statics.field2487.method3474(Statics.field2491);
                    Statics.field2487.method3452(Statics.field2323, Statics.field473);
                    field2488 = 0;
                    Statics.field2323 = null;
                    Statics.field2271 = null;
                    Statics.field2489 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2487.method3479();
            field2488 = 0;
            Statics.field2323 = null;
            Statics.field2271 = null;
            Statics.field2489 = null;
        }
        return false;
    }
}
