package deob;

@ObfuscatedName("gz")
public class class183 {

    @ObfuscatedName("gz.x")
    public static int field2937 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.i(Lfe;IIIZB)V")
    public static void method121(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2937 = 1;
        Statics.field3131 = arg0;
        Statics.field2251 = arg1;
        Statics.field2936 = arg2;
        Statics.field2028 = arg3;
        Statics.field2938 = arg4;
        Statics.field1615 = 10000;
    }

    @ObfuscatedName("fl.v(IB)V")
    public static void method3141(int arg0) {
        if (field2937 == 0) {
            Statics.field2935.method3353(arg0);
        } else {
            Statics.field2028 = arg0;
        }
    }

    @ObfuscatedName("by.r(ILfe;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1263(int arg0, class167 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3049(arg2);
        int var7 = arg1.method3079(var6, arg3);
        method2637(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("dw.n(ILfe;IIIZI)V")
    public static void method2637(int arg0, class167 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2937 = 1;
        Statics.field3131 = arg1;
        Statics.field2251 = arg2;
        Statics.field2936 = arg3;
        Statics.field2028 = arg4;
        Statics.field2938 = arg5;
        Statics.field1615 = arg0;
    }

    @ObfuscatedName("ax.x(II)V")
    public static void method856(int arg0) {
        field2937 = 1;
        Statics.field3131 = null;
        Statics.field2251 = -1;
        Statics.field2936 = -1;
        Statics.field2028 = 0;
        Statics.field2938 = false;
        Statics.field1615 = arg0;
    }

    @ObfuscatedName("b.q(I)Z")
    public static boolean method153() {
        return field2937 == 0 ? Statics.field2935.method3360() : true;
    }

    @ObfuscatedName("ei.h(I)V")
    public static void method2930() {
        try {
            if (field2937 == 1) {
                int var0 = Statics.field2935.method3354();
                if (var0 > 0 && Statics.field2935.method3360()) {
                    int var1 = var0 - Statics.field1615;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2935.method3353(var1);
                    return;
                }
                Statics.field2935.method3386();
                Statics.field2935.method3357();
                if (Statics.field3131 == null) {
                    field2937 = 0;
                } else {
                    field2937 = 2;
                }
                Statics.field207 = null;
                Statics.field1400 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2935.method3386();
            field2937 = 0;
            Statics.field207 = null;
            Statics.field1400 = null;
            Statics.field3131 = null;
        }
    }
}
