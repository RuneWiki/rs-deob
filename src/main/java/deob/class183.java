package deob;

@ObfuscatedName("gq")
public class class183 {

    @ObfuscatedName("gq.e")
    public static int field2928 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.y(Lfu;Lfu;Lfu;Lgu;I)Z")
    public static boolean method103(class167 arg0, class167 arg1, class167 arg2, class184 arg3) {
        Statics.field2933 = arg0;
        Statics.field2925 = arg1;
        Statics.field2926 = arg2;
        Statics.field2932 = arg3;
        return true;
    }

    @ObfuscatedName("fm.d(Lfu;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method3102(class167 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3005(arg1);
        int var6 = arg0.method3012(var5, arg2);
        method2205(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("dh.g(Lfu;IIIZI)V")
    public static void method2205(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2928 = 1;
        Statics.field2924 = arg0;
        Statics.field630 = arg1;
        Statics.field2930 = arg2;
        Statics.field680 = arg3;
        Statics.field1515 = arg4;
        Statics.field2931 = 10000;
    }

    @ObfuscatedName("fl.w(II)V")
    public static void method2951(int arg0) {
        if (field2928 == 0) {
            Statics.field2932.method3308(arg0);
        } else {
            Statics.field680 = arg0;
        }
    }

    @ObfuscatedName("ew.e(I)V")
    public static void method2657() {
        Statics.field2932.method3371();
        field2928 = 1;
        Statics.field2924 = null;
    }

    @ObfuscatedName("ee.c(ILfu;IIIZI)V")
    public static void method2733(int arg0, class167 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2928 = 1;
        Statics.field2924 = arg1;
        Statics.field630 = arg2;
        Statics.field2930 = arg3;
        Statics.field680 = arg4;
        Statics.field1515 = arg5;
        Statics.field2931 = arg0;
    }

    @ObfuscatedName("client.a(II)V")
    public static void method553(int arg0) {
        field2928 = 1;
        Statics.field2924 = null;
        Statics.field630 = -1;
        Statics.field2930 = -1;
        Statics.field680 = 0;
        Statics.field1515 = false;
        Statics.field2931 = arg0;
    }

    @ObfuscatedName("fh.q(I)Z")
    public static boolean method2929() {
        return field2928 == 0 ? Statics.field2932.method3313() : true;
    }

    @ObfuscatedName("ek.m(I)V")
    public static void method2873() {
        try {
            if (field2928 == 1) {
                int var0 = Statics.field2932.method3309();
                if (var0 > 0 && Statics.field2932.method3313()) {
                    int var1 = var0 - Statics.field2931;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2932.method3308(var1);
                    return;
                }
                Statics.field2932.method3371();
                Statics.field2932.method3389();
                if (Statics.field2924 == null) {
                    field2928 = 0;
                } else {
                    field2928 = 2;
                }
                Statics.field2929 = null;
                Statics.field863 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2932.method3371();
            field2928 = 0;
            Statics.field2929 = null;
            Statics.field863 = null;
            Statics.field2924 = null;
        }
    }
}
