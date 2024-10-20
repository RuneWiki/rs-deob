package deob;

@ObfuscatedName("il")
public class class257 {

    public class257() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ep.m(Lfv;Lgd;B)Lgd;")
    public static final class194 method2376(class181 arg0, class194 arg1) {
        int var2 = arg0.method3012();
        if (arg1 == null) {
            int var3 = class185.method2904(var2);
            arg1 = new class194(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method3012() == 1;
            int var6 = arg0.method3075();
            class200 var7;
            if (var5) {
                var7 = new class193(arg0.method3021());
            } else {
                var7 = new class206(arg0.method3017());
            }
            arg1.method3396(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("eg.p(Lgd;III)I")
    public static int method2750(class194 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class206 var3 = (class206) arg0.method3389((long) arg1);
            return var3 == null ? arg2 : var3.field2577;
        }
    }

    @ObfuscatedName("ev.i(Lgd;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method2471(class194 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class193 var3 = (class193) arg0.method3389((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2540;
        }
    }
}
