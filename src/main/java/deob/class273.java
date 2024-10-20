package deob;

@ObfuscatedName("ji")
public class class273 {

    public class273() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fe.m(Lfv;I)Ljava/lang/String;")
    public static String method2864(class181 arg0) {
        String var4;
        try {
            int var1 = arg0.method3140();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2498 += Statics.field3718.method2941(arg0.field2499, arg0.field2498, var2, 0, var1);
            String var3 = class274.method356(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
