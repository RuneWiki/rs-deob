package deob;

@ObfuscatedName("gc")
public class class183 {

    @ObfuscatedName("gc.u")
    public static int field2941 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ah.j(Lfa;IIIZI)V")
    public static void method869(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2941 = 1;
        Statics.field3039 = arg0;
        Statics.field2946 = arg1;
        Statics.field779 = arg2;
        Statics.field2943 = arg3;
        Statics.field2587 = arg4;
        Statics.field2875 = 10000;
    }

    @ObfuscatedName("an.m(II)V")
    public static void method1081(int arg0) {
        field2941 = 1;
        Statics.field3039 = null;
        Statics.field2946 = -1;
        Statics.field779 = -1;
        Statics.field2943 = 0;
        Statics.field2587 = false;
        Statics.field2875 = arg0;
    }

    @ObfuscatedName("ep.f(I)Z")
    public static boolean method2739() {
        try {
            if (field2941 == 2) {
                if (Statics.field2214 == null) {
                    Statics.field2214 = class180.method3329(Statics.field3039, Statics.field2946, Statics.field779);
                    if (Statics.field2214 == null) {
                        return false;
                    }
                }
                if (Statics.field1519 == null) {
                    Statics.field1519 = new class60(Statics.field2939, Statics.field2938);
                }
                if (Statics.field2944.method3417(Statics.field2214, Statics.field2940, Statics.field1519, 22050)) {
                    Statics.field2944.method3493();
                    Statics.field2944.method3415(Statics.field2943);
                    Statics.field2944.method3420(Statics.field2214, Statics.field2587);
                    field2941 = 0;
                    Statics.field2214 = null;
                    Statics.field1519 = null;
                    Statics.field3039 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2944.method3421();
            field2941 = 0;
            Statics.field2214 = null;
            Statics.field1519 = null;
            Statics.field3039 = null;
        }
        return false;
    }
}
