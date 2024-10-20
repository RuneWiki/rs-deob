package deob;

@ObfuscatedName("my")
public class class335 {

    public class335() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("em.au(Lmx;I)V")
    public static void method2771(class334 arg0) {
        Statics.field3805 = arg0;
    }

    @ObfuscatedName("ij.ae(Ltm;Ljava/lang/String;I)I")
    public static int method3914(class515 arg0, String arg1) {
        int var2 = arg0.field5111;
        byte[] var3 = class385.method4425(arg1);
        arg0.method8420(var3.length);
        arg0.field5111 += Statics.field3805.method6000(var3, 0, var3.length, arg0.field5108, arg0.field5111);
        return arg0.field5111 - var2;
    }

    @ObfuscatedName("ms.ao(Ltm;I)Ljava/lang/String;")
    public static String method6035(class515 arg0) {
        return method3052(arg0, 32767);
    }

    @ObfuscatedName("fa.at(Ltm;IB)Ljava/lang/String;")
    public static String method3052(class515 arg0, int arg1) {
        try {
            int var2 = arg0.method8436();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field5111 += Statics.field3805.method6001(arg0.field5108, arg0.field5111, var3, 0, var2);
            return class385.method5512(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
