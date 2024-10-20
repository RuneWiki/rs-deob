package deob;

@ObfuscatedName("ko")
public class class301 {

    public class301() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fb.z(Lfy;S)V")
    public static void method3232(class175 arg0) {
        Statics.field3713 = arg0;
    }

    @ObfuscatedName("gi.w(Lgk;Ljava/lang/String;B)I")
    public static int method3532(class183 arg0, String arg1) {
        int var2 = arg0.field2340;
        byte[] var3 = Statics.method4240(arg1);
        arg0.method3276(var3.length);
        arg0.field2340 += Statics.field3713.method3178(var3, 0, var3.length, arg0.field2339, arg0.field2340);
        return arg0.field2340 - var2;
    }
}
