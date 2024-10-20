package deob;

@ObfuscatedName("hh")
public class class222 {

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gw.k(Ldk;Ljava/lang/String;I)I")
    public static int method3503(class119 arg0, String arg1) {
        int var2 = arg0.field1949;
        byte[] var3 = class165.method904(arg1);
        arg0.method2328(var3.length);
        arg0.field1949 += Statics.field3168.method2261(var3, 0, var3.length, arg0.field1960, arg0.field1949);
        return arg0.field1949 - var2;
    }

    @ObfuscatedName("g.h(Ldk;B)Ljava/lang/String;")
    public static String method142(class119 arg0) {
        return method2641(arg0, 32767);
    }

    @ObfuscatedName("di.o(Ldk;II)Ljava/lang/String;")
    public static String method2641(class119 arg0, int arg1) {
        try {
            int var2 = arg0.method2314();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1949 += Statics.field3168.method2260(arg0.field1960, arg0.field1949, var3, 0, var2);
            return class165.method2(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
