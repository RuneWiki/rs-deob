package deob;

@ObfuscatedName("jk")
public class class266 {

    @ObfuscatedName("jk.r")
    public static int field3108 = 0;

    public class266() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hx.c(Lkq;Lkq;Lkq;Ljb;B)Z")
    public static boolean method4338(class307 arg0, class307 arg1, class307 arg2, class267 arg3) {
        Statics.field3106 = arg0;
        Statics.field3107 = arg1;
        Statics.field1349 = arg2;
        Statics.field3109 = arg3;
        return true;
    }

    @ObfuscatedName("bh.l(Lkq;IIIZB)V")
    public static void method1801(class307 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3108 = 1;
        Statics.field3105 = arg0;
        Statics.field3110 = arg1;
        Statics.field1629 = arg2;
        Statics.field1828 = arg3;
        Statics.field3154 = arg4;
        Statics.field3941 = 10000;
    }

    @ObfuscatedName("dz.s(II)V")
    public static void method2404(int arg0) {
        if (field3108 == 0) {
            Statics.field3109.method4546(arg0);
        } else {
            Statics.field1828 = arg0;
        }
    }

    @ObfuscatedName("ia.e(ILkq;IIIZI)V")
    public static void method4510(int arg0, class307 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3108 = 1;
        Statics.field3105 = arg1;
        Statics.field3110 = arg2;
        Statics.field1629 = arg3;
        Statics.field1828 = arg4;
        Statics.field3154 = arg5;
        Statics.field3941 = arg0;
    }

    @ObfuscatedName("ia.r(IB)V")
    public static void method4511(int arg0) {
        field3108 = 1;
        Statics.field3105 = null;
        Statics.field3110 = -1;
        Statics.field1629 = -1;
        Statics.field1828 = 0;
        Statics.field3154 = false;
        Statics.field3941 = arg0;
    }

    @ObfuscatedName("fc.o(I)V")
    public static void method2811() {
        try {
            if (field3108 == 1) {
                int var0 = Statics.field3109.method4592();
                if (var0 > 0 && Statics.field3109.method4553()) {
                    int var1 = var0 - Statics.field3941;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field3109.method4546(var1);
                    return;
                }
                Statics.field3109.method4552();
                Statics.field3109.method4550();
                if (Statics.field3105 == null) {
                    field3108 = 0;
                } else {
                    field3108 = 2;
                }
                Statics.field3111 = null;
                Statics.field1707 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field3109.method4552();
            field3108 = 0;
            Statics.field3111 = null;
            Statics.field1707 = null;
            Statics.field3105 = null;
        }
    }
}
