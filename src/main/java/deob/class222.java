package deob;

@ObfuscatedName("he")
public class class222 {

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dd.o(Lds;S)V")
    public static void method2278(class113 arg0) {
        Statics.field3168 = arg0;
    }

    @ObfuscatedName("ep.e(Ldi;Ljava/lang/String;I)I")
    public static int method2948(class119 arg0, String arg1) {
        int var2 = arg0.field1974;
        byte[] var3 = class165.method187(arg1);
        arg0.method2335(var3.length);
        arg0.field1974 += Statics.field3168.method2264(var3, 0, var3.length, arg0.field1977, arg0.field1974);
        return arg0.field1974 - var2;
    }

    @ObfuscatedName("ad.b(Ldi;II)Ljava/lang/String;")
    public static String method930(class119 arg0, int arg1) {
        try {
            int var2 = arg0.method2350();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1974 += Statics.field3168.method2265(arg0.field1977, arg0.field1974, var3, 0, var2);
            return class165.method167(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
