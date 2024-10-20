package deob;

@ObfuscatedName("in")
public class class258 {

    public class258() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.z(Lkf;Llq;I)Llq;")
    public static final class326 method2185(class310 arg0, class326 arg1) {
        int var2 = arg0.method5193();
        if (arg1 == null) {
            int var3 = class198.method4962(var2);
            arg1 = new class326(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method5193() == 1;
            int var6 = arg0.method5197();
            class190 var7;
            if (var5) {
                var7 = new class186(arg0.method5202());
            } else {
                var7 = new class189(arg0.method5270());
            }
            arg1.method5583(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("ku.k(Llq;IIB)I")
    public static int method4902(class326 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class189 var3 = (class189) arg0.method5582((long) arg1);
            return var3 == null ? arg2 : var3.field2154;
        }
    }
}
