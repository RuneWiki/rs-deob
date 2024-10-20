package deob;

@ObfuscatedName("iz")
public class class250 {

    public class250() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bn.e(Lfw;Lgf;I)Lgf;")
    public static final class187 method925(class174 arg0, class187 arg1) {
        int var2 = arg0.method2891();
        if (arg1 == null) {
            int var3 = class178.method2666(var2);
            arg1 = new class187(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method2891() == 1;
            int var6 = arg0.method2890();
            class193 var7;
            if (var5) {
                var7 = new class186(arg0.method2899());
            } else {
                var7 = new class199(arg0.method2896());
            }
            arg1.method3234(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("fu.o(Lgf;IIB)I")
    public static int method2858(class187 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class199 var3 = (class199) arg0.method3216((long) arg1);
            return var3 == null ? arg2 : var3.field2467;
        }
    }

    @ObfuscatedName("cb.m(Lgf;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method1539(class187 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class186 var3 = (class186) arg0.method3216((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2430;
        }
    }
}
