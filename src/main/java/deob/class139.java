package deob;

@ObfuscatedName("en")
public class class139 {

    @ObfuscatedName("en.d")
    public static int field1922 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.p(Lgp;Lgp;Lgp;Lem;B)Z")
    public static boolean method1841(class183 arg0, class183 arg1, class183 arg2, class140 arg3) {
        Statics.field1920 = arg0;
        Statics.field1572 = arg1;
        Statics.field1919 = arg2;
        Statics.field1921 = arg3;
        return true;
    }

    @ObfuscatedName("cr.g(Lgp;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1815(class183 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3035(arg1);
        int var6 = arg0.method3046(var5, arg2);
        method852(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("aq.x(Lgp;IIIZB)V")
    public static void method852(class183 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1922 = 1;
        Statics.field888 = arg0;
        Statics.field2696 = arg1;
        Statics.field1570 = arg2;
        Statics.field1722 = arg3;
        Statics.field1923 = arg4;
        Statics.field1927 = 10000;
    }

    @ObfuscatedName("ci.q(IB)V")
    public static void method1529(int arg0) {
        if (field1922 == 0) {
            Statics.field1921.method2332(arg0);
        } else {
            Statics.field1722 = arg0;
        }
    }

    @ObfuscatedName("cc.d(ILgp;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1595(int arg0, class183 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3035(arg2);
        int var7 = arg1.method3046(var6, arg3);
        method3478(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("gs.k(ILgp;IIIZB)V")
    public static void method3478(int arg0, class183 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1922 = 1;
        Statics.field888 = arg1;
        Statics.field2696 = arg2;
        Statics.field1570 = arg3;
        Statics.field1722 = arg4;
        Statics.field1923 = arg5;
        Statics.field1927 = arg0;
    }

    @ObfuscatedName("j.j(I)Z")
    public static boolean method98() {
        try {
            if (field1922 == 2) {
                if (Statics.field1792 == null) {
                    Statics.field1792 = class145.method2517(Statics.field888, Statics.field2696, Statics.field1570);
                    if (Statics.field1792 == null) {
                        return false;
                    }
                }
                if (Statics.field588 == null) {
                    Statics.field588 = new class61(Statics.field1919, Statics.field1572);
                }
                if (Statics.field1921.method2392(Statics.field1792, Statics.field1920, Statics.field588, 22050)) {
                    Statics.field1921.method2415();
                    Statics.field1921.method2332(Statics.field1722);
                    Statics.field1921.method2337(Statics.field1792, Statics.field1923);
                    field1922 = 0;
                    Statics.field1792 = null;
                    Statics.field588 = null;
                    Statics.field888 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field1921.method2338();
            field1922 = 0;
            Statics.field1792 = null;
            Statics.field588 = null;
            Statics.field888 = null;
        }
        return false;
    }
}
