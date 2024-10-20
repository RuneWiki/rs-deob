package deob;

@ObfuscatedName("ie")
public class class251 extends class202 {

    @ObfuscatedName("ie.p")
    public static class197 field3372 = new class197(64);

    @ObfuscatedName("ie.i")
    public boolean field3371 = false;

    @ObfuscatedName("he.m(Lik;I)V")
    public static void method3906(class243 arg0) {
        Statics.field2713 = arg0;
    }

    @ObfuscatedName("ak.p(II)Lie;")
    public static class251 method497(int arg0) {
        class251 var1 = (class251) field3372.method3419((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2713.method3930(19, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4125(new class181(var2));
        }
        field3372.method3418(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ie.i(Lfv;I)V")
    public void method4125(class181 arg0) {
        while (true) {
            int var2 = arg0.method3012();
            if (var2 == 0) {
                return;
            }
            this.method4130(arg0, var2);
        }
    }

    @ObfuscatedName("ie.j(Lfv;II)V")
    public void method4130(class181 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3371 = true;
        }
    }
}
