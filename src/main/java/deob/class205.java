package deob;

@ObfuscatedName("ga")
public class class205 {

    public class205() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.p(Lcv;I)V")
    public static void method1896(class104 arg0) {
        Statics.field2974 = arg0;
    }

    @ObfuscatedName("cx.y(Ldg;Ljava/lang/String;I)I")
    public static int method1795(class110 arg0, String arg1) {
        int var2 = arg0.field1842;
        byte[] var3 = class215.method3167(arg1);
        arg0.method2122(var3.length);
        arg0.field1842 += Statics.field2974.method2064(var3, 0, var3.length, arg0.field1844, arg0.field1842);
        return arg0.field1842 - var2;
    }

    @ObfuscatedName("ef.d(Ldg;I)Ljava/lang/String;")
    public static String method2721(class110 arg0) {
        return method147(arg0, 32767);
    }

    @ObfuscatedName("w.c(Ldg;II)Ljava/lang/String;")
    public static String method147(class110 arg0, int arg1) {
        try {
            int var2 = arg0.method2137();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1842 += Statics.field2974.method2060(arg0.field1844, arg0.field1842, var3, 0, var2);
            return class215.method2727(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
