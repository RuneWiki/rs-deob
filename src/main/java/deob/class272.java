package deob;

@ObfuscatedName("ju")
public class class272 extends class219 {

    @ObfuscatedName("ju.i")
    public static class213 field3479 = new class213(64);

    @ObfuscatedName("ju.o")
    public boolean field3483 = false;

    @ObfuscatedName("ea.c(Ljm;I)V")
    public static void method2928(class262 arg0) {
        Statics.field3484 = arg0;
    }

    @ObfuscatedName("ju.i(Lgp;I)V")
    public void method4409(class195 arg0) {
        while (true) {
            int var2 = arg0.method3429();
            if (var2 == 0) {
                return;
            }
            this.method4410(arg0, var2);
        }
    }

    @ObfuscatedName("ju.o(Lgp;II)V")
    public void method4410(class195 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3483 = true;
        }
    }
}
