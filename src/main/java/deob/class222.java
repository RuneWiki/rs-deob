package deob;

@ObfuscatedName("hn")
public class class222 {

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.d(Ldd;I)V")
    public static void method567(class113 arg0) {
        Statics.field3169 = arg0;
    }

    @ObfuscatedName("client.p(Ldf;Ljava/lang/String;I)I")
    public static int method543(class119 arg0, String arg1) {
        int var2 = arg0.field1966;
        byte[] var3 = class165.method2285(arg1);
        arg0.method2355(var3.length);
        arg0.field1966 += Statics.field3169.method2292(var3, 0, var3.length, arg0.field1973, arg0.field1966);
        return arg0.field1966 - var2;
    }
}
