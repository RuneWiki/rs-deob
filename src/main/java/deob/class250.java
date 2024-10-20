package deob;

@ObfuscatedName("ir")
public class class250 {

    public class250() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cq.n(Lfl;Lgj;I)Lgj;")
    public static final class187 method1667(class174 arg0, class187 arg1) {
        int var2 = arg0.method2925();
        if (arg1 == null) {
            int var3 = class178.method76(var2);
            arg1 = new class187(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method2925() == 1;
            int var6 = arg0.method2910();
            class193 var7;
            if (var5) {
                var7 = new class186(arg0.method3098());
            } else {
                var7 = new class199(arg0.method3058());
            }
            arg1.method3244(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("if.p(Lgj;III)I")
    public static int method4031(class187 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class199 var3 = (class199) arg0.method3243((long) arg1);
            return var3 == null ? arg2 : var3.field2497;
        }
    }

    @ObfuscatedName("gq.i(Lgj;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method3573(class187 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class186 var3 = (class186) arg0.method3243((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2460;
        }
    }
}
