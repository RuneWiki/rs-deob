package deob;

@ObfuscatedName("jl")
public class class266 {

    public class266() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.w(Lfz;I)Ljava/lang/String;")
    public static String method8(class174 arg0) {
        return method3732(arg0, 32767);
    }

    @ObfuscatedName("hg.s(Lfz;IB)Ljava/lang/String;")
    public static String method3732(class174 arg0, int arg1) {
        try {
            int var2 = arg0.method2985();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2390 += Statics.field3662.method2895(arg0.field2389, arg0.field2390, var3, 0, var2);
            return class267.method62(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
