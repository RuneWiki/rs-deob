package deob;

@ObfuscatedName("jb")
public class class265 {

    public class265() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.f(Lgx;Lgt;B)Lgt;")
    public static final class200 method1460(class185 arg0, class200 arg1) {
        int var2 = arg0.method3323();
        if (arg1 == null) {
            int var3 = class190.method2912(var2);
            arg1 = new class200(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method3323() == 1;
            int var6 = arg0.method3327();
            class207 var7;
            if (var5) {
                var7 = new class198(arg0.method3435());
            } else {
                var7 = new class214(arg0.method3328());
            }
            arg1.method3698(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("iv.h(Lgt;III)I")
    public static int method4252(class200 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class214 var3 = (class214) arg0.method3710((long) arg1);
            return var3 == null ? arg2 : var3.field2502;
        }
    }
}
