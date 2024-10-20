package deob;

@ObfuscatedName("gu")
public class class184 {

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.t(Ldo;I)Ljava/lang/String;")
    public static String method1(class127 arg0) {
        String var4;
        try {
            int var1 = arg0.method2423();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2059 += Statics.field2466.method2369(arg0.field2061, arg0.field2059, var2, 0, var1);
            String var3 = class149.method2417(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
