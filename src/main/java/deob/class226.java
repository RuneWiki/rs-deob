package deob;

@ObfuscatedName("hb")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.m(Ldl;I)V")
    public static void method2987(class117 arg0) {
        Statics.field3231 = arg0;
    }

    @ObfuscatedName("he.w(Ldj;B)Ljava/lang/String;")
    public static String method3820(class123 arg0) {
        String var4;
        try {
            int var1 = arg0.method2427();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2046 += Statics.field3231.method2343(arg0.field2048, arg0.field2046, var2, 0, var1);
            String var3 = class169.method102(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
