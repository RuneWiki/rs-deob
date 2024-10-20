package deob;

@ObfuscatedName("jc")
public class class261 {

    public class261() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.n(Lgv;Lgb;I)Lgb;")
    public static final class198 method121(class185 arg0, class198 arg1) {
        int var2 = arg0.method3021();
        if (arg1 == null) {
            int var3 = class189.method3889(var2);
            arg1 = new class198(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method3021() == 1;
            int var6 = arg0.method3025();
            class204 var7;
            if (var5) {
                var7 = new class197(arg0.method3030());
            } else {
                var7 = new class210(arg0.method3026());
            }
            arg1.method3387(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("a.v(Lgb;III)I")
    public static int method107(class198 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class210 var3 = (class210) arg0.method3382((long) arg1);
            return var3 == null ? arg2 : var3.field2611;
        }
    }

    @ObfuscatedName("io.y(Lgb;ILjava/lang/String;B)Ljava/lang/String;")
    public static String method3896(class198 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class197 var3 = (class197) arg0.method3382((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2574;
        }
    }
}
