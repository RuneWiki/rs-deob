package deob;

@ObfuscatedName("fi")
public class class161 {

    @ObfuscatedName("fi.t")
    public static int field2714 = 0;

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eh.k(Ley;Ley;Ley;Lfv;I)Z")
    public static boolean method2785(class146 arg0, class146 arg1, class146 arg2, class162 arg3) {
        Statics.field2720 = arg0;
        Statics.field2712 = arg1;
        Statics.field2716 = arg2;
        Statics.field1930 = arg3;
        return true;
    }

    @ObfuscatedName("e.b(Ley;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method20(class146 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2728(arg1);
        int var6 = arg0.method2713(var5, arg2);
        method1587(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ba.e(Ley;IIIZI)V")
    public static void method1587(class146 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2714 = 1;
        Statics.field2715 = arg0;
        Statics.field1093 = arg1;
        Statics.field894 = arg2;
        Statics.field2717 = arg3;
        Statics.field2873 = arg4;
        Statics.field2713 = 10000;
    }

    @ObfuscatedName("bv.i(B)V")
    public static void method1383() {
        Statics.field1930.method3103();
        field2714 = 1;
        Statics.field2715 = null;
    }

    @ObfuscatedName("dz.t(ILey;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2413(int arg0, class146 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2728(arg2);
        int var7 = arg1.method2713(var6, arg3);
        method469(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("f.z(ILey;IIIZS)V")
    public static void method469(int arg0, class146 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2714 = 1;
        Statics.field2715 = arg1;
        Statics.field1093 = arg2;
        Statics.field894 = arg3;
        Statics.field2717 = arg4;
        Statics.field2873 = arg5;
        Statics.field2713 = arg0;
    }

    @ObfuscatedName("dx.g(II)V")
    public static void method2533(int arg0) {
        field2714 = 1;
        Statics.field2715 = null;
        Statics.field1093 = -1;
        Statics.field894 = -1;
        Statics.field2717 = 0;
        Statics.field2873 = false;
        Statics.field2713 = arg0;
    }
}
