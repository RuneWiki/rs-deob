package deob;

@ObfuscatedName("iv")
public class class259 extends class185 {

    @ObfuscatedName("iv.o")
    public static class155 field3331 = new class155(64);

    @ObfuscatedName("iv.q")
    public int field3329;

    @ObfuscatedName("iv.j")
    public int field3332;

    @ObfuscatedName("iv.p")
    public int field3330;

    @ObfuscatedName("iv.m(Lkn;I)V")
    public void method4258(class310 arg0) {
        while (true) {
            int var2 = arg0.method5227();
            if (var2 == 0) {
                return;
            }
            this.method4254(arg0, var2);
        }
    }

    @ObfuscatedName("iv.o(Lkn;II)V")
    public void method4254(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3329 = arg0.method5283();
            this.field3332 = arg0.method5227();
            this.field3330 = arg0.method5227();
        }
    }

    @ObfuscatedName("ir.q(I)V")
    public static void method4193() {
        field3331.method3130();
    }
}
