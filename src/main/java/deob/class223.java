package deob;

@ObfuscatedName("hu")
public class class223 {

    public class223() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.w(Ldz;B)V")
    public static void method839(class114 arg0) {
        Statics.field3186 = arg0;
    }

    @ObfuscatedName("do.x(Lde;I)Ljava/lang/String;")
    public static String method2239(class120 arg0) {
        return method1006(arg0, 32767);
    }

    @ObfuscatedName("aq.t(Lde;II)Ljava/lang/String;")
    public static String method1006(class120 arg0, int arg1) {
        try {
            int var2 = arg0.method2428();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2012 += Statics.field3186.method2299(arg0.field2013, arg0.field2012, var3, 0, var2);
            return class166.method764(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
