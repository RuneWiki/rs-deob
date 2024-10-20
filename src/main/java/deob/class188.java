package deob;

@ObfuscatedName("gm")
public class class188 {

    public class188() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.y(Ldo;B)Ljava/lang/String;")
    public static String method2675(class107 arg0) {
        return method2397(arg0, 32767);
    }

    @ObfuscatedName("du.u(Ldo;IB)Ljava/lang/String;")
    public static String method2397(class107 arg0, int arg1) {
        try {
            int var2 = arg0.method2122();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1854 += Statics.field2857.method2042(arg0.field1856, arg0.field1854, var3, 0, var2);
            return class198.method3280(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
