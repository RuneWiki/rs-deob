package deob;

@ObfuscatedName("ax")
public class class37 extends class172 {

    @ObfuscatedName("ax.e")
    public static class168 field948 = new class168(64);

    @ObfuscatedName("ax.n")
    public int field939;

    @ObfuscatedName("ax.j")
    public int field946;

    @ObfuscatedName("ax.i")
    public int field943;

    @ObfuscatedName("cw.g(Lez;I)V")
    public static void method1688(class150 arg0) {
        Statics.field947 = arg0;
    }

    @ObfuscatedName("ax.n(Ldu;I)V")
    public void method817(class126 arg0) {
        while (true) {
            int var2 = arg0.method2485();
            if (var2 == 0) {
                return;
            }
            this.method816(arg0, var2);
        }
    }

    @ObfuscatedName("ax.j(Ldu;IB)V")
    public void method816(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field939 = arg0.method2487();
            this.field946 = arg0.method2485();
            this.field943 = arg0.method2485();
        }
    }
}
