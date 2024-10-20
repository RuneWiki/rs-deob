package deob;

@ObfuscatedName("hr")
public class class211 {

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cm.b(Leu;I)V")
    public static void method1852(class146 arg0) {
        Statics.field2185 = arg0;
    }

    @ObfuscatedName("ct.e(Lec;Ljava/lang/String;I)I")
    public static int method1499(class154 arg0, String arg1) {
        int var2 = arg0.field2079;
        byte[] var3 = class204.method1166(arg1);
        arg0.method2667(var3.length);
        arg0.field2079 += Statics.field2185.method2590(var3, 0, var3.length, arg0.field2084, arg0.field2079);
        return arg0.field2079 - var2;
    }

    @ObfuscatedName("gr.c(Lec;I)Ljava/lang/String;")
    public static String method3216(class154 arg0) {
        String var4;
        try {
            int var1 = arg0.method2682();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2079 += Statics.field2185.method2591(arg0.field2084, arg0.field2079, var2, 0, var1);
            String var3 = class204.method3105(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
