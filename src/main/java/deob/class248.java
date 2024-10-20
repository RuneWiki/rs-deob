package deob;

@ObfuscatedName("if")
public class class248 {

    public class248() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ip.c(Lkz;Llj;I)Llj;")
    public static final class316 method4436(class300 arg0, class316 arg1) {
        int var2 = arg0.method5103();
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
            boolean var12 = arg0.method5103() == 1;
            int var13 = arg0.method5107();
            class181 var14;
            if (var12) {
                var14 = new class177(arg0.method5112());
            } else {
                var14 = new class180(arg0.method5208());
            }
            arg1.method5497(var14, (long) var13);
        }
        return arg1;
    }

    @ObfuscatedName("bd.x(Llj;III)I")
    public static int method1051(class316 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class180 var3 = (class180) arg0.method5493((long) arg1);
            return var3 == null ? arg2 : var3.field2093;
        }
    }
}
