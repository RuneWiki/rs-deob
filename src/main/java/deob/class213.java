package deob;

@ObfuscatedName("hb")
public class class213 {

    public class213() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hc.n(Ldp;B)Ljava/lang/String;")
    public static String method3602(class111 arg0) {
        String var4;
        try {
            int var1 = arg0.method2378();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field1896 += Statics.field3084.method2142(arg0.field1904, arg0.field1896, var2, 0, var1);
            String var3 = class156.method3118(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
