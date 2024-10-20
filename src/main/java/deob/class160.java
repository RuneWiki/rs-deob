package deob;

@ObfuscatedName("fv")
public class class160 {

    @ObfuscatedName("fv.t")
    public static int field2064 = 0;

    public class160() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("er.d(Lgd;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2500(class185 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3088(arg1);
        int var6 = arg0.method3102(var5, arg2);
        method888(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("at.c(Lgd;IIIZB)V")
    public static void method888(class185 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2064 = 1;
        Statics.field2068 = arg0;
        Statics.field1990 = arg1;
        Statics.field2792 = arg2;
        Statics.field2070 = arg3;
        Statics.field165 = arg4;
        Statics.field1544 = 10000;
    }

    @ObfuscatedName("gn.n(IB)V")
    public static void method3279(int arg0) {
        if (field2064 == 0) {
            Statics.field2067.method2821(arg0);
        } else {
            Statics.field2070 = arg0;
        }
    }

    @ObfuscatedName("b.q(I)V")
    public static void method219() {
        Statics.field2067.method2773();
        field2064 = 1;
        Statics.field2068 = null;
    }

    @ObfuscatedName("df.t(II)V")
    public static void method2052(int arg0) {
        field2064 = 1;
        Statics.field2068 = null;
        Statics.field1990 = -1;
        Statics.field2792 = -1;
        Statics.field2070 = 0;
        Statics.field165 = false;
        Statics.field1544 = arg0;
    }

    @ObfuscatedName("g.p(I)V")
    public static void method150() {
        try {
            if (field2064 == 1) {
                int var0 = Statics.field2067.method2778();
                if (var0 > 0 && Statics.field2067.method2750()) {
                    int var1 = var0 - Statics.field1544;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2067.method2821(var1);
                    return;
                }
                Statics.field2067.method2773();
                Statics.field2067.method2748();
                if (Statics.field2068 == null) {
                    field2064 = 0;
                } else {
                    field2064 = 2;
                }
                Statics.field146 = null;
                Statics.field33 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2067.method2773();
            field2064 = 0;
            Statics.field146 = null;
            Statics.field33 = null;
            Statics.field2068 = null;
        }
    }
}
