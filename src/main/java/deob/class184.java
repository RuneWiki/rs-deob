package deob;

@ObfuscatedName("gg")
public class class184 {

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.y(Ldg;B)V")
    public static void method1418(class120 arg0) {
        Statics.field2833 = arg0;
    }

    @ObfuscatedName("f.m(Ldp;B)Ljava/lang/String;")
    public static String method138(class127 arg0) {
        return method841(arg0, 32767);
    }

    @ObfuscatedName("aa.d(Ldp;IB)Ljava/lang/String;")
    public static String method841(class127 arg0, int arg1) {
        try {
            int var2 = arg0.method2637();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2036 += Statics.field2833.method2392(arg0.field2037, arg0.field2036, var3, 0, var2);
            return class149.method630(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
