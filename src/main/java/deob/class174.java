package deob;

@ObfuscatedName("fa")
public class class174 {

    @ObfuscatedName("fa.h")
    public static int field2858 = 0;

    public class174() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ez.n(Lfd;Lfd;Lfd;Lfk;I)Z")
    public static boolean method2774(class158 arg0, class158 arg1, class158 arg2, class175 arg3) {
        Statics.field2862 = arg0;
        Statics.field1915 = arg1;
        Statics.field2857 = arg2;
        Statics.field2855 = arg3;
        return true;
    }

    @ObfuscatedName("g.w(Lfd;Ljava/lang/String;Ljava/lang/String;IZS)V")
    public static void method161(class158 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2925(arg1);
        int var6 = arg0.method2864(var5, arg2);
        method167(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("k.i(Lfd;IIIZI)V")
    public static void method167(class158 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2858 = 1;
        Statics.field2859 = arg0;
        Statics.field1085 = arg1;
        Statics.field1522 = arg2;
        Statics.field2860 = arg3;
        Statics.field1284 = arg4;
        Statics.field2137 = 10000;
    }

    @ObfuscatedName("ca.h(I)V")
    public static void method2070() {
        Statics.field2855.method3243();
        field2858 = 1;
        Statics.field2859 = null;
    }

    @ObfuscatedName("cn.q(ILfd;Ljava/lang/String;Ljava/lang/String;IZS)V")
    public static void method1877(int arg0, class158 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2925(arg2);
        int var7 = arg1.method2864(var6, arg3);
        method566(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("av.l(ILfd;IIIZI)V")
    public static void method566(int arg0, class158 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2858 = 1;
        Statics.field2859 = arg1;
        Statics.field1085 = arg2;
        Statics.field1522 = arg3;
        Statics.field2860 = arg4;
        Statics.field1284 = arg5;
        Statics.field2137 = arg0;
    }

    @ObfuscatedName("ei.c(I)Z")
    public static boolean method2625() {
        return field2858 == 0 ? Statics.field2855.method3195() : true;
    }

    @ObfuscatedName("es.f(B)V")
    public static void method2755() {
        try {
            if (field2858 == 1) {
                int var0 = Statics.field2855.method3189();
                if (var0 > 0 && Statics.field2855.method3195()) {
                    int var1 = var0 - Statics.field2137;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2855.method3188(var1);
                    return;
                }
                Statics.field2855.method3243();
                Statics.field2855.method3192();
                if (Statics.field2859 == null) {
                    field2858 = 0;
                } else {
                    field2858 = 2;
                }
                Statics.field2861 = null;
                Statics.field1151 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2855.method3243();
            field2858 = 0;
            Statics.field2861 = null;
            Statics.field1151 = null;
            Statics.field2859 = null;
        }
    }

    @ObfuscatedName("ah.s(S)Z")
    public static boolean method719() {
        try {
            if (field2858 == 2) {
                if (Statics.field2861 == null) {
                    Statics.field2861 = class171.method3083(Statics.field2859, Statics.field1085, Statics.field1522);
                    if (Statics.field2861 == null) {
                        return false;
                    }
                }
                if (Statics.field1151 == null) {
                    Statics.field1151 = new class55(Statics.field2857, Statics.field1915);
                }
                if (Statics.field2855.method3190(Statics.field2861, Statics.field2862, Statics.field1151, 22050)) {
                    Statics.field2855.method3271();
                    Statics.field2855.method3188(Statics.field2860);
                    Statics.field2855.method3193(Statics.field2861, Statics.field1284);
                    field2858 = 0;
                    Statics.field2861 = null;
                    Statics.field1151 = null;
                    Statics.field2859 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2855.method3243();
            field2858 = 0;
            Statics.field2861 = null;
            Statics.field1151 = null;
            Statics.field2859 = null;
        }
        return false;
    }
}
