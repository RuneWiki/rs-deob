package deob;

@ObfuscatedName("ic")
public class class248 {

    public class248() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ej.a(Lkc;Llr;B)Llr;")
    public static final class316 method3205(class300 arg0, class316 arg1) {
        int var2 = arg0.method5123();
        if (arg1 == null) {
            int var3 = var2 - 1;
            int var4 = var3 | var3 >>> 1;
            int var5 = var4 | var4 >>> 2;
            int var6 = var5 | var5 >>> 4;
            int var7 = var6 | var6 >>> 8;
            int var8 = var7 | var7 >>> 16;
            int var9 = var8 + 1;
            arg1 = new class316(var9);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            boolean var12 = arg0.method5123() == 1;
            int var13 = arg0.method5127();
            class181 var14;
            if (var12) {
                var14 = new class177(arg0.method5132());
            } else {
                var14 = new class180(arg0.method5155());
            }
            arg1.method5495(var14, (long) var13);
        }
        return arg1;
    }

    @ObfuscatedName("jh.t(Llr;III)I")
    public static int method4841(class316 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class180 var3 = (class180) arg0.method5494((long) arg1);
            return var3 == null ? arg2 : var3.field2088;
        }
    }
}
