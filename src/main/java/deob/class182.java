package deob;

@ObfuscatedName("gd")
public class class182 {

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fl.at(Luj;Ltz;I)Ltz;")
    public static final class500 method3052(class527 arg0, class500 arg1) {
        int var2 = arg0.method8410();
        if (arg1 == null) {
            int var3 = class315.method3369(var2);
            arg1 = new class500(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method8410() == 1;
            int var6 = arg0.method8414();
            class485 var7;
            if (var5) {
                var7 = new class482(arg0.method8535());
            } else {
                var7 = new class484(arg0.method8416());
            }
            arg1.method8135(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("ds.ah(Ltz;III)I")
    public static int method2319(class500 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class484 var3 = (class484) arg0.method8134((long) arg1);
            return var3 == null ? arg2 : var3.field4847;
        }
    }
}
