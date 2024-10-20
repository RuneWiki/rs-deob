package deob;

@ObfuscatedName("ji")
public class class266 extends class209 {

    @ObfuscatedName("ji.c")
    public static class203 field3369 = new class203(64);

    @ObfuscatedName("ji.n")
    public int field3374;

    @ObfuscatedName("ji.u")
    public int field3372;

    @ObfuscatedName("ji.i")
    public int field3373;

    @ObfuscatedName("ji.y(Lge;B)V")
    public void method4579(class185 arg0) {
        while (true) {
            int var2 = arg0.method3299();
            if (var2 == 0) {
                return;
            }
            this.method4578(arg0, var2);
        }
    }

    @ObfuscatedName("ji.c(Lge;IB)V")
    public void method4578(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3374 = arg0.method3280();
            this.field3372 = arg0.method3299();
            this.field3373 = arg0.method3299();
        }
    }
}
