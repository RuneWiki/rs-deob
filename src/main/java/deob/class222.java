package deob;

@ObfuscatedName("hv")
public class class222 {

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.n(Ldq;B)Ljava/lang/String;")
    public static String method2579(class119 arg0) {
        String var4;
        try {
            int var1 = arg0.method2351();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field1977 += Statics.field3158.method2269(arg0.field1981, arg0.field1977, var2, 0, var1);
            String var3 = class165.method581(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
