package deob;

@ObfuscatedName("jj")
public class class265 {

    public class265() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jc.n(Ljc;B)V")
    public static void method4590(class264 arg0) {
        Statics.field3202 = arg0;
    }

    @ObfuscatedName("ld.c(Lot;Ljava/lang/String;B)I")
    public static int method5341(class400 arg0, String arg1) {
        int var2 = arg0.field4272;
        byte[] var3 = class317.method2570(arg1);
        arg0.method6215(var3.length);
        arg0.field4272 += Statics.field3202.method4587(var3, 0, var3.length, arg0.field4271, arg0.field4272);
        return arg0.field4272 - var2;
    }

    @ObfuscatedName("gx.m(Lot;I)Ljava/lang/String;")
    public static String method3683(class400 arg0) {
        return method3021(arg0, 32767);
    }

    @ObfuscatedName("fx.k(Lot;IB)Ljava/lang/String;")
    public static String method3021(class400 arg0, int arg1) {
        try {
            int var2 = arg0.method6231();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field4272 += Statics.field3202.method4593(arg0.field4271, arg0.field4272, var3, 0, var2);
            return class317.method2455(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
