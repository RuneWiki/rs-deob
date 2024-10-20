package deob;

@ObfuscatedName("hf")
public class class215 {

    @ObfuscatedName("hf.o")
    public static int field2503 = 0;

    public class215() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fb.m(Lir;Lir;Lir;Lhm;I)Z")
    public static boolean method3214(class245 arg0, class245 arg1, class245 arg2, class216 arg3) {
        Statics.field2 = arg0;
        Statics.field2507 = arg1;
        Statics.field2504 = arg2;
        Statics.field2506 = arg3;
        return true;
    }

    @ObfuscatedName("gx.f(Lir;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method3660(class245 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method4174(arg1);
        int var6 = arg0.method4175(var5, arg2);
        method1898(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("cu.q(Lir;IIIZB)V")
    public static void method1898(class245 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2503 = 1;
        Statics.field2505 = arg0;
        Statics.field251 = arg1;
        Statics.field50 = arg2;
        Statics.field233 = arg3;
        Statics.field3887 = arg4;
        Statics.field1867 = 10000;
    }

    @ObfuscatedName("ga.w(II)V")
    public static void method3657(int arg0) {
        if (field2503 == 0) {
            Statics.field2506.method3801(arg0);
        } else {
            Statics.field233 = arg0;
        }
    }

    @ObfuscatedName("ao.o(ILir;Ljava/lang/String;Ljava/lang/String;IZS)V")
    public static void method720(int arg0, class245 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method4174(arg2);
        int var7 = arg1.method4175(var6, arg3);
        field2503 = 1;
        Statics.field2505 = arg1;
        Statics.field251 = var6;
        Statics.field50 = var7;
        Statics.field233 = arg4;
        Statics.field3887 = arg5;
        Statics.field1867 = arg0;
    }

    @ObfuscatedName("fu.u(IB)V")
    public static void method3196(int arg0) {
        field2503 = 1;
        Statics.field2505 = null;
        Statics.field251 = -1;
        Statics.field50 = -1;
        Statics.field233 = 0;
        Statics.field3887 = false;
        Statics.field1867 = arg0;
    }
}
