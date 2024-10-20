package deob;

@ObfuscatedName("gj")
public class class186 {

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.i(Ldh;I)V")
    public static void method858(class121 arg0) {
        Statics.field2859 = arg0;
    }

    @ObfuscatedName("cw.b(Lds;Ljava/lang/String;I)I")
    public static int method2054(class128 arg0, String arg1) {
        int var2 = arg0.field2048;
        byte[] var3 = class152.method2226(arg1);
        arg0.method2461(var3.length);
        arg0.field2048 += Statics.field2859.method2390(var3, 0, var3.length, arg0.field2050, arg0.field2048);
        return arg0.field2048 - var2;
    }
}
