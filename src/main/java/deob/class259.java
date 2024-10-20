package deob;

@ObfuscatedName("in")
public class class259 {

    public class259() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.n(Lkx;Llg;I)Llg;")
    public static final class327 method2675(class311 arg0, class327 arg1) {
        int var2 = arg0.method5310();
        if (arg1 == null) {
            int var3 = class198.method3190(var2);
            arg1 = new class327(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method5310() == 1;
            int var6 = arg0.method5263();
            class190 var7;
            if (var5) {
                var7 = new class186(arg0.method5465());
            } else {
                var7 = new class189(arg0.method5455());
            }
            arg1.method5649(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("be.v(Llg;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method1120(class327 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class186 var3 = (class186) arg0.method5648((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2134;
        }
    }
}
