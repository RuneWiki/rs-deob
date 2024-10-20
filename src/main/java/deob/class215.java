package deob;

@ObfuscatedName("hf")
public class class215 {

    @ObfuscatedName("hf.i")
    public static int field2618 = 0;

    public class215() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fo.s(Lir;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method3058(class247 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method4201(arg1);
        int var6 = arg0.method4217(var5, arg2);
        method8(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("h.g(Lir;IIIZI)V")
    public static void method8(class247 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2618 = 1;
        Statics.field2615 = arg0;
        Statics.field3799 = arg1;
        Statics.field343 = arg2;
        Statics.field2193 = arg3;
        Statics.field447 = arg4;
        Statics.field2617 = 10000;
    }

    @ObfuscatedName("dh.m(II)V")
    public static void method2177(int arg0) {
        if (field2618 == 0) {
            Statics.field357.method3853(arg0);
        } else {
            Statics.field2193 = arg0;
        }
    }

    @ObfuscatedName("u.i(IB)V")
    public static void method127(int arg0) {
        field2618 = 1;
        Statics.field2615 = null;
        Statics.field3799 = -1;
        Statics.field343 = -1;
        Statics.field2193 = 0;
        Statics.field447 = false;
        Statics.field2617 = arg0;
    }

    @ObfuscatedName("gl.w(I)V")
    public static void method3499() {
        try {
            if (field2618 == 1) {
                int var0 = Statics.field357.method3935();
                if (var0 > 0 && Statics.field357.method3930()) {
                    int var1 = var0 - Statics.field2617;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field357.method3853(var1);
                    return;
                }
                Statics.field357.method3859();
                Statics.field357.method3857();
                if (Statics.field2615 == null) {
                    field2618 = 0;
                } else {
                    field2618 = 2;
                }
                Statics.field638 = null;
                Statics.field2233 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field357.method3859();
            field2618 = 0;
            Statics.field638 = null;
            Statics.field2233 = null;
            Statics.field2615 = null;
        }
    }
}
