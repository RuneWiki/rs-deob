package deob;

@ObfuscatedName("hi")
public class class230 {

    @ObfuscatedName("hi.k")
    public static int field2681 = 0;

    public class230() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cb.c(Ljm;IIIZB)V")
    public static void method1857(class262 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2681 = 1;
        Statics.field715 = arg0;
        Statics.field2683 = arg1;
        Statics.field2130 = arg2;
        Statics.field1432 = arg3;
        Statics.field3911 = arg4;
        Statics.field250 = 10000;
    }

    @ObfuscatedName("cb.i(II)V")
    public static void method1858(int arg0) {
        if (field2681 == 0) {
            Statics.field2680.method3830(arg0);
        } else {
            Statics.field1432 = arg0;
        }
    }

    @ObfuscatedName("fb.o(ILjm;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2954(int arg0, class262 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method4245(arg2);
        int var7 = arg1.method4207(var6, arg3);
        method2297(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("dq.j(ILjm;IIIZB)V")
    public static void method2297(int arg0, class262 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2681 = 1;
        Statics.field715 = arg1;
        Statics.field2683 = arg2;
        Statics.field2130 = arg3;
        Statics.field1432 = arg4;
        Statics.field3911 = arg5;
        Statics.field250 = arg0;
    }

    @ObfuscatedName("jr.k(II)V")
    public static void method4299(int arg0) {
        field2681 = 1;
        Statics.field715 = null;
        Statics.field2683 = -1;
        Statics.field2130 = -1;
        Statics.field1432 = 0;
        Statics.field3911 = false;
        Statics.field250 = arg0;
    }

    @ObfuscatedName("ce.x(I)Z")
    public static boolean method1777() {
        return field2681 == 0 ? Statics.field2680.method3852() : true;
    }

    @ObfuscatedName("es.z(I)V")
    public static void method2878() {
        try {
            if (field2681 == 1) {
                int var0 = Statics.field2680.method3831();
                if (var0 > 0 && Statics.field2680.method3852()) {
                    int var1 = var0 - Statics.field250;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2680.method3830(var1);
                    return;
                }
                Statics.field2680.method3836();
                Statics.field2680.method3834();
                if (Statics.field715 == null) {
                    field2681 = 0;
                } else {
                    field2681 = 2;
                }
                Statics.field293 = null;
                Statics.field261 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2680.method3836();
            field2681 = 0;
            Statics.field293 = null;
            Statics.field261 = null;
            Statics.field715 = null;
        }
    }
}
