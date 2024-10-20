package deob;

@ObfuscatedName("gh")
public class class183 {

    @ObfuscatedName("gh.g")
    public static int field2945 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fc.l(Lfo;Lfo;Lfo;Lgt;I)Z")
    public static boolean method3169(class167 arg0, class167 arg1, class167 arg2, class184 arg3) {
        Statics.field2944 = arg0;
        Statics.field3215 = arg1;
        Statics.field2942 = arg2;
        Statics.field2941 = arg3;
        return true;
    }

    @ObfuscatedName("av.e(Lfo;IIIZB)V")
    public static void method995(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2945 = 1;
        Statics.field2579 = arg0;
        Statics.field634 = arg1;
        Statics.field2010 = arg2;
        Statics.field2047 = arg3;
        Statics.field2633 = arg4;
        Statics.field2260 = 10000;
    }

    @ObfuscatedName("eg.q(ILfo;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2943(int arg0, class167 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3056(arg2);
        int var7 = arg1.method3091(var6, arg3);
        method2076(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("cz.o(ILfo;IIIZS)V")
    public static void method2076(int arg0, class167 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2945 = 1;
        Statics.field2579 = arg1;
        Statics.field634 = arg2;
        Statics.field2010 = arg3;
        Statics.field2047 = arg4;
        Statics.field2633 = arg5;
        Statics.field2260 = arg0;
    }

    @ObfuscatedName("am.g(II)V")
    public static void method668(int arg0) {
        field2945 = 1;
        Statics.field2579 = null;
        Statics.field634 = -1;
        Statics.field2010 = -1;
        Statics.field2047 = 0;
        Statics.field2633 = false;
        Statics.field2260 = arg0;
    }
}
