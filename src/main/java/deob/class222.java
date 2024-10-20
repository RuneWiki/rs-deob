package deob;

@ObfuscatedName("hq")
public class class222 {

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gs.h(Ldp;Ljava/lang/String;B)I")
    public static int method3469(class119 arg0, String arg1) {
        int var2 = arg0.field1988;
        byte[] var3 = class165.method805(arg1);
        arg0.method2318(var3.length);
        arg0.field1988 += Statics.field2633.method2247(var3, 0, var3.length, arg0.field1989, arg0.field1988);
        return arg0.field1988 - var2;
    }

    @ObfuscatedName("ax.m(Ldp;I)Ljava/lang/String;")
    public static String method630(class119 arg0) {
        String var4;
        try {
            int var1 = arg0.method2332();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field1988 += Statics.field2633.method2249(arg0.field1989, arg0.field1988, var2, 0, var1);
            String var3 = class165.method2020(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
