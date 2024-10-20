package deob;

@ObfuscatedName("ga")
public class class204 {

    @ObfuscatedName("ga.d")
    public static int field2487 = 0;

    public class204() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ji.e(Lin;IIIZI)V")
    public static void method4508(class236 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2487 = 1;
        Statics.field2488 = arg0;
        Statics.field2489 = arg1;
        Statics.field2483 = arg2;
        Statics.field2043 = arg3;
        Statics.field1383 = arg4;
        Statics.field2135 = 10000;
    }

    @ObfuscatedName("bt.o(II)V")
    public static void method979(int arg0) {
        if (field2487 == 0) {
            Statics.field2486.method3409(arg0);
        } else {
            Statics.field2043 = arg0;
        }
    }

    @ObfuscatedName("dp.m(ILin;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2176(int arg0, class236 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3776(arg2);
        int var7 = arg1.method3777(var6, arg3);
        method2273(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("eg.g(ILin;IIIZI)V")
    public static void method2273(int arg0, class236 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2487 = 1;
        Statics.field2488 = arg1;
        Statics.field2489 = arg2;
        Statics.field2483 = arg3;
        Statics.field2043 = arg4;
        Statics.field1383 = arg5;
        Statics.field2135 = arg0;
    }

    @ObfuscatedName("is.d(I)Z")
    public static boolean method4198() {
        return field2487 == 0 ? Statics.field2486.method3415() : true;
    }

    @ObfuscatedName("cn.b(I)Z")
    public static boolean method1602() {
        try {
            if (field2487 == 2) {
                if (Statics.field826 == null) {
                    Statics.field826 = class210.method3573(Statics.field2488, Statics.field2489, Statics.field2483);
                    if (Statics.field826 == null) {
                        return false;
                    }
                }
                if (Statics.field2491 == null) {
                    Statics.field2491 = new class113(Statics.field2485, Statics.field2484);
                }
                if (Statics.field2486.method3448(Statics.field826, Statics.field2492, Statics.field2491, 22050)) {
                    Statics.field2486.method3414();
                    Statics.field2486.method3409(Statics.field2043);
                    Statics.field2486.method3466(Statics.field826, Statics.field1383);
                    field2487 = 0;
                    Statics.field826 = null;
                    Statics.field2491 = null;
                    Statics.field2488 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2486.method3457();
            field2487 = 0;
            Statics.field826 = null;
            Statics.field2491 = null;
            Statics.field2488 = null;
        }
        return false;
    }
}
