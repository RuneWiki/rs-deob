package deob;

@ObfuscatedName("jp")
public class class265 {

    public class265() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ih.y(Lge;Lgo;I)Lgo;")
    public static final class200 method4229(class185 arg0, class200 arg1) {
        int var2 = arg0.method3299();
        if (arg1 == null) {
            int var3 = class190.method2844(var2);
            arg1 = new class200(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method3299() == 1;
            int var6 = arg0.method3272();
            class207 var7;
            if (var5) {
                var7 = new class198(arg0.method3277());
            } else {
                var7 = new class214(arg0.method3374());
            }
            arg1.method3651(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("ig.c(Lgo;IIB)I")
    public static int method4405(class200 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class214 var3 = (class214) arg0.method3667((long) arg1);
            return var3 == null ? arg2 : var3.field2487;
        }
    }

    @ObfuscatedName("as.n(Lgo;ILjava/lang/String;B)Ljava/lang/String;")
    public static String method966(class200 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class198 var3 = (class198) arg0.method3667((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2443;
        }
    }
}
