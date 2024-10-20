package deob;

@ObfuscatedName("gw")
public class class203 {

    public class203() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.l(Lcw;I)V")
    public static void method2436(class103 arg0) {
        Statics.field2951 = arg0;
    }

    @ObfuscatedName("fv.y(Ldk;I)Ljava/lang/String;")
    public static String method2998(class108 arg0) {
        return method664(arg0, 32767);
    }

    @ObfuscatedName("am.g(Ldk;II)Ljava/lang/String;")
    public static String method664(class108 arg0, int arg1) {
        try {
            int var2 = arg0.method2173();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1823 += Statics.field2951.method2087(arg0.field1828, arg0.field1823, var3, 0, var2);
            return class213.method2731(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
