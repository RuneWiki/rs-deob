package deob;

@ObfuscatedName("hx")
public class class233 {

    @ObfuscatedName("hx.p")
    public static int field2828 = 0;

    public class233() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fr.v(Ljv;Ljv;Ljv;Lhp;I)Z")
    public static boolean method3333(class275 arg0, class275 arg1, class275 arg2, class234 arg3) {
        Statics.field2830 = arg0;
        Statics.field2832 = arg1;
        Statics.field1559 = arg2;
        Statics.field1467 = arg3;
        return true;
    }

    @ObfuscatedName("ca.n(Ljv;IIIZI)V")
    public static void method2018(class275 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2828 = 1;
        Statics.field2520 = arg0;
        Statics.field241 = arg1;
        Statics.field159 = arg2;
        Statics.field2829 = arg3;
        Statics.field2827 = arg4;
        Statics.field2831 = 10000;
    }

    @ObfuscatedName("r.f(ILjv;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method51(int arg0, class275 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method4484(arg2);
        int var7 = arg1.method4485(var6, arg3);
        method296(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("ac.y(ILjv;IIIZI)V")
    public static void method296(int arg0, class275 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2828 = 1;
        Statics.field2520 = arg1;
        Statics.field241 = arg2;
        Statics.field159 = arg3;
        Statics.field2829 = arg4;
        Statics.field2827 = arg5;
        Statics.field2831 = arg0;
    }

    @ObfuscatedName("fa.p(II)V")
    public static void method2947(int arg0) {
        field2828 = 1;
        Statics.field2520 = null;
        Statics.field241 = -1;
        Statics.field159 = -1;
        Statics.field2829 = 0;
        Statics.field2827 = false;
        Statics.field2831 = arg0;
    }

    @ObfuscatedName("cd.j(I)V")
    public static void method1687() {
        try {
            if (field2828 == 1) {
                int var0 = Statics.field1467.method4018();
                if (var0 > 0 && Statics.field1467.method4024()) {
                    int var1 = var0 - Statics.field2831;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1467.method4040(var1);
                    return;
                }
                Statics.field1467.method4017();
                Statics.field1467.method4021();
                if (Statics.field2520 == null) {
                    field2828 = 0;
                } else {
                    field2828 = 2;
                }
                Statics.field26 = null;
                Statics.field1397 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1467.method4017();
            field2828 = 0;
            Statics.field26 = null;
            Statics.field1397 = null;
            Statics.field2520 = null;
        }
    }
}
