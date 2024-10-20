package deob;

@ObfuscatedName("gs")
public class class184 {

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.f(Ldq;II)Ljava/lang/String;")
    public static String method2382(class127 arg0, int arg1) {
        try {
            int var2 = arg0.method2471();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2033 += Statics.field2831.method2372(arg0.field2030, arg0.field2033, var3, 0, var2);
            return class150.method1625(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
