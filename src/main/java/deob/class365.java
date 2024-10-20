package deob;

@ObfuscatedName("oh")
public class class365 {

    public class365() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ix.aw(Lvl;Ljava/lang/String;I)I")
    public static int method4218(class558 arg0, String arg1) {
        int var2 = arg0.field5462;
        byte[] var3 = class418.method2619(arg1);
        arg0.method9255(var3.length);
        arg0.field5462 += Statics.field4042.method6863(var3, 0, var3.length, arg0.field5463, arg0.field5462);
        return arg0.field5462 - var2;
    }

    @ObfuscatedName("qk.ak(Lvl;I)Ljava/lang/String;")
    public static String method7422(class558 arg0) {
        return method3536(arg0, 32767);
    }

    @ObfuscatedName("gg.aj(Lvl;IB)Ljava/lang/String;")
    public static String method3536(class558 arg0, int arg1) {
        try {
            int var2 = arg0.method9274();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field5462 += Statics.field4042.method6862(arg0.field5463, arg0.field5462, var3, 0, var2);
            return class418.method5807(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
