package deob;

@ObfuscatedName("hg")
public class class192 {

    public class192() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cx.au(Ltm;Lsf;I)Lsf;")
    public static final class488 method1074(class515 arg0, class488 arg1) {
        int var2 = arg0.method8300();
        if (arg1 == null) {
            int var3 = class304.method4709(var2);
            arg1 = new class488(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method8300() == 1;
            int var6 = arg0.method8466();
            class473 var7;
            if (var5) {
                var7 = new class470(arg0.method8311());
            } else {
                var7 = new class472(arg0.method8306());
            }
            arg1.method8016(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("ar.ae(Lsf;III)I")
    public static int method157(class488 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class472 var3 = (class472) arg0.method8008((long) arg1);
            return var3 == null ? arg2 : var3.field4812;
        }
    }
}
