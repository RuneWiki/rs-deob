package deob;

@ObfuscatedName("ee")
public class class139 {

    @ObfuscatedName("ee.y")
    public static int field1922 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.n(Lgo;IIIZI)V")
    public static void method873(class183 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1922 = 1;
        Statics.field1925 = arg0;
        Statics.field2194 = arg1;
        Statics.field1923 = arg2;
        Statics.field1662 = arg3;
        Statics.field1924 = arg4;
        Statics.field2679 = 10000;
    }

    @ObfuscatedName("cl.g(ILgo;IIIZI)V")
    public static void method1893(int arg0, class183 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1922 = 1;
        Statics.field1925 = arg1;
        Statics.field2194 = arg2;
        Statics.field1923 = arg3;
        Statics.field1662 = arg4;
        Statics.field1924 = arg5;
        Statics.field2679 = arg0;
    }

    @ObfuscatedName("cb.v(IB)V")
    public static void method1895(int arg0) {
        field1922 = 1;
        Statics.field1925 = null;
        Statics.field2194 = -1;
        Statics.field1923 = -1;
        Statics.field1662 = 0;
        Statics.field1924 = false;
        Statics.field2679 = arg0;
    }

    @ObfuscatedName("dp.y(B)V")
    public static void method2045() {
        try {
            if (field1922 == 1) {
                int var0 = Statics.field1920.method2529();
                if (var0 > 0 && Statics.field1920.method2430()) {
                    int var1 = var0 - Statics.field2679;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1920.method2423(var1);
                    return;
                }
                Statics.field1920.method2507();
                Statics.field1920.method2427();
                if (Statics.field1925 == null) {
                    field1922 = 0;
                } else {
                    field1922 = 2;
                }
                Statics.field1615 = null;
                Statics.field699 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1920.method2507();
            field1922 = 0;
            Statics.field1615 = null;
            Statics.field699 = null;
            Statics.field1925 = null;
        }
    }

    @ObfuscatedName("fu.p(B)Z")
    public static boolean method2930() {
        try {
            if (field1922 == 2) {
                if (Statics.field1615 == null) {
                    Statics.field1615 = class145.method2606(Statics.field1925, Statics.field2194, Statics.field1923);
                    if (Statics.field1615 == null) {
                        return false;
                    }
                }
                if (Statics.field699 == null) {
                    Statics.field699 = new class61(Statics.field1917, Statics.field1918);
                }
                if (Statics.field1920.method2483(Statics.field1615, Statics.field1919, Statics.field699, 22050)) {
                    Statics.field1920.method2426();
                    Statics.field1920.method2423(Statics.field1662);
                    Statics.field1920.method2428(Statics.field1615, Statics.field1924);
                    field1922 = 0;
                    Statics.field1615 = null;
                    Statics.field699 = null;
                    Statics.field1925 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field1920.method2507();
            field1922 = 0;
            Statics.field1615 = null;
            Statics.field699 = null;
            Statics.field1925 = null;
        }
        return false;
    }
}
