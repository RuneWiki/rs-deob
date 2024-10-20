package deob;

@ObfuscatedName("is")
public class class241 extends class176 {

    @ObfuscatedName("is.t")
    public static class146 field3182 = new class146(64);

    @ObfuscatedName("is.g")
    public int field3183 = 0;

    @ObfuscatedName("is.x(Lkz;B)V")
    public void method4016(class300 arg0) {
        while (true) {
            int var2 = arg0.method5103();
            if (var2 == 0) {
                return;
            }
            this.method4017(arg0, var2);
        }
    }

    @ObfuscatedName("is.t(Lkz;IB)V")
    public void method4017(class300 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3183 = arg0.method5304();
        }
    }

    @ObfuscatedName("go.g(B)V")
    public static void method3393() {
        field3182.method3063();
    }
}
