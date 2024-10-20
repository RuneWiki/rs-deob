package deob;

@ObfuscatedName("ho")
public class class220 {

    public class220() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bf.z(Lkf;Ljava/lang/String;I)I")
    public static int method1182(class310 arg0, String arg1) {
        int var2 = arg0.field3734;
        byte[] var3 = class298.method4260(arg1);
        arg0.method5354(var3.length);
        arg0.field3734 += Statics.field2546.method3700(var3, 0, var3.length, arg0.field3731, arg0.field3734);
        return arg0.field3734 - var2;
    }

    @ObfuscatedName("by.k(Lkf;B)Ljava/lang/String;")
    public static String method1091(class310 arg0) {
        String var4;
        try {
            int var1 = arg0.method5207();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field3734 += Statics.field2546.method3702(arg0.field3731, arg0.field3734, var2, 0, var1);
            String var3 = class298.method4130(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
