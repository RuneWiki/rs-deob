package deob;

@ObfuscatedName("gr")
public class class183 {

    @ObfuscatedName("gr.c")
    public static int field2943 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("es.k(Lfo;Lfo;Lfo;Lgf;B)Z")
    public static boolean method2760(class167 arg0, class167 arg1, class167 arg2, class184 arg3) {
        Statics.field2942 = arg0;
        Statics.field2947 = arg1;
        Statics.field2888 = arg2;
        Statics.field2151 = arg3;
        return true;
    }

    @ObfuscatedName("ae.h(Lfo;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method599(class167 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3064(arg1);
        int var6 = arg0.method3065(var5, arg2);
        method3242(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("fg.o(Lfo;IIIZI)V")
    public static void method3242(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2943 = 1;
        Statics.field2941 = arg0;
        Statics.field2945 = arg1;
        Statics.field158 = arg2;
        Statics.field2946 = arg3;
        Statics.field2944 = arg4;
        Statics.field722 = 10000;
    }

    @ObfuscatedName("gx.z(I)V")
    public static void method3505() {
        Statics.field2151.method3465();
        field2943 = 1;
        Statics.field2941 = null;
    }

    @ObfuscatedName("da.c(ILfo;Ljava/lang/String;Ljava/lang/String;IZS)V")
    public static void method2275(int arg0, class167 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3064(arg2);
        int var7 = arg1.method3065(var6, arg3);
        field2943 = 1;
        Statics.field2941 = arg1;
        Statics.field2945 = var6;
        Statics.field158 = var7;
        Statics.field2946 = arg4;
        Statics.field2944 = arg5;
        Statics.field722 = arg0;
    }
}
