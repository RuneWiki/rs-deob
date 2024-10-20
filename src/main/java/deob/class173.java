package deob;

@ObfuscatedName("fs")
public class class173 {

    @ObfuscatedName("fs.n")
    public static int field2796 = 0;

    public class173() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.q(Lff;Lff;Lff;Lfb;I)Z")
    public static boolean method2489(class158 arg0, class158 arg1, class158 arg2, class174 arg3) {
        Statics.field2794 = arg0;
        Statics.field2797 = arg1;
        Statics.field2793 = arg2;
        Statics.field2795 = arg3;
        return true;
    }

    @ObfuscatedName("n.s(Lff;IIIZI)V")
    public static void method35(class158 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2796 = 1;
        Statics.field2565 = arg0;
        Statics.field2798 = arg1;
        Statics.field2485 = arg2;
        Statics.field1285 = arg3;
        Statics.field2792 = arg4;
        Statics.field3089 = 10000;
    }

    @ObfuscatedName("cr.h(ILff;IIIZI)V")
    public static void method1980(int arg0, class158 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2796 = 1;
        Statics.field2565 = arg1;
        Statics.field2798 = arg2;
        Statics.field2485 = arg3;
        Statics.field1285 = arg4;
        Statics.field2792 = arg5;
        Statics.field3089 = arg0;
    }

    @ObfuscatedName("av.e(II)V")
    public static void method581(int arg0) {
        field2796 = 1;
        Statics.field2565 = null;
        Statics.field2798 = -1;
        Statics.field2485 = -1;
        Statics.field1285 = 0;
        Statics.field2792 = false;
        Statics.field3089 = arg0;
    }

    @ObfuscatedName("cw.n(B)Z")
    public static boolean method2077() {
        return field2796 == 0 ? Statics.field2795.method3132() : true;
    }

    @ObfuscatedName("dn.t(I)V")
    public static void method2087() {
        try {
            if (field2796 == 1) {
                int var0 = Statics.field2795.method3127();
                if (var0 > 0 && Statics.field2795.method3132()) {
                    int var1 = var0 - Statics.field3089;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2795.method3126(var1);
                    return;
                }
                Statics.field2795.method3131();
                Statics.field2795.method3157();
                if (Statics.field2565 == null) {
                    field2796 = 0;
                } else {
                    field2796 = 2;
                }
                Statics.field1282 = null;
                Statics.field1967 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2795.method3131();
            field2796 = 0;
            Statics.field1282 = null;
            Statics.field1967 = null;
            Statics.field2565 = null;
        }
    }
}
