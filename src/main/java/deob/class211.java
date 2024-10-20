package deob;

@ObfuscatedName("hz")
public class class211 {

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bq.n(Leq;B)V")
    public static void method1347(class153 arg0) {
        Statics.field3109 = arg0;
    }

    @ObfuscatedName("fk.m(Lfa;B)Ljava/lang/String;")
    public static String method2763(class161 arg0) {
        return method3269(arg0, 32767);
    }

    @ObfuscatedName("gf.h(Lfa;II)Ljava/lang/String;")
    public static String method3269(class161 arg0, int arg1) {
        try {
            int var2 = arg0.method2793();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2285 += Statics.field3109.method2705(arg0.field2291, arg0.field2285, var3, 0, var2);
            return class204.method1574(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
