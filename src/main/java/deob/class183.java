package deob;

@ObfuscatedName("gf")
public class class183 {

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bk.h(Lqy;Lql;I)Lql;")
    public static final class443 method2026(class467 arg0, class443 arg1) {
        int var2 = arg0.method7792();
        if (arg1 == null) {
            int var3 = class285.method7578(var2);
            arg1 = new class443(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method7792() == 1;
            int var6 = arg0.method7796();
            class433 var7;
            if (var5) {
                var7 = new class429(arg0.method7801());
            } else {
                var7 = new class432(arg0.method7946());
            }
            arg1.method7523(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("ds.e(Lql;III)I")
    public static int method2676(class443 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class432 var3 = (class432) arg0.method7525((long) arg1);
            return var3 == null ? arg2 : var3.field4683;
        }
    }
}
