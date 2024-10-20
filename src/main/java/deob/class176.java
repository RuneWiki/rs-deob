package deob;

@ObfuscatedName("fu")
public class class176 {

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fp.o(Lpx;Lpt;I)Lpt;")
    public static final class420 method2892(class440 arg0, class420 arg1) {
        int var2 = arg0.method7071();
        if (arg1 == null) {
            int var3 = class272.method6642(var2);
            arg1 = new class420(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method7071() == 1;
            int var6 = arg0.method6897();
            class411 var7;
            if (var5) {
                var7 = new class407(arg0.method7044());
            } else {
                var7 = new class410(arg0.method6898());
            }
            arg1.method6666(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("ez.q(Lpt;IIB)I")
    public static int method2802(class420 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class410 var3 = (class410) arg0.method6665((long) arg1);
            return var3 == null ? arg2 : var3.field4465;
        }
    }

    @ObfuscatedName("cq.l(Lpt;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method2266(class420 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class407 var3 = (class407) arg0.method6665((long) arg1);
            return var3 == null ? arg2 : (String) var3.field4462;
        }
    }
}
