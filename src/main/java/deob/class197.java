package deob;

@ObfuscatedName("gi")
public class class197 {

    public class197() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fy.d(Ldu;Leb;I)Leb;")
    public static final class143 method3079(class130 arg0, class143 arg1) {
        int var2 = arg0.method2379();
        if (arg1 == null) {
            int var3 = class134.method595(var2);
            arg1 = new class143(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method2379() == 1;
            int var6 = arg0.method2233();
            class149 var7;
            if (var5) {
                var7 = new class142(arg0.method2314());
            } else {
                var7 = new class155(arg0.method2246());
            }
            arg1.method2567(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("gf.c(Leb;III)I")
    public static int method3195(class143 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class155 var3 = (class155) arg0.method2566((long) arg1);
            return var3 == null ? arg2 : var3.field2047;
        }
    }
}
