package deob;

@ObfuscatedName("ip")
public class class257 extends class209 {

    @ObfuscatedName("ip.n")
    public static class203 field3281 = new class203(64);

    @ObfuscatedName("ip.u")
    public int field3280 = 0;

    @ObfuscatedName("bl.y(Liu;B)V")
    public static void method1501(class250 arg0) {
        Statics.field3282 = arg0;
        Statics.field3279 = Statics.field3282.method4287(16);
    }

    @ObfuscatedName("ip.n(Lge;I)V")
    public void method4451(class185 arg0) {
        while (true) {
            int var2 = arg0.method3299();
            if (var2 == 0) {
                return;
            }
            this.method4442(arg0, var2);
        }
    }

    @ObfuscatedName("ip.u(Lge;IB)V")
    public void method4442(class185 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3280 = arg0.method3280();
        }
    }

    @ObfuscatedName("cq.i(I)V")
    public static void method1772() {
        field3281.method3695();
    }
}
