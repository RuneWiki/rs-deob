package deob;

@ObfuscatedName("hc")
public class class220 {

    @ObfuscatedName("hc.i")
    public static int field2510 = 0;

    public class220() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.y(Liu;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method90(class250 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method4274(arg1);
        int var6 = arg0.method4275(var5, arg2);
        method447(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("al.c(Liu;IIIZI)V")
    public static void method447(class250 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2510 = 1;
        Statics.field2507 = arg0;
        Statics.field2433 = arg1;
        Statics.field407 = arg2;
        Statics.field1756 = arg3;
        Statics.field2511 = arg4;
        Statics.field2327 = 10000;
    }

    @ObfuscatedName("fx.n(IB)V")
    public static void method3165(int arg0) {
        field2510 = 1;
        Statics.field2507 = null;
        Statics.field2433 = -1;
        Statics.field407 = -1;
        Statics.field1756 = 0;
        Statics.field2511 = false;
        Statics.field2327 = arg0;
    }

    @ObfuscatedName("fq.i(I)Z")
    public static boolean method3162() {
        try {
            if (field2510 == 2) {
                if (Statics.field3191 == null) {
                    Statics.field3191 = class226.method4051(Statics.field2507, Statics.field2433, Statics.field407);
                    if (Statics.field3191 == null) {
                        return false;
                    }
                }
                if (Statics.field3667 == null) {
                    Statics.field3667 = new class101(Statics.field2512, Statics.field2508);
                }
                if (Statics.field2509.method3886(Statics.field3191, Statics.field2506, Statics.field3667, 22050)) {
                    Statics.field2509.method3885();
                    Statics.field2509.method3976(Statics.field1756);
                    Statics.field2509.method3920(Statics.field3191, Statics.field2511);
                    field2510 = 0;
                    Statics.field3191 = null;
                    Statics.field3667 = null;
                    Statics.field2507 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2509.method3901();
            field2510 = 0;
            Statics.field3191 = null;
            Statics.field3667 = null;
            Statics.field2507 = null;
        }
        return false;
    }
}
