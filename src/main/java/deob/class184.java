package deob;

@ObfuscatedName("gj")
public class class184 {

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.p(Lde;I)V")
    public static void method712(class120 arg0) {
        Statics.field2834 = arg0;
    }

    @ObfuscatedName("bm.i(Ldt;IB)Ljava/lang/String;")
    public static String method1425(class127 arg0, int arg1) {
        try {
            int var2 = arg0.method2501();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field2038 += Statics.field2834.method2416(arg0.field2037, arg0.field2038, var3, 0, var2);
            return class149.method105(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
