package deob;

@ObfuscatedName("ia")
public class class250 {

    public class250() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cx.a(Lfe;Lgl;I)Lgl;")
    public static final class187 method1405(class174 arg0, class187 arg1) {
        int var2 = arg0.method2871();
        if (arg1 == null) {
            int var3 = class178.method2668(var2);
            arg1 = new class187(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method2871() == 1;
            int var6 = arg0.method2875();
            class193 var7;
            if (var5) {
                var7 = new class186(arg0.method2879());
            } else {
                var7 = new class199(arg0.method2876());
            }
            arg1.method3225(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("fu.j(Lgl;IIS)I")
    public static int method2715(class187 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class199 var3 = (class199) arg0.method3206((long) arg1);
            return var3 == null ? arg2 : var3.field2480;
        }
    }

    @ObfuscatedName("fz.n(Lgl;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method2741(class187 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class186 var3 = (class186) arg0.method3206((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2443;
        }
    }
}
