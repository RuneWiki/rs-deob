package deob;

@ObfuscatedName("fb")
public class class161 {

    @ObfuscatedName("fb.m")
    public static int field2713 = 0;

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.k(Lee;Lee;Lee;Lfv;I)Z")
    public static boolean method2576(class146 arg0, class146 arg1, class146 arg2, class162 arg3) {
        Statics.field2718 = arg0;
        Statics.field2721 = arg1;
        Statics.field2714 = arg2;
        Statics.field203 = arg3;
        return true;
    }

    @ObfuscatedName("ad.r(Lee;IIIZI)V")
    public static void method839(class146 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2713 = 1;
        Statics.field2673 = arg0;
        Statics.field1903 = arg1;
        Statics.field1936 = arg2;
        Statics.field2716 = arg3;
        Statics.field600 = arg4;
        Statics.field2666 = 10000;
    }

    @ObfuscatedName("eg.m(ILee;IIIZB)V")
    public static void method2805(int arg0, class146 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2713 = 1;
        Statics.field2673 = arg1;
        Statics.field1903 = arg2;
        Statics.field1936 = arg3;
        Statics.field2716 = arg4;
        Statics.field600 = arg5;
        Statics.field2666 = arg0;
    }

    @ObfuscatedName("eq.j(II)V")
    public static void method2819(int arg0) {
        field2713 = 1;
        Statics.field2673 = null;
        Statics.field1903 = -1;
        Statics.field1936 = -1;
        Statics.field2716 = 0;
        Statics.field600 = false;
        Statics.field2666 = arg0;
    }

    @ObfuscatedName("dq.g(S)V")
    public static void method2551() {
        try {
            if (field2713 == 1) {
                int var0 = Statics.field203.method3004();
                if (var0 > 0 && Statics.field203.method3010()) {
                    int var1 = var0 - Statics.field2666;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field203.method3038(var1);
                    return;
                }
                Statics.field203.method3009();
                Statics.field203.method3007();
                if (Statics.field2673 == null) {
                    field2713 = 0;
                } else {
                    field2713 = 2;
                }
                Statics.field1831 = null;
                Statics.field2717 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field203.method3009();
            field2713 = 0;
            Statics.field1831 = null;
            Statics.field2717 = null;
            Statics.field2673 = null;
        }
    }
}
