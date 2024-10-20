package deob;

@ObfuscatedName("gj")
public class class198 {

    @ObfuscatedName("gj.i")
    public static int field2415 = 0;

    public class198() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fb.t(Lii;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method3221(class235 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3854(arg1);
        int var6 = arg0.method3855(var5, arg2);
        field2415 = 1;
        Statics.field1982 = arg0;
        Statics.field2411 = var5;
        Statics.field1150 = var6;
        Statics.field1156 = arg3;
        Statics.field402 = arg4;
        Statics.field2413 = 10000;
    }

    @ObfuscatedName("w.o(ILii;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method169(int arg0, class235 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3854(arg2);
        int var7 = arg1.method3855(var6, arg3);
        method3247(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("ff.e(ILii;IIIZI)V")
    public static void method3247(int arg0, class235 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2415 = 1;
        Statics.field1982 = arg1;
        Statics.field2411 = arg2;
        Statics.field1150 = arg3;
        Statics.field1156 = arg4;
        Statics.field402 = arg5;
        Statics.field2413 = arg0;
    }

    @ObfuscatedName("m.i(I)Z")
    public static boolean method109() {
        try {
            if (field2415 == 2) {
                if (Statics.field2054 == null) {
                    Statics.field2054 = class204.method3618(Statics.field1982, Statics.field2411, Statics.field1150);
                    if (Statics.field2054 == null) {
                        return false;
                    }
                }
                if (Statics.field2412 == null) {
                    Statics.field2412 = new class109(Statics.field1973, Statics.field2414);
                }
                if (Statics.field2409.method3473(Statics.field2054, Statics.field2410, Statics.field2412, 22050)) {
                    Statics.field2409.method3436();
                    Statics.field2409.method3433(Statics.field1156);
                    Statics.field2409.method3438(Statics.field2054, Statics.field402);
                    field2415 = 0;
                    Statics.field2054 = null;
                    Statics.field2412 = null;
                    Statics.field1982 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2409.method3439();
            field2415 = 0;
            Statics.field2054 = null;
            Statics.field2412 = null;
            Statics.field1982 = null;
        }
        return false;
    }
}
