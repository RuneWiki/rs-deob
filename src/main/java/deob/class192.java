package deob;

@ObfuscatedName("hr")
public class class192 {

    public class192() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fd.aw(Lty;Lsa;B)Lsa;")
    public static final class489 method2956(class514 arg0, class489 arg1) {
        int var2 = arg0.method8244();
        if (arg1 == null) {
            int var3 = class305.method2707(var2);
            arg1 = new class489(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method8244() == 1;
            int var6 = arg0.method8248();
            class474 var7;
            if (var5) {
                var7 = new class471(arg0.method8369());
            } else {
                var7 = new class473(arg0.method8496());
            }
            arg1.method7962(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("gk.ay(Lsa;III)I")
    public static int method3237(class489 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class473 var3 = (class473) arg0.method7961((long) arg1);
            return var3 == null ? arg2 : var3.field4817;
        }
    }
}
