package deob;

@ObfuscatedName("jj")
public class class269 {

    public class269() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cy.c(Lfs;I)Ljava/lang/String;")
    public static String method1407(class177 arg0) {
        String var4;
        try {
            int var1 = arg0.method2978();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2402 += Statics.field3677.method2894(arg0.field2403, arg0.field2402, var2, 0, var1);
            String var3 = class270.method4048(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
