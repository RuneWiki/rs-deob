package deob;

@ObfuscatedName("hk")
public class class213 {

    public class213() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cx.n(Ldl;I)Ljava/lang/String;")
    public static String method1966(class111 arg0) {
        String var4;
        try {
            int var1 = arg0.method2241();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field1889 += Statics.field3078.method2151(arg0.field1888, arg0.field1889, var2, 0, var1);
            String var3 = class156.method647(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
