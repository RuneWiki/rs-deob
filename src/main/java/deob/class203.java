package deob;

@ObfuscatedName("gt")
public class class203 {

    public class203() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.x(Lcd;S)V")
    public static void method2420(class103 arg0) {
        Statics.field2947 = arg0;
    }

    @ObfuscatedName("am.v(Ldm;Ljava/lang/String;I)I")
    public static int method601(class108 arg0, String arg1) {
        int var2 = arg0.field1841;
        byte[] var3 = class213.method3164(arg1);
        arg0.method2171(var3.length);
        arg0.field1841 += Statics.field2947.method2066(var3, 0, var3.length, arg0.field1839, arg0.field1841);
        return arg0.field1841 - var2;
    }

    @ObfuscatedName("es.m(Ldm;II)Ljava/lang/String;")
    public static String method2717(class108 arg0, int arg1) {
        try {
            int var2 = arg0.method2125();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1841 += Statics.field2947.method2068(arg0.field1839, arg0.field1841, var3, 0, var2);
            return class213.method3648(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
