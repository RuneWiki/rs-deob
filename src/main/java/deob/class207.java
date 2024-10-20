package deob;

@ObfuscatedName("gi")
public class class207 {

    @ObfuscatedName("gi.i")
    public static int field2438 = 0;

    public class207() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eb.z(Lic;Lic;Lic;Lge;B)Z")
    public static boolean method3138(class244 arg0, class244 arg1, class244 arg2, class208 arg3) {
        Statics.field2441 = arg0;
        Statics.field2436 = arg1;
        Statics.field1901 = arg2;
        Statics.field2437 = arg3;
        return true;
    }

    @ObfuscatedName("cy.k(Lic;IIIZI)V")
    public static void method2136(class244 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2438 = 1;
        Statics.field2421 = arg0;
        Statics.field2035 = arg1;
        Statics.field2439 = arg2;
        Statics.field523 = arg3;
        Statics.field2440 = arg4;
        Statics.field1923 = 10000;
    }

    @ObfuscatedName("c.s(II)V")
    public static void method116(int arg0) {
        if (field2438 == 0) {
            Statics.field2437.method3493(arg0);
        } else {
            Statics.field523 = arg0;
        }
    }

    @ObfuscatedName("bg.t(II)V")
    public static void method771(int arg0) {
        field2438 = 1;
        Statics.field2421 = null;
        Statics.field2035 = -1;
        Statics.field2439 = -1;
        Statics.field523 = 0;
        Statics.field2440 = false;
        Statics.field1923 = arg0;
    }

    @ObfuscatedName("ca.i(I)Z")
    public static boolean method1646() {
        return field2438 == 0 ? Statics.field2437.method3500() : true;
    }

    @ObfuscatedName("cm.o(I)V")
    public static void method1924() {
        try {
            if (field2438 == 1) {
                int var0 = Statics.field2437.method3494();
                if (var0 > 0 && Statics.field2437.method3500()) {
                    int var1 = var0 - Statics.field1923;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2437.method3493(var1);
                    return;
                }
                Statics.field2437.method3499();
                Statics.field2437.method3497();
                if (Statics.field2421 == null) {
                    field2438 = 0;
                } else {
                    field2438 = 2;
                }
                Statics.field2435 = null;
                Statics.field285 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2437.method3499();
            field2438 = 0;
            Statics.field2435 = null;
            Statics.field285 = null;
            Statics.field2421 = null;
        }
    }

    @ObfuscatedName("cy.x(I)Z")
    public static boolean method2140() {
        try {
            if (field2438 == 2) {
                if (Statics.field2435 == null) {
                    Statics.field2435 = class213.method3671(Statics.field2421, Statics.field2035, Statics.field2439);
                    if (Statics.field2435 == null) {
                        return false;
                    }
                }
                if (Statics.field285 == null) {
                    Statics.field285 = new class118(Statics.field1901, Statics.field2436);
                }
                if (Statics.field2437.method3582(Statics.field2435, Statics.field2441, Statics.field285, 22050)) {
                    Statics.field2437.method3538();
                    Statics.field2437.method3493(Statics.field523);
                    Statics.field2437.method3498(Statics.field2435, Statics.field2440);
                    field2438 = 0;
                    Statics.field2435 = null;
                    Statics.field285 = null;
                    Statics.field2421 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2437.method3499();
            field2438 = 0;
            Statics.field2435 = null;
            Statics.field285 = null;
            Statics.field2421 = null;
        }
        return false;
    }
}
