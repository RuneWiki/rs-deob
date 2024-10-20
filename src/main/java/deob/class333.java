package deob;

@ObfuscatedName("mz")
public class class333 {

    public class333() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ml.at(Ltz;Ljava/lang/String;B)I")
    public static int method5429(class501 arg0, String arg1) {
        int var2 = arg0.field5017;
        byte[] var3 = class383.method1064(arg1);
        arg0.method8127(var3.length);
        arg0.field5017 += Statics.field3764.method5956(var3, 0, var3.length, arg0.field5016, arg0.field5017);
        return arg0.field5017 - var2;
    }

    @ObfuscatedName("ar.an(Ltz;B)Ljava/lang/String;")
    public static String method211(class501 arg0) {
        String var4;
        try {
            int var1 = arg0.method8144();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field5017 += Statics.field3764.method5951(arg0.field5016, arg0.field5017, var2, 0, var1);
            String var3 = class383.method5181(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
