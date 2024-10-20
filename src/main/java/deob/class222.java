package deob;

@ObfuscatedName("hi")
public class class222 {

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("er.i(Ldj;Ljava/lang/String;B)I")
    public static int method2719(class119 arg0, String arg1) {
        int var2 = arg0.field1984;
        byte[] var3 = class165.method56(arg1);
        arg0.method2373(var3.length);
        arg0.field1984 += Statics.field3163.method2230(var3, 0, var3.length, arg0.field1988, arg0.field1984);
        return arg0.field1984 - var2;
    }

    @ObfuscatedName("hy.f(Ldj;II)Ljava/lang/String;")
    public static String method3639(class119 arg0, int arg1) {
        try {
            int var2 = arg0.method2323();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1984 += Statics.field3163.method2232(arg0.field1988, arg0.field1984, var3, 0, var2);
            return class165.method117(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
