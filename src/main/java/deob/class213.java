package deob;

@ObfuscatedName("ha")
public class class213 {

    public class213() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ej.p(Lde;II)Ljava/lang/String;")
    public static String method2640(class111 arg0, int arg1) {
        try {
            int var2 = arg0.method2188();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1885 += Statics.field3086.method2112(arg0.field1889, arg0.field1885, var3, 0, var2);
            return class156.method2463(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
