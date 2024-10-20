package deob;

@ObfuscatedName("gx")
public class class187 {

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.f(Lrd;Lqu;S)Lqu;")
    public static final class450 method2938(class474 arg0, class450 arg1) {
        int var2 = arg0.method7964();
        if (arg1 == null) {
            int var3 = class289.method16(var2);
            arg1 = new class450(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method7964() == 1;
            int var6 = arg0.method8132();
            class440 var7;
            if (var5) {
                var7 = new class436(arg0.method7983());
            } else {
                var7 = new class439(arg0.method7979());
            }
            arg1.method7693(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("eo.w(Lqu;ILjava/lang/String;S)Ljava/lang/String;")
    public static String method3012(class450 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class436 var3 = (class436) arg0.method7691((long) arg1);
            return var3 == null ? arg2 : (String) var3.field4705;
        }
    }
}
