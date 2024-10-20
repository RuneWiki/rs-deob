package deob;

@ObfuscatedName("gy")
public class class183 {

    @ObfuscatedName("gy.d")
    public static int field2944 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.z(Lfl;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method684(class167 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3021(arg1);
        int var6 = arg0.method3002(var5, arg2);
        method96(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("l.q(Lfl;IIIZI)V")
    public static void method96(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2944 = 1;
        Statics.field2945 = arg0;
        Statics.field1767 = arg1;
        Statics.field2942 = arg2;
        Statics.field2727 = arg3;
        Statics.field2946 = arg4;
        Statics.field2632 = 10000;
    }

    @ObfuscatedName("f.k(ILfl;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method50(int arg0, class167 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3021(arg2);
        int var7 = arg1.method3002(var6, arg3);
        field2944 = 1;
        Statics.field2945 = arg1;
        Statics.field1767 = var6;
        Statics.field2942 = var7;
        Statics.field2727 = arg4;
        Statics.field2946 = arg5;
        Statics.field2632 = arg0;
    }

    @ObfuscatedName("fw.f(IB)V")
    public static void method2916(int arg0) {
        field2944 = 1;
        Statics.field2945 = null;
        Statics.field1767 = -1;
        Statics.field2942 = -1;
        Statics.field2727 = 0;
        Statics.field2946 = false;
        Statics.field2632 = arg0;
    }

    @ObfuscatedName("x.d(I)Z")
    public static boolean method555() {
        return field2944 == 0 ? Statics.field2943.method3362() : true;
    }
}
