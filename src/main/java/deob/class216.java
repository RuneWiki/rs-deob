package deob;

@ObfuscatedName("hh")
public class class216 {

    public class216() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("en.j(Lde;B)Ljava/lang/String;")
    public static String method2862(class114 arg0) {
        String var4;
        try {
            int var1 = arg0.method2401();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field1894 += Statics.field3109.method2258(arg0.field1891, arg0.field1894, var2, 0, var1);
            String var3 = class159.method692(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
