package deob;

@ObfuscatedName("gz")
public class class187 {

    @ObfuscatedName("gz.i")
    public static int field3010 = 0;

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fj.x(Lfp;Lfp;Lfp;Lgb;I)Z")
    public static boolean method3249(class171 arg0, class171 arg1, class171 arg2, class188 arg3) {
        Statics.field3014 = arg0;
        Statics.field3217 = arg1;
        Statics.field3015 = arg2;
        Statics.field3009 = arg3;
        return true;
    }

    @ObfuscatedName("cm.r(Lfp;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1548(class171 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3148(arg1);
        int var6 = arg0.method3094(var5, arg2);
        method2627(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("dp.j(Lfp;IIIZB)V")
    public static void method2627(class171 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3010 = 1;
        Statics.field3011 = arg0;
        Statics.field2331 = arg1;
        Statics.field2092 = arg2;
        Statics.field3012 = arg3;
        Statics.field3017 = arg4;
        Statics.field786 = 10000;
    }

    @ObfuscatedName("au.z(ILfp;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method706(int arg0, class171 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3148(arg2);
        int var7 = arg1.method3094(var6, arg3);
        method571(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("w.i(ILfp;IIIZI)V")
    public static void method571(int arg0, class171 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3010 = 1;
        Statics.field3011 = arg1;
        Statics.field2331 = arg2;
        Statics.field2092 = arg3;
        Statics.field3012 = arg4;
        Statics.field3017 = arg5;
        Statics.field786 = arg0;
    }

    @ObfuscatedName("ad.b(IB)V")
    public static void method740(int arg0) {
        field3010 = 1;
        Statics.field3011 = null;
        Statics.field2331 = -1;
        Statics.field2092 = -1;
        Statics.field3012 = 0;
        Statics.field3017 = false;
        Statics.field786 = arg0;
    }

    @ObfuscatedName("n.l(I)Z")
    public static boolean method548() {
        return field3010 == 0 ? Statics.field3009.method3406() : true;
    }
}
