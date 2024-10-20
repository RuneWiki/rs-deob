package deob;

@ObfuscatedName("hc")
public class class199 {

    public class199() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gp.ac(Lul;Ltp;B)Ltp;")
    public static final class503 method3135(class530 arg0, class503 arg1) {
        int var2 = arg0.method8365();
        if (arg1 == null) {
            int var3 = class318.method3444(var2);
            arg1 = new class503(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method8365() == 1;
            int var6 = arg0.method8445();
            class488 var7;
            if (var5) {
                var7 = new class485(arg0.method8588());
            } else {
                var7 = new class487(arg0.method8371());
            }
            arg1.method8071(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("em.al(Ltp;III)I")
    public static int method2595(class503 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class487 var3 = (class487) arg0.method8070((long) arg1);
            return var3 == null ? arg2 : var3.field4855;
        }
    }

    @ObfuscatedName("be.ak(Ltp;ILjava/lang/String;B)Ljava/lang/String;")
    public static String method439(class503 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class485 var3 = (class485) arg0.method8070((long) arg1);
            return var3 == null ? arg2 : (String) var3.field4853;
        }
    }
}
