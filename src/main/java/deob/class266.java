package deob;

@ObfuscatedName("jq")
public class class266 {

    public class266() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bd.i(Lfp;Ljava/lang/String;B)I")
    public static int method1033(class174 arg0, String arg1) {
        int var2 = arg0.field2399;
        byte[] var3 = class267.method4275(arg1);
        arg0.method2878(var3.length);
        arg0.field2399 += Statics.field3666.method2799(var3, 0, var3.length, arg0.field2405, arg0.field2399);
        return arg0.field2399 - var2;
    }
}
