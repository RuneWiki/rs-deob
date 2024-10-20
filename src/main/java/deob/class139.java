package deob;

@ObfuscatedName("ev")
public class class139 {

    @ObfuscatedName("ev.h")
    public static int field1930 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.o(Lgl;Lgl;Lgl;Lea;I)Z")
    public static boolean method1863(class183 arg0, class183 arg1, class183 arg2, class140 arg3) {
        Statics.field1935 = arg0;
        Statics.field1929 = arg1;
        Statics.field1928 = arg2;
        Statics.field1927 = arg3;
        return true;
    }

    @ObfuscatedName("m.m(Lgl;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method17(class183 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3027(arg1);
        int var6 = arg0.method3028(var5, arg2);
        method1761(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("cn.b(Lgl;IIIZB)V")
    public static void method1761(class183 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1930 = 1;
        Statics.field1931 = arg0;
        Statics.field1932 = arg1;
        Statics.field2712 = arg2;
        Statics.field1933 = arg3;
        Statics.field666 = arg4;
        Statics.field187 = 10000;
    }

    @ObfuscatedName("n.g(II)V")
    public static void method194(int arg0) {
        if (field1930 == 0) {
            Statics.field1927.method2299(arg0);
        } else {
            Statics.field1933 = arg0;
        }
    }

    @ObfuscatedName("ap.l(I)V")
    public static void method858() {
        Statics.field1927.method2333();
        field1930 = 1;
        Statics.field1931 = null;
    }

    @ObfuscatedName("ds.c(II)V")
    public static void method2091(int arg0) {
        field1930 = 1;
        Statics.field1931 = null;
        Statics.field1932 = -1;
        Statics.field2712 = -1;
        Statics.field1933 = 0;
        Statics.field666 = false;
        Statics.field187 = arg0;
    }

    @ObfuscatedName("av.u(I)Z")
    public static boolean method654() {
        return field1930 == 0 ? Statics.field1927.method2306() : true;
    }

    @ObfuscatedName("cj.k(B)V")
    public static void method1808() {
        try {
            if (field1930 == 1) {
                int var0 = Statics.field1927.method2300();
                if (var0 > 0 && Statics.field1927.method2306()) {
                    int var1 = var0 - Statics.field187;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1927.method2299(var1);
                    return;
                }
                Statics.field1927.method2333();
                Statics.field1927.method2303();
                if (Statics.field1931 == null) {
                    field1930 = 0;
                } else {
                    field1930 = 2;
                }
                Statics.field1084 = null;
                Statics.field933 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1927.method2333();
            field1930 = 0;
            Statics.field1084 = null;
            Statics.field933 = null;
            Statics.field1931 = null;
        }
    }
}
