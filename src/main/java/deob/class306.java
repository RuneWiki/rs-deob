package deob;

@ObfuscatedName("ki")
public class class306 {

    public class306() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("is.n(Lfs;B)V")
    public static void method4359(class182 arg0) {
        Statics.field3775 = arg0;
    }

    @ObfuscatedName("el.h(Lgc;Ljava/lang/String;I)I")
    public static int method3172(class190 arg0, String arg1) {
        int var2 = arg0.field2423;
        byte[] var3 = class307.method3291(arg1);
        arg0.method3509(var3.length);
        arg0.field2423 += Statics.field3775.method3437(var3, 0, var3.length, arg0.field2424, arg0.field2423);
        return arg0.field2423 - var2;
    }

    @ObfuscatedName("j.l(Lgc;I)Ljava/lang/String;")
    public static String method83(class190 arg0) {
        return method567(arg0, 32767);
    }

    @ObfuscatedName("ao.g(Lgc;II)Ljava/lang/String;")
    public static String method567(class190 arg0, int arg1) {
        try {
            int var2 = arg0.method3566();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2423 += Statics.field3775.method3438(arg0.field2424, arg0.field2423, var3, 0, var2);
            return class307.method5033(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
