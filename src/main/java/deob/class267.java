package deob;

@ObfuscatedName("jo")
public class class267 {

    public class267() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fs.i(Lfp;I)Ljava/lang/String;")
    public static String method2898(class175 arg0) {
        String var4;
        try {
            int var1 = arg0.method3007();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2395 += Statics.field3657.method2916(arg0.field2392, arg0.field2395, var2, 0, var1);
            String var3 = class268.method4116(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
