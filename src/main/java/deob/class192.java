package deob;

@ObfuscatedName("gd")
public class class192 {

    public class192() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.g(Lcs;I)V")
    public static void method115(class102 arg0) {
        Statics.field2911 = arg0;
    }

    @ObfuscatedName("cv.i(Ldk;IS)Ljava/lang/String;")
    public static String method1849(class107 arg0, int arg1) {
        try {
            int var2 = arg0.method2105();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1844 += Statics.field2911.method2033(arg0.field1843, arg0.field1844, var3, 0, var2);
            return class202.method848(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
