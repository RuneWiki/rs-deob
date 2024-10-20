package deob;

@ObfuscatedName("kg")
public class class303 {

    public class303() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fz.y(Lfm;I)V")
    public static void method3189(class177 arg0) {
        Statics.field3754 = arg0;
    }

    @ObfuscatedName("x.c(Lge;Ljava/lang/String;I)I")
    public static int method186(class185 arg0, String arg1) {
        int var2 = arg0.field2374;
        byte[] var3 = class304.method425(arg1);
        arg0.method3267(var3.length);
        arg0.field2374 += Statics.field3754.method3192(var3, 0, var3.length, arg0.field2373, arg0.field2374);
        return arg0.field2374 - var2;
    }

    @ObfuscatedName("jm.n(Lge;B)Ljava/lang/String;")
    public static String method4508(class185 arg0) {
        return method4252(arg0, 32767);
    }

    @ObfuscatedName("is.u(Lge;II)Ljava/lang/String;")
    public static String method4252(class185 arg0, int arg1) {
        try {
            int var2 = arg0.method3356();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2374 += Statics.field3754.method3193(arg0.field2373, arg0.field2374, var3, 0, var2);
            return class304.method2937(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
