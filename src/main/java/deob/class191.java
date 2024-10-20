package deob;

@ObfuscatedName("gr")
public class class191 {

    public class191() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.t(Ldb;II)Ljava/lang/String;")
    public static String method670(class107 arg0, int arg1) {
        try {
            int var2 = arg0.method2114();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1830 += Statics.field2893.method2033(arg0.field1831, arg0.field1830, var3, 0, var2);
            return class201.method1941(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
