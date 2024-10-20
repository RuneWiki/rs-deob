package deob;

@ObfuscatedName("fa")
public class class158 {

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.i(Lop;Lnf;I)Lnf;")
    public static final class379 method164(class401 arg0, class379 arg1) {
        int var2 = arg0.method6240();
        if (arg1 == null) {
            int var3 = var2 - 1;
            int var4 = var3 | var3 >>> 1;
            int var5 = var4 | var4 >>> 2;
            int var6 = var5 | var5 >>> 4;
            int var7 = var6 | var6 >>> 8;
            int var8 = var7 | var7 >>> 16;
            int var9 = var8 + 1;
            arg1 = new class379(var9);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            boolean var12 = arg0.method6240() == 1;
            int var13 = arg0.method6432();
            class370 var14;
            if (var12) {
                var14 = new class366(arg0.method6335());
            } else {
                var14 = new class369(arg0.method6245());
            }
            arg1.method6010(var14, (long) var13);
        }
        return arg1;
    }

    @ObfuscatedName("cp.w(Lnf;III)I")
    public static int method2133(class379 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class369 var3 = (class369) arg0.method6009((long) arg1);
            return var3 == null ? arg2 : var3.field4073;
        }
    }

    @ObfuscatedName("fy.s(Lnf;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method2887(class379 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class366 var3 = (class366) arg0.method6009((long) arg1);
            return var3 == null ? arg2 : (String) var3.field4070;
        }
    }
}
