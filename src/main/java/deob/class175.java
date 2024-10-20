package deob;

@ObfuscatedName("fe")
public class class175 {

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bd.s(Lqr;Lpm;I)Lpm;")
    public static final class420 method1527(class444 arg0, class420 arg1) {
        int var2 = arg0.method6929();
        if (arg1 == null) {
            int var3 = class272.method4475(var2);
            arg1 = new class420(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method6929() == 1;
            int var6 = arg0.method7095();
            class411 var7;
            if (var5) {
                var7 = new class407(arg0.method6975());
            } else {
                var7 = new class410(arg0.method6934());
            }
            arg1.method6673(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("bu.h(Lpm;IIB)I")
    public static int method959(class420 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class410 var3 = (class410) arg0.method6668((long) arg1);
            return var3 == null ? arg2 : var3.field4467;
        }
    }

    @ObfuscatedName("ek.w(Lpm;ILjava/lang/String;B)Ljava/lang/String;")
    public static String method2648(class420 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class407 var3 = (class407) arg0.method6668((long) arg1);
            return var3 == null ? arg2 : (String) var3.field4464;
        }
    }
}
