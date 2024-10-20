package deob;

@ObfuscatedName("jw")
public class class261 {

    public class261() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ho.p(Lgj;Lgs;I)Lgs;")
    public static final class198 method3985(class185 arg0, class198 arg1) {
        int var2 = arg0.method3197();
        if (arg1 == null) {
            int var3 = class189.method2865(var2);
            arg1 = new class198(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method3197() == 1;
            int var6 = arg0.method3138();
            class204 var7;
            if (var5) {
                var7 = new class197(arg0.method3131());
            } else {
                var7 = new class210(arg0.method3127());
            }
            arg1.method3483(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("fg.i(Lgs;III)I")
    public static int method3004(class198 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class210 var3 = (class210) arg0.method3472((long) arg1);
            return var3 == null ? arg2 : var3.field2576;
        }
    }

    @ObfuscatedName("bl.w(Lgs;ILjava/lang/String;B)Ljava/lang/String;")
    public static String method997(class198 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class197 var3 = (class197) arg0.method3472((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2539;
        }
    }
}
