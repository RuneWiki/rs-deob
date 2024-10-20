package deob;

@ObfuscatedName("id")
public class class253 {

    public class253() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hd.s(Lfs;Lgm;I)Lgm;")
    public static final class190 method3798(class177 arg0, class190 arg1) {
        int var2 = arg0.method2965();
        if (arg1 == null) {
            int var3 = class181.method3979(var2);
            arg1 = new class190(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method2965() == 1;
            int var6 = arg0.method2969();
            class196 var7;
            if (var5) {
                var7 = new class189(arg0.method2973());
            } else {
                var7 = new class202(arg0.method2970());
            }
            arg1.method3291(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("x.c(Lgm;III)I")
    public static int method163(class190 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class202 var3 = (class202) arg0.method3283((long) arg1);
            return var3 == null ? arg2 : var3.field2501;
        }
    }

    @ObfuscatedName("ay.f(Lgm;ILjava/lang/String;B)Ljava/lang/String;")
    public static String method471(class190 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class189 var3 = (class189) arg0.method3283((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2464;
        }
    }
}
