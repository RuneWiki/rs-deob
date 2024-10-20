package deob;

@ObfuscatedName("ft")
public class class166 {

    @ObfuscatedName("ft.h")
    public static int field2749 = 0;

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.b(Lex;Lex;Lex;Lfq;I)Z")
    public static boolean method1011(class151 arg0, class151 arg1, class151 arg2, class167 arg3) {
        Statics.field2747 = arg0;
        Statics.field2752 = arg1;
        Statics.field2746 = arg2;
        Statics.field1963 = arg3;
        return true;
    }

    @ObfuscatedName("fg.e(Lex;IIIZB)V")
    public static void method2949(class151 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2749 = 1;
        Statics.field2750 = arg0;
        Statics.field2751 = arg1;
        Statics.field2748 = arg2;
        Statics.field2753 = arg3;
        Statics.field2754 = arg4;
        Statics.field2108 = 10000;
    }

    @ObfuscatedName("cx.i(B)V")
    public static void method2062() {
        Statics.field1963.method3101();
        field2749 = 1;
        Statics.field2750 = null;
    }

    @ObfuscatedName("m.k(ILex;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method480(int arg0, class151 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2778(arg2);
        int var7 = arg1.method2839(var6, arg3);
        method2742(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("et.h(ILex;IIIZB)V")
    public static void method2742(int arg0, class151 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2749 = 1;
        Statics.field2750 = arg1;
        Statics.field2751 = arg2;
        Statics.field2748 = arg3;
        Statics.field2753 = arg4;
        Statics.field2754 = arg5;
        Statics.field2108 = arg0;
    }

    @ObfuscatedName("ew.p(IB)V")
    public static void method2738(int arg0) {
        field2749 = 1;
        Statics.field2750 = null;
        Statics.field2751 = -1;
        Statics.field2748 = -1;
        Statics.field2753 = 0;
        Statics.field2754 = false;
        Statics.field2108 = arg0;
    }

    @ObfuscatedName("cm.n(I)Z")
    public static boolean method2069() {
        return field2749 == 0 ? Statics.field1963.method3104() : true;
    }

    @ObfuscatedName("q.o(B)Z")
    public static boolean method154() {
        try {
            if (field2749 == 2) {
                if (Statics.field642 == null) {
                    Statics.field642 = class163.method2998(Statics.field2750, Statics.field2751, Statics.field2748);
                    if (Statics.field642 == null) {
                        return false;
                    }
                }
                if (Statics.field1509 == null) {
                    Statics.field1509 = new class54(Statics.field2746, Statics.field2752);
                }
                if (Statics.field1963.method3097(Statics.field642, Statics.field2747, Statics.field1509, 22050)) {
                    Statics.field1963.method3098();
                    Statics.field1963.method3095(Statics.field2753);
                    Statics.field1963.method3100(Statics.field642, Statics.field2754);
                    field2749 = 0;
                    Statics.field642 = null;
                    Statics.field1509 = null;
                    Statics.field2750 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field1963.method3101();
            field2749 = 0;
            Statics.field642 = null;
            Statics.field1509 = null;
            Statics.field2750 = null;
        }
        return false;
    }
}
