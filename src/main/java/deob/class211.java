package deob;

@ObfuscatedName("hv")
public class class211 {

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.u(Len;B)Ljava/lang/String;")
    public static String method729(class154 arg0) {
        String var4;
        try {
            int var1 = arg0.method2776();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2073 += Statics.field3107.method2519(arg0.field2078, arg0.field2073, var2, 0, var1);
            String var3 = class204.method3145(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
