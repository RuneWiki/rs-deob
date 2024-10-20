package deob;

@ObfuscatedName("jh")
public class class266 {

    public class266() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ib.d(Lfc;I)V")
    public static void method4074(class166 arg0) {
        Statics.field3665 = arg0;
    }

    @ObfuscatedName("hp.k(Lfg;B)Ljava/lang/String;")
    public static String method3865(class174 arg0) {
        return method2436(arg0, 32767);
    }

    @ObfuscatedName("ew.e(Lfg;II)Ljava/lang/String;")
    public static String method2436(class174 arg0, int arg1) {
        try {
            int var2 = arg0.method2969();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2405 += Statics.field3665.method2887(arg0.field2409, arg0.field2405, var3, 0, var2);
            return class267.method66(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
