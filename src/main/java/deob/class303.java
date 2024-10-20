package deob;

@ObfuscatedName("kc")
public class class303 {

    public class303() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jz.f(Lgx;I)Ljava/lang/String;")
    public static String method4522(class185 arg0) {
        String var4;
        try {
            int var1 = arg0.method3498();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2397 += Statics.field3773.method3249(arg0.field2399, arg0.field2397, var2, 0, var1);
            String var3 = class304.method3289(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
