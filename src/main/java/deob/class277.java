package deob;

@ObfuscatedName("jw")
public class class277 {

    public class277() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gq.n(Lfa;B)V")
    public static void method3327(class177 arg0) {
        Statics.field3742 = arg0;
    }

    @ObfuscatedName("el.v(Lgv;I)Ljava/lang/String;")
    public static String method2724(class185 arg0) {
        return method310(arg0, 32767);
    }

    @ObfuscatedName("az.y(Lgv;II)Ljava/lang/String;")
    public static String method310(class185 arg0, int arg1) {
        try {
            int var2 = arg0.method3232();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2529 += Statics.field3742.method2959(arg0.field2528, arg0.field2529, var3, 0, var2);
            return class278.method64(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
