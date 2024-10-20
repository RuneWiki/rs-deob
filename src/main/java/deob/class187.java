package deob;

@ObfuscatedName("gx")
public class class187 {

    @ObfuscatedName("gx.r")
    public static int field2994 = 0;

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.e(Lfe;IIIZI)V")
    public static void method2758(class171 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2994 = 1;
        Statics.field2999 = arg0;
        Statics.field2042 = arg1;
        Statics.field2224 = arg2;
        Statics.field696 = arg3;
        Statics.field1761 = arg4;
        Statics.field3000 = 10000;
    }

    @ObfuscatedName("cn.l(II)V")
    public static void method1869(int arg0) {
        if (field2994 == 0) {
            Statics.field2997.method3466(arg0);
        } else {
            Statics.field696 = arg0;
        }
    }

    @ObfuscatedName("cm.c(B)V")
    public static void method2055() {
        Statics.field2997.method3472();
        field2994 = 1;
        Statics.field2999 = null;
    }

    @ObfuscatedName("cp.h(ILfe;IIIZI)V")
    public static void method1880(int arg0, class171 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2994 = 1;
        Statics.field2999 = arg1;
        Statics.field2042 = arg2;
        Statics.field2224 = arg3;
        Statics.field696 = arg4;
        Statics.field1761 = arg5;
        Statics.field3000 = arg0;
    }

    @ObfuscatedName("gs.r(IB)V")
    public static void method3383(int arg0) {
        field2994 = 1;
        Statics.field2999 = null;
        Statics.field2042 = -1;
        Statics.field2224 = -1;
        Statics.field696 = 0;
        Statics.field1761 = false;
        Statics.field3000 = arg0;
    }

    @ObfuscatedName("dd.a(B)Z")
    public static boolean method2540() {
        return field2994 == 0 ? Statics.field2997.method3473() : true;
    }

    @ObfuscatedName("gn.b(B)V")
    public static void method3402() {
        try {
            if (field2994 == 1) {
                int var0 = Statics.field2997.method3488();
                if (var0 > 0 && Statics.field2997.method3473()) {
                    int var1 = var0 - Statics.field3000;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2997.method3466(var1);
                    return;
                }
                Statics.field2997.method3472();
                Statics.field2997.method3567();
                if (Statics.field2999 == null) {
                    field2994 = 0;
                } else {
                    field2994 = 2;
                }
                Statics.field3001 = null;
                Statics.field1696 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2997.method3472();
            field2994 = 0;
            Statics.field3001 = null;
            Statics.field1696 = null;
            Statics.field2999 = null;
        }
    }
}
