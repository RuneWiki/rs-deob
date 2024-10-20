package deob;

@ObfuscatedName("gz")
public class class183 {

    @ObfuscatedName("gz.y")
    public static int field2946 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fz.d(Lfn;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method3345(class167 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3106(arg1);
        int var6 = arg0.method3107(var5, arg2);
        method2994(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("em.p(Lfn;IIIZS)V")
    public static void method2994(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2946 = 1;
        Statics.field2947 = arg0;
        Statics.field3044 = arg1;
        Statics.field3146 = arg2;
        Statics.field2951 = arg3;
        Statics.field2011 = arg4;
        Statics.field2949 = 10000;
    }

    @ObfuscatedName("dw.v(II)V")
    public static void method2686(int arg0) {
        if (field2946 == 0) {
            Statics.field2948.method3435(arg0);
        } else {
            Statics.field2951 = arg0;
        }
    }

    @ObfuscatedName("fs.l(ILfn;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method3022(int arg0, class167 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3106(arg2);
        int var7 = arg1.method3107(var6, arg3);
        field2946 = 1;
        Statics.field2947 = arg1;
        Statics.field3044 = var6;
        Statics.field3146 = var7;
        Statics.field2951 = arg4;
        Statics.field2011 = arg5;
        Statics.field2949 = arg0;
    }

    @ObfuscatedName("eh.y(IB)V")
    public static void method2993(int arg0) {
        field2946 = 1;
        Statics.field2947 = null;
        Statics.field3044 = -1;
        Statics.field3146 = -1;
        Statics.field2951 = 0;
        Statics.field2011 = false;
        Statics.field2949 = arg0;
    }
}
