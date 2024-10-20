package deob;

@ObfuscatedName("if")
public class class251 extends class202 {

    @ObfuscatedName("if.x")
    public static class197 field3389 = new class197(64);

    @ObfuscatedName("if.k")
    public boolean field3390 = false;

    @ObfuscatedName("if.d(Lfr;I)V")
    public void method4125(class181 arg0) {
        while (true) {
            int var2 = arg0.method3204();
            if (var2 == 0) {
                return;
            }
            this.method4126(arg0, var2);
        }
    }

    @ObfuscatedName("if.x(Lfr;II)V")
    public void method4126(class181 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3390 = true;
        }
    }
}
