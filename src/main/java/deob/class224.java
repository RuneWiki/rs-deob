package deob;

@ObfuscatedName("hr")
public class class224 {

    @ObfuscatedName("hr.a")
    public static int field2647 = 0;

    public class224() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eu.b(Lie;IIIZB)V")
    public static void method2898(class256 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2647 = 1;
        Statics.field2472 = arg0;
        Statics.field2649 = arg1;
        Statics.field1659 = arg2;
        Statics.field2646 = arg3;
        Statics.field2648 = arg4;
        Statics.field1889 = 10000;
    }

    @ObfuscatedName("ib.q(II)V")
    public static void method4151(int arg0) {
        field2647 = 1;
        Statics.field2472 = null;
        Statics.field2649 = -1;
        Statics.field1659 = -1;
        Statics.field2646 = 0;
        Statics.field2648 = false;
        Statics.field1889 = arg0;
    }

    @ObfuscatedName("bt.o(B)V")
    public static void method1006() {
        try {
            if (field2647 == 1) {
                int var0 = Statics.field2106.method3823();
                if (var0 > 0 && Statics.field2106.method3855()) {
                    int var1 = var0 - Statics.field1889;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2106.method3822(var1);
                    return;
                }
                Statics.field2106.method3828();
                Statics.field2106.method3826();
                if (Statics.field2472 == null) {
                    field2647 = 0;
                } else {
                    field2647 = 2;
                }
                Statics.field551 = null;
                Statics.field1367 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2106.method3828();
            field2647 = 0;
            Statics.field551 = null;
            Statics.field1367 = null;
            Statics.field2472 = null;
        }
    }

    @ObfuscatedName("bz.p(I)Z")
    public static boolean method1043() {
        try {
            if (field2647 == 2) {
                if (Statics.field551 == null) {
                    Statics.field551 = class230.method4007(Statics.field2472, Statics.field2649, Statics.field1659);
                    if (Statics.field551 == null) {
                        return false;
                    }
                }
                if (Statics.field1367 == null) {
                    Statics.field1367 = new class110(Statics.field1363, Statics.field602);
                }
                if (Statics.field2106.method3824(Statics.field551, Statics.field2645, Statics.field1367, 22050)) {
                    Statics.field2106.method3910();
                    Statics.field2106.method3822(Statics.field2646);
                    Statics.field2106.method3883(Statics.field551, Statics.field2648);
                    field2647 = 0;
                    Statics.field551 = null;
                    Statics.field1367 = null;
                    Statics.field2472 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2106.method3828();
            field2647 = 0;
            Statics.field551 = null;
            Statics.field1367 = null;
            Statics.field2472 = null;
        }
        return false;
    }
}
