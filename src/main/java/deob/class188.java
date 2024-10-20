package deob;

@ObfuscatedName("ho")
public class class188 {

    public class188() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dr.ap(Lvl;Lum;I)Lum;")
    public static final class530 method2372(class558 arg0, class530 arg1) {
        int var2 = arg0.method9258();
        if (arg1 == null) {
            int var3 = class332.method2832(var2);
            arg1 = new class530(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method9258() == 1;
            int var6 = arg0.method9380();
            class515 var7;
            if (var5) {
                var7 = new class512(arg0.method9269());
            } else {
                var7 = new class514(arg0.method9264());
            }
            arg1.method8970(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("ge.aw(Lum;III)I")
    public static int method3588(class530 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class514 var3 = (class514) arg0.method8985((long) arg1);
            return var3 == null ? arg2 : var3.field5168;
        }
    }

    @ObfuscatedName("ly.ak(Lum;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method5808(class530 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class512 var3 = (class512) arg0.method8985((long) arg1);
            return var3 == null ? arg2 : (String) var3.field5166;
        }
    }
}
