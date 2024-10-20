package deob;

@ObfuscatedName("gr")
public class class183 {

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("af.u(Ldl;B)Ljava/lang/String;")
    public static String method560(class126 arg0) {
        String var4;
        try {
            int var1 = arg0.method2580();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2024 += Statics.field2827.method2374(arg0.field2022, arg0.field2024, var2, 0, var1);
            String var3 = class148.method811(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
