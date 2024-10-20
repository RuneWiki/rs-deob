package deob;

@ObfuscatedName("hp")
public class class220 {

    public class220() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.f(Lhi;S)V")
    public static void method54(class219 arg0) {
        Statics.field2542 = arg0;
    }

    @ObfuscatedName("h.b(Lkb;Ljava/lang/String;B)I")
    public static int method237(class311 arg0, String arg1) {
        int var2 = arg0.field3741;
        byte[] var3 = class299.method85(arg1);
        arg0.method5182(var3.length);
        arg0.field3741 += Statics.field2542.method3727(var3, 0, var3.length, arg0.field3742, arg0.field3741);
        return arg0.field3741 - var2;
    }

    @ObfuscatedName("eo.l(Lkb;I)Ljava/lang/String;")
    public static String method2739(class311 arg0) {
        String var4;
        try {
            int var1 = arg0.method5194();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field3741 += Statics.field2542.method3724(arg0.field3742, arg0.field3741, var2, 0, var1);
            String var3 = class299.method736(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
