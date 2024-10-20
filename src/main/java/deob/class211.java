package deob;

@ObfuscatedName("hk")
public class class211 {

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kg.z(Lkl;Ljava/lang/String;I)I")
    public static int method5294(class300 arg0, String arg1) {
        int var2 = arg0.field3702;
        byte[] var3 = class288.method3093(arg1);
        arg0.method5088(var3.length);
        arg0.field3702 += Statics.field2502.method3560(var3, 0, var3.length, arg0.field3699, arg0.field3702);
        return arg0.field3702 - var2;
    }

    @ObfuscatedName("bu.n(Lkl;I)Ljava/lang/String;")
    public static String method1094(class300 arg0) {
        return method2777(arg0, 32767);
    }

    @ObfuscatedName("ef.v(Lkl;II)Ljava/lang/String;")
    public static String method2777(class300 arg0, int arg1) {
        try {
            int var2 = arg0.method5004();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field3702 += Statics.field2502.method3556(arg0.field3699, arg0.field3702, var3, 0, var2);
            return class288.method1013(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
