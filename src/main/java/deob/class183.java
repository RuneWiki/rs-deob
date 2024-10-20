package deob;

@ObfuscatedName("hg")
public class class183 {

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mk.aq(Luq;Lta;B)Lta;")
    public static final class507 method5700(class534 arg0, class507 arg1) {
        int var2 = arg0.method8591();
        if (arg1 == null) {
            int var3 = class320.method5477(var2);
            arg1 = new class507(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method8591() == 1;
            int var6 = arg0.method8595();
            class492 var7;
            if (var5) {
                var7 = new class489(arg0.method8741());
            } else {
                var7 = new class491(arg0.method8597());
            }
            arg1.method8319(var7, (long) var6);
        }
        return arg1;
    }
}
