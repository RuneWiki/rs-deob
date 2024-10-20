package deob;

@ObfuscatedName("ib")
public class class256 extends class206 {

    @ObfuscatedName("ib.i")
    public static class201 field3380 = new class201(64);

    @ObfuscatedName("ib.w")
    public boolean field3379 = false;

    @ObfuscatedName("dg.p(Lik;S)V")
    public static void method2365(class247 arg0) {
        Statics.field3381 = arg0;
    }

    @ObfuscatedName("ib.i(Lgj;I)V")
    public void method4242(class185 arg0) {
        while (true) {
            int var2 = arg0.method3197();
            if (var2 == 0) {
                return;
            }
            this.method4240(arg0, var2);
        }
    }

    @ObfuscatedName("ib.w(Lgj;II)V")
    public void method4240(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3379 = true;
        }
    }
}
