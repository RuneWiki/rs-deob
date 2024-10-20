package deob;

@ObfuscatedName("ks")
public class class291 {

    @ObfuscatedName("ks.z")
    public static int field3359 = 0;

    public class291() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ec.w(Lln;IIIZI)V")
    public static void method3020(class337 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3359 = 1;
        Statics.field18 = arg0;
        Statics.field115 = arg1;
        Statics.field1803 = arg2;
        Statics.field3358 = arg3;
        Statics.field4674 = arg4;
        Statics.field2311 = 10000;
    }

    @ObfuscatedName("fc.v(I)V")
    public static void method3262() {
        Statics.field3361.method5125();
        field3359 = 1;
        Statics.field18 = null;
    }

    @ObfuscatedName("jl.s(ILln;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method4986(int arg0, class337 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method5988(arg2);
        int var7 = arg1.method6057(var6, arg3);
        method5071(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("jx.z(ILln;IIIZI)V")
    public static void method5071(int arg0, class337 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3359 = 1;
        Statics.field18 = arg1;
        Statics.field115 = arg2;
        Statics.field1803 = arg3;
        Statics.field3358 = arg4;
        Statics.field4674 = arg5;
        Statics.field2311 = arg0;
    }

    @ObfuscatedName("ai.j(IS)V")
    public static void method423(int arg0) {
        field3359 = 1;
        Statics.field18 = null;
        Statics.field115 = -1;
        Statics.field1803 = -1;
        Statics.field3358 = 0;
        Statics.field4674 = false;
        Statics.field2311 = arg0;
    }

    @ObfuscatedName("bh.i(I)Z")
    public static boolean method2106() {
        return field3359 == 0 ? Statics.field3361.method5126() : true;
    }
}
