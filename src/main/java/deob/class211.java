package deob;

@ObfuscatedName("hu")
public class class211 {

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gb.x(Lem;B)V")
    public static void method3296(class146 arg0) {
        Statics.field3130 = arg0;
    }

    @ObfuscatedName("ay.n(Leq;I)Ljava/lang/String;")
    public static String method936(class154 arg0) {
        return method1563(arg0, 32767);
    }

    @ObfuscatedName("cn.g(Leq;IB)Ljava/lang/String;")
    public static String method1563(class154 arg0, int arg1) {
        try {
            int var2 = arg0.method2854();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2087 += Statics.field3130.method2623(arg0.field2086, arg0.field2087, var3, 0, var2);
            return class204.method900(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
