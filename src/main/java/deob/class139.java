package deob;

@ObfuscatedName("eh")
public class class139 {

    @ObfuscatedName("eh.y")
    public static int field1903 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.b(Lgv;IIIZI)V")
    public static void method1859(class183 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1903 = 1;
        Statics.field889 = arg0;
        Statics.field1906 = arg1;
        Statics.field1899 = arg2;
        Statics.field1909 = arg3;
        Statics.field135 = arg4;
        Statics.field1904 = 10000;
    }

    @ObfuscatedName("gr.e(II)V")
    public static void method3214(int arg0) {
        if (field1903 == 0) {
            Statics.field1902.method2409(arg0);
        } else {
            Statics.field1909 = arg0;
        }
    }

    @ObfuscatedName("bv.c(ILgv;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1137(int arg0, class183 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3141(arg2);
        int var7 = arg1.method3138(var6, arg3);
        method2002(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("dx.l(ILgv;IIIZI)V")
    public static void method2002(int arg0, class183 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1903 = 1;
        Statics.field889 = arg1;
        Statics.field1906 = arg2;
        Statics.field1899 = arg3;
        Statics.field1909 = arg4;
        Statics.field135 = arg5;
        Statics.field1904 = arg0;
    }

    @ObfuscatedName("c.y(I)Z")
    public static boolean method31() {
        return field1903 == 0 ? Statics.field1902.method2415() : true;
    }

    @ObfuscatedName("ad.j(I)V")
    public static void method901() {
        try {
            if (field1903 == 1) {
                int var0 = Statics.field1902.method2497();
                if (var0 > 0 && Statics.field1902.method2415()) {
                    int var1 = var0 - Statics.field1904;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1902.method2409(var1);
                    return;
                }
                Statics.field1902.method2414();
                Statics.field1902.method2412();
                if (Statics.field889 == null) {
                    field1903 = 0;
                } else {
                    field1903 = 2;
                }
                Statics.field944 = null;
                Statics.field1200 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1902.method2414();
            field1903 = 0;
            Statics.field944 = null;
            Statics.field1200 = null;
            Statics.field889 = null;
        }
    }
}
