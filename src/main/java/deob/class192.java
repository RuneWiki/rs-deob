package deob;

@ObfuscatedName("ga")
public class class192 {

    public class192() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.p(Ldp;Ljava/lang/String;B)I")
    public static int method2592(class107 arg0, String arg1) {
        int var2 = arg0.field1837;
        byte[] var3 = class202.method137(arg1);
        arg0.method2171(var3.length);
        arg0.field1837 += Statics.field2905.method2103(var3, 0, var3.length, arg0.field1838, arg0.field1837);
        return arg0.field1837 - var2;
    }
}
