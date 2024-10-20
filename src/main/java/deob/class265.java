package deob;

@ObfuscatedName("jw")
public class class265 {

    public class265() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ex.c(Lgg;Lgz;I)Lgz;")
    public static final class200 method2860(class185 arg0, class200 arg1) {
        int var2 = arg0.method3243();
        if (arg1 == null) {
            int var3 = class190.method2942(var2);
            arg1 = new class200(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method3243() == 1;
            int var6 = arg0.method3247();
            class207 var7;
            if (var5) {
                var7 = new class198(arg0.method3251());
            } else {
                var7 = new class214(arg0.method3323());
            }
            arg1.method3626(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("ef.q(Lgz;III)I")
    public static int method2910(class200 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class214 var3 = (class214) arg0.method3619((long) arg1);
            return var3 == null ? arg2 : var3.field2482;
        }
    }

    @ObfuscatedName("ak.m(Lgz;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method482(class200 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class198 var3 = (class198) arg0.method3619((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2438;
        }
    }
}
