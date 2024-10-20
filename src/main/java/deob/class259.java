package deob;

@ObfuscatedName("it")
public class class259 extends class209 {

    @ObfuscatedName("it.s")
    public static class203 field3286 = new class203(64);

    @ObfuscatedName("it.o")
    public boolean field3285 = false;

    @ObfuscatedName("kk.v(Lis;I)V")
    public static void method5107(class250 arg0) {
        Statics.field3288 = arg0;
    }

    @ObfuscatedName("it.s(Lgx;B)V")
    public void method4498(class185 arg0) {
        while (true) {
            int var2 = arg0.method3274();
            if (var2 == 0) {
                return;
            }
            this.method4501(arg0, var2);
        }
    }

    @ObfuscatedName("it.o(Lgx;II)V")
    public void method4501(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3285 = true;
        }
    }
}
