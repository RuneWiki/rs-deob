package deob;

@ObfuscatedName("js")
public class class275 {

    public class275() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.c(Lje;I)V")
    public static void method78(class274 arg0) {
        Statics.field80 = arg0;
    }

    @ObfuscatedName("hd.l(Lpi;Ljava/lang/String;I)I")
    public static int method4342(class421 arg0, String arg1) {
        int var2 = arg0.field4512;
        byte[] var3 = class334.method2595(arg1);
        arg0.method6768(var3.length);
        arg0.field4512 += Statics.field80.method4754(var3, 0, var3.length, arg0.field4511, arg0.field4512);
        return arg0.field4512 - var2;
    }

    @ObfuscatedName("lq.s(Lpi;I)Ljava/lang/String;")
    public static String method5197(class421 arg0) {
        String var4;
        try {
            int var1 = arg0.method6679();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field4512 += Statics.field80.method4755(arg0.field4511, arg0.field4512, var2, 0, var1);
            String var3 = class334.method2698(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
