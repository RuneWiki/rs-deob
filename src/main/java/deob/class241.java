package deob;

@ObfuscatedName("io")
public class class241 extends class195 {

    @ObfuscatedName("io.j")
    public static class190 field3281 = new class190(64);

    @ObfuscatedName("io.n")
    public int field3280 = 0;

    @ObfuscatedName("bm.a(Lif;I)V")
    public static void method1337(class236 arg0) {
        Statics.field3282 = arg0;
    }

    @ObfuscatedName("io.j(Lfe;I)V")
    public void method3893(class174 arg0) {
        while (true) {
            int var2 = arg0.method2871();
            if (var2 == 0) {
                return;
            }
            this.method3894(arg0, var2);
        }
    }

    @ObfuscatedName("io.n(Lfe;II)V")
    public void method3894(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3280 = arg0.method2873();
        }
    }
}
