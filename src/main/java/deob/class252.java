package deob;

@ObfuscatedName("iz")
public class class252 extends class206 {

    @ObfuscatedName("iz.i")
    public static class201 field3346 = new class201(64);

    @ObfuscatedName("iz.w")
    public int field3344 = 0;

    @ObfuscatedName("ii.p(Lik;I)V")
    public static void method4010(class247 arg0) {
        Statics.field3345 = arg0;
    }

    @ObfuscatedName("iz.i(Lgj;B)V")
    public void method4179(class185 arg0) {
        while (true) {
            int var2 = arg0.method3197();
            if (var2 == 0) {
                return;
            }
            this.method4184(arg0, var2);
        }
    }

    @ObfuscatedName("iz.w(Lgj;IS)V")
    public void method4184(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3344 = arg0.method3124();
        }
    }
}
