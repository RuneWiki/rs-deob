package deob;

@ObfuscatedName("gi")
public class class205 {

    public class205() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("az.a(Ldi;I)Ljava/lang/String;")
    public static String method686(class110 arg0) {
        String var4;
        try {
            int var1 = arg0.method2144();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field1861 += Statics.field2975.method2065(arg0.field1865, arg0.field1861, var2, 0, var1);
            String var3 = class215.method3385(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
