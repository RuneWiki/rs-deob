package deob;

@ObfuscatedName("gb")
public class class184 {

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("br.b(Ldv;Ljava/lang/String;B)I")
    public static int method1341(class127 arg0, String arg1) {
        int var2 = arg0.field2051;
        byte[] var3 = class150.method33(arg1);
        arg0.method2488(var3.length);
        arg0.field2051 += Statics.field2842.method2320(var3, 0, var3.length, arg0.field2056, arg0.field2051);
        return arg0.field2051 - var2;
    }

    @ObfuscatedName("x.c(Ldv;I)Ljava/lang/String;")
    public static String method154(class127 arg0) {
        String var4;
        try {
            int var1 = arg0.method2409();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2051 += Statics.field2842.method2321(arg0.field2056, arg0.field2051, var2, 0, var1);
            String var3 = class150.method766(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
