package deob;

@ObfuscatedName("hf")
public class class212 {

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dt.e(Ldh;Ljava/lang/String;I)I")
    public static int method2480(class111 arg0, String arg1) {
        int var2 = arg0.field1834;
        byte[] var3 = Statics.method2108(arg1);
        arg0.method2341(var3.length);
        arg0.field1834 += Statics.field3038.method2100(var3, 0, var3.length, arg0.field1835, arg0.field1834);
        return arg0.field1834 - var2;
    }
}
