package deob;

@ObfuscatedName("hv")
public class class211 {

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ep.s(Ler;I)V")
    public static void method2262(class146 arg0) {
        Statics.field3122 = arg0;
    }

    @ObfuscatedName("ae.c(Lea;Ljava/lang/String;I)I")
    public static int method664(class154 arg0, String arg1) {
        int var2 = arg0.field2098;
        byte[] var3 = class204.method193(arg1);
        arg0.method2669(var3.length);
        arg0.field2098 += Statics.field3122.method2470(var3, 0, var3.length, arg0.field2100, arg0.field2098);
        return arg0.field2098 - var2;
    }
}
