package deob;

@ObfuscatedName("il")
public class class250 {

    public class250() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.v(Lid;I)V")
    public static void method65(class249 arg0) {
        Statics.field3118 = arg0;
    }

    @ObfuscatedName("eh.n(Lnd;Ljava/lang/String;I)I")
    public static int method2637(class383 arg0, String arg1) {
        int var2 = arg0.field4158;
        byte[] var3 = class302.method1813(arg1);
        arg0.method5989(var3.length);
        arg0.field4158 += Statics.field3118.method4359(var3, 0, var3.length, arg0.field4155, arg0.field4158);
        return arg0.field4158 - var2;
    }

    @ObfuscatedName("in.f(Lnd;I)Ljava/lang/String;")
    public static String method4183(class383 arg0) {
        return method3899(arg0, 32767);
    }

    @ObfuscatedName("hy.y(Lnd;IB)Ljava/lang/String;")
    public static String method3899(class383 arg0, int arg1) {
        try {
            int var2 = arg0.method5979();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field4158 += Statics.field3118.method4360(arg0.field4155, arg0.field4158, var3, 0, var2);
            return class302.method340(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
