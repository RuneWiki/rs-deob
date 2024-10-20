package deob;

@ObfuscatedName("kl")
public class class291 extends class346 {

    @ObfuscatedName("kl.o")
    public static class199 field3546 = new class199(64);

    @ObfuscatedName("kl.u")
    public int field3552;

    @ObfuscatedName("kl.p")
    public int field3548;

    @ObfuscatedName("kl.b")
    public int field3549;

    @ObfuscatedName("kl.e")
    public static final int[] field3550 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3550[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("kl.f(Lnu;I)V")
    public void method4505(class382 arg0) {
        while (true) {
            int var2 = arg0.method5856();
            if (var2 == 0) {
                return;
            }
            this.method4507(arg0, var2);
        }
    }

    @ObfuscatedName("kl.o(Lnu;II)V")
    public void method4507(class382 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3552 = arg0.method5858();
            this.field3548 = arg0.method5856();
            this.field3549 = arg0.method5856();
        }
    }

    @ObfuscatedName("fr.u(I)V")
    public static void method2776() {
        field3546.method3392();
    }
}
