package deob;

@ObfuscatedName("gl")
public class class183 {

    @ObfuscatedName("gl.a")
    public static int field2946 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.i(Lfn;IIIZS)V")
    public static void method152(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2946 = 1;
        Statics.field2944 = arg0;
        Statics.field2950 = arg1;
        Statics.field2949 = arg2;
        Statics.field2031 = arg3;
        Statics.field2121 = arg4;
        Statics.field2129 = 10000;
    }

    @ObfuscatedName("dq.v(B)V")
    public static void method2222() {
        Statics.field791.method3369();
        field2946 = 1;
        Statics.field2944 = null;
    }

    @ObfuscatedName("ei.f(ILfn;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2770(int arg0, class167 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3033(arg2);
        int var7 = arg1.method3035(var6, arg3);
        method588(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("ak.h(ILfn;IIIZI)V")
    public static void method588(int arg0, class167 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2946 = 1;
        Statics.field2944 = arg1;
        Statics.field2950 = arg2;
        Statics.field2949 = arg3;
        Statics.field2031 = arg4;
        Statics.field2121 = arg5;
        Statics.field2129 = arg0;
    }

    @ObfuscatedName("ac.a(B)V")
    public static void method696() {
        try {
            if (field2946 == 1) {
                int var0 = Statics.field791.method3367();
                if (var0 > 0 && Statics.field791.method3370()) {
                    int var1 = var0 - Statics.field2129;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field791.method3362(var1);
                    return;
                }
                Statics.field791.method3369();
                Statics.field791.method3339();
                if (Statics.field2944 == null) {
                    field2946 = 0;
                } else {
                    field2946 = 2;
                }
                Statics.field137 = null;
                Statics.field3136 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field791.method3369();
            field2946 = 0;
            Statics.field137 = null;
            Statics.field3136 = null;
            Statics.field2944 = null;
        }
    }

    @ObfuscatedName("fh.s(I)Z")
    public static boolean method3194() {
        try {
            if (field2946 == 2) {
                if (Statics.field137 == null) {
                    Statics.field137 = class180.method3256(Statics.field2944, Statics.field2950, Statics.field2949);
                    if (Statics.field137 == null) {
                        return false;
                    }
                }
                if (Statics.field3136 == null) {
                    Statics.field3136 = new class60(Statics.field2945, Statics.field2948);
                }
                if (Statics.field791.method3405(Statics.field137, Statics.field3126, Statics.field3136, 22050)) {
                    Statics.field791.method3338();
                    Statics.field791.method3362(Statics.field2031);
                    Statics.field791.method3340(Statics.field137, Statics.field2121);
                    field2946 = 0;
                    Statics.field137 = null;
                    Statics.field3136 = null;
                    Statics.field2944 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field791.method3369();
            field2946 = 0;
            Statics.field137 = null;
            Statics.field3136 = null;
            Statics.field2944 = null;
        }
        return false;
    }
}
