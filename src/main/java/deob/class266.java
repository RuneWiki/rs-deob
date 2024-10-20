package deob;

@ObfuscatedName("jp")
public class class266 {

    public class266() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ex.d(Lfw;IB)Ljava/lang/String;")
    public static String method2456(class174 arg0, int arg1) {
        try {
            int var2 = arg0.method2927();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2364 += Statics.field3640.method2836(arg0.field2367, arg0.field2364, var3, 0, var2);
            return class267.method3594(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
