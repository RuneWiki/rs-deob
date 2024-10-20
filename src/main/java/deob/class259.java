package deob;

@ObfuscatedName("ix")
public class class259 extends class209 {

    @ObfuscatedName("ix.h")
    public static class203 field3313 = new class203(64);

    @ObfuscatedName("ix.e")
    public boolean field3314 = false;

    @ObfuscatedName("ix.f(Lgx;B)V")
    public void method4478(class185 arg0) {
        while (true) {
            int var2 = arg0.method3323();
            if (var2 == 0) {
                return;
            }
            this.method4475(arg0, var2);
        }
    }

    @ObfuscatedName("ix.h(Lgx;II)V")
    public void method4475(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3314 = true;
        }
    }
}
