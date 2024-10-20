package deob;

@ObfuscatedName("gt")
public class class192 {

    public class192() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("go.n(Lcf;B)V")
    public static void method3288(class102 arg0) {
        Statics.field2909 = arg0;
    }

    @ObfuscatedName("ci.x(Ldw;B)Ljava/lang/String;")
    public static String method1981(class107 arg0) {
        String var4;
        try {
            int var1 = arg0.method2131();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field1826 += Statics.field2909.method2072(arg0.field1829, arg0.field1826, var2, 0, var1);
            String var3 = Statics.method2397(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
