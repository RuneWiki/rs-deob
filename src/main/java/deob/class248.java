package deob;

@ObfuscatedName("ia")
public class class248 extends class202 {

    @ObfuscatedName("ia.p")
    public static class197 field3342 = new class197(64);

    @ObfuscatedName("ia.i")
    public int field3340 = 0;

    @ObfuscatedName("ew.m(II)Lia;")
    public static class248 method2793(int arg0) {
        class248 var1 = (class248) field3342.method3419((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3341.method3930(5, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method4078(new class181(var2));
        }
        field3342.method3418(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ia.p(Lfv;I)V")
    public void method4078(class181 arg0) {
        while (true) {
            int var2 = arg0.method3012();
            if (var2 == 0) {
                return;
            }
            this.method4079(arg0, var2);
        }
    }

    @ObfuscatedName("ia.i(Lfv;II)V")
    public void method4079(class181 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3340 = arg0.method3009();
        }
    }
}
