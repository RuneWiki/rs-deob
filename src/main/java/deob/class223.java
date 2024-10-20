package deob;

@ObfuscatedName("hl")
public class class223 {

    public class223() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eh.a(Ldx;B)Ljava/lang/String;")
    public static String method2790(class120 arg0) {
        String var4;
        try {
            int var1 = arg0.method2661();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field1993 += Statics.field2056.method2385(arg0.field1994, arg0.field1993, var2, 0, var1);
            String var3 = class166.method1062(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
