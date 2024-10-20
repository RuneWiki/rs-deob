package deob;

@ObfuscatedName("hq")
public class class223 {

    public class223() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dm.j(Ldx;Ljava/lang/String;B)I")
    public static int method2283(class120 arg0, String arg1) {
        int var2 = arg0.field1972;
        byte[] var3 = class166.method2144(arg1);
        arg0.method2527(var3.length);
        arg0.field1972 += Statics.field2645.method2292(var3, 0, var3.length, arg0.field1974, arg0.field1972);
        return arg0.field1972 - var2;
    }
}
