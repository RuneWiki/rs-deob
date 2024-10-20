package deob;

@ObfuscatedName("gq")
public class class205 {

    public class205() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bj.v(Ldp;Ljava/lang/String;B)I")
    public static int method1075(class110 arg0, String arg1) {
        int var2 = arg0.field1847;
        byte[] var3 = class215.method3208(arg1);
        arg0.method2178(var3.length);
        arg0.field1847 += Statics.field2937.method2091(var3, 0, var3.length, arg0.field1853, arg0.field1847);
        return arg0.field1847 - var2;
    }

    @ObfuscatedName("u.t(Ldp;I)Ljava/lang/String;")
    public static String method532(class110 arg0) {
        return method1423(arg0, 32767);
    }

    @ObfuscatedName("bs.f(Ldp;II)Ljava/lang/String;")
    public static String method1423(class110 arg0, int arg1) {
        try {
            int var2 = arg0.method2174();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1847 += Statics.field2937.method2081(arg0.field1853, arg0.field1847, var3, 0, var2);
            return class215.method528(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
