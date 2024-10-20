package deob;

@ObfuscatedName("gc")
public class class187 {

    @ObfuscatedName("gc.n")
    public static int field3011 = 0;

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fp.i(Lfu;Lfu;Lfu;Lgn;I)Z")
    public static boolean method3185(class171 arg0, class171 arg1, class171 arg2, class188 arg3) {
        Statics.field3012 = arg0;
        Statics.field3015 = arg1;
        Statics.field3013 = arg2;
        Statics.field3014 = arg3;
        return true;
    }

    @ObfuscatedName("cg.h(Lfu;IIIZI)V")
    public static void method2091(class171 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3011 = 1;
        Statics.field801 = arg0;
        Statics.field1824 = arg1;
        Statics.field3016 = arg2;
        Statics.field3017 = arg3;
        Statics.field3018 = arg4;
        Statics.field1155 = 10000;
    }

    @ObfuscatedName("ak.e(I)V")
    public static void method646() {
        Statics.field3014.method3494();
        field3011 = 1;
        Statics.field801 = null;
    }

    @ObfuscatedName("f.g(I)V")
    public static void method540() {
        try {
            if (field3011 == 1) {
                int var0 = Statics.field3014.method3412();
                if (var0 > 0 && Statics.field3014.method3416()) {
                    int var1 = var0 - Statics.field1155;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field3014.method3411(var1);
                    return;
                }
                Statics.field3014.method3494();
                Statics.field3014.method3438();
                if (Statics.field801 == null) {
                    field3011 = 0;
                } else {
                    field3011 = 2;
                }
                Statics.field1144 = null;
                Statics.field220 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field3014.method3494();
            field3011 = 0;
            Statics.field1144 = null;
            Statics.field220 = null;
            Statics.field801 = null;
        }
    }
}
