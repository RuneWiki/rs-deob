package deob;

@ObfuscatedName("fi")
public class class161 {

    @ObfuscatedName("fi.r")
    public static int field2716 = 0;

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.j(Leg;IIIZI)V")
    public static void method620(class146 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2716 = 1;
        Statics.field1004 = arg0;
        Statics.field1285 = arg1;
        Statics.field979 = arg2;
        Statics.field2121 = arg3;
        Statics.field1677 = arg4;
        Statics.field2886 = 10000;
    }

    @ObfuscatedName("eq.z(I)V")
    public static void method2717() {
        Statics.field2714.method3075();
        field2716 = 1;
        Statics.field1004 = null;
    }

    @ObfuscatedName("do.y(II)V")
    public static void method2553(int arg0) {
        field2716 = 1;
        Statics.field1004 = null;
        Statics.field1285 = -1;
        Statics.field979 = -1;
        Statics.field2121 = 0;
        Statics.field1677 = false;
        Statics.field2886 = arg0;
    }

    @ObfuscatedName("cp.h(I)V")
    public static void method1886() {
        try {
            if (field2716 == 1) {
                int var0 = Statics.field2714.method3115();
                if (var0 > 0 && Statics.field2714.method3130()) {
                    int var1 = var0 - Statics.field2886;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2714.method3129(var1);
                    return;
                }
                Statics.field2714.method3075();
                Statics.field2714.method3052();
                if (Statics.field1004 == null) {
                    field2716 = 0;
                } else {
                    field2716 = 2;
                }
                Statics.field702 = null;
                Statics.field711 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2714.method3075();
            field2716 = 0;
            Statics.field702 = null;
            Statics.field711 = null;
            Statics.field1004 = null;
        }
    }

    @ObfuscatedName("af.r(I)Z")
    public static boolean method546() {
        try {
            if (field2716 == 2) {
                if (Statics.field702 == null) {
                    Statics.field702 = class158.method2978(Statics.field1004, Statics.field1285, Statics.field979);
                    if (Statics.field702 == null) {
                        return false;
                    }
                }
                if (Statics.field711 == null) {
                    Statics.field711 = new class53(Statics.field2715, Statics.field2713);
                }
                if (Statics.field2714.method3050(Statics.field702, Statics.field2718, Statics.field711, 22050)) {
                    Statics.field2714.method3102();
                    Statics.field2714.method3129(Statics.field2121);
                    Statics.field2714.method3083(Statics.field702, Statics.field1677);
                    field2716 = 0;
                    Statics.field702 = null;
                    Statics.field711 = null;
                    Statics.field1004 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2714.method3075();
            field2716 = 0;
            Statics.field702 = null;
            Statics.field711 = null;
            Statics.field1004 = null;
        }
        return false;
    }
}
