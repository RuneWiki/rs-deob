package deob;

@ObfuscatedName("jy")
public class class277 {

    public class277() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fk.g(Lgg;Lhh;B)Lhh;")
    public static final class210 method3031(class195 arg0, class210 arg1) {
        int var2 = arg0.method3332();
        if (arg1 == null) {
            int var3 = class200.method2426(var2);
            arg1 = new class210(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method3332() == 1;
            int var6 = arg0.method3312();
            class217 var7;
            if (var5) {
                var7 = new class208(arg0.method3429());
            } else {
                var7 = new class224(arg0.method3472());
            }
            arg1.method3683(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("cq.e(Lhh;IIS)I")
    public static int method2026(class210 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class224 var3 = (class224) arg0.method3674((long) arg1);
            return var3 == null ? arg2 : var3.field2675;
        }
    }

    @ObfuscatedName("fs.b(Lhh;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method3127(class210 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class208 var3 = (class208) arg0.method3674((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2631;
        }
    }
}
