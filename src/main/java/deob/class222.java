package deob;

@ObfuscatedName("hm")
public class class222 {

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.v(Ldx;IB)Ljava/lang/String;")
    public static String method189(class119 arg0, int arg1) {
        try {
            int var2 = arg0.method2362();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1984 += Statics.field3175.method2286(arg0.field1988, arg0.field1984, var3, 0, var2);
            return class165.method922(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
