package deob;

@ObfuscatedName("gy")
public class class184 {

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dd.c(Ldg;I)Ljava/lang/String;")
    public static String method2267(class127 arg0) {
        String var4;
        try {
            int var1 = arg0.method2331();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2052 += Statics.field2839.method2251(arg0.field2057, arg0.field2052, var2, 0, var1);
            String var3 = class150.method1956(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
