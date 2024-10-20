package deob;

@ObfuscatedName("jf")
public class class261 {

    public class261() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iq.s(Lgy;Lgz;B)Lgz;")
    public static final class198 method4400(class185 arg0, class198 arg1) {
        int var2 = arg0.method3239();
        if (arg1 == null) {
            int var3 = class189.method3203(var2);
            arg1 = new class198(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method3239() == 1;
            int var6 = arg0.method3243();
            class204 var7;
            if (var5) {
                var7 = new class197(arg0.method3248());
            } else {
                var7 = new class210(arg0.method3292());
            }
            arg1.method3642(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("bu.g(Lgz;III)I")
    public static int method1479(class198 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class210 var3 = (class210) arg0.method3641((long) arg1);
            return var3 == null ? arg2 : var3.field2599;
        }
    }

    @ObfuscatedName("ij.m(Lgz;ILjava/lang/String;B)Ljava/lang/String;")
    public static String method4283(class198 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class197 var3 = (class197) arg0.method3641((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2562;
        }
    }
}
