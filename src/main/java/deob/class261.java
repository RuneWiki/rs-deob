package deob;

@ObfuscatedName("jc")
public class class261 {

    public class261() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.a(Lgh;Lgr;B)Lgr;")
    public static final class198 method933(class185 arg0, class198 arg1) {
        int var2 = arg0.method2962();
        if (arg1 == null) {
            int var3 = class189.method2871(var2);
            arg1 = new class198(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method2962() == 1;
            int var6 = arg0.method2966();
            class204 var7;
            if (var5) {
                var7 = new class197(arg0.method3168());
            } else {
                var7 = new class210(arg0.method2967());
            }
            arg1.method3341(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("cj.w(Lgr;III)I")
    public static int method1485(class198 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class210 var3 = (class210) arg0.method3350((long) arg1);
            return var3 == null ? arg2 : var3.field2604;
        }
    }

    @ObfuscatedName("gb.e(Lgr;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method3290(class198 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class197 var3 = (class197) arg0.method3350((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2567;
        }
    }
}
