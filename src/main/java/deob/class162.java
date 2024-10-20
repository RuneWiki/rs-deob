package deob;

@ObfuscatedName("fg")
public class class162 {

    @ObfuscatedName("fg.d")
    public static int field2719 = 0;

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cv.n(Lej;Lej;Lej;Lfo;B)Z")
    public static boolean method1985(class147 arg0, class147 arg1, class147 arg2, class163 arg3) {
        Statics.field2717 = arg0;
        Statics.field2722 = arg1;
        Statics.field2718 = arg2;
        Statics.field1278 = arg3;
        return true;
    }

    @ObfuscatedName("dy.x(Lej;IIIZB)V")
    public static void method2519(class147 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2719 = 1;
        Statics.field2720 = arg0;
        Statics.field1001 = arg1;
        Statics.field2726 = arg2;
        Statics.field62 = arg3;
        Statics.field6 = arg4;
        Statics.field2716 = 10000;
    }

    @ObfuscatedName("aj.k(II)V")
    public static void method770(int arg0) {
        if (field2719 == 0) {
            Statics.field1278.method3051(arg0);
        } else {
            Statics.field62 = arg0;
        }
    }

    @ObfuscatedName("ec.i(I)V")
    public static void method2782() {
        Statics.field1278.method2996();
        field2719 = 1;
        Statics.field2720 = null;
    }

    @ObfuscatedName("aj.d(ILej;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method771(int arg0, class147 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2729(arg2);
        int var7 = arg1.method2690(var6, arg3);
        method1606(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("bz.q(ILej;IIIZI)V")
    public static void method1606(int arg0, class147 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2719 = 1;
        Statics.field2720 = arg1;
        Statics.field1001 = arg2;
        Statics.field2726 = arg3;
        Statics.field62 = arg4;
        Statics.field6 = arg5;
        Statics.field2716 = arg0;
    }

    @ObfuscatedName("l.m(II)V")
    public static void method546(int arg0) {
        field2719 = 1;
        Statics.field2720 = null;
        Statics.field1001 = -1;
        Statics.field2726 = -1;
        Statics.field62 = 0;
        Statics.field6 = false;
        Statics.field2716 = arg0;
    }

    @ObfuscatedName("e.a(I)V")
    public static void method132() {
        try {
            if (field2719 == 1) {
                int var0 = Statics.field1278.method3008();
                if (var0 > 0 && Statics.field1278.method3073()) {
                    int var1 = var0 - Statics.field2716;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1278.method3051(var1);
                    return;
                }
                Statics.field1278.method2996();
                Statics.field1278.method2994();
                if (Statics.field2720 == null) {
                    field2719 = 0;
                } else {
                    field2719 = 2;
                }
                Statics.field694 = null;
                Statics.field1748 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1278.method2996();
            field2719 = 0;
            Statics.field694 = null;
            Statics.field1748 = null;
            Statics.field2720 = null;
        }
    }
}
