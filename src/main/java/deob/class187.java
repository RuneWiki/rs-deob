package deob;

@ObfuscatedName("gq")
public class class187 {

    @ObfuscatedName("gq.h")
    public static int field3011 = 0;

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("af.l(Lfp;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method742(class171 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3209(arg1);
        int var6 = arg0.method3258(var5, arg2);
        method3407(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("fe.g(Lfp;IIIZI)V")
    public static void method3407(class171 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3011 = 1;
        Statics.field1971 = arg0;
        Statics.field2185 = arg1;
        Statics.field3010 = arg2;
        Statics.field177 = arg3;
        Statics.field815 = arg4;
        Statics.field2223 = 10000;
    }

    @ObfuscatedName("al.r(I)V")
    public static void method1031() {
        Statics.field1267.method3544();
        field3011 = 1;
        Statics.field1971 = null;
    }

    @ObfuscatedName("fn.e(ILfp;IIIZI)V")
    public static void method3173(int arg0, class171 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3011 = 1;
        Statics.field1971 = arg1;
        Statics.field2185 = arg2;
        Statics.field3010 = arg3;
        Statics.field177 = arg4;
        Statics.field815 = arg5;
        Statics.field2223 = arg0;
    }

    @ObfuscatedName("ag.h(II)V")
    public static void method740(int arg0) {
        field3011 = 1;
        Statics.field1971 = null;
        Statics.field2185 = -1;
        Statics.field3010 = -1;
        Statics.field177 = 0;
        Statics.field815 = false;
        Statics.field2223 = arg0;
    }

    @ObfuscatedName("cu.s(I)Z")
    public static boolean method2153() {
        return field3011 == 0 ? Statics.field1267.method3546() : true;
    }
}
