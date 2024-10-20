package deob;

@ObfuscatedName("je")
public class class239 {

    public class239() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fj.ab(Lvg;Lud;I)Lud;")
    public static final class521 method3156(class549 arg0, class521 arg1) {
        int var2 = arg0.method9025();
        if (arg1 == null) {
            int var3 = class331.method5556(var2);
            arg1 = new class521(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method9025() == 1;
            int var6 = arg0.method8801();
            class506 var7;
            if (var5) {
                var7 = new class503(arg0.method8808());
            } else {
                var7 = new class505(arg0.method8803());
            }
            arg1.method8513(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("oj.ay(Lud;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method6634(class521 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class503 var3 = (class503) arg0.method8512((long) arg1);
            return var3 == null ? arg2 : (String) var3.field5071;
        }
    }
}
