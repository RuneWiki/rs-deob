package deob;

@ObfuscatedName("ki")
public class class304 {

    public class304() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.m(Lgr;Ljava/lang/String;B)I")
    public static int method2526(class202 arg0, String arg1) {
        int var2 = arg0.field2439;
        byte[] var3 = class305.method4122(arg1);
        arg0.method3415(var3.length);
        arg0.field2439 += Statics.field3779.method3336(var3, 0, var3.length, arg0.field2440, arg0.field2439);
        return arg0.field2439 - var2;
    }

    @ObfuscatedName("im.f(Lgr;I)Ljava/lang/String;")
    public static String method4452(class202 arg0) {
        String var4;
        try {
            int var1 = arg0.method3431();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2439 += Statics.field3779.method3339(arg0.field2440, arg0.field2439, var2, 0, var1);
            String var3 = class305.method1035(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
