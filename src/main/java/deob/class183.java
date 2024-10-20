package deob;

@ObfuscatedName("gi")
public class class183 {

    @ObfuscatedName("gi.o")
    public static int field2958 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("v.v(Lfh;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1(class167 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3040(arg1);
        int var6 = arg0.method3041(var5, arg2);
        method2795(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ew.f(Lfh;IIIZI)V")
    public static void method2795(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2958 = 1;
        Statics.field2959 = arg0;
        Statics.field2956 = arg1;
        Statics.field2709 = arg2;
        Statics.field2104 = arg3;
        Statics.field2710 = arg4;
        Statics.field2939 = 10000;
    }

    @ObfuscatedName("bo.i(II)V")
    public static void method1599(int arg0) {
        if (field2958 == 0) {
            Statics.field2963.method3365(arg0);
        } else {
            Statics.field2104 = arg0;
        }
    }

    @ObfuscatedName("eg.d(ILfh;IIIZI)V")
    public static void method2794(int arg0, class167 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2958 = 1;
        Statics.field2959 = arg1;
        Statics.field2956 = arg2;
        Statics.field2709 = arg3;
        Statics.field2104 = arg4;
        Statics.field2710 = arg5;
        Statics.field2939 = arg0;
    }
}
