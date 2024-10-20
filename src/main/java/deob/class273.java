package deob;

@ObfuscatedName("jz")
public class class273 {

    public class273() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.d(Lfy;B)V")
    public static void method171(class173 arg0) {
        Statics.field3722 = arg0;
    }

    @ObfuscatedName("ax.x(Lfr;Ljava/lang/String;B)I")
    public static int method231(class181 arg0, String arg1) {
        int var2 = arg0.field2498;
        byte[] var3 = class274.method3930(arg1);
        arg0.method3034(var3.length);
        arg0.field2498 += Statics.field3722.method2967(var3, 0, var3.length, arg0.field2496, arg0.field2498);
        return arg0.field2498 - var2;
    }

    @ObfuscatedName("bb.k(Lfr;I)Ljava/lang/String;")
    public static String method1014(class181 arg0) {
        return method2383(arg0, 32767);
    }

    @ObfuscatedName("dd.z(Lfr;II)Ljava/lang/String;")
    public static String method2383(class181 arg0, int arg1) {
        try {
            int var2 = arg0.method3044();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2498 += Statics.field3722.method2968(arg0.field2496, arg0.field2498, var3, 0, var2);
            return class274.method2930(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
