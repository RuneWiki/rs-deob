package deob;

@ObfuscatedName("iu")
public class class259 {

    public class259() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("it.f(Lkb;Lll;I)Lll;")
    public static final class327 method4092(class311 arg0, class327 arg1) {
        int var2 = arg0.method5276();
        if (arg1 == null) {
            int var3 = class198.method234(var2);
            arg1 = new class327(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method5276() == 1;
            int var6 = arg0.method5184();
            class190 var7;
            if (var5) {
                var7 = new class186(arg0.method5189());
            } else {
                var7 = new class189(arg0.method5330());
            }
            arg1.method5576(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("ao.b(Lll;ILjava/lang/String;B)Ljava/lang/String;")
    public static String method275(class327 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class186 var3 = (class186) arg0.method5561((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2135;
        }
    }
}
