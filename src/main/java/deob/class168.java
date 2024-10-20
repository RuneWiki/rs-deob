package deob;

@ObfuscatedName("fq")
public class class168 {

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.c(Lpi;Loz;I)Loz;")
    public static final class396 method399(class419 arg0, class396 arg1) {
        int var2 = arg0.method6781();
        if (arg1 == null) {
            int var3 = class259.method3053(var2);
            arg1 = new class396(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method6781() == 1;
            int var6 = arg0.method6674();
            class387 var7;
            if (var5) {
                var7 = new class383(arg0.method6707());
            } else {
                var7 = new class386(arg0.method6675());
            }
            arg1.method6431(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("d.b(Loz;III)I")
    public static int method150(class396 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class386 var3 = (class386) arg0.method6429((long) arg1);
            return var3 == null ? arg2 : var3.field4256;
        }
    }

    @ObfuscatedName("gi.p(Loz;ILjava/lang/String;B)Ljava/lang/String;")
    public static String method3632(class396 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class383 var3 = (class383) arg0.method6429((long) arg1);
            return var3 == null ? arg2 : (String) var3.field4253;
        }
    }
}
