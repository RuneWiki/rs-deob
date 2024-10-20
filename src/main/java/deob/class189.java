package deob;

@ObfuscatedName("hs")
public class class189 {

    public class189() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ie.aj(Lsy;Lrz;I)Lrz;")
    public static final class454 method4194(class478 arg0, class454 arg1) {
        int var2 = arg0.method7909();
        if (arg1 == null) {
            int var3 = class292.method4415(var2);
            arg1 = new class454(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method7909() == 1;
            int var6 = arg0.method7907();
            class444 var7;
            if (var5) {
                var7 = new class440(arg0.method7950());
            } else {
                var7 = new class443(arg0.method7908());
            }
            arg1.method7595(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("fg.al(Lrz;III)I")
    public static int method2941(class454 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class443 var3 = (class443) arg0.method7611((long) arg1);
            return var3 == null ? arg2 : var3.field4671;
        }
    }

    @ObfuscatedName("qd.ac(Lrz;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method7298(class454 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class440 var3 = (class440) arg0.method7611((long) arg1);
            return var3 == null ? arg2 : (String) var3.field4668;
        }
    }
}
