package deob;

@ObfuscatedName("hf")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.e(Ldd;IB)Ljava/lang/String;")
    public static String method995(class123 arg0, int arg1) {
        try {
            int var2 = arg0.method2526();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2062 += Statics.field3226.method2375(arg0.field2055, arg0.field2062, var3, 0, var2);
            return class169.method728(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
