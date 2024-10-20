package deob;

@ObfuscatedName("ku")
public class class301 {

    public class301() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bp.w(Lgy;B)Ljava/lang/String;")
    public static String method1037(class183 arg0) {
        String var4;
        try {
            int var1 = arg0.method3293();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2360 += Statics.field3725.method3190(arg0.field2366, arg0.field2360, var2, 0, var1);
            String var3 = class302.method3150(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
