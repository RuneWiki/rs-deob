package deob;

@ObfuscatedName("ap")
public class class44 extends class195 {

    @ObfuscatedName("ap.k")
    public static class184 field1006 = new class184(64);

    @ObfuscatedName("ap.g")
    public int field1011;

    @ObfuscatedName("ap.n")
    public int field1008;

    @ObfuscatedName("ap.t")
    public int field1009;

    @ObfuscatedName("h.y(Lfd;I)V")
    public static void method166(class158 arg0) {
        Statics.field1013 = arg0;
    }

    @ObfuscatedName("ap.g(Ldw;I)V")
    public void method865(class111 arg0) {
        while (true) {
            int var2 = arg0.method2205();
            if (var2 == 0) {
                return;
            }
            this.method866(arg0, var2);
        }
    }

    @ObfuscatedName("ap.n(Ldw;II)V")
    public void method866(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1011 = arg0.method2339();
            this.field1008 = arg0.method2205();
            this.field1009 = arg0.method2205();
        }
    }

    @ObfuscatedName("an.t(I)V")
    public static void method644() {
        field1006.method3333();
    }
}
