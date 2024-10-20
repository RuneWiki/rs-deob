package deob;

@ObfuscatedName("fg")
public class class161 {

    @ObfuscatedName("fg.w")
    public static int field2700 = 0;

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cg.o(Lez;IIIZI)V")
    public static void method1920(class146 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2700 = 1;
        Statics.field1924 = arg0;
        Statics.field2705 = arg1;
        Statics.field240 = arg2;
        Statics.field2706 = arg3;
        Statics.field2744 = arg4;
        Statics.field1015 = 10000;
    }

    @ObfuscatedName("ez.y(ILez;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2717(int arg0, class146 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2655(arg2);
        int var7 = arg1.method2656(var6, arg3);
        method1993(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("cz.b(ILez;IIIZB)V")
    public static void method1993(int arg0, class146 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2700 = 1;
        Statics.field1924 = arg1;
        Statics.field2705 = arg2;
        Statics.field240 = arg3;
        Statics.field2706 = arg4;
        Statics.field2744 = arg5;
        Statics.field1015 = arg0;
    }

    @ObfuscatedName("cu.w(B)Z")
    public static boolean method1736() {
        return field2700 == 0 ? Statics.field2709.method3001() : true;
    }
}
