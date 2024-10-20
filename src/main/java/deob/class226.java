package deob;

@ObfuscatedName("hk")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aj.x(Ldp;Ljava/lang/String;I)I")
    public static int method961(class123 arg0, String arg1) {
        int var2 = arg0.field2057;
        byte[] var3 = class169.method2110(arg1);
        arg0.method2406(var3.length);
        arg0.field2057 += Statics.field3233.method2342(var3, 0, var3.length, arg0.field2056, arg0.field2057);
        return arg0.field2057 - var2;
    }
}
