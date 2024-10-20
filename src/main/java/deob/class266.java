package deob;

@ObfuscatedName("jf")
public class class266 extends class209 {

    @ObfuscatedName("jf.h")
    public static class203 field3377 = new class203(64);

    @ObfuscatedName("jf.e")
    public int field3381;

    @ObfuscatedName("jf.b")
    public int field3378;

    @ObfuscatedName("jf.l")
    public int field3379;

    @ObfuscatedName("jf.f(Lgx;I)V")
    public void method4580(class185 arg0) {
        while (true) {
            int var2 = arg0.method3323();
            if (var2 == 0) {
                return;
            }
            this.method4581(arg0, var2);
        }
    }

    @ObfuscatedName("jf.h(Lgx;IB)V")
    public void method4581(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3381 = arg0.method3325();
            this.field3378 = arg0.method3323();
            this.field3379 = arg0.method3323();
        }
    }
}
