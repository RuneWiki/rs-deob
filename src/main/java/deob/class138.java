package deob;

@ObfuscatedName("ez")
public class class138 {

    @ObfuscatedName("ez.k")
    public static int field2326 = 0;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bv.a(Lev;IIIZI)V")
    public static void method1509(class152 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2326 = 1;
        Statics.field1998 = arg0;
        Statics.field2327 = arg1;
        Statics.field732 = arg2;
        Statics.field2328 = arg3;
        Statics.field735 = arg4;
        Statics.field2329 = 10000;
    }

    @ObfuscatedName("bz.r(II)V")
    public static void method1286(int arg0) {
        if (field2326 == 0) {
            Statics.field2323.method2769(arg0);
        } else {
            Statics.field2328 = arg0;
        }
    }

    @ObfuscatedName("eh.u(I)V")
    public static void method2623() {
        Statics.field2323.method2681();
        field2326 = 1;
        Statics.field1998 = null;
    }

    @ObfuscatedName("av.t(I)Z")
    public static boolean method829() {
        return field2326 == 0 ? Statics.field2323.method2682() : true;
    }

    @ObfuscatedName("cc.k(B)V")
    public static void method1988() {
        try {
            if (field2326 == 1) {
                int var0 = Statics.field2323.method2721();
                if (var0 > 0 && Statics.field2323.method2682()) {
                    int var1 = var0 - Statics.field2329;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2323.method2769(var1);
                    return;
                }
                Statics.field2323.method2681();
                Statics.field2323.method2679();
                if (Statics.field1998 == null) {
                    field2326 = 0;
                } else {
                    field2326 = 2;
                }
                Statics.field1026 = null;
                Statics.field2331 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2323.method2681();
            field2326 = 0;
            Statics.field1026 = null;
            Statics.field2331 = null;
            Statics.field1998 = null;
        }
    }

    @ObfuscatedName("ek.x(I)Z")
    public static boolean method2634() {
        try {
            if (field2326 == 2) {
                if (Statics.field1026 == null) {
                    Statics.field1026 = class139.method2654(Statics.field1998, Statics.field2327, Statics.field732);
                    if (Statics.field1026 == null) {
                        return false;
                    }
                }
                if (Statics.field2331 == null) {
                    Statics.field2331 = new class58(Statics.field2324, Statics.field2322);
                }
                if (Statics.field2323.method2733(Statics.field1026, Statics.field2330, Statics.field2331, 22050)) {
                    Statics.field2323.method2753();
                    Statics.field2323.method2769(Statics.field2328);
                    Statics.field2323.method2680(Statics.field1026, Statics.field735);
                    field2326 = 0;
                    Statics.field1026 = null;
                    Statics.field2331 = null;
                    Statics.field1998 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2323.method2681();
            field2326 = 0;
            Statics.field1026 = null;
            Statics.field2331 = null;
            Statics.field1998 = null;
        }
        return false;
    }
}
