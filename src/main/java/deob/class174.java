package deob;

@ObfuscatedName("fs")
public class class174 {

    @ObfuscatedName("fs.w")
    public static int field2858 = 0;

    public class174() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bq.p(Lff;Ljava/lang/String;Ljava/lang/String;IZS)V")
    public static void method1434(class158 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2965(arg1);
        int var6 = arg0.method2974(var5, arg2);
        method562(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("b.k(Lff;IIIZB)V")
    public static void method562(class158 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2858 = 1;
        Statics.field1852 = arg0;
        Statics.field2823 = arg1;
        Statics.field2544 = arg2;
        Statics.field1851 = arg3;
        Statics.field187 = arg4;
        Statics.field1486 = 10000;
    }

    @ObfuscatedName("eb.e(II)V")
    public static void method2796(int arg0) {
        if (field2858 == 0) {
            Statics.field2811.method3246(arg0);
        } else {
            Statics.field1851 = arg0;
        }
    }

    @ObfuscatedName("q.f(I)V")
    public static void method481() {
        Statics.field2811.method3252();
        field2858 = 1;
        Statics.field1852 = null;
    }

    @ObfuscatedName("dm.w(ILff;IIIZB)V")
    public static void method2516(int arg0, class158 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2858 = 1;
        Statics.field1852 = arg1;
        Statics.field2823 = arg2;
        Statics.field2544 = arg3;
        Statics.field1851 = arg4;
        Statics.field187 = arg5;
        Statics.field1486 = arg0;
    }

    @ObfuscatedName("bz.t(I)Z")
    public static boolean method1391() {
        try {
            if (field2858 == 2) {
                if (Statics.field1491 == null) {
                    Statics.field1491 = class171.method3169(Statics.field1852, Statics.field2823, Statics.field2544);
                    if (Statics.field1491 == null) {
                        return false;
                    }
                }
                if (Statics.field1621 == null) {
                    Statics.field1621 = new class55(Statics.field2856, Statics.field2855);
                }
                if (Statics.field2811.method3302(Statics.field1491, Statics.field2859, Statics.field1621, 22050)) {
                    Statics.field2811.method3249();
                    Statics.field2811.method3246(Statics.field1851);
                    Statics.field2811.method3287(Statics.field1491, Statics.field187);
                    field2858 = 0;
                    Statics.field1491 = null;
                    Statics.field1621 = null;
                    Statics.field1852 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2811.method3252();
            field2858 = 0;
            Statics.field1491 = null;
            Statics.field1621 = null;
            Statics.field1852 = null;
        }
        return false;
    }
}
