package deob;

@ObfuscatedName("gh")
public class class184 {

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.d(Ldo;I)Ljava/lang/String;")
    public static String method2321(class127 arg0) {
        return method63(arg0, 32767);
    }

    @ObfuscatedName("s.g(Ldo;II)Ljava/lang/String;")
    public static String method63(class127 arg0, int arg1) {
        try {
            int var2 = arg0.method2413();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2042 += Statics.field2832.method2322(arg0.field2035, arg0.field2042, var3, 0, var2);
            return class149.method2913(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
