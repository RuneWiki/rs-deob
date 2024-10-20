package deob;

@ObfuscatedName("ix")
public class class235 {

    @ObfuscatedName("ix.l")
    public static int field2819 = 0;

    public class235() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cw.s(Ljy;IIIZI)V")
    public static void method1910(class277 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2819 = 1;
        Statics.field2820 = arg0;
        Statics.field2822 = arg1;
        Statics.field1264 = arg2;
        Statics.field1612 = arg3;
        Statics.field1598 = arg4;
        Statics.field1439 = 10000;
    }

    @ObfuscatedName("mk.t(IB)V")
    public static void method5710(int arg0) {
        if (field2819 == 0) {
            Statics.field2816.method4005(arg0);
        } else {
            Statics.field1612 = arg0;
        }
    }

    @ObfuscatedName("bg.v(I)V")
    public static void method1634() {
        Statics.field2816.method4011();
        field2819 = 1;
        Statics.field2820 = null;
    }

    @ObfuscatedName("ew.j(ILjy;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2556(int arg0, class277 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method4474(arg2);
        int var7 = arg1.method4476(var6, arg3);
        method2050(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("ch.l(ILjy;IIIZB)V")
    public static void method2050(int arg0, class277 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2819 = 1;
        Statics.field2820 = arg1;
        Statics.field2822 = arg2;
        Statics.field1264 = arg3;
        Statics.field1612 = arg4;
        Statics.field1598 = arg5;
        Statics.field1439 = arg0;
    }

    @ObfuscatedName("c.n(S)Z")
    public static boolean method341() {
        try {
            if (field2819 == 2) {
                if (Statics.field2080 == null) {
                    Statics.field2080 = class240.method4171(Statics.field2820, Statics.field2822, Statics.field1264);
                    if (Statics.field2080 == null) {
                        return false;
                    }
                }
                if (Statics.field1576 == null) {
                    Statics.field1576 = new class28(Statics.field2817, Statics.field2815);
                }
                if (Statics.field2816.method4007(Statics.field2080, Statics.field2818, Statics.field1576, 22050)) {
                    Statics.field2816.method4049();
                    Statics.field2816.method4005(Statics.field1612);
                    Statics.field2816.method4010(Statics.field2080, Statics.field1598);
                    field2819 = 0;
                    Statics.field2080 = null;
                    Statics.field1576 = null;
                    Statics.field2820 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2816.method4011();
            field2819 = 0;
            Statics.field2080 = null;
            Statics.field1576 = null;
            Statics.field2820 = null;
        }
        return false;
    }
}
