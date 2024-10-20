package deob;

@ObfuscatedName("hf")
public class class213 {

    public class213() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.t(Ldc;I)Ljava/lang/String;")
    public static String method142(class111 arg0) {
        return method119(arg0, 32767);
    }

    @ObfuscatedName("x.b(Ldc;IB)Ljava/lang/String;")
    public static String method119(class111 arg0, int arg1) {
        try {
            int var2 = arg0.method2185();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1867 += Statics.field619.method2105(arg0.field1869, arg0.field1867, var3, 0, var2);
            return class156.method2785(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
