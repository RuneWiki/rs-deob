package deob;

@ObfuscatedName("hv")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("v.s(Ldy;Ljava/lang/String;S)I")
    public static int method561(class123 arg0, String arg1) {
        int var2 = arg0.field2028;
        byte[] var3 = class169.method1614(arg1);
        arg0.method2361(var3.length);
        arg0.field2028 += Statics.field3231.method2289(var3, 0, var3.length, arg0.field2033, arg0.field2028);
        return arg0.field2028 - var2;
    }

    @ObfuscatedName("fe.z(Ldy;B)Ljava/lang/String;")
    public static String method2985(class123 arg0) {
        return method1048(arg0, 32767);
    }

    @ObfuscatedName("bo.t(Ldy;IB)Ljava/lang/String;")
    public static String method1048(class123 arg0, int arg1) {
        try {
            int var2 = arg0.method2536();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2028 += Statics.field3231.method2297(arg0.field2033, arg0.field2028, var3, 0, var2);
            return class169.method2058(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
