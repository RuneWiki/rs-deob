package deob;

@ObfuscatedName("jx")
public class class277 {

    public class277() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.a(Lgh;I)Ljava/lang/String;")
    public static String method83(class185 arg0) {
        return method3870(arg0, 32767);
    }

    @ObfuscatedName("iq.w(Lgh;IB)Ljava/lang/String;")
    public static String method3870(class185 arg0, int arg1) {
        try {
            int var2 = arg0.method3137();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2509 += Statics.field3727.method2897(arg0.field2512, arg0.field2509, var3, 0, var2);
            return class278.method21(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
