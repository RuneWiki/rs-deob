package deob;

@ObfuscatedName("hx")
public class class222 {

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dm.g(Ldm;Ljava/lang/String;I)I")
    public static int method2580(class119 arg0, String arg1) {
        int var2 = arg0.field1977;
        byte[] var3 = class165.method2846(arg1);
        arg0.method2360(var3.length);
        arg0.field1977 += Statics.field3167.method2293(var3, 0, var3.length, arg0.field1986, arg0.field1977);
        return arg0.field1977 - var2;
    }

    @ObfuscatedName("fs.b(Ldm;IS)Ljava/lang/String;")
    public static String method3067(class119 arg0, int arg1) {
        try {
            int var2 = arg0.method2506();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1977 += Statics.field3167.method2292(arg0.field1986, arg0.field1977, var3, 0, var2);
            return class165.method1605(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
