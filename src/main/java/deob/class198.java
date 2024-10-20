package deob;

@ObfuscatedName("gf")
public class class198 {

    @ObfuscatedName("gf.k")
    public static int field2403 = 0;

    public class198() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bn.q(Lhp;Lhp;Lhp;Lga;B)Z")
    public static boolean method956(class234 arg0, class234 arg1, class234 arg2, class199 arg3) {
        Statics.field2407 = arg0;
        Statics.field2401 = arg1;
        Statics.field2402 = arg2;
        Statics.field1100 = arg3;
        return true;
    }

    @ObfuscatedName("do.w(Lhp;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method2504(class234 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3791(arg1);
        int var6 = arg0.method3792(var5, arg2);
        method3196(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("fy.e(Lhp;IIIZI)V")
    public static void method3196(class234 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2403 = 1;
        Statics.field77 = arg0;
        Statics.field2404 = arg1;
        Statics.field2408 = arg2;
        Statics.field530 = arg3;
        Statics.field1993 = arg4;
        Statics.field2405 = 10000;
    }

    @ObfuscatedName("fp.p(I)V")
    public static void method3235() {
        Statics.field1100.method3385();
        field2403 = 1;
        Statics.field77 = null;
    }

    @ObfuscatedName("aw.k(ILhp;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method477(int arg0, class234 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3791(arg2);
        int var7 = arg1.method3792(var6, arg3);
        field2403 = 1;
        Statics.field77 = arg1;
        Statics.field2404 = var6;
        Statics.field2408 = var7;
        Statics.field530 = arg4;
        Statics.field1993 = arg5;
        Statics.field2405 = arg0;
    }

    @ObfuscatedName("ap.l(IB)V")
    public static void method612(int arg0) {
        field2403 = 1;
        Statics.field77 = null;
        Statics.field2404 = -1;
        Statics.field2408 = -1;
        Statics.field530 = 0;
        Statics.field1993 = false;
        Statics.field2405 = arg0;
    }
}
