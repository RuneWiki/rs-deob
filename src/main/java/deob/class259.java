package deob;

@ObfuscatedName("ia")
public class class259 extends class209 {

    @ObfuscatedName("ia.r")
    public static class203 field3336 = new class203(64);

    @ObfuscatedName("ia.e")
    public boolean field3338 = false;

    @ObfuscatedName("ia.r(Lgl;I)V")
    public void method4660(class185 arg0) {
        while (true) {
            int var2 = arg0.method3679();
            if (var2 == 0) {
                return;
            }
            this.method4661(arg0, var2);
        }
    }

    @ObfuscatedName("ia.e(Lgl;II)V")
    public void method4661(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3338 = true;
        }
    }
}
