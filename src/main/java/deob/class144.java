package deob;

@ObfuscatedName("eg")
public class class144 {

    public class144() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.f(Lnt;Lmo;I)Lmo;")
    public static final class362 method181(class384 arg0, class362 arg1) {
        int var2 = arg0.method5902();
        if (arg1 == null) {
            int var3 = class232.method2226(var2);
            arg1 = new class362(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method5902() == 1;
            int var6 = arg0.method5901();
            class353 var7;
            if (var5) {
                var7 = new class349(arg0.method5906());
            } else {
                var7 = new class352(arg0.method5965());
            }
            arg1.method5669(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("ek.e(Lmo;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method2439(class362 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class349 var3 = (class349) arg0.method5668((long) arg1);
            return var3 == null ? arg2 : (String) var3.field3931;
        }
    }
}
