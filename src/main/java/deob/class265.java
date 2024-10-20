package deob;

@ObfuscatedName("jk")
public class class265 {

    public class265() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.f(Lgm;Lga;I)Lga;")
    public static final class200 method1002(class185 arg0, class200 arg1) {
        int var2 = arg0.method3344();
        if (arg1 == null) {
            int var3 = var2 - 1;
            int var4 = var3 | var3 >>> 1;
            int var5 = var4 | var4 >>> 2;
            int var6 = var5 | var5 >>> 4;
            int var7 = var6 | var6 >>> 8;
            int var8 = var7 | var7 >>> 16;
            int var9 = var8 + 1;
            arg1 = new class200(var9);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            boolean var12 = arg0.method3344() == 1;
            int var13 = arg0.method3348();
            class207 var14;
            if (var12) {
                var14 = new class198(arg0.method3353());
            } else {
                var14 = new class214(arg0.method3432());
            }
            arg1.method3708(var14, (long) var13);
        }
        return arg1;
    }

    @ObfuscatedName("ak.l(Lga;III)I")
    public static int method944(class200 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class214 var3 = (class214) arg0.method3706((long) arg1);
            return var3 == null ? arg2 : var3.field2512;
        }
    }
}
