package deob;

@ObfuscatedName("fx")
public class class160 {

    @ObfuscatedName("fx.u")
    public static int field2695 = 0;

    public class160() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ck.e(Lec;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method1884(class145 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2781(arg1);
        int var6 = arg0.method2732(var5, arg2);
        method577(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ab.p(Lec;IIIZI)V")
    public static void method577(class145 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2695 = 1;
        Statics.field997 = arg0;
        Statics.field227 = arg1;
        Statics.field2692 = arg2;
        Statics.field1264 = arg3;
        Statics.field709 = arg4;
        Statics.field2892 = 10000;
    }

    @ObfuscatedName("dq.a(B)V")
    public static void method2404() {
        Statics.field2690.method3103();
        field2695 = 1;
        Statics.field997 = null;
    }
}
