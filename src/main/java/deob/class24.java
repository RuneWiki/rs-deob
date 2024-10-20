package deob;

@ObfuscatedName("gi")
public class class24 {

    public class24() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.h(Ldp;II)Ljava/lang/String;")
    public static String method3100(class50 arg0, int arg1) {
        try {
            int var2 = arg0.method754();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field540 += Statics.field236.method2316(arg0.field541, arg0.field540, var3, 0, var2);
            return class101.method1999(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @ObfuscatedName("ah.b(Ldp;I)Ljava/lang/String;")
    public static String method3337(class50 arg0) {
        return method3100(arg0, 32767);
    }
}
