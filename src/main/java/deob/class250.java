package deob;

@ObfuscatedName("ia")
public class class250 {

    public class250() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fv.p(Lfr;Lgj;I)Lgj;")
    public static final class187 method2793(class174 arg0, class187 arg1) {
        int var2 = arg0.method2810();
        if (arg1 == null) {
            int var3 = class178.method3692(var2);
            arg1 = new class187(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method2810() == 1;
            int var6 = arg0.method2832();
            class193 var7;
            if (var5) {
                var7 = new class186(arg0.method2818());
            } else {
                var7 = new class199(arg0.method2803());
            }
            arg1.method3159(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("cq.m(Lgj;III)I")
    public static int method1645(class187 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class199 var3 = (class199) arg0.method3154((long) arg1);
            return var3 == null ? arg2 : var3.field2497;
        }
    }

    @ObfuscatedName("fj.e(Lgj;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method2742(class187 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class186 var3 = (class186) arg0.method3154((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2460;
        }
    }
}
