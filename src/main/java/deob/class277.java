package deob;

@ObfuscatedName("jl")
public class class277 {

    public class277() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.o(Lgc;Lha;I)Lha;")
    public static final class210 method241(class195 arg0, class210 arg1) {
        int var2 = arg0.method3205();
        if (arg1 == null) {
            int var3 = class200.method1706(var2);
            arg1 = new class210(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method3205() == 1;
            int var6 = arg0.method3233();
            class217 var7;
            if (var5) {
                var7 = new class208(arg0.method3284());
            } else {
                var7 = new class224(arg0.method3254());
            }
            arg1.method3580(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("ef.k(Lha;III)I")
    public static int method2827(class210 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class224 var3 = (class224) arg0.method3575((long) arg1);
            return var3 == null ? arg2 : var3.field2669;
        }
    }

    @ObfuscatedName("ac.t(Lha;ILjava/lang/String;B)Ljava/lang/String;")
    public static String method271(class210 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class208 var3 = (class208) arg0.method3575((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2625;
        }
    }
}
