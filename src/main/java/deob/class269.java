package deob;

@ObfuscatedName("jr")
public class class269 {

    public class269() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kp.a(Lgx;Lgs;I)Lgs;")
    public static final class205 method5420(class190 arg0, class205 arg1) {
        int var2 = arg0.method3443();
        if (arg1 == null) {
            int var3 = class195.method97(var2);
            arg1 = new class205(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method3443() == 1;
            int var6 = arg0.method3459();
            class212 var7;
            if (var5) {
                var7 = new class203(arg0.method3647());
            } else {
                var7 = new class219(arg0.method3460());
            }
            arg1.method3859(var7, (long) var6);
        }
        return arg1;
    }
}
