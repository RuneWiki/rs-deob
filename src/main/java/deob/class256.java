package deob;

@ObfuscatedName("ic")
public class class256 extends class206 {

    @ObfuscatedName("ic.v")
    public static class201 field3411 = new class201(64);

    @ObfuscatedName("ic.y")
    public boolean field3412 = false;

    @ObfuscatedName("ic.n(Lgv;I)V")
    public void method4113(class185 arg0) {
        while (true) {
            int var2 = arg0.method3021();
            if (var2 == 0) {
                return;
            }
            this.method4114(arg0, var2);
        }
    }

    @ObfuscatedName("ic.v(Lgv;II)V")
    public void method4114(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3412 = true;
        }
    }
}
