package deob;

@ObfuscatedName("jh")
public class class266 {

    public class266() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.c(Lfp;IB)Ljava/lang/String;")
    public static String method228(class174 arg0, int arg1) {
        try {
            int var2 = arg0.method3016();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2357 += Statics.field3643.method2775(arg0.field2355, arg0.field2357, var3, 0, var2);
            return class267.method1654(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
