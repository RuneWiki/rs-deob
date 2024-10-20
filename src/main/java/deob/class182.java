package deob;

@ObfuscatedName("fq")
public class class182 {

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.g(Ldx;B)V")
    public static void method2676(class119 arg0) {
        Statics.field2776 = arg0;
    }

    @ObfuscatedName("bv.e(Ldu;I)Ljava/lang/String;")
    public static String method1344(class126 arg0) {
        String var4;
        try {
            int var1 = arg0.method2628();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2016 += Statics.field2776.method2418(arg0.field2013, arg0.field2016, var2, 0, var1);
            String var3 = class148.method15(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
