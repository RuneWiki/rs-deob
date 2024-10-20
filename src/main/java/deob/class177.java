package deob;

@ObfuscatedName("fj")
public class class177 {

    @ObfuscatedName("fj.w")
    public static int field2885 = 0;

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.j(Lfh;Lfh;Lfh;Lfa;B)Z")
    public static boolean method2767(class161 arg0, class161 arg1, class161 arg2, class178 arg3) {
        Statics.field2879 = arg0;
        Statics.field2880 = arg1;
        Statics.field2031 = arg2;
        Statics.field2563 = arg3;
        return true;
    }

    @ObfuscatedName("ca.y(Lfh;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1793(class161 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2994(arg1);
        int var6 = arg0.method3011(var5, arg2);
        method708(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("aj.z(Lfh;IIIZB)V")
    public static void method708(class161 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2885 = 1;
        Statics.field2882 = arg0;
        Statics.field2883 = arg1;
        Statics.field2590 = arg2;
        Statics.field2071 = arg3;
        Statics.field761 = arg4;
        Statics.field2881 = 10000;
    }

    @ObfuscatedName("dw.l(II)V")
    public static void method2678(int arg0) {
        if (field2885 == 0) {
            Statics.field2563.method3311(arg0);
        } else {
            Statics.field2071 = arg0;
        }
    }

    @ObfuscatedName("co.w(I)V")
    public static void method2070() {
        Statics.field2563.method3350();
        field2885 = 1;
        Statics.field2882 = null;
    }

    @ObfuscatedName("c.d(ILfh;IIIZB)V")
    public static void method570(int arg0, class161 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2885 = 1;
        Statics.field2882 = arg1;
        Statics.field2883 = arg2;
        Statics.field2590 = arg3;
        Statics.field2071 = arg4;
        Statics.field761 = arg5;
        Statics.field2881 = arg0;
    }

    @ObfuscatedName("ej.f(IB)V")
    public static void method2886(int arg0) {
        field2885 = 1;
        Statics.field2882 = null;
        Statics.field2883 = -1;
        Statics.field2590 = -1;
        Statics.field2071 = 0;
        Statics.field761 = false;
        Statics.field2881 = arg0;
    }

    @ObfuscatedName("e.i(I)Z")
    public static boolean method153() {
        return field2885 == 0 ? Statics.field2563.method3318() : true;
    }
}
