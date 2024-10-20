package deob;

@ObfuscatedName("gc")
public class class183 {

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bd.v(Ldt;I)V")
    public static void method1387(class119 arg0) {
        Statics.field2829 = arg0;
    }

    @ObfuscatedName("an.f(Ldr;Ljava/lang/String;I)I")
    public static int method853(class126 arg0, String arg1) {
        int var2 = arg0.field2027;
        byte[] var3 = class148.method1879(arg1);
        arg0.method2464(var3.length);
        arg0.field2027 += Statics.field2829.method2386(var3, 0, var3.length, arg0.field2029, arg0.field2027);
        return arg0.field2027 - var2;
    }
}
