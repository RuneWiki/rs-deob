package deob;

@ObfuscatedName("fy")
public class class164 {

    @ObfuscatedName("fy.r")
    public static int field2732 = 0;

    public class164() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.f(Lev;IIIZI)V")
    public static void method118(class149 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2732 = 1;
        Statics.field2733 = arg0;
        Statics.field1015 = arg1;
        Statics.field2734 = arg2;
        Statics.field2739 = arg3;
        Statics.field2978 = arg4;
        Statics.field2731 = 10000;
    }

    @ObfuscatedName("c.k(I)V")
    public static void method533() {
        Statics.field1834.method3090();
        field2732 = 1;
        Statics.field2733 = null;
    }

    @ObfuscatedName("ab.y(ILev;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method889(int arg0, class149 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2778(arg2);
        int var7 = arg1.method2809(var6, arg3);
        field2732 = 1;
        Statics.field2733 = arg1;
        Statics.field1015 = var6;
        Statics.field2734 = var7;
        Statics.field2739 = arg4;
        Statics.field2978 = arg5;
        Statics.field2731 = arg0;
    }

    @ObfuscatedName("b.e(IB)V")
    public static void method173(int arg0) {
        field2732 = 1;
        Statics.field2733 = null;
        Statics.field1015 = -1;
        Statics.field2734 = -1;
        Statics.field2739 = 0;
        Statics.field2978 = false;
        Statics.field2731 = arg0;
    }

    @ObfuscatedName("ey.r(I)Z")
    public static boolean method2936() {
        return field2732 == 0 ? Statics.field1834.method3121() : true;
    }

    @ObfuscatedName("cw.a(I)V")
    public static void method2015() {
        try {
            if (field2732 == 1) {
                int var0 = Statics.field1834.method3143();
                if (var0 > 0 && Statics.field1834.method3121()) {
                    int var1 = var0 - Statics.field2731;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1834.method3084(var1);
                    return;
                }
                Statics.field1834.method3090();
                Statics.field1834.method3088();
                if (Statics.field2733 == null) {
                    field2732 = 0;
                } else {
                    field2732 = 2;
                }
                Statics.field200 = null;
                Statics.field2737 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1834.method3090();
            field2732 = 0;
            Statics.field200 = null;
            Statics.field2737 = null;
            Statics.field2733 = null;
        }
    }
}
