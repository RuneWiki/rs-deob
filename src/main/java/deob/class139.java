package deob;

@ObfuscatedName("eh")
public class class139 {

    @ObfuscatedName("eh.w")
    public static int field1921 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.j(II)V")
    public static void method64(int arg0) {
        if (field1921 == 0) {
            Statics.field1920.method2403(arg0);
        } else {
            Statics.field246 = arg0;
        }
    }

    @ObfuscatedName("cw.c(IB)V")
    public static void method1510(int arg0) {
        field1921 = 1;
        Statics.field1917 = null;
        Statics.field1923 = -1;
        Statics.field87 = -1;
        Statics.field246 = 0;
        Statics.field1924 = false;
        Statics.field303 = arg0;
    }

    @ObfuscatedName("s.d(I)Z")
    public static boolean method200() {
        return field1921 == 0 ? Statics.field1920.method2379() : true;
    }

    @ObfuscatedName("ai.w(B)Z")
    public static boolean method857() {
        try {
            if (field1921 == 2) {
                if (Statics.field2680 == null) {
                    Statics.field2680 = class145.method2559(Statics.field1917, Statics.field1923, Statics.field87);
                    if (Statics.field2680 == null) {
                        return false;
                    }
                }
                if (Statics.field722 == null) {
                    Statics.field722 = new class61(Statics.field1919, Statics.field1918);
                }
                if (Statics.field1920.method2431(Statics.field2680, Statics.field1925, Statics.field722, 22050)) {
                    Statics.field1920.method2375();
                    Statics.field1920.method2403(Statics.field246);
                    Statics.field1920.method2392(Statics.field2680, Statics.field1924);
                    field1921 = 0;
                    Statics.field2680 = null;
                    Statics.field722 = null;
                    Statics.field1917 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field1920.method2378();
            field1921 = 0;
            Statics.field2680 = null;
            Statics.field722 = null;
            Statics.field1917 = null;
        }
        return false;
    }
}
