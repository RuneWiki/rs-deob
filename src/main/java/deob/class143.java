package deob;

@ObfuscatedName("eb")
public class class143 {

    public class143() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kl.v(Lnd;Lmr;I)Lmr;")
    public static final class361 method4696(class383 arg0, class361 arg1) {
        int var2 = arg0.method5965();
        if (arg1 == null) {
            int var3 = class231.method1933(var2);
            arg1 = new class361(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method5965() == 1;
            int var6 = arg0.method5969();
            class352 var7;
            if (var5) {
                var7 = new class348(arg0.method5974());
            } else {
                var7 = new class351(arg0.method5970());
            }
            arg1.method5754(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("cr.n(Lmr;III)I")
    public static int method1790(class361 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class351 var3 = (class351) arg0.method5752((long) arg1);
            return var3 == null ? arg2 : var3.field3937;
        }
    }

    @ObfuscatedName("lb.f(Lmr;ILjava/lang/String;B)Ljava/lang/String;")
    public static String method5166(class361 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class348 var3 = (class348) arg0.method5752((long) arg1);
            return var3 == null ? arg2 : (String) var3.field3934;
        }
    }
}
