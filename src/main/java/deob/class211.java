package deob;

@ObfuscatedName("hk")
public class class211 {

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ee.x(Lex;B)V")
    public static void method2483(class146 arg0) {
        Statics.field3131 = arg0;
    }

    @ObfuscatedName("ff.j(Lek;I)Ljava/lang/String;")
    public static String method3068(class154 arg0) {
        return method771(arg0, 32767);
    }

    @ObfuscatedName("ab.c(Lek;II)Ljava/lang/String;")
    public static String method771(class154 arg0, int arg1) {
        try {
            int var2 = arg0.method2821();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2086 += Statics.field3131.method2569(arg0.field2091, arg0.field2086, var3, 0, var2);
            return class204.method3589(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
