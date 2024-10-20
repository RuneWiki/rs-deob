package deob;

@ObfuscatedName("io")
public class class252 extends class202 {

    @ObfuscatedName("io.x")
    public static class197 field3392 = new class197(64);

    @ObfuscatedName("io.k")
    public boolean field3391 = false;

    @ObfuscatedName("fo.d(Lid;I)V")
    public static void method2937(class243 arg0) {
        Statics.field3393 = arg0;
    }

    @ObfuscatedName("io.x(Lfr;I)V")
    public void method4143(class181 arg0) {
        while (true) {
            int var2 = arg0.method3204();
            if (var2 == 0) {
                return;
            }
            this.method4137(arg0, var2);
        }
    }

    @ObfuscatedName("io.k(Lfr;IS)V")
    public void method4137(class181 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3391 = true;
        }
    }
}
