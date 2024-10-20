package deob;

@ObfuscatedName("gw")
public class class183 {

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fx.p(Ldv;I)Ljava/lang/String;")
    public static String method3088(class126 arg0) {
        String var4;
        try {
            int var1 = arg0.method2388();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2043 += Statics.field2825.method2308(arg0.field2047, arg0.field2043, var2, 0, var1);
            String var3 = class148.method2247(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
