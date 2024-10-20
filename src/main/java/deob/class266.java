package deob;

@ObfuscatedName("ju")
public class class266 {

    public class266() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("io.i(Lfo;B)V")
    public static void method4085(class166 arg0) {
        Statics.field3656 = arg0;
    }

    @ObfuscatedName("dn.h(Lfv;B)Ljava/lang/String;")
    public static String method2225(class174 arg0) {
        return method2692(arg0, 32767);
    }

    @ObfuscatedName("et.u(Lfv;IB)Ljava/lang/String;")
    public static String method2692(class174 arg0, int arg1) {
        try {
            int var2 = arg0.method2943();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2384 += Statics.field3656.method2850(arg0.field2387, arg0.field2384, var3, 0, var2);
            return class267.method3823(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
