package deob;

@ObfuscatedName("gw")
public class class204 {

    @ObfuscatedName("gw.v")
    public static int field2502 = 0;

    public class204() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.a(Lif;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2144(class236 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3777(arg1);
        int var6 = arg0.method3827(var5, arg2);
        method966(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("bg.j(Lif;IIIZI)V")
    public static void method966(class236 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2502 = 1;
        Statics.field2503 = arg0;
        Statics.field2504 = arg1;
        Statics.field2205 = arg2;
        Statics.field2505 = arg3;
        Statics.field2506 = arg4;
        Statics.field862 = 10000;
    }

    @ObfuscatedName("hv.n(ILif;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method3653(int arg0, class236 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3777(arg2);
        int var7 = arg1.method3827(var6, arg3);
        field2502 = 1;
        Statics.field2503 = arg1;
        Statics.field2504 = var6;
        Statics.field2205 = var7;
        Statics.field2505 = arg4;
        Statics.field2506 = arg5;
        Statics.field862 = arg0;
    }

    @ObfuscatedName("el.r(I)V")
    public static void method2632() {
        try {
            if (field2502 == 1) {
                int var0 = Statics.field2501.method3422();
                if (var0 > 0 && Statics.field2501.method3428()) {
                    int var1 = var0 - Statics.field862;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2501.method3421(var1);
                    return;
                }
                Statics.field2501.method3427();
                Statics.field2501.method3425();
                if (Statics.field2503 == null) {
                    field2502 = 0;
                } else {
                    field2502 = 2;
                }
                Statics.field2197 = null;
                Statics.field2507 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2501.method3427();
            field2502 = 0;
            Statics.field2197 = null;
            Statics.field2507 = null;
            Statics.field2503 = null;
        }
    }
}
