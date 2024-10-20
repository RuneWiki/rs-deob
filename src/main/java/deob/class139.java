package deob;

@ObfuscatedName("ea")
public class class139 {

    @ObfuscatedName("ea.r")
    public static int field1941 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.f(Lgb;IIIZI)V")
    public static void method1400(class183 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1941 = 1;
        Statics.field2062 = arg0;
        Statics.field1942 = arg1;
        Statics.field1778 = arg2;
        Statics.field784 = arg3;
        Statics.field1939 = arg4;
        Statics.field1938 = 10000;
    }

    @ObfuscatedName("bs.i(B)V")
    public static void method1399() {
        Statics.field1940.method2421();
        field1941 = 1;
        Statics.field2062 = null;
    }

    @ObfuscatedName("dl.u(II)V")
    public static void method2188(int arg0) {
        field1941 = 1;
        Statics.field2062 = null;
        Statics.field1942 = -1;
        Statics.field1778 = -1;
        Statics.field784 = 0;
        Statics.field1939 = false;
        Statics.field1938 = arg0;
    }

    @ObfuscatedName("bv.r(B)Z")
    public static boolean method1134() {
        try {
            if (field1941 == 2) {
                if (Statics.field1945 == null) {
                    Statics.field1945 = class145.method2589(Statics.field2062, Statics.field1942, Statics.field1778);
                    if (Statics.field1945 == null) {
                        return false;
                    }
                }
                if (Statics.field286 == null) {
                    Statics.field286 = new class61(Statics.field1943, Statics.field2038);
                }
                if (Statics.field1940.method2458(Statics.field1945, Statics.field1946, Statics.field286, 22050)) {
                    Statics.field1940.method2393();
                    Statics.field1940.method2401(Statics.field784);
                    Statics.field1940.method2395(Statics.field1945, Statics.field1939);
                    field1941 = 0;
                    Statics.field1945 = null;
                    Statics.field286 = null;
                    Statics.field2062 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field1940.method2421();
            field1941 = 0;
            Statics.field1945 = null;
            Statics.field286 = null;
            Statics.field2062 = null;
        }
        return false;
    }
}
