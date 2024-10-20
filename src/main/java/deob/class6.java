package deob;

@ObfuscatedName("gd")
public class class6 {

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fx.b(Ldv;II)Ljava/lang/String;")
    public static String method27(class28 arg0, int arg1) {
        try {
            int var2 = arg0.method325();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field303 += Statics.field50.method877(arg0.field306, arg0.field303, var3, 0, var2);
            return class98.method2651(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @ObfuscatedName("ds.v(Lds;I)V")
    public static void method876(class51 arg0) {
        Statics.field50 = arg0;
    }

    @ObfuscatedName("as.c(Ldv;I)Ljava/lang/String;")
    public static String method2975(class28 arg0) {
        return method27(arg0, 32767);
    }
}
