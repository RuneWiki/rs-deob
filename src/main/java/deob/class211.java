package deob;

@ObfuscatedName("hd")
public class class211 {

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bb.c(Lkz;Ljava/lang/String;I)I")
    public static int method1624(class300 arg0, String arg1) {
        int var2 = arg0.field3696;
        byte[] var3 = class288.method2061(arg1);
        arg0.method5101(var3.length);
        arg0.field3696 += Statics.field2487.method3634(var3, 0, var3.length, arg0.field3694, arg0.field3696);
        return arg0.field3696 - var2;
    }

    @ObfuscatedName("u.x(Lkz;I)Ljava/lang/String;")
    public static String method46(class300 arg0) {
        String var4;
        try {
            int var1 = arg0.method5117();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field3696 += Statics.field2487.method3635(arg0.field3694, arg0.field3696, var2, 0, var1);
            String var3 = class288.method737(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
