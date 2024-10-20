package deob;

@ObfuscatedName("gq")
public class class184 {

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.b(Ldl;B)V")
    public static void method216(class120 arg0) {
        Statics.field2825 = arg0;
    }

    @ObfuscatedName("ej.e(Ldv;I)Ljava/lang/String;")
    public static String method3064(class126 arg0) {
        String var4;
        try {
            int var1 = arg0.method2560();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2027 += Statics.field2825.method2368(arg0.field2026, arg0.field2027, var2, 0, var1);
            String var3 = class150.method2846(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
