package deob;

@ObfuscatedName("iu")
public class class259 {

    public class259() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fw.h(Lkj;Lla;I)Lla;")
    public static final class327 method3311(class311 arg0, class327 arg1) {
        int var2 = arg0.method5274();
        if (arg1 == null) {
            int var3 = class198.method1722(var2);
            arg1 = new class327(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method5274() == 1;
            int var6 = arg0.method5119();
            class190 var7;
            if (var5) {
                var7 = new class186(arg0.method5202());
            } else {
                var7 = new class189(arg0.method5120());
            }
            arg1.method5503(var7, (long) var6);
        }
        return arg1;
    }
}
