package deob;

@ObfuscatedName("fd")
public class class161 {

    @ObfuscatedName("fd.k")
    public static int field2712 = 0;

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.g(Lec;Lec;Lec;Lfg;I)Z")
    public static boolean method611(class146 arg0, class146 arg1, class146 arg2, class162 arg3) {
        Statics.field2715 = arg0;
        Statics.field2713 = arg1;
        Statics.field2889 = arg2;
        Statics.field64 = arg3;
        return true;
    }

    @ObfuscatedName("de.v(Lec;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method2384(class146 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2709(arg1);
        int var6 = arg0.method2724(var5, arg2);
        method1985(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ci.z(Lec;IIIZI)V")
    public static void method1985(class146 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2712 = 1;
        Statics.field2647 = arg0;
        Statics.field2716 = arg1;
        Statics.field782 = arg2;
        Statics.field1821 = arg3;
        Statics.field568 = arg4;
        Statics.field539 = 10000;
    }

    @ObfuscatedName("bu.h(II)V")
    public static void method1081(int arg0) {
        field2712 = 1;
        Statics.field2647 = null;
        Statics.field2716 = -1;
        Statics.field782 = -1;
        Statics.field1821 = 0;
        Statics.field568 = false;
        Statics.field539 = arg0;
    }

    @ObfuscatedName("z.k(I)Z")
    public static boolean method32() {
        return field2712 == 0 ? Statics.field64.method3042() : true;
    }
}
