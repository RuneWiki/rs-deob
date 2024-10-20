package deob;

@ObfuscatedName("gg")
public class class207 {

    public class207() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("el.f(Lgo;S)V")
    public static void method3023(class206 arg0) {
        Statics.field2487 = arg0;
    }

    @ObfuscatedName("c.i(Lkq;Ljava/lang/String;B)I")
    public static int method102(class300 arg0, String arg1) {
        int var2 = arg0.field3703;
        byte[] var3 = class288.method3262(arg1);
        arg0.method5296(var3.length);
        arg0.field3703 += Statics.field2487.method3558(var3, 0, var3.length, arg0.field3704, arg0.field3703);
        return arg0.field3703 - var2;
    }

    @ObfuscatedName("bp.y(Lkq;I)Ljava/lang/String;")
    public static String method1858(class300 arg0) {
        return method3345(arg0, 32767);
    }

    @ObfuscatedName("ge.w(Lkq;IB)Ljava/lang/String;")
    public static String method3345(class300 arg0, int arg1) {
        try {
            int var2 = arg0.method5124();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field3703 += Statics.field2487.method3559(arg0.field3704, arg0.field3703, var3, 0, var2);
            return class288.method3734(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
