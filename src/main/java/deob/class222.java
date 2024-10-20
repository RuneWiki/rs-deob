package deob;

@ObfuscatedName("ht")
public class class222 {

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.j(Ldl;I)V")
    public static void method2290(class113 arg0) {
        Statics.field3166 = arg0;
    }

    @ObfuscatedName("ew.m(Ldc;S)Ljava/lang/String;")
    public static String method2964(class119 arg0) {
        return method1961(arg0, 32767);
    }

    @ObfuscatedName("cf.f(Ldc;II)Ljava/lang/String;")
    public static String method1961(class119 arg0, int arg1) {
        try {
            int var2 = arg0.method2384();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1982 += Statics.field3166.method2296(arg0.field1981, arg0.field1982, var3, 0, var2);
            return class165.method3042(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
