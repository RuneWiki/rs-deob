package deob;

@ObfuscatedName("ge")
public class class204 {

    @ObfuscatedName("ge.w")
    public static int field2518 = 0;

    public class204() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fn.p(Lil;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method3094(class236 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3764(arg1);
        int var6 = arg0.method3729(var5, arg2);
        method66(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("a.m(Lil;IIIZI)V")
    public static void method66(class236 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2518 = 1;
        Statics.field2519 = arg0;
        Statics.field2520 = arg1;
        Statics.field439 = arg2;
        Statics.field2456 = arg3;
        Statics.field1385 = arg4;
        Statics.field2305 = 10000;
    }

    @ObfuscatedName("cn.e(II)V")
    public static void method1504(int arg0) {
        if (field2518 == 0) {
            Statics.field2517.method3357(arg0);
        } else {
            Statics.field2456 = arg0;
        }
    }

    @ObfuscatedName("i.t(I)V")
    public static void method33() {
        try {
            if (field2518 == 1) {
                int var0 = Statics.field2517.method3339();
                if (var0 > 0 && Statics.field2517.method3422()) {
                    int var1 = var0 - Statics.field2305;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2517.method3357(var1);
                    return;
                }
                Statics.field2517.method3344();
                Statics.field2517.method3346();
                if (Statics.field2519 == null) {
                    field2518 = 0;
                } else {
                    field2518 = 2;
                }
                Statics.field1523 = null;
                Statics.field605 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2517.method3344();
            field2518 = 0;
            Statics.field1523 = null;
            Statics.field605 = null;
            Statics.field2519 = null;
        }
    }
}
