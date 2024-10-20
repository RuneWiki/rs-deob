package deob;

@ObfuscatedName("fa")
public class class174 {

    @ObfuscatedName("fa.e")
    public static int field2856 = 0;

    public class174() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.n(Lfs;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method628(class158 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2963(arg1);
        int var6 = arg0.method2964(var5, arg2);
        method3063(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("fx.d(Lfs;IIIZI)V")
    public static void method3063(class158 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2856 = 1;
        Statics.field87 = arg0;
        Statics.field2194 = arg1;
        Statics.field717 = arg2;
        Statics.field2151 = arg3;
        Statics.field63 = arg4;
        Statics.field1994 = 10000;
    }

    @ObfuscatedName("dw.z(B)V")
    public static void method2548() {
        Statics.field2854.method3302();
        field2856 = 1;
        Statics.field87 = null;
    }
}
