package deob;

@ObfuscatedName("ib")
public class class253 {

    public class253() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fr.w(Lfi;Lgq;S)Lgq;")
    public static final class190 method2807(class177 arg0, class190 arg1) {
        int var2 = arg0.method2931();
        if (arg1 == null) {
            int var3 = class181.method492(var2);
            arg1 = new class190(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method2931() == 1;
            int var6 = arg0.method2888();
            class196 var7;
            if (var5) {
                var7 = new class189(arg0.method2892());
            } else {
                var7 = new class202(arg0.method2904());
            }
            arg1.method3213(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("dh.o(Lgq;III)I")
    public static int method2161(class190 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class202 var3 = (class202) arg0.method3216((long) arg1);
            return var3 == null ? arg2 : var3.field2503;
        }
    }

    @ObfuscatedName("jg.x(Lgq;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method4380(class190 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class189 var3 = (class189) arg0.method3216((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2466;
        }
    }
}
