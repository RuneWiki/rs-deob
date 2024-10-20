package deob;

@ObfuscatedName("gk")
public class class184 {

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fn.g(Lde;B)V")
    public static void method3241(class120 arg0) {
        Statics.field2840 = arg0;
    }

    @ObfuscatedName("aq.h(Ldw;B)Ljava/lang/String;")
    public static String method547(class127 arg0) {
        return method222(arg0, 32767);
    }

    @ObfuscatedName("y.s(Ldw;II)Ljava/lang/String;")
    public static String method222(class127 arg0, int arg1) {
        try {
            int var2 = arg0.method2564();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2027 += Statics.field2840.method2416(arg0.field2030, arg0.field2027, var3, 0, var2);
            return class150.method2170(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
