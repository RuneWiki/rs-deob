package deob;

@ObfuscatedName("ed")
public class class145 {

    public class145() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.s(Lnv;Lmc;I)Lmc;")
    public static final class363 method1414(class385 arg0, class363 arg1) {
        int var2 = arg0.method5958();
        if (arg1 == null) {
            int var3 = class233.method506(var2);
            arg1 = new class363(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method5958() == 1;
            int var6 = arg0.method5962();
            class354 var7;
            if (var5) {
                var7 = new class350(arg0.method5967());
            } else {
                var7 = new class353(arg0.method6182());
            }
            arg1.method5737(var7, (long) var6);
        }
        return arg1;
    }
}
