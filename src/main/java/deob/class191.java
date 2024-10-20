package deob;

@ObfuscatedName("go")
public class class191 {

    public class191() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.i(Ldm;Ljava/lang/String;B)I")
    public static int method578(class107 arg0, String arg1) {
        int var2 = arg0.field1837;
        byte[] var3 = class201.method1898(arg1);
        arg0.method2149(var3.length);
        arg0.field1837 += Statics.field2902.method2093(var3, 0, var3.length, arg0.field1841, arg0.field1837);
        return arg0.field1837 - var2;
    }
}
