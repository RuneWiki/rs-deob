package deob;

@ObfuscatedName("fe")
public class class174 {

    @ObfuscatedName("fe.p")
    public static int field2838 = 0;

    public class174() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dh.b(Lfj;Lfj;Lfj;Lfq;B)Z")
    public static boolean method2462(class158 arg0, class158 arg1, class158 arg2, class175 arg3) {
        Statics.field2845 = arg0;
        Statics.field2836 = arg1;
        Statics.field2837 = arg2;
        Statics.field2533 = arg3;
        return true;
    }

    @ObfuscatedName("ff.e(Lfj;IIIZB)V")
    public static void method3006(class158 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2838 = 1;
        Statics.field2842 = arg0;
        Statics.field3059 = arg1;
        Statics.field2787 = arg2;
        Statics.field3136 = arg3;
        Statics.field2840 = arg4;
        Statics.field2505 = 10000;
    }

    @ObfuscatedName("ex.k(I)V")
    public static void method2739() {
        Statics.field2533.method3180();
        field2838 = 1;
        Statics.field2842 = null;
    }

    @ObfuscatedName("fz.p(I)Z")
    public static boolean method3235() {
        try {
            if (field2838 == 2) {
                if (Statics.field133 == null) {
                    Statics.field133 = class171.method3053(Statics.field2842, Statics.field3059, Statics.field2787);
                    if (Statics.field133 == null) {
                        return false;
                    }
                }
                if (Statics.field2844 == null) {
                    Statics.field2844 = new class55(Statics.field2837, Statics.field2836);
                }
                if (Statics.field2533.method3134(Statics.field133, Statics.field2845, Statics.field2844, 22050)) {
                    Statics.field2533.method3135();
                    Statics.field2533.method3219(Statics.field3136);
                    Statics.field2533.method3160(Statics.field133, Statics.field2840);
                    field2838 = 0;
                    Statics.field133 = null;
                    Statics.field2844 = null;
                    Statics.field2842 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2533.method3180();
            field2838 = 0;
            Statics.field133 = null;
            Statics.field2844 = null;
            Statics.field2842 = null;
        }
        return false;
    }
}
