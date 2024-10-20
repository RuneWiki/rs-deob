package deob;

@ObfuscatedName("eu")
public class class139 {

    @ObfuscatedName("eu.k")
    public static int field1916 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cg.b(Lgj;Lgj;Lgj;Ley;B)Z")
    public static boolean method1882(class183 arg0, class183 arg1, class183 arg2, class140 arg3) {
        Statics.field1917 = arg0;
        Statics.field1914 = arg1;
        Statics.field1915 = arg2;
        Statics.field801 = arg3;
        return true;
    }

    @ObfuscatedName("dn.l(Lgj;IIIZB)V")
    public static void method2044(class183 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1916 = 1;
        Statics.field1919 = arg0;
        Statics.field206 = arg1;
        Statics.field1447 = arg2;
        Statics.field1562 = arg3;
        Statics.field1714 = arg4;
        Statics.field1918 = 10000;
    }

    @ObfuscatedName("af.i(B)V")
    public static void method677() {
        Statics.field801.method2506();
        field1916 = 1;
        Statics.field1919 = null;
    }

    @ObfuscatedName("g.t(ILgj;IIIZI)V")
    public static void method614(int arg0, class183 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1916 = 1;
        Statics.field1919 = arg1;
        Statics.field206 = arg2;
        Statics.field1447 = arg3;
        Statics.field1562 = arg4;
        Statics.field1714 = arg5;
        Statics.field1918 = arg0;
    }

    @ObfuscatedName("ae.k(II)V")
    public static void method757(int arg0) {
        field1916 = 1;
        Statics.field1919 = null;
        Statics.field206 = -1;
        Statics.field1447 = -1;
        Statics.field1562 = 0;
        Statics.field1714 = false;
        Statics.field1918 = arg0;
    }

    @ObfuscatedName("bk.x(B)V")
    public static void method1162() {
        try {
            if (field1916 == 1) {
                int var0 = Statics.field801.method2413();
                if (var0 > 0 && Statics.field801.method2417()) {
                    int var1 = var0 - Statics.field1918;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field801.method2410(var1);
                    return;
                }
                Statics.field801.method2506();
                Statics.field801.method2492();
                if (Statics.field1919 == null) {
                    field1916 = 0;
                } else {
                    field1916 = 2;
                }
                Statics.field953 = null;
                Statics.field42 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field801.method2506();
            field1916 = 0;
            Statics.field953 = null;
            Statics.field42 = null;
            Statics.field1919 = null;
        }
    }
}
