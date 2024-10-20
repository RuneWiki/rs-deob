package deob;

@ObfuscatedName("kb")
public class class303 {

    public class303() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fl.f(Lfq;I)V")
    public static void method3253(class177 arg0) {
        Statics.field3780 = arg0;
    }

    @ObfuscatedName("ji.l(Lgm;Ljava/lang/String;I)I")
    public static int method4885(class185 arg0, String arg1) {
        int var2 = arg0.field2414;
        byte[] var3 = class304.method3242(arg1);
        arg0.method3537(var3.length);
        arg0.field2414 += Statics.field3780.method3269(var3, 0, var3.length, arg0.field2415, arg0.field2414);
        return arg0.field2414 - var2;
    }

    @ObfuscatedName("ik.w(Lgm;I)Ljava/lang/String;")
    public static String method4323(class185 arg0) {
        String var4;
        try {
            int var1 = arg0.method3358();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2414 += Statics.field3780.method3266(arg0.field2415, arg0.field2414, var2, 0, var1);
            String var3 = class304.method62(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
