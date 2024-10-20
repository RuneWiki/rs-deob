package deob;

@ObfuscatedName("gd")
public class class184 {

    @ObfuscatedName("gd.p")
    public static int field2959 = 0;

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.e(Lft;IIIZI)V")
    public static void method2060(class168 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2959 = 1;
        Statics.field210 = arg0;
        Statics.field2220 = arg1;
        Statics.field2657 = arg2;
        Statics.field1612 = arg3;
        Statics.field2031 = arg4;
        Statics.field3119 = 10000;
    }

    @ObfuscatedName("am.w(B)V")
    public static void method760() {
        Statics.field2958.method3421();
        field2959 = 1;
        Statics.field210 = null;
    }

    @ObfuscatedName("ft.f(ILft;Ljava/lang/String;Ljava/lang/String;IZS)V")
    public static void method3089(int arg0, class168 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3023(arg2);
        int var7 = arg1.method3039(var6, arg3);
        field2959 = 1;
        Statics.field210 = arg1;
        Statics.field2220 = var6;
        Statics.field2657 = var7;
        Statics.field1612 = arg4;
        Statics.field2031 = arg5;
        Statics.field3119 = arg0;
    }

    @ObfuscatedName("p.s(II)V")
    public static void method45(int arg0) {
        field2959 = 1;
        Statics.field210 = null;
        Statics.field2220 = -1;
        Statics.field2657 = -1;
        Statics.field1612 = 0;
        Statics.field2031 = false;
        Statics.field3119 = arg0;
    }

    @ObfuscatedName("em.p(I)Z")
    public static boolean method2915() {
        return field2959 == 0 ? Statics.field2958.method3353() : true;
    }

    @ObfuscatedName("am.h(I)V")
    public static void method761() {
        try {
            if (field2959 == 1) {
                int var0 = Statics.field2958.method3348();
                if (var0 > 0 && Statics.field2958.method3353()) {
                    int var1 = var0 - Statics.field3119;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2958.method3347(var1);
                    return;
                }
                Statics.field2958.method3421();
                Statics.field2958.method3351();
                if (Statics.field210 == null) {
                    field2959 = 0;
                } else {
                    field2959 = 2;
                }
                Statics.field2956 = null;
                Statics.field3215 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2958.method3421();
            field2959 = 0;
            Statics.field2956 = null;
            Statics.field3215 = null;
            Statics.field210 = null;
        }
    }
}
