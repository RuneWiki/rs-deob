package deob;

@ObfuscatedName("es")
public class class139 {

    @ObfuscatedName("es.k")
    public static int field2379 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.b(Leo;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1539(class153 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2978(arg1);
        int var6 = arg0.method2979(var5, arg2);
        method2683(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ei.c(Leo;IIIZI)V")
    public static void method2683(class153 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2379 = 1;
        Statics.field2380 = arg0;
        Statics.field2381 = arg1;
        Statics.field2383 = arg2;
        Statics.field89 = arg3;
        Statics.field1543 = arg4;
        Statics.field2382 = 10000;
    }

    @ObfuscatedName("bi.j(B)V")
    public static void method1348() {
        try {
            if (field2379 == 1) {
                int var0 = Statics.field68.method2728();
                if (var0 > 0 && Statics.field68.method2733()) {
                    int var1 = var0 - Statics.field2382;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field68.method2754(var1);
                    return;
                }
                Statics.field68.method2755();
                Statics.field68.method2731();
                if (Statics.field2380 == null) {
                    field2379 = 0;
                } else {
                    field2379 = 2;
                }
                Statics.field249 = null;
                Statics.field2021 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field68.method2755();
            field2379 = 0;
            Statics.field249 = null;
            Statics.field2021 = null;
            Statics.field2380 = null;
        }
    }
}
