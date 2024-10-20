package deob;

@ObfuscatedName("io")
public class class259 extends class209 {

    @ObfuscatedName("io.c")
    public static class203 field3307 = new class203(64);

    @ObfuscatedName("io.n")
    public boolean field3309 = false;

    @ObfuscatedName("io.y(Lge;S)V")
    public void method4480(class185 arg0) {
        while (true) {
            int var2 = arg0.method3299();
            if (var2 == 0) {
                return;
            }
            this.method4474(arg0, var2);
        }
    }

    @ObfuscatedName("io.c(Lge;IB)V")
    public void method4474(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3309 = true;
        }
    }
}
