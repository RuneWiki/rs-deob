package deob;

@ObfuscatedName("hl")
public class class222 {

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.a(Lds;Ljava/lang/String;I)I")
    public static int method2623(class119 arg0, String arg1) {
        int var2 = arg0.field1980;
        byte[] var3 = class165.method2779(arg1);
        arg0.method2343(var3.length);
        arg0.field1980 += Statics.field3178.method2273(var3, 0, var3.length, arg0.field1981, arg0.field1980);
        return arg0.field1980 - var2;
    }
}
