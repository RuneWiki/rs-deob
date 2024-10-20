package deob;

@ObfuscatedName("ey")
public class class139 {

    @ObfuscatedName("ey.l")
    public static int field2350 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ba.f(Leo;Ljava/lang/String;Ljava/lang/String;IZS)V")
    public static void method1327(class153 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3034(arg1);
        int var6 = arg0.method3050(var5, arg2);
        method1421(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("bl.t(Leo;IIIZI)V")
    public static void method1421(class153 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2350 = 1;
        Statics.field1292 = arg0;
        Statics.field2719 = arg1;
        Statics.field2576 = arg2;
        Statics.field2351 = arg3;
        Statics.field2029 = arg4;
        Statics.field1330 = 10000;
    }

    @ObfuscatedName("aq.n(I)V")
    public static void method840() {
        Statics.field2347.method2796();
        field2350 = 1;
        Statics.field1292 = null;
    }

    @ObfuscatedName("n.e(ILeo;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method25(int arg0, class153 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3034(arg2);
        int var7 = arg1.method3050(var6, arg3);
        method2386(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("dd.l(ILeo;IIIZI)V")
    public static void method2386(int arg0, class153 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2350 = 1;
        Statics.field1292 = arg1;
        Statics.field2719 = arg2;
        Statics.field2576 = arg3;
        Statics.field2351 = arg4;
        Statics.field2029 = arg5;
        Statics.field1330 = arg0;
    }

    @ObfuscatedName("dt.d(IB)V")
    public static void method2345(int arg0) {
        field2350 = 1;
        Statics.field1292 = null;
        Statics.field2719 = -1;
        Statics.field2576 = -1;
        Statics.field2351 = 0;
        Statics.field2029 = false;
        Statics.field1330 = arg0;
    }

    @ObfuscatedName("dw.r(B)Z")
    public static boolean method2215() {
        return field2350 == 0 ? Statics.field2347.method2797() : true;
    }
}
