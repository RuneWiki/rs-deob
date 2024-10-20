package deob;

@ObfuscatedName("fy")
public class class174 {

    @ObfuscatedName("fy.i")
    public static int field2850 = 0;

    public class174() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bo.t(Lfj;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1417(class158 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2892(arg1);
        int var6 = arg0.method2897(var5, arg2);
        method2991(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("fl.b(Lfj;IIIZB)V")
    public static void method2991(class158 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2850 = 1;
        Statics.field2852 = arg0;
        Statics.field1846 = arg1;
        Statics.field2849 = arg2;
        Statics.field622 = arg3;
        Statics.field2845 = arg4;
        Statics.field1546 = 10000;
    }

    @ObfuscatedName("ac.p(II)V")
    public static void method608(int arg0) {
        if (field2850 == 0) {
            Statics.field2525.method3281(arg0);
        } else {
            Statics.field622 = arg0;
        }
    }

    @ObfuscatedName("ap.e(ILfj;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method622(int arg0, class158 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2892(arg2);
        int var7 = arg1.method2897(var6, arg3);
        method2597(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("dt.i(ILfj;IIIZI)V")
    public static void method2597(int arg0, class158 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2850 = 1;
        Statics.field2852 = arg1;
        Statics.field1846 = arg2;
        Statics.field2849 = arg3;
        Statics.field622 = arg4;
        Statics.field2845 = arg5;
        Statics.field1546 = arg0;
    }

    @ObfuscatedName("dx.o(II)V")
    public static void method2509(int arg0) {
        field2850 = 1;
        Statics.field2852 = null;
        Statics.field1846 = -1;
        Statics.field2849 = -1;
        Statics.field622 = 0;
        Statics.field2845 = false;
        Statics.field1546 = arg0;
    }

    @ObfuscatedName("j.f(I)Z")
    public static boolean method108() {
        return field2850 == 0 ? Statics.field2525.method3218() : true;
    }

    @ObfuscatedName("ev.d(I)V")
    public static void method2794() {
        try {
            if (field2850 == 1) {
                int var0 = Statics.field2525.method3212();
                if (var0 > 0 && Statics.field2525.method3218()) {
                    int var1 = var0 - Statics.field1546;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2525.method3281(var1);
                    return;
                }
                Statics.field2525.method3217();
                Statics.field2525.method3215();
                if (Statics.field2852 == null) {
                    field2850 = 0;
                } else {
                    field2850 = 2;
                }
                Statics.field1073 = null;
                Statics.field1904 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2525.method3217();
            field2850 = 0;
            Statics.field1073 = null;
            Statics.field1904 = null;
            Statics.field2852 = null;
        }
    }

    @ObfuscatedName("es.j(B)Z")
    public static boolean method2792() {
        try {
            if (field2850 == 2) {
                if (Statics.field1073 == null) {
                    Statics.field1073 = class171.method3127(Statics.field2852, Statics.field1846, Statics.field2849);
                    if (Statics.field1073 == null) {
                        return false;
                    }
                }
                if (Statics.field1904 == null) {
                    Statics.field1904 = new class55(Statics.field2846, Statics.field2848);
                }
                if (Statics.field2525.method3213(Statics.field1073, Statics.field620, Statics.field1904, 22050)) {
                    Statics.field2525.method3267();
                    Statics.field2525.method3281(Statics.field622);
                    Statics.field2525.method3308(Statics.field1073, Statics.field2845);
                    field2850 = 0;
                    Statics.field1073 = null;
                    Statics.field1904 = null;
                    Statics.field2852 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2525.method3217();
            field2850 = 0;
            Statics.field1073 = null;
            Statics.field1904 = null;
            Statics.field2852 = null;
        }
        return false;
    }
}
