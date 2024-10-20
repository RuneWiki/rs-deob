package deob;

@ObfuscatedName("gg")
public class class183 {

    @ObfuscatedName("gg.m")
    public static int field2950 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.f(Lfx;IIIZI)V")
    public static void method650(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2950 = 1;
        Statics.field2947 = arg0;
        Statics.field2944 = arg1;
        Statics.field1457 = arg2;
        Statics.field63 = arg3;
        Statics.field673 = arg4;
        Statics.field2209 = 10000;
    }

    @ObfuscatedName("bb.s(ILfx;IIIZI)V")
    public static void method1534(int arg0, class167 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2950 = 1;
        Statics.field2947 = arg1;
        Statics.field2944 = arg2;
        Statics.field1457 = arg3;
        Statics.field63 = arg4;
        Statics.field673 = arg5;
        Statics.field2209 = arg0;
    }

    @ObfuscatedName("ck.q(I)Z")
    public static boolean method1963() {
        try {
            if (field2950 == 2) {
                if (Statics.field1226 == null) {
                    Statics.field1226 = class180.method3296(Statics.field2947, Statics.field2944, Statics.field1457);
                    if (Statics.field1226 == null) {
                        return false;
                    }
                }
                if (Statics.field2949 == null) {
                    Statics.field2949 = new class60(Statics.field2948, Statics.field664);
                }
                if (Statics.field3134.method3377(Statics.field1226, Statics.field2946, Statics.field2949, 22050)) {
                    Statics.field3134.method3451();
                    Statics.field3134.method3375(Statics.field63);
                    Statics.field3134.method3379(Statics.field1226, Statics.field673);
                    field2950 = 0;
                    Statics.field1226 = null;
                    Statics.field2949 = null;
                    Statics.field2947 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field3134.method3380();
            field2950 = 0;
            Statics.field1226 = null;
            Statics.field2949 = null;
            Statics.field2947 = null;
        }
        return false;
    }
}
