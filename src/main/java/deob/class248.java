package deob;

@ObfuscatedName("ia")
public class class248 extends class202 {

    @ObfuscatedName("ia.x")
    public static class197 field3352 = new class197(64);

    @ObfuscatedName("ia.k")
    public int field3351 = 0;

    @ObfuscatedName("ck.x(IB)Lia;")
    public static class248 method1638(int arg0) {
        class248 var1 = (class248) field3352.method3418((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3356.method3935(5, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method4082(new class181(var2));
        }
        field3352.method3417(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ia.k(Lfr;I)V")
    public void method4082(class181 arg0) {
        while (true) {
            int var2 = arg0.method3204();
            if (var2 == 0) {
                return;
            }
            this.method4081(arg0, var2);
        }
    }

    @ObfuscatedName("ia.z(Lfr;II)V")
    public void method4081(class181 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3351 = arg0.method3179();
        }
    }
}
