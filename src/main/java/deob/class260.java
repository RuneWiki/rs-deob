package deob;

@ObfuscatedName("if")
public class class260 extends class209 {

    @ObfuscatedName("if.s")
    public static class203 field3291 = new class203(64);

    @ObfuscatedName("if.o")
    public boolean field3290 = false;

    @ObfuscatedName("if.v(Lgx;I)V")
    public void method4506(class185 arg0) {
        while (true) {
            int var2 = arg0.method3274();
            if (var2 == 0) {
                return;
            }
            this.method4513(arg0, var2);
        }
    }

    @ObfuscatedName("if.s(Lgx;II)V")
    public void method4513(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3290 = true;
        }
    }
}
