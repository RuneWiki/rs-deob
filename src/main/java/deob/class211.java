package deob;

@ObfuscatedName("hu")
public class class211 {

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fo.i(Let;Ljava/lang/String;B)I")
    public static int method3009(class154 arg0, String arg1) {
        int var2 = arg0.field2091;
        byte[] var3 = class204.method175(arg1);
        arg0.method2679(var3.length);
        arg0.field2091 += Statics.field3115.method2501(var3, 0, var3.length, arg0.field2094, arg0.field2091);
        return arg0.field2091 - var2;
    }
}
