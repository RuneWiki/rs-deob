package deob;

@ObfuscatedName("fi")
public class class158 {

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.l(Lot;Lnz;I)Lnz;")
    public static final class379 method360(class401 arg0, class379 arg1) {
        int var2 = arg0.method6272();
        if (arg1 == null) {
            int var3 = class246.method2634(var2);
            arg1 = new class379(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method6272() == 1;
            int var6 = arg0.method6276();
            class370 var7;
            if (var5) {
                var7 = new class366(arg0.method6474());
            } else {
                var7 = new class369(arg0.method6277());
            }
            arg1.method6043(var7, (long) var6);
        }
        return arg1;
    }
}
