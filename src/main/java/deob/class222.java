package deob;

@ObfuscatedName("hj")
public class class222 {

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eu.o(Ldo;I)V")
    public static void method2877(class113 arg0) {
        Statics.field3169 = arg0;
    }

    @ObfuscatedName("db.f(Ldc;Ljava/lang/String;I)I")
    public static int method2534(class119 arg0, String arg1) {
        int var2 = arg0.field1984;
        byte[] var3 = class165.method2871(arg1);
        arg0.method2288(var3.length);
        arg0.field1984 += Statics.field3169.method2221(var3, 0, var3.length, arg0.field1989, arg0.field1984);
        return arg0.field1984 - var2;
    }

    @ObfuscatedName("a.i(Ldc;I)Ljava/lang/String;")
    public static String method155(class119 arg0) {
        String var4;
        try {
            int var1 = arg0.method2303();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field1984 += Statics.field3169.method2228(arg0.field1989, arg0.field1984, var2, 0, var1);
            String var3 = class165.method106(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
