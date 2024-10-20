package deob;

@ObfuscatedName("ge")
public class class184 {

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("es.p(Ldo;B)V")
    public static void method2911(class120 arg0) {
        Statics.field2825 = arg0;
    }

    @ObfuscatedName("m.e(Ldj;B)Ljava/lang/String;")
    public static String method151(class127 arg0) {
        String var4;
        try {
            int var1 = arg0.method2507();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2029 += Statics.field2825.method2410(arg0.field2033, arg0.field2029, var2, 0, var1);
            String var3 = class150.method2252(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
