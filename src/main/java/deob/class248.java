package deob;

@ObfuscatedName("is")
public class class248 {

    @ObfuscatedName("is.o")
    public static int field2901 = 0;

    public class248() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("af.n(Lkk;IIIZI)V")
    public static void method978(class290 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2901 = 1;
        Statics.field2900 = arg0;
        Statics.field2903 = arg1;
        Statics.field478 = arg2;
        Statics.field2183 = arg3;
        Statics.field105 = arg4;
        Statics.field1486 = 10000;
    }

    @ObfuscatedName("i.c(I)V")
    public static void method366() {
        Statics.field1510.method4248();
        field2901 = 1;
        Statics.field2900 = null;
    }

    @ObfuscatedName("d.m(IB)V")
    public static void method213(int arg0) {
        field2901 = 1;
        Statics.field2900 = null;
        Statics.field2903 = -1;
        Statics.field478 = -1;
        Statics.field2183 = 0;
        Statics.field105 = false;
        Statics.field1486 = arg0;
    }

    @ObfuscatedName("bj.k(B)Z")
    public static boolean method1629() {
        return field2901 == 0 ? Statics.field1510.method4249() : true;
    }

    @ObfuscatedName("gn.o(I)V")
    public static void method3464() {
        try {
            if (field2901 == 1) {
                int var0 = Statics.field1510.method4244();
                if (var0 > 0 && Statics.field1510.method4249()) {
                    int var1 = var0 - Statics.field1486;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1510.method4243(var1);
                    return;
                }
                Statics.field1510.method4248();
                Statics.field1510.method4246();
                if (Statics.field2900 == null) {
                    field2901 = 0;
                } else {
                    field2901 = 2;
                }
                Statics.field3330 = null;
                Statics.field3270 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1510.method4248();
            field2901 = 0;
            Statics.field3330 = null;
            Statics.field3270 = null;
            Statics.field2900 = null;
        }
    }

    @ObfuscatedName("fm.g(I)Z")
    public static boolean method3349() {
        try {
            if (field2901 == 2) {
                if (Statics.field3330 == null) {
                    Statics.field3330 = class253.method4427(Statics.field2900, Statics.field2903, Statics.field478);
                    if (Statics.field3330 == null) {
                        return false;
                    }
                }
                if (Statics.field3270 == null) {
                    Statics.field3270 = new class41(Statics.field2899, Statics.field2904);
                }
                if (Statics.field1510.method4245(Statics.field3330, Statics.field2902, Statics.field3270, 22050)) {
                    Statics.field1510.method4265();
                    Statics.field1510.method4243(Statics.field2183);
                    Statics.field1510.method4247(Statics.field3330, Statics.field105);
                    field2901 = 0;
                    Statics.field3330 = null;
                    Statics.field3270 = null;
                    Statics.field2900 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field1510.method4248();
            field2901 = 0;
            Statics.field3330 = null;
            Statics.field3270 = null;
            Statics.field2900 = null;
        }
        return false;
    }
}
