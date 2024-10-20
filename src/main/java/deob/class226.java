package deob;

@ObfuscatedName("ho")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ep.k(Lde;I)Ljava/lang/String;")
    public static String method2829(class123 arg0) {
        return method2219(arg0, 32767);
    }

    @ObfuscatedName("dv.q(Lde;IB)Ljava/lang/String;")
    public static String method2219(class123 arg0, int arg1) {
        try {
            int var2 = arg0.method2410();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2060 += Statics.field2224.method2354(arg0.field2054, arg0.field2060, var3, 0, var2);
            return class169.method2853(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
