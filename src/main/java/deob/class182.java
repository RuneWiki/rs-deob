package deob;

@ObfuscatedName("gg")
public class class182 {

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jc.am(Luk;Ltb;I)Ltb;")
    public static final class504 method4263(class531 arg0, class504 arg1) {
        int var2 = arg0.method8561();
        if (arg1 == null) {
            int var3 = class318.method2259(var2);
            arg1 = new class504(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method8561() == 1;
            int var6 = arg0.method8688();
            class489 var7;
            if (var5) {
                var7 = new class486(arg0.method8641());
            } else {
                var7 = new class488(arg0.method8566());
            }
            arg1.method8292(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("lj.ap(Ltb;IIS)I")
    public static int method5355(class504 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class488 var3 = (class488) arg0.method8286((long) arg1);
            return var3 == null ? arg2 : var3.field4887;
        }
    }
}
