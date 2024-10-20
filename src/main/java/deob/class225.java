package deob;

@ObfuscatedName("hd")
public class class225 {

    @ObfuscatedName("hd.b")
    public static int field2539 = 0;

    public class225() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cu.n(Lij;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method1921(class254 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method4472(arg1);
        int var6 = arg0.method4473(var5, arg2);
        method1964(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("cz.h(Lij;IIIZI)V")
    public static void method1964(class254 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2539 = 1;
        Statics.field2540 = arg0;
        Statics.field1388 = arg1;
        Statics.field230 = arg2;
        Statics.field624 = arg3;
        Statics.field1133 = arg4;
        Statics.field3246 = 10000;
    }

    @ObfuscatedName("ai.l(IB)V")
    public static void method362(int arg0) {
        if (field2539 == 0) {
            Statics.field2535.method4109(arg0);
        } else {
            Statics.field624 = arg0;
        }
    }

    @ObfuscatedName("p.g(S)V")
    public static void method184() {
        Statics.field2535.method4115();
        field2539 = 1;
        Statics.field2540 = null;
    }

    @ObfuscatedName("gy.b(ILij;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method3796(int arg0, class254 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method4472(arg2);
        int var7 = arg1.method4473(var6, arg3);
        field2539 = 1;
        Statics.field2540 = arg1;
        Statics.field1388 = var6;
        Statics.field230 = var7;
        Statics.field624 = arg4;
        Statics.field1133 = arg5;
        Statics.field3246 = arg0;
    }

    @ObfuscatedName("aw.a(IB)V")
    public static void method629(int arg0) {
        field2539 = 1;
        Statics.field2540 = null;
        Statics.field1388 = -1;
        Statics.field230 = -1;
        Statics.field624 = 0;
        Statics.field1133 = false;
        Statics.field3246 = arg0;
    }

    @ObfuscatedName("fl.c(B)Z")
    public static boolean method3298() {
        return field2539 == 0 ? Statics.field2535.method4116() : true;
    }

    @ObfuscatedName("ae.z(I)V")
    public static void method648() {
        try {
            if (field2539 == 1) {
                int var0 = Statics.field2535.method4110();
                if (var0 > 0 && Statics.field2535.method4116()) {
                    int var1 = var0 - Statics.field3246;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2535.method4109(var1);
                    return;
                }
                Statics.field2535.method4115();
                Statics.field2535.method4113();
                if (Statics.field2540 == null) {
                    field2539 = 0;
                } else {
                    field2539 = 2;
                }
                Statics.field991 = null;
                Statics.field423 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2535.method4115();
            field2539 = 0;
            Statics.field991 = null;
            Statics.field423 = null;
            Statics.field2540 = null;
        }
    }
}
