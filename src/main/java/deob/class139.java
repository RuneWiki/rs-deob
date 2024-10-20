package deob;

@ObfuscatedName("eg")
public class class139 {

    @ObfuscatedName("eg.g")
    public static int field1915 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.i(Lgq;Ljava/lang/String;Ljava/lang/String;IZS)V")
    public static void method191(class183 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3028(arg1);
        int var6 = arg0.method3029(var5, arg2);
        method2051(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("db.e(Lgq;IIIZI)V")
    public static void method2051(class183 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1915 = 1;
        Statics.field2015 = arg0;
        Statics.field694 = arg1;
        Statics.field1916 = arg2;
        Statics.field1221 = arg3;
        Statics.field1222 = arg4;
        Statics.field1917 = 10000;
    }

    @ObfuscatedName("fl.f(II)V")
    public static void method2867(int arg0) {
        if (field1915 == 0) {
            Statics.field1914.method2319(arg0);
        } else {
            Statics.field1221 = arg0;
        }
    }

    @ObfuscatedName("fj.k(I)V")
    public static void method2987() {
        Statics.field1914.method2315();
        field1915 = 1;
        Statics.field2015 = null;
    }

    @ObfuscatedName("av.a(ILgq;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method679(int arg0, class183 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3028(arg2);
        int var7 = arg1.method3029(var6, arg3);
        field1915 = 1;
        Statics.field2015 = arg1;
        Statics.field694 = var6;
        Statics.field1916 = var7;
        Statics.field1221 = arg4;
        Statics.field1222 = arg5;
        Statics.field1917 = arg0;
    }

    @ObfuscatedName("af.q(I)Z")
    public static boolean method685() {
        return field1915 == 0 ? Statics.field1914.method2310() : true;
    }

    @ObfuscatedName("i.w(I)V")
    public static void method7() {
        try {
            if (field1915 == 1) {
                int var0 = Statics.field1914.method2403();
                if (var0 > 0 && Statics.field1914.method2310()) {
                    int var1 = var0 - Statics.field1917;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1914.method2319(var1);
                    return;
                }
                Statics.field1914.method2315();
                Statics.field1914.method2314();
                if (Statics.field2015 == null) {
                    field1915 = 0;
                } else {
                    field1915 = 2;
                }
                Statics.field1918 = null;
                Statics.field1761 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1914.method2315();
            field1915 = 0;
            Statics.field1918 = null;
            Statics.field1761 = null;
            Statics.field2015 = null;
        }
    }
}
