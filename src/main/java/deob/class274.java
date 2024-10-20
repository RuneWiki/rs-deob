package deob;

@ObfuscatedName("jk")
public class class274 {

    @ObfuscatedName("jk.a")
    public static int field3237 = 0;

    public class274() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.o(Llp;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2588(class316 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method5206(arg1);
        int var6 = arg0.method5207(var5, arg2);
        method2435(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("dc.q(Llp;IIIZI)V")
    public static void method2435(class316 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3237 = 1;
        Statics.field1582 = arg0;
        Statics.field2050 = arg1;
        Statics.field4302 = arg2;
        Statics.field1841 = arg3;
        Statics.field2642 = arg4;
        Statics.field4088 = 10000;
    }

    @ObfuscatedName("bl.l(I)V")
    public static void method1041() {
        Statics.field3236.method4663();
        field3237 = 1;
        Statics.field1582 = null;
    }

    @ObfuscatedName("cp.k(ILlp;IIIZI)V")
    public static void method2434(int arg0, class316 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3237 = 1;
        Statics.field1582 = arg1;
        Statics.field2050 = arg2;
        Statics.field4302 = arg3;
        Statics.field1841 = arg4;
        Statics.field2642 = arg5;
        Statics.field4088 = arg0;
    }

    @ObfuscatedName("ce.a(II)V")
    public static void method2403(int arg0) {
        field3237 = 1;
        Statics.field1582 = null;
        Statics.field2050 = -1;
        Statics.field4302 = -1;
        Statics.field1841 = 0;
        Statics.field2642 = false;
        Statics.field4088 = arg0;
    }

    @ObfuscatedName("kd.m(I)Z")
    public static boolean method4911() {
        return field3237 == 0 ? Statics.field3236.method4664() : true;
    }

    @ObfuscatedName("cl.p(I)Z")
    public static boolean method2292() {
        try {
            if (field3237 == 2) {
                if (Statics.field3238 == null) {
                    Statics.field3238 = class279.method4858(Statics.field1582, Statics.field2050, Statics.field4302);
                    if (Statics.field3238 == null) {
                        return false;
                    }
                }
                if (Statics.field1736 == null) {
                    Statics.field1736 = new class43(Statics.field3242, Statics.field4808);
                }
                if (Statics.field3236.method4659(Statics.field3238, Statics.field3235, Statics.field1736, 22050)) {
                    Statics.field3236.method4660();
                    Statics.field3236.method4657(Statics.field1841);
                    Statics.field3236.method4769(Statics.field3238, Statics.field2642);
                    field3237 = 0;
                    Statics.field3238 = null;
                    Statics.field1736 = null;
                    Statics.field1582 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field3236.method4663();
            field3237 = 0;
            Statics.field3238 = null;
            Statics.field1736 = null;
            Statics.field1582 = null;
        }
        return false;
    }
}
