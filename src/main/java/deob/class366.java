package deob;

@ObfuscatedName("ot")
public class class366 {

    public class366() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ra.ac(Loc;B)V")
    public static void method7826(class365 arg0) {
        Statics.field4017 = arg0;
    }

    @ObfuscatedName("lc.ae(Lvf;Ljava/lang/String;I)I")
    public static int method5607(class551 arg0, String arg1) {
        int var2 = arg0.field5415;
        byte[] var3 = class417.method3031(arg1);
        arg0.method8972(var3.length);
        arg0.field5415 += Statics.field4017.method6669(var3, 0, var3.length, arg0.field5413, arg0.field5415);
        return arg0.field5415 - var2;
    }

    @ObfuscatedName("tm.ag(Lvf;I)Ljava/lang/String;")
    public static String method8353(class551 arg0) {
        return method194(arg0, 32767);
    }

    @ObfuscatedName("aa.am(Lvf;IS)Ljava/lang/String;")
    public static String method194(class551 arg0, int arg1) {
        try {
            int var2 = arg0.method8989();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field5415 += Statics.field4017.method6670(arg0.field5413, arg0.field5415, var3, 0, var2);
            return class417.method3418(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
