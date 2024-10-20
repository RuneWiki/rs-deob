package deob;

@ObfuscatedName("gl")
public class class183 {

    @ObfuscatedName("gl.j")
    public static int field2936 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.n(Lfm;Lfm;Lfm;Lgk;I)Z")
    public static boolean method2920(class167 arg0, class167 arg1, class167 arg2, class184 arg3) {
        Statics.field2945 = arg0;
        Statics.field2940 = arg1;
        Statics.field2938 = arg2;
        Statics.field1965 = arg3;
        return true;
    }

    @ObfuscatedName("ft.d(Lfm;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method2987(class167 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3024(arg1);
        int var6 = arg0.method3026(var5, arg2);
        method169(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("t.s(Lfm;IIIZS)V")
    public static void method169(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2936 = 1;
        Statics.field1440 = arg0;
        Statics.field2939 = arg1;
        Statics.field2941 = arg2;
        Statics.field2942 = arg3;
        Statics.field768 = arg4;
        Statics.field1386 = 10000;
    }

    @ObfuscatedName("dv.q(ILfm;IIIZB)V")
    public static void method2275(int arg0, class167 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2936 = 1;
        Statics.field1440 = arg1;
        Statics.field2939 = arg2;
        Statics.field2941 = arg3;
        Statics.field2942 = arg4;
        Statics.field768 = arg5;
        Statics.field1386 = arg0;
    }

    @ObfuscatedName("ad.j(IB)V")
    public static void method641(int arg0) {
        field2936 = 1;
        Statics.field1440 = null;
        Statics.field2939 = -1;
        Statics.field2941 = -1;
        Statics.field2942 = 0;
        Statics.field768 = false;
        Statics.field1386 = arg0;
    }

    @ObfuscatedName("c.k(B)V")
    public static void method572() {
        try {
            if (field2936 == 1) {
                int var0 = Statics.field1965.method3384();
                if (var0 > 0 && Statics.field1965.method3414()) {
                    int var1 = var0 - Statics.field1386;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1965.method3387(var1);
                    return;
                }
                Statics.field1965.method3360();
                Statics.field1965.method3444();
                if (Statics.field1440 == null) {
                    field2936 = 0;
                } else {
                    field2936 = 2;
                }
                Statics.field2943 = null;
                Statics.field855 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1965.method3360();
            field2936 = 0;
            Statics.field2943 = null;
            Statics.field855 = null;
            Statics.field1440 = null;
        }
    }
}
