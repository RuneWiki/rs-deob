package deob;

@ObfuscatedName("mw")
public class class316 {

    public class316() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kn.aj(Lmg;B)V")
    public static void method4879(class315 arg0) {
        Statics.field3684 = arg0;
    }

    @ObfuscatedName("gn.al(Lsy;Ljava/lang/String;I)I")
    public static int method3065(class478 arg0, String arg1) {
        int var2 = arg0.field4904;
        byte[] var3 = class366.method4746(arg1);
        arg0.method7901(var3.length);
        arg0.field4904 += Statics.field3684.method5714(var3, 0, var3.length, arg0.field4906, arg0.field4904);
        return arg0.field4904 - var2;
    }

    @ObfuscatedName("kq.ac(Lsy;I)Ljava/lang/String;")
    public static String method4939(class478 arg0) {
        return method5951(arg0, 32767);
    }

    @ObfuscatedName("nz.ab(Lsy;II)Ljava/lang/String;")
    public static String method5951(class478 arg0, int arg1) {
        try {
            int var2 = arg0.method7918();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field4904 += Statics.field3684.method5709(arg0.field4906, arg0.field4904, var3, 0, var2);
            return class366.method6017(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
