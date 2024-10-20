package deob;

@ObfuscatedName("hm")
public class class218 {

    @ObfuscatedName("hm.u")
    public static int field2461 = 0;

    public class218() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ba.w(Lir;IIIZS)V")
    public static void method1447(class248 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2461 = 1;
        Statics.field1872 = arg0;
        Statics.field2462 = arg1;
        Statics.field2463 = arg2;
        Statics.field3741 = arg3;
        Statics.field2464 = arg4;
        Statics.field38 = 10000;
    }

    @ObfuscatedName("e.s(B)V")
    public static void method89() {
        Statics.field2460.method3877();
        field2461 = 1;
        Statics.field1872 = null;
    }

    @ObfuscatedName("h.l(ILir;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method403(int arg0, class248 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method4264(arg2);
        int var7 = arg1.method4265(var6, arg3);
        method1495(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("bb.u(ILir;IIIZB)V")
    public static void method1495(int arg0, class248 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2461 = 1;
        Statics.field1872 = arg1;
        Statics.field2462 = arg2;
        Statics.field2463 = arg3;
        Statics.field3741 = arg4;
        Statics.field2464 = arg5;
        Statics.field38 = arg0;
    }

    @ObfuscatedName("af.q(II)V")
    public static void method408(int arg0) {
        field2461 = 1;
        Statics.field1872 = null;
        Statics.field2462 = -1;
        Statics.field2463 = -1;
        Statics.field3741 = 0;
        Statics.field2464 = false;
        Statics.field38 = arg0;
    }

    @ObfuscatedName("el.i(I)Z")
    public static boolean method2963() {
        try {
            if (field2461 == 2) {
                if (Statics.field2286 == null) {
                    Statics.field2286 = class224.method4049(Statics.field1872, Statics.field2462, Statics.field2463);
                    if (Statics.field2286 == null) {
                        return false;
                    }
                }
                if (Statics.field1150 == null) {
                    Statics.field1150 = new class99(Statics.field2459, Statics.field2465);
                }
                if (Statics.field2460.method3873(Statics.field2286, Statics.field2285, Statics.field1150, 22050)) {
                    Statics.field2460.method3874();
                    Statics.field2460.method3901(Statics.field3741);
                    Statics.field2460.method3924(Statics.field2286, Statics.field2464);
                    field2461 = 0;
                    Statics.field2286 = null;
                    Statics.field1150 = null;
                    Statics.field1872 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2460.method3877();
            field2461 = 0;
            Statics.field2286 = null;
            Statics.field1150 = null;
            Statics.field1872 = null;
        }
        return false;
    }
}
