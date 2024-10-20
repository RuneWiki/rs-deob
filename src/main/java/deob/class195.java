package deob;

@ObfuscatedName("gv")
public class class195 extends class130 {

    @ObfuscatedName("gv.n")
    public static class125 field2858 = new class125(64);

    @ObfuscatedName("gv.g")
    public int field2856;

    @ObfuscatedName("gv.v")
    public int field2859;

    @ObfuscatedName("gv.y")
    public int field2857;

    @ObfuscatedName("gv.n(Leq;I)V")
    public void method3401(class154 arg0) {
        while (true) {
            int var2 = arg0.method2878();
            if (var2 == 0) {
                return;
            }
            this.method3402(arg0, var2);
        }
    }

    @ObfuscatedName("gv.g(Leq;II)V")
    public void method3402(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2856 = arg0.method2833();
            this.field2859 = arg0.method2878();
            this.field2857 = arg0.method2878();
        }
    }

    @ObfuscatedName("ff.v(B)V")
    public static void method2968() {
        field2858.method2277();
    }
}
