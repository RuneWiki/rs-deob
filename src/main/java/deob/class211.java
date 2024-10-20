package deob;

@ObfuscatedName("hi")
public class class211 {

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ee.c(Lhc;I)V")
    public static void method2886(class210 arg0) {
        Statics.field2522 = arg0;
    }

    @ObfuscatedName("j.t(Lkp;Ljava/lang/String;I)I")
    public static int method84(class301 arg0, String arg1) {
        int var2 = arg0.field3707;
        byte[] var3 = class289.method3359(arg1);
        arg0.method5301(var3.length);
        arg0.field3707 += Statics.field2522.method3646(var3, 0, var3.length, arg0.field3708, arg0.field3707);
        return arg0.field3707 - var2;
    }

    @ObfuscatedName("en.o(Lkp;I)Ljava/lang/String;")
    public static String method3071(class301 arg0) {
        return method3073(arg0, 32767);
    }

    @ObfuscatedName("en.e(Lkp;II)Ljava/lang/String;")
    public static String method3073(class301 arg0, int arg1) {
        try {
            int var2 = arg0.method5143();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field3707 += Statics.field2522.method3645(arg0.field3708, arg0.field3707, var3, 0, var2);
            return class289.method1015(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
