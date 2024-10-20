package deob;

@ObfuscatedName("gn")
public class class183 {

    @ObfuscatedName("gn.k")
    public static int field2933 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cn.m(Lfx;Lfx;Lfx;Lgz;I)Z")
    public static boolean method2179(class167 arg0, class167 arg1, class167 arg2, class184 arg3) {
        Statics.field2628 = arg0;
        Statics.field2934 = arg1;
        Statics.field2929 = arg2;
        Statics.field2930 = arg3;
        return true;
    }

    @ObfuscatedName("es.l(Lfx;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2965(class167 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3081(arg1);
        int var6 = arg0.method3116(var5, arg2);
        method1626(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("bu.y(Lfx;IIIZB)V")
    public static void method1626(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2933 = 1;
        Statics.field2932 = arg0;
        Statics.field3181 = arg1;
        Statics.field1501 = arg2;
        Statics.field2035 = arg3;
        Statics.field2881 = arg4;
        Statics.field1830 = 10000;
    }

    @ObfuscatedName("cn.u(ILfx;IIIZB)V")
    public static void method2182(int arg0, class167 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2933 = 1;
        Statics.field2932 = arg1;
        Statics.field3181 = arg2;
        Statics.field1501 = arg3;
        Statics.field2035 = arg4;
        Statics.field2881 = arg5;
        Statics.field1830 = arg0;
    }

    @ObfuscatedName("ao.k(IB)V")
    public static void method743(int arg0) {
        field2933 = 1;
        Statics.field2932 = null;
        Statics.field3181 = -1;
        Statics.field1501 = -1;
        Statics.field2035 = 0;
        Statics.field2881 = false;
        Statics.field1830 = arg0;
    }

    @ObfuscatedName("fk.j(I)Z")
    public static boolean method3280() {
        return field2933 == 0 ? Statics.field2930.method3429() : true;
    }

    @ObfuscatedName("ee.i(I)V")
    public static void method2730() {
        try {
            if (field2933 == 1) {
                int var0 = Statics.field2930.method3443();
                if (var0 > 0 && Statics.field2930.method3429()) {
                    int var1 = var0 - Statics.field1830;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2930.method3423(var1);
                    return;
                }
                Statics.field2930.method3514();
                Statics.field2930.method3427();
                if (Statics.field2932 == null) {
                    field2933 = 0;
                } else {
                    field2933 = 2;
                }
                Statics.field1723 = null;
                Statics.field2931 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2930.method3514();
            field2933 = 0;
            Statics.field1723 = null;
            Statics.field2931 = null;
            Statics.field2932 = null;
        }
    }
}
