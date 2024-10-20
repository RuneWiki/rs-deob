package deob;

@ObfuscatedName("ig")
public class class240 extends class176 {

    @ObfuscatedName("ig.n")
    public static class146 field3179 = new class146(64);

    @ObfuscatedName("ig.v")
    public int field3177 = 0;

    @ObfuscatedName("ah.z(Lhp;I)V")
    public static void method697(class234 arg0) {
        Statics.field3180 = arg0;
    }

    @ObfuscatedName("ig.v(Lkl;I)V")
    public void method3919(class300 arg0) {
        while (true) {
            int var2 = arg0.method4990();
            if (var2 == 0) {
                return;
            }
            this.method3920(arg0, var2);
        }
    }

    @ObfuscatedName("ig.u(Lkl;II)V")
    public void method3920(class300 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3177 = arg0.method4992();
        }
    }
}
