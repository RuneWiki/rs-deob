package deob;

@ObfuscatedName("le")
public class class314 {

    public class314() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jx.d(Lgo;I)V")
    public static void method4798(class187 arg0) {
        Statics.field3904 = arg0;
    }

    @ObfuscatedName("gl.z(Lgy;II)Ljava/lang/String;")
    public static String method3170(class195 arg0, int arg1) {
        try {
            int var2 = arg0.method3380();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2568 += Statics.field3904.method3179(arg0.field2569, arg0.field2568, var3, 0, var2);
            return class315.method2956(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
