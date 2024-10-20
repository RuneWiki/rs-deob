package deob;

@ObfuscatedName("gq")
public class class184 {

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.a(Ldf;IB)Ljava/lang/String;")
    public static String method2160(class126 arg0, int arg1) {
        try {
            int var2 = arg0.method2391();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2016 += Statics.field2831.method2318(arg0.field2015, arg0.field2016, var3, 0, var2);
            return class149.method2586(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
