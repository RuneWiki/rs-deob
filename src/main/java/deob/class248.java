package deob;

@ObfuscatedName("io")
public class class248 {

    @ObfuscatedName("io.m")
    public static int field2915 = 0;

    public class248() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jo.l(Lkl;Lkl;Lkl;Lig;I)Z")
    public static boolean method4642(class290 arg0, class290 arg1, class290 arg2, class249 arg3) {
        Statics.field2919 = arg0;
        Statics.field3754 = arg1;
        Statics.field2913 = arg2;
        Statics.field2921 = arg3;
        return true;
    }

    @ObfuscatedName("bh.q(Lkl;IIIZB)V")
    public static void method1799(class290 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2915 = 1;
        Statics.field1370 = arg0;
        Statics.field3256 = arg1;
        Statics.field1526 = arg2;
        Statics.field2914 = arg3;
        Statics.field2918 = arg4;
        Statics.field2917 = 10000;
    }

    @ObfuscatedName("m.f(IB)V")
    public static void method16(int arg0) {
        if (field2915 == 0) {
            Statics.field2921.method4334(arg0);
        } else {
            Statics.field2914 = arg0;
        }
    }

    @ObfuscatedName("gd.j(ILkl;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method3470(int arg0, class290 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method4771(arg2);
        int var7 = arg1.method4848(var6, arg3);
        method4181(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("ha.m(ILkl;IIIZB)V")
    public static void method4181(int arg0, class290 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2915 = 1;
        Statics.field1370 = arg1;
        Statics.field3256 = arg2;
        Statics.field1526 = arg3;
        Statics.field2914 = arg4;
        Statics.field2918 = arg5;
        Statics.field2917 = arg0;
    }

    @ObfuscatedName("fy.k(II)V")
    public static void method3162(int arg0) {
        field2915 = 1;
        Statics.field1370 = null;
        Statics.field3256 = -1;
        Statics.field1526 = -1;
        Statics.field2914 = 0;
        Statics.field2918 = false;
        Statics.field2917 = arg0;
    }
}
