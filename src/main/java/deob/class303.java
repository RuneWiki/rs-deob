package deob;

@ObfuscatedName("kr")
public class class303 {

    public class303() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("im.g(Lfd;I)V")
    public static void method4631(class177 arg0) {
        Statics.field3785 = arg0;
    }

    @ObfuscatedName("eh.r(Lgl;Ljava/lang/String;I)I")
    public static int method3142(class185 arg0, String arg1) {
        int var2 = arg0.field2406;
        byte[] var3 = class304.method2853(arg1);
        arg0.method3455(var3.length);
        arg0.field2406 += Statics.field3785.method3389(var3, 0, var3.length, arg0.field2405, arg0.field2406);
        return arg0.field2406 - var2;
    }

    @ObfuscatedName("s.e(Lgl;B)Ljava/lang/String;")
    public static String method313(class185 arg0) {
        return Statics.method2663(arg0, 32767);
    }
}
