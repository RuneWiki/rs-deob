package deob;

@ObfuscatedName("jx")
public class class277 {

    public class277() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.t(Lgb;Lhq;I)Lhq;")
    public static final class210 method6(class195 arg0, class210 arg1) {
        int var2 = arg0.method3236();
        if (arg1 == null) {
            int var3 = var2 - 1;
            int var4 = var3 | var3 >>> 1;
            int var5 = var4 | var4 >>> 2;
            int var6 = var5 | var5 >>> 4;
            int var7 = var6 | var6 >>> 8;
            int var8 = var7 | var7 >>> 16;
            int var9 = var8 + 1;
            arg1 = new class210(var9);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            boolean var12 = arg0.method3236() == 1;
            int var13 = arg0.method3399();
            class217 var14;
            if (var12) {
                var14 = new class208(arg0.method3257());
            } else {
                var14 = new class224(arg0.method3241());
            }
            arg1.method3609(var14, (long) var13);
        }
        return arg1;
    }

    @ObfuscatedName("ky.q(Lhq;III)I")
    public static int method4894(class210 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class224 var3 = (class224) arg0.method3594((long) arg1);
            return var3 == null ? arg2 : var3.field2653;
        }
    }
}
