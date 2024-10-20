package deob;

@ObfuscatedName("gr")
public class class204 {

    @ObfuscatedName("gr.b")
    public static int field2515 = 0;

    public class204() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bg.i(Liw;IIIZI)V")
    public static void method876(class236 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2515 = 1;
        Statics.field2514 = arg0;
        Statics.field2516 = arg1;
        Statics.field2281 = arg2;
        Statics.field2230 = arg3;
        Statics.field1405 = arg4;
        Statics.field1528 = 10000;
    }

    @ObfuscatedName("bb.c(II)V")
    public static void method969(int arg0) {
        if (field2515 == 0) {
            Statics.field2512.method3386(arg0);
        } else {
            Statics.field2230 = arg0;
        }
    }

    @ObfuscatedName("fd.e(I)V")
    public static void method2789() {
        Statics.field2512.method3392();
        field2515 = 1;
        Statics.field2514 = null;
    }

    @ObfuscatedName("x.v(ILiw;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method25(int arg0, class236 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3785(arg2);
        int var7 = arg1.method3786(var6, arg3);
        method653(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("am.b(ILiw;IIIZI)V")
    public static void method653(int arg0, class236 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2515 = 1;
        Statics.field2514 = arg1;
        Statics.field2516 = arg2;
        Statics.field2281 = arg3;
        Statics.field2230 = arg4;
        Statics.field1405 = arg5;
        Statics.field1528 = arg0;
    }

    @ObfuscatedName("cj.y(II)V")
    public static void method1536(int arg0) {
        field2515 = 1;
        Statics.field2514 = null;
        Statics.field2516 = -1;
        Statics.field2281 = -1;
        Statics.field2230 = 0;
        Statics.field1405 = false;
        Statics.field1528 = arg0;
    }

    @ObfuscatedName("af.h(I)Z")
    public static boolean method221() {
        return field2515 == 0 ? Statics.field2512.method3405() : true;
    }

    @ObfuscatedName("dp.x(I)V")
    public static void method2173() {
        try {
            if (field2515 == 1) {
                int var0 = Statics.field2512.method3387();
                if (var0 > 0 && Statics.field2512.method3405()) {
                    int var1 = var0 - Statics.field1528;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2512.method3386(var1);
                    return;
                }
                Statics.field2512.method3392();
                Statics.field2512.method3390();
                if (Statics.field2514 == null) {
                    field2515 = 0;
                } else {
                    field2515 = 2;
                }
                Statics.field1566 = null;
                Statics.field2510 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2512.method3392();
            field2515 = 0;
            Statics.field1566 = null;
            Statics.field2510 = null;
            Statics.field2514 = null;
        }
    }
}
