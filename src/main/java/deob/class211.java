package deob;

@ObfuscatedName("hh")
public class class211 {

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.y(Lfm;Ljava/lang/String;I)I")
    public static int method1790(class161 arg0, String arg1) {
        int var2 = arg0.field2267;
        byte[] var3 = class204.method1125(arg1);
        arg0.method2731(var3.length);
        arg0.field2267 += Statics.field3111.method2657(var3, 0, var3.length, arg0.field2258, arg0.field2267);
        return arg0.field2267 - var2;
    }
}
