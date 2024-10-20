package deob;

@ObfuscatedName("kc")
public class class307 {

    public class307() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("by.a(Lfy;B)V")
    public static void method1613(class182 arg0) {
        Statics.field3793 = arg0;
    }

    @ObfuscatedName("ja.s(Lgx;Ljava/lang/String;I)I")
    public static int method4585(class190 arg0, String arg1) {
        int var2 = arg0.field2419;
        byte[] var3 = class308.method3698(arg1);
        arg0.method3453(var3.length);
        arg0.field2419 += Statics.field3793.method3387(var3, 0, var3.length, arg0.field2420, arg0.field2419);
        return arg0.field2419 - var2;
    }

    @ObfuscatedName("ix.g(Lgx;I)Ljava/lang/String;")
    public static String method4414(class190 arg0) {
        String var4;
        try {
            int var1 = arg0.method3638();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2419 += Statics.field3793.method3388(arg0.field2420, arg0.field2419, var2, 0, var1);
            String var3 = class308.method64(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
