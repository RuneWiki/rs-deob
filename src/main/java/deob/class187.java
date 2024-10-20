package deob;

@ObfuscatedName("ga")
public class class187 {

    @ObfuscatedName("ga.p")
    public static int field3003 = 0;

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.s(Lfu;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method670(class171 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3084(arg1);
        int var6 = arg0.method3085(var5, arg2);
        method986(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("aq.z(Lfu;IIIZI)V")
    public static void method986(class171 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3003 = 1;
        Statics.field201 = arg0;
        Statics.field3004 = arg1;
        Statics.field3005 = arg2;
        Statics.field3006 = arg3;
        Statics.field3007 = arg4;
        Statics.field2284 = 10000;
    }

    @ObfuscatedName("fp.t(IB)V")
    public static void method3258(int arg0) {
        if (field3003 == 0) {
            Statics.field3008.method3422(arg0);
        } else {
            Statics.field3006 = arg0;
        }
    }

    @ObfuscatedName("bq.y(ILfu;IIIZI)V")
    public static void method1544(int arg0, class171 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3003 = 1;
        Statics.field201 = arg1;
        Statics.field3004 = arg2;
        Statics.field3005 = arg3;
        Statics.field3006 = arg4;
        Statics.field3007 = arg5;
        Statics.field2284 = arg0;
    }

    @ObfuscatedName("bp.p(II)V")
    public static void method1029(int arg0) {
        field3003 = 1;
        Statics.field201 = null;
        Statics.field3004 = -1;
        Statics.field3005 = -1;
        Statics.field3006 = 0;
        Statics.field3007 = false;
        Statics.field2284 = arg0;
    }

    @ObfuscatedName("cm.g(I)V")
    public static void method2071() {
        try {
            if (field3003 == 1) {
                int var0 = Statics.field3008.method3392();
                if (var0 > 0 && Statics.field3008.method3398()) {
                    int var1 = var0 - Statics.field2284;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field3008.method3422(var1);
                    return;
                }
                Statics.field3008.method3397();
                Statics.field3008.method3459();
                if (Statics.field201 == null) {
                    field3003 = 0;
                } else {
                    field3003 = 2;
                }
                Statics.field2091 = null;
                Statics.field2084 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field3008.method3397();
            field3003 = 0;
            Statics.field2091 = null;
            Statics.field2084 = null;
            Statics.field201 = null;
        }
    }

    @ObfuscatedName("db.m(I)Z")
    public static boolean method2154() {
        try {
            if (field3003 == 2) {
                if (Statics.field2091 == null) {
                    Statics.field2091 = class184.method3316(Statics.field201, Statics.field3004, Statics.field3005);
                    if (Statics.field2091 == null) {
                        return false;
                    }
                }
                if (Statics.field2084 == null) {
                    Statics.field2084 = new class63(Statics.field3002, Statics.field3009);
                }
                if (Statics.field3008.method3424(Statics.field2091, Statics.field3001, Statics.field2084, 22050)) {
                    Statics.field3008.method3394();
                    Statics.field3008.method3422(Statics.field3006);
                    Statics.field3008.method3396(Statics.field2091, Statics.field3007);
                    field3003 = 0;
                    Statics.field2091 = null;
                    Statics.field2084 = null;
                    Statics.field201 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field3008.method3397();
            field3003 = 0;
            Statics.field2091 = null;
            Statics.field2084 = null;
            Statics.field201 = null;
        }
        return false;
    }
}
