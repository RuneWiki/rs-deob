package deob;

@ObfuscatedName("ho")
public class class222 {

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.l(Ldl;I)Ljava/lang/String;")
    public static String method224(class119 arg0) {
        return method2716(arg0, 32767);
    }

    @ObfuscatedName("ef.e(Ldl;IB)Ljava/lang/String;")
    public static String method2716(class119 arg0, int arg1) {
        try {
            int var2 = arg0.method2452();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1988 += Statics.field3168.method2319(arg0.field1986, arg0.field1988, var3, 0, var2);
            return class165.method2928(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
