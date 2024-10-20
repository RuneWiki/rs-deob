package deob;

@ObfuscatedName("hd")
public class class230 {

    @ObfuscatedName("hd.n")
    public static int field2695 = 0;

    public class230() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.g(Ljr;Ljr;Ljr;Lhe;I)Z")
    public static boolean method2483(class262 arg0, class262 arg1, class262 arg2, class231 arg3) {
        Statics.field2698 = arg0;
        Statics.field2701 = arg1;
        Statics.field2697 = arg2;
        Statics.field508 = arg3;
        return true;
    }

    @ObfuscatedName("fv.e(Ljr;IIIZI)V")
    public static void method3043(class262 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2695 = 1;
        Statics.field1906 = arg0;
        Statics.field3941 = arg1;
        Statics.field1898 = arg2;
        Statics.field1335 = arg3;
        Statics.field2194 = arg4;
        Statics.field336 = 10000;
    }

    @ObfuscatedName("ce.b(II)V")
    public static void method1649(int arg0) {
        if (field2695 == 0) {
            Statics.field508.method3992(arg0);
        } else {
            Statics.field1335 = arg0;
        }
    }

    @ObfuscatedName("am.z(I)V")
    public static void method609() {
        Statics.field508.method3928();
        field2695 = 1;
        Statics.field1906 = null;
    }

    @ObfuscatedName("jk.n(ILjr;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method4463(int arg0, class262 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method4306(arg2);
        int var7 = arg1.method4295(var6, arg3);
        method3600(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("go.l(ILjr;IIIZI)V")
    public static void method3600(int arg0, class262 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2695 = 1;
        Statics.field1906 = arg1;
        Statics.field3941 = arg2;
        Statics.field1898 = arg3;
        Statics.field1335 = arg4;
        Statics.field2194 = arg5;
        Statics.field336 = arg0;
    }

    @ObfuscatedName("cq.s(B)V")
    public static void method2023() {
        try {
            if (field2695 == 1) {
                int var0 = Statics.field508.method3924();
                if (var0 > 0 && Statics.field508.method3929()) {
                    int var1 = var0 - Statics.field336;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field508.method3992(var1);
                    return;
                }
                Statics.field508.method3928();
                Statics.field508.method3926();
                if (Statics.field1906 == null) {
                    field2695 = 0;
                } else {
                    field2695 = 2;
                }
                Statics.field2699 = null;
                Statics.field2789 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field508.method3928();
            field2695 = 0;
            Statics.field2699 = null;
            Statics.field2789 = null;
            Statics.field1906 = null;
        }
    }

    @ObfuscatedName("cw.y(I)Z")
    public static boolean method1976() {
        try {
            if (field2695 == 2) {
                if (Statics.field2699 == null) {
                    Statics.field2699 = class236.method4105(Statics.field1906, Statics.field3941, Statics.field1898);
                    if (Statics.field2699 == null) {
                        return false;
                    }
                }
                if (Statics.field2789 == null) {
                    Statics.field2789 = new class111(Statics.field2697, Statics.field2701);
                }
                if (Statics.field508.method3925(Statics.field2699, Statics.field2698, Statics.field2789, 22050)) {
                    Statics.field508.method4015();
                    Statics.field508.method3992(Statics.field1335);
                    Statics.field508.method3927(Statics.field2699, Statics.field2194);
                    field2695 = 0;
                    Statics.field2699 = null;
                    Statics.field2789 = null;
                    Statics.field1906 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field508.method3928();
            field2695 = 0;
            Statics.field2699 = null;
            Statics.field2789 = null;
            Statics.field1906 = null;
        }
        return false;
    }
}
