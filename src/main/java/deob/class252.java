package deob;

@ObfuscatedName("io")
public class class252 extends class202 {

    @ObfuscatedName("io.p")
    public static class197 field3376 = new class197(64);

    @ObfuscatedName("io.i")
    public boolean field3378 = false;

    @ObfuscatedName("fu.m(Lik;B)V")
    public static void method2975(class243 arg0) {
        Statics.field3377 = arg0;
    }

    @ObfuscatedName("fb.p(II)Lio;")
    public static class252 method2978(int arg0) {
        class252 var1 = (class252) field3376.method3419((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3377.method3930(15, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4141(new class181(var2));
        }
        field3376.method3418(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.i(Lfv;B)V")
    public void method4141(class181 arg0) {
        while (true) {
            int var2 = arg0.method3012();
            if (var2 == 0) {
                return;
            }
            this.method4142(arg0, var2);
        }
    }

    @ObfuscatedName("io.j(Lfv;II)V")
    public void method4142(class181 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3378 = true;
        }
    }
}
