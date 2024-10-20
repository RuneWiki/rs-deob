package deob;

@ObfuscatedName("ji")
public class class268 {

    public class268() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("if.n(Lgc;Lgq;I)Lgq;")
    public static final class205 method4601(class190 arg0, class205 arg1) {
        int var2 = arg0.method3511();
        if (arg1 == null) {
            int var3 = var2 - 1;
            int var4 = var3 | var3 >>> 1;
            int var5 = var4 | var4 >>> 2;
            int var6 = var5 | var5 >>> 4;
            int var7 = var6 | var6 >>> 8;
            int var8 = var7 | var7 >>> 16;
            int var9 = var8 + 1;
            arg1 = new class205(var9);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            boolean var12 = arg0.method3511() == 1;
            int var13 = arg0.method3515();
            class212 var14;
            if (var12) {
                var14 = new class203(arg0.method3520());
            } else {
                var14 = new class219(arg0.method3562());
            }
            arg1.method3877(var14, (long) var13);
        }
        return arg1;
    }
}
