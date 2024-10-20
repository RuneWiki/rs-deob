package deob;

@ObfuscatedName("gh")
public class class188 {

    public class188() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.e(Ldp;B)Ljava/lang/String;")
    public static String method2083(class107 arg0) {
        return method3156(arg0, 32767);
    }

    @ObfuscatedName("fa.p(Ldp;II)Ljava/lang/String;")
    public static String method3156(class107 arg0, int arg1) {
        try {
            int var2 = arg0.method2167();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1841 += Statics.field2869.method2069(arg0.field1845, arg0.field1841, var3, 0, var2);
            return class198.method1868(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
