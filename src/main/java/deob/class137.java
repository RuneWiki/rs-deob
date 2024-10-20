package deob;

@ObfuscatedName("el")
public class class137 {

    @ObfuscatedName("el.n")
    public static int field2324 = 0;

    public class137() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cx.u(Leb;IIIZI)V")
    public static void method2042(class151 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2324 = 1;
        Statics.field2554 = arg0;
        Statics.field2325 = arg1;
        Statics.field2321 = arg2;
        Statics.field2322 = arg3;
        Statics.field1263 = arg4;
        Statics.field76 = 10000;
    }

    @ObfuscatedName("cp.k(I)Z")
    public static boolean method1643() {
        return field2324 == 0 ? Statics.field2323.method2721() : true;
    }

    @ObfuscatedName("bx.x(B)V")
    public static void method1416() {
        try {
            if (field2324 == 1) {
                int var0 = Statics.field2323.method2781();
                if (var0 > 0 && Statics.field2323.method2721()) {
                    int var1 = var0 - Statics.field76;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2323.method2718(var1);
                    return;
                }
                Statics.field2323.method2723();
                Statics.field2323.method2722();
                if (Statics.field2554 == null) {
                    field2324 = 0;
                } else {
                    field2324 = 2;
                }
                Statics.field2328 = null;
                Statics.field737 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2323.method2723();
            field2324 = 0;
            Statics.field2328 = null;
            Statics.field737 = null;
            Statics.field2554 = null;
        }
    }
}
