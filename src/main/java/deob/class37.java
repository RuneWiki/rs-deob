package deob;

@ObfuscatedName("ai")
public class class37 extends class173 {

    @ObfuscatedName("ai.f")
    public static class169 field932 = new class169(64);

    @ObfuscatedName("ai.n")
    public int field933;

    @ObfuscatedName("ai.c")
    public int field934;

    @ObfuscatedName("ai.r")
    public int field935;

    @ObfuscatedName("ai.v(Ldr;I)V")
    public void method821(class126 arg0) {
        while (true) {
            int var2 = arg0.method2466();
            if (var2 == 0) {
                return;
            }
            this.method810(arg0, var2);
        }
    }

    @ObfuscatedName("ai.f(Ldr;II)V")
    public void method810(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field933 = arg0.method2468();
            this.field934 = arg0.method2466();
            this.field935 = arg0.method2466();
        }
    }
}
