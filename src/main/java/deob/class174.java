package deob;

@ObfuscatedName("ft")
public class class174 {

    @ObfuscatedName("ft.m")
    public static int field2863 = 0;

    public class174() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.n(Lfd;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method25(class158 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2944(arg1);
        int var6 = arg0.method2939(var5, arg2);
        method3039(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("fl.o(Lfd;IIIZB)V")
    public static void method3039(class158 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2863 = 1;
        Statics.field2866 = arg0;
        Statics.field2868 = arg1;
        Statics.field2867 = arg2;
        Statics.field2859 = arg3;
        Statics.field2819 = arg4;
        Statics.field1482 = 10000;
    }

    @ObfuscatedName("ab.a(II)V")
    public static void method817(int arg0) {
        if (field2863 == 0) {
            Statics.field2862.method3254(arg0);
        } else {
            Statics.field2859 = arg0;
        }
    }

    @ObfuscatedName("fo.w(B)V")
    public static void method3018() {
        Statics.field2862.method3260();
        field2863 = 1;
        Statics.field2866 = null;
    }

    @ObfuscatedName("fk.m(II)V")
    public static void method3017(int arg0) {
        field2863 = 1;
        Statics.field2866 = null;
        Statics.field2868 = -1;
        Statics.field2867 = -1;
        Statics.field2859 = 0;
        Statics.field2819 = false;
        Statics.field1482 = arg0;
    }

    @ObfuscatedName("m.h(B)V")
    public static void method23() {
        try {
            if (field2863 == 1) {
                int var0 = Statics.field2862.method3255();
                if (var0 > 0 && Statics.field2862.method3261()) {
                    int var1 = var0 - Statics.field1482;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2862.method3254(var1);
                    return;
                }
                Statics.field2862.method3260();
                Statics.field2862.method3285();
                if (Statics.field2866 == null) {
                    field2863 = 0;
                } else {
                    field2863 = 2;
                }
                Statics.field183 = null;
                Statics.field2490 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2862.method3260();
            field2863 = 0;
            Statics.field183 = null;
            Statics.field2490 = null;
            Statics.field2866 = null;
        }
    }
}
