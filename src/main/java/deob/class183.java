package deob;

@ObfuscatedName("go")
public class class183 {

    @ObfuscatedName("go.p")
    public static int field2943 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hj.h(Lfv;IIIZI)V")
    public static void method3635(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2943 = 1;
        Statics.field2942 = arg0;
        Statics.field2945 = arg1;
        Statics.field1229 = arg2;
        Statics.field31 = arg3;
        Statics.field2946 = arg4;
        Statics.field1865 = 10000;
    }

    @ObfuscatedName("bn.m(ILfv;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method1560(int arg0, class167 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3022(arg2);
        int var7 = arg1.method3023(var6, arg3);
        field2943 = 1;
        Statics.field2942 = arg1;
        Statics.field2945 = var6;
        Statics.field1229 = var7;
        Statics.field31 = arg4;
        Statics.field2946 = arg5;
        Statics.field1865 = arg0;
    }

    @ObfuscatedName("do.i(II)V")
    public static void method2633(int arg0) {
        field2943 = 1;
        Statics.field2942 = null;
        Statics.field2945 = -1;
        Statics.field1229 = -1;
        Statics.field31 = 0;
        Statics.field2946 = false;
        Statics.field1865 = arg0;
    }
}
