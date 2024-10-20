package deob;

@ObfuscatedName("gy")
public class class184 {

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("et.x(Ldg;I)Ljava/lang/String;")
    public static String method2634(class127 arg0) {
        String var4;
        try {
            int var1 = arg0.method2437();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2008 += Statics.field2830.method2330(arg0.field2015, arg0.field2008, var2, 0, var1);
            String var3 = class149.method1537(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
