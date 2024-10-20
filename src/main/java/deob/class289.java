package deob;

@ObfuscatedName("ke")
public class class289 {

    public class289() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fe.s(Lfr;I)V")
    public static void method3153(class177 arg0) {
        Statics.field3784 = arg0;
    }

    @ObfuscatedName("jg.g(Lgy;B)Ljava/lang/String;")
    public static String method4552(class185 arg0) {
        return method3050(arg0, 32767);
    }

    @ObfuscatedName("fh.m(Lgy;IB)Ljava/lang/String;")
    public static String method3050(class185 arg0, int arg1) {
        try {
            int var2 = arg0.method3253();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2514 += Statics.field3784.method3156(arg0.field2512, arg0.field2514, var3, 0, var2);
            return class290.method1747(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
