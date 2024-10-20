package deob;

@ObfuscatedName("mv")
public class class320 {

    public class320() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("js.an(Lsg;Ljava/lang/String;I)I")
    public static int method4756(class489 arg0, String arg1) {
        int var2 = arg0.field4989;
        byte[] var3 = class370.method3939(arg1);
        arg0.method8246(var3.length);
        arg0.field4989 += Statics.field3726.method5933(var3, 0, var3.length, arg0.field4991, arg0.field4989);
        return arg0.field4989 - var2;
    }

    @ObfuscatedName("jc.aw(Lsg;B)Ljava/lang/String;")
    public static String method4550(class489 arg0) {
        String var4;
        try {
            int var1 = arg0.method8417();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field4989 += Statics.field3726.method5935(arg0.field4991, arg0.field4989, var2, 0, var1);
            String var3 = class370.method8492(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
