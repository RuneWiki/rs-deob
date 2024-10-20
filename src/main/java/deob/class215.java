package deob;

@ObfuscatedName("hm")
public class class215 {

    @ObfuscatedName("hm.u")
    public static int field2621 = 0;

    public class215() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.a(Lib;IIIZI)V")
    public static void method4(class247 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2621 = 1;
        Statics.field2624 = arg0;
        Statics.field693 = arg1;
        Statics.field3755 = arg2;
        Statics.field2626 = arg3;
        Statics.field2182 = arg4;
        Statics.field2160 = 10000;
    }

    @ObfuscatedName("ba.w(II)V")
    public static void method1017(int arg0) {
        if (field2621 == 0) {
            Statics.field3754.method3534(arg0);
        } else {
            Statics.field2626 = arg0;
        }
    }

    @ObfuscatedName("fp.e(ILib;IIIZI)V")
    public static void method2856(int arg0, class247 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2621 = 1;
        Statics.field2624 = arg1;
        Statics.field693 = arg2;
        Statics.field3755 = arg3;
        Statics.field2626 = arg4;
        Statics.field2182 = arg5;
        Statics.field2160 = arg0;
    }

    @ObfuscatedName("hb.k(I)Z")
    public static boolean method3766() {
        try {
            if (field2621 == 2) {
                if (Statics.field2623 == null) {
                    Statics.field2623 = class221.method3727(Statics.field2624, Statics.field693, Statics.field3755);
                    if (Statics.field2623 == null) {
                        return false;
                    }
                }
                if (Statics.field2628 == null) {
                    Statics.field2628 = new class112(Statics.field2625, Statics.field2622);
                }
                if (Statics.field3754.method3536(Statics.field2623, Statics.field2627, Statics.field2628, 22050)) {
                    Statics.field3754.method3537();
                    Statics.field3754.method3534(Statics.field2626);
                    Statics.field3754.method3539(Statics.field2623, Statics.field2182);
                    field2621 = 0;
                    Statics.field2623 = null;
                    Statics.field2628 = null;
                    Statics.field2624 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field3754.method3540();
            field2621 = 0;
            Statics.field2623 = null;
            Statics.field2628 = null;
            Statics.field2624 = null;
        }
        return false;
    }
}
