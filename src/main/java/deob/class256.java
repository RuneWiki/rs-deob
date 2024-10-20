package deob;

@ObfuscatedName("iq")
public class class256 extends class209 {

    @ObfuscatedName("iq.l")
    public static class203 field3291 = new class203(64);

    @ObfuscatedName("iq.w")
    public int field3292 = 0;

    @ObfuscatedName("bv.f(Lik;B)V")
    public static void method1510(class250 arg0) {
        Statics.field3290 = arg0;
    }

    @ObfuscatedName("ii.l(IB)Liq;")
    public static class256 method4271(int arg0) {
        class256 var1 = (class256) field3291.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3290.method4289(5, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4460(new class185(var2));
        }
        field3291.method3744(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.w(Lgm;B)V")
    public void method4460(class185 arg0) {
        while (true) {
            int var2 = arg0.method3344();
            if (var2 == 0) {
                return;
            }
            this.method4461(arg0, var2);
        }
    }

    @ObfuscatedName("iq.s(Lgm;II)V")
    public void method4461(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3292 = arg0.method3346();
        }
    }
}
