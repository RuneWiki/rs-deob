package deob;

@ObfuscatedName("hf")
public class class223 {

    public class223() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bp.s(Ldx;B)V")
    public static void method1489(class114 arg0) {
        Statics.field3188 = arg0;
    }

    @ObfuscatedName("fs.p(Lds;II)Ljava/lang/String;")
    public static String method3203(class120 arg0, int arg1) {
        try {
            int var2 = arg0.method2351();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2006 += Statics.field3188.method2275(arg0.field2008, arg0.field2006, var3, 0, var2);
            return class166.method562(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
