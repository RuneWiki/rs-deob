package deob;

@ObfuscatedName("oq")
public class class366 {

    public class366() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ia.aq(Lvp;Ljava/lang/String;I)I")
    public static int method3990(class547 arg0, String arg1) {
        int var2 = arg0.field5363;
        byte[] var3 = Statics.method3396(arg1);
        arg0.method8726(var3.length);
        arg0.field5363 += Statics.field3999.method6408(var3, 0, var3.length, arg0.field5364, arg0.field5363);
        return arg0.field5363 - var2;
    }

    @ObfuscatedName("hf.ad(Lvp;I)Ljava/lang/String;")
    public static String method3487(class547 arg0) {
        String var4;
        try {
            int var1 = arg0.method8744();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field5363 += Statics.field3999.method6409(arg0.field5364, arg0.field5363, var2, 0, var1);
            String var3 = class414.method5175(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
