package deob;

@ObfuscatedName("it")
public class class249 extends class202 {

    @ObfuscatedName("it.i")
    public static class197 field3348 = new class197(64);

    @ObfuscatedName("it.j")
    public int field3344 = 0;

    @ObfuscatedName("bs.m(IB)Lit;")
    public static class249 method1109(int arg0) {
        class249 var1 = (class249) field3348.method3419((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field627.method3930(16, arg0);
        class249 var3 = new class249();
        if (var2 != null) {
            var3.method4097(new class181(var2));
        }
        field3348.method3418(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("it.p(Lfv;I)V")
    public void method4097(class181 arg0) {
        while (true) {
            int var2 = arg0.method3012();
            if (var2 == 0) {
                return;
            }
            this.method4095(arg0, var2);
        }
    }

    @ObfuscatedName("it.i(Lfv;II)V")
    public void method4095(class181 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3344 = arg0.method3009();
        }
    }
}
