package deob;

@ObfuscatedName("ey")
public class class139 {

    @ObfuscatedName("ey.f")
    public static int field1901 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dh.u(Lgt;IIIZI)V")
    public static void method1900(class183 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1901 = 1;
        Statics.field1904 = arg0;
        Statics.field921 = arg1;
        Statics.field3 = arg2;
        Statics.field1467 = arg3;
        Statics.field917 = arg4;
        Statics.field1905 = 10000;
    }

    @ObfuscatedName("ao.x(II)V")
    public static void method871(int arg0) {
        if (field1901 == 0) {
            Statics.field1900.method2380(arg0);
        } else {
            Statics.field1467 = arg0;
        }
    }

    @ObfuscatedName("z.i(I)V")
    public static void method119() {
        Statics.field1900.method2404();
        field1901 = 1;
        Statics.field1904 = null;
    }

    @ObfuscatedName("cp.a(ILgt;IIIZI)V")
    public static void method1593(int arg0, class183 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1901 = 1;
        Statics.field1904 = arg1;
        Statics.field921 = arg2;
        Statics.field3 = arg3;
        Statics.field1467 = arg4;
        Statics.field917 = arg5;
        Statics.field1905 = arg0;
    }

    @ObfuscatedName("h.c(I)Z")
    public static boolean method194() {
        return field1901 == 0 ? Statics.field1900.method2335() : true;
    }
}
