package deob;

@ObfuscatedName("hn")
public class class222 {

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.m(Ldc;I)V")
    public static void method2692(class113 arg0) {
        Statics.field3155 = arg0;
    }

    @ObfuscatedName("d.l(Ldx;I)Ljava/lang/String;")
    public static String method580(class119 arg0) {
        return method134(arg0, 32767);
    }

    @ObfuscatedName("p.y(Ldx;IB)Ljava/lang/String;")
    public static String method134(class119 arg0, int arg1) {
        try {
            int var2 = arg0.method2394();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1955 += Statics.field3155.method2309(arg0.field1959, arg0.field1955, var3, 0, var2);
            return class165.method49(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
