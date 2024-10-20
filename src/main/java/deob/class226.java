package deob;

@ObfuscatedName("ht")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.i(Ldn;Ljava/lang/String;I)I")
    public static int method657(class123 arg0, String arg1) {
        int var2 = arg0.field2046;
        byte[] var3 = class169.method519(arg1);
        arg0.method2402(var3.length);
        arg0.field2046 += Statics.field3237.method2327(var3, 0, var3.length, arg0.field2049, arg0.field2046);
        return arg0.field2046 - var2;
    }
}
