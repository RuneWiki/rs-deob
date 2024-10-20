package deob;

@ObfuscatedName("je")
public class class267 {

    public class267() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ec.j(Lfg;B)V")
    public static void method2475(class167 arg0) {
        Statics.field3649 = arg0;
    }

    @ObfuscatedName("iy.h(Lfb;Ljava/lang/String;I)I")
    public static int method3993(class175 arg0, String arg1) {
        int var2 = arg0.field2394;
        byte[] var3 = class268.method171(arg1);
        arg0.method2901(var3.length);
        arg0.field2394 += Statics.field3649.method2827(var3, 0, var3.length, arg0.field2390, arg0.field2394);
        return arg0.field2394 - var2;
    }

    @ObfuscatedName("hc.f(Lfb;I)Ljava/lang/String;")
    public static String method3760(class175 arg0) {
        String var4;
        try {
            int var1 = arg0.method3013();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2394 += Statics.field3649.method2828(arg0.field2390, arg0.field2394, var2, 0, var1);
            String var3 = class268.method1055(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
