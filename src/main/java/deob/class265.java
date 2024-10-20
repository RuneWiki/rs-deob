package deob;

@ObfuscatedName("jg")
public class class265 {

    public class265() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.v(Lgx;Lga;I)Lga;")
    public static final class200 method172(class185 arg0, class200 arg1) {
        int var2 = arg0.method3274();
        if (arg1 == null) {
            int var3 = class190.method5134(var2);
            arg1 = new class200(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method3274() == 1;
            int var6 = arg0.method3494();
            class207 var7;
            if (var5) {
                var7 = new class198(arg0.method3490());
            } else {
                var7 = new class214(arg0.method3279());
            }
            arg1.method3660(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("fh.s(Lga;III)I")
    public static int method3063(class200 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class214 var3 = (class214) arg0.method3659((long) arg1);
            return var3 == null ? arg2 : var3.field2480;
        }
    }

    @ObfuscatedName("dv.o(Lga;ILjava/lang/String;S)Ljava/lang/String;")
    public static String method2331(class200 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class198 var3 = (class198) arg0.method3659((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2436;
        }
    }
}
