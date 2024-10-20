package deob;

@ObfuscatedName("fl")
public class class161 {

    @ObfuscatedName("fl.i")
    public static int field2699 = 0;

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.z(Ler;Ler;Ler;Lfa;I)Z")
    public static boolean method2537(class146 arg0, class146 arg1, class146 arg2, class162 arg3) {
        Statics.field2702 = arg0;
        Statics.field2698 = arg1;
        Statics.field1861 = arg2;
        Statics.field1882 = arg3;
        return true;
    }

    @ObfuscatedName("ci.j(Ler;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1773(class146 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2707(arg1);
        int var6 = arg0.method2721(var5, arg2);
        method2945(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("fg.a(Ler;IIIZI)V")
    public static void method2945(class146 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2699 = 1;
        Statics.field1883 = arg0;
        Statics.field2700 = arg1;
        Statics.field55 = arg2;
        Statics.field2664 = arg3;
        Statics.field578 = arg4;
        Statics.field1855 = 10000;
    }

    @ObfuscatedName("ed.y(B)V")
    public static void method2880() {
        Statics.field1882.method3041();
        field2699 = 1;
        Statics.field1883 = null;
    }

    @ObfuscatedName("df.i(ILer;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2423(int arg0, class146 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2707(arg2);
        int var7 = arg1.method2721(var6, arg3);
        method786(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("ar.b(ILer;IIIZB)V")
    public static void method786(int arg0, class146 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2699 = 1;
        Statics.field1883 = arg1;
        Statics.field2700 = arg2;
        Statics.field55 = arg3;
        Statics.field2664 = arg4;
        Statics.field578 = arg5;
        Statics.field1855 = arg0;
    }

    @ObfuscatedName("l.s(II)V")
    public static void method156(int arg0) {
        field2699 = 1;
        Statics.field1883 = null;
        Statics.field2700 = -1;
        Statics.field55 = -1;
        Statics.field2664 = 0;
        Statics.field578 = false;
        Statics.field1855 = arg0;
    }

    @ObfuscatedName("eo.q(I)V")
    public static void method2883() {
        try {
            if (field2699 == 1) {
                int var0 = Statics.field1882.method3140();
                if (var0 > 0 && Statics.field1882.method3042()) {
                    int var1 = var0 - Statics.field1855;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1882.method3036(var1);
                    return;
                }
                Statics.field1882.method3041();
                Statics.field1882.method3051();
                if (Statics.field1883 == null) {
                    field2699 = 0;
                } else {
                    field2699 = 2;
                }
                Statics.field973 = null;
                Statics.field3 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1882.method3041();
            field2699 = 0;
            Statics.field973 = null;
            Statics.field3 = null;
            Statics.field1883 = null;
        }
    }

    @ObfuscatedName("t.p(B)Z")
    public static boolean method470() {
        try {
            if (field2699 == 2) {
                if (Statics.field973 == null) {
                    Statics.field973 = class158.method2948(Statics.field1883, Statics.field2700, Statics.field55);
                    if (Statics.field973 == null) {
                        return false;
                    }
                }
                if (Statics.field3 == null) {
                    Statics.field3 = new class53(Statics.field1861, Statics.field2698);
                }
                if (Statics.field1882.method3038(Statics.field973, Statics.field2702, Statics.field3, 22050)) {
                    Statics.field1882.method3096();
                    Statics.field1882.method3036(Statics.field2664);
                    Statics.field1882.method3040(Statics.field973, Statics.field578);
                    field2699 = 0;
                    Statics.field973 = null;
                    Statics.field3 = null;
                    Statics.field1883 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field1882.method3041();
            field2699 = 0;
            Statics.field973 = null;
            Statics.field3 = null;
            Statics.field1883 = null;
        }
        return false;
    }
}
