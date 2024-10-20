package deob;

@ObfuscatedName("hi")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ek.f(Ldp;I)V")
    public static void method2978(class117 arg0) {
        Statics.field3232 = arg0;
    }

    @ObfuscatedName("er.e(Ldx;Ljava/lang/String;I)I")
    public static int method2986(class123 arg0, String arg1) {
        int var2 = arg0.field2052;
        byte[] var3 = class169.method2747(arg1);
        arg0.method2578(var3.length);
        arg0.field2052 += Statics.field3232.method2328(var3, 0, var3.length, arg0.field2053, arg0.field2052);
        return arg0.field2052 - var2;
    }

    @ObfuscatedName("go.n(Ldx;I)Ljava/lang/String;")
    public static String method3553(class123 arg0) {
        String var4;
        try {
            int var1 = arg0.method2412();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2052 += Statics.field3232.method2329(arg0.field2053, arg0.field2052, var2, 0, var1);
            String var3 = class169.method159(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
