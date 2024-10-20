package deob;

@ObfuscatedName("gx")
public class class204 {

    @ObfuscatedName("gx.q")
    public static int field2522 = 0;

    public class204() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fr.d(Lit;IIIZI)V")
    public static void method2819(class236 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2522 = 1;
        Statics.field2523 = arg0;
        Statics.field2521 = arg1;
        Statics.field2139 = arg2;
        Statics.field2204 = arg3;
        Statics.field3779 = arg4;
        Statics.field3815 = 10000;
    }

    @ObfuscatedName("ao.k(II)V")
    public static void method549(int arg0) {
        if (field2522 == 0) {
            Statics.field2524.method3505(arg0);
        } else {
            Statics.field2204 = arg0;
        }
    }

    @ObfuscatedName("cx.e(I)V")
    public static void method1612() {
        Statics.field2524.method3511();
        field2522 = 1;
        Statics.field2523 = null;
    }

    @ObfuscatedName("ab.p(ILit;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method226(int arg0, class236 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3896(arg2);
        int var7 = arg1.method3892(var6, arg3);
        field2522 = 1;
        Statics.field2523 = arg1;
        Statics.field2521 = var6;
        Statics.field2139 = var7;
        Statics.field2204 = arg4;
        Statics.field3779 = arg5;
        Statics.field3815 = arg0;
    }

    @ObfuscatedName("eo.q(II)V")
    public static void method2697(int arg0) {
        field2522 = 1;
        Statics.field2523 = null;
        Statics.field2521 = -1;
        Statics.field2139 = -1;
        Statics.field2204 = 0;
        Statics.field3779 = false;
        Statics.field3815 = arg0;
    }

    @ObfuscatedName("cc.s(I)Z")
    public static boolean method1777() {
        try {
            if (field2522 == 2) {
                if (Statics.field517 == null) {
                    Statics.field517 = class210.method3696(Statics.field2523, Statics.field2521, Statics.field2139);
                    if (Statics.field517 == null) {
                        return false;
                    }
                }
                if (Statics.field2525 == null) {
                    Statics.field2525 = new class111(Statics.field2518, Statics.field2520);
                }
                if (Statics.field2524.method3539(Statics.field517, Statics.field2519, Statics.field2525, 22050)) {
                    Statics.field2524.method3508();
                    Statics.field2524.method3505(Statics.field2204);
                    Statics.field2524.method3576(Statics.field517, Statics.field3779);
                    field2522 = 0;
                    Statics.field517 = null;
                    Statics.field2525 = null;
                    Statics.field2523 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2524.method3511();
            field2522 = 0;
            Statics.field517 = null;
            Statics.field2525 = null;
            Statics.field2523 = null;
        }
        return false;
    }
}
