package deob;

@ObfuscatedName("gw")
public class class204 {

    @ObfuscatedName("gw.g")
    public static int field2472 = 0;

    public class204() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fn.c(Lip;Lip;Lip;Lgl;I)Z")
    public static boolean method2820(class236 arg0, class236 arg1, class236 arg2, class205 arg3) {
        Statics.field2477 = arg0;
        Statics.field2470 = arg1;
        Statics.field3645 = arg2;
        Statics.field2471 = arg3;
        return true;
    }

    @ObfuscatedName("cp.o(Lip;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method1498(class236 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3730(arg1);
        int var6 = arg0.method3731(var5, arg2);
        method128(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("l.i(Lip;IIIZI)V")
    public static void method128(class236 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2472 = 1;
        Statics.field2816 = arg0;
        Statics.field2469 = arg1;
        Statics.field2474 = arg2;
        Statics.field514 = arg3;
        Statics.field2475 = arg4;
        Statics.field1525 = 10000;
    }

    @ObfuscatedName("client.u(B)V")
    public static void method1347() {
        Statics.field2471.method3397();
        field2472 = 1;
        Statics.field2816 = null;
    }

    @ObfuscatedName("hn.g(ILip;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method3705(int arg0, class236 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3730(arg2);
        int var7 = arg1.method3731(var6, arg3);
        method2326(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("ek.m(ILip;IIIZI)V")
    public static void method2326(int arg0, class236 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2472 = 1;
        Statics.field2816 = arg1;
        Statics.field2469 = arg2;
        Statics.field2474 = arg3;
        Statics.field514 = arg4;
        Statics.field2475 = arg5;
        Statics.field1525 = arg0;
    }

    @ObfuscatedName("dt.s(II)V")
    public static void method1869(int arg0) {
        field2472 = 1;
        Statics.field2816 = null;
        Statics.field2469 = -1;
        Statics.field2474 = -1;
        Statics.field514 = 0;
        Statics.field2475 = false;
        Statics.field1525 = arg0;
    }

    @ObfuscatedName("hs.x(I)Z")
    public static boolean method3581() {
        return field2472 == 0 ? Statics.field2471.method3398() : true;
    }
}
