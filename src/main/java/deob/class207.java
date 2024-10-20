package deob;

@ObfuscatedName("ge")
public class class207 {

    @ObfuscatedName("ge.h")
    public static int field2523 = 0;

    public class207() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fw.s(Liw;Liw;Liw;Lgw;I)Z")
    public static boolean method2842(class239 arg0, class239 arg1, class239 arg2, class208 arg3) {
        Statics.field2524 = arg0;
        Statics.field2521 = arg1;
        Statics.field2429 = arg2;
        Statics.field2522 = arg3;
        return true;
    }

    @ObfuscatedName("bx.c(Liw;IIIZB)V")
    public static void method1045(class239 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2523 = 1;
        Statics.field3408 = arg0;
        Statics.field1408 = arg1;
        Statics.field3684 = arg2;
        Statics.field2526 = arg3;
        Statics.field353 = arg4;
        Statics.field2525 = 10000;
    }

    @ObfuscatedName("fh.f(I)V")
    public static void method2821() {
        Statics.field2522.method3493();
        field2523 = 1;
        Statics.field3408 = null;
    }

    @ObfuscatedName("cg.m(ILiw;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1556(int arg0, class239 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3855(arg2);
        int var7 = arg1.method3856(var6, arg3);
        field2523 = 1;
        Statics.field3408 = arg1;
        Statics.field1408 = var6;
        Statics.field3684 = var7;
        Statics.field2526 = arg4;
        Statics.field353 = arg5;
        Statics.field2525 = arg0;
    }

    @ObfuscatedName("eh.h(ILiw;IIIZI)V")
    public static void method2708(int arg0, class239 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2523 = 1;
        Statics.field3408 = arg1;
        Statics.field1408 = arg2;
        Statics.field3684 = arg3;
        Statics.field2526 = arg4;
        Statics.field353 = arg5;
        Statics.field2525 = arg0;
    }

    @ObfuscatedName("dz.t(I)Z")
    public static boolean method1940() {
        return field2523 == 0 ? Statics.field2522.method3492() : true;
    }

    @ObfuscatedName("cr.p(I)V")
    public static void method1569() {
        try {
            if (field2523 == 1) {
                int var0 = Statics.field2522.method3540();
                if (var0 > 0 && Statics.field2522.method3492()) {
                    int var1 = var0 - Statics.field2525;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2522.method3515(var1);
                    return;
                }
                Statics.field2522.method3493();
                Statics.field2522.method3566();
                if (Statics.field3408 == null) {
                    field2523 = 0;
                } else {
                    field2523 = 2;
                }
                Statics.field1416 = null;
                Statics.field2529 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2522.method3493();
            field2523 = 0;
            Statics.field1416 = null;
            Statics.field2529 = null;
            Statics.field3408 = null;
        }
    }

    @ObfuscatedName("cz.d(I)Z")
    public static boolean method1571() {
        try {
            if (field2523 == 2) {
                if (Statics.field1416 == null) {
                    Statics.field1416 = class213.method3674(Statics.field3408, Statics.field1408, Statics.field3684);
                    if (Statics.field1416 == null) {
                        return false;
                    }
                }
                if (Statics.field2529 == null) {
                    Statics.field2529 = new class113(Statics.field2429, Statics.field2521);
                }
                if (Statics.field2522.method3553(Statics.field1416, Statics.field2524, Statics.field2529, 22050)) {
                    Statics.field2522.method3488();
                    Statics.field2522.method3515(Statics.field2526);
                    Statics.field2522.method3490(Statics.field1416, Statics.field353);
                    field2523 = 0;
                    Statics.field1416 = null;
                    Statics.field2529 = null;
                    Statics.field3408 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2522.method3493();
            field2523 = 0;
            Statics.field1416 = null;
            Statics.field2529 = null;
            Statics.field3408 = null;
        }
        return false;
    }
}
