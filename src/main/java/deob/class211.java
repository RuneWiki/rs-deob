package deob;

@ObfuscatedName("hs")
public class class211 {

    @ObfuscatedName("hs.x")
    public static int field2586 = 0;

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.b(Lij;Lij;Lij;Lhj;I)Z")
    public static boolean method2692(class243 arg0, class243 arg1, class243 arg2, class212 arg3) {
        Statics.field2591 = arg0;
        Statics.field2590 = arg1;
        Statics.field846 = arg2;
        Statics.field2588 = arg3;
        return true;
    }

    @ObfuscatedName("e.s(Lij;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method154(class243 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3832(arg1);
        int var6 = arg0.method3833(var5, arg2);
        method3796(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("hf.r(Lij;IIIZI)V")
    public static void method3796(class243 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2586 = 1;
        Statics.field803 = arg0;
        Statics.field2587 = arg1;
        Statics.field415 = arg2;
        Statics.field2910 = arg3;
        Statics.field2906 = arg4;
        Statics.field1953 = 10000;
    }

    @ObfuscatedName("am.g(B)V")
    public static void method290() {
        Statics.field2588.method3514();
        field2586 = 1;
        Statics.field803 = null;
    }

    @ObfuscatedName("bi.x(ILij;IIIZI)V")
    public static void method661(int arg0, class243 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2586 = 1;
        Statics.field803 = arg1;
        Statics.field2587 = arg2;
        Statics.field415 = arg3;
        Statics.field2910 = arg4;
        Statics.field2906 = arg5;
        Statics.field1953 = arg0;
    }

    @ObfuscatedName("cm.f(IB)V")
    public static void method1679(int arg0) {
        field2586 = 1;
        Statics.field803 = null;
        Statics.field2587 = -1;
        Statics.field415 = -1;
        Statics.field2910 = 0;
        Statics.field2906 = false;
        Statics.field1953 = arg0;
    }

    @ObfuscatedName("ak.u(S)Z")
    public static boolean method208() {
        return field2586 == 0 ? Statics.field2588.method3556() : true;
    }

    @ObfuscatedName("ju.t(S)V")
    public static void method4435() {
        try {
            if (field2586 == 1) {
                int var0 = Statics.field2588.method3490();
                if (var0 > 0 && Statics.field2588.method3556()) {
                    int var1 = var0 - Statics.field1953;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2588.method3582(var1);
                    return;
                }
                Statics.field2588.method3514();
                Statics.field2588.method3540();
                if (Statics.field803 == null) {
                    field2586 = 0;
                } else {
                    field2586 = 2;
                }
                Statics.field2589 = null;
                Statics.field13 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2588.method3514();
            field2586 = 0;
            Statics.field2589 = null;
            Statics.field13 = null;
            Statics.field803 = null;
        }
    }
}
