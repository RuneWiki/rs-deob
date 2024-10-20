package deob;

@ObfuscatedName("js")
public class class284 {

    @ObfuscatedName("js.h")
    public static int field3294 = 0;

    public class284() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ip.a(Llg;Llg;Llg;Ljr;I)Z")
    public static boolean method4719(class330 arg0, class330 arg1, class330 arg2, class285 arg3) {
        Statics.field3298 = arg0;
        Statics.field3291 = arg1;
        Statics.field3292 = arg2;
        Statics.field3293 = arg3;
        return true;
    }

    @ObfuscatedName("w.f(Llg;IIIZB)V")
    public static void method261(class330 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3294 = 1;
        Statics.field124 = arg0;
        Statics.field3295 = arg1;
        Statics.field3296 = arg2;
        Statics.field1364 = arg3;
        Statics.field4191 = arg4;
        Statics.field110 = 10000;
    }

    @ObfuscatedName("ip.c(IB)V")
    public static void method4720(int arg0) {
        if (field3294 == 0) {
            Statics.field3293.method4935(arg0);
        } else {
            Statics.field1364 = arg0;
        }
    }

    @ObfuscatedName("gc.x(ILlg;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method3313(int arg0, class330 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method5813(arg2);
        int var7 = arg1.method5854(var6, arg3);
        field3294 = 1;
        Statics.field124 = arg1;
        Statics.field3295 = var6;
        Statics.field3296 = var7;
        Statics.field1364 = arg4;
        Statics.field4191 = arg5;
        Statics.field110 = arg0;
    }

    @ObfuscatedName("fz.h(I)V")
    public static void method3170() {
        try {
            if (field3294 == 1) {
                int var0 = Statics.field3293.method5046();
                if (var0 > 0 && Statics.field3293.method4942()) {
                    int var1 = var0 - Statics.field110;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field3293.method4935(var1);
                    return;
                }
                Statics.field3293.method5029();
                Statics.field3293.method4939();
                if (Statics.field124 == null) {
                    field3294 = 0;
                } else {
                    field3294 = 2;
                }
                Statics.field1559 = null;
                Statics.field4379 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field3293.method5029();
            field3294 = 0;
            Statics.field1559 = null;
            Statics.field4379 = null;
            Statics.field124 = null;
        }
    }
}
