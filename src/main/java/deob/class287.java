package deob;

@ObfuscatedName("kn")
public class class287 {

    @ObfuscatedName("kn.m")
    public static int field3347 = 0;

    public class287() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iz.h(Lly;Lly;Lly;Lka;I)Z")
    public static boolean method4789(class333 arg0, class333 arg1, class333 arg2, class288 arg3) {
        Statics.field3348 = arg0;
        Statics.field3346 = arg1;
        Statics.field3354 = arg2;
        Statics.field2980 = arg3;
        return true;
    }

    @ObfuscatedName("am.e(Lly;IIIZB)V")
    public static void method417(class333 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3347 = 1;
        Statics.field3520 = arg0;
        Statics.field1446 = arg1;
        Statics.field3350 = arg2;
        Statics.field4918 = arg3;
        Statics.field1706 = arg4;
        Statics.field3349 = 10000;
    }

    @ObfuscatedName("ar.v(II)V")
    public static void method459(int arg0) {
        if (field3347 == 0) {
            Statics.field2980.method5081(arg0);
        } else {
            Statics.field4918 = arg0;
        }
    }

    @ObfuscatedName("f.x(I)V")
    public static void method34() {
        Statics.field2980.method5024();
        field3347 = 1;
        Statics.field3520 = null;
    }

    @ObfuscatedName("ni.m(II)V")
    public static void method6730(int arg0) {
        field3347 = 1;
        Statics.field3520 = null;
        Statics.field1446 = -1;
        Statics.field3350 = -1;
        Statics.field4918 = 0;
        Statics.field1706 = false;
        Statics.field3349 = arg0;
    }

    @ObfuscatedName("fo.q(I)Z")
    public static boolean method3040() {
        return field3347 == 0 ? Statics.field2980.method5025() : true;
    }

    @ObfuscatedName("hv.f(B)V")
    public static void method4237() {
        try {
            if (field3347 == 1) {
                int var0 = Statics.field2980.method5086();
                if (var0 > 0 && Statics.field2980.method5025()) {
                    int var1 = var0 - Statics.field3349;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2980.method5081(var1);
                    return;
                }
                Statics.field2980.method5024();
                Statics.field2980.method5022();
                if (Statics.field3520 == null) {
                    field3347 = 0;
                } else {
                    field3347 = 2;
                }
                Statics.field3352 = null;
                Statics.field1052 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2980.method5024();
            field3347 = 0;
            Statics.field3352 = null;
            Statics.field1052 = null;
            Statics.field3520 = null;
        }
    }

    @ObfuscatedName("al.r(I)Z")
    public static boolean method692() {
        try {
            if (field3347 == 2) {
                if (Statics.field3352 == null) {
                    Statics.field3352 = class292.method5198(Statics.field3520, Statics.field1446, Statics.field3350);
                    if (Statics.field3352 == null) {
                        return false;
                    }
                }
                if (Statics.field1052 == null) {
                    Statics.field1052 = new class47(Statics.field3354, Statics.field3346);
                }
                if (Statics.field2980.method5020(Statics.field3352, Statics.field3348, Statics.field1052, 22050)) {
                    Statics.field2980.method5021();
                    Statics.field2980.method5081(Statics.field4918);
                    Statics.field2980.method5101(Statics.field3352, Statics.field1706);
                    field3347 = 0;
                    Statics.field3352 = null;
                    Statics.field1052 = null;
                    Statics.field3520 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2980.method5024();
            field3347 = 0;
            Statics.field3352 = null;
            Statics.field1052 = null;
            Statics.field3520 = null;
        }
        return false;
    }
}
