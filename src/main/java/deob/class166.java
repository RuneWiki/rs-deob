package deob;

@ObfuscatedName("fb")
public class class166 {

    @ObfuscatedName("fb.r")
    public static int field2739 = 0;

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.p(Len;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method667(class151 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2762(arg1);
        int var6 = arg0.method2763(var5, arg2);
        method812(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("as.y(Len;IIIZB)V")
    public static void method812(class151 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2739 = 1;
        Statics.field2744 = arg0;
        Statics.field2034 = arg1;
        Statics.field2735 = arg2;
        Statics.field2742 = arg3;
        Statics.field2736 = arg4;
        Statics.field1879 = 10000;
    }

    @ObfuscatedName("f.d(II)V")
    public static void method81(int arg0) {
        if (field2739 == 0) {
            Statics.field2738.method3067(arg0);
        } else {
            Statics.field2742 = arg0;
        }
    }

    @ObfuscatedName("j.c(B)V")
    public static void method503() {
        Statics.field2738.method3085();
        field2739 = 1;
        Statics.field2744 = null;
    }

    @ObfuscatedName("cf.r(ILen;IIIZB)V")
    public static void method1890(int arg0, class151 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2739 = 1;
        Statics.field2744 = arg1;
        Statics.field2034 = arg2;
        Statics.field2735 = arg3;
        Statics.field2742 = arg4;
        Statics.field2736 = arg5;
        Statics.field1879 = arg0;
    }

    @ObfuscatedName("eq.f(II)V")
    public static void method2725(int arg0) {
        field2739 = 1;
        Statics.field2744 = null;
        Statics.field2034 = -1;
        Statics.field2735 = -1;
        Statics.field2742 = 0;
        Statics.field2736 = false;
        Statics.field1879 = arg0;
    }

    @ObfuscatedName("em.z(B)Z")
    public static boolean method2592() {
        return field2739 == 0 ? Statics.field2738.method3120() : true;
    }

    @ObfuscatedName("eh.o(I)V")
    public static void method2709() {
        try {
            if (field2739 == 1) {
                int var0 = Statics.field2738.method3068();
                if (var0 > 0 && Statics.field2738.method3120()) {
                    int var1 = var0 - Statics.field1879;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2738.method3067(var1);
                    return;
                }
                Statics.field2738.method3085();
                Statics.field2738.method3071();
                if (Statics.field2744 == null) {
                    field2739 = 0;
                } else {
                    field2739 = 2;
                }
                Statics.field1293 = null;
                Statics.field1421 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2738.method3085();
            field2739 = 0;
            Statics.field1293 = null;
            Statics.field1421 = null;
            Statics.field2744 = null;
        }
    }

    @ObfuscatedName("fd.k(B)Z")
    public static boolean method3182() {
        try {
            if (field2739 == 2) {
                if (Statics.field1293 == null) {
                    Statics.field1293 = class163.method2984(Statics.field2744, Statics.field2034, Statics.field2735);
                    if (Statics.field1293 == null) {
                        return false;
                    }
                }
                if (Statics.field1421 == null) {
                    Statics.field1421 = new class54(Statics.field2737, Statics.field2746);
                }
                if (Statics.field2738.method3100(Statics.field1293, Statics.field2741, Statics.field1421, 22050)) {
                    Statics.field2738.method3070();
                    Statics.field2738.method3067(Statics.field2742);
                    Statics.field2738.method3072(Statics.field1293, Statics.field2736);
                    field2739 = 0;
                    Statics.field1293 = null;
                    Statics.field1421 = null;
                    Statics.field2744 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2738.method3085();
            field2739 = 0;
            Statics.field1293 = null;
            Statics.field1421 = null;
            Statics.field2744 = null;
        }
        return false;
    }
}
