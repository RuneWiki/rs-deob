package deob;

@ObfuscatedName("fj")
public class class182 {

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hy.a(Lqr;Lpe;B)Lpe;")
    public static final class440 method4112(class464 arg0, class440 arg1) {
        int var2 = arg0.method7735();
        if (arg1 == null) {
            int var3 = class282.method707(var2);
            arg1 = new class440(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method7735() == 1;
            int var6 = arg0.method7906();
            class430 var7;
            if (var5) {
                var7 = new class426(arg0.method7725());
            } else {
                var7 = new class429(arg0.method7720());
            }
            arg1.method7448(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("mo.f(Lpe;III)I")
    public static int method6006(class440 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class429 var3 = (class429) arg0.method7455((long) arg1);
            return var3 == null ? arg2 : var3.field4634;
        }
    }

    @ObfuscatedName("ne.c(Lpe;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method6701(class440 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class426 var3 = (class426) arg0.method7455((long) arg1);
            return var3 == null ? arg2 : (String) var3.field4631;
        }
    }
}
