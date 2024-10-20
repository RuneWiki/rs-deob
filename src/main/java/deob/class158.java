package deob;

@ObfuscatedName("fo")
public class class158 {

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.n(Lot;Lnz;I)Lnz;")
    public static final class378 method2378(class400 arg0, class378 arg1) {
        int var2 = arg0.method6217();
        if (arg1 == null) {
            int var3 = class246.method1937(var2);
            arg1 = new class378(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method6217() == 1;
            int var6 = arg0.method6327();
            class369 var7;
            if (var5) {
                var7 = new class365(arg0.method6226());
            } else {
                var7 = new class368(arg0.method6222());
            }
            arg1.method5997(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("dg.c(Lnz;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method2382(class378 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class365 var3 = (class365) arg0.method5996((long) arg1);
            return var3 == null ? arg2 : (String) var3.field4051;
        }
    }
}
