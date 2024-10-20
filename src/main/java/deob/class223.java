package deob;

@ObfuscatedName("hm")
public class class223 {

    public class223() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fg.f(Ldj;IS)Ljava/lang/String;")
    public static String method3267(class120 arg0, int arg1) {
        try {
            int var2 = arg0.method2398();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1999 += Statics.field3182.method2319(arg0.field2001, arg0.field1999, var3, 0, var2);
            return class166.method2949(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
