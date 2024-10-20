package deob;

@ObfuscatedName("hu")
public class class234 {

    @ObfuscatedName("hu.j")
    public static int field2838 = 0;

    public class234() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gw.f(Ljp;Ljp;Ljp;Lie;B)Z")
    public static boolean method3402(class276 arg0, class276 arg1, class276 arg2, class235 arg3) {
        Statics.field2835 = arg0;
        Statics.field2839 = arg1;
        Statics.field2815 = arg2;
        Statics.field2834 = arg3;
        return true;
    }

    @ObfuscatedName("db.e(Ljp;IIIZI)V")
    public static void method2086(class276 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2838 = 1;
        Statics.field1550 = arg0;
        Statics.field2836 = arg1;
        Statics.field2837 = arg2;
        Statics.field2832 = arg3;
        Statics.field3661 = arg4;
        Statics.field2360 = 10000;
    }

    @ObfuscatedName("bt.v(I)V")
    public static void method940() {
        Statics.field2834.method4070();
        field2838 = 1;
        Statics.field1550 = null;
    }

    @ObfuscatedName("fe.y(ILjp;IIIZI)V")
    public static void method2983(int arg0, class276 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2838 = 1;
        Statics.field1550 = arg1;
        Statics.field2836 = arg2;
        Statics.field2837 = arg3;
        Statics.field2832 = arg4;
        Statics.field3661 = arg5;
        Statics.field2360 = arg0;
    }

    @ObfuscatedName("bq.j(IB)V")
    public static void method682(int arg0) {
        field2838 = 1;
        Statics.field1550 = null;
        Statics.field2836 = -1;
        Statics.field2837 = -1;
        Statics.field2832 = 0;
        Statics.field3661 = false;
        Statics.field2360 = arg0;
    }

    @ObfuscatedName("bd.o(I)Z")
    public static boolean method1040() {
        return field2838 == 0 ? Statics.field2834.method4100() : true;
    }

    @ObfuscatedName("fv.r(B)Z")
    public static boolean method2935() {
        try {
            if (field2838 == 2) {
                if (Statics.field1117 == null) {
                    Statics.field1117 = class239.method4239(Statics.field1550, Statics.field2836, Statics.field2837);
                    if (Statics.field1117 == null) {
                        return false;
                    }
                }
                if (Statics.field2559 == null) {
                    Statics.field2559 = new class56(Statics.field2815, Statics.field2839);
                }
                if (Statics.field2834.method4066(Statics.field1117, Statics.field2835, Statics.field2559, 22050)) {
                    Statics.field2834.method4097();
                    Statics.field2834.method4064(Statics.field2832);
                    Statics.field2834.method4165(Statics.field1117, Statics.field3661);
                    field2838 = 0;
                    Statics.field1117 = null;
                    Statics.field2559 = null;
                    Statics.field1550 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2834.method4070();
            field2838 = 0;
            Statics.field1117 = null;
            Statics.field2559 = null;
            Statics.field1550 = null;
        }
        return false;
    }
}
