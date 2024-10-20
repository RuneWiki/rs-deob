package deob;

@ObfuscatedName("iz")
public class class258 {

    public class258() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ih.m(Lkn;Llf;I)Llf;")
    public static final class326 method4134(class310 arg0, class326 arg1) {
        int var2 = arg0.method5227();
        if (arg1 == null) {
            int var3 = var2 - 1;
            int var4 = var3 | var3 >>> 1;
            int var5 = var4 | var4 >>> 2;
            int var6 = var5 | var5 >>> 4;
            int var7 = var6 | var6 >>> 8;
            int var8 = var7 | var7 >>> 16;
            int var9 = var8 + 1;
            arg1 = new class326(var9);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            boolean var12 = arg0.method5227() == 1;
            int var13 = arg0.method5231();
            class190 var14;
            if (var12) {
                var14 = new class186(arg0.method5236());
            } else {
                var14 = new class189(arg0.method5209());
            }
            arg1.method5614(var14, (long) var13);
        }
        return arg1;
    }

    @ObfuscatedName("gz.o(Llf;III)I")
    public static int method3448(class326 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class189 var3 = (class189) arg0.method5615((long) arg1);
            return var3 == null ? arg2 : var3.field2150;
        }
    }

    @ObfuscatedName("iw.q(Llf;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method4181(class326 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class186 var3 = (class186) arg0.method5615((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2146;
        }
    }
}
