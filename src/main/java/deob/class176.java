package deob;

@ObfuscatedName("fz")
public class class176 {

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hr.v(Lpi;Lpt;I)Lpt;")
    public static final class418 method3942(class438 arg0, class418 arg1) {
        int var2 = arg0.method6971();
        if (arg1 == null) {
            int var3 = class272.method1825(var2);
            arg1 = new class418(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method6971() == 1;
            int var6 = arg0.method6975();
            class409 var7;
            if (var5) {
                var7 = new class405(arg0.method6981());
            } else {
                var7 = new class408(arg0.method6976());
            }
            arg1.method6757(var7, (long) var6);
        }
        return arg1;
    }
}
