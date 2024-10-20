package deob;

@ObfuscatedName("hr")
public class class211 {

    @ObfuscatedName("hr.v")
    public static int field2599 = 0;

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.d(Lid;Lid;Lid;Lhf;B)Z")
    public static boolean method958(class243 arg0, class243 arg1, class243 arg2, class212 arg3) {
        Statics.field2597 = arg0;
        Statics.field2595 = arg1;
        Statics.field2598 = arg2;
        Statics.field2596 = arg3;
        return true;
    }

    @ObfuscatedName("at.x(Lid;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method684(class243 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3951(arg1);
        int var6 = arg0.method3952(var5, arg2);
        method3058(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("fr.k(Lid;IIIZB)V")
    public static void method3058(class243 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2599 = 1;
        Statics.field23 = arg0;
        Statics.field238 = arg1;
        Statics.field2600 = arg2;
        Statics.field1589 = arg3;
        Statics.field323 = arg4;
        Statics.field2217 = 10000;
    }

    @ObfuscatedName("b.z(IB)V")
    public static void method26(int arg0) {
        if (field2599 == 0) {
            Statics.field2596.method3587(arg0);
        } else {
            Statics.field1589 = arg0;
        }
    }

    @ObfuscatedName("be.v(B)V")
    public static void method1033() {
        Statics.field2596.method3592();
        field2599 = 1;
        Statics.field23 = null;
    }

    @ObfuscatedName("ff.m(ILid;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2890(int arg0, class243 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3951(arg2);
        int var7 = arg1.method3952(var6, arg3);
        field2599 = 1;
        Statics.field23 = arg1;
        Statics.field238 = var6;
        Statics.field2600 = var7;
        Statics.field1589 = arg4;
        Statics.field323 = arg5;
        Statics.field2217 = arg0;
    }

    @ObfuscatedName("k.b(II)V")
    public static void method7(int arg0) {
        field2599 = 1;
        Statics.field23 = null;
        Statics.field238 = -1;
        Statics.field2600 = -1;
        Statics.field1589 = 0;
        Statics.field323 = false;
        Statics.field2217 = arg0;
    }

    @ObfuscatedName("f.t(B)Z")
    public static boolean method107() {
        return field2599 == 0 ? Statics.field2596.method3662() : true;
    }

    @ObfuscatedName("ei.p(B)V")
    public static void method2808() {
        try {
            if (field2599 == 1) {
                int var0 = Statics.field2596.method3620();
                if (var0 > 0 && Statics.field2596.method3662()) {
                    int var1 = var0 - Statics.field2217;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2596.method3587(var1);
                    return;
                }
                Statics.field2596.method3592();
                Statics.field2596.method3622();
                if (Statics.field23 == null) {
                    field2599 = 0;
                } else {
                    field2599 = 2;
                }
                Statics.field2514 = null;
                Statics.field1317 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2596.method3592();
            field2599 = 0;
            Statics.field2514 = null;
            Statics.field1317 = null;
            Statics.field23 = null;
        }
    }
}
