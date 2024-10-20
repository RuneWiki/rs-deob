package deob;

@ObfuscatedName("jh")
public class class270 {

    public class270() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("nq.c(Lpi;Ljava/lang/String;S)I")
    public static int method6107(class419 arg0, String arg1) {
        int var2 = arg0.field4475;
        byte[] var3 = class329.method3617(arg1);
        arg0.method6668(var3.length);
        arg0.field4475 += Statics.field4456.method4791(var3, 0, var3.length, arg0.field4477, arg0.field4475);
        return arg0.field4475 - var2;
    }

    @ObfuscatedName("gn.b(Lpi;S)Ljava/lang/String;")
    public static String method3380(class419 arg0) {
        String var4;
        try {
            int var1 = arg0.method6685();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field4475 += Statics.field4456.method4789(arg0.field4477, arg0.field4475, var2, 0, var1);
            String var3 = class329.method2124(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
