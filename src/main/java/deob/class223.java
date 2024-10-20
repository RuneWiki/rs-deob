package deob;

@ObfuscatedName("hw")
public class class223 {

    public class223() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fi.b(Lds;II)Ljava/lang/String;")
    public static String method3220(class120 arg0, int arg1) {
        try {
            int var2 = arg0.method2472();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1977 += Statics.field3119.method2278(arg0.field1983, arg0.field1977, var3, 0, var2);
            return class166.method2274(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
