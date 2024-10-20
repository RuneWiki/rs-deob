package deob;

@ObfuscatedName("kv")
public class class300 {

    public class300() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.b(Lgq;I)V")
    public static void method221(class186 arg0) {
        Statics.field3787 = arg0;
    }

    @ObfuscatedName("go.q(Lgn;I)Ljava/lang/String;")
    public static String method3575(class194 arg0) {
        String var4;
        try {
            int var1 = arg0.method3368();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2538 += Statics.field3787.method3157(arg0.field2541, arg0.field2538, var2, 0, var1);
            String var3 = class301.method2916(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
