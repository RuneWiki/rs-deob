package deob;

@ObfuscatedName("ib")
public class class256 extends class209 {

    @ObfuscatedName("ib.h")
    public static class203 field3282 = new class203(64);

    @ObfuscatedName("ib.e")
    public int field3283 = 0;

    @ObfuscatedName("fr.f(Lie;I)V")
    public static void method3288(class250 arg0) {
        Statics.field3281 = arg0;
    }

    @ObfuscatedName("ib.h(Lgx;I)V")
    public void method4435(class185 arg0) {
        while (true) {
            int var2 = arg0.method3323();
            if (var2 == 0) {
                return;
            }
            this.method4434(arg0, var2);
        }
    }

    @ObfuscatedName("ib.e(Lgx;II)V")
    public void method4434(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3283 = arg0.method3325();
        }
    }
}
